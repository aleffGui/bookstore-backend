package com.guilherme.bookstore.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.guilherme.bookstore.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

	@Query(value = "SELECT * FROM Livro WHERE livro.categoria_id = :idCategoria ORDER BY titulo", nativeQuery = true)
	List<Livro> findAllByCategoria(@Param(value = "idCategoria") Integer idCategoria);

}
