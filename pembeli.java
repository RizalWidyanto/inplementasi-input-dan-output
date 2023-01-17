public class pembeli{
    private String nampem;
    private int notelp;

    public String getNampem() {
        return nampem;
    }

    public void setNampen(String nampen) {
        this.nampem = nampem;
    }

    public int getNotelp() {
        return notelp;
    }

    public void setNotelp(int notelp) {
        this.notelp = notelp;
    }
    public void output(String nampen, int notelp){
        System.out.println("Nama Pembeli : "+nampem);
        System.out.println("No telp pembeli : "+notelp);
    }
}