import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cr = 0;
        double slope = 0;
        int parEingabe = 0;
        int parInsgesamt = 0;
        int schlagEingabe = 0;
        int schlägeGesamt = 0;


        for (int loch = 1; loch <= 18; loch++) {
            String par = "Welches PAR hat das Loch " + loch + "?";
            String text = "Schläge für Loch " + loch + ":";
            System.out.println(par);
            parEingabe = scanner.nextInt();
            parInsgesamt = parInsgesamt + parEingabe;
//            System.out.println(parEingabe);
            System.out.println(text);
            schlagEingabe = scanner.nextInt();
            schlägeGesamt += schlagEingabe;
            isPar(parEingabe, schlagEingabe);
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("PAR: " + parInsgesamt);
        System.out.println("Schläge insgesamt: " + schlägeGesamt);
        System.out.println("Wollen Sie Ihr Handicap berechnen lassen?");
        String eingabe1 = scanner.next();
        if (eingabe1.equals("Ja") || eingabe1.equals("J") || eingabe1.equals("j")) {
            System.out.println("Geben Sie bitte das Slope Rating des Platzes an:");
            slope = scanner.nextInt();
            System.out.println("Geben Sie bitte das Course Rating an:");
            cr = scanner.nextDouble();
            hcpRechner(schlägeGesamt, cr, slope);
        } else {
            System.out.println("Alles klar, danke fürs Spielen! Auf Wiedersehen.");
        }


    }

    public static int isPar(int parEingabe1, int schlagEingabe1) {
        if (parEingabe1 == 3) {
            if (schlagEingabe1 == 3) {
                System.out.println("NICE! PAR!");
            } else if (schlagEingabe1 == 2) {
                System.out.println("FANTASTIC! BIRDIE!");
            } else if (schlagEingabe1 == 1) {
                System.out.println("YOU'RE GOD! HOLE IN ONE!");
            }
        } else if (parEingabe1 == 4) {
            if (schlagEingabe1 == 4) {
                System.out.println("NICE! PAR!");
            } else if (schlagEingabe1 == 3) {
                System.out.println("GOOD! BIRDIE!");
            } else if (schlagEingabe1 == 2) {
                System.out.println("VERY GOOD! EAGLE!");
            } else if (schlagEingabe1 == 1) {
                System.out.println("YOU'RE GOD! HOLE IN ONE!");
            } else {
                schlagEingabe1 = schlagEingabe1 - parEingabe1;
                System.out.println("Du bist " + schlagEingabe1 + " über PAR!");
            }
        } else if (parEingabe1 == 5) {
            if (schlagEingabe1 == 5) {
                System.out.println("NICE! PAR!");
            } else if (schlagEingabe1 == 4) {
                System.out.println("GOOD! BIRDIE!");
            } else if (schlagEingabe1 == 3) {
                System.out.println("VERY GOOD! EAGLE!");
            } else if (schlagEingabe1 == 2) {
                System.out.println("FANTASTIC! ALBATROSS!");
            } else if (schlagEingabe1 == 1) {
                System.out.println("YOU'RE GOD! HOLE IN ONE!");
            } else {
                schlagEingabe1 = schlagEingabe1 - parEingabe1;
                System.out.println("Du bist " + schlagEingabe1 + " über PAR!");
            }
        }
        return schlagEingabe1;
    }


    public static double hcpRechner(int schlägeGesamt1, double cr1, double slope1) {
        double hcp;
        hcp = (schlägeGesamt1 - cr1) * 113 / slope1;
        System.out.println("Ihr neues Handicap: "+hcp);
        return hcp;
    }
}
