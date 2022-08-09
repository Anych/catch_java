package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;
    }

    public static void main(String[] args) throws Exception, IOException, ArithmeticException, NumberFormatException {
        try {
            riskyMethod();
        } catch (FileNotFoundException e) {
            System.out.println("Resource is missing");
        } catch (IOException e) {
            System.out.println("Resource error");
        } catch (ArithmeticException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
