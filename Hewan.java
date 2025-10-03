public abstract class Hewan { // 🌟 PERBAIKAN: Tambahkan 'abstract' di sini
    public String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }
    
    public abstract void suara();

    public void makan() {
        System.out.println(nama + " sedang makan...");
    }
} 