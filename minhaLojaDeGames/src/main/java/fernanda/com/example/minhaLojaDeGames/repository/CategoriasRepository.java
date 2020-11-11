package fernanda.com.example.minhaLojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fernanda.com.example.minhaLojaDeGames.model.Categorias;



@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Long> {
	public List<Categorias>  findAllByCategoriaContainingIgnoreCase (String categoria);
}
