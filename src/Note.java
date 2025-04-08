import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Note {
    private String title;
    private String body;
    private final String timestamp;

    public Note(String title, String body){
        this.title = title;
        this.body = body;
        this.timestamp = generateTImeStamp();
    }

    private String generateTImeStamp(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }

    public String getTitle(){
        return title;
    }

    public String getBody(){
        return body;
    }

    public String timeStamp(){
        return timestamp;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString(){
        return "Title: " + title + "\nBody: " + body + "\nCreated at: " + timestamp;
    }
}
