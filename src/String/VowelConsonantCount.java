package String;
public class VowelConsonantCount {
    public static void count(String s) {
        int vowels = 0, consonants = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) >= 0) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static void main(String[] args) {
        count("Hello World");
    }
}
