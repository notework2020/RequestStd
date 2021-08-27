public class StydentOrderValidation
{
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll() {

        while (true) {


            StudentOrder so = readStudentOrder();                  // Считать студенческую заявку

            if (so == null) {
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);  // Проверить запись в риестре населения
            if (!cityAnswer.success) {
                //
                //continue;
               break;
            }
            AnswerWedding wedAnswer = checkWedding(so);            // Бракосачитание
            AnswerChildren child = checkChildren(so);               // Проверить детей
            AnswerStudent studentAnswer = checkStudent(so);        // Проверить что оба родителя студенты

            sendMail(so);                                          // Отправка о том что прошла или нет заявка
        }

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static  StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder();
        return so;
    }

    static AnswerCityRegister  checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        crv1.login = "Login1";
        crv1.password = "Password1";

        AnswerCityRegister ans1 = crv1.checkCityRegister(so);

        return ans1;
    }

    static AnswerWedding  checkWedding(StudentOrder so){
        System.out.println("Wedding запущен");
        return new AnswerWedding();
    }

    static AnswerChildren  checkChildren(StudentOrder so){
        System.out.println("Children check in running");
        return new AnswerChildren();
    }

    static AnswerStudent  checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }

    static void  sendMail(StudentOrder so){
        System.out.println("Почта отправлен");
    }

}
