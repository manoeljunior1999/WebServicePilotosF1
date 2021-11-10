package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PILOTOS
* @generated
*/
@Entity
@Table(name = "\"PILOTOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pilotos")
public class Pilotos implements Serializable {

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
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;

    /**
    * @generated
    */
    @Column(name = "nacionalidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nacionalidade;

    /**
    * @generated
    */
    @Column(name = "equipe", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String equipe;

    /**
    * Construtor
    * @generated
    */
    public Pilotos(){
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
    public Pilotos setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    
    public java.lang.String getNome(){
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Pilotos setNome(java.lang.String nome){
        this.nome = nome;
        return this;
    }
    /**
    * Obtém nacionalidade
    * return nacionalidade
    * @generated
    */
    
    public java.lang.String getNacionalidade(){
        return this.nacionalidade;
    }

    /**
    * Define nacionalidade
    * @param nacionalidade nacionalidade
    * @generated
    */
    public Pilotos setNacionalidade(java.lang.String nacionalidade){
        this.nacionalidade = nacionalidade;
        return this;
    }
    /**
    * Obtém equipe
    * return equipe
    * @generated
    */
    
    public java.lang.String getEquipe(){
        return this.equipe;
    }

    /**
    * Define equipe
    * @param equipe equipe
    * @generated
    */
    public Pilotos setEquipe(java.lang.String equipe){
        this.equipe = equipe;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pilotos object = (Pilotos)obj;
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