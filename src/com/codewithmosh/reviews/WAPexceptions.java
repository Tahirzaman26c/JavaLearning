package com.codewithmosh.reviews;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WAPexceptions {
    public static void show(){
        FileReader reader = null;
        try {
            reader = new FileReader("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
// try with resource me
// try ( Issme variable initialize karne ka phir)
// ye Autoclosable hota hai

