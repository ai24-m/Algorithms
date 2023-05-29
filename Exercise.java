import java.util.Scanner;


public class Exercise {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String name;
        String job;
        int age;

        // name هنا طلبنا من المستخدم إدخال إسمه و قمنا بتخزينه في المتغير
        System.out.println("Enter your name : ");
        name=input.nextLine();

        // job هنا طلبنا من المستخدم إدخال وظيفته و قمنا بتخزينه في المتغير
        System.out.println("Enter your Job : ");
        job=input.nextLine();

        // age هنا طلبنا من المستخدم إدخال عمره و قمنا بتخزينه في المتغير
        System.out.println("Enter your age : ");
        age=input.nextInt();

        System.out.println("_________________________");
        System.out.println(".........................");

        // هنا عرضنا جميع المعلومات التي قام المستخدم بإدخالهم
        System.out.println("Name : "+name+"\nJob : "+job+"\nAge : "+age);

    }
}
