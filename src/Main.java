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

        byte teacherLP = 23;
        System.out.println("У Людмилы Павловны " + teacherLP + " ученика");
        byte teacherAS = 27;
        System.out.println("У Анны Сергеевны " + teacherAS + " ученика");
        byte teacherEA = 30;
        System.out.println("У Екатеины Андреевны " + teacherEA + " ученика");
        short lists = 480;
        int allKid = teacherLP + teacherAS + teacherEA;
        System.out.println("Всего в трёх классах " + allKid + " учеников");
        int task = lists / allKid;
        System.out.println("На каждого ученика рассчитано " + task + " листов бумаги");



    }
}