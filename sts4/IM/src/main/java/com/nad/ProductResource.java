package com.nad;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nad.entity.ProductEntity;
import com.nad.model.Product;
import com.nad.repo.ProductRepo;

@RestController
@RequestMapping("/product")
public class ProductResource {

	@Autowired
	private ProductRepo prodcutRepo;

	public void setProdcutRepo(ProductRepo prodcutRepo) {
		this.prodcutRepo = prodcutRepo;
	}

	@Autowired
	private MongoTemplate template;
	
	
	public void setTemplate(MongoTemplate template) {
		this.template = template;
	}
	
	@Secured("admin")
	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product insertProduct(@RequestBody @Valid Product product) {
		ProductEntity response = prodcutRepo.save(new ProductEntity(product.getProductID(), product.getProductID(),
				product.getProductName(), product.getType()));
		return new Product(response.getProductID(), response.getProductName(), response.getType());
	}

	@RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET, produces = "application/json")
	public ProductEntity getProduct(@PathVariable("id") String id) {
		return template.findOne(Query.query(Criteria.where("productID").is("85")), ProductEntity.class, "product_entity");
		//return prodcutRepo.findBy_id(id);
	}
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET, produces = "application/json")
	public List<ProductEntity> getProduct() {
		return template.findAll(ProductEntity.class);
	}
	@RequestMapping(value = "/getProductByProductName/{productName}", method = RequestMethod.GET, produces = "application/json")
	public ProductEntity getProductByProductName(@PathVariable("productName") String productName) {
		return template.findOne(Query.query(Criteria.where(productName)), ProductEntity.class,"product_entity");
	}
}
