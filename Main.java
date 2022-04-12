import java.io.IOException;
import java.util.Scanner;

class Main {

  public static Scanner sca;
  
  public static void main(String[] args) {
    sca = new Scanner(System.in);
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20,"Brzenczyszczykiewicz"));
      s.addStudent(new Student("Janusz", 40,"Cebula"));
      while(true){
        int men = sca.nextInt();
        switch (men) {
          case 2 :
            var students = s.getStudents();
            for(Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 2 :
            System.out.println("podaj imie");
            String im = sca.nextLine();
            System.out.println("podaj nazwisko");
            String naz = sca.nextLine();
            System.out.println("podaj wiek");
            int wiek = sca.nextInt();
            s.addStudent(new Student(im,wiek,naz));
            System.out.println("dodano studenta powrot do menu");
            break;
          default:
            break;
        }
      }
    } catch (IOException e) {

    }
  }
}