
package no2week12;
public class Cafe {
    public static String lokasi = "Jakarta";  
    private String nama;                       

    public Cafe(String nama) {
        this.nama = nama;
    }

    public void bukaCafe() {
        System.out.println(nama + " di " + lokasi + " sudah buka!");
    }

    public String infoCafe() {
        return "Cafe '" + nama + "' @ " + lokasi;
    }

    public String getNama() { return nama; }
}
