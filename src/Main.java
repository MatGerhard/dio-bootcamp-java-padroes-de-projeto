import dio.gof.facade.Facade;
import dio.gof.singleton.EagerSingleton;
import dio.gof.singleton.LazyHolderSingleton;
import dio.gof.singleton.LazySingleton;
import dio.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy);
        lazy = LazySingleton.getInstance();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstance();
        System.out.println(eager);
        eager = EagerSingleton.getInstance();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstance();
        System.out.println(lazyHolder);

        //Strategy
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior agressive = new AgressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.setBehavior(agressive);
        robot.move();

        //Facade
        Facade facade = new Facade();
        facade.migrateClient("Nome Teste", "01234567");
    }
}