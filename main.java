package salman;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        parkir a = new parkir();
        Scanner input = new Scanner(System.in);
        int menu;
        do {
        System.out.println("---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|         PROGRAM MANAJEMEN PARKIR          |");
        System.out.println("|          HANDOYO MALL SUKABUMI            |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        System.out.println("1. MOTOR");
        System.out.println("2. MOBIL ");
        System.out.println("3.TRUK/BUS");
            System.out.println("4.KELUAR");
        System.out.println("MASUKAN PILIHAN JENIS KENDARAAN = ");
        menu = input.nextInt();
        if (menu == 1) {
            a.motor();
        } else if (menu == 2) {
            a.mobil();
        } else if (menu == 3) {
            a.bus();
        } else if (menu==4){
            System.out.println("TERIMAKASIH !!!!");
        }else {
            System.out.println("DATA TIDAK VALID !!!");
        }
    } while (menu != 4);

    }
}
