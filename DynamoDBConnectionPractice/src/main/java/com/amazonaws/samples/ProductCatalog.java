package com.amazonaws.samples;
import java.util.HashSet;
import java.util.Set;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBIgnore;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="ProductCatalogue")
public class ProductCatalog {

	 private Integer id;
	    private String title;
	    private String ISBN;
	    private Set<String> bookAuthors;
	    private String someProp; 
	    
	    @DynamoDBHashKey(attributeName="Id")
	    public Integer getId()
	    {
	    	return id;
	    }
	    public void setId(Integer id)
	    {
	    	this.id = id;
	    }
	    @DynamoDBAttribute(attributeName="Title")  
	    public String getTitle() {return title; }
	    public void setTitle(String title) { this.title = title; }
	    
	    @DynamoDBAttribute(attributeName="ISBN")  
	    public String getISBN() { return ISBN; }
	    public void setISBN(String ISBN) { this.ISBN = ISBN; }
	    
	    @DynamoDBAttribute(attributeName = "Authors")
	    public Set<String> getBookAuthors() { return bookAuthors; }
	    public void setBookAuthors(HashSet<String> hashSet) { this.bookAuthors = hashSet; }
	    
	    @DynamoDBIgnore
	    public String getSomeProp() { return someProp;}
	    public void setSomeProp(String someProp) {this.someProp = someProp;}
	    
}
