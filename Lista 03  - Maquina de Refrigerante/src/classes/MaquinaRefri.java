package classes;

import classes.TipoRefrigerante;
import classes.Refrigerante;
import java.util.Scanner;

public class MaquinaRefri{
  
    private double saldo,conta;
    private int quantidade_de_cada_refrigerante, quantidade_cont;
    private double Credito_atual;
    private TipoRefrigerante tipo;
    private Refrigerante refrigerantes[];
    Scanner Entrada = new Scanner(System.in);
  
    public TipoRefrigerante getTipo() {
        return tipo;
    }

    public void setTipo(TipoRefrigerante tipo) {
        this.tipo = tipo;
    }

    

    public void preencherRefrigerante( ) {
        this.refrigerantes = new Refrigerante[5];
        refrigerantes[0] = new Refrigerante(5.20,tipo.COCACOLA,20);
        refrigerantes[1] = new Refrigerante( 4.50, tipo.GUARANA,20);
        refrigerantes[2] = new Refrigerante(3.20,tipo.PEPSI,20);
        refrigerantes[3] = new Refrigerante(4.20,tipo.FANTA,20);
        refrigerantes[4] = new Refrigerante(2.00,tipo.COLA,20);
    }

    public void maquinaRefrigerante() {
        this.preencherRefrigerante();
        this.saldo = 10.0f;
        this.Credito_atual = 0f;

    }

    //nao consigo acessar os dados da classe refrigerante 
    public double getSaldo() {
        return saldo;
    }


    public int getQuantidade_de_cada_refrigerante() {
        return quantidade_de_cada_refrigerante;
    }
    public double getCredito_atual() {
        return Credito_atual;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setQuantidade_de_cada_refrigerante(int quantidade_de_cada_refrigerante) {
        this.quantidade_de_cada_refrigerante = quantidade_de_cada_refrigerante;
    }

    
    public void setCredito_atual(Double credito_atual) {
        Credito_atual = credito_atual;
    }

    public void recebe_credito(Double valor){
        if (valor>0) {
            this.Credito_atual += valor;
        }else{
            System.out.println("Digite um valor valido!!!:");

        }
        
    }

    public void exibe_credito_atual(){
        System.out.println("Credito atual: " + this.Credito_atual);
    }
    
    public void cancela_venda(){
        System.out.println("venda cancelada!!!");
        this.Credito_atual = 0;
    };

    public TipoRefrigerante escolhe_refrigerante(int num){
        switch (num) {
            case 1:
                return tipo.COCACOLA;
            case 2:
                return tipo.GUARANA;
            case 3:
                return tipo.PEPSI;
            case 4:
                return tipo.FANTA;
            case 5:
                return tipo.COLA;
            default:
                System.out.println("ERRO!!!");
                break;
        }
        return null;
    };
    public double retira_estoque(int quantidade, TipoRefrigerante tipo, double saldo){
        for (int i = 0; i < 5; i++) {
            if(this.refrigerantes[i].gettipo().equals(tipo)){
                 quantidade_cont= refrigerantes[i].getQuantidade();
                 if (quantidade_cont < quantidade) {
                    System.out.println("impossivel retirar refri");
                 }
                 else if (quantidade_cont>= quantidade) {
                        if (saldo > (float)refrigerantes[i].getValor()) {
                            quantidade_cont-=quantidade;
                            this.refrigerantes[i].setQuantidade(quantidade_cont);
                            conta = saldo - refrigerantes[i].getValor();
                            System.out.println("Compre feita com sucesso!!!");
                            return conta;
                        }
                        else{
                            System.out.println("saldo insuficiente!!!\n");
                        }
                      
                 } 
            }
        }
        return saldo;
    } 
    public void acrescenta_estoque(int quantidade, TipoRefrigerante tipo){
        for (int i = 0; i < 5; i++) {
            if(this.refrigerantes[i].gettipo().equals(tipo)){
                 quantidade_cont= refrigerantes[i].getQuantidade();
                 if (quantidade_cont + quantidade > 20 ) {
                    System.out.println("impossivel adicionar refri");
                 }
                 else{
                       quantidade_cont+=quantidade;
                       this.refrigerantes[i].setQuantidade(quantidade_cont);
                 } 
            }
        }
    } 
    public void Imprimir_estoque() {
        for (int i = 0; i < refrigerantes.length; i++) {
            System.out.println("O refrigerante  " + refrigerantes[i].gettipo() + " tem " + refrigerantes[i].getQuantidade() + " de quantidade total");
        }
        System.out.println();
    }
}
