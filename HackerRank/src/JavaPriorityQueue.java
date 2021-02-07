import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private double cgpa;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student student) {
        if (cgpa == student.cgpa) {
            if (name.compareTo(student.name) == 0) {
                return Integer.compare(id, student.id);
            } else return name.compareTo(student.name);
        } else if (cgpa > student.cgpa) return -1;
        else return 1;
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        int n = events.size();
        PriorityQueue<Student> priorityQueue = new PriorityQueue<>();
        for (String str : events) {
            String[] strings;
            strings = str.split("\\s");
            if (strings.length > 1) {
                priorityQueue.add(new Student(strings[1], Double.parseDouble(strings[2]), Integer.parseInt(strings[3])));
            } else priorityQueue.poll();
        }
        while (priorityQueue.size() > 1) {
            System.out.println(priorityQueue.poll().getName());
        }
        return new ArrayList<>(priorityQueue);
    }
}


public class JavaPriorityQueue {

    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }

}
