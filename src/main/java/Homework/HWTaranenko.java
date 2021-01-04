package Homework;

public class HWTaranenko {
    byte a = -1;
    short be = 12;
    int c = 20;
    long d = 2L;
    float e = 2.25f;
    double f = -123.123;
    char g = 's';
    boolean h = false;
    String str = "ПРИВЕТ МИР";


            public static void main (String[] args) {
                System.out.println("Test");
                System.out.println("Решим пример с 2, 3, 40, 5");
                System.out.println("Итого: " + calculate(2f, 3f, 40f, 5f));
                System.out.println("Проверим 9 и 6 " + task10and20(9, 6));
                System.out.println("Проверим 40 и 2 " + task10and20(40, 2));
                System.out.println("Проверим 1 и 3 " + task10and20(1, 3));
                System.out.println("isPositiveOrNegative");
                isPositiveOrNegative(2);
                System.out.println("Проверим 7 " + isNegative(70));
                System.out.println("sayHelloTo:");
                sayHelloTo( "Серёжа");
                System.out.println("Chek years:");
                chekYear(2020);
                chekYear(2019);
                System.out.println("Конец");
            }

                 public static float calculate (float a, float b, float c, float d) {
                    return a * ( b + (c/d) );
                 };

            public static boolean task10and20(int x1, int x2) {
                int X1;
                int X2;
                return 10 <= x1 + x2 && x1 + x2 <= 20;
            }

                public static void isPositiveOrNegative(int x5) {
                    if (x5 >= 0) {
                            System.out.println("X5 не отрицательно");
                        } else {
                            System.out.println("X5 отрицательно");
                        }
                }


                public static boolean isNegative(int x6) {
                    return x6 < 0;
                }

               public static void sayHelloTo(String name) {
                     System.out.println("Привет " + name + "!");
              }

               public static void  chekYear(int Year){
               if ((Year % 4 ==0) && ((Year%100 != 0) || (Year%400 ==0))) {
                        System.out.println(Year + "- високосный год");
                    } else {  System.out.println(Year + "- невисокосный год");
                        }
                }
    }

