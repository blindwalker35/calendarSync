/**
 * OaProjectbillingrule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaProjectbillingrule  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String user_filter;

    private java.lang.String cap_hours;

    private java.lang.String backout_gst;

    private java.lang.String ticket_maximums;

    private java.lang.String markup_type;

    private java.lang.String percent;

    private java.lang.String end_milestone;

    private java.lang.String acct_date_how;

    private java.lang.String daily_roll_to_next;

    private java.lang.String category_filter;

    private java.lang.String exclude_non_reimbursable;

    private java.lang.String percent_how;

    private java.lang.String adjust_if_capped;

    private java.lang.String slip_stageid;

    private java.lang.String category_3Id;

    private java.lang.String markup_category;

    private java.lang.String exclude_non_billable_task;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String cap;

    private java.lang.String timetype_filter;

    private java.lang.String daily_cap_period;

    private java.lang.String name;

    private java.lang.String active;

    private java.lang.String description;

    private java.lang.String categoryid;

    private java.lang.String category_2Id;

    private java.lang.String start_milestone;

    private java.lang.String end_date;

    private java.lang.String rate_from;

    private java.lang.String category_4Id;

    private java.lang.String customerid;

    private java.lang.String type;

    private java.lang.String agreementid;

    private java.lang.String customerpoid;

    private java.lang.String accounting_period_id;

    private java.lang.String category_1Id;

    private java.lang.String item_filter;

    private java.lang.String position;

    private java.lang.String rate_multiplier;

    private java.lang.String project_task_filter;

    private java.lang.String rate_cardid;

    private java.lang.String product_filter;

    private java.lang.String currency;

    private java.lang.String repeatid;

    private java.lang.String exclude_archived_ts;

    private java.lang.String daily_rate_multiplier;

    private java.lang.String exclude_non_billable;

    private java.lang.String markup;

    private java.lang.String start_date;

    private java.lang.String cost_center_id;

    private java.lang.String category_5Id;

    private java.lang.String category_when;

    private java.lang.String job_code_filter;

    private java.lang.String assigned_user;

    private java.lang.String daily_cap_hours;

    private java.lang.String acct_date;

    private java.lang.String projectid;

    private java.lang.String stop_if_capped;

    private java.lang.String created;

    private java.lang.String amount;

    private java.lang.String round_rules;

    private java.lang.String notes;

    private java.lang.String daily_cap_is_per_user;

    private openair.wsdl.OaBase[] attributes;

    public OaProjectbillingrule() {
    }

    public OaProjectbillingrule(
           java.lang.String user_filter,
           java.lang.String cap_hours,
           java.lang.String backout_gst,
           java.lang.String ticket_maximums,
           java.lang.String markup_type,
           java.lang.String percent,
           java.lang.String end_milestone,
           java.lang.String acct_date_how,
           java.lang.String daily_roll_to_next,
           java.lang.String category_filter,
           java.lang.String exclude_non_reimbursable,
           java.lang.String percent_how,
           java.lang.String adjust_if_capped,
           java.lang.String slip_stageid,
           java.lang.String category_3Id,
           java.lang.String markup_category,
           java.lang.String exclude_non_billable_task,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String cap,
           java.lang.String timetype_filter,
           java.lang.String daily_cap_period,
           java.lang.String name,
           java.lang.String active,
           java.lang.String description,
           java.lang.String categoryid,
           java.lang.String category_2Id,
           java.lang.String start_milestone,
           java.lang.String end_date,
           java.lang.String rate_from,
           java.lang.String category_4Id,
           java.lang.String customerid,
           java.lang.String type,
           java.lang.String agreementid,
           java.lang.String customerpoid,
           java.lang.String accounting_period_id,
           java.lang.String category_1Id,
           java.lang.String item_filter,
           java.lang.String position,
           java.lang.String rate_multiplier,
           java.lang.String project_task_filter,
           java.lang.String rate_cardid,
           java.lang.String product_filter,
           java.lang.String currency,
           java.lang.String repeatid,
           java.lang.String exclude_archived_ts,
           java.lang.String daily_rate_multiplier,
           java.lang.String exclude_non_billable,
           java.lang.String markup,
           java.lang.String start_date,
           java.lang.String cost_center_id,
           java.lang.String category_5Id,
           java.lang.String category_when,
           java.lang.String job_code_filter,
           java.lang.String assigned_user,
           java.lang.String daily_cap_hours,
           java.lang.String acct_date,
           java.lang.String projectid,
           java.lang.String stop_if_capped,
           java.lang.String created,
           java.lang.String amount,
           java.lang.String round_rules,
           java.lang.String notes,
           java.lang.String daily_cap_is_per_user,
           openair.wsdl.OaBase[] attributes) {
        this.user_filter = user_filter;
        this.cap_hours = cap_hours;
        this.backout_gst = backout_gst;
        this.ticket_maximums = ticket_maximums;
        this.markup_type = markup_type;
        this.percent = percent;
        this.end_milestone = end_milestone;
        this.acct_date_how = acct_date_how;
        this.daily_roll_to_next = daily_roll_to_next;
        this.category_filter = category_filter;
        this.exclude_non_reimbursable = exclude_non_reimbursable;
        this.percent_how = percent_how;
        this.adjust_if_capped = adjust_if_capped;
        this.slip_stageid = slip_stageid;
        this.category_3Id = category_3Id;
        this.markup_category = markup_category;
        this.exclude_non_billable_task = exclude_non_billable_task;
        this.id = id;
        this.updated = updated;
        this.cap = cap;
        this.timetype_filter = timetype_filter;
        this.daily_cap_period = daily_cap_period;
        this.name = name;
        this.active = active;
        this.description = description;
        this.categoryid = categoryid;
        this.category_2Id = category_2Id;
        this.start_milestone = start_milestone;
        this.end_date = end_date;
        this.rate_from = rate_from;
        this.category_4Id = category_4Id;
        this.customerid = customerid;
        this.type = type;
        this.agreementid = agreementid;
        this.customerpoid = customerpoid;
        this.accounting_period_id = accounting_period_id;
        this.category_1Id = category_1Id;
        this.item_filter = item_filter;
        this.position = position;
        this.rate_multiplier = rate_multiplier;
        this.project_task_filter = project_task_filter;
        this.rate_cardid = rate_cardid;
        this.product_filter = product_filter;
        this.currency = currency;
        this.repeatid = repeatid;
        this.exclude_archived_ts = exclude_archived_ts;
        this.daily_rate_multiplier = daily_rate_multiplier;
        this.exclude_non_billable = exclude_non_billable;
        this.markup = markup;
        this.start_date = start_date;
        this.cost_center_id = cost_center_id;
        this.category_5Id = category_5Id;
        this.category_when = category_when;
        this.job_code_filter = job_code_filter;
        this.assigned_user = assigned_user;
        this.daily_cap_hours = daily_cap_hours;
        this.acct_date = acct_date;
        this.projectid = projectid;
        this.stop_if_capped = stop_if_capped;
        this.created = created;
        this.amount = amount;
        this.round_rules = round_rules;
        this.notes = notes;
        this.daily_cap_is_per_user = daily_cap_is_per_user;
        this.attributes = attributes;
    }


    /**
     * Gets the user_filter value for this OaProjectbillingrule.
     * 
     * @return user_filter
     */
    public java.lang.String getUser_filter() {
        return user_filter;
    }


    /**
     * Sets the user_filter value for this OaProjectbillingrule.
     * 
     * @param user_filter
     */
    public void setUser_filter(java.lang.String user_filter) {
        this.user_filter = user_filter;
    }


    /**
     * Gets the cap_hours value for this OaProjectbillingrule.
     * 
     * @return cap_hours
     */
    public java.lang.String getCap_hours() {
        return cap_hours;
    }


    /**
     * Sets the cap_hours value for this OaProjectbillingrule.
     * 
     * @param cap_hours
     */
    public void setCap_hours(java.lang.String cap_hours) {
        this.cap_hours = cap_hours;
    }


    /**
     * Gets the backout_gst value for this OaProjectbillingrule.
     * 
     * @return backout_gst
     */
    public java.lang.String getBackout_gst() {
        return backout_gst;
    }


    /**
     * Sets the backout_gst value for this OaProjectbillingrule.
     * 
     * @param backout_gst
     */
    public void setBackout_gst(java.lang.String backout_gst) {
        this.backout_gst = backout_gst;
    }


    /**
     * Gets the ticket_maximums value for this OaProjectbillingrule.
     * 
     * @return ticket_maximums
     */
    public java.lang.String getTicket_maximums() {
        return ticket_maximums;
    }


    /**
     * Sets the ticket_maximums value for this OaProjectbillingrule.
     * 
     * @param ticket_maximums
     */
    public void setTicket_maximums(java.lang.String ticket_maximums) {
        this.ticket_maximums = ticket_maximums;
    }


    /**
     * Gets the markup_type value for this OaProjectbillingrule.
     * 
     * @return markup_type
     */
    public java.lang.String getMarkup_type() {
        return markup_type;
    }


    /**
     * Sets the markup_type value for this OaProjectbillingrule.
     * 
     * @param markup_type
     */
    public void setMarkup_type(java.lang.String markup_type) {
        this.markup_type = markup_type;
    }


    /**
     * Gets the percent value for this OaProjectbillingrule.
     * 
     * @return percent
     */
    public java.lang.String getPercent() {
        return percent;
    }


    /**
     * Sets the percent value for this OaProjectbillingrule.
     * 
     * @param percent
     */
    public void setPercent(java.lang.String percent) {
        this.percent = percent;
    }


    /**
     * Gets the end_milestone value for this OaProjectbillingrule.
     * 
     * @return end_milestone
     */
    public java.lang.String getEnd_milestone() {
        return end_milestone;
    }


    /**
     * Sets the end_milestone value for this OaProjectbillingrule.
     * 
     * @param end_milestone
     */
    public void setEnd_milestone(java.lang.String end_milestone) {
        this.end_milestone = end_milestone;
    }


    /**
     * Gets the acct_date_how value for this OaProjectbillingrule.
     * 
     * @return acct_date_how
     */
    public java.lang.String getAcct_date_how() {
        return acct_date_how;
    }


    /**
     * Sets the acct_date_how value for this OaProjectbillingrule.
     * 
     * @param acct_date_how
     */
    public void setAcct_date_how(java.lang.String acct_date_how) {
        this.acct_date_how = acct_date_how;
    }


    /**
     * Gets the daily_roll_to_next value for this OaProjectbillingrule.
     * 
     * @return daily_roll_to_next
     */
    public java.lang.String getDaily_roll_to_next() {
        return daily_roll_to_next;
    }


    /**
     * Sets the daily_roll_to_next value for this OaProjectbillingrule.
     * 
     * @param daily_roll_to_next
     */
    public void setDaily_roll_to_next(java.lang.String daily_roll_to_next) {
        this.daily_roll_to_next = daily_roll_to_next;
    }


    /**
     * Gets the category_filter value for this OaProjectbillingrule.
     * 
     * @return category_filter
     */
    public java.lang.String getCategory_filter() {
        return category_filter;
    }


    /**
     * Sets the category_filter value for this OaProjectbillingrule.
     * 
     * @param category_filter
     */
    public void setCategory_filter(java.lang.String category_filter) {
        this.category_filter = category_filter;
    }


    /**
     * Gets the exclude_non_reimbursable value for this OaProjectbillingrule.
     * 
     * @return exclude_non_reimbursable
     */
    public java.lang.String getExclude_non_reimbursable() {
        return exclude_non_reimbursable;
    }


    /**
     * Sets the exclude_non_reimbursable value for this OaProjectbillingrule.
     * 
     * @param exclude_non_reimbursable
     */
    public void setExclude_non_reimbursable(java.lang.String exclude_non_reimbursable) {
        this.exclude_non_reimbursable = exclude_non_reimbursable;
    }


    /**
     * Gets the percent_how value for this OaProjectbillingrule.
     * 
     * @return percent_how
     */
    public java.lang.String getPercent_how() {
        return percent_how;
    }


    /**
     * Sets the percent_how value for this OaProjectbillingrule.
     * 
     * @param percent_how
     */
    public void setPercent_how(java.lang.String percent_how) {
        this.percent_how = percent_how;
    }


    /**
     * Gets the adjust_if_capped value for this OaProjectbillingrule.
     * 
     * @return adjust_if_capped
     */
    public java.lang.String getAdjust_if_capped() {
        return adjust_if_capped;
    }


    /**
     * Sets the adjust_if_capped value for this OaProjectbillingrule.
     * 
     * @param adjust_if_capped
     */
    public void setAdjust_if_capped(java.lang.String adjust_if_capped) {
        this.adjust_if_capped = adjust_if_capped;
    }


    /**
     * Gets the slip_stageid value for this OaProjectbillingrule.
     * 
     * @return slip_stageid
     */
    public java.lang.String getSlip_stageid() {
        return slip_stageid;
    }


    /**
     * Sets the slip_stageid value for this OaProjectbillingrule.
     * 
     * @param slip_stageid
     */
    public void setSlip_stageid(java.lang.String slip_stageid) {
        this.slip_stageid = slip_stageid;
    }


    /**
     * Gets the category_3Id value for this OaProjectbillingrule.
     * 
     * @return category_3Id
     */
    public java.lang.String getCategory_3Id() {
        return category_3Id;
    }


    /**
     * Sets the category_3Id value for this OaProjectbillingrule.
     * 
     * @param category_3Id
     */
    public void setCategory_3Id(java.lang.String category_3Id) {
        this.category_3Id = category_3Id;
    }


    /**
     * Gets the markup_category value for this OaProjectbillingrule.
     * 
     * @return markup_category
     */
    public java.lang.String getMarkup_category() {
        return markup_category;
    }


    /**
     * Sets the markup_category value for this OaProjectbillingrule.
     * 
     * @param markup_category
     */
    public void setMarkup_category(java.lang.String markup_category) {
        this.markup_category = markup_category;
    }


    /**
     * Gets the exclude_non_billable_task value for this OaProjectbillingrule.
     * 
     * @return exclude_non_billable_task
     */
    public java.lang.String getExclude_non_billable_task() {
        return exclude_non_billable_task;
    }


    /**
     * Sets the exclude_non_billable_task value for this OaProjectbillingrule.
     * 
     * @param exclude_non_billable_task
     */
    public void setExclude_non_billable_task(java.lang.String exclude_non_billable_task) {
        this.exclude_non_billable_task = exclude_non_billable_task;
    }


    /**
     * Gets the id value for this OaProjectbillingrule.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaProjectbillingrule.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaProjectbillingrule.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaProjectbillingrule.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the cap value for this OaProjectbillingrule.
     * 
     * @return cap
     */
    public java.lang.String getCap() {
        return cap;
    }


    /**
     * Sets the cap value for this OaProjectbillingrule.
     * 
     * @param cap
     */
    public void setCap(java.lang.String cap) {
        this.cap = cap;
    }


    /**
     * Gets the timetype_filter value for this OaProjectbillingrule.
     * 
     * @return timetype_filter
     */
    public java.lang.String getTimetype_filter() {
        return timetype_filter;
    }


    /**
     * Sets the timetype_filter value for this OaProjectbillingrule.
     * 
     * @param timetype_filter
     */
    public void setTimetype_filter(java.lang.String timetype_filter) {
        this.timetype_filter = timetype_filter;
    }


    /**
     * Gets the daily_cap_period value for this OaProjectbillingrule.
     * 
     * @return daily_cap_period
     */
    public java.lang.String getDaily_cap_period() {
        return daily_cap_period;
    }


    /**
     * Sets the daily_cap_period value for this OaProjectbillingrule.
     * 
     * @param daily_cap_period
     */
    public void setDaily_cap_period(java.lang.String daily_cap_period) {
        this.daily_cap_period = daily_cap_period;
    }


    /**
     * Gets the name value for this OaProjectbillingrule.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaProjectbillingrule.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the active value for this OaProjectbillingrule.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this OaProjectbillingrule.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the description value for this OaProjectbillingrule.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaProjectbillingrule.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the categoryid value for this OaProjectbillingrule.
     * 
     * @return categoryid
     */
    public java.lang.String getCategoryid() {
        return categoryid;
    }


    /**
     * Sets the categoryid value for this OaProjectbillingrule.
     * 
     * @param categoryid
     */
    public void setCategoryid(java.lang.String categoryid) {
        this.categoryid = categoryid;
    }


    /**
     * Gets the category_2Id value for this OaProjectbillingrule.
     * 
     * @return category_2Id
     */
    public java.lang.String getCategory_2Id() {
        return category_2Id;
    }


    /**
     * Sets the category_2Id value for this OaProjectbillingrule.
     * 
     * @param category_2Id
     */
    public void setCategory_2Id(java.lang.String category_2Id) {
        this.category_2Id = category_2Id;
    }


    /**
     * Gets the start_milestone value for this OaProjectbillingrule.
     * 
     * @return start_milestone
     */
    public java.lang.String getStart_milestone() {
        return start_milestone;
    }


    /**
     * Sets the start_milestone value for this OaProjectbillingrule.
     * 
     * @param start_milestone
     */
    public void setStart_milestone(java.lang.String start_milestone) {
        this.start_milestone = start_milestone;
    }


    /**
     * Gets the end_date value for this OaProjectbillingrule.
     * 
     * @return end_date
     */
    public java.lang.String getEnd_date() {
        return end_date;
    }


    /**
     * Sets the end_date value for this OaProjectbillingrule.
     * 
     * @param end_date
     */
    public void setEnd_date(java.lang.String end_date) {
        this.end_date = end_date;
    }


    /**
     * Gets the rate_from value for this OaProjectbillingrule.
     * 
     * @return rate_from
     */
    public java.lang.String getRate_from() {
        return rate_from;
    }


    /**
     * Sets the rate_from value for this OaProjectbillingrule.
     * 
     * @param rate_from
     */
    public void setRate_from(java.lang.String rate_from) {
        this.rate_from = rate_from;
    }


    /**
     * Gets the category_4Id value for this OaProjectbillingrule.
     * 
     * @return category_4Id
     */
    public java.lang.String getCategory_4Id() {
        return category_4Id;
    }


    /**
     * Sets the category_4Id value for this OaProjectbillingrule.
     * 
     * @param category_4Id
     */
    public void setCategory_4Id(java.lang.String category_4Id) {
        this.category_4Id = category_4Id;
    }


    /**
     * Gets the customerid value for this OaProjectbillingrule.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaProjectbillingrule.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the type value for this OaProjectbillingrule.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaProjectbillingrule.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the agreementid value for this OaProjectbillingrule.
     * 
     * @return agreementid
     */
    public java.lang.String getAgreementid() {
        return agreementid;
    }


    /**
     * Sets the agreementid value for this OaProjectbillingrule.
     * 
     * @param agreementid
     */
    public void setAgreementid(java.lang.String agreementid) {
        this.agreementid = agreementid;
    }


    /**
     * Gets the customerpoid value for this OaProjectbillingrule.
     * 
     * @return customerpoid
     */
    public java.lang.String getCustomerpoid() {
        return customerpoid;
    }


    /**
     * Sets the customerpoid value for this OaProjectbillingrule.
     * 
     * @param customerpoid
     */
    public void setCustomerpoid(java.lang.String customerpoid) {
        this.customerpoid = customerpoid;
    }


    /**
     * Gets the accounting_period_id value for this OaProjectbillingrule.
     * 
     * @return accounting_period_id
     */
    public java.lang.String getAccounting_period_id() {
        return accounting_period_id;
    }


    /**
     * Sets the accounting_period_id value for this OaProjectbillingrule.
     * 
     * @param accounting_period_id
     */
    public void setAccounting_period_id(java.lang.String accounting_period_id) {
        this.accounting_period_id = accounting_period_id;
    }


    /**
     * Gets the category_1Id value for this OaProjectbillingrule.
     * 
     * @return category_1Id
     */
    public java.lang.String getCategory_1Id() {
        return category_1Id;
    }


    /**
     * Sets the category_1Id value for this OaProjectbillingrule.
     * 
     * @param category_1Id
     */
    public void setCategory_1Id(java.lang.String category_1Id) {
        this.category_1Id = category_1Id;
    }


    /**
     * Gets the item_filter value for this OaProjectbillingrule.
     * 
     * @return item_filter
     */
    public java.lang.String getItem_filter() {
        return item_filter;
    }


    /**
     * Sets the item_filter value for this OaProjectbillingrule.
     * 
     * @param item_filter
     */
    public void setItem_filter(java.lang.String item_filter) {
        this.item_filter = item_filter;
    }


    /**
     * Gets the position value for this OaProjectbillingrule.
     * 
     * @return position
     */
    public java.lang.String getPosition() {
        return position;
    }


    /**
     * Sets the position value for this OaProjectbillingrule.
     * 
     * @param position
     */
    public void setPosition(java.lang.String position) {
        this.position = position;
    }


    /**
     * Gets the rate_multiplier value for this OaProjectbillingrule.
     * 
     * @return rate_multiplier
     */
    public java.lang.String getRate_multiplier() {
        return rate_multiplier;
    }


    /**
     * Sets the rate_multiplier value for this OaProjectbillingrule.
     * 
     * @param rate_multiplier
     */
    public void setRate_multiplier(java.lang.String rate_multiplier) {
        this.rate_multiplier = rate_multiplier;
    }


    /**
     * Gets the project_task_filter value for this OaProjectbillingrule.
     * 
     * @return project_task_filter
     */
    public java.lang.String getProject_task_filter() {
        return project_task_filter;
    }


    /**
     * Sets the project_task_filter value for this OaProjectbillingrule.
     * 
     * @param project_task_filter
     */
    public void setProject_task_filter(java.lang.String project_task_filter) {
        this.project_task_filter = project_task_filter;
    }


    /**
     * Gets the rate_cardid value for this OaProjectbillingrule.
     * 
     * @return rate_cardid
     */
    public java.lang.String getRate_cardid() {
        return rate_cardid;
    }


    /**
     * Sets the rate_cardid value for this OaProjectbillingrule.
     * 
     * @param rate_cardid
     */
    public void setRate_cardid(java.lang.String rate_cardid) {
        this.rate_cardid = rate_cardid;
    }


    /**
     * Gets the product_filter value for this OaProjectbillingrule.
     * 
     * @return product_filter
     */
    public java.lang.String getProduct_filter() {
        return product_filter;
    }


    /**
     * Sets the product_filter value for this OaProjectbillingrule.
     * 
     * @param product_filter
     */
    public void setProduct_filter(java.lang.String product_filter) {
        this.product_filter = product_filter;
    }


    /**
     * Gets the currency value for this OaProjectbillingrule.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaProjectbillingrule.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the repeatid value for this OaProjectbillingrule.
     * 
     * @return repeatid
     */
    public java.lang.String getRepeatid() {
        return repeatid;
    }


    /**
     * Sets the repeatid value for this OaProjectbillingrule.
     * 
     * @param repeatid
     */
    public void setRepeatid(java.lang.String repeatid) {
        this.repeatid = repeatid;
    }


    /**
     * Gets the exclude_archived_ts value for this OaProjectbillingrule.
     * 
     * @return exclude_archived_ts
     */
    public java.lang.String getExclude_archived_ts() {
        return exclude_archived_ts;
    }


    /**
     * Sets the exclude_archived_ts value for this OaProjectbillingrule.
     * 
     * @param exclude_archived_ts
     */
    public void setExclude_archived_ts(java.lang.String exclude_archived_ts) {
        this.exclude_archived_ts = exclude_archived_ts;
    }


    /**
     * Gets the daily_rate_multiplier value for this OaProjectbillingrule.
     * 
     * @return daily_rate_multiplier
     */
    public java.lang.String getDaily_rate_multiplier() {
        return daily_rate_multiplier;
    }


    /**
     * Sets the daily_rate_multiplier value for this OaProjectbillingrule.
     * 
     * @param daily_rate_multiplier
     */
    public void setDaily_rate_multiplier(java.lang.String daily_rate_multiplier) {
        this.daily_rate_multiplier = daily_rate_multiplier;
    }


    /**
     * Gets the exclude_non_billable value for this OaProjectbillingrule.
     * 
     * @return exclude_non_billable
     */
    public java.lang.String getExclude_non_billable() {
        return exclude_non_billable;
    }


    /**
     * Sets the exclude_non_billable value for this OaProjectbillingrule.
     * 
     * @param exclude_non_billable
     */
    public void setExclude_non_billable(java.lang.String exclude_non_billable) {
        this.exclude_non_billable = exclude_non_billable;
    }


    /**
     * Gets the markup value for this OaProjectbillingrule.
     * 
     * @return markup
     */
    public java.lang.String getMarkup() {
        return markup;
    }


    /**
     * Sets the markup value for this OaProjectbillingrule.
     * 
     * @param markup
     */
    public void setMarkup(java.lang.String markup) {
        this.markup = markup;
    }


    /**
     * Gets the start_date value for this OaProjectbillingrule.
     * 
     * @return start_date
     */
    public java.lang.String getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this OaProjectbillingrule.
     * 
     * @param start_date
     */
    public void setStart_date(java.lang.String start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the cost_center_id value for this OaProjectbillingrule.
     * 
     * @return cost_center_id
     */
    public java.lang.String getCost_center_id() {
        return cost_center_id;
    }


    /**
     * Sets the cost_center_id value for this OaProjectbillingrule.
     * 
     * @param cost_center_id
     */
    public void setCost_center_id(java.lang.String cost_center_id) {
        this.cost_center_id = cost_center_id;
    }


    /**
     * Gets the category_5Id value for this OaProjectbillingrule.
     * 
     * @return category_5Id
     */
    public java.lang.String getCategory_5Id() {
        return category_5Id;
    }


    /**
     * Sets the category_5Id value for this OaProjectbillingrule.
     * 
     * @param category_5Id
     */
    public void setCategory_5Id(java.lang.String category_5Id) {
        this.category_5Id = category_5Id;
    }


    /**
     * Gets the category_when value for this OaProjectbillingrule.
     * 
     * @return category_when
     */
    public java.lang.String getCategory_when() {
        return category_when;
    }


    /**
     * Sets the category_when value for this OaProjectbillingrule.
     * 
     * @param category_when
     */
    public void setCategory_when(java.lang.String category_when) {
        this.category_when = category_when;
    }


    /**
     * Gets the job_code_filter value for this OaProjectbillingrule.
     * 
     * @return job_code_filter
     */
    public java.lang.String getJob_code_filter() {
        return job_code_filter;
    }


    /**
     * Sets the job_code_filter value for this OaProjectbillingrule.
     * 
     * @param job_code_filter
     */
    public void setJob_code_filter(java.lang.String job_code_filter) {
        this.job_code_filter = job_code_filter;
    }


    /**
     * Gets the assigned_user value for this OaProjectbillingrule.
     * 
     * @return assigned_user
     */
    public java.lang.String getAssigned_user() {
        return assigned_user;
    }


    /**
     * Sets the assigned_user value for this OaProjectbillingrule.
     * 
     * @param assigned_user
     */
    public void setAssigned_user(java.lang.String assigned_user) {
        this.assigned_user = assigned_user;
    }


    /**
     * Gets the daily_cap_hours value for this OaProjectbillingrule.
     * 
     * @return daily_cap_hours
     */
    public java.lang.String getDaily_cap_hours() {
        return daily_cap_hours;
    }


    /**
     * Sets the daily_cap_hours value for this OaProjectbillingrule.
     * 
     * @param daily_cap_hours
     */
    public void setDaily_cap_hours(java.lang.String daily_cap_hours) {
        this.daily_cap_hours = daily_cap_hours;
    }


    /**
     * Gets the acct_date value for this OaProjectbillingrule.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaProjectbillingrule.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the projectid value for this OaProjectbillingrule.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaProjectbillingrule.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the stop_if_capped value for this OaProjectbillingrule.
     * 
     * @return stop_if_capped
     */
    public java.lang.String getStop_if_capped() {
        return stop_if_capped;
    }


    /**
     * Sets the stop_if_capped value for this OaProjectbillingrule.
     * 
     * @param stop_if_capped
     */
    public void setStop_if_capped(java.lang.String stop_if_capped) {
        this.stop_if_capped = stop_if_capped;
    }


    /**
     * Gets the created value for this OaProjectbillingrule.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaProjectbillingrule.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the amount value for this OaProjectbillingrule.
     * 
     * @return amount
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this OaProjectbillingrule.
     * 
     * @param amount
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the round_rules value for this OaProjectbillingrule.
     * 
     * @return round_rules
     */
    public java.lang.String getRound_rules() {
        return round_rules;
    }


    /**
     * Sets the round_rules value for this OaProjectbillingrule.
     * 
     * @param round_rules
     */
    public void setRound_rules(java.lang.String round_rules) {
        this.round_rules = round_rules;
    }


    /**
     * Gets the notes value for this OaProjectbillingrule.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaProjectbillingrule.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the daily_cap_is_per_user value for this OaProjectbillingrule.
     * 
     * @return daily_cap_is_per_user
     */
    public java.lang.String getDaily_cap_is_per_user() {
        return daily_cap_is_per_user;
    }


    /**
     * Sets the daily_cap_is_per_user value for this OaProjectbillingrule.
     * 
     * @param daily_cap_is_per_user
     */
    public void setDaily_cap_is_per_user(java.lang.String daily_cap_is_per_user) {
        this.daily_cap_is_per_user = daily_cap_is_per_user;
    }


    /**
     * Gets the attributes value for this OaProjectbillingrule.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaProjectbillingrule.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaProjectbillingrule)) return false;
        OaProjectbillingrule other = (OaProjectbillingrule) obj;
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
            ((this.cap_hours==null && other.getCap_hours()==null) || 
             (this.cap_hours!=null &&
              this.cap_hours.equals(other.getCap_hours()))) &&
            ((this.backout_gst==null && other.getBackout_gst()==null) || 
             (this.backout_gst!=null &&
              this.backout_gst.equals(other.getBackout_gst()))) &&
            ((this.ticket_maximums==null && other.getTicket_maximums()==null) || 
             (this.ticket_maximums!=null &&
              this.ticket_maximums.equals(other.getTicket_maximums()))) &&
            ((this.markup_type==null && other.getMarkup_type()==null) || 
             (this.markup_type!=null &&
              this.markup_type.equals(other.getMarkup_type()))) &&
            ((this.percent==null && other.getPercent()==null) || 
             (this.percent!=null &&
              this.percent.equals(other.getPercent()))) &&
            ((this.end_milestone==null && other.getEnd_milestone()==null) || 
             (this.end_milestone!=null &&
              this.end_milestone.equals(other.getEnd_milestone()))) &&
            ((this.acct_date_how==null && other.getAcct_date_how()==null) || 
             (this.acct_date_how!=null &&
              this.acct_date_how.equals(other.getAcct_date_how()))) &&
            ((this.daily_roll_to_next==null && other.getDaily_roll_to_next()==null) || 
             (this.daily_roll_to_next!=null &&
              this.daily_roll_to_next.equals(other.getDaily_roll_to_next()))) &&
            ((this.category_filter==null && other.getCategory_filter()==null) || 
             (this.category_filter!=null &&
              this.category_filter.equals(other.getCategory_filter()))) &&
            ((this.exclude_non_reimbursable==null && other.getExclude_non_reimbursable()==null) || 
             (this.exclude_non_reimbursable!=null &&
              this.exclude_non_reimbursable.equals(other.getExclude_non_reimbursable()))) &&
            ((this.percent_how==null && other.getPercent_how()==null) || 
             (this.percent_how!=null &&
              this.percent_how.equals(other.getPercent_how()))) &&
            ((this.adjust_if_capped==null && other.getAdjust_if_capped()==null) || 
             (this.adjust_if_capped!=null &&
              this.adjust_if_capped.equals(other.getAdjust_if_capped()))) &&
            ((this.slip_stageid==null && other.getSlip_stageid()==null) || 
             (this.slip_stageid!=null &&
              this.slip_stageid.equals(other.getSlip_stageid()))) &&
            ((this.category_3Id==null && other.getCategory_3Id()==null) || 
             (this.category_3Id!=null &&
              this.category_3Id.equals(other.getCategory_3Id()))) &&
            ((this.markup_category==null && other.getMarkup_category()==null) || 
             (this.markup_category!=null &&
              this.markup_category.equals(other.getMarkup_category()))) &&
            ((this.exclude_non_billable_task==null && other.getExclude_non_billable_task()==null) || 
             (this.exclude_non_billable_task!=null &&
              this.exclude_non_billable_task.equals(other.getExclude_non_billable_task()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.cap==null && other.getCap()==null) || 
             (this.cap!=null &&
              this.cap.equals(other.getCap()))) &&
            ((this.timetype_filter==null && other.getTimetype_filter()==null) || 
             (this.timetype_filter!=null &&
              this.timetype_filter.equals(other.getTimetype_filter()))) &&
            ((this.daily_cap_period==null && other.getDaily_cap_period()==null) || 
             (this.daily_cap_period!=null &&
              this.daily_cap_period.equals(other.getDaily_cap_period()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.categoryid==null && other.getCategoryid()==null) || 
             (this.categoryid!=null &&
              this.categoryid.equals(other.getCategoryid()))) &&
            ((this.category_2Id==null && other.getCategory_2Id()==null) || 
             (this.category_2Id!=null &&
              this.category_2Id.equals(other.getCategory_2Id()))) &&
            ((this.start_milestone==null && other.getStart_milestone()==null) || 
             (this.start_milestone!=null &&
              this.start_milestone.equals(other.getStart_milestone()))) &&
            ((this.end_date==null && other.getEnd_date()==null) || 
             (this.end_date!=null &&
              this.end_date.equals(other.getEnd_date()))) &&
            ((this.rate_from==null && other.getRate_from()==null) || 
             (this.rate_from!=null &&
              this.rate_from.equals(other.getRate_from()))) &&
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
            ((this.customerpoid==null && other.getCustomerpoid()==null) || 
             (this.customerpoid!=null &&
              this.customerpoid.equals(other.getCustomerpoid()))) &&
            ((this.accounting_period_id==null && other.getAccounting_period_id()==null) || 
             (this.accounting_period_id!=null &&
              this.accounting_period_id.equals(other.getAccounting_period_id()))) &&
            ((this.category_1Id==null && other.getCategory_1Id()==null) || 
             (this.category_1Id!=null &&
              this.category_1Id.equals(other.getCategory_1Id()))) &&
            ((this.item_filter==null && other.getItem_filter()==null) || 
             (this.item_filter!=null &&
              this.item_filter.equals(other.getItem_filter()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.rate_multiplier==null && other.getRate_multiplier()==null) || 
             (this.rate_multiplier!=null &&
              this.rate_multiplier.equals(other.getRate_multiplier()))) &&
            ((this.project_task_filter==null && other.getProject_task_filter()==null) || 
             (this.project_task_filter!=null &&
              this.project_task_filter.equals(other.getProject_task_filter()))) &&
            ((this.rate_cardid==null && other.getRate_cardid()==null) || 
             (this.rate_cardid!=null &&
              this.rate_cardid.equals(other.getRate_cardid()))) &&
            ((this.product_filter==null && other.getProduct_filter()==null) || 
             (this.product_filter!=null &&
              this.product_filter.equals(other.getProduct_filter()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.repeatid==null && other.getRepeatid()==null) || 
             (this.repeatid!=null &&
              this.repeatid.equals(other.getRepeatid()))) &&
            ((this.exclude_archived_ts==null && other.getExclude_archived_ts()==null) || 
             (this.exclude_archived_ts!=null &&
              this.exclude_archived_ts.equals(other.getExclude_archived_ts()))) &&
            ((this.daily_rate_multiplier==null && other.getDaily_rate_multiplier()==null) || 
             (this.daily_rate_multiplier!=null &&
              this.daily_rate_multiplier.equals(other.getDaily_rate_multiplier()))) &&
            ((this.exclude_non_billable==null && other.getExclude_non_billable()==null) || 
             (this.exclude_non_billable!=null &&
              this.exclude_non_billable.equals(other.getExclude_non_billable()))) &&
            ((this.markup==null && other.getMarkup()==null) || 
             (this.markup!=null &&
              this.markup.equals(other.getMarkup()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.cost_center_id==null && other.getCost_center_id()==null) || 
             (this.cost_center_id!=null &&
              this.cost_center_id.equals(other.getCost_center_id()))) &&
            ((this.category_5Id==null && other.getCategory_5Id()==null) || 
             (this.category_5Id!=null &&
              this.category_5Id.equals(other.getCategory_5Id()))) &&
            ((this.category_when==null && other.getCategory_when()==null) || 
             (this.category_when!=null &&
              this.category_when.equals(other.getCategory_when()))) &&
            ((this.job_code_filter==null && other.getJob_code_filter()==null) || 
             (this.job_code_filter!=null &&
              this.job_code_filter.equals(other.getJob_code_filter()))) &&
            ((this.assigned_user==null && other.getAssigned_user()==null) || 
             (this.assigned_user!=null &&
              this.assigned_user.equals(other.getAssigned_user()))) &&
            ((this.daily_cap_hours==null && other.getDaily_cap_hours()==null) || 
             (this.daily_cap_hours!=null &&
              this.daily_cap_hours.equals(other.getDaily_cap_hours()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.stop_if_capped==null && other.getStop_if_capped()==null) || 
             (this.stop_if_capped!=null &&
              this.stop_if_capped.equals(other.getStop_if_capped()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.round_rules==null && other.getRound_rules()==null) || 
             (this.round_rules!=null &&
              this.round_rules.equals(other.getRound_rules()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.daily_cap_is_per_user==null && other.getDaily_cap_is_per_user()==null) || 
             (this.daily_cap_is_per_user!=null &&
              this.daily_cap_is_per_user.equals(other.getDaily_cap_is_per_user()))) &&
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
        if (getCap_hours() != null) {
            _hashCode += getCap_hours().hashCode();
        }
        if (getBackout_gst() != null) {
            _hashCode += getBackout_gst().hashCode();
        }
        if (getTicket_maximums() != null) {
            _hashCode += getTicket_maximums().hashCode();
        }
        if (getMarkup_type() != null) {
            _hashCode += getMarkup_type().hashCode();
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
        if (getDaily_roll_to_next() != null) {
            _hashCode += getDaily_roll_to_next().hashCode();
        }
        if (getCategory_filter() != null) {
            _hashCode += getCategory_filter().hashCode();
        }
        if (getExclude_non_reimbursable() != null) {
            _hashCode += getExclude_non_reimbursable().hashCode();
        }
        if (getPercent_how() != null) {
            _hashCode += getPercent_how().hashCode();
        }
        if (getAdjust_if_capped() != null) {
            _hashCode += getAdjust_if_capped().hashCode();
        }
        if (getSlip_stageid() != null) {
            _hashCode += getSlip_stageid().hashCode();
        }
        if (getCategory_3Id() != null) {
            _hashCode += getCategory_3Id().hashCode();
        }
        if (getMarkup_category() != null) {
            _hashCode += getMarkup_category().hashCode();
        }
        if (getExclude_non_billable_task() != null) {
            _hashCode += getExclude_non_billable_task().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getCap() != null) {
            _hashCode += getCap().hashCode();
        }
        if (getTimetype_filter() != null) {
            _hashCode += getTimetype_filter().hashCode();
        }
        if (getDaily_cap_period() != null) {
            _hashCode += getDaily_cap_period().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getCategoryid() != null) {
            _hashCode += getCategoryid().hashCode();
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
        if (getRate_from() != null) {
            _hashCode += getRate_from().hashCode();
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
        if (getCustomerpoid() != null) {
            _hashCode += getCustomerpoid().hashCode();
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getRate_multiplier() != null) {
            _hashCode += getRate_multiplier().hashCode();
        }
        if (getProject_task_filter() != null) {
            _hashCode += getProject_task_filter().hashCode();
        }
        if (getRate_cardid() != null) {
            _hashCode += getRate_cardid().hashCode();
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
        if (getExclude_archived_ts() != null) {
            _hashCode += getExclude_archived_ts().hashCode();
        }
        if (getDaily_rate_multiplier() != null) {
            _hashCode += getDaily_rate_multiplier().hashCode();
        }
        if (getExclude_non_billable() != null) {
            _hashCode += getExclude_non_billable().hashCode();
        }
        if (getMarkup() != null) {
            _hashCode += getMarkup().hashCode();
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
        if (getCategory_when() != null) {
            _hashCode += getCategory_when().hashCode();
        }
        if (getJob_code_filter() != null) {
            _hashCode += getJob_code_filter().hashCode();
        }
        if (getAssigned_user() != null) {
            _hashCode += getAssigned_user().hashCode();
        }
        if (getDaily_cap_hours() != null) {
            _hashCode += getDaily_cap_hours().hashCode();
        }
        if (getAcct_date() != null) {
            _hashCode += getAcct_date().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getStop_if_capped() != null) {
            _hashCode += getStop_if_capped().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getRound_rules() != null) {
            _hashCode += getRound_rules().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getDaily_cap_is_per_user() != null) {
            _hashCode += getDaily_cap_is_per_user().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaProjectbillingrule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectbillingrule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cap_hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cap_hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backout_gst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backout_gst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_maximums");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ticket_maximums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markup_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markup_type"));
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
        elemField.setFieldName("daily_roll_to_next");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daily_roll_to_next"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude_non_reimbursable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude_non_reimbursable"));
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
        elemField.setFieldName("adjust_if_capped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adjust_if_capped"));
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
        elemField.setFieldName("markup_category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markup_category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude_non_billable_task");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude_non_billable_task"));
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
        elemField.setFieldName("cap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cap"));
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
        elemField.setFieldName("daily_cap_period");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daily_cap_period"));
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
        elemField.setFieldName("rate_from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate_from"));
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
        elemField.setFieldName("customerpoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerpoid"));
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
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate_multiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate_multiplier"));
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
        elemField.setFieldName("rate_cardid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate_cardid"));
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
        elemField.setFieldName("exclude_archived_ts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude_archived_ts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daily_rate_multiplier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daily_rate_multiplier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude_non_billable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude_non_billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markup"));
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
        elemField.setFieldName("category_when");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_when"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job_code_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job_code_filter"));
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
        elemField.setFieldName("daily_cap_hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daily_cap_hours"));
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
        elemField.setFieldName("stop_if_capped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stop_if_capped"));
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
        elemField.setFieldName("round_rules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "round_rules"));
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
        elemField.setFieldName("daily_cap_is_per_user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daily_cap_is_per_user"));
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
