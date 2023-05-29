import java.util.Scanner;

public class UserData {
    
    // import java.util.Scanner; استدعاء الكلاس هذا لقبول البيانات منالمستخدم  

    // إنشاء كائن من هذا الكلاس لأنك لا تستطيع إستخدام دوال الكلاس Scanner إلا من خلال الكائن الذي يشير إليه.
    // أي يجب كتابة السطر التالي في الدالة main().
    // Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int a;
        System.out.println("Enter a number : ");
        a = input.nextInt();

        System.out.println("You have enternd the number"+a);


        //   إستدعاء إحدى دوال إدخال المعلومات من هذا الكائن و تخزين ما سيدخله المستخدم في متغير من نفس نوع الدالة.
        // هنا كمثال إستخدمنا الدالة nextInt(), ستتعرف لاحقاً على دوال أخرى و متى تستخدم كل واحدة منهم.

        // int a = input.nextInt();


    }

}
