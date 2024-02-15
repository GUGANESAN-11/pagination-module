package com.springprog.pegination.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.SortHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



import java.util.List;

@Configuration
@EnableWebMvc
public class CustomWebConfig implements WebMvcConfigurer  {

	
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

        SortHandlerMethodArgumentResolver sortResolver = new SortHandlerMethodArgumentResolver();
        sortResolver.setSortParameter("order-by");

        PageableHandlerMethodArgumentResolver pageResolver = new PageableHandlerMethodArgumentResolver(sortResolver);


        pageResolver.setOneIndexedParameters(true);

        
        Pageable pageable = PageRequest.of(0, 5, Sort.by(
        	    Order.asc("id"),
        	    Order.desc("name")));
        
        pageResolver.setFallbackPageable(pageable);

        argumentResolvers.add(pageResolver);
    }
	
	
}
