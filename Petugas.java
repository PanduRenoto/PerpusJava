package perpus;

import java.util.ArrayList;

/**
 *
 * @author pandu
 */
public class Petugas {
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    
    public Petugas() {
        this.namaKaryawan.add("Ambatron");
        this.alamat.add("Ngawi barat");
        this.telepon.add("098214772");
        
        this.namaKaryawan.add("Ambaruwo");
        this.alamat.add("Kali metro");
        this.telepon.add("0772456927");
    }
    
    public void setNama(String namaPetugas) {
        this.namaKaryawan.add(namaPetugas);
    }
    
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }
    
    public void setTelpon(String telpon) {
        this.telepon.add(telpon);
    }
    
    public String getNama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }
    
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }
    
    public String getTelepon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
}
