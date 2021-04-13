package com.nunes.locadora.document;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class LocadoraDoc {

    @Id
    private String id;
    private String name;
    private String dataInicio;
    private String dataFim;

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataInicio(){
        return dataInicio;
    }

    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }

    public String getDataFim(){
        return dataFim;
    }

    public void setDataFim(String dataFim){
        this.dataFim = dataFim;
    }
}
