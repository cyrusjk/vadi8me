package net.suryc.valid8me.demo.resource;

import net.suryc.valid8me.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RestController
@RequestMapping("/customer")
public class CustomerResource {

    @Autowired
    private CustomerService service;

    @GetMapping("/{id}")
    public Mono<ServerResponse> get(@PathVariable Long id) {
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(service.getById(id)));
    }
}
