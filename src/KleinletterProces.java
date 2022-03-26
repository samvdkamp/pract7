import java.util.Locale;

public class KleinletterProces implements OpmaakProces{

    public KleinletterProces(){}

    public String maakOp(String input){
        String str = input;
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }
}

