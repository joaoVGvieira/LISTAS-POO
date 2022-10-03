import java.util.Scanner;
class Hora {
    public static void main(String[] args) {
            int hora, min, seg;
            int somaseg, somaseg2;
            int hora2, min2, seg2;
            int diferenca;
            Scanner Entrada = new Scanner(System.in);
            System.out.println("=== Diferença de horas ===");
            System.out.println("=== Hora 1 ===");
            System.out.print("Digite hora:");
            hora = Entrada.nextInt();
            System.out.print("Digite minutos:");
            min = Entrada.nextInt();
            System.out.print("Digite segundos:");
            seg = Entrada.nextInt();
            System.out.println("=== Hora 2 ===");
            System.out.print("Digite hora:");
            hora2 = Entrada.nextInt();
            System.out.print("Digite minutos:");
            min2 = Entrada.nextInt();
            System.out.print("Digite segundos:");
            seg2 = Entrada.nextInt();
            somaseg = ((hora*60*60)+ (min*60) + seg );
            somaseg2 = ((hora2*60*60)+ (min2*60) + seg2 );
            diferenca = (somaseg - somaseg2);
            if (diferenca<0) {
                diferenca*=-1;
            }
            System.out.println("A Diferença em segundo eh de "+ diferenca);
    }
}
