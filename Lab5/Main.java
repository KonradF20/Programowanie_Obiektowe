import Tasks.Osoba;
import Tasks.Student;

public class Main {
    public static void main(String[] args) {
        Osoba osoba1 = new Osoba("Konrad", "Fugiel", 20);
        Osoba osoba2 = new Osoba("Jan", 18);
        Osoba osoba3 = new Osoba("Filip", "Kowalski", 20);

        osoba1.View();
        osoba2.View();
        osoba3.View();

        Student student1 = new Student(osoba1, 123456, "Informatyka", "Programowanie", 3);
        Student student2 = new Student(123465, "Informatyka", "Systemy", 1);
        Student student3 = new Student(osoba2, 125463, "Informatyka");
        Student student4 = new Student(osoba3, "Informatyka", "IT");

        student1.View();
        student2.View();
        student3.View();
        student4.View();
        student1.ChangeData();
        student1.View();
    }
}