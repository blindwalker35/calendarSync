/**
 * OaCustomer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public class OaCustomer  extends modules.openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String addr_mobile;

    private java.lang.String addr_contact_id;

    private java.lang.String addr_country;

    private java.lang.String billing_addr_first;

    private java.lang.String billing_addr_middle;

    private java.lang.String billing_addr_addr2;

    private java.lang.String invoice_layoutid;

    private java.lang.String rate;

    private java.lang.String bus_typeid;

    private java.lang.String billing_addr_zip;

    private java.lang.String contact_addr_mobile;

    private java.lang.String code;

    private java.lang.String tb_approver;

    private java.lang.String contact_addr_city;

    private java.lang.String addr_last;

    private java.lang.String territoryid;

    private java.lang.String name;

    private java.lang.String billing_addr_fax;

    private java.lang.String hierarchy_node_ids;

    private java.lang.String billing_addr_state;

    private java.lang.String contact_addr_first;

    private java.lang.String addr_fax;

    private java.lang.String addr_city;

    private java.lang.String hear_aboutid;

    private java.lang.String billing_addr_country;

    private java.lang.String statements;

    private java.lang.String contact_addr_zip;

    private java.lang.String contact_addr_email;

    private java.lang.String company_sizeid;

    private java.lang.String web;

    private java.lang.String currency;

    private java.lang.String billing_addr_city;

    private java.lang.String cost_centerid;

    private java.lang.String contact_addr_addr4;

    private java.lang.String addr_zip;

    private java.lang.String contact_addr_addr2;

    private java.lang.String addr_addr1;

    private java.lang.String contact_addr_addr3;

    private java.lang.String addr_middle;

    private java.lang.String billing_addr_id;

    private java.lang.String te_include;

    private java.lang.String addr_addr2;

    private java.lang.String contact_addr_last;

    private java.lang.String notes;

    private java.lang.String contact_addr_phone;

    private java.lang.String tb_approvalprocess;

    private java.lang.String contact_addr_id;

    private java.lang.String primary_contactid;

    private java.lang.String contact_addr_middle;

    private java.lang.String billing_addr_addr3;

    private java.lang.String addr_addr4;

    private java.lang.String picklist_label;

    private java.lang.String contact_addr_state;

    private java.lang.String contact_addr_fax;

    private java.lang.String contact_addr_addr1;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String filterset_ids;

    private java.lang.String addr_first;

    private java.lang.String billing_addr_salutation;

    private java.lang.String addr_addr3;

    private java.lang.String sold_to_contactid;

    private java.lang.String billing_addr_contact_id;

    private java.lang.String active;

    private java.lang.String billing_contact_id;

    private java.lang.String externalid;

    private java.lang.String addr_salutation;

    private java.lang.String billing_code;

    private java.lang.String contact_addr_salutation;

    private java.lang.String invoice_prefix;

    private java.lang.String type;

    private java.lang.String billing_addr_addr4;

    private java.lang.String addr_state;

    private java.lang.String contact_addr_country;

    private java.lang.String userid;

    private java.lang.String billing_addr_phone;

    private java.lang.String terms;

    private java.lang.String addr_phone;

    private java.lang.String createtime;

    private java.lang.String ta_include;

    private java.lang.String invoice_text;

    private java.lang.String company;

    private java.lang.String billing_addr_email;

    private java.lang.String addr_email;

    private java.lang.String updatetime;

    private java.lang.String shipping_contactid;

    private java.lang.String billing_addr_addr1;

    private java.lang.String created;

    private java.lang.String contact_addr_contact_id;

    private java.lang.String billing_addr_last;

    private java.lang.String addr_id;

    private java.lang.String billing_addr_mobile;

    private modules.openair.wsdl.OaBase[] attributes;

    public OaCustomer() {
    }

    public OaCustomer(
           java.lang.String addr_mobile,
           java.lang.String addr_contact_id,
           java.lang.String addr_country,
           java.lang.String billing_addr_first,
           java.lang.String billing_addr_middle,
           java.lang.String billing_addr_addr2,
           java.lang.String invoice_layoutid,
           java.lang.String rate,
           java.lang.String bus_typeid,
           java.lang.String billing_addr_zip,
           java.lang.String contact_addr_mobile,
           java.lang.String code,
           java.lang.String tb_approver,
           java.lang.String contact_addr_city,
           java.lang.String addr_last,
           java.lang.String territoryid,
           java.lang.String name,
           java.lang.String billing_addr_fax,
           java.lang.String hierarchy_node_ids,
           java.lang.String billing_addr_state,
           java.lang.String contact_addr_first,
           java.lang.String addr_fax,
           java.lang.String addr_city,
           java.lang.String hear_aboutid,
           java.lang.String billing_addr_country,
           java.lang.String statements,
           java.lang.String contact_addr_zip,
           java.lang.String contact_addr_email,
           java.lang.String company_sizeid,
           java.lang.String web,
           java.lang.String currency,
           java.lang.String billing_addr_city,
           java.lang.String cost_centerid,
           java.lang.String contact_addr_addr4,
           java.lang.String addr_zip,
           java.lang.String contact_addr_addr2,
           java.lang.String addr_addr1,
           java.lang.String contact_addr_addr3,
           java.lang.String addr_middle,
           java.lang.String billing_addr_id,
           java.lang.String te_include,
           java.lang.String addr_addr2,
           java.lang.String contact_addr_last,
           java.lang.String notes,
           java.lang.String contact_addr_phone,
           java.lang.String tb_approvalprocess,
           java.lang.String contact_addr_id,
           java.lang.String primary_contactid,
           java.lang.String contact_addr_middle,
           java.lang.String billing_addr_addr3,
           java.lang.String addr_addr4,
           java.lang.String picklist_label,
           java.lang.String contact_addr_state,
           java.lang.String contact_addr_fax,
           java.lang.String contact_addr_addr1,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String filterset_ids,
           java.lang.String addr_first,
           java.lang.String billing_addr_salutation,
           java.lang.String addr_addr3,
           java.lang.String sold_to_contactid,
           java.lang.String billing_addr_contact_id,
           java.lang.String active,
           java.lang.String billing_contact_id,
           java.lang.String externalid,
           java.lang.String addr_salutation,
           java.lang.String billing_code,
           java.lang.String contact_addr_salutation,
           java.lang.String invoice_prefix,
           java.lang.String type,
           java.lang.String billing_addr_addr4,
           java.lang.String addr_state,
           java.lang.String contact_addr_country,
           java.lang.String userid,
           java.lang.String billing_addr_phone,
           java.lang.String terms,
           java.lang.String addr_phone,
           java.lang.String createtime,
           java.lang.String ta_include,
           java.lang.String invoice_text,
           java.lang.String company,
           java.lang.String billing_addr_email,
           java.lang.String addr_email,
           java.lang.String updatetime,
           java.lang.String shipping_contactid,
           java.lang.String billing_addr_addr1,
           java.lang.String created,
           java.lang.String contact_addr_contact_id,
           java.lang.String billing_addr_last,
           java.lang.String addr_id,
           java.lang.String billing_addr_mobile,
           modules.openair.wsdl.OaBase[] attributes) {
        this.addr_mobile = addr_mobile;
        this.addr_contact_id = addr_contact_id;
        this.addr_country = addr_country;
        this.billing_addr_first = billing_addr_first;
        this.billing_addr_middle = billing_addr_middle;
        this.billing_addr_addr2 = billing_addr_addr2;
        this.invoice_layoutid = invoice_layoutid;
        this.rate = rate;
        this.bus_typeid = bus_typeid;
        this.billing_addr_zip = billing_addr_zip;
        this.contact_addr_mobile = contact_addr_mobile;
        this.code = code;
        this.tb_approver = tb_approver;
        this.contact_addr_city = contact_addr_city;
        this.addr_last = addr_last;
        this.territoryid = territoryid;
        this.name = name;
        this.billing_addr_fax = billing_addr_fax;
        this.hierarchy_node_ids = hierarchy_node_ids;
        this.billing_addr_state = billing_addr_state;
        this.contact_addr_first = contact_addr_first;
        this.addr_fax = addr_fax;
        this.addr_city = addr_city;
        this.hear_aboutid = hear_aboutid;
        this.billing_addr_country = billing_addr_country;
        this.statements = statements;
        this.contact_addr_zip = contact_addr_zip;
        this.contact_addr_email = contact_addr_email;
        this.company_sizeid = company_sizeid;
        this.web = web;
        this.currency = currency;
        this.billing_addr_city = billing_addr_city;
        this.cost_centerid = cost_centerid;
        this.contact_addr_addr4 = contact_addr_addr4;
        this.addr_zip = addr_zip;
        this.contact_addr_addr2 = contact_addr_addr2;
        this.addr_addr1 = addr_addr1;
        this.contact_addr_addr3 = contact_addr_addr3;
        this.addr_middle = addr_middle;
        this.billing_addr_id = billing_addr_id;
        this.te_include = te_include;
        this.addr_addr2 = addr_addr2;
        this.contact_addr_last = contact_addr_last;
        this.notes = notes;
        this.contact_addr_phone = contact_addr_phone;
        this.tb_approvalprocess = tb_approvalprocess;
        this.contact_addr_id = contact_addr_id;
        this.primary_contactid = primary_contactid;
        this.contact_addr_middle = contact_addr_middle;
        this.billing_addr_addr3 = billing_addr_addr3;
        this.addr_addr4 = addr_addr4;
        this.picklist_label = picklist_label;
        this.contact_addr_state = contact_addr_state;
        this.contact_addr_fax = contact_addr_fax;
        this.contact_addr_addr1 = contact_addr_addr1;
        this.updated = updated;
        this.id = id;
        this.filterset_ids = filterset_ids;
        this.addr_first = addr_first;
        this.billing_addr_salutation = billing_addr_salutation;
        this.addr_addr3 = addr_addr3;
        this.sold_to_contactid = sold_to_contactid;
        this.billing_addr_contact_id = billing_addr_contact_id;
        this.active = active;
        this.billing_contact_id = billing_contact_id;
        this.externalid = externalid;
        this.addr_salutation = addr_salutation;
        this.billing_code = billing_code;
        this.contact_addr_salutation = contact_addr_salutation;
        this.invoice_prefix = invoice_prefix;
        this.type = type;
        this.billing_addr_addr4 = billing_addr_addr4;
        this.addr_state = addr_state;
        this.contact_addr_country = contact_addr_country;
        this.userid = userid;
        this.billing_addr_phone = billing_addr_phone;
        this.terms = terms;
        this.addr_phone = addr_phone;
        this.createtime = createtime;
        this.ta_include = ta_include;
        this.invoice_text = invoice_text;
        this.company = company;
        this.billing_addr_email = billing_addr_email;
        this.addr_email = addr_email;
        this.updatetime = updatetime;
        this.shipping_contactid = shipping_contactid;
        this.billing_addr_addr1 = billing_addr_addr1;
        this.created = created;
        this.contact_addr_contact_id = contact_addr_contact_id;
        this.billing_addr_last = billing_addr_last;
        this.addr_id = addr_id;
        this.billing_addr_mobile = billing_addr_mobile;
        this.attributes = attributes;
    }


    /**
     * Gets the addr_mobile value for this OaCustomer.
     * 
     * @return addr_mobile
     */
    public java.lang.String getAddr_mobile() {
        return addr_mobile;
    }


    /**
     * Sets the addr_mobile value for this OaCustomer.
     * 
     * @param addr_mobile
     */
    public void setAddr_mobile(java.lang.String addr_mobile) {
        this.addr_mobile = addr_mobile;
    }


    /**
     * Gets the addr_contact_id value for this OaCustomer.
     * 
     * @return addr_contact_id
     */
    public java.lang.String getAddr_contact_id() {
        return addr_contact_id;
    }


    /**
     * Sets the addr_contact_id value for this OaCustomer.
     * 
     * @param addr_contact_id
     */
    public void setAddr_contact_id(java.lang.String addr_contact_id) {
        this.addr_contact_id = addr_contact_id;
    }


    /**
     * Gets the addr_country value for this OaCustomer.
     * 
     * @return addr_country
     */
    public java.lang.String getAddr_country() {
        return addr_country;
    }


    /**
     * Sets the addr_country value for this OaCustomer.
     * 
     * @param addr_country
     */
    public void setAddr_country(java.lang.String addr_country) {
        this.addr_country = addr_country;
    }


    /**
     * Gets the billing_addr_first value for this OaCustomer.
     * 
     * @return billing_addr_first
     */
    public java.lang.String getBilling_addr_first() {
        return billing_addr_first;
    }


    /**
     * Sets the billing_addr_first value for this OaCustomer.
     * 
     * @param billing_addr_first
     */
    public void setBilling_addr_first(java.lang.String billing_addr_first) {
        this.billing_addr_first = billing_addr_first;
    }


    /**
     * Gets the billing_addr_middle value for this OaCustomer.
     * 
     * @return billing_addr_middle
     */
    public java.lang.String getBilling_addr_middle() {
        return billing_addr_middle;
    }


    /**
     * Sets the billing_addr_middle value for this OaCustomer.
     * 
     * @param billing_addr_middle
     */
    public void setBilling_addr_middle(java.lang.String billing_addr_middle) {
        this.billing_addr_middle = billing_addr_middle;
    }


    /**
     * Gets the billing_addr_addr2 value for this OaCustomer.
     * 
     * @return billing_addr_addr2
     */
    public java.lang.String getBilling_addr_addr2() {
        return billing_addr_addr2;
    }


    /**
     * Sets the billing_addr_addr2 value for this OaCustomer.
     * 
     * @param billing_addr_addr2
     */
    public void setBilling_addr_addr2(java.lang.String billing_addr_addr2) {
        this.billing_addr_addr2 = billing_addr_addr2;
    }


    /**
     * Gets the invoice_layoutid value for this OaCustomer.
     * 
     * @return invoice_layoutid
     */
    public java.lang.String getInvoice_layoutid() {
        return invoice_layoutid;
    }


    /**
     * Sets the invoice_layoutid value for this OaCustomer.
     * 
     * @param invoice_layoutid
     */
    public void setInvoice_layoutid(java.lang.String invoice_layoutid) {
        this.invoice_layoutid = invoice_layoutid;
    }


    /**
     * Gets the rate value for this OaCustomer.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OaCustomer.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the bus_typeid value for this OaCustomer.
     * 
     * @return bus_typeid
     */
    public java.lang.String getBus_typeid() {
        return bus_typeid;
    }


    /**
     * Sets the bus_typeid value for this OaCustomer.
     * 
     * @param bus_typeid
     */
    public void setBus_typeid(java.lang.String bus_typeid) {
        this.bus_typeid = bus_typeid;
    }


    /**
     * Gets the billing_addr_zip value for this OaCustomer.
     * 
     * @return billing_addr_zip
     */
    public java.lang.String getBilling_addr_zip() {
        return billing_addr_zip;
    }


    /**
     * Sets the billing_addr_zip value for this OaCustomer.
     * 
     * @param billing_addr_zip
     */
    public void setBilling_addr_zip(java.lang.String billing_addr_zip) {
        this.billing_addr_zip = billing_addr_zip;
    }


    /**
     * Gets the contact_addr_mobile value for this OaCustomer.
     * 
     * @return contact_addr_mobile
     */
    public java.lang.String getContact_addr_mobile() {
        return contact_addr_mobile;
    }


    /**
     * Sets the contact_addr_mobile value for this OaCustomer.
     * 
     * @param contact_addr_mobile
     */
    public void setContact_addr_mobile(java.lang.String contact_addr_mobile) {
        this.contact_addr_mobile = contact_addr_mobile;
    }


    /**
     * Gets the code value for this OaCustomer.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this OaCustomer.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the tb_approver value for this OaCustomer.
     * 
     * @return tb_approver
     */
    public java.lang.String getTb_approver() {
        return tb_approver;
    }


    /**
     * Sets the tb_approver value for this OaCustomer.
     * 
     * @param tb_approver
     */
    public void setTb_approver(java.lang.String tb_approver) {
        this.tb_approver = tb_approver;
    }


    /**
     * Gets the contact_addr_city value for this OaCustomer.
     * 
     * @return contact_addr_city
     */
    public java.lang.String getContact_addr_city() {
        return contact_addr_city;
    }


    /**
     * Sets the contact_addr_city value for this OaCustomer.
     * 
     * @param contact_addr_city
     */
    public void setContact_addr_city(java.lang.String contact_addr_city) {
        this.contact_addr_city = contact_addr_city;
    }


    /**
     * Gets the addr_last value for this OaCustomer.
     * 
     * @return addr_last
     */
    public java.lang.String getAddr_last() {
        return addr_last;
    }


    /**
     * Sets the addr_last value for this OaCustomer.
     * 
     * @param addr_last
     */
    public void setAddr_last(java.lang.String addr_last) {
        this.addr_last = addr_last;
    }


    /**
     * Gets the territoryid value for this OaCustomer.
     * 
     * @return territoryid
     */
    public java.lang.String getTerritoryid() {
        return territoryid;
    }


    /**
     * Sets the territoryid value for this OaCustomer.
     * 
     * @param territoryid
     */
    public void setTerritoryid(java.lang.String territoryid) {
        this.territoryid = territoryid;
    }


    /**
     * Gets the name value for this OaCustomer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaCustomer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the billing_addr_fax value for this OaCustomer.
     * 
     * @return billing_addr_fax
     */
    public java.lang.String getBilling_addr_fax() {
        return billing_addr_fax;
    }


    /**
     * Sets the billing_addr_fax value for this OaCustomer.
     * 
     * @param billing_addr_fax
     */
    public void setBilling_addr_fax(java.lang.String billing_addr_fax) {
        this.billing_addr_fax = billing_addr_fax;
    }


    /**
     * Gets the hierarchy_node_ids value for this OaCustomer.
     * 
     * @return hierarchy_node_ids
     */
    public java.lang.String getHierarchy_node_ids() {
        return hierarchy_node_ids;
    }


    /**
     * Sets the hierarchy_node_ids value for this OaCustomer.
     * 
     * @param hierarchy_node_ids
     */
    public void setHierarchy_node_ids(java.lang.String hierarchy_node_ids) {
        this.hierarchy_node_ids = hierarchy_node_ids;
    }


    /**
     * Gets the billing_addr_state value for this OaCustomer.
     * 
     * @return billing_addr_state
     */
    public java.lang.String getBilling_addr_state() {
        return billing_addr_state;
    }


    /**
     * Sets the billing_addr_state value for this OaCustomer.
     * 
     * @param billing_addr_state
     */
    public void setBilling_addr_state(java.lang.String billing_addr_state) {
        this.billing_addr_state = billing_addr_state;
    }


    /**
     * Gets the contact_addr_first value for this OaCustomer.
     * 
     * @return contact_addr_first
     */
    public java.lang.String getContact_addr_first() {
        return contact_addr_first;
    }


    /**
     * Sets the contact_addr_first value for this OaCustomer.
     * 
     * @param contact_addr_first
     */
    public void setContact_addr_first(java.lang.String contact_addr_first) {
        this.contact_addr_first = contact_addr_first;
    }


    /**
     * Gets the addr_fax value for this OaCustomer.
     * 
     * @return addr_fax
     */
    public java.lang.String getAddr_fax() {
        return addr_fax;
    }


    /**
     * Sets the addr_fax value for this OaCustomer.
     * 
     * @param addr_fax
     */
    public void setAddr_fax(java.lang.String addr_fax) {
        this.addr_fax = addr_fax;
    }


    /**
     * Gets the addr_city value for this OaCustomer.
     * 
     * @return addr_city
     */
    public java.lang.String getAddr_city() {
        return addr_city;
    }


    /**
     * Sets the addr_city value for this OaCustomer.
     * 
     * @param addr_city
     */
    public void setAddr_city(java.lang.String addr_city) {
        this.addr_city = addr_city;
    }


    /**
     * Gets the hear_aboutid value for this OaCustomer.
     * 
     * @return hear_aboutid
     */
    public java.lang.String getHear_aboutid() {
        return hear_aboutid;
    }


    /**
     * Sets the hear_aboutid value for this OaCustomer.
     * 
     * @param hear_aboutid
     */
    public void setHear_aboutid(java.lang.String hear_aboutid) {
        this.hear_aboutid = hear_aboutid;
    }


    /**
     * Gets the billing_addr_country value for this OaCustomer.
     * 
     * @return billing_addr_country
     */
    public java.lang.String getBilling_addr_country() {
        return billing_addr_country;
    }


    /**
     * Sets the billing_addr_country value for this OaCustomer.
     * 
     * @param billing_addr_country
     */
    public void setBilling_addr_country(java.lang.String billing_addr_country) {
        this.billing_addr_country = billing_addr_country;
    }


    /**
     * Gets the statements value for this OaCustomer.
     * 
     * @return statements
     */
    public java.lang.String getStatements() {
        return statements;
    }


    /**
     * Sets the statements value for this OaCustomer.
     * 
     * @param statements
     */
    public void setStatements(java.lang.String statements) {
        this.statements = statements;
    }


    /**
     * Gets the contact_addr_zip value for this OaCustomer.
     * 
     * @return contact_addr_zip
     */
    public java.lang.String getContact_addr_zip() {
        return contact_addr_zip;
    }


    /**
     * Sets the contact_addr_zip value for this OaCustomer.
     * 
     * @param contact_addr_zip
     */
    public void setContact_addr_zip(java.lang.String contact_addr_zip) {
        this.contact_addr_zip = contact_addr_zip;
    }


    /**
     * Gets the contact_addr_email value for this OaCustomer.
     * 
     * @return contact_addr_email
     */
    public java.lang.String getContact_addr_email() {
        return contact_addr_email;
    }


    /**
     * Sets the contact_addr_email value for this OaCustomer.
     * 
     * @param contact_addr_email
     */
    public void setContact_addr_email(java.lang.String contact_addr_email) {
        this.contact_addr_email = contact_addr_email;
    }


    /**
     * Gets the company_sizeid value for this OaCustomer.
     * 
     * @return company_sizeid
     */
    public java.lang.String getCompany_sizeid() {
        return company_sizeid;
    }


    /**
     * Sets the company_sizeid value for this OaCustomer.
     * 
     * @param company_sizeid
     */
    public void setCompany_sizeid(java.lang.String company_sizeid) {
        this.company_sizeid = company_sizeid;
    }


    /**
     * Gets the web value for this OaCustomer.
     * 
     * @return web
     */
    public java.lang.String getWeb() {
        return web;
    }


    /**
     * Sets the web value for this OaCustomer.
     * 
     * @param web
     */
    public void setWeb(java.lang.String web) {
        this.web = web;
    }


    /**
     * Gets the currency value for this OaCustomer.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaCustomer.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the billing_addr_city value for this OaCustomer.
     * 
     * @return billing_addr_city
     */
    public java.lang.String getBilling_addr_city() {
        return billing_addr_city;
    }


    /**
     * Sets the billing_addr_city value for this OaCustomer.
     * 
     * @param billing_addr_city
     */
    public void setBilling_addr_city(java.lang.String billing_addr_city) {
        this.billing_addr_city = billing_addr_city;
    }


    /**
     * Gets the cost_centerid value for this OaCustomer.
     * 
     * @return cost_centerid
     */
    public java.lang.String getCost_centerid() {
        return cost_centerid;
    }


    /**
     * Sets the cost_centerid value for this OaCustomer.
     * 
     * @param cost_centerid
     */
    public void setCost_centerid(java.lang.String cost_centerid) {
        this.cost_centerid = cost_centerid;
    }


    /**
     * Gets the contact_addr_addr4 value for this OaCustomer.
     * 
     * @return contact_addr_addr4
     */
    public java.lang.String getContact_addr_addr4() {
        return contact_addr_addr4;
    }


    /**
     * Sets the contact_addr_addr4 value for this OaCustomer.
     * 
     * @param contact_addr_addr4
     */
    public void setContact_addr_addr4(java.lang.String contact_addr_addr4) {
        this.contact_addr_addr4 = contact_addr_addr4;
    }


    /**
     * Gets the addr_zip value for this OaCustomer.
     * 
     * @return addr_zip
     */
    public java.lang.String getAddr_zip() {
        return addr_zip;
    }


    /**
     * Sets the addr_zip value for this OaCustomer.
     * 
     * @param addr_zip
     */
    public void setAddr_zip(java.lang.String addr_zip) {
        this.addr_zip = addr_zip;
    }


    /**
     * Gets the contact_addr_addr2 value for this OaCustomer.
     * 
     * @return contact_addr_addr2
     */
    public java.lang.String getContact_addr_addr2() {
        return contact_addr_addr2;
    }


    /**
     * Sets the contact_addr_addr2 value for this OaCustomer.
     * 
     * @param contact_addr_addr2
     */
    public void setContact_addr_addr2(java.lang.String contact_addr_addr2) {
        this.contact_addr_addr2 = contact_addr_addr2;
    }


    /**
     * Gets the addr_addr1 value for this OaCustomer.
     * 
     * @return addr_addr1
     */
    public java.lang.String getAddr_addr1() {
        return addr_addr1;
    }


    /**
     * Sets the addr_addr1 value for this OaCustomer.
     * 
     * @param addr_addr1
     */
    public void setAddr_addr1(java.lang.String addr_addr1) {
        this.addr_addr1 = addr_addr1;
    }


    /**
     * Gets the contact_addr_addr3 value for this OaCustomer.
     * 
     * @return contact_addr_addr3
     */
    public java.lang.String getContact_addr_addr3() {
        return contact_addr_addr3;
    }


    /**
     * Sets the contact_addr_addr3 value for this OaCustomer.
     * 
     * @param contact_addr_addr3
     */
    public void setContact_addr_addr3(java.lang.String contact_addr_addr3) {
        this.contact_addr_addr3 = contact_addr_addr3;
    }


    /**
     * Gets the addr_middle value for this OaCustomer.
     * 
     * @return addr_middle
     */
    public java.lang.String getAddr_middle() {
        return addr_middle;
    }


    /**
     * Sets the addr_middle value for this OaCustomer.
     * 
     * @param addr_middle
     */
    public void setAddr_middle(java.lang.String addr_middle) {
        this.addr_middle = addr_middle;
    }


    /**
     * Gets the billing_addr_id value for this OaCustomer.
     * 
     * @return billing_addr_id
     */
    public java.lang.String getBilling_addr_id() {
        return billing_addr_id;
    }


    /**
     * Sets the billing_addr_id value for this OaCustomer.
     * 
     * @param billing_addr_id
     */
    public void setBilling_addr_id(java.lang.String billing_addr_id) {
        this.billing_addr_id = billing_addr_id;
    }


    /**
     * Gets the te_include value for this OaCustomer.
     * 
     * @return te_include
     */
    public java.lang.String getTe_include() {
        return te_include;
    }


    /**
     * Sets the te_include value for this OaCustomer.
     * 
     * @param te_include
     */
    public void setTe_include(java.lang.String te_include) {
        this.te_include = te_include;
    }


    /**
     * Gets the addr_addr2 value for this OaCustomer.
     * 
     * @return addr_addr2
     */
    public java.lang.String getAddr_addr2() {
        return addr_addr2;
    }


    /**
     * Sets the addr_addr2 value for this OaCustomer.
     * 
     * @param addr_addr2
     */
    public void setAddr_addr2(java.lang.String addr_addr2) {
        this.addr_addr2 = addr_addr2;
    }


    /**
     * Gets the contact_addr_last value for this OaCustomer.
     * 
     * @return contact_addr_last
     */
    public java.lang.String getContact_addr_last() {
        return contact_addr_last;
    }


    /**
     * Sets the contact_addr_last value for this OaCustomer.
     * 
     * @param contact_addr_last
     */
    public void setContact_addr_last(java.lang.String contact_addr_last) {
        this.contact_addr_last = contact_addr_last;
    }


    /**
     * Gets the notes value for this OaCustomer.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaCustomer.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the contact_addr_phone value for this OaCustomer.
     * 
     * @return contact_addr_phone
     */
    public java.lang.String getContact_addr_phone() {
        return contact_addr_phone;
    }


    /**
     * Sets the contact_addr_phone value for this OaCustomer.
     * 
     * @param contact_addr_phone
     */
    public void setContact_addr_phone(java.lang.String contact_addr_phone) {
        this.contact_addr_phone = contact_addr_phone;
    }


    /**
     * Gets the tb_approvalprocess value for this OaCustomer.
     * 
     * @return tb_approvalprocess
     */
    public java.lang.String getTb_approvalprocess() {
        return tb_approvalprocess;
    }


    /**
     * Sets the tb_approvalprocess value for this OaCustomer.
     * 
     * @param tb_approvalprocess
     */
    public void setTb_approvalprocess(java.lang.String tb_approvalprocess) {
        this.tb_approvalprocess = tb_approvalprocess;
    }


    /**
     * Gets the contact_addr_id value for this OaCustomer.
     * 
     * @return contact_addr_id
     */
    public java.lang.String getContact_addr_id() {
        return contact_addr_id;
    }


    /**
     * Sets the contact_addr_id value for this OaCustomer.
     * 
     * @param contact_addr_id
     */
    public void setContact_addr_id(java.lang.String contact_addr_id) {
        this.contact_addr_id = contact_addr_id;
    }


    /**
     * Gets the primary_contactid value for this OaCustomer.
     * 
     * @return primary_contactid
     */
    public java.lang.String getPrimary_contactid() {
        return primary_contactid;
    }


    /**
     * Sets the primary_contactid value for this OaCustomer.
     * 
     * @param primary_contactid
     */
    public void setPrimary_contactid(java.lang.String primary_contactid) {
        this.primary_contactid = primary_contactid;
    }


    /**
     * Gets the contact_addr_middle value for this OaCustomer.
     * 
     * @return contact_addr_middle
     */
    public java.lang.String getContact_addr_middle() {
        return contact_addr_middle;
    }


    /**
     * Sets the contact_addr_middle value for this OaCustomer.
     * 
     * @param contact_addr_middle
     */
    public void setContact_addr_middle(java.lang.String contact_addr_middle) {
        this.contact_addr_middle = contact_addr_middle;
    }


    /**
     * Gets the billing_addr_addr3 value for this OaCustomer.
     * 
     * @return billing_addr_addr3
     */
    public java.lang.String getBilling_addr_addr3() {
        return billing_addr_addr3;
    }


    /**
     * Sets the billing_addr_addr3 value for this OaCustomer.
     * 
     * @param billing_addr_addr3
     */
    public void setBilling_addr_addr3(java.lang.String billing_addr_addr3) {
        this.billing_addr_addr3 = billing_addr_addr3;
    }


    /**
     * Gets the addr_addr4 value for this OaCustomer.
     * 
     * @return addr_addr4
     */
    public java.lang.String getAddr_addr4() {
        return addr_addr4;
    }


    /**
     * Sets the addr_addr4 value for this OaCustomer.
     * 
     * @param addr_addr4
     */
    public void setAddr_addr4(java.lang.String addr_addr4) {
        this.addr_addr4 = addr_addr4;
    }


    /**
     * Gets the picklist_label value for this OaCustomer.
     * 
     * @return picklist_label
     */
    public java.lang.String getPicklist_label() {
        return picklist_label;
    }


    /**
     * Sets the picklist_label value for this OaCustomer.
     * 
     * @param picklist_label
     */
    public void setPicklist_label(java.lang.String picklist_label) {
        this.picklist_label = picklist_label;
    }


    /**
     * Gets the contact_addr_state value for this OaCustomer.
     * 
     * @return contact_addr_state
     */
    public java.lang.String getContact_addr_state() {
        return contact_addr_state;
    }


    /**
     * Sets the contact_addr_state value for this OaCustomer.
     * 
     * @param contact_addr_state
     */
    public void setContact_addr_state(java.lang.String contact_addr_state) {
        this.contact_addr_state = contact_addr_state;
    }


    /**
     * Gets the contact_addr_fax value for this OaCustomer.
     * 
     * @return contact_addr_fax
     */
    public java.lang.String getContact_addr_fax() {
        return contact_addr_fax;
    }


    /**
     * Sets the contact_addr_fax value for this OaCustomer.
     * 
     * @param contact_addr_fax
     */
    public void setContact_addr_fax(java.lang.String contact_addr_fax) {
        this.contact_addr_fax = contact_addr_fax;
    }


    /**
     * Gets the contact_addr_addr1 value for this OaCustomer.
     * 
     * @return contact_addr_addr1
     */
    public java.lang.String getContact_addr_addr1() {
        return contact_addr_addr1;
    }


    /**
     * Sets the contact_addr_addr1 value for this OaCustomer.
     * 
     * @param contact_addr_addr1
     */
    public void setContact_addr_addr1(java.lang.String contact_addr_addr1) {
        this.contact_addr_addr1 = contact_addr_addr1;
    }


    /**
     * Gets the updated value for this OaCustomer.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaCustomer.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaCustomer.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaCustomer.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the filterset_ids value for this OaCustomer.
     * 
     * @return filterset_ids
     */
    public java.lang.String getFilterset_ids() {
        return filterset_ids;
    }


    /**
     * Sets the filterset_ids value for this OaCustomer.
     * 
     * @param filterset_ids
     */
    public void setFilterset_ids(java.lang.String filterset_ids) {
        this.filterset_ids = filterset_ids;
    }


    /**
     * Gets the addr_first value for this OaCustomer.
     * 
     * @return addr_first
     */
    public java.lang.String getAddr_first() {
        return addr_first;
    }


    /**
     * Sets the addr_first value for this OaCustomer.
     * 
     * @param addr_first
     */
    public void setAddr_first(java.lang.String addr_first) {
        this.addr_first = addr_first;
    }


    /**
     * Gets the billing_addr_salutation value for this OaCustomer.
     * 
     * @return billing_addr_salutation
     */
    public java.lang.String getBilling_addr_salutation() {
        return billing_addr_salutation;
    }


    /**
     * Sets the billing_addr_salutation value for this OaCustomer.
     * 
     * @param billing_addr_salutation
     */
    public void setBilling_addr_salutation(java.lang.String billing_addr_salutation) {
        this.billing_addr_salutation = billing_addr_salutation;
    }


    /**
     * Gets the addr_addr3 value for this OaCustomer.
     * 
     * @return addr_addr3
     */
    public java.lang.String getAddr_addr3() {
        return addr_addr3;
    }


    /**
     * Sets the addr_addr3 value for this OaCustomer.
     * 
     * @param addr_addr3
     */
    public void setAddr_addr3(java.lang.String addr_addr3) {
        this.addr_addr3 = addr_addr3;
    }


    /**
     * Gets the sold_to_contactid value for this OaCustomer.
     * 
     * @return sold_to_contactid
     */
    public java.lang.String getSold_to_contactid() {
        return sold_to_contactid;
    }


    /**
     * Sets the sold_to_contactid value for this OaCustomer.
     * 
     * @param sold_to_contactid
     */
    public void setSold_to_contactid(java.lang.String sold_to_contactid) {
        this.sold_to_contactid = sold_to_contactid;
    }


    /**
     * Gets the billing_addr_contact_id value for this OaCustomer.
     * 
     * @return billing_addr_contact_id
     */
    public java.lang.String getBilling_addr_contact_id() {
        return billing_addr_contact_id;
    }


    /**
     * Sets the billing_addr_contact_id value for this OaCustomer.
     * 
     * @param billing_addr_contact_id
     */
    public void setBilling_addr_contact_id(java.lang.String billing_addr_contact_id) {
        this.billing_addr_contact_id = billing_addr_contact_id;
    }


    /**
     * Gets the active value for this OaCustomer.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this OaCustomer.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the billing_contact_id value for this OaCustomer.
     * 
     * @return billing_contact_id
     */
    public java.lang.String getBilling_contact_id() {
        return billing_contact_id;
    }


    /**
     * Sets the billing_contact_id value for this OaCustomer.
     * 
     * @param billing_contact_id
     */
    public void setBilling_contact_id(java.lang.String billing_contact_id) {
        this.billing_contact_id = billing_contact_id;
    }


    /**
     * Gets the externalid value for this OaCustomer.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaCustomer.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the addr_salutation value for this OaCustomer.
     * 
     * @return addr_salutation
     */
    public java.lang.String getAddr_salutation() {
        return addr_salutation;
    }


    /**
     * Sets the addr_salutation value for this OaCustomer.
     * 
     * @param addr_salutation
     */
    public void setAddr_salutation(java.lang.String addr_salutation) {
        this.addr_salutation = addr_salutation;
    }


    /**
     * Gets the billing_code value for this OaCustomer.
     * 
     * @return billing_code
     */
    public java.lang.String getBilling_code() {
        return billing_code;
    }


    /**
     * Sets the billing_code value for this OaCustomer.
     * 
     * @param billing_code
     */
    public void setBilling_code(java.lang.String billing_code) {
        this.billing_code = billing_code;
    }


    /**
     * Gets the contact_addr_salutation value for this OaCustomer.
     * 
     * @return contact_addr_salutation
     */
    public java.lang.String getContact_addr_salutation() {
        return contact_addr_salutation;
    }


    /**
     * Sets the contact_addr_salutation value for this OaCustomer.
     * 
     * @param contact_addr_salutation
     */
    public void setContact_addr_salutation(java.lang.String contact_addr_salutation) {
        this.contact_addr_salutation = contact_addr_salutation;
    }


    /**
     * Gets the invoice_prefix value for this OaCustomer.
     * 
     * @return invoice_prefix
     */
    public java.lang.String getInvoice_prefix() {
        return invoice_prefix;
    }


    /**
     * Sets the invoice_prefix value for this OaCustomer.
     * 
     * @param invoice_prefix
     */
    public void setInvoice_prefix(java.lang.String invoice_prefix) {
        this.invoice_prefix = invoice_prefix;
    }


    /**
     * Gets the type value for this OaCustomer.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaCustomer.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the billing_addr_addr4 value for this OaCustomer.
     * 
     * @return billing_addr_addr4
     */
    public java.lang.String getBilling_addr_addr4() {
        return billing_addr_addr4;
    }


    /**
     * Sets the billing_addr_addr4 value for this OaCustomer.
     * 
     * @param billing_addr_addr4
     */
    public void setBilling_addr_addr4(java.lang.String billing_addr_addr4) {
        this.billing_addr_addr4 = billing_addr_addr4;
    }


    /**
     * Gets the addr_state value for this OaCustomer.
     * 
     * @return addr_state
     */
    public java.lang.String getAddr_state() {
        return addr_state;
    }


    /**
     * Sets the addr_state value for this OaCustomer.
     * 
     * @param addr_state
     */
    public void setAddr_state(java.lang.String addr_state) {
        this.addr_state = addr_state;
    }


    /**
     * Gets the contact_addr_country value for this OaCustomer.
     * 
     * @return contact_addr_country
     */
    public java.lang.String getContact_addr_country() {
        return contact_addr_country;
    }


    /**
     * Sets the contact_addr_country value for this OaCustomer.
     * 
     * @param contact_addr_country
     */
    public void setContact_addr_country(java.lang.String contact_addr_country) {
        this.contact_addr_country = contact_addr_country;
    }


    /**
     * Gets the userid value for this OaCustomer.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaCustomer.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the billing_addr_phone value for this OaCustomer.
     * 
     * @return billing_addr_phone
     */
    public java.lang.String getBilling_addr_phone() {
        return billing_addr_phone;
    }


    /**
     * Sets the billing_addr_phone value for this OaCustomer.
     * 
     * @param billing_addr_phone
     */
    public void setBilling_addr_phone(java.lang.String billing_addr_phone) {
        this.billing_addr_phone = billing_addr_phone;
    }


    /**
     * Gets the terms value for this OaCustomer.
     * 
     * @return terms
     */
    public java.lang.String getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this OaCustomer.
     * 
     * @param terms
     */
    public void setTerms(java.lang.String terms) {
        this.terms = terms;
    }


    /**
     * Gets the addr_phone value for this OaCustomer.
     * 
     * @return addr_phone
     */
    public java.lang.String getAddr_phone() {
        return addr_phone;
    }


    /**
     * Sets the addr_phone value for this OaCustomer.
     * 
     * @param addr_phone
     */
    public void setAddr_phone(java.lang.String addr_phone) {
        this.addr_phone = addr_phone;
    }


    /**
     * Gets the createtime value for this OaCustomer.
     * 
     * @return createtime
     */
    public java.lang.String getCreatetime() {
        return createtime;
    }


    /**
     * Sets the createtime value for this OaCustomer.
     * 
     * @param createtime
     */
    public void setCreatetime(java.lang.String createtime) {
        this.createtime = createtime;
    }


    /**
     * Gets the ta_include value for this OaCustomer.
     * 
     * @return ta_include
     */
    public java.lang.String getTa_include() {
        return ta_include;
    }


    /**
     * Sets the ta_include value for this OaCustomer.
     * 
     * @param ta_include
     */
    public void setTa_include(java.lang.String ta_include) {
        this.ta_include = ta_include;
    }


    /**
     * Gets the invoice_text value for this OaCustomer.
     * 
     * @return invoice_text
     */
    public java.lang.String getInvoice_text() {
        return invoice_text;
    }


    /**
     * Sets the invoice_text value for this OaCustomer.
     * 
     * @param invoice_text
     */
    public void setInvoice_text(java.lang.String invoice_text) {
        this.invoice_text = invoice_text;
    }


    /**
     * Gets the company value for this OaCustomer.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this OaCustomer.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the billing_addr_email value for this OaCustomer.
     * 
     * @return billing_addr_email
     */
    public java.lang.String getBilling_addr_email() {
        return billing_addr_email;
    }


    /**
     * Sets the billing_addr_email value for this OaCustomer.
     * 
     * @param billing_addr_email
     */
    public void setBilling_addr_email(java.lang.String billing_addr_email) {
        this.billing_addr_email = billing_addr_email;
    }


    /**
     * Gets the addr_email value for this OaCustomer.
     * 
     * @return addr_email
     */
    public java.lang.String getAddr_email() {
        return addr_email;
    }


    /**
     * Sets the addr_email value for this OaCustomer.
     * 
     * @param addr_email
     */
    public void setAddr_email(java.lang.String addr_email) {
        this.addr_email = addr_email;
    }


    /**
     * Gets the updatetime value for this OaCustomer.
     * 
     * @return updatetime
     */
    public java.lang.String getUpdatetime() {
        return updatetime;
    }


    /**
     * Sets the updatetime value for this OaCustomer.
     * 
     * @param updatetime
     */
    public void setUpdatetime(java.lang.String updatetime) {
        this.updatetime = updatetime;
    }


    /**
     * Gets the shipping_contactid value for this OaCustomer.
     * 
     * @return shipping_contactid
     */
    public java.lang.String getShipping_contactid() {
        return shipping_contactid;
    }


    /**
     * Sets the shipping_contactid value for this OaCustomer.
     * 
     * @param shipping_contactid
     */
    public void setShipping_contactid(java.lang.String shipping_contactid) {
        this.shipping_contactid = shipping_contactid;
    }


    /**
     * Gets the billing_addr_addr1 value for this OaCustomer.
     * 
     * @return billing_addr_addr1
     */
    public java.lang.String getBilling_addr_addr1() {
        return billing_addr_addr1;
    }


    /**
     * Sets the billing_addr_addr1 value for this OaCustomer.
     * 
     * @param billing_addr_addr1
     */
    public void setBilling_addr_addr1(java.lang.String billing_addr_addr1) {
        this.billing_addr_addr1 = billing_addr_addr1;
    }


    /**
     * Gets the created value for this OaCustomer.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaCustomer.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the contact_addr_contact_id value for this OaCustomer.
     * 
     * @return contact_addr_contact_id
     */
    public java.lang.String getContact_addr_contact_id() {
        return contact_addr_contact_id;
    }


    /**
     * Sets the contact_addr_contact_id value for this OaCustomer.
     * 
     * @param contact_addr_contact_id
     */
    public void setContact_addr_contact_id(java.lang.String contact_addr_contact_id) {
        this.contact_addr_contact_id = contact_addr_contact_id;
    }


    /**
     * Gets the billing_addr_last value for this OaCustomer.
     * 
     * @return billing_addr_last
     */
    public java.lang.String getBilling_addr_last() {
        return billing_addr_last;
    }


    /**
     * Sets the billing_addr_last value for this OaCustomer.
     * 
     * @param billing_addr_last
     */
    public void setBilling_addr_last(java.lang.String billing_addr_last) {
        this.billing_addr_last = billing_addr_last;
    }


    /**
     * Gets the addr_id value for this OaCustomer.
     * 
     * @return addr_id
     */
    public java.lang.String getAddr_id() {
        return addr_id;
    }


    /**
     * Sets the addr_id value for this OaCustomer.
     * 
     * @param addr_id
     */
    public void setAddr_id(java.lang.String addr_id) {
        this.addr_id = addr_id;
    }


    /**
     * Gets the billing_addr_mobile value for this OaCustomer.
     * 
     * @return billing_addr_mobile
     */
    public java.lang.String getBilling_addr_mobile() {
        return billing_addr_mobile;
    }


    /**
     * Sets the billing_addr_mobile value for this OaCustomer.
     * 
     * @param billing_addr_mobile
     */
    public void setBilling_addr_mobile(java.lang.String billing_addr_mobile) {
        this.billing_addr_mobile = billing_addr_mobile;
    }


    /**
     * Gets the attributes value for this OaCustomer.
     * 
     * @return attributes
     */
    public modules.openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaCustomer.
     * 
     * @param attributes
     */
    public void setAttributes(modules.openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaCustomer)) return false;
        OaCustomer other = (OaCustomer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addr_mobile==null && other.getAddr_mobile()==null) || 
             (this.addr_mobile!=null &&
              this.addr_mobile.equals(other.getAddr_mobile()))) &&
            ((this.addr_contact_id==null && other.getAddr_contact_id()==null) || 
             (this.addr_contact_id!=null &&
              this.addr_contact_id.equals(other.getAddr_contact_id()))) &&
            ((this.addr_country==null && other.getAddr_country()==null) || 
             (this.addr_country!=null &&
              this.addr_country.equals(other.getAddr_country()))) &&
            ((this.billing_addr_first==null && other.getBilling_addr_first()==null) || 
             (this.billing_addr_first!=null &&
              this.billing_addr_first.equals(other.getBilling_addr_first()))) &&
            ((this.billing_addr_middle==null && other.getBilling_addr_middle()==null) || 
             (this.billing_addr_middle!=null &&
              this.billing_addr_middle.equals(other.getBilling_addr_middle()))) &&
            ((this.billing_addr_addr2==null && other.getBilling_addr_addr2()==null) || 
             (this.billing_addr_addr2!=null &&
              this.billing_addr_addr2.equals(other.getBilling_addr_addr2()))) &&
            ((this.invoice_layoutid==null && other.getInvoice_layoutid()==null) || 
             (this.invoice_layoutid!=null &&
              this.invoice_layoutid.equals(other.getInvoice_layoutid()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.bus_typeid==null && other.getBus_typeid()==null) || 
             (this.bus_typeid!=null &&
              this.bus_typeid.equals(other.getBus_typeid()))) &&
            ((this.billing_addr_zip==null && other.getBilling_addr_zip()==null) || 
             (this.billing_addr_zip!=null &&
              this.billing_addr_zip.equals(other.getBilling_addr_zip()))) &&
            ((this.contact_addr_mobile==null && other.getContact_addr_mobile()==null) || 
             (this.contact_addr_mobile!=null &&
              this.contact_addr_mobile.equals(other.getContact_addr_mobile()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.tb_approver==null && other.getTb_approver()==null) || 
             (this.tb_approver!=null &&
              this.tb_approver.equals(other.getTb_approver()))) &&
            ((this.contact_addr_city==null && other.getContact_addr_city()==null) || 
             (this.contact_addr_city!=null &&
              this.contact_addr_city.equals(other.getContact_addr_city()))) &&
            ((this.addr_last==null && other.getAddr_last()==null) || 
             (this.addr_last!=null &&
              this.addr_last.equals(other.getAddr_last()))) &&
            ((this.territoryid==null && other.getTerritoryid()==null) || 
             (this.territoryid!=null &&
              this.territoryid.equals(other.getTerritoryid()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.billing_addr_fax==null && other.getBilling_addr_fax()==null) || 
             (this.billing_addr_fax!=null &&
              this.billing_addr_fax.equals(other.getBilling_addr_fax()))) &&
            ((this.hierarchy_node_ids==null && other.getHierarchy_node_ids()==null) || 
             (this.hierarchy_node_ids!=null &&
              this.hierarchy_node_ids.equals(other.getHierarchy_node_ids()))) &&
            ((this.billing_addr_state==null && other.getBilling_addr_state()==null) || 
             (this.billing_addr_state!=null &&
              this.billing_addr_state.equals(other.getBilling_addr_state()))) &&
            ((this.contact_addr_first==null && other.getContact_addr_first()==null) || 
             (this.contact_addr_first!=null &&
              this.contact_addr_first.equals(other.getContact_addr_first()))) &&
            ((this.addr_fax==null && other.getAddr_fax()==null) || 
             (this.addr_fax!=null &&
              this.addr_fax.equals(other.getAddr_fax()))) &&
            ((this.addr_city==null && other.getAddr_city()==null) || 
             (this.addr_city!=null &&
              this.addr_city.equals(other.getAddr_city()))) &&
            ((this.hear_aboutid==null && other.getHear_aboutid()==null) || 
             (this.hear_aboutid!=null &&
              this.hear_aboutid.equals(other.getHear_aboutid()))) &&
            ((this.billing_addr_country==null && other.getBilling_addr_country()==null) || 
             (this.billing_addr_country!=null &&
              this.billing_addr_country.equals(other.getBilling_addr_country()))) &&
            ((this.statements==null && other.getStatements()==null) || 
             (this.statements!=null &&
              this.statements.equals(other.getStatements()))) &&
            ((this.contact_addr_zip==null && other.getContact_addr_zip()==null) || 
             (this.contact_addr_zip!=null &&
              this.contact_addr_zip.equals(other.getContact_addr_zip()))) &&
            ((this.contact_addr_email==null && other.getContact_addr_email()==null) || 
             (this.contact_addr_email!=null &&
              this.contact_addr_email.equals(other.getContact_addr_email()))) &&
            ((this.company_sizeid==null && other.getCompany_sizeid()==null) || 
             (this.company_sizeid!=null &&
              this.company_sizeid.equals(other.getCompany_sizeid()))) &&
            ((this.web==null && other.getWeb()==null) || 
             (this.web!=null &&
              this.web.equals(other.getWeb()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.billing_addr_city==null && other.getBilling_addr_city()==null) || 
             (this.billing_addr_city!=null &&
              this.billing_addr_city.equals(other.getBilling_addr_city()))) &&
            ((this.cost_centerid==null && other.getCost_centerid()==null) || 
             (this.cost_centerid!=null &&
              this.cost_centerid.equals(other.getCost_centerid()))) &&
            ((this.contact_addr_addr4==null && other.getContact_addr_addr4()==null) || 
             (this.contact_addr_addr4!=null &&
              this.contact_addr_addr4.equals(other.getContact_addr_addr4()))) &&
            ((this.addr_zip==null && other.getAddr_zip()==null) || 
             (this.addr_zip!=null &&
              this.addr_zip.equals(other.getAddr_zip()))) &&
            ((this.contact_addr_addr2==null && other.getContact_addr_addr2()==null) || 
             (this.contact_addr_addr2!=null &&
              this.contact_addr_addr2.equals(other.getContact_addr_addr2()))) &&
            ((this.addr_addr1==null && other.getAddr_addr1()==null) || 
             (this.addr_addr1!=null &&
              this.addr_addr1.equals(other.getAddr_addr1()))) &&
            ((this.contact_addr_addr3==null && other.getContact_addr_addr3()==null) || 
             (this.contact_addr_addr3!=null &&
              this.contact_addr_addr3.equals(other.getContact_addr_addr3()))) &&
            ((this.addr_middle==null && other.getAddr_middle()==null) || 
             (this.addr_middle!=null &&
              this.addr_middle.equals(other.getAddr_middle()))) &&
            ((this.billing_addr_id==null && other.getBilling_addr_id()==null) || 
             (this.billing_addr_id!=null &&
              this.billing_addr_id.equals(other.getBilling_addr_id()))) &&
            ((this.te_include==null && other.getTe_include()==null) || 
             (this.te_include!=null &&
              this.te_include.equals(other.getTe_include()))) &&
            ((this.addr_addr2==null && other.getAddr_addr2()==null) || 
             (this.addr_addr2!=null &&
              this.addr_addr2.equals(other.getAddr_addr2()))) &&
            ((this.contact_addr_last==null && other.getContact_addr_last()==null) || 
             (this.contact_addr_last!=null &&
              this.contact_addr_last.equals(other.getContact_addr_last()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.contact_addr_phone==null && other.getContact_addr_phone()==null) || 
             (this.contact_addr_phone!=null &&
              this.contact_addr_phone.equals(other.getContact_addr_phone()))) &&
            ((this.tb_approvalprocess==null && other.getTb_approvalprocess()==null) || 
             (this.tb_approvalprocess!=null &&
              this.tb_approvalprocess.equals(other.getTb_approvalprocess()))) &&
            ((this.contact_addr_id==null && other.getContact_addr_id()==null) || 
             (this.contact_addr_id!=null &&
              this.contact_addr_id.equals(other.getContact_addr_id()))) &&
            ((this.primary_contactid==null && other.getPrimary_contactid()==null) || 
             (this.primary_contactid!=null &&
              this.primary_contactid.equals(other.getPrimary_contactid()))) &&
            ((this.contact_addr_middle==null && other.getContact_addr_middle()==null) || 
             (this.contact_addr_middle!=null &&
              this.contact_addr_middle.equals(other.getContact_addr_middle()))) &&
            ((this.billing_addr_addr3==null && other.getBilling_addr_addr3()==null) || 
             (this.billing_addr_addr3!=null &&
              this.billing_addr_addr3.equals(other.getBilling_addr_addr3()))) &&
            ((this.addr_addr4==null && other.getAddr_addr4()==null) || 
             (this.addr_addr4!=null &&
              this.addr_addr4.equals(other.getAddr_addr4()))) &&
            ((this.picklist_label==null && other.getPicklist_label()==null) || 
             (this.picklist_label!=null &&
              this.picklist_label.equals(other.getPicklist_label()))) &&
            ((this.contact_addr_state==null && other.getContact_addr_state()==null) || 
             (this.contact_addr_state!=null &&
              this.contact_addr_state.equals(other.getContact_addr_state()))) &&
            ((this.contact_addr_fax==null && other.getContact_addr_fax()==null) || 
             (this.contact_addr_fax!=null &&
              this.contact_addr_fax.equals(other.getContact_addr_fax()))) &&
            ((this.contact_addr_addr1==null && other.getContact_addr_addr1()==null) || 
             (this.contact_addr_addr1!=null &&
              this.contact_addr_addr1.equals(other.getContact_addr_addr1()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.filterset_ids==null && other.getFilterset_ids()==null) || 
             (this.filterset_ids!=null &&
              this.filterset_ids.equals(other.getFilterset_ids()))) &&
            ((this.addr_first==null && other.getAddr_first()==null) || 
             (this.addr_first!=null &&
              this.addr_first.equals(other.getAddr_first()))) &&
            ((this.billing_addr_salutation==null && other.getBilling_addr_salutation()==null) || 
             (this.billing_addr_salutation!=null &&
              this.billing_addr_salutation.equals(other.getBilling_addr_salutation()))) &&
            ((this.addr_addr3==null && other.getAddr_addr3()==null) || 
             (this.addr_addr3!=null &&
              this.addr_addr3.equals(other.getAddr_addr3()))) &&
            ((this.sold_to_contactid==null && other.getSold_to_contactid()==null) || 
             (this.sold_to_contactid!=null &&
              this.sold_to_contactid.equals(other.getSold_to_contactid()))) &&
            ((this.billing_addr_contact_id==null && other.getBilling_addr_contact_id()==null) || 
             (this.billing_addr_contact_id!=null &&
              this.billing_addr_contact_id.equals(other.getBilling_addr_contact_id()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.billing_contact_id==null && other.getBilling_contact_id()==null) || 
             (this.billing_contact_id!=null &&
              this.billing_contact_id.equals(other.getBilling_contact_id()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.addr_salutation==null && other.getAddr_salutation()==null) || 
             (this.addr_salutation!=null &&
              this.addr_salutation.equals(other.getAddr_salutation()))) &&
            ((this.billing_code==null && other.getBilling_code()==null) || 
             (this.billing_code!=null &&
              this.billing_code.equals(other.getBilling_code()))) &&
            ((this.contact_addr_salutation==null && other.getContact_addr_salutation()==null) || 
             (this.contact_addr_salutation!=null &&
              this.contact_addr_salutation.equals(other.getContact_addr_salutation()))) &&
            ((this.invoice_prefix==null && other.getInvoice_prefix()==null) || 
             (this.invoice_prefix!=null &&
              this.invoice_prefix.equals(other.getInvoice_prefix()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.billing_addr_addr4==null && other.getBilling_addr_addr4()==null) || 
             (this.billing_addr_addr4!=null &&
              this.billing_addr_addr4.equals(other.getBilling_addr_addr4()))) &&
            ((this.addr_state==null && other.getAddr_state()==null) || 
             (this.addr_state!=null &&
              this.addr_state.equals(other.getAddr_state()))) &&
            ((this.contact_addr_country==null && other.getContact_addr_country()==null) || 
             (this.contact_addr_country!=null &&
              this.contact_addr_country.equals(other.getContact_addr_country()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.billing_addr_phone==null && other.getBilling_addr_phone()==null) || 
             (this.billing_addr_phone!=null &&
              this.billing_addr_phone.equals(other.getBilling_addr_phone()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.addr_phone==null && other.getAddr_phone()==null) || 
             (this.addr_phone!=null &&
              this.addr_phone.equals(other.getAddr_phone()))) &&
            ((this.createtime==null && other.getCreatetime()==null) || 
             (this.createtime!=null &&
              this.createtime.equals(other.getCreatetime()))) &&
            ((this.ta_include==null && other.getTa_include()==null) || 
             (this.ta_include!=null &&
              this.ta_include.equals(other.getTa_include()))) &&
            ((this.invoice_text==null && other.getInvoice_text()==null) || 
             (this.invoice_text!=null &&
              this.invoice_text.equals(other.getInvoice_text()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.billing_addr_email==null && other.getBilling_addr_email()==null) || 
             (this.billing_addr_email!=null &&
              this.billing_addr_email.equals(other.getBilling_addr_email()))) &&
            ((this.addr_email==null && other.getAddr_email()==null) || 
             (this.addr_email!=null &&
              this.addr_email.equals(other.getAddr_email()))) &&
            ((this.updatetime==null && other.getUpdatetime()==null) || 
             (this.updatetime!=null &&
              this.updatetime.equals(other.getUpdatetime()))) &&
            ((this.shipping_contactid==null && other.getShipping_contactid()==null) || 
             (this.shipping_contactid!=null &&
              this.shipping_contactid.equals(other.getShipping_contactid()))) &&
            ((this.billing_addr_addr1==null && other.getBilling_addr_addr1()==null) || 
             (this.billing_addr_addr1!=null &&
              this.billing_addr_addr1.equals(other.getBilling_addr_addr1()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.contact_addr_contact_id==null && other.getContact_addr_contact_id()==null) || 
             (this.contact_addr_contact_id!=null &&
              this.contact_addr_contact_id.equals(other.getContact_addr_contact_id()))) &&
            ((this.billing_addr_last==null && other.getBilling_addr_last()==null) || 
             (this.billing_addr_last!=null &&
              this.billing_addr_last.equals(other.getBilling_addr_last()))) &&
            ((this.addr_id==null && other.getAddr_id()==null) || 
             (this.addr_id!=null &&
              this.addr_id.equals(other.getAddr_id()))) &&
            ((this.billing_addr_mobile==null && other.getBilling_addr_mobile()==null) || 
             (this.billing_addr_mobile!=null &&
              this.billing_addr_mobile.equals(other.getBilling_addr_mobile()))) &&
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
        if (getAddr_mobile() != null) {
            _hashCode += getAddr_mobile().hashCode();
        }
        if (getAddr_contact_id() != null) {
            _hashCode += getAddr_contact_id().hashCode();
        }
        if (getAddr_country() != null) {
            _hashCode += getAddr_country().hashCode();
        }
        if (getBilling_addr_first() != null) {
            _hashCode += getBilling_addr_first().hashCode();
        }
        if (getBilling_addr_middle() != null) {
            _hashCode += getBilling_addr_middle().hashCode();
        }
        if (getBilling_addr_addr2() != null) {
            _hashCode += getBilling_addr_addr2().hashCode();
        }
        if (getInvoice_layoutid() != null) {
            _hashCode += getInvoice_layoutid().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getBus_typeid() != null) {
            _hashCode += getBus_typeid().hashCode();
        }
        if (getBilling_addr_zip() != null) {
            _hashCode += getBilling_addr_zip().hashCode();
        }
        if (getContact_addr_mobile() != null) {
            _hashCode += getContact_addr_mobile().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getTb_approver() != null) {
            _hashCode += getTb_approver().hashCode();
        }
        if (getContact_addr_city() != null) {
            _hashCode += getContact_addr_city().hashCode();
        }
        if (getAddr_last() != null) {
            _hashCode += getAddr_last().hashCode();
        }
        if (getTerritoryid() != null) {
            _hashCode += getTerritoryid().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getBilling_addr_fax() != null) {
            _hashCode += getBilling_addr_fax().hashCode();
        }
        if (getHierarchy_node_ids() != null) {
            _hashCode += getHierarchy_node_ids().hashCode();
        }
        if (getBilling_addr_state() != null) {
            _hashCode += getBilling_addr_state().hashCode();
        }
        if (getContact_addr_first() != null) {
            _hashCode += getContact_addr_first().hashCode();
        }
        if (getAddr_fax() != null) {
            _hashCode += getAddr_fax().hashCode();
        }
        if (getAddr_city() != null) {
            _hashCode += getAddr_city().hashCode();
        }
        if (getHear_aboutid() != null) {
            _hashCode += getHear_aboutid().hashCode();
        }
        if (getBilling_addr_country() != null) {
            _hashCode += getBilling_addr_country().hashCode();
        }
        if (getStatements() != null) {
            _hashCode += getStatements().hashCode();
        }
        if (getContact_addr_zip() != null) {
            _hashCode += getContact_addr_zip().hashCode();
        }
        if (getContact_addr_email() != null) {
            _hashCode += getContact_addr_email().hashCode();
        }
        if (getCompany_sizeid() != null) {
            _hashCode += getCompany_sizeid().hashCode();
        }
        if (getWeb() != null) {
            _hashCode += getWeb().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getBilling_addr_city() != null) {
            _hashCode += getBilling_addr_city().hashCode();
        }
        if (getCost_centerid() != null) {
            _hashCode += getCost_centerid().hashCode();
        }
        if (getContact_addr_addr4() != null) {
            _hashCode += getContact_addr_addr4().hashCode();
        }
        if (getAddr_zip() != null) {
            _hashCode += getAddr_zip().hashCode();
        }
        if (getContact_addr_addr2() != null) {
            _hashCode += getContact_addr_addr2().hashCode();
        }
        if (getAddr_addr1() != null) {
            _hashCode += getAddr_addr1().hashCode();
        }
        if (getContact_addr_addr3() != null) {
            _hashCode += getContact_addr_addr3().hashCode();
        }
        if (getAddr_middle() != null) {
            _hashCode += getAddr_middle().hashCode();
        }
        if (getBilling_addr_id() != null) {
            _hashCode += getBilling_addr_id().hashCode();
        }
        if (getTe_include() != null) {
            _hashCode += getTe_include().hashCode();
        }
        if (getAddr_addr2() != null) {
            _hashCode += getAddr_addr2().hashCode();
        }
        if (getContact_addr_last() != null) {
            _hashCode += getContact_addr_last().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getContact_addr_phone() != null) {
            _hashCode += getContact_addr_phone().hashCode();
        }
        if (getTb_approvalprocess() != null) {
            _hashCode += getTb_approvalprocess().hashCode();
        }
        if (getContact_addr_id() != null) {
            _hashCode += getContact_addr_id().hashCode();
        }
        if (getPrimary_contactid() != null) {
            _hashCode += getPrimary_contactid().hashCode();
        }
        if (getContact_addr_middle() != null) {
            _hashCode += getContact_addr_middle().hashCode();
        }
        if (getBilling_addr_addr3() != null) {
            _hashCode += getBilling_addr_addr3().hashCode();
        }
        if (getAddr_addr4() != null) {
            _hashCode += getAddr_addr4().hashCode();
        }
        if (getPicklist_label() != null) {
            _hashCode += getPicklist_label().hashCode();
        }
        if (getContact_addr_state() != null) {
            _hashCode += getContact_addr_state().hashCode();
        }
        if (getContact_addr_fax() != null) {
            _hashCode += getContact_addr_fax().hashCode();
        }
        if (getContact_addr_addr1() != null) {
            _hashCode += getContact_addr_addr1().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getFilterset_ids() != null) {
            _hashCode += getFilterset_ids().hashCode();
        }
        if (getAddr_first() != null) {
            _hashCode += getAddr_first().hashCode();
        }
        if (getBilling_addr_salutation() != null) {
            _hashCode += getBilling_addr_salutation().hashCode();
        }
        if (getAddr_addr3() != null) {
            _hashCode += getAddr_addr3().hashCode();
        }
        if (getSold_to_contactid() != null) {
            _hashCode += getSold_to_contactid().hashCode();
        }
        if (getBilling_addr_contact_id() != null) {
            _hashCode += getBilling_addr_contact_id().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getBilling_contact_id() != null) {
            _hashCode += getBilling_contact_id().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getAddr_salutation() != null) {
            _hashCode += getAddr_salutation().hashCode();
        }
        if (getBilling_code() != null) {
            _hashCode += getBilling_code().hashCode();
        }
        if (getContact_addr_salutation() != null) {
            _hashCode += getContact_addr_salutation().hashCode();
        }
        if (getInvoice_prefix() != null) {
            _hashCode += getInvoice_prefix().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBilling_addr_addr4() != null) {
            _hashCode += getBilling_addr_addr4().hashCode();
        }
        if (getAddr_state() != null) {
            _hashCode += getAddr_state().hashCode();
        }
        if (getContact_addr_country() != null) {
            _hashCode += getContact_addr_country().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getBilling_addr_phone() != null) {
            _hashCode += getBilling_addr_phone().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getAddr_phone() != null) {
            _hashCode += getAddr_phone().hashCode();
        }
        if (getCreatetime() != null) {
            _hashCode += getCreatetime().hashCode();
        }
        if (getTa_include() != null) {
            _hashCode += getTa_include().hashCode();
        }
        if (getInvoice_text() != null) {
            _hashCode += getInvoice_text().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getBilling_addr_email() != null) {
            _hashCode += getBilling_addr_email().hashCode();
        }
        if (getAddr_email() != null) {
            _hashCode += getAddr_email().hashCode();
        }
        if (getUpdatetime() != null) {
            _hashCode += getUpdatetime().hashCode();
        }
        if (getShipping_contactid() != null) {
            _hashCode += getShipping_contactid().hashCode();
        }
        if (getBilling_addr_addr1() != null) {
            _hashCode += getBilling_addr_addr1().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getContact_addr_contact_id() != null) {
            _hashCode += getContact_addr_contact_id().hashCode();
        }
        if (getBilling_addr_last() != null) {
            _hashCode += getBilling_addr_last().hashCode();
        }
        if (getAddr_id() != null) {
            _hashCode += getAddr_id().hashCode();
        }
        if (getBilling_addr_mobile() != null) {
            _hashCode += getBilling_addr_mobile().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaCustomer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCustomer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_contact_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_contact_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_first");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_middle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_middle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_addr2"));
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
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bus_typeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bus_typeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tb_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tb_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_last");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territoryid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "territoryid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchy_node_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hierarchy_node_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_first");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hear_aboutid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hear_aboutid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company_sizeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company_sizeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("web");
        elemField.setXmlName(new javax.xml.namespace.QName("", "web"));
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
        elemField.setFieldName("billing_addr_city");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_city"));
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
        elemField.setFieldName("contact_addr_addr4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_addr4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_zip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_addr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_addr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_addr3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_middle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_middle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("te_include");
        elemField.setXmlName(new javax.xml.namespace.QName("", "te_include"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_addr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_last");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_last"));
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
        elemField.setFieldName("contact_addr_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tb_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tb_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primary_contactid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primary_contactid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_middle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_middle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_addr3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_addr4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_addr4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picklist_label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "picklist_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_addr1"));
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
        elemField.setFieldName("filterset_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterset_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_first");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_first"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_addr3"));
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
        elemField.setFieldName("billing_addr_contact_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_contact_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_contact_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_contact_id"));
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
        elemField.setFieldName("addr_salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_prefix"));
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
        elemField.setFieldName("billing_addr_addr4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_addr4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact_addr_country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_country"));
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
        elemField.setFieldName("billing_addr_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_phone"));
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
        elemField.setFieldName("addr_phone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ta_include");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ta_include"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoice_text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "updatetime"));
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
        elemField.setFieldName("billing_addr_addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_addr1"));
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
        elemField.setFieldName("contact_addr_contact_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact_addr_contact_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_last");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billing_addr_mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billing_addr_mobile"));
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
