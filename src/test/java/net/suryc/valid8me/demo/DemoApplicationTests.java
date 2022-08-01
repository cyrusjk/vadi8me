package net.suryc.valid8me.demo;

import net.suryc.valid8me.demo.model.Customer;
import net.suryc.valid8me.demo.resource.CustomerResource;
import net.suryc.valid8me.demo.service.CustomerRepository;
import net.suryc.valid8me.demo.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CustomerService service;

	@Autowired
	private CustomerResource resource;

	@Autowired
	private CustomerRepository repository;

	@Test
	void contextLoads() {
		assertThat(service).isNotNull();
		assertThat(resource).isNotNull();
		assertThat(repository).isNotNull();

		repository.save(makeCustomer());
		repository.findAll().forEach(customer -> System.out.println(customer.toString()));

		System.out.println(resource.get(1l).block().toString());
	}

	private Customer makeCustomer(){
		return Customer
				.builder()
				.firstName("first")
				.lastName("last")
				.address("1313 Mockingbird Ln.")
				.phone("555-1212")
				.birthdate(new Date())
				.govtId("567-68-0515")
				.build();

	}

}
