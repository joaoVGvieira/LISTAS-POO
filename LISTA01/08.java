 import java.util.Arrays;
 import java.util.Scanner;
 class Ordenacao {
    public static void main(String[] args) {
      String texto; 
      Scanner Entrada = new Scanner(System.in);     
      int N =9999;
      int  vet[] = new int[N];
      int i,cont=0;
      for ( i = 0; i < N; i++) {
            texto = Entrada.nextLine();
            texto = texto.toLowerCase();
            if (texto.equals("fim")) {
                  break;
            }
            else{
              vet[i] = Integer.parseInt(texto);
              cont++;
            }
      }
      for ( i = 0; i < cont; i++) {
        for (int j = 0; j < cont; j++) {
          if (vet[i] < vet[j]) {
            int temp = vet[i];
            vet[i] = vet[j];
            vet[j] = temp;
          }
        }
      }
      
      for ( int o = 0; o < cont; o++) {
          System.out.println(vet[o]);
      }

    }
}
