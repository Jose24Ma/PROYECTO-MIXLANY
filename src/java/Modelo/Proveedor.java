package Modelo;

public class Proveedor {

    int id;
    String nom;
    String pag;
    String dir;
    String tel;

    public Proveedor() {
    }

    public Proveedor(int id, String nom, String pag, String dir, String tel) {
        this.id = id;
        this.nom = nom;
        this.pag = pag;
        this.dir = dir;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPag() {
        return pag;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    
}
