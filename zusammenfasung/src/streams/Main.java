package streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		writeBytes();
		readBytes();
		//writeFile();
		//readFile();
		//bufferedWriteBytes();
		//bufferedReadBytes();
		
		
	}

	
	public static void writeBytes() {
		try (FileOutputStream fos = new FileOutputStream("test.txt", true)){
			String text = "@ÖÄÜ?ß";
			//String text = "hallo";
			char[] c = text.toCharArray();
			for(char b: c) {
				fos.write((int)b);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void writeBytesfinally() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("test.txt", true);
			String text = "@ÖÄÜ?ß";
			//String text = "hallo";
			char[] c = text.toCharArray();
			for(char b: c) {
				fos.write((int)b);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void readBytes() {
		StringBuilder sb = new StringBuilder();
		try (FileInputStream fis = new FileInputStream("test.txt")) {
			int b;
			while((b = fis.read())!= -1) {
				sb.append((char) b);
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(sb.toString());
	}
	
	public static void bufferedWriteBytes() {
		try(FileOutputStream fos = new FileOutputStream("test3.txt");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			String s = "hallowelt";
			char[] c = s.toCharArray();
			for(int b: c) {
				bos.write(b);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void bufferedReadBytes() {
		String s = "";
		try(FileInputStream fis = new FileInputStream("test3.txt");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			int ch;
			while((ch = bis.read()) != -1) {
				s += (char) ch;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(s);
	}
	
	public static void writeFile() {
		try(FileWriter fw = new FileWriter("test2.txt")) {
			fw.write("hallo");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public static void readFile() {
		String s = "";
		try(FileReader fr = new FileReader("test2.txt")) {
			int ch;
			while ((ch = fr.read()) != -1) {
				s += (char) ch;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(s);
	}
	
	
}
