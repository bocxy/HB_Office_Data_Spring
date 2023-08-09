package com.Bocxy.establishment.TNestablishment.Repository;

import com.Bocxy.establishment.TNestablishment.Entity.CircleOffice;
import com.Bocxy.establishment.TNestablishment.Entity.DivisionOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DivisionOfficeRepo extends JpaRepository<DivisionOffice, Long> {

}