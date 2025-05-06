package Esercizio1;

public class Controlli{

        public static boolean stringaPariDispari(String s) {
            return s.length() %2 == 0;
        }

    public static boolean annoBisestile (int anno) {
        return (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 ==0));
    }

    public static void main(String[] args) {
        System.out.println("Stringa 'buonasera' è pari? " + stringaPariDispari("buonasera"));
        System.out.println("Stringa 'buongiorno' è pari? " + stringaPariDispari("buongiorno"));


        System.out.println(annoBisestile(2000));
        System.out.println(annoBisestile(1991));
        System.out.println(annoBisestile(2056));
        System.out.println(annoBisestile(1970));
    }
}


