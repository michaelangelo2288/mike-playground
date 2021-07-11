package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  {
        System.out.println("Hello world");
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
