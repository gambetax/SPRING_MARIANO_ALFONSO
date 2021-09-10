package javaSpring.com.verano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaSpring.com.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;


@Service

public class Init implements CommandLineRunner{
    //Implementación de interface
    
    //llamada de nuevo metodo factory -> para llamar a sensar
    @Autowired()
    SensorInEternum sensorInEternum;

    @Override
    public void run(String... args) throws Exception {
        sensorInEternum.sensar();
      
    }
    
    
  
}