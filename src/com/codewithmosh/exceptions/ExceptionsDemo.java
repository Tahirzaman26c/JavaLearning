package com.codewithmosh.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
//        FileReader reader = null;
        try(var reader = new FileReader("file .txt")) {
//            reader = new FileReader("file.txt");
            System.out.println("File Opened");
            reader.read();
            new SimpleDateFormat().parse("");
        }
        catch (IOException | ParseException e) {
            System.out.println("Could Not Read Data");

//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println("File opened");
        }
//        finally {
//            if (reader!=null ) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }


//    public static void show(){
//        sayHello(null);
//
//    }
//    public static void sayHello(String name){
//        System.out.println(name.toUpperCase());
//    }
    }
}
