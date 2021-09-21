package com.guilherme.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.bookstore.domain.Categoria;
import com.guilherme.bookstore.domain.Livro;
import com.guilherme.bookstore.dtos.LivroDTO;
import com.guilherme.bookstore.repositories.LivroRepository;
import com.guilherme.bookstore.service.exceptions.ObjectNotFoundException;
@Service
public class LivroService {
	
	@Autowired
	private LivroRepository livroRepository;
	@Autowired
	private CategoriaService categoriaService;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = livroRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado ! Id: " + id + ", Tipo: " + Livro.class.getName()));
	}


	public List<Livro> findAll(Integer idCategoria) {
		categoriaService.findById(idCategoria);
		return livroRepository.findAllByCategoria(idCategoria);
	}


	public Livro update(Integer id, Livro newObj) {
		Livro obj = findById(id);
		updateData(obj, newObj);
		return livroRepository.save(obj);

	}
	private void updateData(Livro obj, Livro newObj) {
		obj.setTitulo(newObj.getTitulo());
		obj.setNomeAutor(newObj.getNomeAutor());
		obj.setTexto(newObj.getTexto());
	}
	public Livro create(Integer idCategoria, Livro obj) {
		obj.setId(null);
		Categoria cat = categoriaService.findById(idCategoria);
		obj.setCategoria(cat);
		return livroRepository.save(obj);
	}


	public void delete(Integer id) {
		findById(id);
		livroRepository.deleteById(id);
	}

}
