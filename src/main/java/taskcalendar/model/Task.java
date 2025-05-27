package taskcalendar.model;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private LocalDate date;
    private LocalTime time;

    @Enumerated(EnumType.STRING)
    private TaskState state;

    public Task(){
    }

    public Task(long id, String title, LocalDate date, LocalTime time, TaskState state) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.time = time;
        this.state = state;
    }

    // Gettery i settery dla danych
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public TaskState getState() {
        return state;
    }
    public void setState(TaskState state) {
        this.state = state;
    }
}