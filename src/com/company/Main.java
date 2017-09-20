package com.company;

import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /** 1. Приветствовать любого пользователя при вводе его имени через командную строку
          System.out.println("Введите свое имя и нажмите <Enter>: ");

         Scanner scan = new Scanner (System.in);
         String name = scan.next();
         System.out.println("Привет, " + name);
         scan.close(); */

        /**2. Отобразить в окне консоли аргументы командной строки в обратном порядке

        for (int i = 0; i < args.length / 2; i++) {
            String  tmp = args[i];
            args[i] = args[args.length-i-1];
            args[args.length-i-1] = tmp;
       }
        System.out.println(Arrays.toString(args)); */


        /**3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
         с переходом
         for (int k = 0; k < args.length; k++) {
          System.out.println(" " + args[k]);
         } */
       /** без перехода
        for (int k = 0; k < args.length; k++) {
           System.out.print(" " + args[k] + ", ");
        } */


       /**4.Ввести пароль из командной строки и сравнить его со строкой-образцом
        String b = "345";
        System.out.println("Введите пароль и нажмите <Enter>: ");
        Scanner scan = new Scanner (System.in);
        String a = scan.next();
        System.out.println("пароль " + a.equals(b));
        scan.close(); */

        //5. Ввести целые числа как аргументы командной строки, подсчитать их суммы (произведения)
        // и вывести результат на консоль
        // сумма элементов

       /** String str = "3 5 4 6 8 11 7 9";
        String[] arr = str.split(" ");
        int numarr[] = new int[arr.length];
        int S = 0;
        for (int i = 0; i < arr.length; i++) {
            numarr[i] = Integer.parseInt(arr[i]);
            S = S + numarr[i];
        }
        System.out.println("Сумма элементов массива: " +S); */

        // произведение элементов
       /** String str = "3 5 4 6 8 11 7 9";
        String[] arr = str.split(" ");
        int numarr[] = new int[arr.length];
        int P = 1;
        for (int i = 0; i < arr.length; i++) {
            numarr[i] = Integer.parseInt(arr[i]);
            P = P * numarr[i];
        }
        System.out.println("Произведение элементов массива: " +P);  */

       // 6.Ввести с консоли n целых чисел
        // следующие строки до п.6.1. используются во всех задачах п.6 для ввода данных с консоли
     /**   System.out.println("Введите целые числа через пробел и нажмите <Enter>: ");
        Scanner scan = new Scanner (System.in);
        String arr = scan.nextLine(); // вводим строку
       // System.out.println("Строка: " + arr); // не обязательная строка, проверка строки
        scan.close();
        String[] newArr = arr.split(" ");
        // System.out.println("Arr = " + Arrays.toString(newArr)); // не обязательная строка, проверка массива
        int numArr[] = new int[newArr.length]; */
        // 6.1. На консоль вывести: Четные и нечетные числа
        /** четные числа
        for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if (numArr[i]%2 == 0) {
                System.out.print(numArr[i] + ", ");
            }
        }
        // нечетные числа
        System.out.println();
        for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if (numArr[i]%2 != 0) {
                System.out.print(numArr[i] + ", ");
            }

        } */

        // 6.2 На консоль вывести: Наибольшее и наименьшее число
        // наибольшее число
       /** int max = 0;
        for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if (max < numArr[i]) {
                max = numArr[i];
            }
        }
        System.out.println("Наибольшее число: " + max);

        // наименьшее число
        int min = 0;
        for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if (min > numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println("Наименьшее число: " + min); */

        // 6.3. На консоль вывести: Числа, которые делятся на 3 или на 9
       /** for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if (numArr[i]%3 == 0 || numArr[i]%9 == 0) {
                System.out.print(numArr[i] + ", ");
            }
        } */

        // 6.4. На консоль вывести: Числа, которые делятся на 5 и на 7.

       /** for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if (numArr[i]%5 == 0 && numArr[i]%7 == 0) {
                System.out.print(numArr[i] + ", ");
            }
        } */

        // 6.5. На консоль вывести: Все трехзначные числа, в десятичной записи которых нет одинаковых
        // цифр
     /**   for (int i = 0; i < newArr.length; i++) {
           numArr[i] = Integer.parseInt(newArr[i]);
           if ((numArr[i] / 100) > 0 && (numArr[i] / 100) < 10) {
           int k1 = numArr[i] / 100;
           int k2 = numArr[i] / 10 % 10;
           int k3 = numArr[i] % 10;
                if (k1 != k2 && k1 != k3 && k2 != k3) {
                    System.out.println(numArr[i] + ", ");
                }
           }
        } */

        // 6.6. На консоль вывести: «Счастливые» числа
        // задача решена для 2-х и 4-х разрядных чисел. Для 6-ти, 8-ми решение будет аналогично как для 2-х разрядных
      /**  for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            if ((numArr[i] / 10) > 0 && (numArr[i] / 10) < 10) {
                int k1 = numArr[i] / 10;
                int k2 = numArr[i] % 10;
                if (k1 == k2) {
                    System.out.println(numArr[i] + ", ");
                }
            }
            else if ((numArr[i] / 1000) > 0 && (numArr[i] / 1000) < 10) {
                int k1 = numArr[i] / 1000;
                int k2 = numArr[i] / 100 % 10;
                int k3 = numArr[i] / 10 % 10;
                int k4 = numArr[i] % 10;
                if ((k1+k2) == (k3+k4)) {
                    System.out.println(numArr[i] + ", ");
                }
            }
        } */

        // 6.7. На консоль вывести: Элементы, которые равны полусумме соседних элементов

       /** for (int i = 0; i < newArr.length; i++) {
            numArr[i] = Integer.parseInt(newArr[i]);
            // для 2-х разрядного числа
            if ((numArr[i] / 10) > 0 && (numArr[i] / 10) < 10) {
                int k1 = numArr[i] / 10;
                int k2 = numArr[i] % 10;
                if (k1 == (k2/2) && (k2%2) !=5) {
                    System.out.println("Исходное число: " + numArr[i] + ", " + "элемент: " + k1);
                }
                else if (k2 == (k1/2) && (k1%2) != 5){
                    System.out.println("Исходное число: " + numArr[i] + ", " + "элемент: " + k2);
                }
            }
            // для 3-х разрядного числа
            else  if ((numArr[i] / 100) > 0 && (numArr[i] / 100) < 10) {
                int k1 = numArr[i] / 100;
                int k2 = numArr[i] / 10 % 10;
                int k3 = numArr[i] % 10;
                if (k1 == (k2+k3)/2) {
                    System.out.println("Исходное число: " + numArr[i] + ", " + "элемент: " + k1);
                }
                else if (k2 == (k1+k3)/ 2){
                    System.out.println("Исходное число: " + numArr[i] + ", " + "элемент: " + k2);
                }
                else if (k3 == (k1+k2)/ 2){
                    System.out.println("Исходное число: " + numArr[i] + ", " + "элемент: " + k3);
                }
            }
        } */

    }


}
