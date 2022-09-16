 import java.util.Scanner;
 import java.util.Random;
 
 class Jogo {
    public static void main(String[] args) {
        int min = 1;
		int max = 10;
        Scanner Entrada = new Scanner(System.in);
        Random random = new Random();
        int valor = random.nextInt((max + min)+1) + min;    
        int N, tentativas=0;
        
        while (true) {
            System.out.print("Adivinhe o valor gerado aleatoriamente entre [1,100]:");
            N = Entrada.nextInt();    
            if (N < valor) {
               System.out.println("Valor eh maior que " + N);
               tentativas++; 
            }else if (N > valor) {
                System.out.println("Valor eh menor que " + N); 
                tentativas++;

            }else if(valor == N){
                System.out.println("Parabens vc acertou!!! Com " + tentativas + " tentativas");
                break;
            }
            else{
                System.out.println("valor invalido!!!!");
                tentativas++;
            }
        }

    }
}
