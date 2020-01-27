package com.cardealer.cardealer.car;

public class Car {
    private String producer;
    private String modelName;
    private String version;
    private int productionYear;

    public Car(String producer, String modelName, String version, int productionYear) {
        this.producer = producer;
        this.modelName = modelName;
        this.version = version;
        this.productionYear = productionYear;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
