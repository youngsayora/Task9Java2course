package com.company;
import java.awt.*;
import java.util.*;

public class Var22 {


    public static void Solution22(){
        /*Scanner in = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<>();

        System.out.print("Введите массив с элементами через пробел: ");
        String str = in.nextLine();
        String[] numbers = str.split(" ");
        for (String number : numbers){
            list1.add(Integer.parseInt(number));
        }
        list1.add(-10000);

        ArrayList<Integer> answerList = createNewList(list1);

        for (Integer x : answerList) {
            System.out.print(x + " ");
        }*/
    }


    public static ArrayList<Integer> createNewList(ArrayList<Integer> list){
        ArrayList<Integer> answerListTemp = new ArrayList<>();

        ArrayList<Integer> answerList = new ArrayList<>();
        int i = 1;


        while(i<list.size()){
            if(list.get(i)>=list.get(i-1)){
                if(answerListTemp.isEmpty())
                    answerListTemp.add(list.get(i-1));
                answerListTemp.add(list.get(i));
            }else{
                if(!answerListTemp.isEmpty()){
                    if(!answerList.isEmpty()){
                        if(answerList.size()<answerListTemp.size()){

                            answerList.clear();

                            answerList.addAll(answerListTemp);
                            answerListTemp.clear();
                        }
                        if(answerList.size()==answerListTemp.size()) {
                            double sum = 0;
                            double sumTemp = 0;

                            for (int j = 0; j < answerList.size(); j++) {
                                sum += answerList.get(j);
                                sumTemp += answerListTemp.get(j);
                            }
                            if(sum<sumTemp) {

                                answerList.clear();

                                answerList.addAll(answerListTemp);
                                answerListTemp.clear();
                            }
                        }
                    }else {


                        answerList.addAll(answerListTemp);
                        answerListTemp.clear();
                    }
                }
            }
            i++;
        }
        if (answerList.isEmpty()) {

        }
        return answerList;
    }

}


