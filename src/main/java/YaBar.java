public class YaBar {

    private static String[] getVolumeAndSymbol(String ingridient) {
        String[] res = new String[2];
        String[] split = ingridient.split("\\s");
        for (int i = 0; i < split.length; i++) {
            if (split[i].matches("\\d")) {
                res[0] = split[i];
            } else if (split[i].length() == 1 && split[i].matches("\\D"))
                res[1] = split[2];
        }
        return res;
    }

    private static int getTotalVolume(String[] ingridients) {
        int res = 0;
        for (int i = 0; i < ingridients.length; i++) {
            res += Integer.parseInt(getVolumeAndSymbol(ingridients[i])[0]);
        }
        return res;
    }

    private static int getBottom(String[] emptyGlass) {
        return emptyGlass.length - 2;
    }

    private static int getTop(String[] emptyGlass, String[] ingredients) {
        return getBottom(emptyGlass) - getTotalVolume(ingredients);
    }


    public static String[] getFullGlass(String[] emptyGlass, String[] ingridients) {
        String[] fullGlass = new String[emptyGlass.length];
        int volumeOfOneIngridient = 0;
        String symbol = "";
        int totalVolume = getTotalVolume(ingridients);
        int bottom = getBottom(emptyGlass);
        int top = getTop(emptyGlass, ingridients);

        for (int i = emptyGlass.length - 1; i >= 0; i--) {
            if (i == emptyGlass.length - 1 || i <= top) {
                fullGlass[i] = emptyGlass[i];
            }
        }
        for (int i = 0; i < ingridients.length; i++) {
            String[] volumeAndSymbol = getVolumeAndSymbol(ingridients[i]);
            volumeOfOneIngridient = Integer.parseInt(volumeAndSymbol[0]);
            symbol = volumeAndSymbol[1];
            for (int j = 0; j < volumeOfOneIngridient; j++) {
                for (int k = bottom; k >= bottom - volumeOfOneIngridient; k--) {
                    fullGlass[k] = emptyGlass[k].replaceAll("\\s", symbol);
                }

            }
        }
        return fullGlass;
    }

    public static void main(String[] args) {
//        String[] emptyGlass = {
//                "\\             /",
//                ".|           |.",
//                ".|           |.",
//                "..\\         /..",
//                "...|       |...",
//                "...|       |...",
//                "....\\     /....",
//                ".....\\__/....."
//        };
//
//        String[] ingridients = {
//                "gin 2 %",
//                "tonic 4 *"
//        };
//
//        String[] fullGlass = getFullGlass(emptyGlass, ingridients);
//
//        for (String s : fullGlass) {
//            System.out.println(s);
//        }



    }
}
