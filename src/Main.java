public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age1 = 18;
        int age2 = 16;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age1 + " он не достиг совершеннолетия, нужно немного подождать.");
        }
        if (age2 >= 18) {
            System.out.println("Если возраст человека равен " + age2 + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age2 + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        int temperature1 = 7;
        int temperature2 = 3;
        System.out.println("На улице " + temperature1 + " градусов.");
        if (temperature1 > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }
        System.out.println("На улице " + temperature2 + " градуса.");
        if (temperature2 > 5) {
            System.out.println("Сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку.");
        }

        int speedMax = 70;
        int speedMin = 55;
        System.out.println("Если скорость " + speedMax + " км/ч.");
        if (speedMax > 60) {
            System.out.println("Придется заплатить штраф.");
        } else {
            System.out.println("Можно ездить спокойно.");
        }
        System.out.println("Если скорость " + speedMin + " км/ч.");
        if (speedMin <= 60) {
            System.out.println("Можно ездить спокойно.");
        } else {
            System.out.println("Придется заплатить штраф.");
        }

        int ageForKindergarten = 3;
        int ageForSchool = 14;
        int ageForUniversity = 21;
        int ageForJob = 28;
        System.out.println("Если возраст человека равен " + ageForKindergarten + " года.");
        if (ageForKindergarten >= 2 && ageForKindergarten <= 6) {
            System.out.println("Ему нужно ходить в детский сад.");
        } else {
            System.out.println("Он не может посещать детский сад.");
        }
        System.out.println("Если возраст человека равен " + ageForSchool + " лет.");
        if (ageForSchool >= 7 && ageForSchool <= 17) {
            System.out.println("Ему нужно ходить в школу.");
        } else {
            System.out.println("Он не может посещать школу.");
        }
        System.out.println("Если возраст человека равен " + ageForUniversity + " года.");
        if (ageForUniversity >= 18 && ageForUniversity <= 24) {
            System.out.println("Ему нужно ходить в университет");
        } else {
            System.out.println("Он не может посещать университет");
        }
        System.out.println("Если возраст человека равен " + ageForJob + " лет.");
        if (ageForJob > 24) {
            System.out.println("Ему нужно ходить на работу");
        } else {
            System.out.println("Он не может ходить на работу");
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