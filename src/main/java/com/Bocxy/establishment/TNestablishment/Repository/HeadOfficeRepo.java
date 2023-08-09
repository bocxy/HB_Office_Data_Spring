package com.Bocxy.establishment.TNestablishment.Repository;

import com.Bocxy.establishment.TNestablishment.Entity.DivisionOffice;
import com.Bocxy.establishment.TNestablishment.Entity.HeadOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HeadOfficeRepo extends JpaRepository<HeadOffice, Long> {

}