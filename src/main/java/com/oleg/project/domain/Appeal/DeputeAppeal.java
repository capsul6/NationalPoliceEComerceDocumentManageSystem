package com.oleg.project.domain.Appeal;



import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.*;

@Entity
@Table(name = "DEPUTES_APPEAL")
public class DeputeAppeal extends Appeal implements Serializable {

    private static final long serialVersionUID = -5527566248002296042L;

    @Id
    @Column(name = "DeputeAppeal_ID")
    @GeneratedValue
    private int id;

    @Column(name = "TypeOfDeputeAppeal")
    private String typeOfDeputeAppeal;

    @Column(name = "sendingOrganization")
    private String sendingOrganization;

    @Column(name = "outNumber")
    private String outNumber;

    @Column(name = "outDate")
    private Date outDate;

    @Column(name = "countOfPages")
    private String countOfPages;

    @Column(name = "nameOfDepute")
    private String nameOfDepute;

    @Column(name = "incomeNumber")
    private String incomeNumber;

    @Column(name = "incomingDate")
    private Date incomingDate;

    @Column(name = "themeOfAppeal")
    private String themeOfAppeal;

    @Column(name = "shortContentOfAppeal")
    private String shortContentOfAppeal;

    @Column(name = "unitWhoDoResolution")
    private String unitWhoDoResolution;

    @Column(name = "contentOfResolution")
    private String contentOfResolution;

    @Column(name = "checkForPlagiarism")
    private String checkForPlagiarism;

    @Column(name = "nameAndAddressOfApplicant")
    private String nameAndAddressOfApplicant;

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

    @OneToMany(mappedBy = "deputeAppeal", cascade = CascadeType.ALL)
    private List<DeputeAppealFiles> deputeAppealFiles = new ArrayList<DeputeAppealFiles>();


    public DeputeAppeal(){}

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfDeputeAppeal() {
        return typeOfDeputeAppeal;
    }

    public void setTypeOfDeputeAppeal(String typeOfDeputeAppeal) {
        this.typeOfDeputeAppeal = typeOfDeputeAppeal;
    }

    public String getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(String outNumber) {
        this.outNumber = outNumber;
    }

    @Override
    public String getCountOfPages() {
        return countOfPages;
    }

    @Override
    public void setCountOfPages(String countOfPages) {
        this.countOfPages = countOfPages;
    }

    public String getNameOfDepute() {
        return nameOfDepute;
    }

    public void setNameOfDepute(String nameOfDepute) {
        this.nameOfDepute = nameOfDepute;
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

    @Override
    public String getCheckForPlagiarism() {
        return checkForPlagiarism;
    }

    @Override
    public void setCheckForPlagiarism(String checkForPlagiarism) {
        this.checkForPlagiarism = checkForPlagiarism;
    }

    public String getNameAndAddressOfApplicant() {
        return nameAndAddressOfApplicant;
    }

    public void setNameAndAddressOfApplicant(String nameAndAddressOfApplicant) {
        this.nameAndAddressOfApplicant = nameAndAddressOfApplicant;
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

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
            this.outDate = outDate;
    }

    @Override
    public Date getDateForCheck() {
        return dateForCheck;
    }

    public void setDateForCheck(Date dateForCheck) {
        this.dateForCheck = dateForCheck;
    }

    @Override
    public Date getIncomingDate() {
        return incomingDate;
    }

    @Override
    public void setIncomingDate(Date incomingDate) {
        this.incomingDate = incomingDate;
    }

    public String getSendingOrganization() {
        return sendingOrganization;
    }

    public void setSendingOrganization(String sendingOrganization) {
        this.sendingOrganization = sendingOrganization;
    }


    public List<DeputeAppealFiles> getDeputeAppealFiles() {
        return deputeAppealFiles;
    }

    public void setDeputeAppealFiles(List<DeputeAppealFiles> deputeAppealFiles) {
        this.deputeAppealFiles = deputeAppealFiles;
    }
}