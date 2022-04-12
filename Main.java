import java.io.IOException;
import java.util.Scanner;

class Main {

  public static Scanner sca;
  
  public static void main(String[] args) {
    sca = new Scanner(System.in);
    try {
      Service1 s = new Service1();
      while(true){
        int men = sca.nextInt();
        switch (men) {
          case 2 :
            var students = s.getStudents();
            for(Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 1 :
            sca.nextLine();
            System.out.println("podaj imie");
            String im = sca.nextLine();
            System.out.println("podaj nazwisko");
            String naz = sca.nextLine();
            System.out.println("podaj wiek");
            int wiek = sca.nextInt();
            System.out.println("podaj dzen urodzenia");
            int d = sca.nextInt();
            System.out.println("podaj miesiac urodzenia");
            int m = sca.nextInt();
            System.out.println("podaj rok urodzenia");
            int r = sca.nextInt();
            s.addStudent(new Student(im,wiek,naz,d,m,r));
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