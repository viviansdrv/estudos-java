import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class ContadorAtos {

	public ContadorAtos() {
		
	}
	
	private void run() {
		try {
			FileReader fr = new FileReader("dates.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("contador.sh");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("#!/bin/bash\n");
			String line = ""; 
			while ( ( line = br.readLine() ) != null ) { 				
				System.out.println("sudo mysql -u root -pPgepa@2020 < " + line + "-lexpge.sql" );
				System.out.println("sudo mysql -u root -pPgepa@2020 < script.sql >> output.txt" );
				bw.write("sudo mysql -u root -pPgepa@2020 < " + line + "-lexpge.sql\n");
				bw.write("sudo mysql -u root -pPgepa@2020 < script.sql >> output.txt\n");
			}
			bw.close();
			fw.close();
			br.close();
			fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		
		}
		
	}
	
	public static void main(String[] args) {
		ContadorAtos obj = new ContadorAtos();
		obj.run();
	}
}
