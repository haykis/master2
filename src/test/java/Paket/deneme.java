package Paket;

public class deneme {
    int x=10;
    int y;
    deneme(){
        System.out.println(x*y);
    }
    deneme (int x,int y){
        this ();
        this.x=x;
        this.y=10;
        System.out.println(x*y);
    }
    deneme(int x,int y,int z){
        this(y,z);
        this.x=x;
        this.y=y;
        System.out.println(x*z);
    }
    public static void main(String[] args) {
        deneme dnm=new deneme(3,4,5);
        System.out.println(dnm.x*dnm.y);
    }
}
