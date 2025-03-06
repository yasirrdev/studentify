package es.fpalanturing.studentify.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//import jakarta.persistence.Entity;


public class Health {

    private String status;
    private String message;
    private String timestamp;

    public Health(String status, String message) {
        this.status = status;
        this.message = message;
        Date now = new Date();
        DateFormat formatter = new SimpleDateFormat();
        this.timestamp = formatter.format(now);
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getMessage() {
        
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
