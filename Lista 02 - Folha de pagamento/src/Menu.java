import java.util.Scanner;

public class Menu {
    Scanner Entrada = new Scanner(System.in);
    String data;
    Funcionario [] funcionario  = new Funcionario[10];
    Float Horas_Trabalhadas= (float)0;
    int op,cont=0;
     boolean cont_data = false;
    public int menu_inicializa() {
        System.out.println("=================================(MENU)======================================");
        System.out.println("1)Inicializar e contratar Funcionario");
        System.out.println("2)Retornar folha de pagamento do funcionario pela data de nascimento");
        System.out.println("3)Retornar folha de pagamento do funcionario pelo nome completo");
        System.out.println("4)Imprimir folha de pagamento de todos os funcionarios");
        System.out.println("5)Imprimir nome e quantidade de filhos de todos os funcionarios");
        System.out.println("0)Sair");
        System.out.print("Opção: ");
        op = Entrada.nextInt();
        return op;
    }

        public void menu_swtich(int opc) {
            switch (opc) {
                case 0:
                    System.out.println("Volte sempre!!!");
                    break;
                case 1:
                    if(cont > funcionario.length){
                        System.out.println("Vetor Cheio!!!!! Nao eh possivel contratar!!!");
                    }
                    else{
                        funcionario[cont] = new Funcionario();
                        funcionario[cont].Inicializar(funcionario[cont]);
                        funcionario[cont].Contratar(funcionario[cont]);
                        cont++;
                    }
                    break;
                case 2:
                    if (cont==0) {
                        System.out.println("Erro sem funcionarios!!!!\n");
                    }else{
                        System.out.println("Digite uma data para procurar funcionarios:");
                        data = Entrada.next();
                        for (int i = 0; i < cont; i++) {
                            if (funcionario[i].Data_Nascimento.equals(data)) {  
                                cont_data = true;
                                if (funcionario[i].Tipo_contrato.equals("horista")) {
                                        System.out.println("Quantas horas trabalhada pelo funcionario "+ funcionario[i].get_Nome()+":");
                                        Horas_Trabalhadas = Entrada.nextFloat();
                                        funcionario[i].Folha_de_pagamento(Horas_Trabalhadas, funcionario[i].get_Nome());
                                }
                                else{
                                    funcionario[i].Folha_de_pagamento(Horas_Trabalhadas, funcionario[i].get_Nome());
                                }
                            }
                        }
                        if (cont_data == false) {
                            System.out.println("Não tem funcionarios com essa data de nascimento!!!!");
                        }
                    }
                    break;
                case 3:
                    if (cont==0) {
                        System.out.println("Erro sem funcionarios!!!!");
                    }else{
                        System.out.println("Digite um nome para procurar entre os funcionarios:");
                        data = Entrada.next();
                        for (int i = 0; i < cont; i++) {
                            if (funcionario[i].get_Nome().equals(data)) {  
                                cont_data = true;
                                if (funcionario[i].get_Nome().equals("horista")) {
                                        System.out.println("Quantas horas trabalhada pelo funcionario "+ funcionario[i].get_Nome()+":");
                                        Horas_Trabalhadas = Entrada.nextFloat();
                                        funcionario[i].Folha_de_pagamento(Horas_Trabalhadas, funcionario[i].get_Nome());
                                }
                                else{
                                    funcionario[i].Folha_de_pagamento(Horas_Trabalhadas, funcionario[i].get_Nome());
                                }
                            }
                        }
                        if (cont_data == false) {
                            System.out.println("Não tem funcionarios com esse nome!!!!");
                        }
                    }
                    cont_data=false;
                    break;
                case 4:
                    if (cont==0) {
                        System.out.println("Erro sem funcionarios!!!!");
                    }else{
                        System.out.println("\n ======= IMPRIMINDO FOLHA DE PAGEMNTO DE TODOS OS FUNCIONARIOS ===== \n");
                        for (int i = 0; i < cont; i++) {
                                if (funcionario[i].Tipo_contrato.equals("horista")) {
                                        System.out.println("Quantas horas trabalhada pelo funcionario "+ funcionario[i].get_Nome()+":");
                                        Horas_Trabalhadas = Entrada.nextFloat();
                                        funcionario[i].Folha_de_pagamento(Horas_Trabalhadas, funcionario[i].get_Nome());
                                }
                                else{
                                    funcionario[i].Folha_de_pagamento(Horas_Trabalhadas, funcionario[i].get_Nome());
                                }
                            }
                    }
                    break;
                case 5:
                    if (cont==0) {
                        System.out.println("Erro sem funcionarios!!!!");
                    }else{
                        System.out.println("FOLHA DE PAGAMENTO DE TODOS OS FUNCIONARIOS:\n");
                        for (int i = 0; i < cont; i++) {
                            
                              System.out.println("\nNome: " + funcionario[i].get_Nome());
                              System.out.println("Quantidade de filhos: " + funcionario[i].get_Filhos());
                        }
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!!!!");
                    break;
            }
            System.out.println();
        }
   
}
