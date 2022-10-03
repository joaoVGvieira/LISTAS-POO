import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class Exercicio11{
    public static void main(String[] args){
        
		float conta;
		int idade;
		float peso;
        int qntPacientes = 0;
        int mediaIdadeHomens = 0;
        int qntHomens = 0;
        int numMulheres = 0;
        int idadeEntre18e25 = 0;
        String maisVelho;
        String mulherBaixa;
        
        try{
        
            FileReader fr;
            fr = new FileReader("arquivo.txt");
            BufferedReader bf = new BufferedReader(fr);

            String linha = " ";
                    
            while((linha = bf.readLine()) != null){
				qntPacientes ++;
                String vet[] = linha.split(" ");
				System.out.println(vet[1]);
				if (vet[1].equals("M")) {
					qntHomens+=1;
					idade = Integer. parseInt(vet[3]);
					mediaIdadeHomens+=idade;
				} 
				if (vet[1].equals("F")) {
					conta = Float.parseFloat(vet[4]);
					peso  = Float.parseFloat(vet[2]);
					if (conta >= 1.60 && conta<=1.70 && peso > 70) {
						numMulheres++;
					}
				}
				idade = Integer. parseInt(vet[3]);
				if (idade>= 18 && idade<=25) {
					idadeEntre18e25++;
				}	
            }

        }catch (IOException e){
            System.out.println("Erro na abertura do arquivo!");
        }
        
        System.out.println("Qnt paciente : " + qntPacientes);
        System.out.println("Media idade dos homens " + (mediaIdadeHomens/qntHomens));
        System.out.println("número de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg :" + numMulheres);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25 : "+ idadeEntre18e25);
    }
                   
}