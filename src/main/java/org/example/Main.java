package org.example;

import java.util.Scanner;

import menu.cyclesMenu;
import menu.arraysMenu;
import menu.conditionsMenu;
import menu.methodsMenu;
import tems.ArraysCustom;
import tems.Conditions;
import tems.Cycles;
import tems.Methods;
import  pechat.pechat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Methods methods = new Methods();
        ArraysCustom arrays = new ArraysCustom();
        Conditions conditions = new Conditions();
        Cycles cycles = new Cycles();

        while (true) {
            System.out.println("Выберите задание:");
            System.out.println("1. Массивы");
            System.out.println("2. Условия");
            System.out.println("3. Циклы");
            System.out.println("4. Методы");
            System.out.println("5. Выход");

            int choice = scanner.nextInt();
            pechat.clearConsole();
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали задание по массивам");
                    arraysMenu.arrays(scanner, arrays);
                    break;
                case 2:
                    // Задание по условиям
                    System.out.println("Вы выбрали задание по условиям");
                    conditionsMenu.conditions(scanner, conditions);
                    break;
                case 3:
                    // Задание по циклам
                    System.out.println("Вы выбрали задание по циклам");
                    cyclesMenu.cycles(scanner, cycles);
                    // Добавьте здесь реализацию задания по циклам
                    break;
                case 4:
                    // Задание по методам
                    methodsMenu.methods(scanner, methods);
                    break;
                case 5:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }









}

