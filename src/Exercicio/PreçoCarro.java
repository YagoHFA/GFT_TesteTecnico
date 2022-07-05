package Exercicio;
import java.util.Scanner;
public class PreçoCarro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

      int numParcelas, porC;
      float preço, preçoFinal, preçoParcela;

      System.out.println("Digite o valor do carro");
      preço = scan.nextFloat();

        System.out.println("A vista Desconto de 20%!");

        System.out.println("Quantidade de Parcelas e Taxa");
        System.out.println("______________________");
        System.out.println("6  Parcelas / 3%");
        System.out.println("12 Parcelas / 6%");
        System.out.println("18 Parcelas / 9%");
        System.out.println("24 Parcelas / 12%");
        System.out.println("30 Parcelas / 15%");

        System.out.println("Informe o número de parcelas");
        numParcelas = scan.nextInt();

        if(numParcelas == 6){
            porC = 3;
        } else if(numParcelas == 12){
            porC = 6;
        } else if(numParcelas == 18){
            porC = 9;
        } else if(numParcelas == 24){
            porC = 12;
        } else if(numParcelas == 30){
            porC = 15;
        } else{
            porC = 20;
        }


        if(porC != 20){
            preçoFinal = preço + (preço * (porC/100));
        }else{
            preçoFinal = preço - (preço * 0.2f);
        }

        preçoParcela = preçoFinal / numParcelas;

        System.out.println(preçoFinal + "" + preçoParcela);

    }

}
