package benimProjem.yasTahmini;

import java.util.Scanner;

public class YasTahmini {
    public static void yasTahmini(){
        Scanner scanner = new Scanner(System.in);
        int sayac=0;

        System.out.println("Lutfen sorulara 1 2 3 4 rakamlarindan birini giriniz. Bunlardan birisini girmek zorunludur");
        System.out.println("cocuklugunda unutamadigin yabanci futbolcu kimdi?\n" +
                "1-Johan Cruyff\n" +
                "2-Diego Maradona,Pele\n" +
                "3-Zidane,Ronaldinho,Beckham\n" +
                "4-Messi,Ronaldo");
        int cevap1= scanner.nextInt();
        switch (cevap1) {
            case 1:
                sayac+=8;
                break;
            case 2:
                sayac+=7;
                break;
            case 3:
                sayac+=5;
                break;
            case 4:
                sayac+=4;
                break;
            default:
                System.out.println("yanlis numara girisi");
        }
        System.out.println("Cocuklugunuzda en cok gordugunuz fubolcu kimdi?\n"+
                "1-Metin Oktay,  Lefter Küçükandonyadis\n" +
                "2-Ridvan Dilmen-Metin Ali Feyyaz\n" +
                "3-Hakan Sukur, Sergen Yalcin \n" +
                "4-Arda Turan, hakan calhanoglu");
        int cevap2= scanner.nextInt();
        switch (cevap2) {
            case 1:
                sayac+=8;
                break;
            case 2:
                sayac+=7;
                break;
            case 3:
                sayac+=6;
                break;
            case 4:
                sayac+=5;
                break;
            default:
                System.out.println("yanlis numara girisi");
        }
        System.out.println("Cocuklugunuzda unutamadigniz oyunlar\n" +
                "1-dalya, asprin,\n" +
                "2-Celik comak, korebe, misket\n" +
                "3-Simit, uzun esek, Taso\n" +
                "4- Beyblade");
        int cevap3= scanner.nextInt();
        switch (cevap3) {
            case 1:
                sayac+=8;
                break;
            case 2:
                sayac+=7;
                break;
            case 3:
                sayac+=5;
                break;
            case 4:
                sayac+=4;
                break;
            default:
                System.out.println("yanlis numara girisi");
        }
        System.out.println("Cocuklugunuzda severek izlediginiz cizgi filmler\n" +
                "1-Tommiks\n" +
                "2-Temel Reis, Scobe doo, Mufettsi Gadget\n" +
                "3- Tsubasa, Tom ve jerry, Sirinler\n" +
                "4-Ben 10, Beyblade");
        int cevap4= scanner.nextInt();
        switch (cevap4) {
            case 1:
                sayac+=8;
                break;
            case 2:
                sayac+=7;
                break;
            case 3:
                sayac+=5;
                break;
            case 4:
                sayac+=4;
                break;
            default:
                System.out.println("yanlis numara girisi");
        }
        System.out.println("cocuklugunuzda unutamadiginz yabanci sarkicilar\n" +
                "1-Elves presley, the eagles\n" +
                "2-Abba\n" +
                "3-Madonna, michel jackson\n" +
                "4-Beyonce");
        int cevap5= scanner.nextInt();
        switch (cevap5) {
            case 1:
                sayac+=8;
                break;
            case 2:
                sayac+=7;
                break;
            case 3:
                sayac+=6;
                break;
            case 4:
                sayac+=5;
                break;
            default:
                System.out.println("yanlis numara girisi");
        }
        System.out.println("Cocuklugunuzdan bildiginiz sanatcilar\n" +
                "1-Asik Veysel\n" +
                "2-Neset Ertas, Baris Manco, Cem Karaca\n" +
                "3-Sezen Aksu, Orhan Gencebay, Muslum Gurses\n" +
                "4-Yalin,Hakan Peker, Gokhan Ozen\n");
        int cevap6= scanner.nextInt();
        switch (cevap6) {
            case 1:
                sayac+=8;
                break;
            case 2:
                sayac+=7;
                break;
            case 3:
                sayac+=6;
                break;
            case 4:
                sayac+=5;
                break;
            default:
                System.out.println("yanlis numara girisi");
        }
        System.out.println("tahmini yasiniz ="+ sayac);
    }
}
