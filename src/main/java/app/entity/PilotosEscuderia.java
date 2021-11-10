package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PILOTOSESCUDERIA
* @generated
*/
@Entity
@Table(name = "\"PILOTOSESCUDERIA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PilotosEscuderia")
public class PilotosEscuderia implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_pilotos", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Pilotos pilotos;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_escuderia", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Escuderia escuderia;

    /**
    * Construtor
    * @generated
    */
    public PilotosEscuderia(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public PilotosEscuderia setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém pilotos
    * return pilotos
    * @generated
    */
    
    public Pilotos getPilotos(){
        return this.pilotos;
    }

    /**
    * Define pilotos
    * @param pilotos pilotos
    * @generated
    */
    public PilotosEscuderia setPilotos(Pilotos pilotos){
        this.pilotos = pilotos;
        return this;
    }
    /**
    * Obtém escuderia
    * return escuderia
    * @generated
    */
    
    public Escuderia getEscuderia(){
        return this.escuderia;
    }

    /**
    * Define escuderia
    * @param escuderia escuderia
    * @generated
    */
    public PilotosEscuderia setEscuderia(Escuderia escuderia){
        this.escuderia = escuderia;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PilotosEscuderia object = (PilotosEscuderia)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}