
import classes.MaquinaRefri;
import classes.TipoRefrigerante;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        MaquinaRefri maqui = new MaquinaRefri();
        TipoRefrigerante tipo;
        Scanner Entrada = new Scanner(System.in);
        int opc,tipo_refri,qtd;
        double troco;
        double saldo;
        maqui.preencherRefrigerante();
        do {
            System.out.println("=====(Maquina Refrigerante) ======");
            System.out.println("1.receber dinheiro");
            System.out.println("2.Exibir credito atual");
            System.out.println("3.Cancela compra");
            System.out.println("4.Retirar o tipo de refrigerante");
            System.out.println("5.Inserir o tipo de refrigerante");
            System.out.println("6.Imprimir estoque");
            System.out.println("0.Sair");
            System.out.print(": ");
            opc = Entrada.nextInt();
            switch (opc) {
                case 0:
                    break;
                case 1:
                    System.out.println("Qual valor inserir:");
                    saldo = Entrada.nextFloat();
                    maqui.recebe_credito(saldo);
                    break;
                case 2:
                    System.out.println("Credito atual: " + maqui.getCredito_atual());
                    break;
                case 3:
                    maqui.cancela_venda();
                    break;
                case 4:
                    System.out.println("Escolha o tipo de refrigerante");
                    System.out.println("1.Coca cola\n 2.Guarana\n 3.Pepsi\n 4.fanta\n5.cola");
                    tipo_refri = Entrada.nextInt();
                    tipo = maqui.escolhe_refrigerante(tipo_refri);
                    System.out.println("Quantos refrigerante deseja Retirar");
                    qtd = Entrada.nextInt();
                    troco = maqui.retira_estoque(qtd, tipo, maqui.getCredito_atual());
                    break;
                case 5:
                    System.out.println("Escolha o tipo de refrigerante");
                    System.out.println("1.Coca cola\n2.Guarana\n3.Pepsi\n4.fanta\n5.cola");
                    tipo_refri = Entrada.nextInt();
                    tipo = maqui.escolhe_refrigerante(tipo_refri);
                    System.out.println("Quantos refrigerante deseja acrescentar");
                    qtd = Entrada.nextInt();
                    maqui.acrescenta_estoque(qtd, tipo);
                    break;
                case 6:
                    maqui.Imprimir_estoque();
                    break;
                default:
                    break;
            }
            System.out.println();
        } while (opc!=0);
      
    }
    
}
