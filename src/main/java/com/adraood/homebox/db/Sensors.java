/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.adraood.homebox.db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boby
 */
@Entity
@Table(name = "Sensors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sensors.findAll", query = "SELECT s FROM Sensors s"),
    @NamedQuery(name = "Sensors.findById", query = "SELECT s FROM Sensors s WHERE s.id = :id"),
    @NamedQuery(name = "Sensors.findByName", query = "SELECT s FROM Sensors s WHERE s.name = :name"),
    @NamedQuery(name = "Sensors.findByType", query = "SELECT s FROM Sensors s WHERE s.type = :type"),
    @NamedQuery(name = "Sensors.findByMinValue", query = "SELECT s FROM Sensors s WHERE s.minValue = :minValue"),
    @NamedQuery(name = "Sensors.findByMaxValue", query = "SELECT s FROM Sensors s WHERE s.maxValue = :maxValue"),
    @NamedQuery(name = "Sensors.findByScale", query = "SELECT s FROM Sensors s WHERE s.scale = :scale")})
public class Sensors implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @NotNull
    @Column(name = "min_value")
    private float minValue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "max_value")
    private float maxValue;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "scale")
    private String scale;

    public Sensors() {
    }

    public Sensors(Integer id) {
        this.id = id;
    }

    public Sensors(Integer id, String name, String type, float minValue, float maxValue, String scale) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.scale = scale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getMinValue() {
        return minValue;
    }

    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sensors)) {
            return false;
        }
        Sensors other = (Sensors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.adraood.homebox.Sensors[ id=" + id + " ]";
    }
    
}
