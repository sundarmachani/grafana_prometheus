package com.grafana.repository;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.grafana.resource.Product;

public interface ProductRepository extends CouchbaseRepository<Product, String> {

}
