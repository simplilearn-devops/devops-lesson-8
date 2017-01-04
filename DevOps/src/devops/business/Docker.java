package devops.business;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="docker")
public class Docker {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	@Column(name="event_time")
	private Date eventTime ;
	private String severity ;
	private String message ;
	
	public Docker() {
		eventTime = new Date() ;
		severity = "INFO" ;
		message = "None" ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEventTime() {
		return eventTime;
	}

	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Docker [id=" + id + ", eventTime=" + eventTime + ", severity=" + severity + ", message=" + message
				+ "]";
	}
}
