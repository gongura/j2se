package polydrome;

public class Polydrome {

    static void stringPolyndrome(String s) {
        String ini= "" ;

        for(int i= s.length()-1; i >= 0; i--) {
            ini = ini+s.charAt(i);
        }

        if(ini.equals(s)) {
            System.out.println(true);
        } else System.out.println(false);

    }


    public static void main(String[] args) {
        stringPolyndrome("tomot");
    }
}
