public abstract class Hogwarts {
    private String name;
    private int powerOfMagic;
    private int transgression;
    public Hogwarts(String name,int powerOfMagic,int transgression)
    {
        this.name=name;
       this.powerOfMagic=powerOfMagic;
       this.transgression=transgression;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
       this.name=name;
    }
    public int getPowerOfMagic(){
        return powerOfMagic;
    }
    public void setPowerOfMagic(int powerOfMagic){
        this.powerOfMagic=powerOfMagic;
    }
    public int getTransgression(){
        return transgression;
    }
    public void setTransgression(int transgression){
        this.transgression=transgression;
    }

    @Override
    public String toString() {
        return  name + "/ сила магии : " + powerOfMagic + "/ расстояние трансгрессии : "  + transgression ;
    }
    public void compareWith(Hogwarts student) {
        int student1power = this.powerOfMagic + this.transgression;
        int student2power = student.powerOfMagic + student.transgression;
        if (student1power > student2power) {
            System.out.println(this.getName() + " обладает большей мощностью магии, чем " + student.getName());
        } else if (student1power<student2power) {
            System.out.println(student.getName() + " обладает большей мощностью магии, чем " + this.getName());
        } else {
            System.out.println(" Эти студенты Хогвартса - равны по силе магии!");
        }
    }
}
