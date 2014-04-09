/*
 * Copyright 2014 boby.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.adraood.homebox.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boby
 */
@javax.persistence.Entity
@Table(name = "Sensor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sensor.findAll", query = "SELECT s FROM Sensor s"),
    @NamedQuery(name = "Sensor.findById", query = "SELECT s FROM Sensor s WHERE s.id = :id"),
    @NamedQuery(name = "Sensor.findByName", query = "SELECT s FROM Sensor s WHERE s.name = :name"),
    @NamedQuery(name = "Sensor.findByType", query = "SELECT s FROM Sensor s WHERE s.type = :type"),
    @NamedQuery(name = "Sensor.findByMinValue", query = "SELECT s FROM Sensor s WHERE s.minValue = :minValue"),
    @NamedQuery(name = "Sensor.findByMaxValue", query = "SELECT s FROM Sensor s WHERE s.maxValue = :maxValue"),
    @NamedQuery(name = "Sensor.findByScale", query = "SELECT s FROM Sensor s WHERE s.scale = :scale")})
public class Sensor implements Entity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Basic(optional = false)
    @Column(name = "type", nullable = false, length = 20)
    private String type;
    @Basic(optional = false)
    @Column(name = "min_value", nullable = false)
    private float minValue;
    @Basic(optional = false)
    @Column(name = "max_value", nullable = false)
    private float maxValue;
    @Basic(optional = false)
    @Column(name = "scale", nullable = false, length = 20)
    private String scale;

    public Sensor() {
    }

    public Sensor(Integer id) {
        this.id = id;
    }

    public Sensor(Integer id, String name, String type, float minValue, float maxValue, String scale) {
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
        if (!(object instanceof Sensor)) {
            return false;
        }
        Sensor other = (Sensor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.dontdrinkandroot.example.angularrestspringsecurity.entity.Sensor[ id=" + id + " ]";
    }
    
}
