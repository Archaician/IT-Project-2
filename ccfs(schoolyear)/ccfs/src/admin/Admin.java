package admin;
/**
 *
 * @author Adam
 */
public class Admin {
    
    String acc[];
    //other will be barrowed from another module like enrollment and grading
    
    public Admin(String[] acc) {
        this.acc = acc;
    }
    
    public String[] createAc() {
        return this.acc;
    }
}