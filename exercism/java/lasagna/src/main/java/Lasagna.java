public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int timeElapsed) {
        return expectedMinutesInOven() - timeElapsed;
    }

    public int preparationTimeInMinutes(int layer){
        return layer*2;
    }

    public int totalTimeInMinutes(int layer, int timeElapsed) {
        return preparationTimeInMinutes(layer) + timeElapsed;
    }
}
