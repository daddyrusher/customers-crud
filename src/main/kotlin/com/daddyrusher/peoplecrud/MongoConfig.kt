package com.daddyrusher.peoplecrud
import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.MongoDbFactory
import org.springframework.data.mongodb.core.SimpleMongoClientDbFactory
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@Configuration
@EnableMongoRepositories
class MongoConfig {
    @Bean
    fun mongoDbFactory(): MongoDbFactory? {
        val mongoClient = MongoClients.create()
        return SimpleMongoClientDbFactory(mongoClient, "people")
    }
}
