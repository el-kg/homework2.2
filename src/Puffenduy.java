public class Puffenduy extends Hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int powerOfMagic, int transgression, int diligence, int loyalty, int honesty) {
        super(name, powerOfMagic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;

    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Пуффендуй /" + super.toString() + "/ трудолюбие : " + diligence + "/ верность : " + loyalty +
                "/ честность : " + honesty;
    }

    public void compareWith(Puffenduy student) {
        int student1power = this.diligence + this.loyalty + this.honesty;
        int student2power = student.diligence + student.loyalty + student.honesty;
        if (student1power > student2power) {
            System.out.println(this.getName() + "- лучший Пуффендуец, чем " + student.getName());
        } else if (student1power < student2power) {
            System.out.println(student.getName() + "- лучший Пуффендуец, чем " + this.getName());
        } else {
            System.out.println(" Эти студенты Пуффендуя - равны по силе!");
        }
    }
}
