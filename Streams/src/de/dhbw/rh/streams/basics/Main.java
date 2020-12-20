package de.dhbw.rh.streams.basics;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//schreibeStringWriter("Ist das hier klausurrelevant??? äöüß", "test.txt");
		//System.out.println(leseReader("test.txt"));
		System.out.println(gibURLInfo());
	}

	public static void schreibeString(String s, String dateiPfad) {
		try (FileOutputStream fout = new FileOutputStream(dateiPfad)) { // Try with ressources schließt den Stream
																		// automatisch

			// byte[] b = s.getBytes();

			// fout.write(b);

			char[] c = s.toCharArray();

			for (int i = 0; i < c.length; i++) {
				fout.write((int) c[i]);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void schreibeStringBuffered(String s, String dateiPfad) {
		try (FileOutputStream fout = new FileOutputStream(dateiPfad);
				BufferedOutputStream bos = new BufferedOutputStream(fout)) {
			byte[] b = s.getBytes();
			bos.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static String leseString(String dateiPfad) {
		StringBuilder builder = new StringBuilder();

		try (FileInputStream fis = new FileInputStream(dateiPfad)) {
			int ch;
			while ((ch = fis.read()) != -1) {
				builder.append((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return builder.toString();
	}

	public static String leseStringBuffered(String dateiPfad) {
		StringBuilder builder = new StringBuilder();

		try (FileInputStream fis = new FileInputStream(dateiPfad);
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			int ch;
			while ((ch = bis.read()) != -1) {
				builder.append((char) ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return builder.toString();
	}

	public static String leseReader(String dateiPfad) {
		StringBuilder builder = new StringBuilder();

		try (FileReader fr = new FileReader(dateiPfad)) {
			int ch;
			while ((ch = fr.read()) != -1) {
				builder.append((char) ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}

	public static void schreibeStringWriter(String s, String dateiPfad) {
		try (FileWriter fw = new FileWriter(dateiPfad)) {
			fw.write(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String gibURLInfo() {
		StringBuilder builder = new StringBuilder();
		
		try {
			URL url = new URL("https://voice.unymira.com/vorlesung");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			InputStream is = conn.getInputStream();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(is));
			
			String s = null;
			while((s =in.readLine()) != null) {
				builder.append(s);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return builder.toString();
		
	}
}
