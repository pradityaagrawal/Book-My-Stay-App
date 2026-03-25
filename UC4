import java.util.ArrayList;
import java.util.List;

// Domain Model: Represents a Room
class Room {
    private String type;
    private int beds;
    private int size;
    private double price;

    public Room(String type, int beds, int size, double price) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
    }

    public String getType() { return type; }
    public int getBeds() { return beds; }
    public int getSize() { return size; }
    public double getPrice() { return price; }
}

// Search Service: Handles read-only inventory access
class SearchService {
    public void displayAvailableRooms(List<Room> rooms, int[] inventory) {
        System.out.println("Room Search\n");
        boolean found = false;

        for (int i = 0; i < rooms.size(); i++) {
            // Validation Logic: Only show rooms with availability > 0
            if (inventory[i] > 0) {
                Room room = rooms.get(i);
                System.out.println(room.getType() + ":");
                System.out.println("Beds: " + room.getBeds());
                System.out.println("Size: " + room.getSize() + " sqft");
                System.out.println("Price per night: " + room.getPrice());
                System.out.println("Available: " + inventory[i]);
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms currently available.");
        }
    }
}

public class UseCase4RoomSearch {
    public static void main(String[] args) {
        // Initialize Room Data
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Single Room", 1, 250, 1500.0));
        rooms.add(new Room("Double Room", 2, 400, 2500.0));
        rooms.add(new Room("Suite Room", 3, 750, 5000.0));

        // Centralized Inventory (State Holder)
        // Index matches the room list index
        int[] inventory = {5, 3, 2}; 

        // Execute Search Service
        SearchService searchService = new SearchService();
        searchService.displayAvailableRooms(rooms, inventory);
    }
}
