import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename){
		FileReader inputStream = null;
		String word = "";
		try{
			inputStream = new FileReader(filename);
			int c;
			while((c = inputStream.read()) != -1){
				word += (char)(c);
			}
		}
		catch(IOException e){
			System.out.println(e);
		
		}finally{

			try{
				if(inputStream != null){
					inputStream.close();
				}
			}
			catch(IOException e){
				System.out.println(e);
			}
		}
		return word;
	}
	

	public static String backwardsReadFile(String fileName) {
		BufferedReader reader = null;
		String file = "";

		try {
			reader = new BufferedReader(new FileReader(fileName));
			while (reader.ready()) {
				file = (char) reader.read() + file;
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);

		} catch (IOException e) {
			System.out.println(e);

		} finally {
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		return file;
	}
	}
