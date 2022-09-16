import java.util.Scanner;

class  Divisao {
        public static void main(String[] args) {
            int num1, num2;
            float resultado;
            Scanner entrada = new Scanner(System.in);
            System.out.println("====== Divisao ======");
            System.out.print("Digite o numerador: ");
            num1 = entrada.nextInt();
            System.out.print("Digite o Denominador: ");
            num2 = entrada.nextInt();
            if (num1 == 0) {
                System.out.println("Erro!!! numerador igual a 0.");
                System.exit(1);
            }
             resultado = (float)num1/(float)num2;
             System.out.println("Resultado da divisao de "+ num1 + " por " + num2 + " eh = " + resultado);   

        }
}
