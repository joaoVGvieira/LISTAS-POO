import java.util.Scanner;
class Meses {
    public static void main(String[] args) {
            Scanner Entrada = new Scanner(System.in);
            String mes;
            System.out.print("Digite o mes para saber o numero equivalente:");
            mes = Entrada.next();
            mes = mes.toLowerCase();
            if ( mes.equals("janeiro")) {
                System.out.println("o mes "+ mes + " equivale 1"); 
            }  else if (mes.equals("fevereiro")  ) {
                System.out.println("o mes "+ mes + " equivale 2"); 

            } else if (mes.equals("marco")  ) {
                System.out.println("o mes "+ mes + " equivale 3"); 

            } else if (mes.equals("abril") ) {
                System.out.println("o mes "+ mes + " equivale 4"); 

            } else if (mes.equals("maio")  ) {
                System.out.println("o mes "+ mes + " equivale 5"); 

            } else if (mes.equals("junho") ) {
                System.out.println("o mes "+ mes + " equivale 6"); 

            } else if (mes.equals("julho")  ) {
                System.out.println("o mes "+ mes + " equivale 7"); 

            } else if (mes.equals("agosto")  ) {
                System.out.println("o mes "+ mes + " equivale 8"); 

            } else if (mes.equals("setembro")  ) {
                System.out.println("o mes "+ mes + " equivale 9"); 

            } else if (mes.equals("outubro")  ) {
                System.out.println("o mes "+ mes + " equivale 10"); 

            } else if (mes.equals("novembro")  ) {
                System.out.println("o mes "+ mes + " equivale 11"); 

            } else if (mes.equals("dezembro")  ) {
                System.out.println("o mes "+ mes + " equivale 12"); 

            }else{
                System.out.println("ERRO!!! numero de mes invalido!!!");
                System.exit(1);
            }
            
    }
    
}