package com.github.vbauer.houdini.ext.spring;

import com.github.vbauer.houdini.service.ObjectConverterRegistry;
import com.github.vbauer.houdini.service.ObjectConverterService;
import com.github.vbauer.houdini.service.impl.ObjectConverterRegistryImpl;
import com.github.vbauer.houdini.service.impl.ObjectConverterServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Auto-configuration component for Spring Boot.
 *
 * @author Vladislav Bauer
 */
@Configuration
public class ObjectConverterConfiguration {

    /**
     * Create {@link ObjectConverterRegistry} and register it in application context.
     *
     * @return object converter registry
     */
    @Bean
    @ConditionalOnMissingBean
    public ObjectConverterRegistry objectConverterRegistry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create {@link ObjectConverterService} and register it in application context.
     *
     * @param objectConverterRegistry object converter registry
     * @return object converter service
     */
    @Bean
    @ConditionalOnMissingBean
    public ObjectConverterService objectConverterService(final ObjectConverterRegistry objectConverterRegistry) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Create {@link ObjectConverterBeanPostProcessor} and register it in application context.
     *
     * @param objectConverterService object converter service
     * @return bean post processor to collect object converters
     */
    @Bean
    @ConditionalOnMissingBean
    public ObjectConverterBeanPostProcessor objectConverterBeanPostProcessor(final ObjectConverterService objectConverterService) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
