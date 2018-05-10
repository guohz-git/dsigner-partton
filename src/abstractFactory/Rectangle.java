package abstractFactory;

/**
 * 矩形实现类
 */
public class Rectangle  implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw");
    }
}
