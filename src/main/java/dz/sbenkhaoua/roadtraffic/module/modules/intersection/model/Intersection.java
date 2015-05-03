package dz.sbenkhaoua.roadtraffic.module.modules.intersection.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by sbenkhaoua on 04/04/15.
 */
@Table(name="intersection")
@XmlRootElement
public class Intersection {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="insert_date")
    private String insertDate;
    @Column(name = "intersection_name")
    private String intersectionName;
    @Column(name = "pos_x")
    private  String posX;
    @Column(name = "pos_y")
    private String posY;
    @Column(name = "send_date")
    private String sendDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getIntersectionName() {
        return intersectionName;
    }

    public void setIntersectionName(String intersectionName) {
        this.intersectionName = intersectionName;
    }

    public String getPosX() {
        return posX;
    }

    public void setPosX(String posX) {
        this.posX = posX;
    }

    public String getPosY() {
        return posY;
    }

    public void setPosY(String posY) {
        this.posY = posY;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
}
