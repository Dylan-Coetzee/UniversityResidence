/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dylan.universityresidence.config;

import com.dylan.universityresidence.service.Impl.ResidenceServiceImpl;
import com.dylan.universityresidence.service.ResidenceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author dylan
 */
@Configuration
public class AppConfig {
     
    @Bean(name ="Stuff")
    public ResidenceService getServicenew(){
        return new ResidenceServiceImpl();
    }
    
}
