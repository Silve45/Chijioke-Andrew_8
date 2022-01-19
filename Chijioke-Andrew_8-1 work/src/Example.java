public class Example {
    public static int x=1;

    public static void main(String[] args) {
        if (Math.random() < 0.5)
            method1();
        else
            method2();
    }//endpsvm
    public static void method1(){
        x = 100;
    }
    public static void method2(){
        x = 200;
    }

}
