package com.oleg.project.dto.requestDto;

public class DeputeAppealForRequestDto extends RequestDto {

    private String outNumber;

    private String incomeNumber;

    private String incomingDate;

    private String outDate;

    private String nameAndAddressOfApplicant;

    private String nameOfDepute;

    private String sendingOrganization;

    private String shortContentOfAppeal;

    private String mainWorker;

    private String typeOfDeputeAppeal;

    public DeputeAppealForRequestDto() {}

    public String getOutNumber() {
        return outNumber;
    }

    public void setOutNumber(String outNumber) {
        this.outNumber = outNumber;
    }

    public String getNameOfDepute() {
        return nameOfDepute;
    }

    public void setNameOfDepute(String nameOfDepute) {
        this.nameOfDepute = nameOfDepute;
    }

    public String getIncomeNumber() {
        return incomeNumber;
    }

    public void setIncomeNumber(String incomeNumber) {
        this.incomeNumber = incomeNumber;
    }

    public String getIncomingDate() {
        return incomingDate;
    }

    public void setIncomingDate(String incomingDate) {
        this.incomingDate = incomingDate;
    }

    public String getShortContentOfAppeal() {
        return shortContentOfAppeal;
    }

    public void setShortContentOfAppeal(String shortContentOfAppeal) {
        this.shortContentOfAppeal = shortContentOfAppeal;
    }

    public String getTypeOfDeputeAppeal() {
        return typeOfDeputeAppeal;
    }

    public void setTypeOfDeputeAppeal(String typeOfDeputeAppeal) {
        this.typeOfDeputeAppeal = typeOfDeputeAppeal;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getNameAndAddressOfApplicant() {
        return nameAndAddressOfApplicant;
    }

    public void setNameAndAddressOfApplicant(String nameAndAddressOfApplicant) {
        this.nameAndAddressOfApplicant = nameAndAddressOfApplicant;
    }

    public String getSendingOrganization() {
        return sendingOrganization;
    }

    public void setSendingOrganization(String sendingOrganization) {
        this.sendingOrganization = sendingOrganization;
    }

    public String getMainWorker() {
        return mainWorker;
    }

    public void setMainWorker(String mainWorker) {
        this.mainWorker = mainWorker;
    }
}
