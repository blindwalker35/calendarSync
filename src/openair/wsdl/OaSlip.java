/**
 * OaSlip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaSlip  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String hour;

    private java.lang.String date;

    private java.lang.String unitm;

    private java.lang.String rate;

    private java.lang.String portfolio_projectid;

    private java.lang.String slip_stageid;

    private java.lang.String category_3Id;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String project_billing_ruleid;

    private java.lang.String cost;

    private java.lang.String tax_location_name;

    private java.lang.String sold_to_contactid;

    private java.lang.String description;

    private java.lang.String total;

    private java.lang.String categoryid;

    private java.lang.String category_2Id;

    private java.lang.String timer_start;

    private java.lang.String minute;

    private java.lang.String category_4Id;

    private java.lang.String customerid;

    private java.lang.String type;

    private java.lang.String agreementid;

    private java.lang.String payroll_typeid;

    private java.lang.String total_tax;

    private java.lang.String customerpoid;

    private java.lang.String projecttask_typeid;

    private java.lang.String category_1Id;

    private java.lang.String userid;

    private java.lang.String invoiceid;

    private java.lang.String job_code_id;

    private java.lang.String currency;

    private java.lang.String city;

    private java.lang.String decimal_hours;

    private java.lang.String cost_centerid;

    private java.lang.String ref_slipid;

    private java.lang.String payment_typeid;

    private java.lang.String originating_id;

    private java.lang.String gl_code;

    private java.lang.String category_5Id;

    private java.lang.String total_with_tax;

    private java.lang.String itemid;

    private java.lang.String shipping_contactid;

    private java.lang.String timetypeid;

    private java.lang.String quantity;

    private java.lang.String billing_contactid;

    private java.lang.String acct_date;

    private java.lang.String projectid;

    private java.lang.String created;

    private java.lang.String projecttaskid;

    private java.lang.String notes;

    private java.lang.String productid;

    private openair.wsdl.OaBase[] attributes;

    public OaSlip() {
    }

    public OaSlip(
           java.lang.String hour,
           java.lang.String date,
           java.lang.String unitm,
           java.lang.String rate,
           java.lang.String portfolio_projectid,
           java.lang.String slip_stageid,
           java.lang.String category_3Id,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String project_billing_ruleid,
           java.lang.String cost,
           java.lang.String tax_location_name,
           java.lang.String sold_to_contactid,
           java.lang.String description,
           java.lang.String total,
           java.lang.String categoryid,
           java.lang.String category_2Id,
           java.lang.String timer_start,
           java.lang.String minute,
           java.lang.String category_4Id,
           java.lang.String customerid,
           java.lang.String type,
           java.lang.String agreementid,
           java.lang.String payroll_typeid,
           java.lang.String total_tax,
           java.lang.String customerpoid,
           java.lang.String projecttask_typeid,
           java.lang.String category_1Id,
           java.lang.String userid,
           java.lang.String invoiceid,
           java.lang.String job_code_id,
           java.lang.String currency,
           java.lang.String city,
           java.lang.String decimal_hours,
           java.lang.String cost_centerid,
           java.lang.String ref_slipid,
           java.lang.String payment_typeid,
           java.lang.String originating_id,
           java.lang.String gl_code,
           java.lang.String category_5Id,
           java.lang.String total_with_tax,
           java.lang.String itemid,
           java.lang.String shipping_contactid,
           java.lang.String timetypeid,
           java.lang.String quantity,
           java.lang.String billing_contactid,
           java.lang.String acct_date,
           java.lang.String projectid,
           java.lang.String created,
           java.lang.String projecttaskid,
           java.lang.String notes,
           java.lang.String productid,
           openair.wsdl.OaBase[] attributes) {
        this.hour = hour;
        this.date = date;
        this.unitm = unitm;
        this.rate = rate;
        this.portfolio_projectid = portfolio_projectid;
        this.slip_stageid = slip_stageid;
        this.category_3Id = category_3Id;
        this.updated = updated;
        this.id = id;
        this.project_billing_ruleid = project_billing_ruleid;
        this.cost = cost;
        this.tax_location_name = tax_location_name;
        this.sold_to_contactid = sold_to_contactid;
        this.description = description;
        this.total = total;
        this.categoryid = categoryid;
        this.category_2Id = category_2Id;
        this.timer_start = timer_start;
        this.minute = minute;
        this.category_4Id = category_4Id;
        this.customerid = customerid;
        this.type = type;
        this.agreementid = agreementid;
        this.payroll_typeid = payroll_typeid;
        this.total_tax = total_tax;
        this.customerpoid = customerpoid;
        this.projecttask_typeid = projecttask_typeid;
        this.category_1Id = category_1Id;
        this.userid = userid;
        this.invoiceid = invoiceid;
        this.job_code_id = job_code_id;
        this.currency = currency;
        this.city = city;
        this.decimal_hours = decimal_hours;
        this.cost_centerid = cost_centerid;
        this.ref_slipid = ref_slipid;
        this.payment_typeid = payment_typeid;
        this.originating_id = originating_id;
        this.gl_code = gl_code;
        this.category_5Id = category_5Id;
        this.total_with_tax = total_with_tax;
        this.itemid = itemid;
        this.shipping_contactid = shipping_contactid;
        this.timetypeid = timetypeid;
        this.quantity = quantity;
        this.billing_contactid = billing_contactid;
        this.acct_date = acct_date;
        this.projectid = projectid;
        this.created = created;
        this.projecttaskid = projecttaskid;
        this.notes = notes;
        this.productid = productid;
        this.attributes = attributes;
    }


    /**
     * Gets the hour value for this OaSlip.
     * 
     * @return hour
     */
    public java.lang.String getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this OaSlip.
     * 
     * @param hour
     */
    public void setHour(java.lang.String hour) {
        this.hour = hour;
    }


    /**
     * Gets the date value for this OaSlip.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaSlip.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the unitm value for this OaSlip.
     * 
     * @return unitm
     */
    public java.lang.String getUnitm() {
        return unitm;
    }


    /**
     * Sets the unitm value for this OaSlip.
     * 
     * @param unitm
     */
    public void setUnitm(java.lang.String unitm) {
        this.unitm = unitm;
    }


    /**
     * Gets the rate value for this OaSlip.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OaSlip.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the portfolio_projectid value for this OaSlip.
     * 
     * @return portfolio_projectid
     */
    public java.lang.String getPortfolio_projectid() {
        return portfolio_projectid;
    }


    /**
     * Sets the portfolio_projectid value for this OaSlip.
     * 
     * @param portfolio_projectid
     */
    public void setPortfolio_projectid(java.lang.String portfolio_projectid) {
        this.portfolio_projectid = portfolio_projectid;
    }


    /**
     * Gets the slip_stageid value for this OaSlip.
     * 
     * @return slip_stageid
     */
    public java.lang.String getSlip_stageid() {
        return slip_stageid;
    }


    /**
     * Sets the slip_stageid value for this OaSlip.
     * 
     * @param slip_stageid
     */
    public void setSlip_stageid(java.lang.String slip_stageid) {
        this.slip_stageid = slip_stageid;
    }


    /**
     * Gets the category_3Id value for this OaSlip.
     * 
     * @return category_3Id
     */
    public java.lang.String getCategory_3Id() {
        return category_3Id;
    }


    /**
     * Sets the category_3Id value for this OaSlip.
     * 
     * @param category_3Id
     */
    public void setCategory_3Id(java.lang.String category_3Id) {
        this.category_3Id = category_3Id;
    }


    /**
     * Gets the updated value for this OaSlip.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaSlip.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaSlip.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaSlip.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the project_billing_ruleid value for this OaSlip.
     * 
     * @return project_billing_ruleid
     */
    public java.lang.String getProject_billing_ruleid() {
        return project_billing_ruleid;
    }


    /**
     * Sets the project_billing_ruleid value for this OaSlip.
     * 
     * @param project_billing_ruleid
     */
    public void setProject_billing_ruleid(java.lang.String project_billing_ruleid) {
        this.project_billing_ruleid = project_billing_ruleid;
    }


    /**
     * Gets the cost value for this OaSlip.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this OaSlip.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
    }


    /**
     * Gets the tax_location_name value for this OaSlip.
     * 
     * @return tax_location_name
     */
    public java.lang.String getTax_location_name() {
        return tax_location_name;
    }


    /**
     * Sets the tax_location_name value for this OaSlip.
     * 
     * @param tax_location_name
     */
    public void setTax_location_name(java.lang.String tax_location_name) {
        this.tax_location_name = tax_location_name;
    }


    /**
     * Gets the sold_to_contactid value for this OaSlip.
     * 
     * @return sold_to_contactid
     */
    public java.lang.String getSold_to_contactid() {
        return sold_to_contactid;
    }


    /**
     * Sets the sold_to_contactid value for this OaSlip.
     * 
     * @param sold_to_contactid
     */
    public void setSold_to_contactid(java.lang.String sold_to_contactid) {
        this.sold_to_contactid = sold_to_contactid;
    }


    /**
     * Gets the description value for this OaSlip.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaSlip.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the total value for this OaSlip.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OaSlip.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the categoryid value for this OaSlip.
     * 
     * @return categoryid
     */
    public java.lang.String getCategoryid() {
        return categoryid;
    }


    /**
     * Sets the categoryid value for this OaSlip.
     * 
     * @param categoryid
     */
    public void setCategoryid(java.lang.String categoryid) {
        this.categoryid = categoryid;
    }


    /**
     * Gets the category_2Id value for this OaSlip.
     * 
     * @return category_2Id
     */
    public java.lang.String getCategory_2Id() {
        return category_2Id;
    }


    /**
     * Sets the category_2Id value for this OaSlip.
     * 
     * @param category_2Id
     */
    public void setCategory_2Id(java.lang.String category_2Id) {
        this.category_2Id = category_2Id;
    }


    /**
     * Gets the timer_start value for this OaSlip.
     * 
     * @return timer_start
     */
    public java.lang.String getTimer_start() {
        return timer_start;
    }


    /**
     * Sets the timer_start value for this OaSlip.
     * 
     * @param timer_start
     */
    public void setTimer_start(java.lang.String timer_start) {
        this.timer_start = timer_start;
    }


    /**
     * Gets the minute value for this OaSlip.
     * 
     * @return minute
     */
    public java.lang.String getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this OaSlip.
     * 
     * @param minute
     */
    public void setMinute(java.lang.String minute) {
        this.minute = minute;
    }


    /**
     * Gets the category_4Id value for this OaSlip.
     * 
     * @return category_4Id
     */
    public java.lang.String getCategory_4Id() {
        return category_4Id;
    }


    /**
     * Sets the category_4Id value for this OaSlip.
     * 
     * @param category_4Id
     */
    public void setCategory_4Id(java.lang.String category_4Id) {
        this.category_4Id = category_4Id;
    }


    /**
     * Gets the customerid value for this OaSlip.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaSlip.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the type value for this OaSlip.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaSlip.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the agreementid value for this OaSlip.
     * 
     * @return agreementid
     */
    public java.lang.String getAgreementid() {
        return agreementid;
    }


    /**
     * Sets the agreementid value for this OaSlip.
     * 
     * @param agreementid
     */
    public void setAgreementid(java.lang.String agreementid) {
        this.agreementid = agreementid;
    }


    /**
     * Gets the payroll_typeid value for this OaSlip.
     * 
     * @return payroll_typeid
     */
    public java.lang.String getPayroll_typeid() {
        return payroll_typeid;
    }


    /**
     * Sets the payroll_typeid value for this OaSlip.
     * 
     * @param payroll_typeid
     */
    public void setPayroll_typeid(java.lang.String payroll_typeid) {
        this.payroll_typeid = payroll_typeid;
    }


    /**
     * Gets the total_tax value for this OaSlip.
     * 
     * @return total_tax
     */
    public java.lang.String getTotal_tax() {
        return total_tax;
    }


    /**
     * Sets the total_tax value for this OaSlip.
     * 
     * @param total_tax
     */
    public void setTotal_tax(java.lang.String total_tax) {
        this.total_tax = total_tax;
    }


    /**
     * Gets the customerpoid value for this OaSlip.
     * 
     * @return customerpoid
     */
    public java.lang.String getCustomerpoid() {
        return customerpoid;
    }


    /**
     * Sets the customerpoid value for this OaSlip.
     * 
     * @param customerpoid
     */
    public void setCustomerpoid(java.lang.String customerpoid) {
        this.customerpoid = customerpoid;
    }


    /**
     * Gets the projecttask_typeid value for this OaSlip.
     * 
     * @return projecttask_typeid
     */
    public java.lang.String getProjecttask_typeid() {
        return projecttask_typeid;
    }


    /**
     * Sets the projecttask_typeid value for this OaSlip.
     * 
     * @param projecttask_typeid
     */
    public void setProjecttask_typeid(java.lang.String projecttask_typeid) {
        this.projecttask_typeid = projecttask_typeid;
    }


    /**
     * Gets the category_1Id value for this OaSlip.
     * 
     * @return category_1Id
     */
    public java.lang.String getCategory_1Id() {
        return category_1Id;
    }


    /**
     * Sets the category_1Id value for this OaSlip.
     * 
     * @param category_1Id
     */
    public void setCategory_1Id(java.lang.String category_1Id) {
        this.category_1Id = category_1Id;
    }


    /**
     * Gets the userid value for this OaSlip.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaSlip.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the invoiceid value for this OaSlip.
     * 
     * @return invoiceid
     */
    public java.lang.String getInvoiceid() {
        return invoiceid;
    }


    /**
     * Sets the invoiceid value for this OaSlip.
     * 
     * @param invoiceid
     */
    public void setInvoiceid(java.lang.String invoiceid) {
        this.invoiceid = invoiceid;
    }


    /**
     * Gets the job_code_id value for this OaSlip.
     * 
     * @return job_code_id
     */
    public java.lang.String getJob_code_id() {
        return job_code_id;
    }


    /**
     * Sets the job_code_id value for this OaSlip.
     * 
     * @param job_code_id
     */
    public void setJob_code_id(java.lang.String job_code_id) {
        this.job_code_id = job_code_id;
    }


    /**
     * Gets the currency value for this OaSlip.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaSlip.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the city value for this OaSlip.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this OaSlip.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the decimal_hours value for this OaSlip.
     * 
     * @return decimal_hours
     */
    public java.lang.String getDecimal_hours() {
        return decimal_hours;
    }


    /**
     * Sets the decimal_hours value for this OaSlip.
     * 
     * @param decimal_hours
     */
    public void setDecimal_hours(java.lang.String decimal_hours) {
        this.decimal_hours = decimal_hours;
    }


    /**
     * Gets the cost_centerid value for this OaSlip.
     * 
     * @return cost_centerid
     */
    public java.lang.String getCost_centerid() {
        return cost_centerid;
    }


    /**
     * Sets the cost_centerid value for this OaSlip.
     * 
     * @param cost_centerid
     */
    public void setCost_centerid(java.lang.String cost_centerid) {
        this.cost_centerid = cost_centerid;
    }


    /**
     * Gets the ref_slipid value for this OaSlip.
     * 
     * @return ref_slipid
     */
    public java.lang.String getRef_slipid() {
        return ref_slipid;
    }


    /**
     * Sets the ref_slipid value for this OaSlip.
     * 
     * @param ref_slipid
     */
    public void setRef_slipid(java.lang.String ref_slipid) {
        this.ref_slipid = ref_slipid;
    }


    /**
     * Gets the payment_typeid value for this OaSlip.
     * 
     * @return payment_typeid
     */
    public java.lang.String getPayment_typeid() {
        return payment_typeid;
    }


    /**
     * Sets the payment_typeid value for this OaSlip.
     * 
     * @param payment_typeid
     */
    public void setPayment_typeid(java.lang.String payment_typeid) {
        this.payment_typeid = payment_typeid;
    }


    /**
     * Gets the originating_id value for this OaSlip.
     * 
     * @return originating_id
     */
    public java.lang.String getOriginating_id() {
        return originating_id;
    }


    /**
     * Sets the originating_id value for this OaSlip.
     * 
     * @param originating_id
     */
    public void setOriginating_id(java.lang.String originating_id) {
        this.originating_id = originating_id;
    }


    /**
     * Gets the gl_code value for this OaSlip.
     * 
     * @return gl_code
     */
    public java.lang.String getGl_code() {
        return gl_code;
    }


    /**
     * Sets the gl_code value for this OaSlip.
     * 
     * @param gl_code
     */
    public void setGl_code(java.lang.String gl_code) {
        this.gl_code = gl_code;
    }


    /**
     * Gets the category_5Id value for this OaSlip.
     * 
     * @return category_5Id
     */
    public java.lang.String getCategory_5Id() {
        return category_5Id;
    }


    /**
     * Sets the category_5Id value for this OaSlip.
     * 
     * @param category_5Id
     */
    public void setCategory_5Id(java.lang.String category_5Id) {
        this.category_5Id = category_5Id;
    }


    /**
     * Gets the total_with_tax value for this OaSlip.
     * 
     * @return total_with_tax
     */
    public java.lang.String getTotal_with_tax() {
        return total_with_tax;
    }


    /**
     * Sets the total_with_tax value for this OaSlip.
     * 
     * @param total_with_tax
     */
    public void setTotal_with_tax(java.lang.String total_with_tax) {
        this.total_with_tax = total_with_tax;
    }


    /**
     * Gets the itemid value for this OaSlip.
     * 
     * @return itemid
     */
    public java.lang.String getItemid() {
        return itemid;
    }


    /**
     * Sets the itemid value for this OaSlip.
     * 
     * @param itemid
     */
    public void setItemid(java.lang.String itemid) {
        this.itemid = itemid;
    }


    /**
     * Gets the shipping_contactid value for this OaSlip.
     * 
     * @return shipping_contactid
     */
    public java.lang.String getShipping_contactid() {
        return shipping_contactid;
    }


    /**
     * Sets the shipping_contactid value for this OaSlip.
     * 
     * @param shipping_contactid
     */
    public void setShipping_contactid(java.lang.String shipping_contactid) {
        this.shipping_contactid = shipping_contactid;
    }


    /**
     * Gets the timetypeid value for this OaSlip.
     * 
     * @return timetypeid
     */
    public java.lang.String getTimetypeid() {
        return timetypeid;
    }


    /**
     * Sets the timetypeid value for this OaSlip.
     * 
     * @param timetypeid
     */
    public void setTimetypeid(java.lang.String timetypeid) {
        this.timetypeid = timetypeid;
    }


    /**
     * Gets the quantity value for this OaSlip.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OaSlip.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the billing_contactid value for this OaSlip.
     * 
     * @return billing_contactid
     */
    public java.lang.String getBilling_contactid() {
        return billing_contactid;
    }


    /**
     * Sets the billing_contactid value for this OaSlip.
     * 
     * @param billing_contactid
     */
    public void setBilling_contactid(java.lang.String billing_contactid) {
        this.billing_contactid = billing_contactid;
    }


    /**
     * Gets the acct_date value for this OaSlip.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaSlip.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the projectid value for this OaSlip.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaSlip.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the created value for this OaSlip.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaSlip.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the projecttaskid value for this OaSlip.
     * 
     * @return projecttaskid
     */
    public java.lang.String getProjecttaskid() {
        return projecttaskid;
    }


    /**
     * Sets the projecttaskid value for this OaSlip.
     * 
     * @param projecttaskid
     */
    public void setProjecttaskid(java.lang.String projecttaskid) {
        this.projecttaskid = projecttaskid;
    }


    /**
     * Gets the notes value for this OaSlip.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaSlip.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the productid value for this OaSlip.
     * 
     * @return productid
     */
    public java.lang.String getProductid() {
        return productid;
    }


    /**
     * Sets the productid value for this OaSlip.
     * 
     * @param productid
     */
    public void setProductid(java.lang.String productid) {
        this.productid = productid;
    }


    /**
     * Gets the attributes value for this OaSlip.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaSlip.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaSlip)) return false;
        OaSlip other = (OaSlip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.hour==null && other.getHour()==null) || 
             (this.hour!=null &&
              this.hour.equals(other.getHour()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.unitm==null && other.getUnitm()==null) || 
             (this.unitm!=null &&
              this.unitm.equals(other.getUnitm()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.portfolio_projectid==null && other.getPortfolio_projectid()==null) || 
             (this.portfolio_projectid!=null &&
              this.portfolio_projectid.equals(other.getPortfolio_projectid()))) &&
            ((this.slip_stageid==null && other.getSlip_stageid()==null) || 
             (this.slip_stageid!=null &&
              this.slip_stageid.equals(other.getSlip_stageid()))) &&
            ((this.category_3Id==null && other.getCategory_3Id()==null) || 
             (this.category_3Id!=null &&
              this.category_3Id.equals(other.getCategory_3Id()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.project_billing_ruleid==null && other.getProject_billing_ruleid()==null) || 
             (this.project_billing_ruleid!=null &&
              this.project_billing_ruleid.equals(other.getProject_billing_ruleid()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.tax_location_name==null && other.getTax_location_name()==null) || 
             (this.tax_location_name!=null &&
              this.tax_location_name.equals(other.getTax_location_name()))) &&
            ((this.sold_to_contactid==null && other.getSold_to_contactid()==null) || 
             (this.sold_to_contactid!=null &&
              this.sold_to_contactid.equals(other.getSold_to_contactid()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.categoryid==null && other.getCategoryid()==null) || 
             (this.categoryid!=null &&
              this.categoryid.equals(other.getCategoryid()))) &&
            ((this.category_2Id==null && other.getCategory_2Id()==null) || 
             (this.category_2Id!=null &&
              this.category_2Id.equals(other.getCategory_2Id()))) &&
            ((this.timer_start==null && other.getTimer_start()==null) || 
             (this.timer_start!=null &&
              this.timer_start.equals(other.getTimer_start()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.category_4Id==null && other.getCategory_4Id()==null) || 
             (this.category_4Id!=null &&
              this.category_4Id.equals(other.getCategory_4Id()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.agreementid==null && other.getAgreementid()==null) || 
             (this.agreementid!=null &&
              this.agreementid.equals(other.getAgreementid()))) &&
            ((this.payroll_typeid==null && other.getPayroll_typeid()==null) || 
             (this.payroll_typeid!=null &&
              this.payroll_typeid.equals(other.getPayroll_typeid()))) &&
            ((this.total_tax==null && other.getTotal_tax()==null) || 
             (this.total_tax!=null &&
              this.total_tax.equals(other.getTotal_tax()))) &&
            ((this.customerpoid==null && other.getCustomerpoid()==null) || 
             (this.customerpoid!=null &&
              this.customerpoid.equals(other.getCustomerpoid()))) &&
            ((this.projecttask_typeid==null && other.getProjecttask_typeid()==null) || 
             (this.projecttask_typeid!=null &&
              this.projecttask_typeid.equals(other.getProjecttask_typeid()))) &&
            ((this.category_1Id==null && other.getCategory_1Id()==null) || 
             (this.category_1Id!=null &&
              this.category_1Id.equals(other.getCategory_1Id()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.invoiceid==null && other.getInvoiceid()==null) || 
             (this.invoiceid!=null &&
              this.invoiceid.equals(other.getInvoiceid()))) &&
            ((this.job_code_id==null && other.getJob_code_id()==null) || 
             (this.job_code_id!=null &&
              this.job_code_id.equals(other.getJob_code_id()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.decimal_hours==null && other.getDecimal_hours()==null) || 
             (this.decimal_hours!=null &&
              this.decimal_hours.equals(other.getDecimal_hours()))) &&
            ((this.cost_centerid==null && other.getCost_centerid()==null) || 
             (this.cost_centerid!=null &&
              this.cost_centerid.equals(other.getCost_centerid()))) &&
            ((this.ref_slipid==null && other.getRef_slipid()==null) || 
             (this.ref_slipid!=null &&
              this.ref_slipid.equals(other.getRef_slipid()))) &&
            ((this.payment_typeid==null && other.getPayment_typeid()==null) || 
             (this.payment_typeid!=null &&
              this.payment_typeid.equals(other.getPayment_typeid()))) &&
            ((this.originating_id==null && other.getOriginating_id()==null) || 
             (this.originating_id!=null &&
              this.originating_id.equals(other.getOriginating_id()))) &&
            ((this.gl_code==null && other.getGl_code()==null) || 
             (this.gl_code!=null &&
              this.gl_code.equals(other.getGl_code()))) &&
            ((this.category_5Id==null && other.getCategory_5Id()==null) || 
             (this.category_5Id!=null &&
              this.category_5Id.equals(other.getCategory_5Id()))) &&
            ((this.total_with_tax==null && other.getTotal_with_tax()==null) || 
             (this.total_with_tax!=null &&
              this.total_with_tax.equals(other.getTotal_with_tax()))) &&
            ((this.itemid==null && other.getItemid()==null) || 
             (this.itemid!=null &&
              this.itemid.equals(other.getItemid()))) &&
            ((this.shipping_contactid==null && other.getShipping_contactid()==null) || 
             (this.shipping_contactid!=null &&
              this.shipping_contactid.equals(other.getShipping_contactid()))) &&
            ((this.timetypeid==null && other.getTimetypeid()==null) || 
             (this.timetypeid!=null &&
              this.timetypeid.equals(other.getTimetypeid()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.billing_contactid==null && other.getBilling_contactid()==null) || 
             (this.billing_contactid!=null &&
              this.billing_contactid.equals(other.getBilling_contactid()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.projecttaskid==null && other.getProjecttaskid()==null) || 
             (this.projecttaskid!=null &&
              this.projecttaskid.equals(other.getProjecttaskid()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.productid==null && other.getProductid()==null) || 
             (this.productid!=null &&
              this.productid.equals(other.getProductid()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getHour() != null) {
            _hashCode += getHour().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getUnitm() != null) {
            _hashCode += getUnitm().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getPortfolio_projectid() != null) {
            _hashCode += getPortfolio_projectid().hashCode();
        }
        if (getSlip_stageid() != null) {
            _hashCode += getSlip_stageid().hashCode();
        }
        if (getCategory_3Id() != null) {
            _hashCode += getCategory_3Id().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getProject_billing_ruleid() != null) {
            _hashCode += getProject_billing_ruleid().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getTax_location_name() != null) {
            _hashCode += getTax_location_name().hashCode();
        }
        if (getSold_to_contactid() != null) {
            _hashCode += getSold_to_contactid().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getCategoryid() != null) {
            _hashCode += getCategoryid().hashCode();
        }
        if (getCategory_2Id() != null) {
            _hashCode += getCategory_2Id().hashCode();
        }
        if (getTimer_start() != null) {
            _hashCode += getTimer_start().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getCategory_4Id() != null) {
            _hashCode += getCategory_4Id().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAgreementid() != null) {
            _hashCode += getAgreementid().hashCode();
        }
        if (getPayroll_typeid() != null) {
            _hashCode += getPayroll_typeid().hashCode();
        }
        if (getTotal_tax() != null) {
            _hashCode += getTotal_tax().hashCode();
        }
        if (getCustomerpoid() != null) {
            _hashCode += getCustomerpoid().hashCode();
        }
        if (getProjecttask_typeid() != null) {
            _hashCode += getProjecttask_typeid().hashCode();
        }
        if (getCategory_1Id() != null) {
            _hashCode += getCategory_1Id().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getInvoiceid() != null) {
            _hashCode += getInvoiceid().hashCode();
        }
        if (getJob_code_id() != null) {
            _hashCode += getJob_code_id().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDecimal_hours() != null) {
            _hashCode += getDecimal_hours().hashCode();
        }
        if (getCost_centerid() != null) {
            _hashCode += getCost_centerid().hashCode();
        }
        if (getRef_slipid() != null) {
            _hashCode += getRef_slipid().hashCode();
        }
        if (getPayment_typeid() != null) {
            _hashCode += getPayment_typeid().hashCode();
        }
        if (getOriginating_id() != null) {
            _hashCode += getOriginating_id().hashCode();
        }
        if (getGl_code() != null) {
            _hashCode += getGl_code().hashCode();
        }
        if (getCategory_5Id() != null) {
            _hashCode += getCategory_5Id().hashCode();
        }
        if (getTotal_with_tax() != null) {
            _hashCode += getTotal_with_tax().hashCode();
        }
        if (getItemid() != null) {
            _hashCode += getItemid().hashCode();
        }
        if (getShipping_contactid() != null) {
            _hashCode += getShipping_contactid().hashCode();
        }
        if (getTimetypeid() != null) {
            _hashCode += getTimetypeid().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getBilling_contactid() != null) {
            _hashCode += getBilling_contactid().hashCode();
        }
        if (getAcct_date() != null) {
            _hashCode += getAcct_date().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getProjecttaskid() != null) {
            _hashCode += getProjecttaskid().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getProductid() != null) {
            _hashCode += getProductid().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OaSlip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSlip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unitm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolio_projectid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolio_projectid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slip_stageid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_stageid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_3Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_3id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_billing_ruleid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_billing_ruleid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_location_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_location_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sold_to_contactid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sold_to_contactid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_2Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_2id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timer_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timer_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_4Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_4id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreementid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payroll_typeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payroll_typeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerpoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerpoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projecttask_typeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projecttask_typeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_1Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_1id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job_code_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job_code_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimal_hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decimal_hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_centerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_centerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_slipid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_slipid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_typeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_typeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originating_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originating_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gl_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gl_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_5Id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_5id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_with_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_with_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_contactid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_contactid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timetypeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timetypeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_contactid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_contactid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projecttaskid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projecttaskid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
