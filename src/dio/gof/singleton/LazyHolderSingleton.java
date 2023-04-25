package dio.gof.singleton;

public class LazyHolderSingleton {

    private static class Holder {
        private static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return Holder.instance;
    }
}
