public class Student6 {
  private String name;
  private Club club;

  public Student6(String name, Club club) {
    this.name = name;
    this.club = club;
  }

  public void display() {
    System.out.println("学生：" + name);
    club.display();
  }

  public void practice() {
    club.practice();
  }
}
