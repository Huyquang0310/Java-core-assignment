package Bai_2;

public class StringAdvanced {

    public static void main(String[] args) {
        String email = "nguyen.van.a@tayjava.vn";

        // 1
        if (email.contains("@tayjava")) {
            System.out.println("Email có chứa @tay.java");

        } else {
            System.out.println("Email không chứa @tay.java");
        }

        // 2
        System.out.println("Vị trí đầu tiên xuất hiện ký tự @: " + email.indexOf("@"));

        // 3
        System.out.println(email.substring(0, email.indexOf("@")));
        System.out.println(email.substring(email.indexOf("@") + 1, email.length() - 1));

        // 4
        System.out.println(email.replace(".vn", ".com"));

        // 5
        String username = email.substring(0, email.indexOf("@"));
        String [] parts = username.split("\\.");
        for (String result : parts) {
            System.out.println(result);
        }

        // 6
        String otherEmail = "NGUYEN.VAN.A@TAYJAVA.VN";
        if (email.equalsIgnoreCase(otherEmail)) {
            System.out.println("Same");

        } else {
            System.out.println("Different");
        }

    }
}
