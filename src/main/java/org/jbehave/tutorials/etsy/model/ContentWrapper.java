package org.jbehave.tutorials.etsy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;

/**
 * Created by dad on 12/3/15.
 */
public class ContentWrapper {
    @JsonProperty( "Content" )
    public Collection<Content> content;
}
