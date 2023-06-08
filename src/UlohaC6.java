public class UlohaC6 {
    // 6. naprogramujte funkciu kalkulacka, ktora dostane na vstupe
    // 2 cisla a znak operacie {+, -, /} a vrati nam vysledok tejto operacie

    static double kalkulacka (double fcislo01, double fcislo02, char fsymbol){
        double vysledok = 0;
        switch (fsymbol){
            case '+':
                vysledok = fcislo01 + fcislo02;
                break;
            case '-':
                vysledok = fcislo01 - fcislo02;
                break;
                case '/':
                        if(fcislo02 != 0){
                            vysledok = fcislo01 / fcislo02;
                        }else {
                            System.out.println("Nulou sa nedeli");
                        }
                }
                return vysledok;
            }

    public static void main(String[] args) {
        static kalkulacka();
    }
}
