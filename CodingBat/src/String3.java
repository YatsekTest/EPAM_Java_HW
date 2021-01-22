public class String3 {
    public static void main(String[] args) {

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
