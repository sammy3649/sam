package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Задача 1
      int clientOs = 1;
          if (clientOs == 1) {
           System.out.println("Установите версию приложения для Android по ссылке");
      }
          if (clientOs == 0) {
           System.out.println("Установите версию приложения для iOS по ссылке");
      }


        // Задача 2
        int clientDeviceYear = 2016;
        int clientOs1 = 1;
        if (clientOs1 == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        else if (clientOs1 == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию для IOS по ссылке");
        }
        if (clientOs1 == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (clientOs1 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию для Android по ссылке");
        }


          // Задача 3
      int year = 2021;
          if (year %4 == 0 || year %400 == 0) {
           System.out.println("Высокосный год");
      }
          else if (year %100 != 0){
           System.out.println("Не высокосный год");
      }


          // Задача 4
      int deliveryDistance = 95;
          if (deliveryDistance <= 20){
           System.out.println("Потребуется дней для доставки: 1 сутки");
      }
          else if (deliveryDistance == 20 || deliveryDistance <= 60){
              System.out.println("Потребуется дней для доставки: 2 суток");
      }
          else if (deliveryDistance == 60 || deliveryDistance <= 100) {
              System.out.println("Потребуется дней для доставки: 3 суток");
      }


          // Задача 5
        int monthNumber = 12;
           switch (monthNumber){
            case 1:
             System.out.println("Январь(Зима)");
              break;

            case 2:
             System.out.println("Февраль(Зима)");
              break;

            case 3:
             System.out.println("Март(Весна)");
              break;

            case 4:
             System.out.println("Апрель(Весна)");
              break;

            case 5:
             System.out.println("Май(Весна)");
              break;

            case 6:
             System.out.println("Июнь(Лето)");
              break;

            case 7:
             System.out.println("Июль(Лето)");
              break;

            case 8:
             System.out.println("Август(Лето)");
              break;

            case 9:
             System.out.println("Сентябрь(Осень)");
              break;

            case 10:
             System.out.println("Октябрь(Осень)");
              break;

            case 11:
             System.out.println("Ноябрь(Осень)");
              break;

            case 12:
             System.out.println("Декабрь(Зима)");
              break;

            default:
             System.out.println("Такого месяца не существует =) Даже в календаре племени Майя");
        }

    }
  }




