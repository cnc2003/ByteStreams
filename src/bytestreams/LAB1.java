package bytestreams;

public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        redShapeDecorator.draw();
        
        Rectangle Rectangle = new Rectangle();
        RedShapeDecorator redShapeDecoratorr = new RedShapeDecorator(Rectangle);
        redShapeDecoratorr.draw();
    }
}
