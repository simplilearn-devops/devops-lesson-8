package devops.integration;

import org.apache.camel.builder.RouteBuilder;

public final class DockerRouting extends RouteBuilder {
	public static final String DIRECT_ENDPOINT = "direct:docker" ;
	private final String endPoint ;
	
	public DockerRouting( String endPoint ) {
		this.endPoint = endPoint ;
	}

	@Override
	public void configure() throws Exception {
		from( "docker:events?host=192.168.0.38&port=2375&secure=false" )
		.to( "log:devops.integration" )
		.to( endPoint ) ;
		from( DIRECT_ENDPOINT )
		.process( new DockerProcessor() ) ;
	}

}
