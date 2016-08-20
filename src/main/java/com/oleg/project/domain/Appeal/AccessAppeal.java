package com.oleg.project.domain.Appeal;


import org.joda.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;



@Entity
@Table(name = "ACCESS_APPEAL")
public class AccessAppeal extends Appeal implements Serializable {

    private static final long serialVersionUID = -5527566248002296042L;

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private int id;

    @Column(name = "incomeNumber")
    private String incomeNumber;

    @Column(name = "countOfPages")
    private String countOfPages;

    @Column(name = "incomingDate")
    private Date incomingDate;

    @Column(name = "statusOfApplicant")
    private String statusOfApplicant;

    @Column(name = "howAppealWasTaken")
    private String howAppealWasTaken;

    @Column(name = "nameOfLawyer")
    private String nameOfLawyer;

    @Column(name = "themeOfAppeal")
    private String themeOfAppeal;

    @Column(name = "shortContentOfAppeal")
    private String shortContentOfAppeal;

    @Column(name = "unitWhoDoResolution")
    private String unitWhoDoResolution;

    @Column(name = "contentOfResolution")
    private String contentOfResolution;

    @Column(name = "address")
    private String address;

    @Column(name = "checkForPlagiarism")
    private String checkForPlagiarism;

    @Column(name = "dateForCheck")
    private Date dateForCheck;

    @Column(name = "mainWorker")
    private String mainWorker;

    @Column(name = "secondaryWorkers")
    private String secondaryWorkers;

    @Column(name = "statusOfWorking")
    private String statusOfWorking;

    @Column(name = "result")
    private String result;

    @Column(name = "filePath")
    private String FilePath;

    public AccessAppeal() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getIncomeNumber() {
        return incomeNumber;
    }

    @Override
    public void setIncomeNumber(String incomeNumber) {
        this.incomeNumber = incomeNumber;
    }

    @Override
    public String getCountOfPages() {
        return countOfPages;
    }

    @Override
    public void setCountOfPages(String countOfPages) {
        this.countOfPages = countOfPages;
    }

    public String getStatusOfApplicant() {
        return statusOfApplicant;
    }

    public void setStatusOfApplicant(String statusOfApplicant) {
        this.statusOfApplicant = statusOfApplicant;
    }

    public String getHowAppealWasTaken() {
        return howAppealWasTaken;
    }

    public void setHowAppealWasTaken(String howAppealWasTaken) {
        this.howAppealWasTaken = howAppealWasTaken;
    }

    public String getNameOfLawyer() {
        return nameOfLawyer;
    }

    public void setNameOfLawyer(String nameOfLawyer) {
        this.nameOfLawyer = nameOfLawyer;
    }

    @Override
    public String getThemeOfAppeal() {
        return themeOfAppeal;
    }

    @Override
    public void setThemeOfAppeal(String themeOfAppeal) {
        this.themeOfAppeal = themeOfAppeal;
    }

    @Override
    public String getShortContentOfAppeal() {
        return shortContentOfAppeal;
    }

    @Override
    public void setShortContentOfAppeal(String shortContentOfAppeal) {
        this.shortContentOfAppeal = shortContentOfAppeal;
    }

    @Override
    public String getUnitWhoDoResolution() {
        return unitWhoDoResolution;
    }

    @Override
    public void setUnitWhoDoResolution(String unitWhoDoResolution) {
        this.unitWhoDoResolution = unitWhoDoResolution;
    }

    @Override
    public String getContentOfResolution() {
        return contentOfResolution;
    }

    @Override
    public void setContentOfResolution(String contentOfResolution) {
        this.contentOfResolution = contentOfResolution;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getCheckForPlagiarism() {
        return checkForPlagiarism;
    }

    @Override
    public void setCheckForPlagiarism(String checkForPlagiarism) {
        this.checkForPlagiarism = checkForPlagiarism;
    }

    @Override
    public String getMainWorker() {
        return mainWorker;
    }

    @Override
    public void setMainWorker(String mainWorker) {
        this.mainWorker = mainWorker;
    }

    @Override
    public String getSecondaryWorkers() {
        return secondaryWorkers;
    }

    @Override
    public void setSecondaryWorkers(String secondaryWorkers) {
        this.secondaryWorkers = secondaryWorkers;
    }

    @Override
    public String getStatusOfWorking() {
        return statusOfWorking;
    }

    @Override
    public void setStatusOfWorking(String statusOfWorking) {
        this.statusOfWorking = statusOfWorking;
    }

    @Override
    public String getResult() {
        return result;
    }

    @Override
    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String getFilePath() {
        return FilePath;
    }

    @Override
    public void setFilePath(String filePath) {
        FilePath = filePath;
    }

    @Override
    public Date getIncomingDate() {
        return incomingDate;
    }

    @Override
    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    @Override
    public Date getDateForCheck() {
        return dateForCheck;
    }

    @Override
    public void setDateForCheck(Date dateForCheck) {
        this.dateForCheck = dateForCheck;
    }
}

