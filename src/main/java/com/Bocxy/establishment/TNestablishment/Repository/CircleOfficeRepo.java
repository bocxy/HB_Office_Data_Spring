package com.Bocxy.establishment.TNestablishment.Repository;


import com.Bocxy.establishment.TNestablishment.Entity.CircleOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircleOfficeRepo extends JpaRepository<CircleOffice, Long> {

}