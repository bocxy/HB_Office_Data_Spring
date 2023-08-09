package com.Bocxy.establishment.TNestablishment.Service;



import com.Bocxy.establishment.TNestablishment.Entity.CircleOffice;
import com.Bocxy.establishment.TNestablishment.Entity.DivisionOffice;
import com.Bocxy.establishment.TNestablishment.Entity.HeadOffice;
import com.Bocxy.establishment.TNestablishment.Repository.CircleOfficeRepo;
import com.Bocxy.establishment.TNestablishment.Repository.DivisionOfficeRepo;
import com.Bocxy.establishment.TNestablishment.Repository.HeadOfficeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstablishmentServiceImpl implements EstablishmentService {

    private final CircleOfficeRepo circleOfficeRepository;
    private final DivisionOfficeRepo divisionOfficeRepository;
    private final HeadOfficeRepo headOfficeRepository;
    @Autowired
    public EstablishmentServiceImpl(CircleOfficeRepo circleOfficeRepository, DivisionOfficeRepo divisionOfficeRepository, HeadOfficeRepo headOfficeRepository) {
        this.circleOfficeRepository = circleOfficeRepository;
        this.divisionOfficeRepository = divisionOfficeRepository;
        this.headOfficeRepository = headOfficeRepository;
    }

    @Override
    public List<CircleOffice> getAllCircleOffices() {
        return circleOfficeRepository.findAll();
    }

    @Override
    public CircleOffice getCircleOfficeById(Long id) {
        Optional<CircleOffice> optionalCircleOffice = circleOfficeRepository.findById(id);
        return optionalCircleOffice.orElse(null);
    }

    @Override
    public CircleOffice saveCircleOffice(CircleOffice circleOffice) {
        return circleOfficeRepository.save(circleOffice);
    }

    @Override
    public void deleteCircleOffice(Long id) {
        circleOfficeRepository.deleteById(id);
    }

    @Override
    public List<DivisionOffice> getAllDivisions() {
        return divisionOfficeRepository.findAll();
    }

    @Override
    public DivisionOffice getDivisionsOffice(Long id) {
        Optional<DivisionOffice> optionalDivisionOffice = divisionOfficeRepository.findById(id);
        return optionalDivisionOffice.orElse(null);
    }

    @Override
    public DivisionOffice saveDivisionsOffice(DivisionOffice divisionOffice) {
        return divisionOfficeRepository.save(divisionOffice);
    }

    @Override
    public void deleteDivisionOffice(Long id) {
        divisionOfficeRepository.deleteById(id);
    }
    @Override
    public List<HeadOffice> getAllHeadOffice() {
        return headOfficeRepository.findAll();
    }

    @Override
    public HeadOffice getHeadOffice(Long id) {
        Optional<HeadOffice> optionalHeadOffice = headOfficeRepository.findById(id);
        return optionalHeadOffice.orElse(null);
    }

    @Override
    public HeadOffice saveHeadOffice(HeadOffice headOffice) {
        return headOfficeRepository.save(headOffice);
    }

    @Override
    public void deleteHeadOffice(Long id) {
        headOfficeRepository.deleteById(id);
    }

}
