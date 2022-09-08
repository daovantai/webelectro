package web.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import web.model.Product;

@Repository
public interface ProductRepo  extends JpaRepository<Product, Long>{
	
	@Query(value="SELECT * FROM product order by id DESC limit 0,6", nativeQuery=true) 
	List<Product> listnew();
	
	@Query(value="SELECT * FROM product order by sale DESC limit 0,6", nativeQuery=true) 
	List<Product> listsale();
	
	Product getById(Long id);
}
