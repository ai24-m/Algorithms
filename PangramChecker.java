import java.util.Scanner;
public class PangramChecker {
    public static void main(String[] args) {
        int[] freq = new int[26];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) { char c = input.charAt(i); if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 0) {
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


