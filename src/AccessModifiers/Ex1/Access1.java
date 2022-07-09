package AccessModifiers.Ex1;

public class Access1 {

        public int age=30;
        private String name="Radu Ionut";
        public String status="Married";
        private int bankaccount =3200;

        public static void main(String[] args) {
                Access1 a1= new Access1();
                System.out.println(a1.age+""+a1.name);
                System.out.println("Bank account balance is:"+a1.bankaccount);

        }

}
