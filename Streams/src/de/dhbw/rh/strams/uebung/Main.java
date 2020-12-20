package de.dhbw.rh.strams.uebung;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i < 150; i++) {
			schreibeStringBuffered("Test test test test \n", "text1");
		}

		// kopiereDatei("text1", "text1_kopie");
		teileDatei("text1", "splittet", 1);
		kombiniereDatei("text2", "splittet");
	}

	public static void kopiereDatei(String dateiPfad1, String dateiPfad2) {
		try (FileInputStream fis = new FileInputStream(dateiPfad1);
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fout = new FileOutputStream(dateiPfad2);
				BufferedOutputStream bos = new BufferedOutputStream(fout)) {
			int ch;
			while ((ch = bis.read()) != -1) {
				bos.write(ch);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void teileDatei(String file, String shareFile, int size) {
		int countBytes = 0;
		int sizeK = size * 1024;
		int countParts = 1;
		String fileEnd = ".spt";
		try (FileInputStream fis = new FileInputStream(file); BufferedInputStream bis = new BufferedInputStream(fis)) {
			FileOutputStream fout = new FileOutputStream(shareFile + countParts + fileEnd);
			BufferedOutputStream bos = new BufferedOutputStream(fout);
			int b;
			while ((b = bis.read()) != -1) {
				bos.write(b);
				countBytes++;
				if (countBytes % sizeK == 0) {
					bos.flush();
					countParts++;
					String newFileName = shareFile + countParts + fileEnd;
					System.out.println("Now write in: " + newFileName);
					fout = new FileOutputStream(newFileName);
					bos = new BufferedOutputStream(fout);
				}
			}
			bos.flush();
			fout.close();
			bos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void kombiniereDatei(String newFile, String basisName) {
		int countParts = 1;
		String dateiEndung = ".spt";
		try (FileOutputStream fos = new FileOutputStream(newFile);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			FileInputStream fis = new FileInputStream(basisName + countParts + dateiEndung);
			BufferedInputStream bis = new BufferedInputStream(fis);
			int b = bis.read();

			while (b != -1) {
				bos.write(b);
				if((b = bis.read()) == -1) {
					countParts++;
					fis = new FileInputStream(basisName + countParts + dateiEndung);
					bis = new BufferedInputStream(fis);
					/*if(bis.available() == 0) {
						break;
					} else {
						b = bis.read();
					} */
					b = bis.read();
				}
			}
			
			fis.close();
			bis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Dateien erfolgreich kombiniert.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void schreibeStringBuffered(String s, String dateiPfad) {
		try (FileOutputStream fout = new FileOutputStream(dateiPfad, true);
				BufferedOutputStream bos = new BufferedOutputStream(fout)) {
			byte[] b = s.getBytes();
			bos.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
