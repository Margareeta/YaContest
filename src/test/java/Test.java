import org.junit.jupiter.api.Assertions;

public class Test {

    @org.junit.jupiter.api.Test
    void ginTonikTest() {
        String[] emptyGlass = {
                "\\             /",
                ".|           |.",
                ".|           |.",
                "..\\         /..",
                "...|       |...",
                "...|       |...",
                "....\\     /....",
                ".....\\__/....."
        };

        String[] ingridients = {
                "gin 2 %",
                "tonic 4 *"
        };

        String[] expected = {
                "\\             /",
                ".|***********|.",
                ".|***********|.",
                "..\\*********/..",
                "...|*******|...",
                "...|%%%%%%%|...",
                "....\\%%%%%/....",
                ".....\\___/....."

        };

        String[] actual = YaBar.getFullGlass(emptyGlass, ingridients);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }

    }

    @org.junit.jupiter.api.Test
    void acidTest() {
        String[] emptyGlass = {
                " .........\\   /.........",
                "........./   \\.........",
                "......../     \\........",
                "......./       \\.......",
                "....../         \\......",
                "...../           \\.....",
                "..../             \\....",
                ".../               \\...",
                "../                 \\..",
                "./___________________\\."
        };
        String[] ingridients = {"acid 5 X"};
        String[] expected = {
                " .........\\   /.........",
                "........./   \\.........",
                "......../     \\........",
                "......./       \\.......",
                "....../XXXXXXXXX\\......",
                "...../XXXXXXXXXXX\\.....",
                "..../XXXXXXXXXXXXX\\....",
                ".../XXXXXXXXXXXXXXX\\...",
                "../XXXXXXXXXXXXXXXXX\\..",
                "./___________________\\."

        };
        String[] actual = YaBar.getFullGlass(emptyGlass, ingridients);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }

    }

    @org.junit.jupiter.api.Test
    void fireTest() {
        String[] emptyGlass = {
                " ...|                    |...",
                "...|                    |...",
                "...|                    |...",
                "...|                    |...",
                "...|                    |...",
                "...|                    |...",
                "....|                  |....",
                "....|                  |....",
                "....|                  |....",
                "....|                  |....",
                "....|                  |....",
                ".....|                |.....",
                ".....|                |.....",
                ".....|                |.....",
                ".....|                |.....",
                "......|______________|......"

        };

        String[] ingridients = {
                "kahlua 4 k",
                "baileys 5 b",
                "cointreau 3 c",
                "fire 1 !"
        };

        String[] expected = {
                "...|                    |...",
                "...|!!!!!!!!!!!!!!!!!!!!|...",
                "...|cccccccccccccccccccc|...",
                "...|cccccccccccccccccccc|...",
                "...|cccccccccccccccccccc|...",
                "....|bbbbbbbbbbbbbbbbbb|....",
                "....|bbbbbbbbbbbbbbbbbb|....",
                "....|bbbbbbbbbbbbbbbbbb|....",
                "....|bbbbbbbbbbbbbbbbbb|....",
                "....|bbbbbbbbbbbbbbbbbb|....",
                ".....|kkkkkkkkkkkkkkkk|.....",
                ".....|kkkkkkkkkkkkkkkk|.....",
                ".....|kkkkkkkkkkkkkkkk|.....",
                ".....|kkkkkkkkkkkkkkkk|.....",
                "......|______________|......"

        };
        String[] actual = YaBar.getFullGlass(emptyGlass, ingridients);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void somethingStrangeTest() {
        String[] emptyGlass = {
                "...|     \\......",
                "...|      /.....",
                "../        /....",
                "...\\        /...",
                "....|        \\..",
                "...../      |...",
                "......\\     /...",
                ".......|   |....",
                "....../     \\...",
                ".......\\_____\\.."
        };
        String[] ingridients = {
                "some 1 (",
                " thing 2 ?",
                " really 3 )",
                "strange 1 ^"
        };

        String[] expected = {
                "...|     \\......",
                "...|      /.....",
                "../^^^^^^^^/....",
                "...\\))))))))/...",
                "....|))))))))\\..",
                "...../))))))|...",
                "......\\?????/...",
                ".......|???|....",
                "....../(((((\\...",
                ".......\\_____\\.."
        };

        String[] actual = YaBar.getFullGlass(emptyGlass, ingridients);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}



