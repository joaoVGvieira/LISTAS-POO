import java.util.Scanner;

    class Aniversario {
    public static void main(String[] args) {
            int num,num2;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Digite o ano do seu nascimento:");
            num = entrada.nextInt();
            System.out.print("Digite o ano Atual:");
            num2 = entrada.nextInt();
            num = (num2 - num );
            System.out.println("Voce ira fazer " + num + " anos !!!");
    }
}
