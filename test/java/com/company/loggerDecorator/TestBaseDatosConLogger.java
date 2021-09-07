package com.company.loggerDecorator;

import com.company.structural.decorator.SecureDecorator;
import com.company.structural.decorator.logger.BaseDatos;
import com.company.structural.decorator.logger.BaseDatosMemoria;
import com.company.structural.decorator.logger.Logger;
import com.company.structural.decorator.logger.LoggerDecorator;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestBaseDatosConLogger {

    private Logger logger = new Logger();
    private BaseDatos sinLogger = new BaseDatosMemoria();
    private BaseDatos bbdd;

    @Before
    public void init() {

        // construir un LoggerDecorator usando la base de datos sinLogger y el logger
        bbdd = new LoggerDecorator(sinLogger, logger);

    }

    // de este test no hay que modificar nada
    @Test
    public void test_logger_decorator() {

        assertFalse("logger no esta vacio",logger.obtener().contains("inserta entrada"));
        bbdd.inserta("entrada");

        assertTrue("bbdd no ha recibido entrada", sinLogger.registros().contains("entrada"));
        assertTrue("no se ha registrado la entrada", logger.obtener().contains("inserta entrada"));

        // lectura con el adapter con logger
        List<String> registros = bbdd.registros();

        assertTrue("el adapter no tiene la nueva entrada", registros.contains("entrada"));

        assertTrue("no se ha registrado la lectura", logger.obtener().contains("lectura"));

    }

//    @Test
//    public void test_contain_bd(){
//
//        logger.inserta("entrada");
//        assertTrue("Ha recibido entrada", logger.registros().contains("entrada"));
//
//    }
//
//    // de este test no hay que modificar nada
//    @Test
//    public void test_loggerPlusBase() {
//        // lectura con el adapter con logger
//        List<String> registros = logger.registros();
//
//        assertTrue("el adapter no tiene la nueva entrada", registros.contains("entrada"));
//
//        assertTrue("no se ha registrado la lectura", logger.registros().contains("lectura"));
//    }

}
