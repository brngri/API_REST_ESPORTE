package com.esportivo.restesporte.entidade;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class AtvEsporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long atvId;
    @Column(nullable = false)
    private String atvNome;
    @Column(nullable = false)
    private String atvDetalhe;
    @Column(nullable = false)
    private String atvTipo;
    @Column(nullable = false)
    private Double atvKilometragem;
    @Column(nullable = false)
    private String atvEsforco;

    public Long getAtvId() {
        return atvId;
    }
    public void setAtvId(Long atvId) {
        this.atvId = atvId;
    }
    public String getAtvNome() {
        return atvNome;
    }
    public void setAtvNome(String atvNome) {
        this.atvNome = atvNome;
    }
    public String getAtvDetalhe() {
        return atvDetalhe;
    }
    public void setAtvDetalhe(String atvDetalhe) {
        this.atvDetalhe = atvDetalhe;
    }
    public String getAtvTipo() {
        return atvTipo;
    }
    public void setAtvTipo(String atvTipo) {
        this.atvTipo = atvTipo;
    }
    public Double getAtvKilometragem() {
        return atvKilometragem;
    }
    public void setAtvKilometragem(Double atvKilometragem) {
        this.atvKilometragem = atvKilometragem;
    }
    public String getAtvEsforco() {
        return atvEsforco;
    }
    public void setAtvEsforco(String atvEsforco) {
        this.atvEsforco = atvEsforco;
    } 

}
