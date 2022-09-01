package Model;

import java.util.concurrent.ThreadLocalRandom;

public class Roll {

    public static int d20() {
        return ThreadLocalRandom.current().nextInt(1,21);
    }

    public static int d12() {
        return ThreadLocalRandom.current().nextInt(1,13);
    }

    public static int d10() {
        return ThreadLocalRandom.current().nextInt(1,11);
    }

    public static int d8() {
        return ThreadLocalRandom.current().nextInt(1,9);
    }

    public static int d6() {
        return ThreadLocalRandom.current().nextInt(1,7);
    }

    public static int d4() {
        return ThreadLocalRandom.current().nextInt(1,5);
    }
}
