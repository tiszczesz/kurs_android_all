public class MyFirst {
    private int limit;
    public MyFirst(int limit) {
        setLimit(limit);
    }
    public void setLimit(int limit){
        this.limit = limit>=0 ?limit: -limit;
    }
    public void getNumbers(){
        System.out.println("Pętla for:");
        for(int i=0;i<limit;i++){
            System.out.println(i);
        }
        System.out.println("Pętla while");
        int i=0;
        while(i<limit){
            System.out.println(++i);
        }
    }
}