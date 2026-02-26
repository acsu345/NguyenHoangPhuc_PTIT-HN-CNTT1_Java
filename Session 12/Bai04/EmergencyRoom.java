package Bai04;
import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> waitingList;

    public EmergencyRoom() {
        waitingList = new LinkedList<>();
    }

    public void patientCheckIn(String name) {
        waitingList.addLast(name);
        System.out.println("Bệnh nhân thường đến: " + name);
    }

    public void emergencyCheckIn(String name) {
        waitingList.addFirst(name);
        System.out.println("Ca cấp cứu nguy kịch: " + name);
    }

    public void treatPatient() {
        if (waitingList.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào.");
            return;
        }

        String name = waitingList.removeFirst();

        System.out.println("Đang khám: " + name);
    }
}