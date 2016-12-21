package entities.project;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author: matcievskiy on 10.03.2016.
 */
public class ElanceToProject {

    private Integer Id;
    private String ElanceName;
    private String ElanceLink;
    private Integer ProjectId;
    private Integer CreateUserId;
    private Integer UpdateUserId;
    private Date CreateDate;
    private Date UpdateDate;
    private Boolean IsActive;


    @Column(name = "ElanceName")
    public String getElanceName() {
        return ElanceName;
    }

    public void setElanceName(String elanceName) {
        ElanceName = elanceName;
    }

    @Column(name = "ElanceLink")
    public String getElanceLink() {
        return ElanceLink;
    }

    public void setElanceLink(String elanceLink) {
        ElanceLink = elanceLink;
    }

    @Column(name = "ProjectId")
    public Integer getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer projectId) {
        ProjectId = projectId;
    }

    @Column(name = "CreateUserId")
    public Integer getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        CreateUserId = createUserId;
    }

    @Column(name = "UpdateUserId")
    public Integer getUpdateUserId() {
        return UpdateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        UpdateUserId = updateUserId;
    }

    @Column(name = "CreateDate")
    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    @Column(name = "UpdateDate")
    public Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }

    @Column(name = "IsActive")
    public Boolean isActive() {
        return IsActive;
    }

    public void setIsActive(Boolean isActive) {
        IsActive = isActive;
    }
}
