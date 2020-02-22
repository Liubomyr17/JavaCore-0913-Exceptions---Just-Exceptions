package com.company;

/*

0913 Exceptions. Just an exception.
There is a method that throws two exceptions inherited from Exception, and two inherited from RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.
Need to catch NullPointerException and FileNotFoundException, but not catch
ArithmeticException and URISyntaxException.
How to do it?

Requirements:
1. The main method should call method1.
2. The main method should catch a NullPointerException.
3. The main method should catch a FileNotFoundException.
4. The main method should not catch an ArithmeticException.
5. The main method should not catch a URISyntaxException.
6. Do not modify method1.

 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        }
        catch (NullPointerException e){

        }
        catch (FileNotFoundException e){

        }
        //catch (Exception e){}
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }
}





