package Exercicio2;
import java.util.Scanner;
public class Nota {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int numMatricula, aulasFreq, cont = 0, porC = 0;
        float nota1, nota2, nota3, média, menorNota = 10, maiorNota = 0;

        String sala[] = new String[5];


        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o número da matricula");
            numMatricula = scan.nextInt();

            System.out.println("Informe as três notas");
            nota1 = scan.nextInt();
            nota2 = scan.nextInt();
            nota3 = scan.nextInt();

            System.out.println("Informe a frequencia do aluno");
            aulasFreq = scan.nextInt();

            média = (nota1 + nota2 + nota3) / 3;


            if (média > 7 && aulasFreq < 75) {
                System.out.println("Aprovado");
            } else {
                cont++;
                System.out.println("Reprovado");
            }
            if (menorNota > média) {
                menorNota = média;
            }
            if (maiorNota < média) {
                maiorNota = média;
            }
            porC = (cont / 5) * 100;
        }

        System.out.println("A maior nota é " + maiorNota);
        System.out.println("A menor nota é " + menorNota);
        System.out.println("A quantidade reprovada foi" + cont);
        System.out.println(porC + "% foram reprovados");
    }

}