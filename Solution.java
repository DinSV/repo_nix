
// фйл решебник / справочник JavaRush
/* Создай объект типа Cat (кот), объект типа Dog (собака),
объект типа Fish (рыбка) и объект типа Woman.
Присвой каждому животному владельца (owner).
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        Woman woman = new Woman();// Первым создаем Обьект Владельца Womanб если этого не сделать то код изменится и
       Cat cat = new Cat(); // придется сначала пррописать все обьекты, потом владельца и только потом присвоить питомцев владельцу.
       cat.owner = woman; // только так мы сможем в таком порядке присвоить сразу пораметр .owner
       Dog dog = new Dog();
       dog.owner = woman;
       Fish fish = new Fish();
       fish.owner = woman;
      }
    public static class Cat {
        public Woman owner;
    }
    public static class Dog {
        public Woman owner;
    }
    public static class Fish {
        public Woman owner;
    }
    public static class Woman {
    }
}
//Путь к папке c JDK нужно указать в IDEA в разделе Project SDK. File -> Project Structure -> Project SDK -> Add Jdk
/* 
Делиться полезно
*/

public class Solution {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) { //реализация метода div
        int c = a / b;
        System.out.println(c); //без return - полсле него программа останавливается.
    } // где то тут пора подключать учебники ибо на JavaRush многое  не обьясняется....
}