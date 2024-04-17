package com.fsa.spring_mvc_demo.repository;

import com.fsa.spring_mvc_demo.entity.EipMCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EipMCompanyRepository extends JpaRepository<EipMCompany, Integer> {

//    @Query(value = "Select count(c) from eip_m_company c", nativeQuery = true)
//    int findByCompanyName(String name);

//    @Query(value = "Select count(c) from EipMCompany c")
//    int findByCompanyName(String name);
}