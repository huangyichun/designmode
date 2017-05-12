package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类
 */
public class FlyWeightFactory {
    // ThreadPoolExecutor  线程池，相当于享元工厂

    //享元池
    private static Map<String, FlyWeight> map = new HashMap<>();

    public static FlyWeight getChess(String color){
        if(map.get(color) != null)
            return map.get(color);
        else{
            FlyWeight flyWeight = new ConcreteFlyWeight(color);
            map.put(color, flyWeight);
            return flyWeight;
        }
    }
}
