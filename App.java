import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Polymorphism
        Member memberRg = new MemberReguler();
        Member memberSv = new MemberSilver();
        Member memberGl = new MemberGold();

        // Member Reguler
        System.out.print("Masukkan total belanja Member Reguler: Rp.");
        int belanjaRg = scanner.nextInt();
        int totalBayarRg = memberRg.hitungTotalBayar(belanjaRg);
        System.out.println("Total bayar Member Reguler: Rp. " + totalBayarRg);

        // Member Silver
        System.out.print("Masukkan total belanja Member Silver: Rp.");
        int belanjaSv = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Silver: ");
        int jarakSv = scanner.nextInt();
        int totalBayarSv = memberSv.hitungTotalBayar(belanjaSv);
        double jarakTujuanSv = ((MemberSilver) memberSv).hitungOngkir((double) jarakSv); // Convert int to Double
        System.out.println("Total bayar Member Silver: Rp. " + totalBayarSv);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuanSv);


        // Member Gold
        System.out.print("Masukkan total belanja Member Gold: ");
        int belanjaGl = scanner.nextInt();
        System.out.print("Masukkan jarak tujuan Member Gold: ");
        int jarakGl = scanner.nextInt();
        int totalBayarGl = memberGl.hitungTotalBayar(belanjaGl);
        double jarakTujuanGl = ((MemberGold) memberGl).hitungOngkir((double) jarakGl); // Convert int to Double
        double cicilanGl = totalBayarGl / 12;
        System.out.println("Total bayar Member Gold: Rp." + totalBayarGl);
        System.out.println("Biaya Pengiriman: Rp. " + jarakTujuanGl);
        System.out.println("Cicilan Per Bulan: Rp. " + cicilanGl + "/bulan");


        scanner.close();
    }
}
