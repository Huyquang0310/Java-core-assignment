package Bai_10;

public class Main {
    public static void main(String[] args) {
        HotelRoom room1 = new HotelRoom("301", "VIP");
        //room1.isBooked = true; // giá sử có người khác book mất
        boolean checkIn = room1.checkIn();
        if (checkIn) {
            room1.checkOut(2);
        }

        HotelRoom room2 = new HotelRoom("301", "VIP");
        checkIn = room2.checkIn();
        if (checkIn) {
            room1.checkOut(3);
        }
    }
}
