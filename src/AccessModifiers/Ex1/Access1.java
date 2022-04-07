package AccessModifiers.Ex1;

public class Access1 {

        int age=30;
        private String name="Radu Ionut";
        public String status="Married";

        public static void main(String[] args) {
                Access1 a1= new Access1();
                System.out.println(a1.age+a1.name);
        }

}
