public class NestedLoop {
    public static void main (String[] args) {



            for (int i=1; i<=3; i++)
            {
                for (int j=1; j<=5; j++)
                {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }


            System.out.println("_______________________");
            System.out.println(".......................\n");


            for(int i=1;i<=3;i++)
                {
                for(int j=1;j<=5;j++)
                {
                    System.out.print("* ");
                }
                System.out.print("\n");
            }


            System.out.println("_______________________");
            System.out.println(".......................\n");


            for(int i=1;i<=3;i++)
                {
                for(int j=1;j<=5;j++)
                {
                    
                    System.out.print(j+" ");
                    
                }
                System.out.print("\n");
            }

            System.out.println("_______________________");
            System.out.println(".......................\n");


            for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                    System.out.print(j+" ");
                    
                    
                }
                System.out.print("\n");
            }

            System.out.println("_______________________");
            System.out.println(".......................\n");

            for(int i=5 ;i>=1;i--)
            {
                for(int j=1;j<=i;j++)
                {
                System.out.print(j+" ");
                
                
            }
            System.out.print("\n");
        }


        System.out.println("_______________________");
        System.out.println(".......................\n");

            String G="";
            for(int i=0;i<=5;i++){
                System.out.println(G);
                G="* "+G;
        }


        System.out.println("_______________________");
        System.out.println(".......................\n");

        String B="";

        for(int i=5;i>=0;i--){
            System.out.println(B);
            B="* "+B;
        }


        System.out.println("_______________________");
        System.out.println(".......................\n");

        for(int i=5;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        System.out.println("_______________________");
        System.out.println(".......................\n");

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5-i+1; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }


            System.out.println("_______________________");
            System.out.println(".......................\n");

            for(int i=1;i<=5;i++){
                
                for(int k=1;k<=5-i;k++){

                    System.out.print("- ");
                }

                for(int j=1;j<=i;j++){
                        System.out.print("* ");
                        }
                System.out.println(" ");
            }
    
            System.out.println("_______________________");
            System.out.println(".......................\n");

            for (int i=5; i>=1; i--)
        {
            for (int k=1; k<=i-1; k++)
            {
                System.out.print("- ");
            }

            for (int j=1; j<=5-i+1; j++)
            {
                System.out.print("* ");
            }

            System.out.print("\n");
        }

        System.out.println("_______________________");
        System.out.println(".......................\n");

        for(int i=5;i>=1;i--){
                
            for(int k=1;k<=5-i;k++){

                System.out.print("- ");
            }

            for(int j=1;j<=i;j++){
                    System.out.print("* ");
                    }
            System.out.println(" ");
        }

        System.out.println("_______________________");
        System.out.println(".......................\n");

        for(int i=2;i<=7;i++){

            System.out.print("* ");
    
            for(int k=1;k<=i-2;k++){
                System.out.print("- ");
            }
            System.out.print("* \n");

                
        }
        

        for(int j=1;j<=8;j++){
            System.out.print("* ");
        }



        System.out.println("\n_______________________");
        System.out.println(".......................\n");


        for (int i=2; i<=7; i++)
        {
            System.out.print("* ");

            for (int k=1; k<=i-2; k++)
            {
                System.out.print("- ");
            }

            System.out.print("* \n");
        }

        for (int j=1; j<=8; j++)
        {
            System.out.print("* ");
        }

        System.out.print("\n");

    }
}
