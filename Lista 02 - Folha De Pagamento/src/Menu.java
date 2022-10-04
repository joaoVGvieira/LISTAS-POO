import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner Entrada = new Scanner(System.in);
    String data;
    Funcionario funcionario  = new Funcionario();
    
    ArrayList<Funcionario> funcionarios = new ArrayList<>(); 
    Float Horas_Trabalhadas= (float)0;
    int op;
    boolean cont_data = false;
    public int menu_inicializa() {
        System.out.println("=================================(MENU)======================================");
        System.out.println("1)Inicializar e contratar Funcionario");
        System.out.println("2)Retornar folha de pagamento do funcionario pela data de nascimento");
        System.out.println("3)Retornar folha de pagamento do funcionario pelo nome completo");
        System.out.println("4)Imprimir folha de pagamento de todos os funcionarios");
        System.out.println("5)Imprimir nome,quantidade de filhos e tipo de contrato de todos os funcionarios");
        System.out.println("0)Sair");
        System.out.print("Opção: ");
        op = Entrada.nextInt();
        return op;
    }
        public void menu_swtich(int opc) {
            switch (opc) {
                case 0:
                    System.out.println("\nVOLTE SEMPRE!!!\n");
                    break;
                case 1:
                    funcionario = new Funcionario();
                    funcionario.Inicializar(funcionario);
                    funcionario.Contratar(funcionario);
                    funcionarios.add(funcionario);
                    break;
                case 2:
                        if (funcionarios.size()<1) {
                           System.out.println("\nSem funcionario Cadastrado!!!!!\n"); 
                        }else{
                            cont_data = false;
                            System.out.println("Digite uma data para procurar funcionarios:");
                            data = Entrada.next();
                            for (int i = 0; i < funcionarios.size(); i++) {
                                if (funcionarios.get(i).get_Data_nascimento().equals(data)) {  
                                    cont_data = true;
                                    funcionarios.get(i).Folha_de_pagamento(Horas_Trabalhadas, funcionarios.get(i).get_Nome());
                                }
                            }
                            if (cont_data == false) {
                                System.out.println("\nNão tem funcionarios com essa data de nascimento!!!!\n");
                            }
                        }
                    break;
                case 3:
                        if (funcionarios.size()<1) {
                            System.out.println("\nSem funcionario Cadastrado!!!!!\n"); 
                        }else{
                            cont_data = false;
                            System.out.println("Digite um nome para procurar entre os funcionarios:");
                            data = Entrada.next();
                            for (int i = 0; i < funcionarios.size(); i++) {
                                if (funcionarios.get(i).get_Nome().equals(data)) {  
                                    cont_data = true;
                                    funcionarios.get(i).Folha_de_pagamento(Horas_Trabalhadas, funcionarios.get(i).get_Nome());
                                }
                            if (cont_data == false) {
                                System.out.println("\nNão tem funcionarios com esse nome!!!!\n");
                            }
                        }    
                    }
                    cont_data=false;
                    break;
                case 4:
                        if (funcionarios.size()<1) {
                            System.out.println("\nSem funcionario Cadastrado!!!!!\n"); 
                        }else{
                            System.out.println("\n ======= IMPRIMINDO FOLHA DE PAGEMNTO DE TODOS OS FUNCIONARIOS ===== \n");
                            for (int i = 0; i < funcionarios.size(); i++) {
                                    funcionarios.get(i).Folha_de_pagamento(Horas_Trabalhadas, funcionarios.get(i).get_Nome());
                            }
                        }    
                    break;
                case 5:
                        if (funcionarios.size()<1) {
                            System.out.println("\nSem funcionario Cadastrado!!!!!\n"); 
                        }else{
                            System.out.println("IMPRESSAO DE DADOS DE USUARIOS:\n");
                            for (int i = 0; i < funcionarios.size(); i++) {
                                
                                System.out.println("\nNome: " + funcionarios.get(i).get_Nome());
                                System.out.println("Quantidade de filhos: " + funcionarios.get(i).get_Filhos());
                                System.out.println("Tipo Contrato: " + funcionarios.get(i).get_contrato());
                            }
                        }
                    break;
                default:
                    System.out.println("\nOPCAO INVALIDA!!!!\n");
                    break;
            }
        }
}
