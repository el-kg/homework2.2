public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffindor(String name, int powerOfMagic, int transgression, int nobility, int honor, int courage) {
        super(name, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return "Гриффиндор " + super.toString() + " благородство : " + nobility + " честь : " + honor
                + " храбрость : " + courage;
    }

    public void compareWith(Griffindor student) {
        int student1power = this.nobility + this.honor + this.courage;
        int student2power = student.nobility + student.honor + student.courage;
        if (student1power > student2power) {
            System.out.println(this.getName() + "- лучший Гриффиндорец, чем " + student.getName());
        } else if (student1power<student2power) {
            System.out.println(student.getName() + "- лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("Эти студенты Гриффиндора - равны по силе!");
        }
    }
}
