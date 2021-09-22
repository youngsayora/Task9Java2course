package com.company;
import java.awt.*;
import java.util.*;

public class Var15 {

    public static void Solution15() {
        /*Scanner in = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("Введите массив с элементами через пробел: ");
        String str = in.nextLine();
        String[] numbers = str.split(" ");
        for (String number : numbers) {
            list1.add(Integer.parseInt(number));
        }


        ArrayList<Integer> answerList = createNewList(list1);

        for (Integer x : answerList) {
            System.out.print(x + " ");
        }*/
    }

    public static ArrayList<Integer> createNewList(ArrayList<Integer> list) {
        ArrayList<ArrayList<Integer>> container = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int len = list.size(),
                max = 0;

        for (int i = 0; i+1 < len; i++) {
            for (int c = i, a = 0, b = 1; c+1 < len; a++, b++, c++) {
                ArrayList<Integer> seq = new ArrayList<Integer>();
                seq.add(list.get(i));
                int prev = list.get(i),
                        d = list.get(i+b) - prev;

                for (int j = i+a; j+1 < len; j++) {
                    if (list.get(j+1) - prev == d) {
                        seq.add(list.get(j+1));
                        prev = list.get(j+1);
                    }
                }

                max = max <= seq.size() ? seq.size() : max;
                container.add(seq);
            }
        }

        for (ArrayList<Integer> x : container) {
            if (x.size() == max) {
                result = x;
                break;
            }
        }

        return result;

    };
}










