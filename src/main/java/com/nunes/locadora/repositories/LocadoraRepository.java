package com.nunes.locadora.repositories;

import com.nunes.locadora.document.LocadoraDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocadoraRepository extends MongoRepository<LocadoraDoc, String> {
}
