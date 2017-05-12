package flyWeight;

import org.junit.Test;

/**
 * Created by huang on 17-5-12.
 */
public class Client {


    @Test
    public void test(){
        FlyWeight flyWeight1 = FlyWeightFactory.getChess("红色");
        FlyWeight flyWeight2 = FlyWeightFactory.getChess("红色");
        System.out.println(flyWeight1 == flyWeight2);
        //添加外部状态
        flyWeight1.display(new Coordinate(3, 4));
    }
}
