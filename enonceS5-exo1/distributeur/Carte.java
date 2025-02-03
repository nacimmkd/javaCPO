package distributeur;

public class Carte {
    private int code_secret;
    private int failed_try;

    public Carte(int code_pin) {
        code_secret=code_pin;
        failed_try=0;
    }

    public boolean is_pin_good(int essai) {
           return (essai==code_secret);
    }
    
    public void failed_code() {
        failed_try++;
    }
    
    public int getfailed_try() {
        return failed_try;
    }
}
