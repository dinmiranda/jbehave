package org.jbehave.tutorials.etsy.model;

import java.util.HashMap;

/**
 * Created by dad on 12/3/15.
 */
public class HashContent {
    public final static String[] CONTENT_KEYS = {"assignedTo", "collections", "createDate", "customProperties", "dateformat", "fullUrl", "id", "lastModifiedDate", "location", "name", "premium", "publishedKey", "references", "rootUrl", "section", "sectionRoot", "site", "stage", "type"};
    private HashMap<String,Object> contents;

    public HashMap<String, Object> getContents() {
        return contents;
    }

    public void setContents(HashMap<String, Object> contents) {
        this.contents = contents;
    }
}
