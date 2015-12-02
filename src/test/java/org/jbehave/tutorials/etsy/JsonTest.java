package org.jbehave.tutorials.etsy;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jbehave.tutorials.etsy.model.Content;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by dad on 12/3/15.
 */
public class JsonTest {

    @Test
    public void jacksonObjectWriteTest() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
//        Content input = mapper.readValue(new File("/media/BigDrive/Projects/workspaceM/jbehave/src/test/resources/test.json"), Content.class);
        Path file = Paths.get("/media/BigDrive/Projects/workspaceM/jbehave/src/test/resources/test.json");
        BufferedReader br = Files.newBufferedReader(file, Charset.forName("UTF-8"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null)
            sb.append(line);
        System.out.println("RAW String is: " + sb.toString());

        JsonFactory f = new JsonFactory();
        JsonParser jp = f.createParser(sb.toString());
//        jp.nextToken();
        while (jp.nextToken() == JsonToken.START_OBJECT) {
            Content content = mapper.readValue(jp, Content.class);
            // process
            // after binding, stream points to closing END_OBJECT
            System.out.println("Object is: " + content.toString());
        }
    }
}
