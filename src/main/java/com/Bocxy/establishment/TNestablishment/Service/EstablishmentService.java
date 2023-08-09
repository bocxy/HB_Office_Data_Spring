package com.Bocxy.establishment.TNestablishment.Service;



import com.Bocxy.establishment.TNestablishment.Entity.CircleOffice;
import com.Bocxy.establishment.TNestablishment.Entity.DivisionOffice;
import com.Bocxy.establishment.TNestablishment.Entity.HeadOffice;

import java.util.List;

public interface EstablishmentService {
    List<CircleOffice> getAllCircleOffices();
    CircleOffice getCircleOfficeById(Long id);
    CircleOffice saveCircleOffice(CircleOffice circleOffice);
    void deleteCircleOffice(Long id);
    List<DivisionOffice>getAllDivisions();
    DivisionOffice saveDivisionsOffice(DivisionOffice divisionOffice);
    DivisionOffice getDivisionsOffice(Long id);

    void deleteDivisionOffice(Long id);
    List<HeadOffice>getAllHeadOffice();
    HeadOffice saveHeadOffice(HeadOffice headOffice);
    HeadOffice getHeadOffice(Long id);

    void deleteHeadOffice(Long id);

}
