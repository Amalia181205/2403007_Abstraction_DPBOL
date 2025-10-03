public class Burung extends Hewan implements BisaTerbang {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void suara() {
        System.out.println(nama + " berbunyi: cuit cuit"); 
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang tinggi!"); 
    } 
}