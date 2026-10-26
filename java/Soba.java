package java;

import java.util.InputMismatchException;

public class Soba {
    private int brojSobe;
    private int kvadratura;
    private int brojKreveta;
    private boolean miniBarDaNe;
    private boolean telefonDaNe;
    private boolean tvDaNe;

    
    public static double osnovaZaCijenu;

    
    
    public Soba(int brojSobe, int kvadratura, int brojKreveta,
                boolean miniBarDaNe, boolean telefonDaNe, boolean tvDaNe) {
        setBrojSobe(brojSobe);
        setKvadratura(kvadratura);
        setBrojKreveta(brojKreveta);
        setMiniBarDaNe(miniBarDaNe);
        setTelefonDaNe(telefonDaNe);
        setTvDaNe(tvDaNe);
    }

    
    public int getBrojSobe() { return brojSobe; }
    public int getKvadratura() { return kvadratura; }
    public int getBrojKreveta() { return brojKreveta; }
    public boolean isMiniBarDaNe() { return miniBarDaNe; }
    public boolean isTelefonDaNe() { return telefonDaNe; }
    public boolean isTvDaNe() { return tvDaNe; }

   
    public void setBrojSobe(int brojSobe) {
        if (brojSobe >= 100 && brojSobe <= 999)
            this.brojSobe = brojSobe;
        else
            throw new InputMismatchException("Greška");
    }

    public void setKvadratura(int kvadratura) {
        if (kvadratura > 0)
            this.kvadratura = kvadratura;
        else
            throw new InputMismatchException("Greška");
    }

    public void setBrojKreveta(int brojKreveta) {
        if (brojKreveta > 0)
            this.brojKreveta = brojKreveta;
        else
            throw new InputMismatchException("Greška");
    }

    public void setMiniBarDaNe(boolean miniBarDaNe) { this.miniBarDaNe = miniBarDaNe; }
    public void setTelefonDaNe(boolean telefonDaNe) { this.telefonDaNe = telefonDaNe; }
    public void setTvDaNe(boolean tvDaNe) { this.tvDaNe = tvDaNe; }

    
    public int dajSprat() {
        int sprat = this.brojSobe / 100;   
        return sprat;
    }

   
    public double izracunajCijenuPoDanu() {
        double cijena = osnovaZaCijenu * ((double) this.kvadratura / 10.0 + 3 * this.brojKreveta);
        if (miniBarDaNe == true) cijena += 5;
        if (telefonDaNe) cijena += 5;
        if (tvDaNe) cijena += 5;
        return cijena;
    }

    public String infoOSobi() {
        return toString();
    }

    @Override
    public String toString() {
        return "Soba [brojSobe=" + brojSobe + ", sprat=" + dajSprat()
                + ", kvadratura=" + kvadratura + ", brojKreveta=" + brojKreveta
                + ", miniBarDaNe=" + miniBarDaNe + ", telefonDaNe=" + telefonDaNe
                + ", tvDaNe=" + tvDaNe + "]";
    }
}
