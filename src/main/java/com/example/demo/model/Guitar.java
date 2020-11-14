package com.example.demo.model;

public class Guitar {
    private String modelName;
    private String producer;
    private String guitarist;
    private String description;
    private String pictUrl = "https://nedstarkdies.files.wordpress.com/2015/03/12th_fret_draft2.jpg";

    public Guitar() {
    }

    public Guitar(final String modelName, final String producer, final String guitarist,
                  final String description, final String pictUrl) {
        this.modelName = modelName;
        this.producer = producer;
        this.guitarist = guitarist;
        this.description = description;
        this.pictUrl = pictUrl;
    }

    public Guitar(String modelName, String producer, String description, String pictUrl) {
        this.modelName = modelName;
        this.producer = producer;
        this.description = description;
        this.pictUrl = pictUrl;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getGuitarist() {
        return guitarist;
    }

    public void setGuitarist(String guitarist) {
        this.guitarist = guitarist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPictUrl() {
        return pictUrl;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl;
    }
}
