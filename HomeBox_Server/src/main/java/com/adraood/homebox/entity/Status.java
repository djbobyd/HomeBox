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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boby
 */
@Entity
@Table(name = "Status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Status.findAll", query = "SELECT s FROM Status s"),
    @NamedQuery(name = "Status.findById", query = "SELECT s FROM Status s WHERE s.id = :id"),
    @NamedQuery(name = "Status.findByControllerId", query = "SELECT s FROM Status s WHERE s.controllerId = :controllerId"),
    @NamedQuery(name = "Status.findBySensorId", query = "SELECT s FROM Status s WHERE s.sensorId = :sensorId"),
    @NamedQuery(name = "Status.findBySwitchId", query = "SELECT s FROM Status s WHERE s.switchId = :switchId"),
    @NamedQuery(name = "Status.findBySwitchStatus", query = "SELECT s FROM Status s WHERE s.switchStatus = :switchStatus"),
    @NamedQuery(name = "Status.findBySensorValue", query = "SELECT s FROM Status s WHERE s.sensorValue = :sensorValue"),
    @NamedQuery(name = "Status.findByUserId", query = "SELECT s FROM Status s WHERE s.userId = :userId")})
public class Status implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "controller_id", nullable = false)
    private int controllerId;
    @Basic(optional = false)
    @Column(name = "sensor_id", nullable = false)
    private int sensorId;
    @Basic(optional = false)
    @Column(name = "switch_id", nullable = false)
    private int switchId;
    @Basic(optional = false)
    @Column(name = "switch_status", nullable = false)
    private boolean switchStatus;
    @Basic(optional = false)
    @Column(name = "sensor_value", nullable = false)
    private int sensorValue;
    @Basic(optional = false)
    @Column(name = "user_id", nullable = false)
    private int userId;

    public Status() {
    }

    public Status(Integer id) {
        this.id = id;
    }

    public Status(Integer id, int controllerId, int sensorId, int switchId, boolean switchStatus, int sensorValue, int userId) {
        this.id = id;
        this.controllerId = controllerId;
        this.sensorId = sensorId;
        this.switchId = switchId;
        this.switchStatus = switchStatus;
        this.sensorValue = sensorValue;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getControllerId() {
        return controllerId;
    }

    public void setControllerId(int controllerId) {
        this.controllerId = controllerId;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public int getSwitchId() {
        return switchId;
    }

    public void setSwitchId(int switchId) {
        this.switchId = switchId;
    }

    public boolean getSwitchStatus() {
        return switchStatus;
    }

    public void setSwitchStatus(boolean switchStatus) {
        this.switchStatus = switchStatus;
    }

    public int getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(int sensorValue) {
        this.sensorValue = sensorValue;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        if (!(object instanceof Status)) {
            return false;
        }
        Status other = (Status) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.dontdrinkandroot.example.angularrestspringsecurity.entity.Status[ id=" + id + " ]";
    }
    
}
