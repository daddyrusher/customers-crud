package com.daddyrusher.customers.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "customer")
data class Customer(
        @Id
        val id: String? = "",
        val firstName: String? = "",
        val lastName: String? = "",
        val age: Int? = 0,
        val active: Boolean = false
)
