import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int cpf1;
        int cpf2;
        int cpf3;
        int cpf4;
        int cpf5;
        int cpf6;
        int cpf7;
        int cpf8;
        int cpf9;


        System.out.println("Digite 1 digito do seu cpf: ");
        cpf1 = sc.nextInt();
        System.out.println("Digite 2 digito do seu cpf: ");
        cpf2 = sc.nextInt();
        System.out.println("Digite 3 digito do seu cpf: ");
        cpf3 = sc.nextInt();
        System.out.println("Digite 4 digito seu cpf: ");
        cpf4 = sc.nextInt();
        System.out.println("Digite 5 digito do seu cpf: ");
        cpf5 = sc.nextInt();
        System.out.println("Digite 6 digito do seu cpf: ");
        cpf6 = sc.nextInt();
        System.out.println("Digite 7 digito do seu cpf: ");
        cpf7 = sc.nextInt();
        System.out.println("Digite 8 digito do seu cpf: ");
        cpf8 = sc.nextInt();
        System.out.println("Digite 9 digito do seu cpf: ");
        cpf9 = sc.nextInt();

        numeros.add(cpf1);
        numeros.add(cpf2);
        numeros.add(cpf3);
        numeros.add(cpf4);
        numeros.add(cpf5);
        numeros.add(cpf6);
        numeros.add(cpf7);
        numeros.add(cpf8);
        numeros.add(cpf9);
        System.out.println(numeros);

        double first;
        first = numeros.get(0) * 1;

        double second;
        second = numeros.get(1) * 2;

        double thirth;
        thirth = numeros.get(2) * 3;

        double fourth;
        fourth = numeros.get(3) * 4;

        double five;
        five = numeros.get(4) * 5;

        double six;
        six = numeros.get(5) * 6;

        double seven;
        seven = numeros.get(6) * 7;

        double eigh;
        eigh = numeros.get(7) * 8;

        double nine;
        nine = numeros.get(8) * 9;

        double soma;
        soma = first + second + thirth + fourth + five + six + seven + eigh + nine;

        double digi;
        digi = soma % 11;
        System.out.println(digi);

//segunda parte
        double first2;
        first2 = numeros.get(0) * 0;

        double second2;
        second2 = numeros.get(1) * 1;

        double thirth2;
        thirth2 = numeros.get(2) * 2;

        double fourth4;
        fourth4 = numeros.get(3) * 3;

        double five2;
        five2 = numeros.get(4) * 4;

        double six2;
        six2 = numeros.get(5) * 5;

        double seven2;
        seven2 = numeros.get(6) * 6;

        double eigh2;
        eigh2 = numeros.get(7) * 7;

        double nine2;
        nine2 = numeros.get(8) * 8;

        double fim;
        fim = digi * 9;

        double soma2;
        soma2 = first2 + second2 + thirth2+ fourth4+ five2+ six2+ seven2+ eigh2+ nine2+ fim;
        System.out.println(soma2);

        double digi2;
        digi2 = soma2 % 11;
        System.out.println(digi2);


    }

}
