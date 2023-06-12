import java.util.Scanner;


public class factorial {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner factoria = new Scanner(System.in);
        
        int N;
        int F=1;

        System.out.println("Enter a number : ");
        N = input.nextInt();

        for(int i=1;i<=N;i++){
            F=F*i;
            
            }

        System.out.println(N+"! ="+F);

    System.out.println("_________________________");
    System.out.println(".........................");

        
    int P;
    int V;
    double T=0;

        System.out.println("Enter the Number : ");
        P = factoria.nextInt();

        for(int i=1;i<=P ;i++){
            V=1;
            for(int j=1;j<=i;j++){
                V=V*j;
            }
            T=T+V;
        }
        System.out.println("T = "+T); 

        
    }
}
