import java.util.Scanner;

public class Funcionario {
    String nome;
    String Data_Nascimento;
    String Tipo_contrato;
    Float Valor_Salario;
    int numero_de_filhos;
    int horas_trabalhos;
    String Data_Admissao;
    Scanner Entrada = new Scanner(System.in) ;

    public void Inicializar(Funcionario funcionario) {
        System.out.println("Digite o nome do Funcionario:");
        this.nome = Entrada.nextLine();
        System.out.println("Digite a data de nacimento de " + nome + ":");
        this.Data_Nascimento = Entrada.nextLine();
    }

    public void Contratar(Funcionario funcionario) {
        System.out.println("Digite Qual o tipo de Contrato(horista ou efetivo):");
        set_contrato(Tipo_contrato);
        
        while (!Tipo_contrato.equals("horista") && !Tipo_contrato.equals("efetivo")) {
            System.out.println("Erro no tipo de contrato!!!!!");
            System.out.println("Digite Novamente qual o tipo de Contrato(horista ou efetivo):");
            this.set_contrato(Tipo_contrato);
            if (Tipo_contrato.equals("horista") || Tipo_contrato.equals("efetivo") ) {
                    break;
            }
        }
        if (Tipo_contrato.equals("horista")) {
            System.out.println("Digite Qual o Salario:");
            Valor_Salario = Entrada.nextFloat();
            System.out.println("Quantas horas trabalhada pelo funcionario:");
            horas_trabalhos = Entrada.nextInt();
            this.set_Salario((float)(Valor_Salario*=horas_trabalhos));
        }else{
            System.out.println("Digite Qual o Salario:");
            Valor_Salario = Entrada.nextFloat();
            this.set_Salario(Valor_Salario);
        }
        System.out.println("Quantidades de filhos:");
        this.set_Filhos(numero_de_filhos);
        System.out.println("Digite a data de Admissao:");
        this.set_Data_Admissao(Data_Admissao);
    }


    public void set_Nome(String nome) {
        this.nome = nome = Entrada.nextLine();
    }

    public String get_Nome(){
        return nome;
    }

    public void set_contrato(String Tipo_contrato){
        this.Tipo_contrato = Tipo_contrato = Entrada.nextLine();
    }

    public String get_contrato(){
        return Tipo_contrato;
    }
    public String get_Data_nascimento(){
        return Data_Nascimento;
    }
    public void set_Salario(Float Valor_Salario){
        this.Valor_Salario = Valor_Salario;

    }
    public Float get_Salario(){
        return Valor_Salario;
    }

    public void set_Filhos(int numero_de_filhos){
        this.numero_de_filhos = numero_de_filhos = Entrada.nextInt();
    }

    public int get_Filhos(){
        return numero_de_filhos;
    }

   public void set_Data_Admissao(String Data_Admissao) {
        this.Data_Admissao = Data_Admissao = Entrada.next();
   }
 
    public String get_Data_Admissao(){
            return Data_Admissao;
    }

    public float Salario_bruto(Float Horas_Trabalhadas ) {
        Float salario;
        salario = get_Salario();
        return salario;
    }

    public float desc_INSS(float Horas_Trabalhadas) {
        float desconto_INSS;
        desconto_INSS = Salario_bruto(Horas_Trabalhadas);
        if (desconto_INSS <= 1659.38){
            desconto_INSS =((float)(desconto_INSS*0.08));
        }
        else if (desconto_INSS > 1659.39 && desconto_INSS <= 2765.66 ) {
            desconto_INSS = ((float)(desconto_INSS*0.09));
        }
        else if (desconto_INSS > 2765.67 && desconto_INSS <= 5531.31 ) {
            desconto_INSS = ((float)(desconto_INSS*0.11));
        }
        else if (desconto_INSS > 5531.31 ) {
            desconto_INSS = ((float)(desconto_INSS*0.11));
        }
        else{
            System.out.println("Salario invalido!!!!!");
        }
        return desconto_INSS;
    }

    public float Desc_IR(float Horas_Trabalhadas) {
        float desconto_IR;
        desconto_IR = Salario_bruto(Horas_Trabalhadas);
        if (desconto_IR <= 1903.98 && desconto_IR >=0){
            desconto_IR = 0;
        }
        else if (desconto_IR > 1903.98 && desconto_IR <= 2826.65 ) {
            desconto_IR = ((float)(desconto_IR*0.075) - ((float)(142.80)));
        }
        else if (desconto_IR > 2826.66 && desconto_IR <= 3751.05 ) {
            desconto_IR = (float)(desconto_IR*0.15) - ((float)(354.80));        
        }
        else if (desconto_IR > 3751.06 && desconto_IR <= 4664.68) {
            desconto_IR = (float)(desconto_IR*0.225) - ((float)(635.12));        
        }
        else if (desconto_IR > 4664.68) {
            desconto_IR = (float)(desconto_IR*0.275) - ((float)(869.36));        
        }
        else{
            System.out.println("Salario invalido!!!!!");
        }
        return desconto_IR;
    }

    public float Salario_liquido(float Horas_Trabalhadas) {
        float salario;
        salario = Salario_bruto(Horas_Trabalhadas);
        salario-= desc_INSS(Horas_Trabalhadas);
        salario-= Desc_IR(Horas_Trabalhadas);
        return salario;
    }

    public void Folha_de_pagamento(float Horas_Trabalhadas, String nome) {
        System.out.println("=====FOLHA DE PAGAMENTO ======");
        System.out.println();
        System.out.println("Funcionario: "+ nome);
        System.out.printf("Salario bruto: %.2f\n",Salario_bruto(Horas_Trabalhadas));
        System.out.printf("Desconto do INSS:  %.2f\n", desc_INSS(Horas_Trabalhadas));
        System.out.printf("Desconto IR:  %.2f\n",Desc_IR(Horas_Trabalhadas));
        System.out.printf("Salario liquido:  %.2f\n", Salario_liquido(Horas_Trabalhadas));
        System.out.println();
    }
}
