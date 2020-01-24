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

    public String getModelName() {
        return modelName;
    }

    public String getVersion() {
        return version;
    }

    public int getProductionYear() {
        return productionYear;
    }

    void setProducer(String producer) {
        this.producer = producer;
    }

    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    void setVersion(String version) {
        this.version = version;
    }

    void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}
