/**
 * OaInvoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaInvoice  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String date;

    private java.lang.String invoice_layoutid;

    private java.lang.String attachmentid;

    private java.lang.String tax_state;

    private java.lang.String tax_federal;

    private java.lang.String original_invoiceid;

    private java.lang.String tax_gst;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String submitted;

    private java.lang.String externalid;

    private java.lang.String total;

    private java.lang.String balance;

    private java.lang.String paperrequest;

    private java.lang.String customerid;

    private java.lang.String accounting;

    private java.lang.String draw_date;

    private java.lang.String number;

    private java.lang.String status;

    private java.lang.String terms;

    private java.lang.String credit_reason;

    private java.lang.String currency;

    private java.lang.String emailed;

    private java.lang.String tax_pst;

    private java.lang.String draw;

    private java.lang.String contactid;

    private java.lang.String shipping_contactid;

    private java.lang.String approval_status;

    private java.lang.String access_log;

    private java.lang.String credit;

    private java.lang.String tax_hst;

    private java.lang.String tax;

    private java.lang.String credit_rebill_status;

    private java.lang.String acct_date;

    private java.lang.String created;

    private java.lang.String approved;

    private java.lang.String notes;

    private java.lang.String papersend;

    private openair.wsdl.OaBase[] attributes;

    public OaInvoice() {
    }

    public OaInvoice(
           java.lang.String date,
           java.lang.String invoice_layoutid,
           java.lang.String attachmentid,
           java.lang.String tax_state,
           java.lang.String tax_federal,
           java.lang.String original_invoiceid,
           java.lang.String tax_gst,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String submitted,
           java.lang.String externalid,
           java.lang.String total,
           java.lang.String balance,
           java.lang.String paperrequest,
           java.lang.String customerid,
           java.lang.String accounting,
           java.lang.String draw_date,
           java.lang.String number,
           java.lang.String status,
           java.lang.String terms,
           java.lang.String credit_reason,
           java.lang.String currency,
           java.lang.String emailed,
           java.lang.String tax_pst,
           java.lang.String draw,
           java.lang.String contactid,
           java.lang.String shipping_contactid,
           java.lang.String approval_status,
           java.lang.String access_log,
           java.lang.String credit,
           java.lang.String tax_hst,
           java.lang.String tax,
           java.lang.String credit_rebill_status,
           java.lang.String acct_date,
           java.lang.String created,
           java.lang.String approved,
           java.lang.String notes,
           java.lang.String papersend,
           openair.wsdl.OaBase[] attributes) {
        this.date = date;
        this.invoice_layoutid = invoice_layoutid;
        this.attachmentid = attachmentid;
        this.tax_state = tax_state;
        this.tax_federal = tax_federal;
        this.original_invoiceid = original_invoiceid;
        this.tax_gst = tax_gst;
        this.updated = updated;
        this.id = id;
        this.submitted = submitted;
        this.externalid = externalid;
        this.total = total;
        this.balance = balance;
        this.paperrequest = paperrequest;
        this.customerid = customerid;
        this.accounting = accounting;
        this.draw_date = draw_date;
        this.number = number;
        this.status = status;
        this.terms = terms;
        this.credit_reason = credit_reason;
        this.currency = currency;
        this.emailed = emailed;
        this.tax_pst = tax_pst;
        this.draw = draw;
        this.contactid = contactid;
        this.shipping_contactid = shipping_contactid;
        this.approval_status = approval_status;
        this.access_log = access_log;
        this.credit = credit;
        this.tax_hst = tax_hst;
        this.tax = tax;
        this.credit_rebill_status = credit_rebill_status;
        this.acct_date = acct_date;
        this.created = created;
        this.approved = approved;
        this.notes = notes;
        this.papersend = papersend;
        this.attributes = attributes;
    }


    /**
     * Gets the date value for this OaInvoice.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaInvoice.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the invoice_layoutid value for this OaInvoice.
     * 
     * @return invoice_layoutid
     */
    public java.lang.String getInvoice_layoutid() {
        return invoice_layoutid;
    }


    /**
     * Sets the invoice_layoutid value for this OaInvoice.
     * 
     * @param invoice_layoutid
     */
    public void setInvoice_layoutid(java.lang.String invoice_layoutid) {
        this.invoice_layoutid = invoice_layoutid;
    }


    /**
     * Gets the attachmentid value for this OaInvoice.
     * 
     * @return attachmentid
     */
    public java.lang.String getAttachmentid() {
        return attachmentid;
    }


    /**
     * Sets the attachmentid value for this OaInvoice.
     * 
     * @param attachmentid
     */
    public void setAttachmentid(java.lang.String attachmentid) {
        this.attachmentid = attachmentid;
    }


    /**
     * Gets the tax_state value for this OaInvoice.
     * 
     * @return tax_state
     */
    public java.lang.String getTax_state() {
        return tax_state;
    }


    /**
     * Sets the tax_state value for this OaInvoice.
     * 
     * @param tax_state
     */
    public void setTax_state(java.lang.String tax_state) {
        this.tax_state = tax_state;
    }


    /**
     * Gets the tax_federal value for this OaInvoice.
     * 
     * @return tax_federal
     */
    public java.lang.String getTax_federal() {
        return tax_federal;
    }


    /**
     * Sets the tax_federal value for this OaInvoice.
     * 
     * @param tax_federal
     */
    public void setTax_federal(java.lang.String tax_federal) {
        this.tax_federal = tax_federal;
    }


    /**
     * Gets the original_invoiceid value for this OaInvoice.
     * 
     * @return original_invoiceid
     */
    public java.lang.String getOriginal_invoiceid() {
        return original_invoiceid;
    }


    /**
     * Sets the original_invoiceid value for this OaInvoice.
     * 
     * @param original_invoiceid
     */
    public void setOriginal_invoiceid(java.lang.String original_invoiceid) {
        this.original_invoiceid = original_invoiceid;
    }


    /**
     * Gets the tax_gst value for this OaInvoice.
     * 
     * @return tax_gst
     */
    public java.lang.String getTax_gst() {
        return tax_gst;
    }


    /**
     * Sets the tax_gst value for this OaInvoice.
     * 
     * @param tax_gst
     */
    public void setTax_gst(java.lang.String tax_gst) {
        this.tax_gst = tax_gst;
    }


    /**
     * Gets the updated value for this OaInvoice.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaInvoice.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaInvoice.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaInvoice.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the submitted value for this OaInvoice.
     * 
     * @return submitted
     */
    public java.lang.String getSubmitted() {
        return submitted;
    }


    /**
     * Sets the submitted value for this OaInvoice.
     * 
     * @param submitted
     */
    public void setSubmitted(java.lang.String submitted) {
        this.submitted = submitted;
    }


    /**
     * Gets the externalid value for this OaInvoice.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaInvoice.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the total value for this OaInvoice.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OaInvoice.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the balance value for this OaInvoice.
     * 
     * @return balance
     */
    public java.lang.String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this OaInvoice.
     * 
     * @param balance
     */
    public void setBalance(java.lang.String balance) {
        this.balance = balance;
    }


    /**
     * Gets the paperrequest value for this OaInvoice.
     * 
     * @return paperrequest
     */
    public java.lang.String getPaperrequest() {
        return paperrequest;
    }


    /**
     * Sets the paperrequest value for this OaInvoice.
     * 
     * @param paperrequest
     */
    public void setPaperrequest(java.lang.String paperrequest) {
        this.paperrequest = paperrequest;
    }


    /**
     * Gets the customerid value for this OaInvoice.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaInvoice.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the accounting value for this OaInvoice.
     * 
     * @return accounting
     */
    public java.lang.String getAccounting() {
        return accounting;
    }


    /**
     * Sets the accounting value for this OaInvoice.
     * 
     * @param accounting
     */
    public void setAccounting(java.lang.String accounting) {
        this.accounting = accounting;
    }


    /**
     * Gets the draw_date value for this OaInvoice.
     * 
     * @return draw_date
     */
    public java.lang.String getDraw_date() {
        return draw_date;
    }


    /**
     * Sets the draw_date value for this OaInvoice.
     * 
     * @param draw_date
     */
    public void setDraw_date(java.lang.String draw_date) {
        this.draw_date = draw_date;
    }


    /**
     * Gets the number value for this OaInvoice.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this OaInvoice.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the status value for this OaInvoice.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OaInvoice.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the terms value for this OaInvoice.
     * 
     * @return terms
     */
    public java.lang.String getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this OaInvoice.
     * 
     * @param terms
     */
    public void setTerms(java.lang.String terms) {
        this.terms = terms;
    }


    /**
     * Gets the credit_reason value for this OaInvoice.
     * 
     * @return credit_reason
     */
    public java.lang.String getCredit_reason() {
        return credit_reason;
    }


    /**
     * Sets the credit_reason value for this OaInvoice.
     * 
     * @param credit_reason
     */
    public void setCredit_reason(java.lang.String credit_reason) {
        this.credit_reason = credit_reason;
    }


    /**
     * Gets the currency value for this OaInvoice.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaInvoice.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the emailed value for this OaInvoice.
     * 
     * @return emailed
     */
    public java.lang.String getEmailed() {
        return emailed;
    }


    /**
     * Sets the emailed value for this OaInvoice.
     * 
     * @param emailed
     */
    public void setEmailed(java.lang.String emailed) {
        this.emailed = emailed;
    }


    /**
     * Gets the tax_pst value for this OaInvoice.
     * 
     * @return tax_pst
     */
    public java.lang.String getTax_pst() {
        return tax_pst;
    }


    /**
     * Sets the tax_pst value for this OaInvoice.
     * 
     * @param tax_pst
     */
    public void setTax_pst(java.lang.String tax_pst) {
        this.tax_pst = tax_pst;
    }


    /**
     * Gets the draw value for this OaInvoice.
     * 
     * @return draw
     */
    public java.lang.String getDraw() {
        return draw;
    }


    /**
     * Sets the draw value for this OaInvoice.
     * 
     * @param draw
     */
    public void setDraw(java.lang.String draw) {
        this.draw = draw;
    }


    /**
     * Gets the contactid value for this OaInvoice.
     * 
     * @return contactid
     */
    public java.lang.String getContactid() {
        return contactid;
    }


    /**
     * Sets the contactid value for this OaInvoice.
     * 
     * @param contactid
     */
    public void setContactid(java.lang.String contactid) {
        this.contactid = contactid;
    }


    /**
     * Gets the shipping_contactid value for this OaInvoice.
     * 
     * @return shipping_contactid
     */
    public java.lang.String getShipping_contactid() {
        return shipping_contactid;
    }


    /**
     * Sets the shipping_contactid value for this OaInvoice.
     * 
     * @param shipping_contactid
     */
    public void setShipping_contactid(java.lang.String shipping_contactid) {
        this.shipping_contactid = shipping_contactid;
    }


    /**
     * Gets the approval_status value for this OaInvoice.
     * 
     * @return approval_status
     */
    public java.lang.String getApproval_status() {
        return approval_status;
    }


    /**
     * Sets the approval_status value for this OaInvoice.
     * 
     * @param approval_status
     */
    public void setApproval_status(java.lang.String approval_status) {
        this.approval_status = approval_status;
    }


    /**
     * Gets the access_log value for this OaInvoice.
     * 
     * @return access_log
     */
    public java.lang.String getAccess_log() {
        return access_log;
    }


    /**
     * Sets the access_log value for this OaInvoice.
     * 
     * @param access_log
     */
    public void setAccess_log(java.lang.String access_log) {
        this.access_log = access_log;
    }


    /**
     * Gets the credit value for this OaInvoice.
     * 
     * @return credit
     */
    public java.lang.String getCredit() {
        return credit;
    }


    /**
     * Sets the credit value for this OaInvoice.
     * 
     * @param credit
     */
    public void setCredit(java.lang.String credit) {
        this.credit = credit;
    }


    /**
     * Gets the tax_hst value for this OaInvoice.
     * 
     * @return tax_hst
     */
    public java.lang.String getTax_hst() {
        return tax_hst;
    }


    /**
     * Sets the tax_hst value for this OaInvoice.
     * 
     * @param tax_hst
     */
    public void setTax_hst(java.lang.String tax_hst) {
        this.tax_hst = tax_hst;
    }


    /**
     * Gets the tax value for this OaInvoice.
     * 
     * @return tax
     */
    public java.lang.String getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this OaInvoice.
     * 
     * @param tax
     */
    public void setTax(java.lang.String tax) {
        this.tax = tax;
    }


    /**
     * Gets the credit_rebill_status value for this OaInvoice.
     * 
     * @return credit_rebill_status
     */
    public java.lang.String getCredit_rebill_status() {
        return credit_rebill_status;
    }


    /**
     * Sets the credit_rebill_status value for this OaInvoice.
     * 
     * @param credit_rebill_status
     */
    public void setCredit_rebill_status(java.lang.String credit_rebill_status) {
        this.credit_rebill_status = credit_rebill_status;
    }


    /**
     * Gets the acct_date value for this OaInvoice.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaInvoice.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the created value for this OaInvoice.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaInvoice.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the approved value for this OaInvoice.
     * 
     * @return approved
     */
    public java.lang.String getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this OaInvoice.
     * 
     * @param approved
     */
    public void setApproved(java.lang.String approved) {
        this.approved = approved;
    }


    /**
     * Gets the notes value for this OaInvoice.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaInvoice.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the papersend value for this OaInvoice.
     * 
     * @return papersend
     */
    public java.lang.String getPapersend() {
        return papersend;
    }


    /**
     * Sets the papersend value for this OaInvoice.
     * 
     * @param papersend
     */
    public void setPapersend(java.lang.String papersend) {
        this.papersend = papersend;
    }


    /**
     * Gets the attributes value for this OaInvoice.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaInvoice.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaInvoice)) return false;
        OaInvoice other = (OaInvoice) obj;
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
            ((this.invoice_layoutid==null && other.getInvoice_layoutid()==null) || 
             (this.invoice_layoutid!=null &&
              this.invoice_layoutid.equals(other.getInvoice_layoutid()))) &&
            ((this.attachmentid==null && other.getAttachmentid()==null) || 
             (this.attachmentid!=null &&
              this.attachmentid.equals(other.getAttachmentid()))) &&
            ((this.tax_state==null && other.getTax_state()==null) || 
             (this.tax_state!=null &&
              this.tax_state.equals(other.getTax_state()))) &&
            ((this.tax_federal==null && other.getTax_federal()==null) || 
             (this.tax_federal!=null &&
              this.tax_federal.equals(other.getTax_federal()))) &&
            ((this.original_invoiceid==null && other.getOriginal_invoiceid()==null) || 
             (this.original_invoiceid!=null &&
              this.original_invoiceid.equals(other.getOriginal_invoiceid()))) &&
            ((this.tax_gst==null && other.getTax_gst()==null) || 
             (this.tax_gst!=null &&
              this.tax_gst.equals(other.getTax_gst()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.submitted==null && other.getSubmitted()==null) || 
             (this.submitted!=null &&
              this.submitted.equals(other.getSubmitted()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.paperrequest==null && other.getPaperrequest()==null) || 
             (this.paperrequest!=null &&
              this.paperrequest.equals(other.getPaperrequest()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.accounting==null && other.getAccounting()==null) || 
             (this.accounting!=null &&
              this.accounting.equals(other.getAccounting()))) &&
            ((this.draw_date==null && other.getDraw_date()==null) || 
             (this.draw_date!=null &&
              this.draw_date.equals(other.getDraw_date()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.credit_reason==null && other.getCredit_reason()==null) || 
             (this.credit_reason!=null &&
              this.credit_reason.equals(other.getCredit_reason()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.emailed==null && other.getEmailed()==null) || 
             (this.emailed!=null &&
              this.emailed.equals(other.getEmailed()))) &&
            ((this.tax_pst==null && other.getTax_pst()==null) || 
             (this.tax_pst!=null &&
              this.tax_pst.equals(other.getTax_pst()))) &&
            ((this.draw==null && other.getDraw()==null) || 
             (this.draw!=null &&
              this.draw.equals(other.getDraw()))) &&
            ((this.contactid==null && other.getContactid()==null) || 
             (this.contactid!=null &&
              this.contactid.equals(other.getContactid()))) &&
            ((this.shipping_contactid==null && other.getShipping_contactid()==null) || 
             (this.shipping_contactid!=null &&
              this.shipping_contactid.equals(other.getShipping_contactid()))) &&
            ((this.approval_status==null && other.getApproval_status()==null) || 
             (this.approval_status!=null &&
              this.approval_status.equals(other.getApproval_status()))) &&
            ((this.access_log==null && other.getAccess_log()==null) || 
             (this.access_log!=null &&
              this.access_log.equals(other.getAccess_log()))) &&
            ((this.credit==null && other.getCredit()==null) || 
             (this.credit!=null &&
              this.credit.equals(other.getCredit()))) &&
            ((this.tax_hst==null && other.getTax_hst()==null) || 
             (this.tax_hst!=null &&
              this.tax_hst.equals(other.getTax_hst()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.credit_rebill_status==null && other.getCredit_rebill_status()==null) || 
             (this.credit_rebill_status!=null &&
              this.credit_rebill_status.equals(other.getCredit_rebill_status()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.papersend==null && other.getPapersend()==null) || 
             (this.papersend!=null &&
              this.papersend.equals(other.getPapersend()))) &&
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
        if (getInvoice_layoutid() != null) {
            _hashCode += getInvoice_layoutid().hashCode();
        }
        if (getAttachmentid() != null) {
            _hashCode += getAttachmentid().hashCode();
        }
        if (getTax_state() != null) {
            _hashCode += getTax_state().hashCode();
        }
        if (getTax_federal() != null) {
            _hashCode += getTax_federal().hashCode();
        }
        if (getOriginal_invoiceid() != null) {
            _hashCode += getOriginal_invoiceid().hashCode();
        }
        if (getTax_gst() != null) {
            _hashCode += getTax_gst().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSubmitted() != null) {
            _hashCode += getSubmitted().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getPaperrequest() != null) {
            _hashCode += getPaperrequest().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getAccounting() != null) {
            _hashCode += getAccounting().hashCode();
        }
        if (getDraw_date() != null) {
            _hashCode += getDraw_date().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getCredit_reason() != null) {
            _hashCode += getCredit_reason().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEmailed() != null) {
            _hashCode += getEmailed().hashCode();
        }
        if (getTax_pst() != null) {
            _hashCode += getTax_pst().hashCode();
        }
        if (getDraw() != null) {
            _hashCode += getDraw().hashCode();
        }
        if (getContactid() != null) {
            _hashCode += getContactid().hashCode();
        }
        if (getShipping_contactid() != null) {
            _hashCode += getShipping_contactid().hashCode();
        }
        if (getApproval_status() != null) {
            _hashCode += getApproval_status().hashCode();
        }
        if (getAccess_log() != null) {
            _hashCode += getAccess_log().hashCode();
        }
        if (getCredit() != null) {
            _hashCode += getCredit().hashCode();
        }
        if (getTax_hst() != null) {
            _hashCode += getTax_hst().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getCredit_rebill_status() != null) {
            _hashCode += getCredit_rebill_status().hashCode();
        }
        if (getAcct_date() != null) {
            _hashCode += getAcct_date().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getPapersend() != null) {
            _hashCode += getPapersend().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaInvoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaInvoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_layoutid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_layoutid"));
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
        elemField.setFieldName("tax_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_federal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_federal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("original_invoiceid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "original_invoiceid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_gst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_gst"));
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
        elemField.setFieldName("submitted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitted"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paperrequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paperrequest"));
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
        elemField.setFieldName("accounting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draw_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "draw_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
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
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit_reason"));
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
        elemField.setFieldName("emailed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_pst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_pst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("draw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "draw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contactid"));
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
        elemField.setFieldName("approval_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approval_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("access_log");
        elemField.setXmlName(new javax.xml.namespace.QName("", "access_log"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_hst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_hst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credit_rebill_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "credit_rebill_status"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "approved"));
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
        elemField.setFieldName("papersend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "papersend"));
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
