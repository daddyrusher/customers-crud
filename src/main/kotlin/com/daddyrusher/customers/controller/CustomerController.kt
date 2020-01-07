package com.daddyrusher.customers.controller

import com.daddyrusher.customers.models.Customer
import com.daddyrusher.customers.service.CustomerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customer")
@CrossOrigin(origins = ["http://localhost:4200"])
class CustomerController(private val service: CustomerService) {
    @GetMapping
    fun getAll(): ResponseEntity<List<Customer>> = ResponseEntity.ok(service.getAll())

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): ResponseEntity<Customer> = ResponseEntity.ok(service.getById(id))

    @PostMapping
    fun save(@RequestBody customer: Customer): ResponseEntity<Any> {
        service.save(customer)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping
    fun delete(@RequestBody customer: Customer): ResponseEntity<Any> {
        service.delete(customer)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: String): ResponseEntity<Any> {
        service.deleteById(id)
        return ResponseEntity.ok().build()
    }
}
