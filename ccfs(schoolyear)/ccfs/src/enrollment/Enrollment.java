package enrollment;

public class Enrollment {
    
    String info[];

    public Enrollment(String[] info) {
       this.info = info;
    }
    
    public String[] studInfo() {
        return this.info;
    }
}