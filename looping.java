public class looping {
    
    public static void main (String[] args) {


        //for loop print the total of suma all number from 1 to 100

        int total=0;
            for(int i=1;i<=100;i++){
                total = total+i;
            };
                System.out.println("the total of sum numbers "+total);

        //for loop print the total of suma all number from 1 to 100

        int i;
        int S = 0;

        for ( i=1; i <=100; i=i+1)
        {
            S = S + i;
        }

        System.out.print("The sum is: " + S + "\n");

        //while loop print the total of suma all number from 1 to 100
        int c= 1;
        int totl = 0 ;
        while (c<=100){
            totl=totl+c;
            c++;
        }
        System.out.println("the total in while loop is "+totl);

        //do while loop print the total of suma all number from 1 to 100

        int b=1;
        int tot=0;
        do{
            tot=tot+b;
            b++;
        }while(b<=100);
        System.out.println("the total for th do while loop is "+tot);
    }
    
}
