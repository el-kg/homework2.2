public class Main {
    public static void main(String[] args) {
        Hogwarts potter = new Griffindor("Гарри Поттер ", 9, 8, 7,
                8, 9);
        Hogwarts greyndger = new Griffindor("Гермиона Грейнджер ", 8, 7,
                6, 7, 8);
        Hogwarts wizzle = new Griffindor(" Рон Уизли ", 7, 6, 5, 6, 7);
        Hogwarts malfoy = new Slizerin(" Драко Малфой ", 8, 7, 6, 5,
                6, 7, 8);
        Hogwarts monegue = new Slizerin(" Грэхэм Монтегю ", 7, 6, 5, 4,
                5, 6, 7);
        Hogwarts goyll = new Slizerin(" Грегори Гойл ", 6, 5, 4, 3,
                4, 5, 6);
        Hogwarts smith = new Puffenduy(" Захария Смит ", 8, 6, 7, 6,
                7);
        Hogwarts diggory = new Puffenduy(" Седрик Диггори ", 7, 6, 7, 6,
                7);
        Hogwarts finch = new Puffenduy(" Джастин Финч-Флетчли ", 7, 6, 7, 6,
                5);
        Hogwarts chang = new Kogtevran(" Чжоу Чанг ", 6, 7, 8, 7, 6,
                5);
        Hogwarts patil = new Kogtevran(" Падма Патил ", 6, 6, 4, 7, 8,
                5);
        Hogwarts belby = new Kogtevran(" Маркус Белби ", 8, 7, 7, 7, 6,
                3);


        System.out.println(monegue);
        smith.compareWith(finch);
        belby.compareWith(greyndger);


    }
}