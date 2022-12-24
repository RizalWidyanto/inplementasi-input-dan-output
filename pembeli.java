public class Pembeli{
    private String nampen;
    private int notelp;

    public String getNampen() {
        return nampen;
    }

    public void setNampen(String nampen) {
        this.nampen = nampen;
    }

    public int getNotelp() {
        return notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }
    public void output(String nampen, int notelp){
        System.out.println("Nama Pembeli : "+nampen);
        System.out.println("No telp pembeli : "+notelp);
    }
}