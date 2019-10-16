/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan40warnakepribadian;

/**
 *
 * @author Ilham
 */
public class Kepribadian {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[36m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    private String warna, nama;

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
     public void cek_Kepribadian() {
        warna = warna.toUpperCase();
        nama = nama.toUpperCase();
        System.out.println("\n======HASIL TEST KEPRIBADIAN " + nama + "======");
        switch (warna) {
            case "BIRU" : 
                warnaBiru();
            break;
            case "MERAH":
                warnaMerah();
            break;
            case "KUNING":
                warnaKuning();
            break;
            case "UNGU":
                warnaUngu();
            break;
            case "HIJAU":
                warnaHijau();
            break;
                default:
            System.out.println("Ooopps.. Belum teridentifikasi");
        }
    }

    private void warnaBiru() {
            System.out.println("Warna Favoritmu adalah "+ANSI_BLUE+"BIRU");
            System.out.println("1. Menyenangkan,");
            System.out.println("2. Bijaksana,");
            System.out.println("3. Pembawa diri tenang saat menghadapi masalah,");
            System.out.println("4. Dinamis,");
            System.out.println("5. Senang Berbagi,");
            System.out.println("6. Bersahabat, ");
            System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
            System.out.println("8. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }

    private void warnaMerah() {
            System.out.println("Warna Favoritmu adalah "+ANSI_RED+"MERAH");
            System.out.println("1. Periang,");
            System.out.println("2. Pemberani,");
            System.out.println("3. Berani mengambil risiko dalam setiap langkah,");
            System.out.println("4. Menyukai tantangan,");
            System.out.println("5. Kurang sabar,");
            System.out.println("6. Dapat menahan marah namun jika sudah tahap toleransi, kemarahannya akan sulit dikontrol, ");
            System.out.println("7. Memiliki energi kehangatan dan Cinta,");
    }

    private void warnaKuning() {
            System.out.println("Warna Favoritmu adalah "+ANSI_YELLOW+"MERAH");
            System.out.println("1. Optimis,");
            System.out.println("2. Suka bergaul,");
            System.out.println("3. Periang,");
            System.out.println("4. Senang menolong,");
            System.out.println("5. Lincah dan aktif,");
            System.out.println("6. Tidak suka meremehkan kekurangan orang lain, ");
            System.out.println("7. Loyal,");
            System.out.println("8. Hangat,");
            System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
            System.out.println("10. Cenderung penakut,");
    }

    private void warnaUngu() {
            System.out.println("Warna Favoritmu adalah "+ANSI_PURPLE+"BIRU");
            System.out.println("1. Optimis,");
            System.out.println("2. Tidak pernah ragu,");
            System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
            System.out.println("4. Memiliki ambisi yang besar,");
            System.out.println("5. Memiliki empati yang besar,");
            System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya, ");
            System.out.println("7. Terkadang bersikap keras kepala dan angkuh,");
    }

    private void warnaHijau() {
            System.out.println("Warna Favoritmu adalah "+ANSI_GREEN+"BIRU");
            System.out.println("1. Romantis,");
            System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
            System.out.println("3. Teguh pada prinsip,");
            System.out.println("4. Menginginkan kesempurnaan,");
            System.out.println("5. Mudah cemburu,");
            System.out.println("6. Mudah marasa iri, ");
            System.out.println("7. Menjungjung tinggi suatu nilai toleransi dan kepercayaan,");
    }
    
    
   
}
