package Java_2.Lesson_1.HomeWork_1;

public class Wall implements Block {

    int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean run(int maxLength) {
        return false;
    }

    public boolean jump(int maxHeight) {
        return (maxHeight >= height);
    }

    public String toString() {
        return "стену высотой " + height;
    }
}
