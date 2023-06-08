public class UlohaC5 {

    //5. naprogramujte funkciu, ktora na vstupe dostane meno
    // a vrati vam cez RETURN meno + pozdrav

    static String vypisText (String fmeno){
        String vypis = fmeno + "nejaky pozdrav";
        return vypis;
    }

    public static void main(String[] args) {
        String vypisPozdrav = vypisText ("Lucia");
        System.out.println(vypisPozdrav);
    }
}
