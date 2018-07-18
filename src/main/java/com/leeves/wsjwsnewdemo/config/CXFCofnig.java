package com.leeves.wsjwsnewdemo.config;

import com.leeves.wsjwsnewdemo.webservice.LeevesService;
import com.leeves.wsjwsnewdemo.webservice.impl.LeevesServiceImpl;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;


/**
 * Description: web service cxf 配置
 * Package: com.leeves.wsjwsnewdemo.config
 *
 * @author Leeves
 * @version 1.0.0  2018-07-18
 */
@Configuration
public class CXFCofnig {

    @Bean
    public ServletRegistrationBean<CXFServlet> cxfDispatcherServlet() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/jws/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        return new SpringBus();
    }

    @Bean
    public LeevesService leevesService() {
        return new LeevesServiceImpl();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), leevesService());
        endpoint.publish("/leevesService");
        return endpoint;
    }

}