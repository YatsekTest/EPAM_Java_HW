public class Logic1 {
    public static void main(String[] args) {

//        System.out.println(cigarParty(70, true));
//        System.out.println(dateFashion(2, 9));
//        System.out.println(squirrelPlay(95, true));
//        System.out.println(caughtSpeeding(80, false));
//        System.out.println(sortaSum(10, 9));
//        System.out.println(alarmClock(1, false));
//        System.out.println(love6(-7, 1));
//        System.out.println(in1To10(11, true));
//        System.out.println(specialEleven(22));
//        System.out.println(more20(43));
//        System.out.println(old35(10));
//        System.out.println(less20(8));
//        System.out.println(nearTen(19));
//        System.out.println(teenSum(13, 2));
//        System.out.println(answerCell(true, false, false));
//        System.out.println(teaParty(6, 8));
//        System.out.println(fizzString("mili"));
//        System.out.println(fizzString2(15));
//        System.out.println(twoAsOne(3, 2, 2));
//        System.out.println(inOrder(1, 1, 2, true));
//        System.out.println(inOrderEqual(5, 5, 5, true));
//        System.out.println(lastDigit(23, 19, 3));
//        System.out.println(lessBy10(11, 1, 7));
        System.out.println(withoutDoubles(3, 3, false));
    }

    static int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) die1 = die1 == 6 ? 1 : ++die1;
        return die1 + die2;
    }

    static boolean lessBy10(int a, int b, int c) {
//       return a - b >= 10 || a - c >= 10 || b - a >= 10 || b - c >= 10 || c - a >= 10 || c - b >= 10;
       return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10;
    }

    static boolean lastDigit(int a, int b, int c) {
       return a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10;
    }

    static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if(!equalOk) return a < b && b < c;
        else return a <= b && b <= c;
    }

    static boolean inOrder(int a, int b, int c, boolean bOk) {
        if(!bOk) return b > a && c > b;
        else return c > b;
    }

    static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    static String fizzString2(int n) {
        if(n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        else if(n % 3 == 0) return "Fizz!";
        else if(n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    static String fizzString(String str) {
        char first = str.charAt(0);                         // boolean f = str.startsWith("f");
        char last = str.charAt(str.length() - 1);           // boolean b = str.endsWith("b");
        boolean isFizz = first == 'f';                      // Правильнее будет воспользоваться методами
        boolean isBuzz = last == 'b';                       // startsWith and endsWith в остальном решение совпадает.
        if(isFizz && isBuzz) return "FizzBuzz";
        else if(isFizz) return "Fizz";
        else if(isBuzz) return "Buzz";
        return str;
    }

    static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if (tea / 2 >= candy || candy / 2 >= tea) return 2;
        else return 1;
    }

    static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (!isMorning || isMom);
    }

    static int teenSum(int a, int b) {
        int sum = a + b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19;
        return sum;
    }

    static boolean nearTen(int num) {
        return (num % 10 >= 0 && num % 10 <= 2) || (num % 10 > 7);
    }

    static boolean less20(int n) {
//        return n > 17 && ((n % 20 + 1) % 10 == 0 || (n % 20 + 2) % 10 == 0); // Моё совсем не оптимальное решение :))
        return (n % 20 == 18) || (n % 20 == 19);
    }

    static boolean old35(int n) {
        return (n % 3 == 0 || n % 5 == 0) && !(n % 3 == 0 && n % 5 == 0);
    }

    static boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    static boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    static boolean in1To10(int n, boolean outsideMode) {
        return !outsideMode ? (n >= 1 && n <= 10) : (n <= 1 || n >= 10);
    }

    static boolean love6(int a, int b) {
//        System.out.println("a + b = " + Math.abs(a + b) + "\na - b = " + Math.abs(a - b));
        return a == 6 || b == 6 || Math.abs(a - b) == 6 || (a + b) == 6;
    }

    static String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 6 || day == 0);
        if (vacation) {
            if (isWeekend) return "off";
            else return "10:00";
        } else if (isWeekend) return "10:00";
        else return "7:00";
    }

    static int sortaSum(int a, int b) {
        int sum = a + b;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    static int caughtSpeeding(int speed, boolean isBirthday) {
        int birthday = 0;
        if (isBirthday) birthday = 5;
        if (speed <= 60 + birthday) return 0;
        else if (speed > 60 + birthday && speed <= 80 + birthday) return 1;
        else if (speed > 80 + birthday) return 2;
        return 2;   /* Смущает меня необходимость в конце метода всё равно выводить ещё один return. Наверное можно
                        как-то оптимизировать код. Хотя, метод не знает, что на вход могут поступить только строго
                           определённые значения... */
    }

    static boolean squirrelPlay(int temp, boolean isSummer) {
        return (temp >= 60 && temp <= 90) || (isSummer && temp >= 60 && temp <= 100);
    }

    static int dateFashion(int you, int date) {
        if ((you >= 8 && date > 2) || (date >= 8 && you > 2)) return 2; // Неоптимальное решение - можно короче?
        if ((you < 8 && date > 2) && (date < 8 && you > 2)) return 1;
        return 0;
/*      // Check the <=2 case first, since it takes precedence    // Решение с сайта
        // over the >=8 case.
        if (you <= 2 || date <= 2) return 0;
        else if (you >= 8 || date >= 8) return 2;
        else return 1;
        }   */
    }

    static boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60);
    }

}
