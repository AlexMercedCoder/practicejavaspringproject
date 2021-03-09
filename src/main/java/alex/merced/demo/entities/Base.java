package alex.merced.demo.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

// This will be our base entity class for creating other models!


public abstract class Base implements Serializable {


    // MODEL CREATEDAT FIELD
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable=false)
    @CreatedDate
    private Date createdAt;

    // MODEL CREATEDAT FIELD
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    // GETTERS

    public Date getCreatedAt(){
        return this.createdAt;
    }

    public Date getUpdatedAt(){
        return this.updatedAt;
    }

    // Setters

    public void setCreatedAt(Date date){
        this.createdAt = date;
    }

    public void setUpdatedAt(Date date){
        this.updatedAt = date;
    }
}
