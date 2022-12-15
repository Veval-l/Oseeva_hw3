public class Main {
    public static void main(String[] args) {
        int cat = 4000;
        System.out.println("Значение переменной кошка с типом int равно " + cat);
        byte dog = 2;
        System.out.println("Значение переменной собака с типом byte равно " + dog);
        short apple = 150;
        System.out.println("Значение переменной яблоко с типом short равно " + apple);
        long flower = 8400000;
        System.out.println("Значение переменной цветок с типом long равно " + flower);
        float owl = 1.5f;
        System.out.println("Значение переменной сова с типом float равно " + owl);
        double cake = 6.00001;
        System.out.println("Значение переменной торт с типом double равно " + cake);

        float sun = 27.12f;
        long moon = 987678965549L;
        float paper = 2.786f;
        short cucumber = 569;
        short tomato = -159;
        short money = 27897;
        byte oil = 67;

        int teacherLP = 23;
        System.out.println("У Людмилы Павловны " + teacherLP + " ученика");
        int teacherAS = 27;
        System.out.println("У Анны Сергеевны " + teacherAS + " ученика");
        int teacherEA = 30;
        System.out.println("У Екатеины Андреевны " + teacherEA + " ученика");
        short lists = 480;
        int allKid = teacherLP + teacherAS + teacherEA;
        System.out.println("Всего в трёх классах " + allKid + " учеников");
        int task = lists / allKid;
        System.out.println("На каждого ученика рассчитано " + task + " листов бумаги");




        task4();
        task5();
    }
    public static void task4() {
        /**
         * Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:
         *
         * за 20 минут,
         * в сутки,
         * за 3 дня,
         * за 1 месяц?
         * Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
         *
         * Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
         *
         * Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача 4");
        int perfomanceMachineinTwoMin = 16;
       int perfomanceMachineinOneMin = perfomanceMachineinTwoMin / 2;
       int perfomanceMachinein20Min = perfomanceMachineinOneMin * 20;
       int perfomanceMachineinOneDay = perfomanceMachineinOneMin * 60 * 24;
       int perfomanceMachinein3Day = perfomanceMachineinOneDay * 3;
       int perfomanceMachineinOneMonth = perfomanceMachineinOneDay * 30;

        System.out.println("За " + " 20 минут машина произвела " + perfomanceMachinein20Min + " штук бутылок");
        System.out.println("За " + " сутки машина произвела " + perfomanceMachineinOneDay + " штук бутылок");
        System.out.println("За " + " за 3 дня машина произвела " + perfomanceMachinein3Day + " штук бутылок");
        System.out.println("За " + " за 1 месяц машина произвела " + perfomanceMachineinOneMonth + " штук бутылок");
    }
    public static void task5() {
        /**
         * На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
         *
         * Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
         *
         * Для объявления переменных не используйте тип var.
         */
        System.out.println("Задача 5");

        int totalColors = 120;
        int whiteColorOnOneClass = 2;
        int BrownColorOnneClass = 4;
        int totalClass = totalColors / (whiteColorOnOneClass + BrownColorOnneClass);
        int lotalWhite = whiteColorOnOneClass * totalClass;
        int totalBrown = BrownColorOnneClass * totalClass;

        String str = String.format("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски", totalClass, lotalWhite, totalBrown);
        System.out.println(str);

    }
}
