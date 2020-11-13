
import java.util.Date;

public class Person implements Comparable<Person>{
    
    private String vorname;
    private String nachname;
    private Date date;

    Person (String vorname, String nachname, Date date){
        this.vorname = vorname;
        this.nachname = nachname;
        this.date = date;
    }

    public String getVorname(){
        return vorname;
    }

    public String getNachname(){
        return nachname;
    }

    public Date getDate(){
        return date;
    }

    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        if (nachname.compareTo(o.getNachname()) != 0){
            return nachname.compareTo(o.getNachname());
        }
        if (vorname.compareTo(o.getVorname()) != 0){
            return vorname.compareTo(o.getVorname());
        }
        return date.compareTo(o.getDate());
    }

    
}
