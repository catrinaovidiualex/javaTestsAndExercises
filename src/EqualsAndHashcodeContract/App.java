package EqualsAndHashcodeContract;
//https://www.youtube.com/watch?v=mtdUbmp7uec
public class App {

    public static class Person{
        private String firstName;
        private String lastName;
        private int ssn;

        public Person(String firstName, String lastName, int ssn){
            this.firstName=firstName;
            this.lastName=lastName;
            this.ssn=ssn;
        }

        public String getFirstName(){
            return this.firstName;
        }

        public void setFirstName(String firstName){
            this.firstName=firstName;
        }

        public String getLastName(){
            return this.lastName;
                    }

        public void setLastName(String lastName){
            this.lastName=lastName;
        }

        public int getSsn(){
            return this.ssn;
        }

        public void setSsn(int ssn){
            this.ssn=ssn;
        }


        public static void main(String[] args) {
            Person p1 = new Person("John","Smith",333333);
            Person p2 = new Person("John","Smith",333333);


            System.out.println(p1.equals(p2)); // it will return false because these persons point to different objects;

            //if we put p1=p2 -> it will return true because p2 point to the same object;
            p1=p2;
            System.out.println(p1.equals(p2));


        }


    }
}
