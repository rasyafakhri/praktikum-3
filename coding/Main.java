public class Main {
    public static void main(String[] args) { 

        // Membuat objek Anton dari class Person
        Person anton = new Person();

        // Mengatur dan menampilkan atribut Anton menggunakan setter dan getter
        anton.setNama("Anton");
        anton.setJenisKelamin("Laki-laki");
        anton.setUmur(19);
        System.out.println("Nama: " + anton.getNama());
        System.out.println("Jenis Kelamin: " + anton.getJenisKelamin());
        System.out.println("Umur: " + anton.getUmur());

        // Membuat objek Riko dari class Person
        Person riko = new Person();
        
        // Mengatur dan Menampilkan atribut Riko menggunakan setter dan getter
        riko.setNama("Riko");
        riko.setJenisKelamin("Laki-laki");
        riko.setUmur(25);
        System.out.println("\nNama: " + riko.getNama());
        System.out.println("Jenis Kelamin: " + riko.getJenisKelamin());
        System.out.println("Umur: " + riko.getUmur());
    }
}