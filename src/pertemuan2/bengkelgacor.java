
package pertemuan2;


public class bengkelgacor {
   //membuat method main
    public static void main(String[] args){
   //membuat objek
   bengkel1 bengkelUtama = new bengkel1();
   //mengisi atribut
   bengkelUtama.namaBengkel="jaya abadi";
   bengkelUtama.alamat="manggis 2";
   bengkelUtama.jumlahMontir=5;
   
   System.out.println("bengkel : "+bengkelUtama.namaBengkel);
   System.out.println("letak wilayah : "+bengkelUtama.alamat);
   System.out.println("karyawan : "+bengkelUtama.jumlahMontir);
   
   bengkel1 bengkelCabang = new bengkel1();
   //mengisi atribut
   bengkelCabang.namaBengkel="jaya abadi2";
   bengkelCabang.alamat="mangga 3";
   bengkelCabang.jumlahMontir=3;
   
   System.out.println("bengkel : "+bengkelCabang.namaBengkel);
   System.out.println("letak wilayah : "+bengkelCabang.alamat);
   System.out.println("karyawan : "+bengkelCabang.jumlahMontir);}
}
