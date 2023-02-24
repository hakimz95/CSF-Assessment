package vttp2022.csf.assessment.server.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextQuery;

import vttp2022.csf.assessment.server.models.Comment;
import vttp2022.csf.assessment.server.models.Restaurant;

public class RestaurantRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	// Task 2
	// Use this method to retrive a list of cuisines from the restaurant collection
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method

	/*
	 * db.restaurants.distinct('cuisine') 
	 */
 
	public List<Restaurant> getCuisines() {
		List<Restaurant> cuisineList = mongoTemplate.findDistinct(new Query(), "cuisine", "restaurants", Restaurant.class);
		return cuisineList;
	}

	// TODO Task 3
	// Use this method to retrieve all restaurants for a particular cuisine
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	
	/*
	 * db.restaurants.find(
			{
				cuisine:{$regex: "American"}
			},
			{ name: 1, _id: 0}
		).sort( {name: 1} )
	*/

	public List<Restaurant> getRestaurantsByCuisine(String q) {
		// Implmementation in here
		
		TextQuery tq = (TextQuery)TextQuery.queryText(null);
		return null;
	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any) 
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	public Optional<Restaurant> getRestaurant(String name) {
		// Implmementation in here
		return null;
		
	}

	// TODO Task 5
	// Use this method to insert a comment into the restaurant database
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	public void addComment(Comment comment) {
		// Implmementation in here
		
	}
	
	// You may add other methods to this class

}
