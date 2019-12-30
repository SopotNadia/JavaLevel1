package ErrorExceptions.University;

import java.util.UUID;

public class Entity {
    private String name;
    private UUID id;

    public Entity(String name) {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
