import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MonoalphaSolver {
	public static void main(String[] args){
		try {
			File puzzle = new File("emilyspuzzle.txt");
			Scanner reader = new Scanner(puzzle);

			String text = "";
			System.out.println("Original Message:");
			while(reader.hasNextLine()){
				String data = reader.nextLine();
				System.out.println(data);
				text += data;
			}

			for(int i = 1;i<=26;i++){
				int key = i;
				String result = "";				

				for(int j = 0;j<text.length();j++){			
					char ch = text.charAt(j);
					int ascii = (int)ch;

					if(ascii == 32){
						result += " ";
						continue;
					}

					ascii += key;

					while(ascii < 97 || ascii > 122){
						ascii -= 26;
					}
					ch = (char)ascii;
					result += "" + ch;
				}
				System.out.println(result);
			}

			reader.close();
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}