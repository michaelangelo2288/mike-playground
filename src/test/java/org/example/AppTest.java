package org.example;

import static org.junit.Assert.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.logging.Level;

@Slf4j
public class AppTest 
{
    private static Logger logger = LoggerFactory.getLogger(AppTest.class);
    private static java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(AppTest.class.getName());

    @Test
    public void shouldAnswerWithTrue()
    {
        log.info("slf4j logger from lombok");

        logger.info("slf4j logger from private static logger instantiated");

        logger2.setLevel(Level.WARNING);
        logger2.info("logger2 from java.util.logging");
    }
}
