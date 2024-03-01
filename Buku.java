public class Buku{
    //property pada objek buku
    private String penulis;
    private String judul;
    private Double harga;
    private int noPenerbit;

    //konsttuktor inisialisasi
    public Buku (String penulis, String judul, Double harga, int noPenerbit){
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.noPenerbit = noPenerbit;
    }

    //method untuk menghitung harga total buku
    public Double hitungHarga(int jumlah){
        return harga * jumlah;
    }

    //method untuk mendapatkan judul buku
    public String getJudul(){
        return judul;
    }

    

}