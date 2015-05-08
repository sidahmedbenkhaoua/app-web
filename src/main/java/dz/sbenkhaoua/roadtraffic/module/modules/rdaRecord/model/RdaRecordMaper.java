package dz.sbenkhaoua.roadtraffic.module.modules.rdaRecord.model;



import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by sbenkhaoua on 30/04/15.
 */
@Table(name = "rda_record")
@XmlRootElement
public class RdaRecordMaper {
    @Id
    private String id;
    @Column(name = "num")
    private Integer num;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_record")
    private Date dateRecord;
    private String active;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Date getDateRecord() {
        return dateRecord;
    }

    public void setDateRecord(Date dateRecord) {
        this.dateRecord = dateRecord;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
