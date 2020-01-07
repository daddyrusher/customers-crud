package com.daddyrusher.customers.service

import com.daddyrusher.customers.repository.CustomerRepository
import com.daddyrusher.customers.models.Customer
import org.springframework.stereotype.Service

@Service
class CustomerService(private val repository: CustomerRepository): IService {
    override fun save(customer: Customer) {
        repository.save(customer)
    }

    override fun getById(id: String): Customer = repository.findById(id).get()
    override fun getAll(): List<Customer> = repository.findAll()
    override fun delete(customer: Customer) = repository.delete(customer)
    override fun deleteById(id: String) {
        repository.deleteById(id)
    }

    override fun update(customer: Customer) { repository.save(customer) }
}
