import java.util.ArrayList;

public class StringProcessor {

    ArrayList<Object> processen = new ArrayList<Object>();

    public StringProcessor(){

    }

    public String verwerk(String input) {
        String str = input;
        for(Object proces : processen) {
            str = ((OpmaakProces) proces).maakOp(str);
        }
        return str;
   }

    public void voegProcesToe(Object proces){
        processen.add(proces);
    }
}
