package com.nad.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.nad.entity.ProductEntity;

@Configuration
public class SpringDataRestConfiguration extends RepositoryRestConfigurerAdapter  {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(ProductEntity.class);
    }
}