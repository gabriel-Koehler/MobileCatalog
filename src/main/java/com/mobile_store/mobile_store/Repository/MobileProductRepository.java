package com.mobile_store.mobile_store.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobile_store.mobile_store.Model.MobileProduct;

@Repository
public interface MobileProductRepository extends CrudRepository<MobileProduct,Long>{
    
}
