package com.codewithmosh.reviews;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsJAVA {
    public static void Show(){
        //Three types of exceptions
        // checked , Unchecked, Error
        // unchecked Exception  > JO runtime me aata hai / runtime Exception
        //Checked Excep.. > Jo compiled time me error aata hai wo for eg
        try (var reader = new FileReader("file.txt"); ){

            //this file doesnt Exist
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//
//        }

    }

}


