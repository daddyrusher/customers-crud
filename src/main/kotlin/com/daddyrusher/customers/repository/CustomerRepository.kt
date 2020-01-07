package com.daddyrusher.customers.repository

import com.daddyrusher.customers.models.Customer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: MongoRepository<Customer, String>
