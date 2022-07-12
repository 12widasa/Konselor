package aplikasi.kelompok.konselor.model;

public class Tab {
    private String ID, noTep, nama, keterangan, tanggal;

    public Tab() {
    }

    public Tab(String ID, String noTep, String nama, String keterangan, String tanggal) {
        this.ID = ID;
        this.noTep = noTep;
        this.nama = nama;
        this.keterangan = keterangan;
        this.tanggal = tanggal;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNoTep() {
        return noTep;
    }

    public void setNoTep(String noTep) {
        this.noTep = noTep;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
}
