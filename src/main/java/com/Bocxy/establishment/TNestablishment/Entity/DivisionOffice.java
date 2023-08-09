package com.Bocxy.establishment.TNestablishment.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "DivisionOffice")
public class DivisionOffice{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "N_ID")
    private Long N_ID;

    @Column(name = "N_UNIQUE_ID")
    private Long N_UNIQUE_ID;


    @Column(name = "V_Division_Place")
    private String V_Division_Place;

    @Column(name = "V_Address")
    private String V_Address;

    @Column(name = "N_Pincode")
    private Long N_Pincode;

    @Column(name = "N_Phone")
    private Long N_Phone;

    @Column(name = "V_Email")
    private String V_Email;

    @Column(name = "V_Division_Name")
    private String V_Division_Name;

    @Column(name = "V_Division_Code")
    private String V_Division_Code;

    @Column(name = "V_Select_Circle")
    private String V_Select_Circle;
    @Transient
    private String mode;

}