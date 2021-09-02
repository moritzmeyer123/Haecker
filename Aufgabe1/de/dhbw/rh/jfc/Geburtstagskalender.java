package de.dhbw.rh.jfc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class Geburtstagskalender {

    ArrayList<Person> persons = new ArrayList<Person>();

    public Geburtstagskalender() {

    }

    public boolean fuegeHinzu(Person p) {
        if(!persons.contains(p)){
            persons.add(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean entferne(Person p) {
        if(persons.contains(p)){
            persons.remove(p);
            return true;
        } else {
            return false;
        }
    }

    public Collection<Person> personen() {
        return persons;
    }

    public Person naechsterJubilar(){
        if(!persons.isEmpty()){
            Person jubilar = persons.get(0);
            for(Person p: persons){
                if(p.getDate().compareTo(jubilar.getDate()) < 0){
                    jubilar = p;
                }
            }
            return jubilar;
        } else {
            return null;
        }
    
    }

    @SuppressWarnings("deprecation")
	public Collection<Person> jubilare (int monat, int tag){
        ArrayList<Person> jubilare = new ArrayList<Person>();
        
        for (Person p: persons){
            if(p.getDate().getMonth() == monat && p.getDate().getDate() == tag){
                jubilare.add(p);
            }
        }
        return jubilare;
    }

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Geburtstagskalender kalender = new Geburtstagskalender();
		System.out.println("Eingabe: ");
		String in = "";
		while (!in.equals("ENDE")) {
			in = scanner.nextLine();
			if (in.equals("ADD")) {
				System.out.println("Nachname: ");
                String nachname = scanner.nextLine();
                System.out.println("Vorname: ");
                String vorname = scanner.nextLine();
                System.out.println("Datum [YEAR:MONTH:DATE] ");
                String dateIn = scanner.nextLine();
                String[] dateString = dateIn.split(":");
                Date date = new Date(Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1])-1, Integer.parseInt(dateString[2]));
				kalender.fuegeHinzu(new Person(nachname, vorname, date));
			} else if (in.equals("DEL")) {
				System.out.println("Nachname: ");
                String nachname = scanner.nextLine();
                System.out.println("Vorname: ");
                String vorname = scanner.nextLine();
                System.out.println("Datum [YEAR.MONTH:DATE] ");
                String dateIn = scanner.nextLine();
                String[] dateString = dateIn.split(".");
                Date date = new Date(Integer.parseInt(dateString[0]), Integer.parseInt(dateString[1]), Integer.parseInt(dateString[2]));
				kalender.entferne(new Person(nachname, vorname, date));
			} else if (in.equals("PRINT")) {
                kalender.personen();
            } else if (in.equals("NXT")) {
                Person jubilar = kalender.naechsterJubilar();
                System.out.println(jubilar.getNachname() + " " + jubilar.getVorname() + " " + jubilar.getDate());
            } else if (in.equals("JUB")) {
                System.out.println("Monat: ");
                int monat = Integer.parseInt(scanner.nextLine());
                System.out.println("Tag: ");
                int tag = Integer.parseInt(scanner.nextLine());
                Collection<Person> jubilare = kalender.jubilare(monat, tag);
                for(Person jubilar: jubilare){
                    System.out.println(jubilar.getNachname() + " " + jubilar.getVorname() + " " + jubilar.getDate());
                }
            }
            else {
				System.out.println("Gültige Eingaben sind: ADD ; DEL ; PRINT; NXT; JUB; ENDE");
			}
            System.out.println("Eingabe: ");
		}

        scanner.close();
    }
}
