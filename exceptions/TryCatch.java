package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

//    public static void main(String[] args) {
//        File file = new File("resources/none.txt");
//        try {
//            file.createNewFile();
//        }catch (IOException e){
//            System.out.println("Sorry, error occured: " + e.getMessage());
//            e.printStackTrace();
//        }
//
//    }
    public static void main(String[] args) {
        File file = new File("files/numbers.txt");
        try{
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                System.out.println(fileReader.nextDouble());
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
