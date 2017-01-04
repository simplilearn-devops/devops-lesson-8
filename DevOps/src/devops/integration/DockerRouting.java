package devops.integration;

import org.apache.camel.builder.RouteBuilder;

public final class DockerRouting extends RouteBuilder {
	private final String endPoint ;
	
	public DockerRouting( String endPoint ) {
		this.endPoint = endPoint ;
	}

	@Override
	public void configure() throws Exception {
		from( "docker:events?host=localhost&port=2375&secure=false" )
		.log( "Event ${body}" )
		.to( endPoint ) ;
	}

}
