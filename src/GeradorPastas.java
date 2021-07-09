import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class GeradorPastas {

	public GeradorPastas() {
		
	}
	
	private void run() {
		try {
			FileReader fr = new FileReader("matricula.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("script.sh");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("#!/bin/bash\n");
			String line = ""; 
			while ( ( line = br.readLine() ) != null ) { 
				String[] token = line.split("/");
				System.out.println("mkdir -p " + token[0]);
				bw.write("mkdir -p " + token[0] + "\n");
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
		GeradorPastas obj = new GeradorPastas();
		obj.run();
	}
}
