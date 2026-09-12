package edu.course.lab01;

public class FizzBuzz
{
    public static void run()
    {
        for (int i = 1; i <= 500; i++) //Цикл, перебирающий целые числа от 1 до 500 включительно
        {
            if (i % 5 == 0 && i % 7 == 0) //Проверка: делится ли текущее число i на 5 И на 7 без остатка
            {
                System.out.println("fizzbuzz"); //Если делится на оба, выводим слово "fizzbuzz"
            }
            else if (i % 5 == 0)
            {
                System.out.println("fizz"); //Если делится только на 5, выводим слово "fizz"
            }
            else if (i % 7 == 0)
            {
                System.out.println("buzz"); //Если делится только на 7, выводим слово "buzz"
            }
            else //Если число не попадает ни под одно из условий выше
            {
                System.out.println(i); //Выводим само текущее число
            }
        }
    }
}