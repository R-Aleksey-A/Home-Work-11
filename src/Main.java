public class Main {
    public static void determineYear(int year) {
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) && year > 1584) {

            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
    }

    public static void getClientOS(int clientOs, int clientDeviceYear) {

        if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

        public static void main (String[]args){
            System.out.println("Home Work-11");
            System.out.println("Задание-1");
            int year = 2019;
            {
                determineYear(year);
            }

            System.out.println("Задание-2");
            int clientDeviceYear = 2014;
            int clientOs = 0;
            {
                getClientOS(clientOs, clientDeviceYear);
            }
        }
    }
