public class VervangProces implements OpmaakProces {
    String oud;
    String nieuw;

    VervangProces(String o, String n){
        oud = o;
        nieuw = n;
    }

    public String maakOp(String input){
        String str = input;
        return str.replace(oud, nieuw);
    }
}
