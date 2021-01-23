import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String3 {
    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));
    }

    static int sumNumbers(String str) {
        str = str + " ";
        int count = 0;
        StringBuilder tmpStr = new StringBuilder("0");
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                tmpStr.append(str.charAt(i));
            } else {
                count += Integer.parseInt(tmpStr.toString());
                tmpStr = new StringBuilder("0");
            }
        }
        return count;

        /*int result = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            result += Integer.parseInt(matcher.group());
        }
        return result;*/
    }

    public int maxBlock(String str) {
        int len = str.length();
        int count = 0;
        int tmpCount = 1;
        for (int i = 0; i < len; i++) {
            if (i < len - 1 && str.charAt(i) == str.charAt(i + 1)) tmpCount++;
            else tmpCount = 1;
            if (tmpCount > count) count = tmpCount;
        }
        return count;
    }

    public String mirrorEnds(String string) {
        String result = "";
        int len = string.length();
        for (int i = 0; i < len; i++) {
            if (string.charAt(i) == string.charAt(len - 1 - i)) result += string.charAt(i);
            else return result;
        }
        return result;
    }

    public String sameEnds(String string) {
        String result = "";
        for (int i = 0; i < string.length() / 2 + 1; i++) {
            String substr = string.substring(string.length() - i);
            if (string.substring(0, i).equals(substr)) result = substr;
        }
        return result;
    }

    public int sumDigits(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                count += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return count;
    }

    public int countTriple(String str) {
        int count = 0;
        if (str.length() < 3) return 0;
        for (int i = 2; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1) && str.charAt(i) == str.charAt(i - 2)) count++;
        }
        return count;
    }

    public boolean gHappy(String str) {
        boolean isHappy = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                if (i > 0 && str.charAt(i - 1) == 'g') isHappy = true;
                else isHappy = i < str.length() - 1 && str.charAt(i + 1) == 'g';
            }
        }
        return isHappy;
    }

    public boolean equalIsNot(String str) {
        int countIs = 0, countNot = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i).startsWith("is")) countIs++;
            if (str.substring(i).startsWith("not")) countNot++;
        }
        return countIs == countNot;
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
