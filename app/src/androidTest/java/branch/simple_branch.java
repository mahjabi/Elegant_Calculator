package branch;

public class simple_branch {
    String name,id;
    float cgpa;
    simple_branch(String s,String s1, float f){
        this.name=s;
        this.cgpa=f;
        this.id=s1;

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
