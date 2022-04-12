public class Student {

  private String Name;
  private String Surname;
  private int Age;

  public Student(String name, int age,String surname) {
    Name = name;
    Age = age;
    Surname = surname;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurame() {return Surname;}
  
  public String ToString() {
    return Name + " " + Surname + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", -1,"error");
    return new Student(data[0], Integer.parseInt(data[2]),data[1]);
  }
}