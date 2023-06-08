public class MetodyCvicenia {
        //1. naprogramujte funkciu, ktora na vstupe dostane meno a vek osoby
        // a ak je osoba starsia ako 18 rokov, tak vypise jej meno a ze je dospela,
        // ak to tak nie je, vypise jej meno a to ze je nedospela

        static void menoVek() {
            String fmeno = "Lucia";
            int fvek = 38;
            System.out.println("Moje meno je " + fmeno + " " + "a môj vek je " + fvek);
        }

        static void hodnotenieVeku(String fmeno, int fvek) {
        if (fvek > 18){
            System.out.println("Meno dospelej osoby je " + fmeno);
        }else {
            System.out.println("Meno nedospelej osoby je " + fmeno);
        }
    }

        public static void main(String[] args) {
            menoVek ();
            }
    }

