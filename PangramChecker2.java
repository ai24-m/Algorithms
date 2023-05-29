import java.util.Scanner;
public class PangramChecker2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < input.length(); i++) { char c = input.charAt(i); if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                isPangram = false;
                break;
            }
        }
        if (isPangram) {
            System.out.println("The sentence is a pangram");
        } else {
            System.out.println("The sentence is not a pangram");
        }
        sc.close();
    }
}
