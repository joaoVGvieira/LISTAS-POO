import java.util.Scanner;

class Emprestimo  {
    public static void main(String[] args) {
        float valor_emprestimo,salario;
        Scanner Entrada =  new Scanner(System.in);
        System.out.println("==== Emprestimo ====");
        System.out.print("Qual o valor desejado do emprestimo:");
        valor_emprestimo = Entrada.nextFloat();
        System.out.print("Qual seu salario:");
        salario = Entrada.nextFloat();
        if ((valor_emprestimo) <= (salario*0.30)) {
            System.out.println("Emprestimo pode ser solicitado!!!");
        }else{
            System.out.println("Nao pode ser solicitado o emprestimo!!!");
        }

    }
}
