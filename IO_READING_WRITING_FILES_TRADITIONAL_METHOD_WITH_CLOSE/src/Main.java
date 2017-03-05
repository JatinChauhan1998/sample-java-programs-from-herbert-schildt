import java.io.*;

public class Main {

	public static void main(String[] args) {

		int i;
		FileInputStream fin;
		//Confirm that the file name has been specified
		if (args.length != 1) {
			System.out.println("Usage : ShowFile filename");
			return;
		}
		//Attempt to open the File
		try {
			fin = new FileInputStream(args[0]);
		} catch (FileNotFoundException e) {
			System.out.println("File does't exist");
			return;
		}
		
		//At this point the file is open and can be read.
		//Following read characters until EOF is encountered.
		
		try {
			do{
				i=fin.read();
				if(i!=1)System.out.print((char)i);
			}while(i!=-1);
		} catch (IOException e) {
			System.out.println("Error reading file!");
		}
		
		
		//CLose the File
		try{
			fin.close();
		}catch(IOException e){
			System.out.println("Error closing file");
		}

	}

}
