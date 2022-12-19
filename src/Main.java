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
        System.out.println( );

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
        System.out.println( );




        task4();
        task5();
        task6();
        task7();
        task8();
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
        System.out.println( );
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
        System.out.println( );

    }
    public static void task6() {
        /**
         * Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
         *
         * Вот один из рецептов, по которому спортсмен готовит себе завтрак:
         *
         * Бананы — 5 штук (1 банан — 80 грамм).
         * Молоко — 200 мл (100 мл = 105 грамм).
         * Мороженое-пломбир — 2 брикета по 100 грамм.
         * Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
         * Смешать всё в блендере — и готово.
         *
         * Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
         *
         * Результат в граммах и килограммах напечатайте в консоль.
         */
        System.out.println("Задача 6");

        int bananaWeight = 80;
        int milk100ml = 105;
        int iceCreamWeight = 100;
        int eggsWeight = 70;
        int banana = bananaWeight * 5;
        int milkWeight = milk100ml * 2;
        int iceCream = iceCreamWeight *2;
        int eggs = eggsWeight * 4;
        int breakfastWeigth = banana + milkWeight + iceCream + eggs;
        float breakfastWeigthInKg = breakfastWeigth / 1000;

        System.out.println("Вес завтрака спортсмена " + breakfastWeigth + " грамм" + " и " + breakfastWeigthInKg + " кг");
        System.out.println( );
    }
    public static void task7() {
        /**
         * Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг. Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
         *
         * Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, а сколько — если каждый день будет худеть на 500 грамм.
         *
         * Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
         *
         * Результаты всех подсчетов выведите в консоль.
         */
        System.out.println("Задача 7");

        int slimWeightKg = 7;
        int slimWeightGr = slimWeightKg * 1000;
        int easySlimOneDay = 250;
        int hardSliOneDay = 500;
        int easySlimDays = slimWeightGr / easySlimOneDay;
        int hardSlimDays = slimWeightGr / hardSliOneDay;
        int middleSlimDays = (easySlimDays + hardSlimDays) / 2;

        System.out.println("Для сброса 70 кг необходимо как минимум " + hardSlimDays + " дней, как максимум " + easySlimDays + " дней, и в среднем " + middleSlimDays + " день");
        System.out.println( );

    }
    public static void task8() {
        /**
         * Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
         *
         * К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
         *
         * Маша получает 67 760 рублей в месяц.
         * Денис получает 83 690 рублей в месяц.
         * Кристина получает 76 230 рублей в месяц.
         * Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
         *
         * Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
         *
         * Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
         */
        System.out.println("Задача 8");

        int mashaZp = 67760;
        int denisZp = 83690;
        int christinaZp = 76230;
        int mashaZpInd = mashaZp * 110 / 100;
        int denisZpInd = denisZp * 110 / 100;
        int christinaZpInd = christinaZp * 110 / 100;
        int mashaYearBefore = (mashaZpInd - mashaZp) * 12;
        int denisYearBefore = (denisZpInd - denisZp) * 12;
        int christinaYearBefore = (christinaZpInd - christinaZp) * 12;

        System.out.println("Маша теперь получает " + mashaZpInd + " рублей. Годовой доход вырос на " + mashaYearBefore + " рублей");
        System.out.println("Денис теперь получает " + denisZpInd + " рублей. Годовой доход вырос на " + denisYearBefore + " рублей");
        System.out.println("Кристина теперь получает " + christinaZpInd + " рублей . Годовой доход вырос на " + christinaYearBefore + " рублей");
    }

}
