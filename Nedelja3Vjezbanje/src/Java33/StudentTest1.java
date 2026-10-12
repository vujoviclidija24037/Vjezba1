package Java33;

public class StudentTest1 {
    public static void main(String[] args) {
        
        Student s1 = new Student("Marko", "Marković", "12/2024", 10, 9, 10);
        Student s2 = new Student("Ana", "Anić", "15/2024", 8, 9, 7);
        Student s3 = new Student("Jovana", "Jovanović", "21/2024", 10, 10, 9);
        Student s4 = new Student("Petar", "Petrović", "33/2024", 6, 7, 8);

        
        s1.printStudent();
        s2.printStudent();
        s3.printStudent();
        s4.printStudent();

        System.out.println();

        
        Student.printSpisak();
    }
}