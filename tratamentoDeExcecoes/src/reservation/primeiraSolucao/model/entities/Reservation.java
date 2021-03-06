package reservation.primeiraSolucao.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private int roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(int roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkIn;
    }

    public Date getCheckout() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.SECONDS);
    }

    public void updateDates(Date newCheckin, Date newCheckout) {
        this.checkIn = newCheckin;
        this.checkOut = newCheckout;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "Quarto " + roomNumber +
                ", Checkin " + sdf.format(checkIn) +
                ", Checkout " + sdf.format(checkOut) +
                ", Duration " + duration();
    }
}