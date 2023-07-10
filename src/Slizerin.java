public class Slizerin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slizerin(String name, int powerOfMagic, int transgression, int cunning, int determination,
                    int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Слизерин " + super.toString() + " хитрость : " + cunning + " решительность : " + determination +
                " амбициозность : " + ambition + " находчивость : " + resourcefulness + " жажда власти : " + lustForPower;
    }

    public void compareWith(Slizerin student) {
        int student1power = this.cunning + this.determination + this.ambition + this.resourcefulness + this.lustForPower;
        int student2power = student.cunning + student.determination + student.ambition + student.resourcefulness
                + student.lustForPower;
        if (student1power > student2power) {
            System.out.println(this.getName() + "- лучший Слизеринец, чем " + student.getName());
        } else if (student1power < student2power) {
            System.out.println(student.getName() + "- лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Эти студенты Слизерина - равны по силе!");
        }
    }
}