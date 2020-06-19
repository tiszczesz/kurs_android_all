import java.util.Random;

public class Tablice {
    private int liczbaInt;
    private float liczbaFloat;
    private double liczbaDouble;
    public static void run(){
        //nie odwoluja sie do pol klasy - statyczne
       int[] liczbyCalkowite = {1,4,6,8,12};
       float[] liczbyFloat = new float[10];
       for(int i=0;i<liczbyCalkowite.length;i++){
           System.out.println(liczbyCalkowite[i]);
       }
       Random rn = new Random();
       for (int i=0;i<liczbyFloat.length;i++) {
           liczbyFloat[i] = rn.nextFloat()*100;
       }
       for (float f : liczbyFloat) {
           System.out.println(f);
       }
       Box[] boxes = new Box[3];
       boxes[0] = new Box(12, "nazwa1");
       boxes[1] = new Box(45, "nazwa2");
       boxes[2] = new Box(56, "nazwa3");
       for (Box box : boxes) {
           System.out.println(box);
       }
    }
    
}
class Box{
    private int liczba;
    private String nazwa;
    public Box(int liczba,String nazwa) {
        this.liczba = liczba;
        this.nazwa = nazwa;
    }
    public int  getLiczba(){
        return liczba;
    }
    public String getNazwa(){
        return nazwa;
    }
    @Override
    public String toString(){
        return "Liczba: "+liczba+"\t Nazwa: "+nazwa;
    }
}