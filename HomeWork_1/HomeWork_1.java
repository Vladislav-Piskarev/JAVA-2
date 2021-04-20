package Java_2.Lesson_1.HomeWork_1;

public class HomeWork_1 {

    public static void main(String[] args) {

        RunAndWall[] members = {

                new Human(20, 50, "Алёша"),
                new Cat(50, 30, "Барсик"),
                new Robot(100,200,"Т-1000")
        };

        Block[] blocks = {

                new RunningTrack(20),
                new Wall(10),
                new RunningTrack(50),
                new Wall(5)
        };

        for (RunAndWall member : members) {
            System.out.println( "Препятствие проходит " + member);
            boolean winner = true;

            for (Block block : blocks) {
                System.out.println(member + " проходит " + block);
                if (block.run(member.getMaxLength()) || block.jump(member.getMaxHeight())) {
                    System.out.println("Пройдено");
                } else {
                    winner = false;
                    System.out.println("Не пройдено");
                    break;
                }
            }

            if (winner) {
                System.out.println(member + " Прошёл дистанцию");
            } else {
                System.out.println(member + " Не прошёл дистанцию");
            }
            System.out.println();
        }
    }
}
