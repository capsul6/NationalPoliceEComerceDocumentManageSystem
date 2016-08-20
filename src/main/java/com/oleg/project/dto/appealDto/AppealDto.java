package com.oleg.project.dto.appealDto;


public abstract class AppealDto {

    private String incomeNumber;

    private String countOfPages;

    private String nameOfApplicant;

    private String incomingDate;

    private String themeOfAppeal;

    private String shortContentOfAppeal;

    private String unitWhoDoResolution;

    private String contentOfResolution;

    private String checkForPlagiarism;

    private String dateForCheck;

    private String mainWorker;

    private String secondaryWorkers;

    private String statusOfWorking;

    private String result;

    private String FilePath;


    public String getIncomeNumber() {
        return incomeNumber;
    }

    public void setIncomeNumber(String incomeNumber) {
        this.incomeNumber = incomeNumber;
    }

    public String getCountOfPages() {
        return countOfPages;
    }

    public void setCountOfPages(String countOfPages) {
        this.countOfPages = countOfPages;
    }

    public String getNameOfApplicant() {
        return nameOfApplicant;
    }

    public void setNameOfApplicant(String nameOfApplicant) {
        this.nameOfApplicant = nameOfApplicant;
    }

    public String getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(String incomingDate) {
        this.incomingDate = incomingDate;
    }

    public String getThemeOfAppeal() {
        return themeOfAppeal;
    }

    public void setThemeOfAppeal(String themeOfAppeal) {
        this.themeOfAppeal = themeOfAppeal;
    }

    public String getShortContentOfAppeal() {
        return shortContentOfAppeal;
    }

    public void setShortContentOfAppeal(String shortContentOfAppeal) {
        this.shortContentOfAppeal = shortContentOfAppeal;
    }

    public String getUnitWhoDoResolution() {
        return unitWhoDoResolution;
    }

    public void setUnitWhoDoResolution(String unitWhoDoResolution) {
        this.unitWhoDoResolution = unitWhoDoResolution;
    }

    public String getContentOfResolution() {
        return contentOfResolution;
    }

    public void setContentOfResolution(String contentOfResolution) {
        this.contentOfResolution = contentOfResolution;
    }

    public String getCheckForPlagiarism() {
        return checkForPlagiarism;
    }

    public void setCheckForPlagiarism(String checkForPlagiarism) {
        this.checkForPlagiarism = checkForPlagiarism;
    }

    public String getDateForCheck() {
        return dateForCheck;
    }

    public void setDateForCheck(String dateForCheck) {
        this.dateForCheck = dateForCheck;
    }

    public String getMainWorker() {
        return mainWorker;
    }

    public void setMainWorker(String mainWorker) {
        this.mainWorker = mainWorker;
    }

    public String getSecondaryWorkers() {
        return secondaryWorkers;
    }

    public void setSecondaryWorkers(String secondaryWorkers) {
        this.secondaryWorkers = secondaryWorkers;
    }

    public String getStatusOfWorking() {
        return statusOfWorking;
    }

    public void setStatusOfWorking(String statusOfWorking) {
        this.statusOfWorking = statusOfWorking;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getFilePath() {
        return FilePath;
    }

    public void setFilePath(String filePath) {
        FilePath = filePath;
    }
}
