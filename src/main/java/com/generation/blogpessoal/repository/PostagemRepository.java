package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.Postagem;
<<<<<<< HEAD

=======
import org.springframework.stereotype.Repository;
>>>>>>> dda92b3d85b8e70a06d4149c03b65bbe6e7f17dc
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List <Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
