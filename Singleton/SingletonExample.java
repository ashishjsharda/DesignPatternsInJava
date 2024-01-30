public class SingletonExample {

    private static SingletonExample instance=null;

    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        if(instance==null) {
            instance=new SingletonExample();
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello from SingletonExample");
    }

    public static void main(String[] args) {
        SingletonExample singletonExample=SingletonExample.getInstance();
        singletonExample.print();
    }
}
