package org.jbehave.tutorials.etsy.model;

import java.util.Map;

/**
 * Created by dad on 12/3/15.
 */
public class Content {
    private String assignedTo;
    private Map collections;
    private String createDate;
    private Map customProperties;
    private String dateformat;
    private String fullUrl;
    private int id;
    private String lastModifiedDate;
    private String location;
    private String name;
    private boolean premium;
    private String publishedKey;
    private Map references;
    private String rootUrl;
    private String section;
    private String sectionRoot;
    private String site;
    private String stage;
    private String type;

    public Content() {
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo( String assignedTo ) {
        this.assignedTo = assignedTo;
    }

    public Map getCollections() {
        return collections;
    }

    public void setCollections( Map collections ) {
        this.collections = collections;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate( String createDate ) {
        this.createDate = createDate;
    }

    public Map getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties( Map customProperties ) {
        this.customProperties = customProperties;
    }

    public String getDateformat() {
        return dateformat;
    }

    public void setDateformat( String dateformat ) {
        this.dateformat = dateformat;
    }

    public String getFullUrl() {
        return fullUrl;
    }

    public void setFullUrl( String fullUrl ) {
        this.fullUrl = fullUrl;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate( String lastModifiedDate ) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation( String location ) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium( boolean premium ) {
        this.premium = premium;
    }

    public String getPublishedKey() {
        return publishedKey;
    }

    public void setPublishedKey( String publishedKey ) {
        this.publishedKey = publishedKey;
    }

    public Map getReferences() {
        return references;
    }

    public void setReferences( Map references ) {
        this.references = references;
    }

    public String getRootUrl() {
        return rootUrl;
    }

    public void setRootUrl( String rootUrl ) {
        this.rootUrl = rootUrl;
    }

    public String getSection() {
        return section;
    }

    public void setSection( String section ) {
        this.section = section;
    }

    public String getSectionRoot() {
        return sectionRoot;
    }

    public void setSectionRoot( String sectionRoot ) {
        this.sectionRoot = sectionRoot;
    }

    public String getSite() {
        return site;
    }

    public void setSite( String site ) {
        this.site = site;
    }

    public String getStage() {
        return stage;
    }

    public void setStage( String stage ) {
        this.stage = stage;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }
}
