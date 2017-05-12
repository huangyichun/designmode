package flyWeight;

/**
 * Created by huang on 17-5-12.
 */
public class ConcreteFlyWeight implements FlyWeight {

    private String color;

    public ConcreteFlyWeight(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate c) {
        System.out.println("棋子颜色"+color);
        System.out.println("棋子位置"+c.getX() + " "+ c.getY());
    }
}
