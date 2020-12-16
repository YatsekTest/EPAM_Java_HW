public class Logic1 {
    public static void main(String[] args) {

//        System.out.println(cigarParty(70, true));
//        System.out.println(dateFashion(2, 9));
//        System.out.println(squirrelPlay(95, true));
//        System.out.println(caughtSpeeding(80, false));
//        System.out.println(sortaSum(10, 9));
        System.out.println(alarmClock(1, false));
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
