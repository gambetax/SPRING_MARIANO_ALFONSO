package javaSpring.com.verano;

import com.bolivarsoft.sensorclima.SensorClima;
import com.bolivarsoft.sensorclima.TipoClima;
import com.bolivarsoft.sensorvelocidad.DatosVehiculo;
import com.bolivarsoft.sensorvelocidad.SensorVelocidad;
import javaSpring.com.services.EvaluadorMultas;
import javaSpring.com.services.GrabadorMultaJson;
import javaSpring.com.services.SensorInEternum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class VeranoApplication {

    public static void main(String[] args) {

        SpringApplication.run(VeranoApplication.class, args);
    }

}

