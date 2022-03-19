package boasentregas.accesslogs.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.sql.Time;

@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "logs")
@Getter
@Setter
public class AccessLogs {

    private String user;
    private String ip;
    private Date date;
    private Time time;
    private String back;
    private String message;

}
