package boasentregas.accesslogs.api;

import boasentregas.accesslogs.models.AccessLogs;
import boasentregas.accesslogs.service.AccessService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
public class Register {

    @Autowired
    private AccessService accessService;

    public void logAccess(HttpServletRequest request, String user, String back, String message) {
        setterLogs(request, user,  back, message);
    }

    public void logAccess(HttpServletRequest request, String user, String back) {
        setterLogs(request, user, back, "");
    }

    private void setterLogs(HttpServletRequest request, String user, String back, String message) {
        AccessLogs accessLogs = new AccessLogs();

        accessLogs.setIp(request.getRemoteAddr());
        accessLogs.setUser(user);
        accessLogs.setDate(Date.valueOf(LocalDate.now()));
        accessLogs.setTime(Time.valueOf(LocalTime.now()));
        accessLogs.setBack(back);
        accessLogs.setMessage(message);

        accessService.save(accessLogs);
    }

}
