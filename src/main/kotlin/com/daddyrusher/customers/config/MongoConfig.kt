package com.daddyrusher.customers.config
import com.mongodb.MongoClient
import com.mongodb.MongoClientSettings
import com.mongodb.MongoClientURI
import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.MongoDbFactory
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@Configuration
@EnableMongoRepositories
class MongoConfig {
    @Bean
    fun mongoClient(): MongoClient = MongoClient(MongoClientURI("mongodb://localhost/people"))
}
