import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        String operacao;
        float conta;
        Scanner Entrada = new Scanner(System.in);
        System.out.println("=== Calculadora ===");
        operacao = Entrada.nextLine();
        String[] output = operacao.split(" ");
        output[0] = output[0].toUpperCase();
        if ( output[0].equals("MULTIPLICA")) {
            conta = Float.parseFloat(output[1]) * Float.parseFloat(output[3]);
            System.out.printf("RESPOSTA :%.2f\n",conta); 
        } else if (output[0].equals("DIVIDE") ) {
            conta = Float.parseFloat(output[1]) / Float.parseFloat(output[3]);
            System.out.printf("RESPOSTA :%.2f\n",conta); 
        }else if (output[0].equals("SOMA") ) {
            conta = Float.parseFloat(output[1]) + Float.parseFloat(output[3]);
            System.out.printf("RESPOSTA :%.2f\n",conta); 
        }else if (output[0].equals("SUBTRAI") ) {
            conta = Float.parseFloat(output[1]) - Float.parseFloat(output[3]);
            System.out.printf("RESPOSTA: %.2f\n",conta); 
        }else{
            System.out.println("OPÇAO INVALIDA!!!");
        }
    }
}
