package Java_2.Lesson_1.HomeWork_1;

public class RunningTrack implements Block {

    int length;

    public RunningTrack(int length) {
        this.length = length;
    }

    public boolean run(int maxLength) {
        return (maxLength >= length);
    }

    public boolean jump(int maxHeight) {
        return false;
    }

    public String toString() {
        return "беговую дорожку длинной " + length;
    }
}
