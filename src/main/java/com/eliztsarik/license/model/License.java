package com.eliztsarik.license.model;

import java.util.Objects;

public class License {
    private int id;
    
    private String licenseId;
    
    private String description;
    
    private String organizationId;
    
    private String productName;
    
    private String licenseType;

    public void setId(int id) {
        this.id = id;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public int getId() {
        return id;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public String getDescription() {
        return description;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public String getProductName() {
        return productName;
    }

    public String getLicenseType() {
        return licenseType;
    }

    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", licenseId='" + licenseId + '\'' +
                ", description='" + description + '\'' +
                ", organizationId='" + organizationId + '\'' +
                ", productName='" + productName + '\'' +
                ", licenseType='" + licenseType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        License license = (License) o;
        return id == license.id && Objects.equals(licenseId, license.licenseId) && Objects.equals(description, license.description) && Objects.equals(organizationId, license.organizationId) && Objects.equals(productName, license.productName) && Objects.equals(licenseType, license.licenseType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, licenseId, description, organizationId, productName, licenseType);
    }
}
