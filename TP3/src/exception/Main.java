package exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		
		creerFichier(fileName);
		lireFichier(fileName);
		
	}
	
	
	public static void lireFichier(String fileName) {
		BufferedReader lecture = null;
		try {
			lecture = new BufferedReader(new FileReader(fileName));
			
			System.out.println("Lecture du fichier essai.txt");
			String s = null;
			try {
				s = lecture.readLine();
				while ( s!= null ) {
					System.out.println(s);
					s = lecture.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					lecture.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
		System.out.println("Fin du fichier");
	}
	
	public static void creerFichier(String fileName) {
		BufferedReader lectureClavier = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter ecriture = null;
		try {
			ecriture = new BufferedWriter(new FileWriter(fileName));
			System.out.println("Entrez des lignes ");
			
			String s = "";
			while ( !s.equalsIgnoreCase("stop") ) {
				s = "" ;
				s = lectureClavier.readLine() ;
				if ( !s.equalsIgnoreCase("stop") ) {
					ecriture.write(s);
					ecriture.newLine();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				ecriture.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Fin saisie");
	}
	
	
}
