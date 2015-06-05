/**
 * OaTicket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaTicket  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String missing_receipt;

    private java.lang.String unitm;

    private java.lang.String reference_number;

    private java.lang.String attachmentid;

    private java.lang.String currency_total_tax_paid;

    private java.lang.String tax_rateid;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String currency_rate;

    private java.lang.String total_no_tax;

    private java.lang.String project_taskid;

    private java.lang.String thin_client_id;

    private java.lang.String cost;

    private java.lang.String tax_location_name;

    private java.lang.String non_billable;

    private java.lang.String total;

    private java.lang.String externalid;

    private java.lang.String description;

    private java.lang.String categoryid;

    private java.lang.String customerid;

    private java.lang.String paymethod;

    private java.lang.String projecttask_typeid;

    private java.lang.String user_locationid;

    private java.lang.String userid;

    private java.lang.String status;

    private java.lang.String currency;

    private java.lang.String city;

    private java.lang.String cost_centerid;

    private java.lang.String slipid;

    private java.lang.String currency_cost;

    private java.lang.String payment_typeid;

    private java.lang.String currency_symbol;

    private java.lang.String tax_location_id;

    private java.lang.String envelopeid;

    private java.lang.String itemid;

    private java.lang.String quantity;

    private java.lang.String acct_date;

    private java.lang.String projectid;

    private java.lang.String created;

    private java.lang.String total_tax_paid;

    private java.lang.String vendorid;

    private java.lang.String notes;

    private java.lang.String currency_exchange_intolerance;

    private openair.wsdl.OaBase[] attributes;

    public OaTicket() {
    }

    public OaTicket(
           java.lang.String date,
           java.lang.String missing_receipt,
           java.lang.String unitm,
           java.lang.String reference_number,
           java.lang.String attachmentid,
           java.lang.String currency_total_tax_paid,
           java.lang.String tax_rateid,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String currency_rate,
           java.lang.String total_no_tax,
           java.lang.String project_taskid,
           java.lang.String thin_client_id,
           java.lang.String cost,
           java.lang.String tax_location_name,
           java.lang.String non_billable,
           java.lang.String total,
           java.lang.String externalid,
           java.lang.String description,
           java.lang.String categoryid,
           java.lang.String customerid,
           java.lang.String paymethod,
           java.lang.String projecttask_typeid,
           java.lang.String user_locationid,
           java.lang.String userid,
           java.lang.String status,
           java.lang.String currency,
           java.lang.String city,
           java.lang.String cost_centerid,
           java.lang.String slipid,
           java.lang.String currency_cost,
           java.lang.String payment_typeid,
           java.lang.String currency_symbol,
           java.lang.String tax_location_id,
           java.lang.String envelopeid,
           java.lang.String itemid,
           java.lang.String quantity,
           java.lang.String acct_date,
           java.lang.String projectid,
           java.lang.String created,
           java.lang.String total_tax_paid,
           java.lang.String vendorid,
           java.lang.String notes,
           java.lang.String currency_exchange_intolerance,
           openair.wsdl.OaBase[] attributes) {
        this.date = date;
        this.missing_receipt = missing_receipt;
        this.unitm = unitm;
        this.reference_number = reference_number;
        this.attachmentid = attachmentid;
        this.currency_total_tax_paid = currency_total_tax_paid;
        this.tax_rateid = tax_rateid;
        this.id = id;
        this.updated = updated;
        this.currency_rate = currency_rate;
        this.total_no_tax = total_no_tax;
        this.project_taskid = project_taskid;
        this.thin_client_id = thin_client_id;
        this.cost = cost;
        this.tax_location_name = tax_location_name;
        this.non_billable = non_billable;
        this.total = total;
        this.externalid = externalid;
        this.description = description;
        this.categoryid = categoryid;
        this.customerid = customerid;
        this.paymethod = paymethod;
        this.projecttask_typeid = projecttask_typeid;
        this.user_locationid = user_locationid;
        this.userid = userid;
        this.status = status;
        this.currency = currency;
        this.city = city;
        this.cost_centerid = cost_centerid;
        this.slipid = slipid;
        this.currency_cost = currency_cost;
        this.payment_typeid = payment_typeid;
        this.currency_symbol = currency_symbol;
        this.tax_location_id = tax_location_id;
        this.envelopeid = envelopeid;
        this.itemid = itemid;
        this.quantity = quantity;
        this.acct_date = acct_date;
        this.projectid = projectid;
        this.created = created;
        this.total_tax_paid = total_tax_paid;
        this.vendorid = vendorid;
        this.notes = notes;
        this.currency_exchange_intolerance = currency_exchange_intolerance;
        this.attributes = attributes;
    }


    /**
     * Gets the date value for this OaTicket.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaTicket.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the missing_receipt value for this OaTicket.
     * 
     * @return missing_receipt
     */
    public java.lang.String getMissing_receipt() {
        return missing_receipt;
    }


    /**
     * Sets the missing_receipt value for this OaTicket.
     * 
     * @param missing_receipt
     */
    public void setMissing_receipt(java.lang.String missing_receipt) {
        this.missing_receipt = missing_receipt;
    }


    /**
     * Gets the unitm value for this OaTicket.
     * 
     * @return unitm
     */
    public java.lang.String getUnitm() {
        return unitm;
    }


    /**
     * Sets the unitm value for this OaTicket.
     * 
     * @param unitm
     */
    public void setUnitm(java.lang.String unitm) {
        this.unitm = unitm;
    }


    /**
     * Gets the reference_number value for this OaTicket.
     * 
     * @return reference_number
     */
    public java.lang.String getReference_number() {
        return reference_number;
    }


    /**
     * Sets the reference_number value for this OaTicket.
     * 
     * @param reference_number
     */
    public void setReference_number(java.lang.String reference_number) {
        this.reference_number = reference_number;
    }


    /**
     * Gets the attachmentid value for this OaTicket.
     * 
     * @return attachmentid
     */
    public java.lang.String getAttachmentid() {
        return attachmentid;
    }


    /**
     * Sets the attachmentid value for this OaTicket.
     * 
     * @param attachmentid
     */
    public void setAttachmentid(java.lang.String attachmentid) {
        this.attachmentid = attachmentid;
    }


    /**
     * Gets the currency_total_tax_paid value for this OaTicket.
     * 
     * @return currency_total_tax_paid
     */
    public java.lang.String getCurrency_total_tax_paid() {
        return currency_total_tax_paid;
    }


    /**
     * Sets the currency_total_tax_paid value for this OaTicket.
     * 
     * @param currency_total_tax_paid
     */
    public void setCurrency_total_tax_paid(java.lang.String currency_total_tax_paid) {
        this.currency_total_tax_paid = currency_total_tax_paid;
    }


    /**
     * Gets the tax_rateid value for this OaTicket.
     * 
     * @return tax_rateid
     */
    public java.lang.String getTax_rateid() {
        return tax_rateid;
    }


    /**
     * Sets the tax_rateid value for this OaTicket.
     * 
     * @param tax_rateid
     */
    public void setTax_rateid(java.lang.String tax_rateid) {
        this.tax_rateid = tax_rateid;
    }


    /**
     * Gets the id value for this OaTicket.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaTicket.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaTicket.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaTicket.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the currency_rate value for this OaTicket.
     * 
     * @return currency_rate
     */
    public java.lang.String getCurrency_rate() {
        return currency_rate;
    }


    /**
     * Sets the currency_rate value for this OaTicket.
     * 
     * @param currency_rate
     */
    public void setCurrency_rate(java.lang.String currency_rate) {
        this.currency_rate = currency_rate;
    }


    /**
     * Gets the total_no_tax value for this OaTicket.
     * 
     * @return total_no_tax
     */
    public java.lang.String getTotal_no_tax() {
        return total_no_tax;
    }


    /**
     * Sets the total_no_tax value for this OaTicket.
     * 
     * @param total_no_tax
     */
    public void setTotal_no_tax(java.lang.String total_no_tax) {
        this.total_no_tax = total_no_tax;
    }


    /**
     * Gets the project_taskid value for this OaTicket.
     * 
     * @return project_taskid
     */
    public java.lang.String getProject_taskid() {
        return project_taskid;
    }


    /**
     * Sets the project_taskid value for this OaTicket.
     * 
     * @param project_taskid
     */
    public void setProject_taskid(java.lang.String project_taskid) {
        this.project_taskid = project_taskid;
    }


    /**
     * Gets the thin_client_id value for this OaTicket.
     * 
     * @return thin_client_id
     */
    public java.lang.String getThin_client_id() {
        return thin_client_id;
    }


    /**
     * Sets the thin_client_id value for this OaTicket.
     * 
     * @param thin_client_id
     */
    public void setThin_client_id(java.lang.String thin_client_id) {
        this.thin_client_id = thin_client_id;
    }


    /**
     * Gets the cost value for this OaTicket.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this OaTicket.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
    }


    /**
     * Gets the tax_location_name value for this OaTicket.
     * 
     * @return tax_location_name
     */
    public java.lang.String getTax_location_name() {
        return tax_location_name;
    }


    /**
     * Sets the tax_location_name value for this OaTicket.
     * 
     * @param tax_location_name
     */
    public void setTax_location_name(java.lang.String tax_location_name) {
        this.tax_location_name = tax_location_name;
    }


    /**
     * Gets the non_billable value for this OaTicket.
     * 
     * @return non_billable
     */
    public java.lang.String getNon_billable() {
        return non_billable;
    }


    /**
     * Sets the non_billable value for this OaTicket.
     * 
     * @param non_billable
     */
    public void setNon_billable(java.lang.String non_billable) {
        this.non_billable = non_billable;
    }


    /**
     * Gets the total value for this OaTicket.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OaTicket.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the externalid value for this OaTicket.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaTicket.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the description value for this OaTicket.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaTicket.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the categoryid value for this OaTicket.
     * 
     * @return categoryid
     */
    public java.lang.String getCategoryid() {
        return categoryid;
    }


    /**
     * Sets the categoryid value for this OaTicket.
     * 
     * @param categoryid
     */
    public void setCategoryid(java.lang.String categoryid) {
        this.categoryid = categoryid;
    }


    /**
     * Gets the customerid value for this OaTicket.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaTicket.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the paymethod value for this OaTicket.
     * 
     * @return paymethod
     */
    public java.lang.String getPaymethod() {
        return paymethod;
    }


    /**
     * Sets the paymethod value for this OaTicket.
     * 
     * @param paymethod
     */
    public void setPaymethod(java.lang.String paymethod) {
        this.paymethod = paymethod;
    }


    /**
     * Gets the projecttask_typeid value for this OaTicket.
     * 
     * @return projecttask_typeid
     */
    public java.lang.String getProjecttask_typeid() {
        return projecttask_typeid;
    }


    /**
     * Sets the projecttask_typeid value for this OaTicket.
     * 
     * @param projecttask_typeid
     */
    public void setProjecttask_typeid(java.lang.String projecttask_typeid) {
        this.projecttask_typeid = projecttask_typeid;
    }


    /**
     * Gets the user_locationid value for this OaTicket.
     * 
     * @return user_locationid
     */
    public java.lang.String getUser_locationid() {
        return user_locationid;
    }


    /**
     * Sets the user_locationid value for this OaTicket.
     * 
     * @param user_locationid
     */
    public void setUser_locationid(java.lang.String user_locationid) {
        this.user_locationid = user_locationid;
    }


    /**
     * Gets the userid value for this OaTicket.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaTicket.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the status value for this OaTicket.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OaTicket.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the currency value for this OaTicket.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaTicket.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the city value for this OaTicket.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this OaTicket.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the cost_centerid value for this OaTicket.
     * 
     * @return cost_centerid
     */
    public java.lang.String getCost_centerid() {
        return cost_centerid;
    }


    /**
     * Sets the cost_centerid value for this OaTicket.
     * 
     * @param cost_centerid
     */
    public void setCost_centerid(java.lang.String cost_centerid) {
        this.cost_centerid = cost_centerid;
    }


    /**
     * Gets the slipid value for this OaTicket.
     * 
     * @return slipid
     */
    public java.lang.String getSlipid() {
        return slipid;
    }


    /**
     * Sets the slipid value for this OaTicket.
     * 
     * @param slipid
     */
    public void setSlipid(java.lang.String slipid) {
        this.slipid = slipid;
    }


    /**
     * Gets the currency_cost value for this OaTicket.
     * 
     * @return currency_cost
     */
    public java.lang.String getCurrency_cost() {
        return currency_cost;
    }


    /**
     * Sets the currency_cost value for this OaTicket.
     * 
     * @param currency_cost
     */
    public void setCurrency_cost(java.lang.String currency_cost) {
        this.currency_cost = currency_cost;
    }


    /**
     * Gets the payment_typeid value for this OaTicket.
     * 
     * @return payment_typeid
     */
    public java.lang.String getPayment_typeid() {
        return payment_typeid;
    }


    /**
     * Sets the payment_typeid value for this OaTicket.
     * 
     * @param payment_typeid
     */
    public void setPayment_typeid(java.lang.String payment_typeid) {
        this.payment_typeid = payment_typeid;
    }


    /**
     * Gets the currency_symbol value for this OaTicket.
     * 
     * @return currency_symbol
     */
    public java.lang.String getCurrency_symbol() {
        return currency_symbol;
    }


    /**
     * Sets the currency_symbol value for this OaTicket.
     * 
     * @param currency_symbol
     */
    public void setCurrency_symbol(java.lang.String currency_symbol) {
        this.currency_symbol = currency_symbol;
    }


    /**
     * Gets the tax_location_id value for this OaTicket.
     * 
     * @return tax_location_id
     */
    public java.lang.String getTax_location_id() {
        return tax_location_id;
    }


    /**
     * Sets the tax_location_id value for this OaTicket.
     * 
     * @param tax_location_id
     */
    public void setTax_location_id(java.lang.String tax_location_id) {
        this.tax_location_id = tax_location_id;
    }


    /**
     * Gets the envelopeid value for this OaTicket.
     * 
     * @return envelopeid
     */
    public java.lang.String getEnvelopeid() {
        return envelopeid;
    }


    /**
     * Sets the envelopeid value for this OaTicket.
     * 
     * @param envelopeid
     */
    public void setEnvelopeid(java.lang.String envelopeid) {
        this.envelopeid = envelopeid;
    }


    /**
     * Gets the itemid value for this OaTicket.
     * 
     * @return itemid
     */
    public java.lang.String getItemid() {
        return itemid;
    }


    /**
     * Sets the itemid value for this OaTicket.
     * 
     * @param itemid
     */
    public void setItemid(java.lang.String itemid) {
        this.itemid = itemid;
    }


    /**
     * Gets the quantity value for this OaTicket.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OaTicket.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the acct_date value for this OaTicket.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaTicket.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the projectid value for this OaTicket.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaTicket.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the created value for this OaTicket.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaTicket.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the total_tax_paid value for this OaTicket.
     * 
     * @return total_tax_paid
     */
    public java.lang.String getTotal_tax_paid() {
        return total_tax_paid;
    }


    /**
     * Sets the total_tax_paid value for this OaTicket.
     * 
     * @param total_tax_paid
     */
    public void setTotal_tax_paid(java.lang.String total_tax_paid) {
        this.total_tax_paid = total_tax_paid;
    }


    /**
     * Gets the vendorid value for this OaTicket.
     * 
     * @return vendorid
     */
    public java.lang.String getVendorid() {
        return vendorid;
    }


    /**
     * Sets the vendorid value for this OaTicket.
     * 
     * @param vendorid
     */
    public void setVendorid(java.lang.String vendorid) {
        this.vendorid = vendorid;
    }


    /**
     * Gets the notes value for this OaTicket.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaTicket.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the currency_exchange_intolerance value for this OaTicket.
     * 
     * @return currency_exchange_intolerance
     */
    public java.lang.String getCurrency_exchange_intolerance() {
        return currency_exchange_intolerance;
    }


    /**
     * Sets the currency_exchange_intolerance value for this OaTicket.
     * 
     * @param currency_exchange_intolerance
     */
    public void setCurrency_exchange_intolerance(java.lang.String currency_exchange_intolerance) {
        this.currency_exchange_intolerance = currency_exchange_intolerance;
    }


    /**
     * Gets the attributes value for this OaTicket.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaTicket.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaTicket)) return false;
        OaTicket other = (OaTicket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.missing_receipt==null && other.getMissing_receipt()==null) || 
             (this.missing_receipt!=null &&
              this.missing_receipt.equals(other.getMissing_receipt()))) &&
            ((this.unitm==null && other.getUnitm()==null) || 
             (this.unitm!=null &&
              this.unitm.equals(other.getUnitm()))) &&
            ((this.reference_number==null && other.getReference_number()==null) || 
             (this.reference_number!=null &&
              this.reference_number.equals(other.getReference_number()))) &&
            ((this.attachmentid==null && other.getAttachmentid()==null) || 
             (this.attachmentid!=null &&
              this.attachmentid.equals(other.getAttachmentid()))) &&
            ((this.currency_total_tax_paid==null && other.getCurrency_total_tax_paid()==null) || 
             (this.currency_total_tax_paid!=null &&
              this.currency_total_tax_paid.equals(other.getCurrency_total_tax_paid()))) &&
            ((this.tax_rateid==null && other.getTax_rateid()==null) || 
             (this.tax_rateid!=null &&
              this.tax_rateid.equals(other.getTax_rateid()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.currency_rate==null && other.getCurrency_rate()==null) || 
             (this.currency_rate!=null &&
              this.currency_rate.equals(other.getCurrency_rate()))) &&
            ((this.total_no_tax==null && other.getTotal_no_tax()==null) || 
             (this.total_no_tax!=null &&
              this.total_no_tax.equals(other.getTotal_no_tax()))) &&
            ((this.project_taskid==null && other.getProject_taskid()==null) || 
             (this.project_taskid!=null &&
              this.project_taskid.equals(other.getProject_taskid()))) &&
            ((this.thin_client_id==null && other.getThin_client_id()==null) || 
             (this.thin_client_id!=null &&
              this.thin_client_id.equals(other.getThin_client_id()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.tax_location_name==null && other.getTax_location_name()==null) || 
             (this.tax_location_name!=null &&
              this.tax_location_name.equals(other.getTax_location_name()))) &&
            ((this.non_billable==null && other.getNon_billable()==null) || 
             (this.non_billable!=null &&
              this.non_billable.equals(other.getNon_billable()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.categoryid==null && other.getCategoryid()==null) || 
             (this.categoryid!=null &&
              this.categoryid.equals(other.getCategoryid()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.paymethod==null && other.getPaymethod()==null) || 
             (this.paymethod!=null &&
              this.paymethod.equals(other.getPaymethod()))) &&
            ((this.projecttask_typeid==null && other.getProjecttask_typeid()==null) || 
             (this.projecttask_typeid!=null &&
              this.projecttask_typeid.equals(other.getProjecttask_typeid()))) &&
            ((this.user_locationid==null && other.getUser_locationid()==null) || 
             (this.user_locationid!=null &&
              this.user_locationid.equals(other.getUser_locationid()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.cost_centerid==null && other.getCost_centerid()==null) || 
             (this.cost_centerid!=null &&
              this.cost_centerid.equals(other.getCost_centerid()))) &&
            ((this.slipid==null && other.getSlipid()==null) || 
             (this.slipid!=null &&
              this.slipid.equals(other.getSlipid()))) &&
            ((this.currency_cost==null && other.getCurrency_cost()==null) || 
             (this.currency_cost!=null &&
              this.currency_cost.equals(other.getCurrency_cost()))) &&
            ((this.payment_typeid==null && other.getPayment_typeid()==null) || 
             (this.payment_typeid!=null &&
              this.payment_typeid.equals(other.getPayment_typeid()))) &&
            ((this.currency_symbol==null && other.getCurrency_symbol()==null) || 
             (this.currency_symbol!=null &&
              this.currency_symbol.equals(other.getCurrency_symbol()))) &&
            ((this.tax_location_id==null && other.getTax_location_id()==null) || 
             (this.tax_location_id!=null &&
              this.tax_location_id.equals(other.getTax_location_id()))) &&
            ((this.envelopeid==null && other.getEnvelopeid()==null) || 
             (this.envelopeid!=null &&
              this.envelopeid.equals(other.getEnvelopeid()))) &&
            ((this.itemid==null && other.getItemid()==null) || 
             (this.itemid!=null &&
              this.itemid.equals(other.getItemid()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.total_tax_paid==null && other.getTotal_tax_paid()==null) || 
             (this.total_tax_paid!=null &&
              this.total_tax_paid.equals(other.getTotal_tax_paid()))) &&
            ((this.vendorid==null && other.getVendorid()==null) || 
             (this.vendorid!=null &&
              this.vendorid.equals(other.getVendorid()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.currency_exchange_intolerance==null && other.getCurrency_exchange_intolerance()==null) || 
             (this.currency_exchange_intolerance!=null &&
              this.currency_exchange_intolerance.equals(other.getCurrency_exchange_intolerance()))) &&
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getMissing_receipt() != null) {
            _hashCode += getMissing_receipt().hashCode();
        }
        if (getUnitm() != null) {
            _hashCode += getUnitm().hashCode();
        }
        if (getReference_number() != null) {
            _hashCode += getReference_number().hashCode();
        }
        if (getAttachmentid() != null) {
            _hashCode += getAttachmentid().hashCode();
        }
        if (getCurrency_total_tax_paid() != null) {
            _hashCode += getCurrency_total_tax_paid().hashCode();
        }
        if (getTax_rateid() != null) {
            _hashCode += getTax_rateid().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getCurrency_rate() != null) {
            _hashCode += getCurrency_rate().hashCode();
        }
        if (getTotal_no_tax() != null) {
            _hashCode += getTotal_no_tax().hashCode();
        }
        if (getProject_taskid() != null) {
            _hashCode += getProject_taskid().hashCode();
        }
        if (getThin_client_id() != null) {
            _hashCode += getThin_client_id().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getTax_location_name() != null) {
            _hashCode += getTax_location_name().hashCode();
        }
        if (getNon_billable() != null) {
            _hashCode += getNon_billable().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCategoryid() != null) {
            _hashCode += getCategoryid().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getPaymethod() != null) {
            _hashCode += getPaymethod().hashCode();
        }
        if (getProjecttask_typeid() != null) {
            _hashCode += getProjecttask_typeid().hashCode();
        }
        if (getUser_locationid() != null) {
            _hashCode += getUser_locationid().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getCost_centerid() != null) {
            _hashCode += getCost_centerid().hashCode();
        }
        if (getSlipid() != null) {
            _hashCode += getSlipid().hashCode();
        }
        if (getCurrency_cost() != null) {
            _hashCode += getCurrency_cost().hashCode();
        }
        if (getPayment_typeid() != null) {
            _hashCode += getPayment_typeid().hashCode();
        }
        if (getCurrency_symbol() != null) {
            _hashCode += getCurrency_symbol().hashCode();
        }
        if (getTax_location_id() != null) {
            _hashCode += getTax_location_id().hashCode();
        }
        if (getEnvelopeid() != null) {
            _hashCode += getEnvelopeid().hashCode();
        }
        if (getItemid() != null) {
            _hashCode += getItemid().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
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
        if (getTotal_tax_paid() != null) {
            _hashCode += getTotal_tax_paid().hashCode();
        }
        if (getVendorid() != null) {
            _hashCode += getVendorid().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCurrency_exchange_intolerance() != null) {
            _hashCode += getCurrency_exchange_intolerance().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaTicket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTicket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missing_receipt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "missing_receipt"));
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
        elemField.setFieldName("reference_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachmentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachmentid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_total_tax_paid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_total_tax_paid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_rateid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_rateid"));
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
        elemField.setFieldName("updated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_no_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_no_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_taskid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_taskid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thin_client_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thin_client_id"));
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
        elemField.setFieldName("non_billable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "non_billable"));
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
        elemField.setFieldName("externalid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalid"));
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
        elemField.setFieldName("categoryid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryid"));
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
        elemField.setFieldName("paymethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymethod"));
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
        elemField.setFieldName("user_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_locationid"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
        elemField.setFieldName("cost_centerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_centerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slipid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slipid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency_cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_cost"));
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
        elemField.setFieldName("currency_symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_location_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_location_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("envelopeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "envelopeid"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
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
        elemField.setFieldName("total_tax_paid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_tax_paid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorid"));
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
        elemField.setFieldName("currency_exchange_intolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currency_exchange_intolerance"));
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
