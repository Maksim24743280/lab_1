package edu.course.lab01; //Объявление пакета, к которому принадлежит класс

public class Main
{
    public static void main(String[] args)
    {
        if (args.length == 0) //Проверка, были ли переданы аргументы командной строки
        {
            printUsage(); //Если аргументов нет, вызов метода для печати инструкции по использованию
            return;
        }

        String command = args[0]; //Сохранение первого переданного аргумента (имени команды) в переменную

        switch (command) //Оператор выбора для обработки различных команд
        {
            case "fizzbuzz":
                if (args.length != 1) //Проверка, что передана только сама команда без дополнительных аргументов
                {
                    printUsage();
                    return;
                }
                FizzBuzz.run();
                break;

            case "reverse": //Блок обработки команды "reverse"
                if (args.length != 2)
                {
                    printUsage();
                    return;
                }
                TextTasks.reverse(args[1]);
                break;

            case "quadratic":
                if (args.length != 4)
                {
                    printUsage();
                    return;
                }
                try //Начало блока обработки исключительных ситуаций
                {
                    double a = Double.parseDouble(args[1]); //Преобразование строкового аргумента в число 'a'
                    double b = Double.parseDouble(args[2]); //Преобразование строкового аргумента в число 'b'
                    double c = Double.parseDouble(args[3]); //Преобразование строкового аргумента в число 'c'
                    QuadraticEquation.solve(a, b, c); //Вызов метода вычисления корней с полученными числами
                }
                catch (NumberFormatException e) //Перехват ошибки, если переданные аргументы нельзя перевести в числа
                {
                    System.out.println("Ошибка: Коэффициенты должны быть числовыми значениями.");
                }
                break;

            case "series": //Блок обработки команды "series"
                if (args.length != 1) //Проверка, что передана только сама команда без параметров
                {
                    printUsage();
                    return;
                }
                SeriesCalculator.calculate(); //Вызов метода для вычисления суммы ряда
                break;

            case "palindrome": //Блок обработки команды "palindrome"
                if (args.length != 2) //Проверка, что передана команда и одна строка для проверки
                {
                    printUsage();
                    return;
                }
                TextTasks.palindrome(args[1]); //Вызов метода проверки на палиндром с переданной строкой
                break;

            default: //Действие по умолчанию, если передана неизвестная команда
                printUsage();
        }
    }

    private static void printUsage() //Вспомогательный закрытый метод для вывода списка доступных команд
    {
        System.out.println("Использование:");
        System.out.println("fizzbuzz");
        System.out.println("reverse <строка>");
        System.out.println("quadratic <a> <b> <c>");
        System.out.println("series");
        System.out.println("palindrome <строка>");
    }
}