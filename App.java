public class App {
    public static void main(String[] args) throws Exception {
        // class buku
        Buku buku1 = new Buku ("Ahmad", "algoritma dasar", 50000.0, 2023);
        Buku buku2 = new Buku ("jon","script to easy",70000.0, 2024);
        Buku buku3 = new Buku ("fulan","hidup tanpa riba",120000.0, 2015);
    
        //Jumlah buku yang dibeli
        int jumlahBuku1 = 3;
        int jumlahBuku2 = 3;
        int jumlahBuku3 = 4;

        //menghitung harga total
        Double totalHarga = buku1.hitungHarga(jumlahBuku1) + buku2.hitungHarga(jumlahBuku2) + buku3.hitungHarga(jumlahBuku3);

        //menampilkan hasil
        System.out.println("Buku yang dibeli: ");
        System.out.println("1. Judul: " + buku1.getJudul() + ", Jumlah: " + jumlahBuku1 + ", Harga: " + buku1.hitungHarga(jumlahBuku1));
        System.out.println("2. Judul: " + buku2.getJudul() + ", Jumlah: " + jumlahBuku2 + ", Harga: " + buku2.hitungHarga(jumlahBuku2));
        System.out.println("3. Judul: " + buku3.getJudul() + ", Jumlah: " + jumlahBuku3 + ", Harga: " + buku3.hitungHarga(jumlahBuku3));
        System.out.println("Total Harga: " + totalHarga);
    }
}
