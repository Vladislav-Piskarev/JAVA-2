package Java_2.Lesson_1.HomeWork_1;

public class Cat implements RunAndWall {

    int maxLength;
    int maxHeight;
    String name;

    public Cat(int maxLength, int maxHeight, String name) {

        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
        this.name = name;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public String toString() {
        return "Кот " + name;
    }
}
