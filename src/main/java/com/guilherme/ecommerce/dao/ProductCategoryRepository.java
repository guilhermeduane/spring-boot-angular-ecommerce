package com.guilherme.ecommerce.dao;

import com.guilherme.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "productCategory ", path = "product- category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
