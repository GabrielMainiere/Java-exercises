import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Pet p1 = new Pet("Kate", LocalDate.parse("12/06/2009", fmt),"Mixed Breed","Black", 35.0, "Dog");
        Pet p2 = new Pet("Bob", LocalDate.parse("09/10/2010", fmt), "Bulldog", "Black", 22.0, "Dog");
        Pet p3 = new Pet("Pitty", LocalDate.parse("02/03/2007", fmt),"Pitbull", "White", 38.0, "Dog");
        Pet p4 = new Pet("Kelly", LocalDate.parse("08/05/2001", fmt), "Labrador", "Yellow", 36.0, "Dog");
        Pet p5 = new Pet("Peixe", LocalDate.parse("09/11/2008", fmt), "Mixed Breed", "Yellow", 20.0, "Dog");
        Pet p6 = new Pet("Grazi", LocalDate.parse("12/12/2012", fmt), "German Shepherd", "Yellow", 18.0, "Dog");

        Person c1 = new Person("Diana", "Volta Redonda", "(21)97876-1653", "diana@gmail.com", "Female");
        Person c2 = new Person("Louis", "Niteroi", "(21)56437.8690", "louis@gmail.com", "Female");
        Person c3 = new Person("Bruce", "Rio de Janeiro", "(21)56321.3482", "bruce@gmail.com", "Male");
        Person c4 = new Person("Clark", "Buzios", "(21)90453.5438", "clark@gmail.com", "Male");

        Record f1 = new Record(LocalDate.parse("24/02/2010", fmt), p1, c1);
        Record f2 = new Record(LocalDate.parse("20/03/2011", fmt), p2, c2);
        Record f3 = new Record(LocalDate.parse("18/06/2007", fmt), p3, c3);
        Record f4 = new Record(LocalDate.parse("01/09/2002", fmt), p4, c4);

        f1.printDetails();
        System.out.println("");
        f2.printDetails();
        System.out.println("");
        f3.printDetails();
        System.out.println("");
        f4.printDetails();
    }
}
