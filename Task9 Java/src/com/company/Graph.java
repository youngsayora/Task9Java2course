package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

public class Graph  extends JFrame {
    private  JLabel label1=new JLabel("Введите массив или возьмите его из файла");
    private JTextField ArrayText =new JTextField("",20);
    private JTextField Answer15 =new JTextField("",20);
    private JTextField Answer22 =new JTextField("",20);
    private JButton GetFromTextField= new JButton("Подтвердить");
    private JButton task15but= new JButton("Задание 15");
    private JButton task22but= new JButton("Задание 22");
    private JButton GetFromFile= new JButton("Взять массив из файла");
    public void graphics() {
        JFrame frame = new JFrame("Лабораторная номер 9");
        frame.setSize(290, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.setVisible(true);
        ArrayList<Integer> list1 = new ArrayList<>();
        GetFromTextField.addActionListener(new ActionListener() {
                                               public void actionPerformed(ActionEvent e) {
                                                   String str = ArrayText.getText();
                                                   String[] numbers = str.split(" ");
                                                   for (String number : numbers) {
                                                       list1.add(Integer.parseInt(number));
                                                   }

                                               }
                                           });
        task15but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Var15 var15 = new Var15();
                ArrayList<Integer> text15 = var15.createNewList(list1);
                String text15Answer = "";
                for (int i =0;i<text15.size();i++) {

                    text15Answer += text15.get(i) + " ";

                }

                //Создаем новый контейнер JFrame
                JFrame jfrm = new JFrame("Массив с ответом");
                //Устанавливаем диспетчер компоновки
                jfrm.getContentPane().setLayout(new FlowLayout());
                //Устанавливаем размер окна
                jfrm.setSize(300, 100);
                //Устанавливаем завершение программы при закрытии окна
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //Создаем новую таблицу на основе двумерного массива данных и заголовков
                //jTable1.setModel(new javax.swing.table.DefaultTableModel(c,headers));*/

                //panel.add(jTable1);

                //Создаем панель прокрутки и включаем в ее состав нашу таблицу
                JScrollPane jscrlp = new JScrollPane(Answer15);


                    Answer15.setText(text15Answer);



                //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
                jfrm.getContentPane().add(jscrlp);

                //Отображаем контейнер
                jfrm.setVisible(true);


            }
            });
        task22but.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Var22 var22 = new Var22();
                ArrayList<Integer> text22 = var22.createNewList(list1);
                String text22Answer = "";
                for (int i =0;i<text22.size();i++) {

                    text22Answer += text22.get(i) + " ";

                }
                //Создаем новый контейнер JFrame
                JFrame jfrm = new JFrame("Массив с ответом");
                //Устанавливаем диспетчер компоновки
                jfrm.getContentPane().setLayout(new FlowLayout());
                //Устанавливаем размер окна
                jfrm.setSize(300, 100);
                //Устанавливаем завершение программы при закрытии окна
                jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                //Создаем новую таблицу на основе двумерного массива данных и заголовков
                //jTable1.setModel(new javax.swing.table.DefaultTableModel(c,headers));*/

                //panel.add(jTable1);

                //Создаем панель прокрутки и включаем в ее состав нашу таблицу
                JScrollPane jscrlp = new JScrollPane(Answer15);
                Answer15.setText(text22Answer);

                //Добавляем в контейнер нашу панель прокрути и таблицу вместе с ней
                jfrm.getContentPane().add(jscrlp);

                //Отображаем контейнер
                jfrm.setVisible(true);


            }
        });


        panel.add(label1);
        panel.add(ArrayText);
        panel.add(GetFromTextField);
        panel.add(GetFromFile);

        panel.add(task15but);
        panel.add(task22but);
        frame.add(panel);

    }

}
