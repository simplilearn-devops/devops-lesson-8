package devops.business;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.github.dockerjava.api.model.Event;

public class DockerDataTests {
	private static final Event CREATE_EVENT = new Event( "create", "8100f5fdc9784e78799ecf5a7e8961349d2ce21e655ad7247c4034764ae7e62e", "centos", 1483609742L ) ;
	private DockerData dockerData ;
	
	@Before
	public void setup() {
		dockerData = new DockerData() ;
	}
	
	@Test
	public void dockerCreateContainerEvent() {
		Docker docker = dockerData.processDockerData( CREATE_EVENT ) ;
		System.out.println( docker ) ;
		Assert.assertEquals( "Create", "Container CREATE from centos", docker.getMessage().substring( 0, 28 ) ) ;
	}

}
