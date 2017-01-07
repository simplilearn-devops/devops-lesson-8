package devops.business;

import java.util.Date;

import com.github.dockerjava.api.model.Event;

public class DockerData {
	
	public Docker processDockerData( Event event ) {
		String status = event.getStatus() != null ? event.getStatus().toUpperCase() : "NONE" ;
		return new Docker( new Date( event.getTime() * 1000L )
				, "Container " + status + " from " + event.getFrom() + " id " + event.getId() ) ;
	}
}
