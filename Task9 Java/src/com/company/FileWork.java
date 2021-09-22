/*package com.company;
import java.io.*;
import java.util.*;

public class FileWork {

    public void SetFile(ArrayList<Integer> MyArray, String path){

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(path),false);
            for (int i =0;i<MyArray.size();i++){

                    out.print(MyArray.get(i)+" ");


            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public int[] GetFile ( String path){
        int[][] value = null;
        File file = new File(path);
        try {
            Scanner sizeScanner = new Scanner(file);
            String[] temp = sizeScanner.nextLine().split(" ");
            sizeScanner.close();
            int nMatrix = temp.length;




            Scanner scanner = new Scanner(file);
            value =  nMatrix;
            for (int i = 0; i < count; i++) {
                String[] numbers = scanner.nextLine().split(" ");
                for (int j = 0; j < nMatrix; j++) {
                    value[i][j] = Integer.parseInt(numbers[j]);
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return value;
    }

}*/
