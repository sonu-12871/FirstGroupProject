package com.example.DAOImpl;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.example.DAO.testDAO;
import com.example.FirstGroupProject.FirstGroupProjectApplication;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class TestDAOImpl implements testDAO {

	@Override
	public String testMongo() {
		Bson filter = new Document();

		String uri = "mongodb+srv://ladyfinger:cx6ac54nmgGtLD1y@cluster0.2y1os.mongodb.net/admin?authSource=admin&replicaSet=atlas-12ctwh-shard-0&w=majority&readPreference=primary&appname=MongoDB+Compass&retryWrites=true&ssl=true";
		com.mongodb.client.MongoClient mongoClient = MongoClients.create(uri);
		
		MongoDatabase database = mongoClient.getDatabase("Classical");
		MongoCollection<Document> collection = database.getCollection("Furniture");
		FindIterable<Document> result = collection.find();
		for (Document document : result) {
			if(document.get("_id").toString().equalsIgnoreCase("61e67b8e877f86402ffd84ba")) {
				System.err.println(document.get("title"));
				return document.get("photo_url").toString();	
			}
			return document.get("photo_url").toString();
		}
		return null;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstGroupProjectApplication.class, args);
		TestDAOImpl test = new TestDAOImpl();
		test.testMongo();

	}

}
