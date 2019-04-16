package ua.pp.darknsoft.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages="ua.pp.darknsoft")
@Import(value={
        WebMvcConfig.class,
        WebFlowConfig.class
})
public class AppConfig {
}
