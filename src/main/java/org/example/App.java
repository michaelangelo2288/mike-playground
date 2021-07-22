package org.example;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class App 
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(App.class.getName());

    public static void main( String[] args )  {
        logger.info("slf4j logger");
        logger2.info("logger2 - java.util.logging.Logger");
        log.info("hello world");

        App app = new App();
        app.testMethod1();
        testMethod2();
    }

    public void testMethod1() {
        System.out.println("this is a test method");
    }

    public static final void testMethod2() {
        System.out.println("this is a static test method");
    }
}
