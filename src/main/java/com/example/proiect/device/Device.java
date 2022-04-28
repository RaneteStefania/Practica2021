package com.example.proiect.device;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Device {
    @Id
    @SequenceGenerator(
            name="device_sequence",
            sequenceName="device_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "device_sequence"
    )
    private Long Id;
    private String Locatie;
    private Integer PresiuneAtm;
    private Float Tempetarura;
    private Integer Umiditate;
    private LocalDate DataInregistare;

    public Device() {
    }

    public Device(Long id, String locatie, Integer presiuneAtm, Float tempetarura, Integer umiditate, LocalDate dataInregistrare) {
        Id = id;
        Locatie = locatie;
        PresiuneAtm = presiuneAtm;
        Tempetarura = tempetarura;
        Umiditate = umiditate;
        DataInregistare=dataInregistrare;
    }

    public Device(String locatie, Integer presiuneAtm, Float tempetarura, Integer umiditate, LocalDate dataInregistrare) {
        Locatie = locatie;
        PresiuneAtm = presiuneAtm;
        Tempetarura = tempetarura;
        Umiditate = umiditate;
        DataInregistare=dataInregistrare;
    }


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
    public String getLocatie() {
        return Locatie;
    }

    public void setLocatie(String locatie) {
        Locatie = locatie;
    }
    public Integer getPresiuneAtm() {
        return PresiuneAtm;
    }

    public void setPresiuneAtm(Integer presiuneAtm) {
        PresiuneAtm = presiuneAtm;
    }

    public Float getTempetarura() {
        return Tempetarura;
    }

    public void setTempetarura(Float tempetarura) {
        Tempetarura = tempetarura;
    }

    public Integer getUmiditate() {
        return Umiditate;
    }

    public void setUmiditate(Integer umiditate) {
        Umiditate = umiditate;
    }

    public LocalDate getDataInregistare() {
        return DataInregistare;
    }

    public void setDataInregistare(LocalDate dataInregistare) {
        DataInregistare = dataInregistare;
    }

    @Override
    public String toString() {
        return "Device{" +
                "Id=" + Id +
                ", Locatie="+Locatie +
                ", PresiuneAtm=" + PresiuneAtm +
                ", Tempetarura=" + Tempetarura +
                ", Umiditate=" + Umiditate +
                ", DataInregistare=" + DataInregistare +
                '}';
    }

}
