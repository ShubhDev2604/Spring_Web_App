package org.lifehive.SpringWebApp.Demo.repo;

import org.lifehive.SpringWebApp.Demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
