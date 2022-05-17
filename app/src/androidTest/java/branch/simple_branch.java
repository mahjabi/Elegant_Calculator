package branch;

public class simple_branch {
    String name,id;
    float cgpa;
    double income;

    public simple_branch(String name, String id, float cgpa, double income) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
