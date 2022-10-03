import java.util.Scanner;

class Data {
        public static void main(String[] args) {
            Scanner Entrada = new Scanner(System.in);
            int mes,dia;
            System.out.print("Digite o mes de aniversario(em numero):");
            mes = Entrada.nextInt();
            System.out.print("Digite o dia de aniversario(em numero):");
            dia = Entrada.nextInt();
            if (mes==1 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Janeiro");
            } else if (mes==2 && dia>=1 && dia<=28) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Fevereiro");
            }else if (mes==3 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Marco");
            }else if (mes==4 && dia>=1 && dia<=30) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Abril");
            }else if (mes==5 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: maio");
            }else if (mes==6 && dia>=1 && dia<=30) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Junho");
            }else if (mes==7 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Julho");
            }else if (mes==8 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Agosto");
            }else if (mes==9 && dia>=1 && dia<=30) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Setembro");
            }else if (mes==10 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Outubro");
            }else if (mes==11 && dia>=1 && dia<=30) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Novembro");
            }else if (mes==12 && dia>=1 && dia<=31) {
                System.out.println("Data de aniversario Valida!!!");
                System.out.println("Mes: Dezembro");
            }
            else{
                System.out.println("Data de aniversario invalida!!!");
                System.exit(1);
            }
            
        }
}
