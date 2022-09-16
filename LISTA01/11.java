import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFileLineByLineUsingBufferedReader {

	public static void main(String[] args) {
		BufferedReader reader;
        String vet[], vet2[], vet3[], vet4[], vet5[];
        int N;
        char texte;
		try {
			reader = new BufferedReader(new FileReader(
					"arquivo.txt"));
			String line = reader.readLine();
            vet = line.split(":");
            texte = vet[1].charAt(1);
            N = Character.getNumericValue(texte);
            System.out.println(N);
			while (line != null) {
                line = reader.readLine();
                
            }
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}