package fernanda.com.example.minhaLojaDeGames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fernanda.com.example.minhaLojaDeGames.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
	public List<Produtos>  findAllByTituloContainingIgnoreCase (String titulo);
}
