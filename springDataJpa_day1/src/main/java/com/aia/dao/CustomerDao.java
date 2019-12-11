package com.aia.dao;

import com.aia.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 符合springDataJpa的dao层接口规范
 * JpaRepository<操作的实体类类型>,实体类中主键属性的类型</>
 *      **封装了基本的CRUD操作
 * JpaSpecificationExecutor：操作的实体类类型
 *      **封装了复杂查询（分页查询）
 */
public interface CustomerDao extends JpaRepository<Customer,Long>, JpaSpecificationExecutor<Customer> {
}
