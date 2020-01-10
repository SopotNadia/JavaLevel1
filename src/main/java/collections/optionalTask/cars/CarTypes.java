package collections.optionalTask.cars;

public enum CarTypes {
    ALL("All cars of taxi park"), LORRY("Lorries"), MINIVAN("Minivans"), PASSENGER_CAR("Passenger cars");
    String name;

    CarTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
