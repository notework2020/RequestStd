/* Типы данных
       byte a2;  // 1 байт
        short a3; // 2байта
        int a1;   //
        long a4;  //

        float a5;
        double a6;

        char r = 'd';
        boolean b = false;
        boolean b1 = true;*/

//*************************************************************************//

public class SaveStudentOrder
{
    public static void main(String[] args) {

        StudentOrder so;             // обьявляем переменную, классовую
        so = new StudentOrder();     // создание обьекта
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";



        long ans = saveStudentOrder(so);

        System.out.println(ans);              // Вывод на экран



    }

    static long  saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);
        return answer;

    }
}
