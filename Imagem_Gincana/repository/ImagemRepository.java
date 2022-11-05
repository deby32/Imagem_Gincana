package br.edu.ifba.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifba.backend.model.ImagemModel;

@Repository
public interface ImagemRepository extends JpaRepository<ImagemModel, Long>{


}
