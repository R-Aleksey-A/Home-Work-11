public class Main {
    public static void determineYear(int year) {
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0 && year % 100 == 0)) && year > 1584) {

            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }}
        public static void main (String[]args){
            System.out.println("Home Work-11");
            System.out.println("Задание-1");
            int year = 2019;
            {
                determineYear(year);
            }
        }
    }
