public class Logic1 {
    public static void main(String[] args) {

//        System.out.println(cigarParty(70, true));
//        System.out.println(dateFashion(2, 9));
        System.out.println(squirrelPlay(95, true));

    }

    static boolean squirrelPlay(int temp, boolean isSummer) {
        return (!isSummer && temp >= 60 && temp <=90) || (isSummer && temp >= 60 && temp <=100);
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
