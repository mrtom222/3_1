public class Student {

  private String Name;
  private String Surname;
  private int Age;
  private int Yyyy;
  private int Mm;
  private int Dd;

  public Student(String name, int age,String surname,int dd,int mm,int yyyy) {
    Name = name;
    Age = age;
    Surname = surname;
    Dd = dd;
    Mm = mm;
    Yyyy = yyyy;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurame() {return Surname;}
  public int GetDD() {return Dd;}
  public int GetMM() {return Mm;}
  public int GetYYYY() {return Yyyy;}
  
  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age)+" "+Integer.toString(Dd)+"-"+Integer.toString(Mm)+"-"+Integer.toString(Yyyy);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", -1,"error",0,0,0);
    String[] date = data[3].split("-");
    return new Student(data[0], Integer.parseInt(data[2]),data[1],Integer.parseInt(date[0]) ,Integer.parseInt(date[1]),Integer.parseInt(date[2]));
  }
}