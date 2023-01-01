package salman;

import java.util.Scanner;

public class parkir implements jenis{
    @Override
    public void motor() {
        int kendaraan;
        float bayaran;
        double akhir;
        Scanner c = new Scanner(System.in);
        System.out.print("MASUKAN JUMLAH KENDARAAN PARKIR  = ");
        kendaraan = c.nextInt();
        String nama[] = new String[kendaraan];
        String  no[] = new String[kendaraan];
        int harga[] = new int[kendaraan];
        int lama[] = new int[kendaraan];
        int total[] = new int[kendaraan];
        double biaya = 0;
        for (int a = 0; a < kendaraan; a++) {
            System.out.print("NAMA KENDARAAN   = ");
            nama[a] = c.next();
            System.out.print("NO POLISI      = ");
            no[a] = c.next();
            System.out.print("HARGA PARKIR/JAM = ");
            harga[a] = c.nextInt();
            System.out.print("LAMA PARKIR (jam)= ");
            lama[a] = c.nextInt();
            total[a] = harga[a] * lama[a];
            System.out.println("Total Bayar = " + total[a]);
            System.out.println(" ");
            biaya = biaya + total[a];
        }
        System.out.println("---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|         STRUK PEMBAYARAN PARKIR           |");
        System.out.println("|          HANDOYO MALL SUKABUMI            |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        for (int d = 0; d < kendaraan; d++) {
            System.out.println("NAMA KENDARAAN     =  "+nama[d]);
            System.out.println("NOMOR POLISI       =  "+no[d]);
            System.out.println("HARGA PARKIR (JAM) = "+harga[d]);
            System.out.println("LAMA PARKIR        =  (JAM)"+lama[d]);
            System.out.println("TOTAL BAYAR        = "+total[d]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("TOTAL PEMBAYARAN PARKIR  = Rp." + biaya);
        System.out.println("---------------------------------------------");
        System.out.printf("MASUKAN UANG ANDA = ");
        System.out.printf("Rp.= ");bayaran = c.nextFloat();
        akhir = bayaran-biaya;
        System.out.printf("KEMBALIAN ANDA   = "+"Rp."+akhir);
        System.out.println();
    }

    @Override
    public void mobil() {
        int kendaraan;
        float bayaran;
        double akhir;
        Scanner mobil = new Scanner(System.in);
        System.out.print("MASUKAN JUMLAH KENDARAAN PARKIR  = ");
        kendaraan = mobil.nextInt();
        String nama[] = new String[kendaraan];
        String  no[] = new String[kendaraan];
        int harga[] = new int[kendaraan];
        int lama[] = new int[kendaraan];
        int total[] = new int[kendaraan];
        double biaya = 0;
        for (int a = 0; a < kendaraan; a++) {
            System.out.print("NAMA KENDARAAN   = ");
            nama[a] = mobil.next();
            System.out.print("NO POLISI      = ");
            no[a] = mobil.next();
            System.out.print("HARGA PARKIR/JAM = ");
            harga[a] = mobil.nextInt();
            System.out.print("LAMA PARKIR (jam)= ");
            lama[a] = mobil.nextInt();
            total[a] = harga[a] * lama[a];
            System.out.println("Total Bayar = " + total[a]);
            System.out.println(" ");
            biaya = biaya + total[a];
        }
        System.out.println("---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|         STRUK PEMBAYARAN PARKIR           |");
        System.out.println("|          HANDOYO MALL SUKABUMI            |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        for (int d = 0; d < kendaraan; d++) {
            System.out.println("NAMA KENDARAAN     =  "+nama[d]);
            System.out.println("NOMOR POLISI       =  "+no[d]);
            System.out.println("HARGA PARKIR (JAM) = "+harga[d]);
            System.out.println("LAMA PARKIR        =  (JAM)"+lama[d]);
            System.out.println("TOTAL BAYAR        = "+total[d]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("TOTAL PEMBAYARAN PARKIR  = Rp." + biaya);
        System.out.println("---------------------------------------------");
        System.out.printf("MASUKAN UANG ANDA = ");
        System.out.printf("Rp.= ");bayaran =mobil.nextFloat();
        akhir = bayaran-biaya;
        System.out.printf("KEMBALIAN ANDA   = "+"Rp."+akhir);
        System.out.println();
    }

    @Override
    public void bus() {
        int kendaraan;
        float bayaran;
        double akhir;
        Scanner bus = new Scanner(System.in);
        System.out.print("MASUKAN JUMLAH KENDARAAN PARKIR  = ");
        kendaraan =bus.nextInt();
        String nama[] = new String[kendaraan];
        String  no[] = new String[kendaraan];
        int harga[] = new int[kendaraan];
        int lama[] = new int[kendaraan];
        int total[] = new int[kendaraan];
        double biaya = 0;
        for (int a = 0; a < kendaraan; a++) {
            System.out.print("NAMA KENDARAAN   = ");
            nama[a] = bus.next();
            System.out.print("NO POLISI      = ");
            no[a] = bus.next();
            System.out.print("HARGA PARKIR/JAM = ");
            harga[a] = bus.nextInt();
            System.out.print("LAMA PARKIR (jam)= ");
            lama[a] = bus.nextInt();
            total[a] = harga[a] * lama[a];
            System.out.println("Total Bayar = " + total[a]);
            System.out.println(" ");
            biaya = biaya + total[a];
        }
        System.out.println("---------------------------------------------");
        System.out.println("|                                           |");
        System.out.println("|         STRUK PEMBAYARAN PARKIR           |");
        System.out.println("|          HANDOYO MALL SUKABUMI            |");
        System.out.println("|                                           |");
        System.out.println("---------------------------------------------");
        for (int d = 0; d < kendaraan; d++) {
            System.out.println("NAMA KENDARAAN     =  "+nama[d]);
            System.out.println("NOMOR POLISI       =  "+no[d]);
            System.out.println("HARGA PARKIR (JAM) = "+harga[d]);
            System.out.println("LAMA PARKIR        =  (JAM)"+lama[d]);
            System.out.println("TOTAL BAYAR        = "+total[d]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("TOTAL PEMBAYARAN PARKIR  = Rp." + biaya);
        System.out.println("---------------------------------------------");
        System.out.printf("MASUKAN UANG ANDA = ");
        System.out.printf("Rp.= ");bayaran = bus.nextFloat();
        akhir = bayaran-biaya;
        System.out.printf("KEMBALIAN ANDA   = "+"Rp."+akhir);
        System.out.println();
    }
}
