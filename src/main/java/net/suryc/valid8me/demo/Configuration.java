package net.suryc.valid8me.demo;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@org.springframework.context.annotation.Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "net.suryc.valid8me.demo.service")
public class Configuration {
}
