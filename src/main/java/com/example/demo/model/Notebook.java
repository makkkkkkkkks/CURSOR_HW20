package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Notebook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;
    private String producer;
    private String processor;
    private Integer memory;
    private Boolean usedUnused;
    private String typeBox;
    private float price;

    public Notebook() {
    }

    public Notebook(
            String model,
            String producer,
            String processor,
            Integer memory,
            Boolean usedUnused,
            String typeBox,
            float price) {
        this.model = model;
        this.producer = producer;
        this.processor = processor;
        this.memory = memory;
        this.usedUnused = usedUnused;
        this.typeBox = typeBox;
        this.price = price;
        this.usedUnused = usedUnused;
        this.typeBox = typeBox;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public Boolean getUsedUnused() {
        return usedUnused;
    }

    public void setUsedUnused(Boolean usedUnused) {
        this.usedUnused = usedUnused;
    }

    public String getTypeBox() {
        return typeBox;
    }

    public void setTypeBox(String typeBox) {
        this.typeBox = typeBox;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
