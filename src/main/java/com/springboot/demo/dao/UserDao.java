package com.springboot.demo.dao;

import com.springboot.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserDao extends PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User>, JpaRepository<User, Long> {
    /**
     * The superclass method <code>Optional<User> findById(Long var1);</code> does not meet the query type,
     * so add a method to query user by string id.
     *
     * @param id
     * @return
     */
    User findById(String id);
}
