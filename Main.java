package yum;

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        // 2. Mengisi array dengan berbagai jenis kue
        daftarKue[0] = new KuePesanan("Brownies", 30000, 1.5);
        daftarKue[1] = new KueJadi("Cupcake", 10000, 6);
        daftarKue[2] = new KuePesanan("Lapis Legit", 50000, 2);
        daftarKue[3] = new KueJadi("Kue Cubit", 5000, 10);
        daftarKue[4] = new KuePesanan("Bolu Gulung", 25000, 1.2);
        daftarKue[5] = new KueJadi("Donat", 7000, 8);
        daftarKue[6] = new KuePesanan("Pisang Bolen", 20000, 1.8);
        daftarKue[7] = new KueJadi("Pie Buah", 12000, 5);
        daftarKue[8] = new KuePesanan("Kue Tart", 80000, 2.5);
        daftarKue[9] = new KueJadi("Kue Lumpur", 6000, 7);
        daftarKue[10] = new KuePesanan("Cheesecake", 45000, 1.7);
        daftarKue[11] = new KueJadi("Pukis", 4000, 10);
        daftarKue[12] = new KuePesanan("Tiramisu", 55000, 1.3);
        daftarKue[13] = new KueJadi("Klepon", 2000, 20);
        daftarKue[14] = new KuePesanan("Kue Lapis", 22000, 2);
        daftarKue[15] = new KueJadi("Serabi", 3000, 15);
        daftarKue[16] = new KuePesanan("Roll Cake", 32000, 1.1);
        daftarKue[17] = new KueJadi("Roti Bakar", 9000, 4);
        daftarKue[18] = new KuePesanan("Lapis Surabaya", 60000, 2.3);
        daftarKue[19] = new KueJadi("Pastel", 5500, 9);

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        Kue kueTermahal = daftarKue[0];

        // 3a. Menampilkan semua kue
        for (Kue kue : daftarKue) {
            System.out.println(kue);
            totalHargaSemua += kue.hitungHarga();

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }

            if (kue.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        // 3b - 3e. Statistik
        System.out.println("\n== Statistik Kue ==");
        System.out.println("Total Harga Semua Kue        : " + totalHargaSemua);
        System.out.println("Total Harga Kue Pesanan      : " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan      : " + totalBeratPesanan);
        System.out.println("Total Harga Kue Jadi         : " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi        : " + totalJumlahJadi);
        System.out.println("Kue dengan Harga Terbesar    :\n" + kueTermahal);
    }
}
