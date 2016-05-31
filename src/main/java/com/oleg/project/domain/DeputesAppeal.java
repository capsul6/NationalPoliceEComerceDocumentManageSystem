package com.oleg.project.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "DEPUTES_APPEAL")
public class DeputesAppeal implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Long id;

    @Column(name = "NumberOfAppeal")
    private Integer number;

    @Column(name = "DateOfIncomingAppeal")
    private Date IncomingDate;

    @Column(name = "NameOfDepute")
    private String NameOfDepute;

    @Column(name = "ResolutionOfChief")
    private String ResolutionOfChief;

    @Column(name = "TypeOfAppeal")
    private String typeOfAppeal;

    @Column(name = "FilePath")
    private String filePath;


    public DeputesAppeal(){}

    public DeputesAppeal(Long id, Date date, String nameOfDepute, String resolutionOfChief, String typeOfAppeal, String filePath){
        this.id = id;
        this.IncomingDate = date;
        this.NameOfDepute = nameOfDepute;
        this.ResolutionOfChief = resolutionOfChief;
        this.typeOfAppeal = typeOfAppeal;
        this.filePath = filePath;
    }


    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getIncomingDate() {
        return IncomingDate;
    }

    public void setIncomingDate(Date incomingDate) {
        IncomingDate = incomingDate;
    }

    public String getNameOfDepute() {
        return NameOfDepute;
    }

    public void setNameOfDepute(String nameOfDepute) {
        NameOfDepute = nameOfDepute;
    }

    public String getResolutionOfChief() {
        return ResolutionOfChief;
    }

    public void setResolutionOfChief(String resolutionOfChief) {
        ResolutionOfChief = resolutionOfChief;
    }

    public String getTypeOfAppeal() {
        return typeOfAppeal;
    }

    public void setTypeOfAppeal(String typeOfAppeal) {
        this.typeOfAppeal = typeOfAppeal;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
