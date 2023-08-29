public class Main {
    public static void main(String[] args) {

        var dogWeight = 8.0;
        var catWeight = 3.6;
        var perWeightpa = 763789;

        System.out.println("Собака " + dogWeight + " кошка " + catWeight + " бумага " + perWeightpa);

        dogWeight = dogWeight + 4;
        catWeight = catWeight + 4;
        perWeightpa = perWeightpa + 4;

        System.out.println("Собака " + dogWeight + " кошка " + catWeight + " бумага " + perWeightpa);

        dogWeight = dogWeight - 3.5;
        catWeight = catWeight - 1.6;
        perWeightpa = perWeightpa - 7639;

        System.out.println("Собака " + dogWeight + " кошка " + catWeight + " бумага " + perWeightpa);

        var friend = 19;

        System.out.println("друг " + friend);

        friend = friend + 2;

        System.out.println("друг " + friend);

        friend = friend / 7;

        System.out.println("друг " + friend);

        var frog = 3.5;

        System.out.println("лягушка " + frog);

        frog = frog * 10;
        System.out.println("лягушка " + frog);

        frog = frog / 3.5;

        System.out.println("лягушка " + frog);

        frog = frog + 4;

        System.out.println("лягушка " + frog);

        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var result = 78.2 + 82.7;
        System.out.println("общая масса боксеров " + result +"кг");

        var liftingCapacity = 160.9;

        result = 82.7 - 78.2;

        System.out.println("разница в массе боксеров " + result +"кг");

        var leftWeight = boxerTwo - boxerOne;
        System.out.println("разница в массе между боксеров " + leftWeight +" кг");

        var overload = (boxerTwo - boxerOne) % liftingCapacity;
        System.out.println("перегрузка в массе боксеров на " + overload +" кг");

        var time = 640;
        var human = time / 8;

        System.out.println("работает " + human +" человек");
        human = human + 94;
        leftWeight = time / human;
        System.out.println("Если в компании работает " + human + " человека, то всего " + leftWeight + " часа работы может быть поделено между сотрудниками");
    }
    }
