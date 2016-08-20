package com.oleg.project.domain.Appeal;

import java.sql.Date;


public abstract class Appeal {

        private int id;

        private String incomeNumber;

        private String countOfPages;

        private String nameOfApplicant;

        private Date incomingDate;

        private String themeOfAppeal;

        private String shortContentOfAppeal;

        private String unitWhoDoResolution;

        private String contentOfResolution;

        private String checkForPlagiarism;

        private Date dateForCheck;

        private String mainWorker;

        private String secondaryWorkers;

        private String statusOfWorking;

        private String result;

        private String FilePath;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getStatusOfWorking() {
                return statusOfWorking;
        }

        public void setStatusOfWorking(String statusOfWorking) {
                this.statusOfWorking = statusOfWorking;
        }

        public String getSecondaryWorkers() {
                return secondaryWorkers;
        }

        public void setSecondaryWorkers(String secondaryWorkers) {
                this.secondaryWorkers = secondaryWorkers;
        }

        public String getMainWorker() {
                return mainWorker;
        }

        public void setMainWorker(String mainWorker) {
                this.mainWorker = mainWorker;
        }


        public String getContentOfResolution() {
                return contentOfResolution;
        }

        public void setContentOfResolution(String contentOfResolution) {
                this.contentOfResolution = contentOfResolution;
        }

        public String getUnitWhoDoResolution() {
                return unitWhoDoResolution;
        }

        public void setUnitWhoDoResolution(String unitWhoDoResolution) {
                this.unitWhoDoResolution = unitWhoDoResolution;
        }

        public String getThemeOfAppeal() {
                return themeOfAppeal;
        }

        public void setThemeOfAppeal(String themeOfAppeal) {
                this.themeOfAppeal = themeOfAppeal;
        }

        public String getNameOfApplicant() {
                return nameOfApplicant;
        }

        public void setNameOfApplicant(String nameOfApplicant) {
                this.nameOfApplicant = nameOfApplicant;
        }

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

        public String getShortContentOfAppeal() {
                return shortContentOfAppeal;
        }

        public void setShortContentOfAppeal(String shortContentOfAppeal) {
                this.shortContentOfAppeal = shortContentOfAppeal;
        }

        public String getCheckForPlagiarism() {
                return checkForPlagiarism;
        }

        public void setCheckForPlagiarism(String checkForPlagiarism) {
                this.checkForPlagiarism = checkForPlagiarism;
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

        public Date getIncomingDate() {
                return incomingDate;
        }

        public void setIncomingDate(Date incomingDate) {
                this.incomingDate = incomingDate;
        }

        public Date getDateForCheck() {
                return dateForCheck;
        }

        public void setDateForCheck(Date dateForCheck) {
                this.dateForCheck = dateForCheck;
        }
}

