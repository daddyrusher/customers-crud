package com.daddyrusher.customers.service

import com.daddyrusher.customers.models.Customer

interface IService {
    fun save(customer: Customer)
    fun getById(id: String): Customer
    fun getAll(): List<Customer>
    fun delete(customer: Customer)
    fun deleteById(id: String)
    fun update(customer: Customer)
}
