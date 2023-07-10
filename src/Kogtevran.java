public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(String name, int powerOfMagic, int transgression, int smart, int wise, int witty, int creativity) {
        super(name, powerOfMagic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;

    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Когтевран /" + super.toString() + "/ ум : " + smart + "/ мудрость : " + wise + "/ остроумие : " + witty + "/ творчество : " + creativity;
    }

    public void compareWith(Kogtevran student) {
        int student1power = this.smart + this.wise + this.witty + this.creativity;
        int student2power = student.smart + student.wise + student.witty + student.creativity;
        if (student1power > student2power) {
            System.out.println(this.getName() + "- лучший Когтевранец, чем " + student.getName());
        } else if (student1power < student2power) {
            System.out.println(student.getName() + "- лучший Когтевранец, чем " + this.getName());
        } else {
            System.out.println(" Эти студенты Когтеврана - равны по силе!");
        }
    }
}
