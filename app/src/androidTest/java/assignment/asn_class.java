package assignment;

public class asn_class {
    int roll;
    String name;
    asn_class(String a,int r){
        this.roll=r;
        this.name=a;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}