package model;

import java.util.Objects;

public
class Product {
    private String productType;
    private String instanceNumber;
    private String instanceFor;
    private String operationSystem;
    private String vmClass;
    private String instanceType;
    private boolean addGPUs;
    private String gpusNUmber;
    private String gpusType;
    private String localSSD;
    private String location;
    private String commitedUsage;

    public
    Product(String productType, String instanceNumber, String instanceFor, String operationSystem, String vmClass, String instanceType, boolean addGPUs, String gpusNUmber, String gpusType, String localSSD, String location, String commitedUsage) {
        this.productType = productType;
        this.instanceNumber = instanceNumber;
        this.instanceFor = instanceFor;
        this.operationSystem = operationSystem;
        this.vmClass = vmClass;
        this.instanceType = instanceType;
        this.addGPUs = addGPUs;
        this.gpusNUmber = gpusNUmber;
        this.gpusType = gpusType;
        this.localSSD = localSSD;
        this.location = location;
        this.commitedUsage = commitedUsage;
    }

    public
    String getProductType() {
        return productType;
    }

    public
    void setProductType(String productType) {
        this.productType = productType;
    }

    public
    String getInstanceNumber() {
        return instanceNumber;
    }

    public
    void setInstanceNumber(String instanceNumber) {
        this.instanceNumber = instanceNumber;
    }

    public
    String getInstanceFor() {
        return instanceFor;
    }

    public
    void setInstanceFor(String instanceFor) {
        this.instanceFor = instanceFor;
    }

    public
    String getOperationSystem() {
        return operationSystem;
    }

    public
    void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public
    String getVmClass() {
        return vmClass;
    }

    public
    void setVmClass(String vmClass) {
        this.vmClass = vmClass;
    }

    public
    String getInstanceType() {
        return instanceType;
    }

    public
    void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public
    boolean isAddGPUs() {
        return addGPUs;
    }

    public
    void setAddGPUs(boolean addGPUs) {
        this.addGPUs = addGPUs;
    }

    public
    String getGpusNUmber() {
        return gpusNUmber;
    }

    public
    void setGpusNUmber(String gpusNUmber) {
        this.gpusNUmber = gpusNUmber;
    }

    public
    String getGpusType() {
        return gpusType;
    }

    public
    void setGpusType(String gpusType) {
        this.gpusType = gpusType;
    }

    public
    String getLocalSSD() {
        return localSSD;
    }

    public
    void setLocalSSD(String localSSD) {
        this.localSSD = localSSD;
    }

    public
    String getLocation() {
        return location;
    }

    public
    void setLocation(String location) {
        this.location = location;
    }

    public
    String getCommitedUsage() {
        return commitedUsage;
    }

    public
    void setCommitedUsage(String commitedUsage) {
        this.commitedUsage = commitedUsage;
    }

    @Override
    public
    String toString() {
        return "model.Product{" +
                "productType='" + productType + '\'' +
                ", instanceNumber=" + instanceNumber +
                ", instanceFor='" + instanceFor + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                ", vmClass='" + vmClass + '\'' +
                ", instanceType='" + instanceType + '\'' +
                ", addGPUs=" + addGPUs +
                ", gpusNUmber=" + gpusNUmber +
                ", gpusType='" + gpusType + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", location='" + location + '\'' +
                ", commitedUsage='" + commitedUsage + '\'' +
                '}';
    }

    @Override
    public
    boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return instanceNumber == product.instanceNumber &&
                addGPUs == product.addGPUs &&
                gpusNUmber == product.gpusNUmber &&
                Objects.equals(productType, product.productType) &&
                Objects.equals(instanceFor, product.instanceFor) &&
                Objects.equals(operationSystem, product.operationSystem) &&
                Objects.equals(vmClass, product.vmClass) &&
                Objects.equals(instanceType, product.instanceType) &&
                Objects.equals(gpusType, product.gpusType) &&
                Objects.equals(localSSD, product.localSSD) &&
                Objects.equals(location, product.location) &&
                Objects.equals(commitedUsage, product.commitedUsage);
    }

    @Override
    public
    int hashCode() {
        return Objects.hash(productType, instanceNumber, instanceFor, operationSystem, vmClass, instanceType, addGPUs, gpusNUmber, gpusType, localSSD, location, commitedUsage);
    }
}
