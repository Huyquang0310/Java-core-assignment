package Bai_10;

public class HotelRoom {
    String roomNumber;
    String roomType;
    boolean isBooked;

    HotelRoom(String roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isBooked = false;
        System.out.printf("Phòng %s %s: \n", roomType, roomNumber);

    }

    public double getRoomRate() {
        return switch (roomType) {
            case "STANDARD" -> 400000;
            case "DELUXE" -> 700000;
            case "VIP" -> 1200000;
            default -> 0;
        };
    }

    public boolean checkIn() {
        if (isBooked) {
            System.out.printf("- Khách check-in: Thất bại!\n");
            return false;
        } else {
            System.out.printf("- Khách check-in: Thành công!\n");
            return true;
        }
    }

    public void checkOut(int nights) {
        double totalPrice = nights * getRoomRate();
        this.isBooked = false;
        System.out.printf("- Khách ở %d đêm, check-out: Tổng tiền = %,.0f VND\n", nights, totalPrice);
        System.out.printf("- Phòng trả về trạng thái TRỐNG.\n");

    }


}
