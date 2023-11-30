// Enum declaration
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample {
    public static void main(String[] args) {
        // Using enum constants
        Day today = Day.WEDNESDAY;

        // Switch statement with enum
        switch (today) {
            case MONDAY:
                System.out.println("It's the start of the week!");
                break;
            case WEDNESDAY:
                System.out.println("It's the middle of the week!");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend!");
                break;
            default:
                System.out.println("Enjoy the day!");
        }

        // Iterating over enum values
        System.out.println("Days of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}

