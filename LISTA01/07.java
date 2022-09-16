import java.util.Scanner;
class Numeros {
    public static void main(String[] args) {
        int N,numeros,cont =0;
        int maior = 0, menor = 0, soma=0, num_par = 0, num_impar = 0;
        Scanner Entrada = new Scanner(System.in);
        System.out.print("Digite o valor N para ser lidos N numeros: ");
        N = Entrada.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o numero:");
            numeros = Entrada.nextInt();
            soma+=numeros;
            if (numeros > maior) {
                    maior =  numeros;
                    if (cont==0) {
                        menor = numeros;
                        cont++;
                    }
            }
            if (numeros < menor) {
                    menor = numeros;
            }
            if (numeros%2 == 0) {
                num_par++;
            }
            if (numeros%2 != 0) {
                num_impar++;
            }
        }
        soma/=N;
        System.out.println("\n\n === Dados obtidos a partir do N numeros === \n");
        System.out.println("0A media Aritmetica: " + soma + "\n" + "Maior numero: " + maior + "\n" + "Menor numero: " + menor + "\n" + "numeros impares: " + num_impar + "\n" + "numero pares :" + num_par);
    }
}
