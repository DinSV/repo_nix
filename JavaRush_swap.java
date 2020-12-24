public class JavaRush_swap {  // primitives
  public static void main(String[] args)
  {
    Student olga = new Student();
    olga.name = "Olga";
    olga.age = 21;

    Student vera = new Student();
    vera.name = "Veronika";
    vera.age = 15;

    System.out.println("Olga is " + olga.age);
    System.out.println("Vera is " + vera.age);

    ageSwap(olga, vera); /* строка аналогична "Student a = olga, b = vera;" +если пишем Swap то придется дописывать еще класс обмена студентов
    private static void ageSwap(Student a, Student b) и уже в нем прописываем обмен переменными, пока не потяно нах оно такое веселое все
    в варианте с "Student a = olga, b = vera" не надо придумывать новый класс */
    System.out.println("Olga is " + olga.age);
    System.out.println("Vera is " + vera.age);
  }

  private static void ageSwap(Student a, Student b)
  {
    int c = a.age;
    a.age = b.age;
    b.age = c;
  }

  static class Student
  {
    String name;
    int age;
  }
}
