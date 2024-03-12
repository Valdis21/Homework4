public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        int temperature = 7;
        if (temperature > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }

        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ ч, придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        }

        int agePeople = 17;
        if (agePeople >= 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + " лет, ему нужно ходить в детский сад.");
        } else if (agePeople >= 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + " лет, ему нужно ходить в школу.");
        } else if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + " лет, ему нужно ходить в университет.");
        } else {
            System.out.println("Если возраст человека равен " + agePeople + " лет, ему нужно ходить на работу");
        }

        int ageChildren = 1;
        System.out.println("Если возраст ребенка равен " + ageChildren + " года.");
        if (ageChildren < 5) {
            System.out.println("Нельзя кататься на аттракционе.");
        } else if (ageChildren >= 5 && ageChildren < 14) {
            System.out.println("Можно кататься на аттракционе в сопровождении.");
        } else if (ageChildren >= 14) {
            System.out.println("Можно кататься без сопровождения взрослого.");
        }

        int peopleInTrain = 59;
        int seat = 59;
        if (seat < 60) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (seat >= 60 && peopleInTrain <= 102) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне мест нет");
        }

        int one = 1400;
        int two = 2200;
        int three = 3300;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}
