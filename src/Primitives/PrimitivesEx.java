package Primitives;

public class PrimitivesEx {

    public static void main(String[] args) {

        //Primitive: byte, short, int, long, float, double, boolean, char.

        //Numere intregi:

        //8 biti -> valori intre -128 si 127
        byte byteNumber=127;

        //16 biti -> valori intre -32768 si 32678
        short shortNumber = 32767;

        //32 biti -> valori intre -2^31 si 2^31 -1
        int intNumber=4525;


        //64 biti -> -2^63 si 2^63 - 1 ; se foloseste pt numbere f mari;
        long longNumber=76589;

        //Numere cu virgula:

        //32 biti - se pune un f la final pt a arata ca este de tip float, atfel o sa il considere ca pe un double
        float floatNumber=12345.3f;

        //64 biti - se pune un d la final pt a arata ca este de tip double;
        double doubleNumber=12345.3d;



        boolean booleanFlag=true;
        char text ='t';

        //String nu e primitiva!!!

        String fraza="Acesta este un string";

        // Diferenta intre int si Integer?

        //int este o primitiva;
        // Integer este o clasa care ajuta la convertirea unui int in obiect;


        //___________________________________________________________________________________________________________
        //Operatorii in Java

        //1. Operatori aritmetici +,-, *
        //  '/' pentru impartire;
        // '%'  modul -> restul impartiiri dintre 2 numere ex: 5%2 => restul = 1;


        //2. Operatori relationali:

        // '==' se foloseste pentru a compara daca 2 numere sunt egale;
        // !=   diferit
        // >,<,>=,<=;

        //3. Operatorii logici:
        // && operatul 'si';
        //  || operatul 'sau'
        // ! operatorul negatie;

        //4. Operatorii de alocare:
        //= se atribuie o valoare unei variabile;
        //+= aduna o valoare la valorea initiala; ex: a+=3 este echivalentul lui a=a+3;
        // -=;
        // *=;
        //  /=;

        //-----------------------------------------------------------------------------------------------------------

        //Flow control statements

        System.out.println("Acesta este prima linie");
        System.out.println("Aceasta este a doua linie");

        // IF ELSE
        int number = 1;
        if (number ==1){
            System.out.println("Da este 1");

        }else{
            System.out.println("Nu este 1");
        }

        //FOR

        for(int i=0;i<=10;i++){
            System.out.println("i="+i);
        }

        //WHILE

        while(number<10){
            number++;
            System.out.println(number);

        }

        //DO WHILE - se face executie blocului dintre acolate apoi se verifica conditia din "while"; intra cel putin odata in conditie;
        int nr=1;
        do{

            System.out.println("Numarul inainte de incrementare:"+nr);
            nr++;}
        while(nr<10);



        //SWITCH - daca nu punem break pentru cazurile din switch atunci va sari in toate cazurile si le va verifica;

        switch(nr){
            case 1:
                //aici va fi blocul nostru de cod care se va executa in cazul in care nr=1;
                System.out.println("In acest caz  nr este 1");
                break;
            case 2:
                System.out.println("In acest caz nr este 2");
                break;

        }


    }

}
