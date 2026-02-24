package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        // TODO: Add 1 urgent appointment at the beginning
        appointments.add("Appoinment with classmates for studying together on Tuesday at 5pm");
        appointments.add("Appoinment with professor Anton to catch-up with math");
        appointments.add("Appointment with her");
        appointments.addFirst("Appointment with alex");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if(!appointments.isEmpty()){
            appointments.remove();
            System.out.println("The last appointment was removed");
        } else {
            System.out.println("there are no appointments");
        }

    }

    public void showFirstAndLast() {
        // TODO: Print first and last
        if(!appointments.isEmpty()){
            System.out.println("First: " + appointments.peekFirst());
            System.out.println("Last:" + appointments.peekLast());
        }
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        Iterator<String> it = appointments.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
