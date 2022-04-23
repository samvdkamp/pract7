import java.util.ArrayList;

public class StringProcessor {

    ArrayList<OpmaakProces> processen = new ArrayList<OpmaakProces>();

    public StringProcessor(){

    }

    public String verwerk(String input) {
        String str = input;
        for(OpmaakProces proces : processen) {
            str = proces.maakOp(str);
        }
        return str;
   }

    public void voegProcesToe(OpmaakProces proces){
        processen.add(proces);
    }
}
