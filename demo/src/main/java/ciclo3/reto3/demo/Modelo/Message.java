/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclo3.reto3.demo.Modelo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author lufel
 */
@Entity
@Table(name = "message")

public class Message {
    
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer idMessage;
     private String messageText;

    @ManyToOne
    @JoinColumn(name = "carId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Carro car;
     
    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"messages","reservations"})
    private Client client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public Carro getCar() {
        return car;
    }

    public Client getClient() {
        return client;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public void setCar(Carro car) {
        this.car = car;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    
    
    
     
     
}
