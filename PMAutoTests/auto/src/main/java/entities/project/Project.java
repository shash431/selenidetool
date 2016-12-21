package entities.project;

import org.apache.xpath.operations.Bool;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
import java.util.concurrent.atomic.DoubleAccumulator;

/**
 * @author: matcievskiy on 10.03.2016.
 */
@Entity(name = "PROJECTS")
public class Project {

    @Id
    private Integer Id;
    private Integer RedmineId;
    private String RedmineName;
    private Integer clientType;
    private String elanceODeskLink;
    private String elanceName;
    private String Budget;
    private String BudgetHours;
    private Date projectStart;
    private Date Deadline;
    private Integer paymentScheme;
    private Integer State;
    private Integer createdUserId;
    private Date createdDate;
    private Integer Show;
    private Integer currencyId;
    private Integer discount;
    private Integer bitbucketStatus;
    private Boolean IsMindMapNecesssary;
    private Boolean IsWikiNecesssary;
    private Boolean IsMindMapAddedToRedmine;
    private Boolean IsMilestonesCreated;
    private Boolean IsSkypeChatCreated;
    private Integer Activity;
    private Integer DiscountTypeId;
    private Integer DiscountPercent;
    private Integer PaymentTypeId;

    @Column(name="RedmineId")
    public Integer getRedmineId() {
        return RedmineId;
    }

    public void setRedmineId(Integer RedmineId) {
        this.RedmineId = RedmineId;
    }

    @Column(name="RedmineName")
    public String getRedmineName() {
        return RedmineName;
    }

    public void setRedmineName(String redmineProjectName) {
        this.RedmineName = redmineProjectName;
    }

    @Column(name = "ClientType")
    public Integer getClientType() {
        return clientType;
    }

    public void setClientType(Integer clientType) {
        this.clientType = clientType;
    }

    @Column(name = "Budget")
    public String getBudget() {
        return Budget;
    }

    public void setBudget(String Budget) {
        this.Budget = Budget;
    }

    @Column(name = "BudgetHours")
    public String getBudgetHours() {
        return BudgetHours;
    }


    public void setBudgetHours(String BudgetHours) {
        this.BudgetHours = BudgetHours;
    }

    @Column(name = "ProjectStart")
    public Date getProjectStart() {
        return projectStart;
    }

    public void setProjectStart(Date projectStart) {
        this.projectStart = projectStart;
    }

    @Column(name = "Deadline")
    public Date getDeadline() {
        return Deadline;
    }

    public void setDeadlinee(Date Deadline) {
        this.Deadline = Deadline;
    }

    @Column(name = "PaymentScheme")
    public Integer getPaymentScheme() {
        return paymentScheme;
    }

    public void setPaymentScheme(Integer paymentScheme) {
        this.paymentScheme = paymentScheme;
    }

    @Column(name = "State")
    public Integer getState() {
        return State;
    }

    public void setState(Integer State) {
        this.State = State;
    }

    @Column(name = "CreatedUserId")
    public Integer getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Integer createdUserId) {
        this.createdUserId = createdUserId;
    }

    @Column(name = "CreatedDate")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "Show")
    public Integer getShow() {
        return Show;
    }

    public void setShow(Integer Show) {
        this.Show = Show;
    }

    @Column(name="CurrencyId")
    public Integer getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }


    @Column(name = "BitbucketStatus")
    public Integer getBitbucketStatus() {
        return bitbucketStatus;
    }

    public void setBitbucketStatus(Integer bitbucketStatus) {
        this.bitbucketStatus = bitbucketStatus;
    }

    @Column(name = "IsMindMapNecesssarry")
    public Boolean isMindMapNecessary() {
        return IsMindMapNecesssary;
    }

    public void setIsMindMapNecessary(Boolean isMindMapNecessary) {
        this.IsMindMapNecesssary = isMindMapNecessary;
    }

    @Column(name = "IsWikiNecesssary")
    public Boolean getIsWikiNecesssary() {
        return IsWikiNecesssary;
    }

    public void setIsWikiNecessary(Boolean IsWikiNecesssary) {
        this.IsWikiNecesssary = IsWikiNecesssary;
    }

    @Column(name = "IsMindMapAddedToRedmine")
    public Boolean isMindMapAddedToRedmine() {
        return IsMindMapAddedToRedmine;
    }

    public void setIsMindMapAddedToRedmine(Boolean isMindMapAddedToRedmine) {
        this.IsMindMapAddedToRedmine = IsMindMapAddedToRedmine;
    }

    @Column(name = "IsMilestonesCreated")
    public Boolean getIsMileStoneCreated() {
        return IsMilestonesCreated;
    }

    public void setIsMileSoneCreated(Boolean IsMileStoneCreated) {
        this.IsMilestonesCreated = IsMilestonesCreated;
    }

    @Column(name = "IsSkypeChatCreated")
    public Boolean isSkypeChatCreated() {
        return IsSkypeChatCreated;
    }

    public void setIsSkypeChatCreated(Boolean isSkypeChatCreated) {
        this.IsSkypeChatCreated = isSkypeChatCreated;
    }

    @Column(name = "Activity")
    public Integer getActivity() {
        return Activity;
    }

    public void setActivity(Integer Activity) {
        this.Activity = Activity;
    }

    @Column(name = "DiscountTypeId")
    public Integer getDiscountTypeId() {
        return DiscountTypeId;
    }

    public void setDiscountTypeId(Integer discountTypeId) {
        DiscountTypeId = discountTypeId;
    }

    @Column(name = "DiscountPercent")
    public Integer getDiscountPercent() {
        return DiscountPercent;
    }

    public void setDiscountPercent(Integer discountPercent) {
        DiscountPercent = discountPercent;
    }

    @Column(name = "ElanceOdeskLink")
    public String getElanceODeskLink() {
        return elanceODeskLink;
    }

    public void setElanceODeskLink(String elanceODeskLink) {
        this.elanceODeskLink = elanceODeskLink;
    }

    @Column(name = "ElanceName")
    public String getElanceName() {
        return elanceName;
    }

    public void setElanceName(String elanceName) {
        this.elanceName = elanceName;
    }

    @Column(name = "Discount")
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Column(name = "PaymentTypeId")
    public Integer getPamentTypeId() {
        return PaymentTypeId;
    }

    public void setPamentTypeId(Integer PaymentTypeId) {
        this.PaymentTypeId = PaymentTypeId;
    }
}
