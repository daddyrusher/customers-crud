package com.daddyrusher.peoplecrud

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PeopleRepository: MongoRepository<Person, String>
