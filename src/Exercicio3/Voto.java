package Exercicio3;
import java.util.Scanner;

public class Voto {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int voto, can1=0, can2=0, can3=0, can4=0, branco=0, nulo=0, cont=0;
        float porCN=0, porCB=0;

        System.out.println("Informe o seu voto: ");
        voto = scan.nextInt();
        while(voto !=0){
            if(voto == 1){
                can1++;
            }else if(voto == 2){
                can2++;
            }else if(voto == 3){
                can3++;
            }else if(voto == 4){
                can4++;
            }else if(voto == 5){
                nulo++;
            }else if(voto == 6){
                branco++;
            }
            cont++;
            System.out.println("Informe o seu voto: ");
            voto = scan.nextInt();
            porCN = (nulo / cont) * 100;
            porCB = (branco / cont) * 100;
        }

        System.out.println("Candidado 4 tem " + can4 + " votos");
        System.out.println("Candidado 3 tem " + can3 + " votos");
        System.out.println("Candidado 2 tem " + can2 + " votos");
        System.out.println("Candidado 1 tem " + can1 + " votos");
        System.out.println("Existem " + branco + " votos brancos");
        System.out.println("Existem " + nulo + " votos nulos");
        System.out.println("A porcentagem de votos nulos é " + porCN + "%");
        System.out.println("A porcentagem de votos nulos é " + porCB + "%");
    }





}
