package org.jbehave.tutorials.etsy;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jbehave.tutorials.etsy.model.Content;
import org.jbehave.tutorials.etsy.model.DVCPage;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;


/**
 * Created by dad on 12/3/15.
 */
public class JsonTest {

    @Test
    public void jacksonObjectWriteTest() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Path file = Paths.get(
                "/media/BigDrive/Projects/workspaceM/jbehave/src/test/resources/org/jbehave/tutorials/etsy/test.json" );
        BufferedReader br = Files.newBufferedReader(file, Charset.forName("UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null)
            sb.append(line);
        System.out.println("RAW String is: " + sb.toString());

        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser(sb.toString());
        while (jp.nextToken() == JsonToken.START_OBJECT) {
            Object content = mapper.readValue( jp, Object.class );
            // process
            // after binding, stream points to closing END_OBJECT
            System.out.println("Object is: " + content.toString());
            System.out.println( "Content is: " + ( ( Map ) content ).get( "Content" ) );
            List content1 = ( List ) ( ( Map ) content ).get( "Content" );
            System.out.println( "Item is: " + content1.get( 0 ) );
        }
    }


    @Test
    public void jacksonNodeTest() throws IOException {
        byte[] jsonData = Files.readAllBytes( Paths.get(
                "/media/BigDrive/Projects/workspaceM/jbehave/src/test/resources/org/jbehave/tutorials/etsy/test.json"
                                                       ) );
        ObjectMapper mapper = new ObjectMapper();
        //create JsonNode
        JsonNode rootNode = mapper.readTree( jsonData );
        System.out.println( "Object is: " + rootNode.toString() );
        JsonNode content = rootNode.path( "Content" );
        System.out.println( "Content is: " + content.toString() );
        System.out.println( "Content type is: " + content.isArray() );
        System.out.println( "Content class is: " + content.getClass() );
        for( int i = 0; i < content.size(); i++ ) {
            System.out.println( "Content class item: " + content.get( i ) );
            Content item = new Content();
            item.setAssignedTo( content.get( i ).path( "assignedTo" ).textValue() );
            System.out.println( "Content class item: " + content.get( i ).path( "collections" ).getClass() );
        }
    }

    @Test
    public void jacksonReadValTest() throws IOException {
        byte[] jsonData = Files.readAllBytes( Paths.get(
                "/media/BigDrive/Projects/workspaceM/jbehave/src/test/resources/org/jbehave/tutorials/etsy/test.json"
                                                       ) );
        ObjectMapper mapper = new ObjectMapper();
        DVCPage content = mapper.readValue( jsonData, DVCPage.class );

        System.out.println( "An item: " + mapper.writeValueAsString( content ) );
        for( Content item : content.Content ) {
            System.out.println( item.getSection() );
            System.out.println( item.getAssignedTo() );
            System.out.println( item.getCollections().get( "Analytics" ) );

        }
    }
}