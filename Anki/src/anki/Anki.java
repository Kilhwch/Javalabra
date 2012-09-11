///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package anki;
//
//import java.util.Scanner;
//
///**
// *
// * @author Kasper
// */
//public class Anki {
//
//    private Scanner lukija;
//    private Decks deck;
//    private Player player;
//    private Stats stats;
////    private Cards card;
//
//    public Anki() {
//        lukija = new Scanner(System.in);
//        deck = new Decks();
//        player = new Player();
//        stats = new Stats();
//    }
//
//    void start() {
//        System.out.print("Nimi: ");
//        String pelaajanNimi = lukija.nextLine();
//        player.setName(pelaajanNimi);
//
//        while (true) {
//            System.out.println("- - - - - - - - - - -" + "\n"
//                    + "Anki " + "\n"
//                    + "- - - - - - - - - - -");
//            System.out.println("Valitse toiminto: " + "\n"
//                    + "[1] Lisää pakka" + "\n"
//                    + "[2] Aloita kertaus" + "\n"
//                    + "[3] Poistu");
//            String vastaus = lukija.nextLine();
//
//            /********************************************/
//            if ("1".equals(vastaus)) {
//                System.out.print("Anna pakalle nimi: ");
//                String pakanNimi = lukija.nextLine();
//                deck.setDeckName(pakanNimi);
//
//
//                System.out.println("- - - - - - - - - - -" + "\n"
//                        + "Valitse toiminto: " + "\n"
//                        + "[1] Lisää kortteja " + "(" + deck.getDeckName() + ")");
//
//                String vastaus1 = lukija.nextLine();
//
//                if ("1".equals(vastaus1)) {
//                    for (int i = 0; i < 3; i++) {
//                        System.out.println("Anna sana: ");
//                        String korttisana = lukija.nextLine();
//                        System.out.println("Anna käännös: ");
//                        String vastausSana = lukija.nextLine();
//                        Cards kortti = new Cards(korttisana, vastausSana);
//                        deck.add(kortti);
//                        System.out.println("Kortti " + "(" + kortti.getWord()
//                                + " | " + kortti.getTranslation() + ")" + "\n"
//                                + "lisätty pakkaan " + deck.getDeckName());
//                    }
//                }
//            }
//
//            /************** KERTAUSMOODI **************/
//            if ("2".equals(vastaus)) {
//                System.out.println("Anki " + "\n"
//                        + "- - - - - - - - - - -");
//                System.out.println("Kertaus: ");
//
//                for (int i = 0; i < deck.getCount(); i++) {
//                    System.out.println("Arvaa käännös sanalle: " + deck.getNextWord(i).getWord());
//                    String arvaus = lukija.nextLine();
//
//                    if (arvaus == null ? deck.getNextWord(i).getTranslation() == null : arvaus.equals(deck.getNextWord(i).getTranslation())) {
//                        System.out.println("Oikein!");
//                        stats.countToCorrectAnswers();
//                    } else {
//                        System.out.println("Väärin! Oikea käännös olisi ollut " + deck.getNextWord(i).getTranslation());
//                        stats.countToIncorrectAnswers();
//                    }
//
//
//                }
//                System.out.println(stats.getTotalStats());
//
//            }
//
//            if ("3".equals(vastaus)) {
//                System.exit(-1);
//
//            }
//        }
//    }
//}
