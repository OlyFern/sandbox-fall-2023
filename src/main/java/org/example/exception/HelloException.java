package org.example.exception;

import java.util.Scanner;

public class HelloException {
    public static void main(String[] args) {
        try{

        }catch(Exception e){
            e.printStackTrace();
        }
        try{

        }catch(NullPointerException e){

        }catch(Exception e){
            e.printStackTrace();
        }

        try{

        }catch(Exception e){

        }finally{

        }

        try{

        }catch(ArithmeticException | NullPointerException e){

        }

        try(Scanner scanner = new Scanner(System.in)){

        }
    }

}
