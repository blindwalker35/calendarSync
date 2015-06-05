/**
 * OaRevenue_recognition_rule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaRevenue_recognition_rule  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String user_filter;

    private java.lang.String purchase_how;

    private java.lang.String percent_complete;

    private java.lang.String percent;

    private java.lang.String end_milestone;

    private java.lang.String acct_date_how;

    private java.lang.String recognition_type;

    private java.lang.String marked_as_ready;

    private java.lang.String break_by_user;

    private java.lang.String percent_how;

    private java.lang.String category_3Id;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String timetype_filter;

    private java.lang.String expense_how;

    private java.lang.String name;

    private java.lang.String active;

    private java.lang.String slip_stage_filter;

    private java.lang.String categoryid;

    private java.lang.String asb_which_slips;

    private java.lang.String category_2Id;

    private java.lang.String start_milestone;

    private java.lang.String end_date;

    private java.lang.String category_4Id;

    private java.lang.String customerid;

    private java.lang.String agreementid;

    private java.lang.String type;

    private java.lang.String asb_exclude_slip_type;

    private java.lang.String accounting_period_id;

    private java.lang.String category_1Id;

    private java.lang.String item_filter;

    private java.lang.String customerpo_id;

    private java.lang.String percent_trigger;

    private java.lang.String project_task_filter;

    private java.lang.String product_filter;

    private java.lang.String currency;

    private java.lang.String repeatid;

    private java.lang.String phase;

    private java.lang.String acct_code;

    private java.lang.String start_date;

    private java.lang.String cost_center_id;

    private java.lang.String category_5Id;

    private java.lang.String assigned_user;

    private java.lang.String acct_date;

    private java.lang.String projectid;

    private java.lang.String created;

    private java.lang.String amount;

    private java.lang.String extra_data;

    private java.lang.String project_billing_rule_filter;

    private java.lang.String notes;

    private openair.wsdl.OaBase[] attributes;

    public OaRevenue_recognition_rule() {
    }

    public OaRevenue_recognition_rule(
           java.lang.String user_filter,
           java.lang.String purchase_how,
           java.lang.String percent_complete,
           java.lang.String percent,
           java.lang.String end_milestone,
           java.lang.String acct_date_how,
           java.lang.String recognition_type,
           java.lang.String marked_as_ready,
           java.lang.String break_by_user,
           java.lang.String percent_how,
           java.lang.String category_3Id,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String timetype_filter,
           java.lang.String expense_how,
           java.lang.String name,
           java.lang.String active,
           java.lang.String slip_stage_filter,
           java.lang.String categoryid,
           java.lang.String asb_which_slips,
           java.lang.String category_2Id,
           java.lang.String start_milestone,
           java.lang.String end_date,
           java.lang.String category_4Id,
           java.lang.String customerid,
           java.lang.String agreementid,
           java.lang.String type,
           java.lang.String asb_exclude_slip_type,
           java.lang.String accounting_period_id,
           java.lang.String category_1Id,
           java.lang.String item_filter,
           java.lang.String customerpo_id,
           java.lang.String percent_trigger,
           java.lang.String project_task_filter,
           java.lang.String product_filter,
           java.lang.String currency,
           java.lang.String repeatid,
           java.lang.String phase,
           java.lang.String acct_code,
           java.lang.String start_date,
           java.lang.String cost_center_id,
           java.lang.String category_5Id,
           java.lang.String assigned_user,
           java.lang.String acct_date,
           java.lang.String projectid,
           java.lang.String created,
           java.lang.String amount,
           java.lang.String extra_data,
           java.lang.String project_billing_rule_filter,
           java.lang.String notes,
           openair.wsdl.OaBase[] attributes) {
        this.user_filter = user_filter;
        this.purchase_how = purchase_how;
        this.percent_complete = percent_complete;
        this.percent = percent;
        this.end_milestone = end_milestone;
        this.acct_date_how = acct_date_how;
        this.recognition_type = recognition_type;
        this.marked_as_ready = marked_as_ready;
        this.break_by_user = break_by_user;
        this.percent_how = percent_how;
        this.category_3Id = category_3Id;
        this.id = id;
        this.updated = updated;
        this.timetype_filter = timetype_filter;
        this.expense_how = expense_how;
        this.name = name;
        this.active = active;
        this.slip_stage_filter = slip_stage_filter;
        this.categoryid = categoryid;
        this.asb_which_slips = asb_which_slips;
        this.category_2Id = category_2Id;
        this.start_milestone = start_milestone;
        this.end_date = end_date;
        this.category_4Id = category_4Id;
        this.customerid = customerid;
        this.agreementid = agreementid;
        this.type = type;
        this.asb_exclude_slip_type = asb_exclude_slip_type;
        this.accounting_period_id = accounting_period_id;
        this.category_1Id = category_1Id;
        this.item_filter = item_filter;
        this.customerpo_id = customerpo_id;
        this.percent_trigger = percent_trigger;
        this.project_task_filter = project_task_filter;
        this.product_filter = product_filter;
        this.currency = currency;
        this.repeatid = repeatid;
        this.phase = phase;
        this.acct_code = acct_code;
        this.start_date = start_date;
        this.cost_center_id = cost_center_id;
        this.category_5Id = category_5Id;
        this.assigned_user = assigned_user;
        this.acct_date = acct_date;
        this.projectid = projectid;
        this.created = created;
        this.amount = amount;
        this.extra_data = extra_data;
        this.project_billing_rule_filter = project_billing_rule_filter;
        this.notes = notes;
        this.attributes = attributes;
    }


    /**
     * Gets the user_filter value for this OaRevenue_recognition_rule.
     * 
     * @return user_filter
     */
    public java.lang.String getUser_filter() {
        return user_filter;
    }


    /**
     * Sets the user_filter value for this OaRevenue_recognition_rule.
     * 
     * @param user_filter
     */
    public void setUser_filter(java.lang.String user_filter) {
        this.user_filter = user_filter;
    }


    /**
     * Gets the purchase_how value for this OaRevenue_recognition_rule.
     * 
     * @return purchase_how
     */
    public java.lang.String getPurchase_how() {
        return purchase_how;
    }


    /**
     * Sets the purchase_how value for this OaRevenue_recognition_rule.
     * 
     * @param purchase_how
     */
    public void setPurchase_how(java.lang.String purchase_how) {
        this.purchase_how = purchase_how;
    }


    /**
     * Gets the percent_complete value for this OaRevenue_recognition_rule.
     * 
     * @return percent_complete
     */
    public java.lang.String getPercent_complete() {
        return percent_complete;
    }


    /**
     * Sets the percent_complete value for this OaRevenue_recognition_rule.
     * 
     * @param percent_complete
     */
    public void setPercent_complete(java.lang.String percent_complete) {
        this.percent_complete = percent_complete;
    }


    /**
     * Gets the percent value for this OaRevenue_recognition_rule.
     * 
     * @return percent
     */
    public java.lang.String getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this OaRevenue_recognition_rule.
     * 
     * @param percent
     */
    public void setPercent(java.lang.String percent) {
        this.percent = percent;
    }


    /**
     * Gets the end_milestone value for this OaRevenue_recognition_rule.
     * 
     * @return end_milestone
     */
    public java.lang.String getEnd_milestone() {
        return end_milestone;
    }


    /**
     * Sets the end_milestone value for this OaRevenue_recognition_rule.
     * 
     * @param end_milestone
     */
    public void setEnd_milestone(java.lang.String end_milestone) {
        this.end_milestone = end_milestone;
    }


    /**
     * Gets the acct_date_how value for this OaRevenue_recognition_rule.
     * 
     * @return acct_date_how
     */
    public java.lang.String getAcct_date_how() {
        return acct_date_how;
    }


    /**
     * Sets the acct_date_how value for this OaRevenue_recognition_rule.
     * 
     * @param acct_date_how
     */
    public void setAcct_date_how(java.lang.String acct_date_how) {
        this.acct_date_how = acct_date_how;
    }


    /**
     * Gets the recognition_type value for this OaRevenue_recognition_rule.
     * 
     * @return recognition_type
     */
    public java.lang.String getRecognition_type() {
        return recognition_type;
    }


    /**
     * Sets the recognition_type value for this OaRevenue_recognition_rule.
     * 
     * @param recognition_type
     */
    public void setRecognition_type(java.lang.String recognition_type) {
        this.recognition_type = recognition_type;
    }


    /**
     * Gets the marked_as_ready value for this OaRevenue_recognition_rule.
     * 
     * @return marked_as_ready
     */
    public java.lang.String getMarked_as_ready() {
        return marked_as_ready;
    }


    /**
     * Sets the marked_as_ready value for this OaRevenue_recognition_rule.
     * 
     * @param marked_as_ready
     */
    public void setMarked_as_ready(java.lang.String marked_as_ready) {
        this.marked_as_ready = marked_as_ready;
    }


    /**
     * Gets the break_by_user value for this OaRevenue_recognition_rule.
     * 
     * @return break_by_user
     */
    public java.lang.String getBreak_by_user() {
        return break_by_user;
    }


    /**
     * Sets the break_by_user value for this OaRevenue_recognition_rule.
     * 
     * @param break_by_user
     */
    public void setBreak_by_user(java.lang.String break_by_user) {
        this.break_by_user = break_by_user;
    }


    /**
     * Gets the percent_how value for this OaRevenue_recognition_rule.
     * 
     * @return percent_how
     */
    public java.lang.String getPercent_how() {
        return percent_how;
    }


    /**
     * Sets the percent_how value for this OaRevenue_recognition_rule.
     * 
     * @param percent_how
     */
    public void setPercent_how(java.lang.String percent_how) {
        this.percent_how = percent_how;
    }


    /**
     * Gets the category_3Id value for this OaRevenue_recognition_rule.
     * 
     * @return category_3Id
     */
    public java.lang.String getCategory_3Id() {
        return category_3Id;
    }


    /**
     * Sets the category_3Id value for this OaRevenue_recognition_rule.
     * 
     * @param category_3Id
     */
    public void setCategory_3Id(java.lang.String category_3Id) {
        this.category_3Id = category_3Id;
    }


    /**
     * Gets the id value for this OaRevenue_recognition_rule.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaRevenue_recognition_rule.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaRevenue_recognition_rule.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaRevenue_recognition_rule.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the timetype_filter value for this OaRevenue_recognition_rule.
     * 
     * @return timetype_filter
     */
    public java.lang.String getTimetype_filter() {
        return timetype_filter;
    }


    /**
     * Sets the timetype_filter value for this OaRevenue_recognition_rule.
     * 
     * @param timetype_filter
     */
    public void setTimetype_filter(java.lang.String timetype_filter) {
        this.timetype_filter = timetype_filter;
    }


    /**
     * Gets the expense_how value for this OaRevenue_recognition_rule.
     * 
     * @return expense_how
     */
    public java.lang.String getExpense_how() {
        return expense_how;
    }


    /**
     * Sets the expense_how value for this OaRevenue_recognition_rule.
     * 
     * @param expense_how
     */
    public void setExpense_how(java.lang.String expense_how) {
        this.expense_how = expense_how;
    }


    /**
     * Gets the name value for this OaRevenue_recognition_rule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaRevenue_recognition_rule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the active value for this OaRevenue_recognition_rule.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this OaRevenue_recognition_rule.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the slip_stage_filter value for this OaRevenue_recognition_rule.
     * 
     * @return slip_stage_filter
     */
    public java.lang.String getSlip_stage_filter() {
        return slip_stage_filter;
    }


    /**
     * Sets the slip_stage_filter value for this OaRevenue_recognition_rule.
     * 
     * @param slip_stage_filter
     */
    public void setSlip_stage_filter(java.lang.String slip_stage_filter) {
        this.slip_stage_filter = slip_stage_filter;
    }


    /**
     * Gets the categoryid value for this OaRevenue_recognition_rule.
     * 
     * @return categoryid
     */
    public java.lang.String getCategoryid() {
        return categoryid;
    }


    /**
     * Sets the categoryid value for this OaRevenue_recognition_rule.
     * 
     * @param categoryid
     */
    public void setCategoryid(java.lang.String categoryid) {
        this.categoryid = categoryid;
    }


    /**
     * Gets the asb_which_slips value for this OaRevenue_recognition_rule.
     * 
     * @return asb_which_slips
     */
    public java.lang.String getAsb_which_slips() {
        return asb_which_slips;
    }


    /**
     * Sets the asb_which_slips value for this OaRevenue_recognition_rule.
     * 
     * @param asb_which_slips
     */
    public void setAsb_which_slips(java.lang.String asb_which_slips) {
        this.asb_which_slips = asb_which_slips;
    }


    /**
     * Gets the category_2Id value for this OaRevenue_recognition_rule.
     * 
     * @return category_2Id
     */
    public java.lang.String getCategory_2Id() {
        return category_2Id;
    }


    /**
     * Sets the category_2Id value for this OaRevenue_recognition_rule.
     * 
     * @param category_2Id
     */
    public void setCategory_2Id(java.lang.String category_2Id) {
        this.category_2Id = category_2Id;
    }


    /**
     * Gets the start_milestone value for this OaRevenue_recognition_rule.
     * 
     * @return start_milestone
     */
    public java.lang.String getStart_milestone() {
        return start_milestone;
    }


    /**
     * Sets the start_milestone value for this OaRevenue_recognition_rule.
     * 
     * @param start_milestone
     */
    public void setStart_milestone(java.lang.String start_milestone) {
        this.start_milestone = start_milestone;
    }


    /**
     * Gets the end_date value for this OaRevenue_recognition_rule.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this OaRevenue_recognition_rule.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the category_4Id value for this OaRevenue_recognition_rule.
     * 
     * @return category_4Id
     */
    public java.lang.String getCategory_4Id() {
        return category_4Id;
    }


    /**
     * Sets the category_4Id value for this OaRevenue_recognition_rule.
     * 
     * @param category_4Id
     */
    public void setCategory_4Id(java.lang.String category_4Id) {
        this.category_4Id = category_4Id;
    }


    /**
     * Gets the customerid value for this OaRevenue_recognition_rule.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaRevenue_recognition_rule.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the agreementid value for this OaRevenue_recognition_rule.
     * 
     * @return agreementid
     */
    public java.lang.String getAgreementid() {
        return agreementid;
    }


    /**
     * Sets the agreementid value for this OaRevenue_recognition_rule.
     * 
     * @param agreementid
     */
    public void setAgreementid(java.lang.String agreementid) {
        this.agreementid = agreementid;
    }


    /**
     * Gets the type value for this OaRevenue_recognition_rule.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaRevenue_recognition_rule.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the asb_exclude_slip_type value for this OaRevenue_recognition_rule.
     * 
     * @return asb_exclude_slip_type
     */
    public java.lang.String getAsb_exclude_slip_type() {
        return asb_exclude_slip_type;
    }


    /**
     * Sets the asb_exclude_slip_type value for this OaRevenue_recognition_rule.
     * 
     * @param asb_exclude_slip_type
     */
    public void setAsb_exclude_slip_type(java.lang.String asb_exclude_slip_type) {
        this.asb_exclude_slip_type = asb_exclude_slip_type;
    }


    /**
     * Gets the accounting_period_id value for this OaRevenue_recognition_rule.
     * 
     * @return accounting_period_id
     */
    public java.lang.String getAccounting_period_id() {
        return accounting_period_id;
    }


    /**
     * Sets the accounting_period_id value for this OaRevenue_recognition_rule.
     * 
     * @param accounting_period_id
     */
    public void setAccounting_period_id(java.lang.String accounting_period_id) {
        this.accounting_period_id = accounting_period_id;
    }


    /**
     * Gets the category_1Id value for this OaRevenue_recognition_rule.
     * 
     * @return category_1Id
     */
    public java.lang.String getCategory_1Id() {
        return category_1Id;
    }


    /**
     * Sets the category_1Id value for this OaRevenue_recognition_rule.
     * 
     * @param category_1Id
     */
    public void setCategory_1Id(java.lang.String category_1Id) {
        this.category_1Id = category_1Id;
    }


    /**
     * Gets the item_filter value for this OaRevenue_recognition_rule.
     * 
     * @return item_filter
     */
    public java.lang.String getItem_filter() {
        return item_filter;
    }


    /**
     * Sets the item_filter value for this OaRevenue_recognition_rule.
     * 
     * @param item_filter
     */
    public void setItem_filter(java.lang.String item_filter) {
        this.item_filter = item_filter;
    }


    /**
     * Gets the customerpo_id value for this OaRevenue_recognition_rule.
     * 
     * @return customerpo_id
     */
    public java.lang.String getCustomerpo_id() {
        return customerpo_id;
    }


    /**
     * Sets the customerpo_id value for this OaRevenue_recognition_rule.
     * 
     * @param customerpo_id
     */
    public void setCustomerpo_id(java.lang.String customerpo_id) {
        this.customerpo_id = customerpo_id;
    }


    /**
     * Gets the percent_trigger value for this OaRevenue_recognition_rule.
     * 
     * @return percent_trigger
     */
    public java.lang.String getPercent_trigger() {
        return percent_trigger;
    }


    /**
     * Sets the percent_trigger value for this OaRevenue_recognition_rule.
     * 
     * @param percent_trigger
     */
    public void setPercent_trigger(java.lang.String percent_trigger) {
        this.percent_trigger = percent_trigger;
    }


    /**
     * Gets the project_task_filter value for this OaRevenue_recognition_rule.
     * 
     * @return project_task_filter
     */
    public java.lang.String getProject_task_filter() {
        return project_task_filter;
    }


    /**
     * Sets the project_task_filter value for this OaRevenue_recognition_rule.
     * 
     * @param project_task_filter
     */
    public void setProject_task_filter(java.lang.String project_task_filter) {
        this.project_task_filter = project_task_filter;
    }


    /**
     * Gets the product_filter value for this OaRevenue_recognition_rule.
     * 
     * @return product_filter
     */
    public java.lang.String getProduct_filter() {
        return product_filter;
    }


    /**
     * Sets the product_filter value for this OaRevenue_recognition_rule.
     * 
     * @param product_filter
     */
    public void setProduct_filter(java.lang.String product_filter) {
        this.product_filter = product_filter;
    }


    /**
     * Gets the currency value for this OaRevenue_recognition_rule.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaRevenue_recognition_rule.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the repeatid value for this OaRevenue_recognition_rule.
     * 
     * @return repeatid
     */
    public java.lang.String getRepeatid() {
        return repeatid;
    }


    /**
     * Sets the repeatid value for this OaRevenue_recognition_rule.
     * 
     * @param repeatid
     */
    public void setRepeatid(java.lang.String repeatid) {
        this.repeatid = repeatid;
    }


    /**
     * Gets the phase value for this OaRevenue_recognition_rule.
     * 
     * @return phase
     */
    public java.lang.String getPhase() {
        return phase;
    }


    /**
     * Sets the phase value for this OaRevenue_recognition_rule.
     * 
     * @param phase
     */
    public void setPhase(java.lang.String phase) {
        this.phase = phase;
    }


    /**
     * Gets the acct_code value for this OaRevenue_recognition_rule.
     * 
     * @return acct_code
     */
    public java.lang.String getAcct_code() {
        return acct_code;
    }


    /**
     * Sets the acct_code value for this OaRevenue_recognition_rule.
     * 
     * @param acct_code
     */
    public void setAcct_code(java.lang.String acct_code) {
        this.acct_code = acct_code;
    }


    /**
     * Gets the start_date value for this OaRevenue_recognition_rule.
     * 
     * @return start_date
     */
    public java.lang.String getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this OaRevenue_recognition_rule.
     * 
     * @param start_date
     */
    public void setStart_date(java.lang.String start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the cost_center_id value for this OaRevenue_recognition_rule.
     * 
     * @return cost_center_id
     */
    public java.lang.String getCost_center_id() {
        return cost_center_id;
    }


    /**
     * Sets the cost_center_id value for this OaRevenue_recognition_rule.
     * 
     * @param cost_center_id
     */
    public void setCost_center_id(java.lang.String cost_center_id) {
        this.cost_center_id = cost_center_id;
    }


    /**
     * Gets the category_5Id value for this OaRevenue_recognition_rule.
     * 
     * @return category_5Id
     */
    public java.lang.String getCategory_5Id() {
        return category_5Id;
    }


    /**
     * Sets the category_5Id value for this OaRevenue_recognition_rule.
     * 
     * @param category_5Id
     */
    public void setCategory_5Id(java.lang.String category_5Id) {
        this.category_5Id = category_5Id;
    }


    /**
     * Gets the assigned_user value for this OaRevenue_recognition_rule.
     * 
     * @return assigned_user
     */
    public java.lang.String getAssigned_user() {
        return assigned_user;
    }


    /**
     * Sets the assigned_user value for this OaRevenue_recognition_rule.
     * 
     * @param assigned_user
     */
    public void setAssigned_user(java.lang.String assigned_user) {
        this.assigned_user = assigned_user;
    }


    /**
     * Gets the acct_date value for this OaRevenue_recognition_rule.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaRevenue_recognition_rule.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the projectid value for this OaRevenue_recognition_rule.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaRevenue_recognition_rule.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the created value for this OaRevenue_recognition_rule.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaRevenue_recognition_rule.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the amount value for this OaRevenue_recognition_rule.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OaRevenue_recognition_rule.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the extra_data value for this OaRevenue_recognition_rule.
     * 
     * @return extra_data
     */
    public java.lang.String getExtra_data() {
        return extra_data;
    }


    /**
     * Sets the extra_data value for this OaRevenue_recognition_rule.
     * 
     * @param extra_data
     */
    public void setExtra_data(java.lang.String extra_data) {
        this.extra_data = extra_data;
    }


    /**
     * Gets the project_billing_rule_filter value for this OaRevenue_recognition_rule.
     * 
     * @return project_billing_rule_filter
     */
    public java.lang.String getProject_billing_rule_filter() {
        return project_billing_rule_filter;
    }


    /**
     * Sets the project_billing_rule_filter value for this OaRevenue_recognition_rule.
     * 
     * @param project_billing_rule_filter
     */
    public void setProject_billing_rule_filter(java.lang.String project_billing_rule_filter) {
        this.project_billing_rule_filter = project_billing_rule_filter;
    }


    /**
     * Gets the notes value for this OaRevenue_recognition_rule.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaRevenue_recognition_rule.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the attributes value for this OaRevenue_recognition_rule.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaRevenue_recognition_rule.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaRevenue_recognition_rule)) return false;
        OaRevenue_recognition_rule other = (OaRevenue_recognition_rule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.user_filter==null && other.getUser_filter()==null) || 
             (this.user_filter!=null &&
              this.user_filter.equals(other.getUser_filter()))) &&
            ((this.purchase_how==null && other.getPurchase_how()==null) || 
             (this.purchase_how!=null &&
              this.purchase_how.equals(other.getPurchase_how()))) &&
            ((this.percent_complete==null && other.getPercent_complete()==null) || 
             (this.percent_complete!=null &&
              this.percent_complete.equals(other.getPercent_complete()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent()))) &&
            ((this.end_milestone==null && other.getEnd_milestone()==null) || 
             (this.end_milestone!=null &&
              this.end_milestone.equals(other.getEnd_milestone()))) &&
            ((this.acct_date_how==null && other.getAcct_date_how()==null) || 
             (this.acct_date_how!=null &&
              this.acct_date_how.equals(other.getAcct_date_how()))) &&
            ((this.recognition_type==null && other.getRecognition_type()==null) || 
             (this.recognition_type!=null &&
              this.recognition_type.equals(other.getRecognition_type()))) &&
            ((this.marked_as_ready==null && other.getMarked_as_ready()==null) || 
             (this.marked_as_ready!=null &&
              this.marked_as_ready.equals(other.getMarked_as_ready()))) &&
            ((this.break_by_user==null && other.getBreak_by_user()==null) || 
             (this.break_by_user!=null &&
              this.break_by_user.equals(other.getBreak_by_user()))) &&
            ((this.percent_how==null && other.getPercent_how()==null) || 
             (this.percent_how!=null &&
              this.percent_how.equals(other.getPercent_how()))) &&
            ((this.category_3Id==null && other.getCategory_3Id()==null) || 
             (this.category_3Id!=null &&
              this.category_3Id.equals(other.getCategory_3Id()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.timetype_filter==null && other.getTimetype_filter()==null) || 
             (this.timetype_filter!=null &&
              this.timetype_filter.equals(other.getTimetype_filter()))) &&
            ((this.expense_how==null && other.getExpense_how()==null) || 
             (this.expense_how!=null &&
              this.expense_how.equals(other.getExpense_how()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.slip_stage_filter==null && other.getSlip_stage_filter()==null) || 
             (this.slip_stage_filter!=null &&
              this.slip_stage_filter.equals(other.getSlip_stage_filter()))) &&
            ((this.categoryid==null && other.getCategoryid()==null) || 
             (this.categoryid!=null &&
              this.categoryid.equals(other.getCategoryid()))) &&
            ((this.asb_which_slips==null && other.getAsb_which_slips()==null) || 
             (this.asb_which_slips!=null &&
              this.asb_which_slips.equals(other.getAsb_which_slips()))) &&
            ((this.category_2Id==null && other.getCategory_2Id()==null) || 
             (this.category_2Id!=null &&
              this.category_2Id.equals(other.getCategory_2Id()))) &&
            ((this.start_milestone==null && other.getStart_milestone()==null) || 
             (this.start_milestone!=null &&
              this.start_milestone.equals(other.getStart_milestone()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.category_4Id==null && other.getCategory_4Id()==null) || 
             (this.category_4Id!=null &&
              this.category_4Id.equals(other.getCategory_4Id()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.agreementid==null && other.getAgreementid()==null) || 
             (this.agreementid!=null &&
              this.agreementid.equals(other.getAgreementid()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.asb_exclude_slip_type==null && other.getAsb_exclude_slip_type()==null) || 
             (this.asb_exclude_slip_type!=null &&
              this.asb_exclude_slip_type.equals(other.getAsb_exclude_slip_type()))) &&
            ((this.accounting_period_id==null && other.getAccounting_period_id()==null) || 
             (this.accounting_period_id!=null &&
              this.accounting_period_id.equals(other.getAccounting_period_id()))) &&
            ((this.category_1Id==null && other.getCategory_1Id()==null) || 
             (this.category_1Id!=null &&
              this.category_1Id.equals(other.getCategory_1Id()))) &&
            ((this.item_filter==null && other.getItem_filter()==null) || 
             (this.item_filter!=null &&
              this.item_filter.equals(other.getItem_filter()))) &&
            ((this.customerpo_id==null && other.getCustomerpo_id()==null) || 
             (this.customerpo_id!=null &&
              this.customerpo_id.equals(other.getCustomerpo_id()))) &&
            ((this.percent_trigger==null && other.getPercent_trigger()==null) || 
             (this.percent_trigger!=null &&
              this.percent_trigger.equals(other.getPercent_trigger()))) &&
            ((this.project_task_filter==null && other.getProject_task_filter()==null) || 
             (this.project_task_filter!=null &&
              this.project_task_filter.equals(other.getProject_task_filter()))) &&
            ((this.product_filter==null && other.getProduct_filter()==null) || 
             (this.product_filter!=null &&
              this.product_filter.equals(other.getProduct_filter()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.repeatid==null && other.getRepeatid()==null) || 
             (this.repeatid!=null &&
              this.repeatid.equals(other.getRepeatid()))) &&
            ((this.phase==null && other.getPhase()==null) || 
             (this.phase!=null &&
              this.phase.equals(other.getPhase()))) &&
            ((this.acct_code==null && other.getAcct_code()==null) || 
             (this.acct_code!=null &&
              this.acct_code.equals(other.getAcct_code()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.cost_center_id==null && other.getCost_center_id()==null) || 
             (this.cost_center_id!=null &&
              this.cost_center_id.equals(other.getCost_center_id()))) &&
            ((this.category_5Id==null && other.getCategory_5Id()==null) || 
             (this.category_5Id!=null &&
              this.category_5Id.equals(other.getCategory_5Id()))) &&
            ((this.assigned_user==null && other.getAssigned_user()==null) || 
             (this.assigned_user!=null &&
              this.assigned_user.equals(other.getAssigned_user()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.extra_data==null && other.getExtra_data()==null) || 
             (this.extra_data!=null &&
              this.extra_data.equals(other.getExtra_data()))) &&
            ((this.project_billing_rule_filter==null && other.getProject_billing_rule_filter()==null) || 
             (this.project_billing_rule_filter!=null &&
              this.project_billing_rule_filter.equals(other.getProject_billing_rule_filter()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
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
        if (getUser_filter() != null) {
            _hashCode += getUser_filter().hashCode();
        }
        if (getPurchase_how() != null) {
            _hashCode += getPurchase_how().hashCode();
        }
        if (getPercent_complete() != null) {
            _hashCode += getPercent_complete().hashCode();
        }
        if (getPercent() != null) {
            _hashCode += getPercent().hashCode();
        }
        if (getEnd_milestone() != null) {
            _hashCode += getEnd_milestone().hashCode();
        }
        if (getAcct_date_how() != null) {
            _hashCode += getAcct_date_how().hashCode();
        }
        if (getRecognition_type() != null) {
            _hashCode += getRecognition_type().hashCode();
        }
        if (getMarked_as_ready() != null) {
            _hashCode += getMarked_as_ready().hashCode();
        }
        if (getBreak_by_user() != null) {
            _hashCode += getBreak_by_user().hashCode();
        }
        if (getPercent_how() != null) {
            _hashCode += getPercent_how().hashCode();
        }
        if (getCategory_3Id() != null) {
            _hashCode += getCategory_3Id().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getTimetype_filter() != null) {
            _hashCode += getTimetype_filter().hashCode();
        }
        if (getExpense_how() != null) {
            _hashCode += getExpense_how().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getSlip_stage_filter() != null) {
            _hashCode += getSlip_stage_filter().hashCode();
        }
        if (getCategoryid() != null) {
            _hashCode += getCategoryid().hashCode();
        }
        if (getAsb_which_slips() != null) {
            _hashCode += getAsb_which_slips().hashCode();
        }
        if (getCategory_2Id() != null) {
            _hashCode += getCategory_2Id().hashCode();
        }
        if (getStart_milestone() != null) {
            _hashCode += getStart_milestone().hashCode();
        }
        if (getEnd_date() != null) {
            _hashCode += getEnd_date().hashCode();
        }
        if (getCategory_4Id() != null) {
            _hashCode += getCategory_4Id().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getAgreementid() != null) {
            _hashCode += getAgreementid().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getAsb_exclude_slip_type() != null) {
            _hashCode += getAsb_exclude_slip_type().hashCode();
        }
        if (getAccounting_period_id() != null) {
            _hashCode += getAccounting_period_id().hashCode();
        }
        if (getCategory_1Id() != null) {
            _hashCode += getCategory_1Id().hashCode();
        }
        if (getItem_filter() != null) {
            _hashCode += getItem_filter().hashCode();
        }
        if (getCustomerpo_id() != null) {
            _hashCode += getCustomerpo_id().hashCode();
        }
        if (getPercent_trigger() != null) {
            _hashCode += getPercent_trigger().hashCode();
        }
        if (getProject_task_filter() != null) {
            _hashCode += getProject_task_filter().hashCode();
        }
        if (getProduct_filter() != null) {
            _hashCode += getProduct_filter().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getRepeatid() != null) {
            _hashCode += getRepeatid().hashCode();
        }
        if (getPhase() != null) {
            _hashCode += getPhase().hashCode();
        }
        if (getAcct_code() != null) {
            _hashCode += getAcct_code().hashCode();
        }
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getCost_center_id() != null) {
            _hashCode += getCost_center_id().hashCode();
        }
        if (getCategory_5Id() != null) {
            _hashCode += getCategory_5Id().hashCode();
        }
        if (getAssigned_user() != null) {
            _hashCode += getAssigned_user().hashCode();
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getExtra_data() != null) {
            _hashCode += getExtra_data().hashCode();
        }
        if (getProject_billing_rule_filter() != null) {
            _hashCode += getProject_billing_rule_filter().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaRevenue_recognition_rule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenue_recognition_rule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase_how");
        elemField.setXmlName(new javax.xml.namespace.QName("", "purchase_how"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent_complete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent_complete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_milestone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_milestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_date_how");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_date_how"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognition_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recognition_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marked_as_ready");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marked_as_ready"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("break_by_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "break_by_user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent_how");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent_how"));
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
        elemField.setFieldName("timetype_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timetype_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expense_how");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expense_how"));
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
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slip_stage_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_stage_filter"));
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
        elemField.setFieldName("asb_which_slips");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asb_which_slips"));
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
        elemField.setFieldName("start_milestone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_milestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "end_date"));
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
        elemField.setFieldName("agreementid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreementid"));
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
        elemField.setFieldName("asb_exclude_slip_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asb_exclude_slip_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounting_period_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accounting_period_id"));
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
        elemField.setFieldName("item_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerpo_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerpo_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percent_trigger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percent_trigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_task_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_task_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_filter"));
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
        elemField.setFieldName("repeatid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeatid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acct_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acct_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_center_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_center_id"));
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
        elemField.setFieldName("assigned_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assigned_user"));
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
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extra_data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extra_data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_billing_rule_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_billing_rule_filter"));
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
