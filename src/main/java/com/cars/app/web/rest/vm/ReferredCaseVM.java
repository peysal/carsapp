package com.cars.app.web.rest.vm;

import com.cars.app.service.ViewModel;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReferredCaseVM implements ViewModel {

    /**
     * shared fields start
     */
    private String agentTagged;
    private String vehicleBodyType;
    private Double basicPremium;
    private Double grossPremium;
    private Double totalPayableAmount;
    private String description;
    private String name;
    private String idNo;
    private String gender;
    private String dateOfBirth;
    private String maritalStatus;
    private String email;
    private String mobileNumber;
    private String address;
    private String vehicleRegistrationNo;
    private Integer residentialPostcode;
    private String vehicleType;
    private String coverType;
    private String vehicleBrand;
    private String vehicleModel;
    private Integer yearOfManufacture;
    private Integer vehicleCapacity;
    private String variantSeries;
    private String nvic;
    private String engineNo;
    private String chasisNo;
    private Integer noOfSeats;
    private Double insuredAmount;
    private String policyEffectiveDate;
    private List<String> drivers;
    private Integer ncd;
    private List<String> addOnCoverages;
    private String roadTaxRenewal;
    private String occupation;
    /** shared fields end */

    /** email content start */
    /** email content end */

    /** no variant report start */
    /** variant report end */

    /** refer case start */
    /**
     * refer case end
     */

    public ReferredCaseVM() {
        // Empty public constructor used by Jackson.
    }

    public ReferredCaseVM(String agentTagged, String vehicleBodyType, Double basicPremium, Double grossPremium,
                          Double totalPayableAmount, String description, String name, String idNo, String gender,
                          String dateOfBirth, String maritalStatus, String email, String mobileNumber, String address,
                          String vehicleRegistrationNo, Integer residentialPostcode, String vehicleType,
                          String coverType, String vehicleBrand, String vehicleModel, Integer yearOfManufacture,
                          Integer vehicleCapacity, String variantSeries, String nvic, String engineNo, String chasisNo,
                          Integer noOfSeats, Double insuredAmount, String policyEffectiveDate, List<String> drivers,
                          Integer ncd, List<String> addOnCoverages, String roadTaxRenewal, String occupation) {
        this.agentTagged = agentTagged;
        this.vehicleBodyType = vehicleBodyType;
        this.basicPremium = basicPremium;
        this.grossPremium = grossPremium;
        this.totalPayableAmount = totalPayableAmount;
        this.description = description;
        this.name = name;
        this.idNo = idNo;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.vehicleRegistrationNo = vehicleRegistrationNo;
        this.residentialPostcode = residentialPostcode;
        this.vehicleType = vehicleType;
        this.coverType = coverType;
        this.vehicleBrand = vehicleBrand;
        this.vehicleModel = vehicleModel;
        this.yearOfManufacture = yearOfManufacture;
        this.vehicleCapacity = vehicleCapacity;
        this.variantSeries = variantSeries;
        this.nvic = nvic;
        this.engineNo = engineNo;
        this.chasisNo = chasisNo;
        this.noOfSeats = noOfSeats;
        this.insuredAmount = insuredAmount;
        this.policyEffectiveDate = policyEffectiveDate;
        this.drivers = drivers;
        this.ncd = ncd;
        this.addOnCoverages = addOnCoverages;
        this.roadTaxRenewal = roadTaxRenewal;
        this.occupation = occupation;
    }

    public String getAgentTagged() {
        return agentTagged;
    }

    public void setAgentTagged(String agentTagged) {
        this.agentTagged = agentTagged;
    }

    public String getVehicleBodyType() {
        return vehicleBodyType;
    }

    public void setVehicleBodyType(String vehicleBodyType) {
        this.vehicleBodyType = vehicleBodyType;
    }

    public Double getBasicPremium() {
        return basicPremium;
    }

    public void setBasicPremium(Double basicPremium) {
        this.basicPremium = basicPremium;
    }

    public Double getGrossPremium() {
        return grossPremium;
    }

    public void setGrossPremium(Double grossPremium) {
        this.grossPremium = grossPremium;
    }

    public Double getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(Double totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVehicleRegistrationNo() {
        return vehicleRegistrationNo;
    }

    public void setVehicleRegistrationNo(String vehicleRegistrationNo) {
        this.vehicleRegistrationNo = vehicleRegistrationNo;
    }

    public Integer getResidentialPostcode() {
        return residentialPostcode;
    }

    public void setResidentialPostcode(Integer residentialPostcode) {
        this.residentialPostcode = residentialPostcode;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Integer yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public Integer getVehicleCapacity() {
        return vehicleCapacity;
    }

    public void setVehicleCapacity(Integer vehicleCapacity) {
        this.vehicleCapacity = vehicleCapacity;
    }

    public String getVariantSeries() {
        return variantSeries;
    }

    public void setVariantSeries(String variantSeries) {
        this.variantSeries = variantSeries;
    }

    public String getNvic() {
        return nvic;
    }

    public void setNvic(String nvic) {
        this.nvic = nvic;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getChasisNo() {
        return chasisNo;
    }

    public void setChasisNo(String chasisNo) {
        this.chasisNo = chasisNo;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Double getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(Double insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public String getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    public void setPolicyEffectiveDate(String policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    public List<String> getDrivers() {
        return drivers;
    }

    public void setDrivers(List<String> drivers) {
        this.drivers = drivers;
    }

    public Integer getNcd() {
        return ncd;
    }

    public void setNcd(Integer ncd) {
        this.ncd = ncd;
    }

    public List<String> getAddOnCoverages() {
        return addOnCoverages;
    }

    public void setAddOnCoverages(List<String> addOnCoverages) {
        this.addOnCoverages = addOnCoverages;
    }

    public String getRoadTaxRenewal() {
        return roadTaxRenewal;
    }

    public void setRoadTaxRenewal(String roadTaxRenewal) {
        this.roadTaxRenewal = roadTaxRenewal;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "ReferredCaseVM{" +
            "agentTagged='" + agentTagged + '\'' +
            ", vehicleBodyType='" + vehicleBodyType + '\'' +
            ", basicPremium=" + basicPremium +
            ", grossPremium=" + grossPremium +
            ", totalPayableAmount=" + totalPayableAmount +
            ", description='" + description + '\'' +
            ", name='" + name + '\'' +
            ", idNo='" + idNo + '\'' +
            ", gender='" + gender + '\'' +
            ", dateOfBirth='" + dateOfBirth + '\'' +
            ", maritalStatus='" + maritalStatus + '\'' +
            ", email='" + email + '\'' +
            ", mobileNumber='" + mobileNumber + '\'' +
            ", address='" + address + '\'' +
            ", vehicleRegistrationNo='" + vehicleRegistrationNo + '\'' +
            ", residentialPostcode=" + residentialPostcode +
            ", vehicleType='" + vehicleType + '\'' +
            ", coverType='" + coverType + '\'' +
            ", vehicleBrand='" + vehicleBrand + '\'' +
            ", vehicleModel='" + vehicleModel + '\'' +
            ", yearOfManufacture=" + yearOfManufacture +
            ", vehicleCapacity=" + vehicleCapacity +
            ", variantSeries='" + variantSeries + '\'' +
            ", nvic='" + nvic + '\'' +
            ", engineNo='" + engineNo + '\'' +
            ", chasisNo='" + chasisNo + '\'' +
            ", noOfSeats=" + noOfSeats +
            ", insuredAmount=" + insuredAmount +
            ", policyEffectiveDate='" + policyEffectiveDate + '\'' +
            ", drivers=" + drivers +
            ", ncd=" + ncd +
            ", addOnCoverages=" + addOnCoverages +
            ", roadTaxRenewal='" + roadTaxRenewal + '\'' +
            ", occupation='" + occupation + '\'' +
            '}';
    }

    @Override
    public Map<String, Object> mapAll() {
        Map<String, Object> mappedObject = new LinkedHashMap<>();
        mappedObject.put("name", this.name);
        mappedObject.put("idNo", this.idNo);
        mappedObject.put("gender", this.gender);
        mappedObject.put("dateOfBirth", this.dateOfBirth);
        mappedObject.put("maritalStatus", this.maritalStatus);
        mappedObject.put("email", this.email);
        mappedObject.put("mobileNumber", this.mobileNumber);
        mappedObject.put("address", this.address);
        mappedObject.put("residentialPostcode", this.residentialPostcode);
        mappedObject.put("vehicleRegistrationNo", this.vehicleRegistrationNo);
        mappedObject.put("vehicleType", this.vehicleType);
        mappedObject.put("coverType", this.coverType);
        mappedObject.put("vehicleBrand", this.vehicleBrand);
        mappedObject.put("vehicleModel", this.vehicleModel);
        mappedObject.put("yearOfManufacture", this.yearOfManufacture);
        mappedObject.put("vehicleCapacity", this.vehicleCapacity);
        mappedObject.put("variantSeries", this.variantSeries);
        mappedObject.put("nvic", this.nvic);
        mappedObject.put("engineNo", this.engineNo);
        mappedObject.put("chasisNo", this.chasisNo);
        mappedObject.put("noOfSeats", this.noOfSeats);
        mappedObject.put("insuredAmount", this.insuredAmount);
        mappedObject.put("policyEffectiveDate", this.policyEffectiveDate);
        mappedObject.put("drivers", this.drivers);
        mappedObject.put("ncd", this.ncd);
        mappedObject.put("addOnCoverages", this.addOnCoverages);
        mappedObject.put("roadTaxRenewal", this.roadTaxRenewal);
        mappedObject.put("occupation", this.occupation);
        mappedObject.put("vehicleBodyType", this.vehicleBodyType);
        mappedObject.put("basicPremium", this.basicPremium);
        mappedObject.put("grossPremium", this.grossPremium);
        mappedObject.put("totalPayableAmount", this.totalPayableAmount);
        mappedObject.put("description", this.description);
        mappedObject.put("agentTagged", this.agentTagged);
        return mappedObject;
    }
}
