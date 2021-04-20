package Java_2.Lesson_2.HomeWork_2;

public class MyArrayDataException extends Exception {

    int i;
    int j;

    MyArrayDataException(int i, int j) {

        this.i = i;
        this.j = j;
    }
}
