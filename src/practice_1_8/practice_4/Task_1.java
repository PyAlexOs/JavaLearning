package practice_1_8.practice_4;

public class Task_1 {
    enum Season {
        SPRING(15),
        SUMMER(25),
        AUTUMN(10),
        WINTER(0);

        private final int averageTemperature;

        Season(int temperature) {
            this.averageTemperature = temperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return switch(this) {
                case WINTER -> "Cold season now";
                case SUMMER -> "Warm season now";
                default -> "Strange season...";
            };
        }

        @Override
        public String toString() {
            return switch (this) {
                case SPRING -> "Spring";
                case SUMMER -> "Summer";
                case AUTUMN -> "Autumn";
                case WINTER -> "Winter";
                default -> "";
            };
        }
    }
    public static void main(String[] args) {
        Season favorite = Season.WINTER;
        System.out.println("My favourite season is " + favorite);
        System.out.println("Average temperature in my favorite season is about " + favorite.getAverageTemperature());
        whatIsLove(Season.AUTUMN);

        for (Season season : Season.values()) {
            System.out.println("Season: " + season);
            System.out.println("Average temperature: " + season.getAverageTemperature());
            System.out.println("Description: " + season.getDescription() + "\n");
        }
    }

    public static void whatIsLove(Season season){
        switch (season) {
            case SPRING -> System.out.println("I love Spring");
            case SUMMER -> System.out.println("I love Summer");
            case AUTUMN -> System.out.println("I love Autumn");
            case WINTER -> System.out.println("I love Winter");
            default -> {
            }
        }
    }
}