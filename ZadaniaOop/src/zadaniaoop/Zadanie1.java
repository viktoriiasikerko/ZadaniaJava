package zadaniaoop;

import zadaniaoop.zadanie1.Student;

public class Zadanie1 {

    public static void main(String[] args) {
Student ela = new Student(546578,"Kowalska","Ela",'k');
Student karol = new Student();
Student aga = new Student(405637, "Ewertowska","Aga", 'k');

karol.setNrIndeksu(456308);
karol.setImie("Karol");
karol.setNazwisko("Adamczyk");
karol.setPlec('m');

        System.out.println(aga.przedstawSie());
        System.out.println(ela.przedstawSie());
        System.out.println(karol.przedstawSie());


    }
}
