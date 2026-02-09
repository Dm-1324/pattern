import java.io.*;

public class Rectangle implements Serializable {


    int length;
    int breadth;
    int area;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("Rectangle1.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Rectangle rect = new Rectangle(7, 6);
            oos.writeObject(rect);
            System.out.println("Rectangle object serialized successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }


        try (FileInputStream fis = new FileInputStream("Rectangle.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Rectangle rectangle = (Rectangle) ois.readObject();

            System.out.println(rectangle.length);
            System.out.println(rectangle.breadth);
            System.out.println(rectangle.area);

        } catch (Exception e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("Rectangle1.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Rectangle rectangle = (Rectangle) ois.readObject();

            System.out.println(rectangle.length);
            System.out.println(rectangle.breadth);
            System.out.println(rectangle.area);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
