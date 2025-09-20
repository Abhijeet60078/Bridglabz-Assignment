package String;

public class CustomReplace {

    public static String replace(String str, char oldChar, char newChar) {
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == oldChar) {
                chars[i] = newChar;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "Hello World";
        char oldChar = 'l';
        char newChar = '*';

        String modified = replace(original, oldChar, newChar);
        System.out.println("Original: " + original);
        System.out.println("Modified: " + modified);
    }
}
