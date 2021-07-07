package org.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.RouteDefinition;

public class ProxyRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        final RouteDefinition from;
        
        from = from("direct:ProxyRoute");
        
       
        from
          .log("New HOST : \"${headers.HTTP_SCHEME}://\"\n"
          		+ "                + \"${headers.HTTP_HOST}\"\n"
          		+ "                + \"${headers.HTTP_PATH}\"")
          .toD("netty4-http:"
                + "${headers.HTTP_SCHEME}://"
                + "${headers.HTTP_HOST}"
                + "${headers.HTTP_PATH}");
    }
    
    
    
}