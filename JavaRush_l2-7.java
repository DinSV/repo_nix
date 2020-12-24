package javarush_lvl2_les7;
public class JavaRush_l2-7 // Метод вызова функции
{
    public static void main(String[] args)
    {
         print4(“I like to move it, move it.”); // 2. Затем мы вызвали функцию print4 в строке номер 6.
    }      // 3. Когда программа дойдет до выполнения строчки 6, она перескачет на строчку 9 – переменной s будет присвоено значение “I like to move it, move it.”

    public static void print4(String s) // 1. мы написали функцию, которая выводит на экран переданную строку 4 раза.
    {
        System.out.println(s);      // 4. Затем будут выполнены строки 11-14, и, наконец, функция завершится и программа продолжит работу со строчки номер 7.
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}