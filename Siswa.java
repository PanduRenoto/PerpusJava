package perpus;

import java.util.ArrayList;

/**
 *
 * @author pandu
 */
public class Siswa {
    private ArrayList<String> namaSiswa = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    
    public Siswa() {
        this.namaSiswa.add("Joko Pangsit");
        this.alamat.add("Gedangan");
        this.telepon.add("08216667769");
        this.status.add(true);
        
        this.namaSiswa.add("Abah Gunnakam");
        this.alamat.add("Jalan Kelud");
        this.telepon.add("08212345098");
        this.status.add(true);
        
        this.namaSiswa.add("Radit Raceway");
        this.alamat.add("Mendalan");
        this.telepon.add("08999999999");
        this.status.add(true);
    }
    
    public boolean getStatus(int idSiswa) {
        return this.status.get(idSiswa);
    }
    
    public void setStatus(int idSiswa, boolean status) {
        this.status.set(idSiswa, status);
    }
    
    public String getStatusKet(int idSiswa) {
        if(this.status.get(idSiswa)) {
            return "Bisa minjam";
        } else {
            return "Gak bisa lol";
        }
    }
    
    public int getJumlahSiswa() {
        return this.namaSiswa.size();
    }
    
    public void setNama(String siswaNama) {
        this.namaSiswa.add(siswaNama);
    }
    
    public void setAlamat(String Alamat) {
        this.alamat.add(Alamat);
    }
    
    public void setTelpon(String Telpon) {
        this.telepon.add(Telpon);
    }
    
    public String getNama(int idSiswa) {
        return this.namaSiswa.get(idSiswa);
    }
    
    public String getAlamat(int idSiswa) {
        return this.alamat.get(idSiswa);
    }
    
    public String getTelepon(int idSiswa) {
        return this.telepon.get(idSiswa);
    }
    
}
