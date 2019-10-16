/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan40warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program warna kepribadian
 */
public class PBO10118045Latihan40WarnaKepribadian {

    /**
     */
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
    public static void main(String[] args) {
        // TODO code application logic here
        Kepribadian kepribadian = new Kepribadian();
        
        System.out.println(ANSI_RED+"YUK"+ANSI_GREEN+" CEK"+ANSI_YELLOW+" KEPRIBADIAN"+ANSI_CYAN+" DARI"+ANSI_PURPLE+" WARNA"+ANSI_BLUE+" FAVORITMU");
        System.out.println("");
        System.out.println(ANSI_WHITE + ANSI_RED_BACKGROUND + "\tMERAH\t\t");
        System.out.println(ANSI_GREEN_BACKGROUND + "\tHIJAU\t\t");
        System.out.println(ANSI_YELLOW_BACKGROUND + "\tKUNING\t\t");
        System.out.println(ANSI_BLUE_BACKGROUND + "\tBIRU\t\t");
        System.out.println(ANSI_PURPLE_BACKGROUND + "\tUNGU\t\t\n");
        System.out.println("");
        System.out.print(ANSI_RESET + "PILIH WARNA FAVORITMU: ");
        Scanner scanner= new Scanner(System.in);
        kepribadian.setWarna(scanner.next());
        System.out.print("NAMA KAMU: ");
        kepribadian.setNama(scanner.next());
        kepribadian.cek_Kepribadian();
    }
    
}
