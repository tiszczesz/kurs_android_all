public class DocSound extends Document implements IPlayable{
    private String codec;
    private double length;
    public DocSound() {
        super();
        codec = "mp3";
        length = 0;
    }
    public DocSound(String name,double size,String codec,double length) {
        super(name,size);
        this.codec = codec;
        this.length = length;
    }
    @Override
    public String toString(){
        return super.toString()+"\n Informacje o pliku dzwiekowym: kodowanie: "
         +codec+" długość nagrania: "+length;
    }
    @Override
    public void PlayDoc() {
        System.out.println("Odtwarzanie muzyki o długości: "+length+" z kodowaniem: "+codec);
    }
}