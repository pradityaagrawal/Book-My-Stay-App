    import java.util.LinkedList;
    import java.util.Queue;

    class Reservation {
        private String guestName;
        private String roomType;

        public Reservation(String guestName, String roomType) {
            this.guestName = guestName;
            this.roomType = roomType;
        }

        public String getGuestName() { return guestName; }
        public String getRoomType() { return roomType; }
    }

    class BookingRequestQueue {
        private Queue<Reservation> requestQueue;

        public BookingRequestQueue() { requestQueue = new LinkedList<>(); }

        public void addRequest(Reservation reservation) { requestQueue.offer(reservation); }

        public Reservation getNextRequest() { return requestQueue.poll(); }

        public boolean hasPendingRequests() { return !requestQueue.isEmpty(); }
    }

    public class UseCase5BookingRequestQueue {

        public static void main(String[] args) {

            // Display application header
            System.out.println("Booking Request Queue");

            // Initialize booking queue
            BookingRequestQueue bookingQueue = new BookingRequestQueue();

            // Create booking requests
            Reservation r1 = new Reservation("Anni", "Single");
            Reservation r2 = new Reservation("Sudha", "Double");
            Reservation r3 = new Reservation("Vannathi", "Suite");

            // Add requests to the queue
            bookingQueue.addRequest(r1);
            bookingQueue.addRequest(r2);
            bookingQueue.addRequest(r3);

            // Display queued booking requests in FIFO order
            while (bookingQueue.hasPendingRequests()) {
                Reservation next = bookingQueue.getNextRequest();
                System.out.println("Processing: " + next.getGuestName() + " - " + next.getRoomType());
            }
        }
    }