package edu.course.lab01;

public class QuadraticEquation //Объявление класса для решения квадратных уравнений
{
    public static void solve(double a, double b, double c) //Метод, принимающий три вещественных коэффициента (a, b, c)
    {
        if (a == 0) //Проверка старшего коэффициента: если 'a' равно нулю, уравнение линейное, а не квадратное
        {
            System.out.println("Ошибка: Коэффициент 'a' не может быть равен нулю, уравнение не является квадратным.");
            return;
        }

        double discriminant = b * b - 4 * a * c; //Вычисление значения дискриминанта по математической формуле D = b^2 - 4ac

        if (discriminant > 0) //Если дискриминант строго больше нуля (существует два разных корня)
        {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a); //Вычисление первого корня
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a); //Вычисление второго корня
            System.out.println(root1); //Вывод первого корня в консоль
            System.out.println(root2); //Вывод второго корня в консоль
        }
        else if (discriminant == 0) //Если дискриминант в точности равен нулю (существует один корень)
        {
            double root = -b / (2 * a); //Вычисление единственного корня
            System.out.println(root); //Вывод корня в консоль
        }
        else //Если дискриминант меньше нуля
        {
            System.out.println("Вещественных корней нет");
        }
    }
}