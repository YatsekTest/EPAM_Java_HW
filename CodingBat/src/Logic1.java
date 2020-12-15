public class Logic1 {
    public static void main(String[] args) {

        System.out.println(cigarParty(70, true));

    }

    static boolean cigarParty(int cigars, boolean isWeekend) {
        return (isWeekend && cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60);
    }

}
