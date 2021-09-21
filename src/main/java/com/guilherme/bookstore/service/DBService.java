package com.guilherme.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.bookstore.domain.Categoria;
import com.guilherme.bookstore.domain.Livro;
import com.guilherme.bookstore.repositories.CategoriaRepository;
import com.guilherme.bookstore.repositories.LivroRepository;
@Service
public class DBService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		/*Categoria c1 = new Categoria(null, "Informática", "Livros de TI");
		Categoria c2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
		Categoria c3 = new Categoria(null, "Biografias", "Livros de Biografias");

		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Lorem ipsum", c1);
		Livro l2 = new Livro(null, "Engenharia de Software", "Ian Somerville", "Lorem ipsum", c1);
		Livro l3 = new Livro(null, "The Time Machine", "H.G.Wells", "Lorem ipsum", c2);
		Livro l4 = new Livro(null, "The War of the Worlds", "H.H.Wells", "Lorem ipsum", c2);
		Livro l5 = new Livro(null, "I, Robot", "Isaac Asimov", "Lorem ipsum", c2);

		// c1.getLivros().addAll(Arrays.asList(l1));

		categoriaRepository.saveAll(Arrays.asList(c1,c2,c3));
		livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5));*/
	}
}
