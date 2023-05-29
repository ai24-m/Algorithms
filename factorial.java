import java.util.Scanner;


public class factorial {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int N;
        int S=1;

        System.out.println("Enter a number ");
        N = input.nextInt();

        for(int i=1;i<=N;i++){
            S=S*i;


        }
        System.out.println(N+"! ="+S);



        
    }
}
