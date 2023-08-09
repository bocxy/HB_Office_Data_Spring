package com.Bocxy.establishment.TNestablishment.Controller;
import com.Bocxy.establishment.TNestablishment.Entity.CircleOffice;
import com.Bocxy.establishment.TNestablishment.Entity.DivisionOffice;
import com.Bocxy.establishment.TNestablishment.Entity.HeadOffice;
import com.Bocxy.establishment.TNestablishment.Repository.CircleOfficeRepo;
import com.Bocxy.establishment.TNestablishment.Repository.DivisionOfficeRepo;
import com.Bocxy.establishment.TNestablishment.Repository.HeadOfficeRepo;
import com.Bocxy.establishment.TNestablishment.Service.EstablishmentService;
import com.Bocxy.establishment.TNestablishment.common.ResponseDo;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class Establishment {

    private final EstablishmentService establishmentService;
    private final CircleOfficeRepo circleOfficeRepository;
    private final DivisionOfficeRepo divisionOfficeRepository;
    private final HeadOfficeRepo headOfficeRepository;
    private final ResponseDo responseDo;

    @Autowired
    public Establishment(EstablishmentService establishmentService, CircleOfficeRepo circleOfficeRepository,
                         DivisionOfficeRepo divisionOfficeRepository, HeadOfficeRepo headOfficeRepository,
                         ResponseDo responseDo) {
        this.establishmentService = establishmentService;
        this.circleOfficeRepository = circleOfficeRepository;
        this.divisionOfficeRepository = divisionOfficeRepository;
        this.headOfficeRepository = headOfficeRepository;
        this.responseDo = responseDo; // Autowire the ResponseDo object
    }

    @PostMapping("/getAllCircleOffices")
    public ResponseDo getAllCircleOffices(@RequestBody JSONObject json,
                                          HttpServletRequest request,
                                          HttpServletResponse response) {
        Long id = json.getAsNumber("id").longValue();
        try {
            List<CircleOffice> allCircleOffices = establishmentService.getAllCircleOffices();

            if (allCircleOffices != null) {
                return responseDo.setSuccessResponse(allCircleOffices);
            } else {
                return responseDo.setSuccessResponse("No Data Found", null);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred"); // Return a failure response in case of exception
        }
    }
    @PostMapping("/getCircleOffice")
    public ResponseDo getCircleOffice(@RequestBody JSONObject json,
                                         HttpServletRequest request,
                                         HttpServletResponse response) {
        Long id = json.getAsNumber("id").longValue();
        try {
            CircleOffice circleOffice = establishmentService.getCircleOfficeById(id);

            if (circleOffice != null) {
                return responseDo.setSuccessResponse(circleOffice);
            } else {
                return responseDo.setFailureResponse("Circle Office not found for the provided ID.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred"); // Return a failure response in case of exception
        }
    }

    @PostMapping("/saveCircleOffice")
    public ResponseDo saveCircleOffice(@RequestBody CircleOffice circleOffice) {
        try {
            CircleOffice savedCircleOffice = establishmentService.saveCircleOffice(circleOffice);

            if (savedCircleOffice != null) {
                return responseDo.setSuccessResponse(savedCircleOffice);
            } else {
                return responseDo.setFailureResponse("Failed to save Circle Office.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred while saving Circle Office.");
        }
    }
    @PostMapping("/deleteCircleOffice")
    public ResponseDo deleteCircleOffice(@RequestBody JSONObject json, final HttpServletRequest request,
                                                      HttpServletResponse response) {

        Long id = json.getAsNumber("id").longValue();

        try {
            establishmentService.deleteCircleOffice(id);
            responseDo.setSuccessResponse("Circle Office Data deleted successfully");

        } catch (Exception e) {
            e.printStackTrace();
            responseDo.setSuccessResponse("Circle Office Data deletion failed");
        }

        return null;
    }
    @PostMapping("/getAllDivisions")
    public ResponseDo getAllDivisions() {
        try {
            List<DivisionOffice> allDivisions = establishmentService.getAllDivisions();

            if (allDivisions != null) {
                return responseDo.setSuccessResponse(allDivisions);
            } else {
                return responseDo.setFailureResponse("No Data Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred"); // Return a failure response in case of exception
        }
    }

    @PostMapping("/getDivisionsOffice")
    public ResponseDo getDivisionsOffice(@RequestBody JSONObject json,
                                         HttpServletRequest request,
                                         HttpServletResponse response) {
        Long id = json.getAsNumber("id").longValue();
        try {
            DivisionOffice divisionOffice = establishmentService.getDivisionsOffice(id);

            if (divisionOffice != null) {
                return responseDo.setSuccessResponse(divisionOffice);
            } else {
                return responseDo.setFailureResponse("Division Office not found for the provided ID.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred"); // Return a failure response in case of exception
        }
    }

    @PostMapping("/saveDivisionsOffice")
    public ResponseDo saveDivisionsOffice(@RequestBody DivisionOffice divisionOffice) {
        try {
            DivisionOffice savedDivisionOffice = establishmentService.saveDivisionsOffice(divisionOffice);

            if (savedDivisionOffice != null) {
                return responseDo.setSuccessResponse(savedDivisionOffice);
            } else {
                return responseDo.setFailureResponse("Failed to save Division Office.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred while saving Division Office.");
        }
    }
    @PostMapping("/deleteDivisionOffice")
    public ResponseDo deleteDivisionOffice(@RequestBody JSONObject json, final HttpServletRequest request,
                                         HttpServletResponse response) {

        Long id = json.getAsNumber("id").longValue();

        try {
            establishmentService.deleteDivisionOffice(id);
            responseDo.setSuccessResponse("Division Office Data deleted successfully");

        } catch (Exception e) {
            e.printStackTrace();
            responseDo.setSuccessResponse("Division Office Data deletion failed ");
        }

        return null;
    }
    @PostMapping("/getAllHeadOffice")
    public ResponseDo getAllHeadOffice() {
        try {
            List<HeadOffice> allHeadOffices = establishmentService.getAllHeadOffice();

            if (allHeadOffices != null) {
                return responseDo.setSuccessResponse(allHeadOffices);
            } else {
                return responseDo.setFailureResponse("No Data Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred"); // Return a failure response in case of exception
        }
    }

    @PostMapping("/getHeadOffice")
    public ResponseDo getHeadOffice(@RequestBody JSONObject json,
                                    HttpServletRequest request,
                                    HttpServletResponse response) {
        Long id = json.getAsNumber("id").longValue();
        try {
            HeadOffice headOffice = establishmentService.getHeadOffice(id);

            if (headOffice != null) {
                return responseDo.setSuccessResponse(headOffice);
            } else {
                return responseDo.setFailureResponse("Head Office not found for the provided ID.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred"); // Return a failure response in case of exception
        }
    }

    @PostMapping("/saveHeadOffice")
    public ResponseDo saveHeadOffice(@RequestBody HeadOffice headOffice) {
        try {
            HeadOffice savedHeadOffice = establishmentService.saveHeadOffice(headOffice);

            if (savedHeadOffice != null) {
                return responseDo.setSuccessResponse(savedHeadOffice);
            } else {
                return responseDo.setFailureResponse("Failed to save Head Office.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return responseDo.setFailureResponse("An error occurred while saving Head Office.");
        }
    }
    @PostMapping("/deleteHeadOffice")
    public ResponseDo deleteHeadOffice(@RequestBody JSONObject json, final HttpServletRequest request,
                                           HttpServletResponse response) {

        Long id = json.getAsNumber("id").longValue();

        try {
            establishmentService.deleteHeadOffice(id);
            responseDo.setSuccessResponse("Head Office Data deleted successfully");

        } catch (Exception e) {
            e.printStackTrace();
            responseDo.setSuccessResponse("Head Office Data deletion failed");
        }

        return null;
    }

}

