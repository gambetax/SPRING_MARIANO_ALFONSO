/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaSpring.com.services;

import com.google.gson.Gson;
import java.io.File;
import javaSpring.com.model.Ticket;
import javaSpring.com.repositories.GrabadorMulta;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Marian
 */
@Repository
@Primary
//Definir este repositorio como primario, por defecto
public class GrabadorMultaJson implements GrabadorMulta{
    
    @Value("${pathTickets}")
    private String pathTickets;
    
     @Override
    public void grabar(Ticket t) {
        System.out.println("Grabando Ticket en formato JSON");
        
        
         try {
             
             String nomArch = String.join("", pathTickets, t.idTicket, ".json");
             File arch = new File(nomArch);
             
             Gson gson = new Gson();
             String strJson = gson.toJson(t);
             
             System.out.println("DATA: " + strJson);
             FileUtils.writeStringToFile(arch, strJson, "UTF-8");
             
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
             
         }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
