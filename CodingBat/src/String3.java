import java.util.Locale;

public class String3 {
    public static void main(String[] args) {

    }

    public String withoutString(String base, String remove) {
        base = base.replace(remove.toUpperCase(), "");
        base = base.replace(remove.toLowerCase(), "");
        return base.replace(remove, "");

/*      Ниже приведено моё неполное решение (не все случаи учитывает и не все тесты до конца проходит.
        Но я решил его не доделывать, т.к. в интернете увидел гениальное решение в три строчки (приведено выше).

        String newStr = base;
        for (int i = 0; i < base.length(); i++) {
            if (base.substring(i).toLowerCase().startsWith(remove.toLowerCase())) {
                newStr = base.replace(remove.toLowerCase(), "");
                break;
            }
        }
        return newStr;
*/
    }

    public int countYZ(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i - 1));
            if (!Character.isLetter(str.charAt(i)) && (ch == 'y'
                    || ch == 'z')) count++;
            if (i == str.length() - 1 && (Character.toLowerCase(str.charAt(i)) == 'y'
                    || Character.toLowerCase(str.charAt(i)) == 'z')) count++;
        }
        return count;
    }

}
