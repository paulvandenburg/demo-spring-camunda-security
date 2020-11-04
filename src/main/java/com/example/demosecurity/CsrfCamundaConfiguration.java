package com.example.demosecurity;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CsrfCamundaConfiguration {
    private static final String CSRF_PREVENTION_FILTER = "CsrfPreventionFilter";

    /**
     * Overwrite csrf filter from Camunda.
     *
     * Is configured with basically a 'no-op' filter
     *
     * @see org.camunda.bpm.spring.boot.starter.webapp.CamundaBpmWebappInitializer
     * @see org.camunda.bpm.spring.boot.starter.webapp.filter.SpringBootCsrfPreventionFilter
     */
    @Bean
    public ServletContextInitializer csrfOverwrite() {
        return servletContext -> servletContext.addFilter(CSRF_PREVENTION_FILTER, (request, response, chain) -> chain.doFilter(request, response));
    }
}
