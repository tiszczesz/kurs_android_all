public class DocImage extends Document implements IPrintable {
    private int width;
    private int height;
    public DocImage() {
        super();
        this.height = 0;
        this.width = 0;    
        System.out.println("Wywołanie konstruktora domyślnego: "+this.getClass().getName());    
    }
    public DocImage(String name,double size,int width,int height) {
        super(name,size);
        this.height = height;
        this.width = width;  
        System.out.println("Wywołanie konstruktora: "+this.getClass().getName());      
    }
    @Override
    public String toString(){
        return super.toString()+"\n Informacje o obrazku: wysokość: "
        +height+" szerokość: "+width;
    }

    @Override
    public void PrintDoc() {
        System.out.println("Drukowanie obrazka");
    }
}