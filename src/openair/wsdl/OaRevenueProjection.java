/**
 * OaRevenueProjection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaRevenueProjection  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String hour;

    private java.lang.String revenue_recognition_rule_id;

    private java.lang.String date;

    private java.lang.String category_4_id;

    private java.lang.String um;

    private java.lang.String item_id;

    private java.lang.String ref_slip_id;

    private java.lang.String rate;

    private java.lang.String incomplete;

    private java.lang.String slip_stage_id;

    private java.lang.String slip_projection_type;

    private java.lang.String projecttask_type_id;

    private java.lang.String id;

    private java.lang.String updated;

    private java.lang.String timetype_id;

    private java.lang.String cost;

    private java.lang.String invoice_id;

    private java.lang.String name;

    private java.lang.String revenue_projection_type;

    private java.lang.String total_hp;

    private java.lang.String total;

    private java.lang.String description;

    private java.lang.String timer_start;

    private java.lang.String minute;

    private java.lang.String category_5_id;

    private java.lang.String transaction_id;

    private java.lang.String type;

    private java.lang.String user_id;

    private java.lang.String slip_projection_id;

    private java.lang.String agreement_id;

    private java.lang.String portfolio_project_id;

    private java.lang.String project_billing_rule_id;

    private java.lang.String customerpo_id;

    private java.lang.String project_task_id;

    private java.lang.String category_2_id;

    private java.lang.String job_code_id;

    private java.lang.String currency;

    private java.lang.String slip_type_id;

    private java.lang.String category_id;

    private java.lang.String city;

    private java.lang.String revenue_stage_id;

    private java.lang.String product_id;

    private java.lang.String customer_id;

    private java.lang.String cost_center_id;

    private java.lang.String originating_id;

    private java.lang.String payroll_type_id;

    private java.lang.String project_id;

    private java.lang.String category_3_id;

    private java.lang.String category_1_id;

    private java.lang.String booking_type_id;

    private java.lang.String payment_type_id;

    private java.lang.String quantity;

    private java.lang.String acct_date;

    private java.lang.String repeat_id;

    private java.lang.String total_tax_paid;

    private java.lang.String created;

    private java.lang.String cost_includes_tax;

    private java.lang.String vehicle_id;

    private java.lang.String notes;

    private java.lang.String exported;

    private openair.wsdl.OaBase[] attributes;

    public OaRevenueProjection() {
    }

    public OaRevenueProjection(
           java.lang.String hour,
           java.lang.String revenue_recognition_rule_id,
           java.lang.String date,
           java.lang.String category_4_id,
           java.lang.String um,
           java.lang.String item_id,
           java.lang.String ref_slip_id,
           java.lang.String rate,
           java.lang.String incomplete,
           java.lang.String slip_stage_id,
           java.lang.String slip_projection_type,
           java.lang.String projecttask_type_id,
           java.lang.String id,
           java.lang.String updated,
           java.lang.String timetype_id,
           java.lang.String cost,
           java.lang.String invoice_id,
           java.lang.String name,
           java.lang.String revenue_projection_type,
           java.lang.String total_hp,
           java.lang.String total,
           java.lang.String description,
           java.lang.String timer_start,
           java.lang.String minute,
           java.lang.String category_5_id,
           java.lang.String transaction_id,
           java.lang.String type,
           java.lang.String user_id,
           java.lang.String slip_projection_id,
           java.lang.String agreement_id,
           java.lang.String portfolio_project_id,
           java.lang.String project_billing_rule_id,
           java.lang.String customerpo_id,
           java.lang.String project_task_id,
           java.lang.String category_2_id,
           java.lang.String job_code_id,
           java.lang.String currency,
           java.lang.String slip_type_id,
           java.lang.String category_id,
           java.lang.String city,
           java.lang.String revenue_stage_id,
           java.lang.String product_id,
           java.lang.String customer_id,
           java.lang.String cost_center_id,
           java.lang.String originating_id,
           java.lang.String payroll_type_id,
           java.lang.String project_id,
           java.lang.String category_3_id,
           java.lang.String category_1_id,
           java.lang.String booking_type_id,
           java.lang.String payment_type_id,
           java.lang.String quantity,
           java.lang.String acct_date,
           java.lang.String repeat_id,
           java.lang.String total_tax_paid,
           java.lang.String created,
           java.lang.String cost_includes_tax,
           java.lang.String vehicle_id,
           java.lang.String notes,
           java.lang.String exported,
           openair.wsdl.OaBase[] attributes) {
        this.hour = hour;
        this.revenue_recognition_rule_id = revenue_recognition_rule_id;
        this.date = date;
        this.category_4_id = category_4_id;
        this.um = um;
        this.item_id = item_id;
        this.ref_slip_id = ref_slip_id;
        this.rate = rate;
        this.incomplete = incomplete;
        this.slip_stage_id = slip_stage_id;
        this.slip_projection_type = slip_projection_type;
        this.projecttask_type_id = projecttask_type_id;
        this.id = id;
        this.updated = updated;
        this.timetype_id = timetype_id;
        this.cost = cost;
        this.invoice_id = invoice_id;
        this.name = name;
        this.revenue_projection_type = revenue_projection_type;
        this.total_hp = total_hp;
        this.total = total;
        this.description = description;
        this.timer_start = timer_start;
        this.minute = minute;
        this.category_5_id = category_5_id;
        this.transaction_id = transaction_id;
        this.type = type;
        this.user_id = user_id;
        this.slip_projection_id = slip_projection_id;
        this.agreement_id = agreement_id;
        this.portfolio_project_id = portfolio_project_id;
        this.project_billing_rule_id = project_billing_rule_id;
        this.customerpo_id = customerpo_id;
        this.project_task_id = project_task_id;
        this.category_2_id = category_2_id;
        this.job_code_id = job_code_id;
        this.currency = currency;
        this.slip_type_id = slip_type_id;
        this.category_id = category_id;
        this.city = city;
        this.revenue_stage_id = revenue_stage_id;
        this.product_id = product_id;
        this.customer_id = customer_id;
        this.cost_center_id = cost_center_id;
        this.originating_id = originating_id;
        this.payroll_type_id = payroll_type_id;
        this.project_id = project_id;
        this.category_3_id = category_3_id;
        this.category_1_id = category_1_id;
        this.booking_type_id = booking_type_id;
        this.payment_type_id = payment_type_id;
        this.quantity = quantity;
        this.acct_date = acct_date;
        this.repeat_id = repeat_id;
        this.total_tax_paid = total_tax_paid;
        this.created = created;
        this.cost_includes_tax = cost_includes_tax;
        this.vehicle_id = vehicle_id;
        this.notes = notes;
        this.exported = exported;
        this.attributes = attributes;
    }


    /**
     * Gets the hour value for this OaRevenueProjection.
     * 
     * @return hour
     */
    public java.lang.String getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this OaRevenueProjection.
     * 
     * @param hour
     */
    public void setHour(java.lang.String hour) {
        this.hour = hour;
    }


    /**
     * Gets the revenue_recognition_rule_id value for this OaRevenueProjection.
     * 
     * @return revenue_recognition_rule_id
     */
    public java.lang.String getRevenue_recognition_rule_id() {
        return revenue_recognition_rule_id;
    }


    /**
     * Sets the revenue_recognition_rule_id value for this OaRevenueProjection.
     * 
     * @param revenue_recognition_rule_id
     */
    public void setRevenue_recognition_rule_id(java.lang.String revenue_recognition_rule_id) {
        this.revenue_recognition_rule_id = revenue_recognition_rule_id;
    }


    /**
     * Gets the date value for this OaRevenueProjection.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this OaRevenueProjection.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the category_4_id value for this OaRevenueProjection.
     * 
     * @return category_4_id
     */
    public java.lang.String getCategory_4_id() {
        return category_4_id;
    }


    /**
     * Sets the category_4_id value for this OaRevenueProjection.
     * 
     * @param category_4_id
     */
    public void setCategory_4_id(java.lang.String category_4_id) {
        this.category_4_id = category_4_id;
    }


    /**
     * Gets the um value for this OaRevenueProjection.
     * 
     * @return um
     */
    public java.lang.String getUm() {
        return um;
    }


    /**
     * Sets the um value for this OaRevenueProjection.
     * 
     * @param um
     */
    public void setUm(java.lang.String um) {
        this.um = um;
    }


    /**
     * Gets the item_id value for this OaRevenueProjection.
     * 
     * @return item_id
     */
    public java.lang.String getItem_id() {
        return item_id;
    }


    /**
     * Sets the item_id value for this OaRevenueProjection.
     * 
     * @param item_id
     */
    public void setItem_id(java.lang.String item_id) {
        this.item_id = item_id;
    }


    /**
     * Gets the ref_slip_id value for this OaRevenueProjection.
     * 
     * @return ref_slip_id
     */
    public java.lang.String getRef_slip_id() {
        return ref_slip_id;
    }


    /**
     * Sets the ref_slip_id value for this OaRevenueProjection.
     * 
     * @param ref_slip_id
     */
    public void setRef_slip_id(java.lang.String ref_slip_id) {
        this.ref_slip_id = ref_slip_id;
    }


    /**
     * Gets the rate value for this OaRevenueProjection.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OaRevenueProjection.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the incomplete value for this OaRevenueProjection.
     * 
     * @return incomplete
     */
    public java.lang.String getIncomplete() {
        return incomplete;
    }


    /**
     * Sets the incomplete value for this OaRevenueProjection.
     * 
     * @param incomplete
     */
    public void setIncomplete(java.lang.String incomplete) {
        this.incomplete = incomplete;
    }


    /**
     * Gets the slip_stage_id value for this OaRevenueProjection.
     * 
     * @return slip_stage_id
     */
    public java.lang.String getSlip_stage_id() {
        return slip_stage_id;
    }


    /**
     * Sets the slip_stage_id value for this OaRevenueProjection.
     * 
     * @param slip_stage_id
     */
    public void setSlip_stage_id(java.lang.String slip_stage_id) {
        this.slip_stage_id = slip_stage_id;
    }


    /**
     * Gets the slip_projection_type value for this OaRevenueProjection.
     * 
     * @return slip_projection_type
     */
    public java.lang.String getSlip_projection_type() {
        return slip_projection_type;
    }


    /**
     * Sets the slip_projection_type value for this OaRevenueProjection.
     * 
     * @param slip_projection_type
     */
    public void setSlip_projection_type(java.lang.String slip_projection_type) {
        this.slip_projection_type = slip_projection_type;
    }


    /**
     * Gets the projecttask_type_id value for this OaRevenueProjection.
     * 
     * @return projecttask_type_id
     */
    public java.lang.String getProjecttask_type_id() {
        return projecttask_type_id;
    }


    /**
     * Sets the projecttask_type_id value for this OaRevenueProjection.
     * 
     * @param projecttask_type_id
     */
    public void setProjecttask_type_id(java.lang.String projecttask_type_id) {
        this.projecttask_type_id = projecttask_type_id;
    }


    /**
     * Gets the id value for this OaRevenueProjection.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaRevenueProjection.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the updated value for this OaRevenueProjection.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaRevenueProjection.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the timetype_id value for this OaRevenueProjection.
     * 
     * @return timetype_id
     */
    public java.lang.String getTimetype_id() {
        return timetype_id;
    }


    /**
     * Sets the timetype_id value for this OaRevenueProjection.
     * 
     * @param timetype_id
     */
    public void setTimetype_id(java.lang.String timetype_id) {
        this.timetype_id = timetype_id;
    }


    /**
     * Gets the cost value for this OaRevenueProjection.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this OaRevenueProjection.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
    }


    /**
     * Gets the invoice_id value for this OaRevenueProjection.
     * 
     * @return invoice_id
     */
    public java.lang.String getInvoice_id() {
        return invoice_id;
    }


    /**
     * Sets the invoice_id value for this OaRevenueProjection.
     * 
     * @param invoice_id
     */
    public void setInvoice_id(java.lang.String invoice_id) {
        this.invoice_id = invoice_id;
    }


    /**
     * Gets the name value for this OaRevenueProjection.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaRevenueProjection.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the revenue_projection_type value for this OaRevenueProjection.
     * 
     * @return revenue_projection_type
     */
    public java.lang.String getRevenue_projection_type() {
        return revenue_projection_type;
    }


    /**
     * Sets the revenue_projection_type value for this OaRevenueProjection.
     * 
     * @param revenue_projection_type
     */
    public void setRevenue_projection_type(java.lang.String revenue_projection_type) {
        this.revenue_projection_type = revenue_projection_type;
    }


    /**
     * Gets the total_hp value for this OaRevenueProjection.
     * 
     * @return total_hp
     */
    public java.lang.String getTotal_hp() {
        return total_hp;
    }


    /**
     * Sets the total_hp value for this OaRevenueProjection.
     * 
     * @param total_hp
     */
    public void setTotal_hp(java.lang.String total_hp) {
        this.total_hp = total_hp;
    }


    /**
     * Gets the total value for this OaRevenueProjection.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this OaRevenueProjection.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
    }


    /**
     * Gets the description value for this OaRevenueProjection.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OaRevenueProjection.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the timer_start value for this OaRevenueProjection.
     * 
     * @return timer_start
     */
    public java.lang.String getTimer_start() {
        return timer_start;
    }


    /**
     * Sets the timer_start value for this OaRevenueProjection.
     * 
     * @param timer_start
     */
    public void setTimer_start(java.lang.String timer_start) {
        this.timer_start = timer_start;
    }


    /**
     * Gets the minute value for this OaRevenueProjection.
     * 
     * @return minute
     */
    public java.lang.String getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this OaRevenueProjection.
     * 
     * @param minute
     */
    public void setMinute(java.lang.String minute) {
        this.minute = minute;
    }


    /**
     * Gets the category_5_id value for this OaRevenueProjection.
     * 
     * @return category_5_id
     */
    public java.lang.String getCategory_5_id() {
        return category_5_id;
    }


    /**
     * Sets the category_5_id value for this OaRevenueProjection.
     * 
     * @param category_5_id
     */
    public void setCategory_5_id(java.lang.String category_5_id) {
        this.category_5_id = category_5_id;
    }


    /**
     * Gets the transaction_id value for this OaRevenueProjection.
     * 
     * @return transaction_id
     */
    public java.lang.String getTransaction_id() {
        return transaction_id;
    }


    /**
     * Sets the transaction_id value for this OaRevenueProjection.
     * 
     * @param transaction_id
     */
    public void setTransaction_id(java.lang.String transaction_id) {
        this.transaction_id = transaction_id;
    }


    /**
     * Gets the type value for this OaRevenueProjection.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaRevenueProjection.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the user_id value for this OaRevenueProjection.
     * 
     * @return user_id
     */
    public java.lang.String getUser_id() {
        return user_id;
    }


    /**
     * Sets the user_id value for this OaRevenueProjection.
     * 
     * @param user_id
     */
    public void setUser_id(java.lang.String user_id) {
        this.user_id = user_id;
    }


    /**
     * Gets the slip_projection_id value for this OaRevenueProjection.
     * 
     * @return slip_projection_id
     */
    public java.lang.String getSlip_projection_id() {
        return slip_projection_id;
    }


    /**
     * Sets the slip_projection_id value for this OaRevenueProjection.
     * 
     * @param slip_projection_id
     */
    public void setSlip_projection_id(java.lang.String slip_projection_id) {
        this.slip_projection_id = slip_projection_id;
    }


    /**
     * Gets the agreement_id value for this OaRevenueProjection.
     * 
     * @return agreement_id
     */
    public java.lang.String getAgreement_id() {
        return agreement_id;
    }


    /**
     * Sets the agreement_id value for this OaRevenueProjection.
     * 
     * @param agreement_id
     */
    public void setAgreement_id(java.lang.String agreement_id) {
        this.agreement_id = agreement_id;
    }


    /**
     * Gets the portfolio_project_id value for this OaRevenueProjection.
     * 
     * @return portfolio_project_id
     */
    public java.lang.String getPortfolio_project_id() {
        return portfolio_project_id;
    }


    /**
     * Sets the portfolio_project_id value for this OaRevenueProjection.
     * 
     * @param portfolio_project_id
     */
    public void setPortfolio_project_id(java.lang.String portfolio_project_id) {
        this.portfolio_project_id = portfolio_project_id;
    }


    /**
     * Gets the project_billing_rule_id value for this OaRevenueProjection.
     * 
     * @return project_billing_rule_id
     */
    public java.lang.String getProject_billing_rule_id() {
        return project_billing_rule_id;
    }


    /**
     * Sets the project_billing_rule_id value for this OaRevenueProjection.
     * 
     * @param project_billing_rule_id
     */
    public void setProject_billing_rule_id(java.lang.String project_billing_rule_id) {
        this.project_billing_rule_id = project_billing_rule_id;
    }


    /**
     * Gets the customerpo_id value for this OaRevenueProjection.
     * 
     * @return customerpo_id
     */
    public java.lang.String getCustomerpo_id() {
        return customerpo_id;
    }


    /**
     * Sets the customerpo_id value for this OaRevenueProjection.
     * 
     * @param customerpo_id
     */
    public void setCustomerpo_id(java.lang.String customerpo_id) {
        this.customerpo_id = customerpo_id;
    }


    /**
     * Gets the project_task_id value for this OaRevenueProjection.
     * 
     * @return project_task_id
     */
    public java.lang.String getProject_task_id() {
        return project_task_id;
    }


    /**
     * Sets the project_task_id value for this OaRevenueProjection.
     * 
     * @param project_task_id
     */
    public void setProject_task_id(java.lang.String project_task_id) {
        this.project_task_id = project_task_id;
    }


    /**
     * Gets the category_2_id value for this OaRevenueProjection.
     * 
     * @return category_2_id
     */
    public java.lang.String getCategory_2_id() {
        return category_2_id;
    }


    /**
     * Sets the category_2_id value for this OaRevenueProjection.
     * 
     * @param category_2_id
     */
    public void setCategory_2_id(java.lang.String category_2_id) {
        this.category_2_id = category_2_id;
    }


    /**
     * Gets the job_code_id value for this OaRevenueProjection.
     * 
     * @return job_code_id
     */
    public java.lang.String getJob_code_id() {
        return job_code_id;
    }


    /**
     * Sets the job_code_id value for this OaRevenueProjection.
     * 
     * @param job_code_id
     */
    public void setJob_code_id(java.lang.String job_code_id) {
        this.job_code_id = job_code_id;
    }


    /**
     * Gets the currency value for this OaRevenueProjection.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaRevenueProjection.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the slip_type_id value for this OaRevenueProjection.
     * 
     * @return slip_type_id
     */
    public java.lang.String getSlip_type_id() {
        return slip_type_id;
    }


    /**
     * Sets the slip_type_id value for this OaRevenueProjection.
     * 
     * @param slip_type_id
     */
    public void setSlip_type_id(java.lang.String slip_type_id) {
        this.slip_type_id = slip_type_id;
    }


    /**
     * Gets the category_id value for this OaRevenueProjection.
     * 
     * @return category_id
     */
    public java.lang.String getCategory_id() {
        return category_id;
    }


    /**
     * Sets the category_id value for this OaRevenueProjection.
     * 
     * @param category_id
     */
    public void setCategory_id(java.lang.String category_id) {
        this.category_id = category_id;
    }


    /**
     * Gets the city value for this OaRevenueProjection.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this OaRevenueProjection.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the revenue_stage_id value for this OaRevenueProjection.
     * 
     * @return revenue_stage_id
     */
    public java.lang.String getRevenue_stage_id() {
        return revenue_stage_id;
    }


    /**
     * Sets the revenue_stage_id value for this OaRevenueProjection.
     * 
     * @param revenue_stage_id
     */
    public void setRevenue_stage_id(java.lang.String revenue_stage_id) {
        this.revenue_stage_id = revenue_stage_id;
    }


    /**
     * Gets the product_id value for this OaRevenueProjection.
     * 
     * @return product_id
     */
    public java.lang.String getProduct_id() {
        return product_id;
    }


    /**
     * Sets the product_id value for this OaRevenueProjection.
     * 
     * @param product_id
     */
    public void setProduct_id(java.lang.String product_id) {
        this.product_id = product_id;
    }


    /**
     * Gets the customer_id value for this OaRevenueProjection.
     * 
     * @return customer_id
     */
    public java.lang.String getCustomer_id() {
        return customer_id;
    }


    /**
     * Sets the customer_id value for this OaRevenueProjection.
     * 
     * @param customer_id
     */
    public void setCustomer_id(java.lang.String customer_id) {
        this.customer_id = customer_id;
    }


    /**
     * Gets the cost_center_id value for this OaRevenueProjection.
     * 
     * @return cost_center_id
     */
    public java.lang.String getCost_center_id() {
        return cost_center_id;
    }


    /**
     * Sets the cost_center_id value for this OaRevenueProjection.
     * 
     * @param cost_center_id
     */
    public void setCost_center_id(java.lang.String cost_center_id) {
        this.cost_center_id = cost_center_id;
    }


    /**
     * Gets the originating_id value for this OaRevenueProjection.
     * 
     * @return originating_id
     */
    public java.lang.String getOriginating_id() {
        return originating_id;
    }


    /**
     * Sets the originating_id value for this OaRevenueProjection.
     * 
     * @param originating_id
     */
    public void setOriginating_id(java.lang.String originating_id) {
        this.originating_id = originating_id;
    }


    /**
     * Gets the payroll_type_id value for this OaRevenueProjection.
     * 
     * @return payroll_type_id
     */
    public java.lang.String getPayroll_type_id() {
        return payroll_type_id;
    }


    /**
     * Sets the payroll_type_id value for this OaRevenueProjection.
     * 
     * @param payroll_type_id
     */
    public void setPayroll_type_id(java.lang.String payroll_type_id) {
        this.payroll_type_id = payroll_type_id;
    }


    /**
     * Gets the project_id value for this OaRevenueProjection.
     * 
     * @return project_id
     */
    public java.lang.String getProject_id() {
        return project_id;
    }


    /**
     * Sets the project_id value for this OaRevenueProjection.
     * 
     * @param project_id
     */
    public void setProject_id(java.lang.String project_id) {
        this.project_id = project_id;
    }


    /**
     * Gets the category_3_id value for this OaRevenueProjection.
     * 
     * @return category_3_id
     */
    public java.lang.String getCategory_3_id() {
        return category_3_id;
    }


    /**
     * Sets the category_3_id value for this OaRevenueProjection.
     * 
     * @param category_3_id
     */
    public void setCategory_3_id(java.lang.String category_3_id) {
        this.category_3_id = category_3_id;
    }


    /**
     * Gets the category_1_id value for this OaRevenueProjection.
     * 
     * @return category_1_id
     */
    public java.lang.String getCategory_1_id() {
        return category_1_id;
    }


    /**
     * Sets the category_1_id value for this OaRevenueProjection.
     * 
     * @param category_1_id
     */
    public void setCategory_1_id(java.lang.String category_1_id) {
        this.category_1_id = category_1_id;
    }


    /**
     * Gets the booking_type_id value for this OaRevenueProjection.
     * 
     * @return booking_type_id
     */
    public java.lang.String getBooking_type_id() {
        return booking_type_id;
    }


    /**
     * Sets the booking_type_id value for this OaRevenueProjection.
     * 
     * @param booking_type_id
     */
    public void setBooking_type_id(java.lang.String booking_type_id) {
        this.booking_type_id = booking_type_id;
    }


    /**
     * Gets the payment_type_id value for this OaRevenueProjection.
     * 
     * @return payment_type_id
     */
    public java.lang.String getPayment_type_id() {
        return payment_type_id;
    }


    /**
     * Sets the payment_type_id value for this OaRevenueProjection.
     * 
     * @param payment_type_id
     */
    public void setPayment_type_id(java.lang.String payment_type_id) {
        this.payment_type_id = payment_type_id;
    }


    /**
     * Gets the quantity value for this OaRevenueProjection.
     * 
     * @return quantity
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OaRevenueProjection.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the acct_date value for this OaRevenueProjection.
     * 
     * @return acct_date
     */
    public java.lang.String getAcct_date() {
        return acct_date;
    }


    /**
     * Sets the acct_date value for this OaRevenueProjection.
     * 
     * @param acct_date
     */
    public void setAcct_date(java.lang.String acct_date) {
        this.acct_date = acct_date;
    }


    /**
     * Gets the repeat_id value for this OaRevenueProjection.
     * 
     * @return repeat_id
     */
    public java.lang.String getRepeat_id() {
        return repeat_id;
    }


    /**
     * Sets the repeat_id value for this OaRevenueProjection.
     * 
     * @param repeat_id
     */
    public void setRepeat_id(java.lang.String repeat_id) {
        this.repeat_id = repeat_id;
    }


    /**
     * Gets the total_tax_paid value for this OaRevenueProjection.
     * 
     * @return total_tax_paid
     */
    public java.lang.String getTotal_tax_paid() {
        return total_tax_paid;
    }


    /**
     * Sets the total_tax_paid value for this OaRevenueProjection.
     * 
     * @param total_tax_paid
     */
    public void setTotal_tax_paid(java.lang.String total_tax_paid) {
        this.total_tax_paid = total_tax_paid;
    }


    /**
     * Gets the created value for this OaRevenueProjection.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaRevenueProjection.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the cost_includes_tax value for this OaRevenueProjection.
     * 
     * @return cost_includes_tax
     */
    public java.lang.String getCost_includes_tax() {
        return cost_includes_tax;
    }


    /**
     * Sets the cost_includes_tax value for this OaRevenueProjection.
     * 
     * @param cost_includes_tax
     */
    public void setCost_includes_tax(java.lang.String cost_includes_tax) {
        this.cost_includes_tax = cost_includes_tax;
    }


    /**
     * Gets the vehicle_id value for this OaRevenueProjection.
     * 
     * @return vehicle_id
     */
    public java.lang.String getVehicle_id() {
        return vehicle_id;
    }


    /**
     * Sets the vehicle_id value for this OaRevenueProjection.
     * 
     * @param vehicle_id
     */
    public void setVehicle_id(java.lang.String vehicle_id) {
        this.vehicle_id = vehicle_id;
    }


    /**
     * Gets the notes value for this OaRevenueProjection.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaRevenueProjection.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the exported value for this OaRevenueProjection.
     * 
     * @return exported
     */
    public java.lang.String getExported() {
        return exported;
    }


    /**
     * Sets the exported value for this OaRevenueProjection.
     * 
     * @param exported
     */
    public void setExported(java.lang.String exported) {
        this.exported = exported;
    }


    /**
     * Gets the attributes value for this OaRevenueProjection.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaRevenueProjection.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaRevenueProjection)) return false;
        OaRevenueProjection other = (OaRevenueProjection) obj;
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
            ((this.revenue_recognition_rule_id==null && other.getRevenue_recognition_rule_id()==null) || 
             (this.revenue_recognition_rule_id!=null &&
              this.revenue_recognition_rule_id.equals(other.getRevenue_recognition_rule_id()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.category_4_id==null && other.getCategory_4_id()==null) || 
             (this.category_4_id!=null &&
              this.category_4_id.equals(other.getCategory_4_id()))) &&
            ((this.um==null && other.getUm()==null) || 
             (this.um!=null &&
              this.um.equals(other.getUm()))) &&
            ((this.item_id==null && other.getItem_id()==null) || 
             (this.item_id!=null &&
              this.item_id.equals(other.getItem_id()))) &&
            ((this.ref_slip_id==null && other.getRef_slip_id()==null) || 
             (this.ref_slip_id!=null &&
              this.ref_slip_id.equals(other.getRef_slip_id()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.incomplete==null && other.getIncomplete()==null) || 
             (this.incomplete!=null &&
              this.incomplete.equals(other.getIncomplete()))) &&
            ((this.slip_stage_id==null && other.getSlip_stage_id()==null) || 
             (this.slip_stage_id!=null &&
              this.slip_stage_id.equals(other.getSlip_stage_id()))) &&
            ((this.slip_projection_type==null && other.getSlip_projection_type()==null) || 
             (this.slip_projection_type!=null &&
              this.slip_projection_type.equals(other.getSlip_projection_type()))) &&
            ((this.projecttask_type_id==null && other.getProjecttask_type_id()==null) || 
             (this.projecttask_type_id!=null &&
              this.projecttask_type_id.equals(other.getProjecttask_type_id()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.timetype_id==null && other.getTimetype_id()==null) || 
             (this.timetype_id!=null &&
              this.timetype_id.equals(other.getTimetype_id()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.invoice_id==null && other.getInvoice_id()==null) || 
             (this.invoice_id!=null &&
              this.invoice_id.equals(other.getInvoice_id()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.revenue_projection_type==null && other.getRevenue_projection_type()==null) || 
             (this.revenue_projection_type!=null &&
              this.revenue_projection_type.equals(other.getRevenue_projection_type()))) &&
            ((this.total_hp==null && other.getTotal_hp()==null) || 
             (this.total_hp!=null &&
              this.total_hp.equals(other.getTotal_hp()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.timer_start==null && other.getTimer_start()==null) || 
             (this.timer_start!=null &&
              this.timer_start.equals(other.getTimer_start()))) &&
            ((this.minute==null && other.getMinute()==null) || 
             (this.minute!=null &&
              this.minute.equals(other.getMinute()))) &&
            ((this.category_5_id==null && other.getCategory_5_id()==null) || 
             (this.category_5_id!=null &&
              this.category_5_id.equals(other.getCategory_5_id()))) &&
            ((this.transaction_id==null && other.getTransaction_id()==null) || 
             (this.transaction_id!=null &&
              this.transaction_id.equals(other.getTransaction_id()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.user_id==null && other.getUser_id()==null) || 
             (this.user_id!=null &&
              this.user_id.equals(other.getUser_id()))) &&
            ((this.slip_projection_id==null && other.getSlip_projection_id()==null) || 
             (this.slip_projection_id!=null &&
              this.slip_projection_id.equals(other.getSlip_projection_id()))) &&
            ((this.agreement_id==null && other.getAgreement_id()==null) || 
             (this.agreement_id!=null &&
              this.agreement_id.equals(other.getAgreement_id()))) &&
            ((this.portfolio_project_id==null && other.getPortfolio_project_id()==null) || 
             (this.portfolio_project_id!=null &&
              this.portfolio_project_id.equals(other.getPortfolio_project_id()))) &&
            ((this.project_billing_rule_id==null && other.getProject_billing_rule_id()==null) || 
             (this.project_billing_rule_id!=null &&
              this.project_billing_rule_id.equals(other.getProject_billing_rule_id()))) &&
            ((this.customerpo_id==null && other.getCustomerpo_id()==null) || 
             (this.customerpo_id!=null &&
              this.customerpo_id.equals(other.getCustomerpo_id()))) &&
            ((this.project_task_id==null && other.getProject_task_id()==null) || 
             (this.project_task_id!=null &&
              this.project_task_id.equals(other.getProject_task_id()))) &&
            ((this.category_2_id==null && other.getCategory_2_id()==null) || 
             (this.category_2_id!=null &&
              this.category_2_id.equals(other.getCategory_2_id()))) &&
            ((this.job_code_id==null && other.getJob_code_id()==null) || 
             (this.job_code_id!=null &&
              this.job_code_id.equals(other.getJob_code_id()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.slip_type_id==null && other.getSlip_type_id()==null) || 
             (this.slip_type_id!=null &&
              this.slip_type_id.equals(other.getSlip_type_id()))) &&
            ((this.category_id==null && other.getCategory_id()==null) || 
             (this.category_id!=null &&
              this.category_id.equals(other.getCategory_id()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.revenue_stage_id==null && other.getRevenue_stage_id()==null) || 
             (this.revenue_stage_id!=null &&
              this.revenue_stage_id.equals(other.getRevenue_stage_id()))) &&
            ((this.product_id==null && other.getProduct_id()==null) || 
             (this.product_id!=null &&
              this.product_id.equals(other.getProduct_id()))) &&
            ((this.customer_id==null && other.getCustomer_id()==null) || 
             (this.customer_id!=null &&
              this.customer_id.equals(other.getCustomer_id()))) &&
            ((this.cost_center_id==null && other.getCost_center_id()==null) || 
             (this.cost_center_id!=null &&
              this.cost_center_id.equals(other.getCost_center_id()))) &&
            ((this.originating_id==null && other.getOriginating_id()==null) || 
             (this.originating_id!=null &&
              this.originating_id.equals(other.getOriginating_id()))) &&
            ((this.payroll_type_id==null && other.getPayroll_type_id()==null) || 
             (this.payroll_type_id!=null &&
              this.payroll_type_id.equals(other.getPayroll_type_id()))) &&
            ((this.project_id==null && other.getProject_id()==null) || 
             (this.project_id!=null &&
              this.project_id.equals(other.getProject_id()))) &&
            ((this.category_3_id==null && other.getCategory_3_id()==null) || 
             (this.category_3_id!=null &&
              this.category_3_id.equals(other.getCategory_3_id()))) &&
            ((this.category_1_id==null && other.getCategory_1_id()==null) || 
             (this.category_1_id!=null &&
              this.category_1_id.equals(other.getCategory_1_id()))) &&
            ((this.booking_type_id==null && other.getBooking_type_id()==null) || 
             (this.booking_type_id!=null &&
              this.booking_type_id.equals(other.getBooking_type_id()))) &&
            ((this.payment_type_id==null && other.getPayment_type_id()==null) || 
             (this.payment_type_id!=null &&
              this.payment_type_id.equals(other.getPayment_type_id()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.acct_date==null && other.getAcct_date()==null) || 
             (this.acct_date!=null &&
              this.acct_date.equals(other.getAcct_date()))) &&
            ((this.repeat_id==null && other.getRepeat_id()==null) || 
             (this.repeat_id!=null &&
              this.repeat_id.equals(other.getRepeat_id()))) &&
            ((this.total_tax_paid==null && other.getTotal_tax_paid()==null) || 
             (this.total_tax_paid!=null &&
              this.total_tax_paid.equals(other.getTotal_tax_paid()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.cost_includes_tax==null && other.getCost_includes_tax()==null) || 
             (this.cost_includes_tax!=null &&
              this.cost_includes_tax.equals(other.getCost_includes_tax()))) &&
            ((this.vehicle_id==null && other.getVehicle_id()==null) || 
             (this.vehicle_id!=null &&
              this.vehicle_id.equals(other.getVehicle_id()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.exported==null && other.getExported()==null) || 
             (this.exported!=null &&
              this.exported.equals(other.getExported()))) &&
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
        if (getRevenue_recognition_rule_id() != null) {
            _hashCode += getRevenue_recognition_rule_id().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getCategory_4_id() != null) {
            _hashCode += getCategory_4_id().hashCode();
        }
        if (getUm() != null) {
            _hashCode += getUm().hashCode();
        }
        if (getItem_id() != null) {
            _hashCode += getItem_id().hashCode();
        }
        if (getRef_slip_id() != null) {
            _hashCode += getRef_slip_id().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getIncomplete() != null) {
            _hashCode += getIncomplete().hashCode();
        }
        if (getSlip_stage_id() != null) {
            _hashCode += getSlip_stage_id().hashCode();
        }
        if (getSlip_projection_type() != null) {
            _hashCode += getSlip_projection_type().hashCode();
        }
        if (getProjecttask_type_id() != null) {
            _hashCode += getProjecttask_type_id().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getTimetype_id() != null) {
            _hashCode += getTimetype_id().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getInvoice_id() != null) {
            _hashCode += getInvoice_id().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRevenue_projection_type() != null) {
            _hashCode += getRevenue_projection_type().hashCode();
        }
        if (getTotal_hp() != null) {
            _hashCode += getTotal_hp().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTimer_start() != null) {
            _hashCode += getTimer_start().hashCode();
        }
        if (getMinute() != null) {
            _hashCode += getMinute().hashCode();
        }
        if (getCategory_5_id() != null) {
            _hashCode += getCategory_5_id().hashCode();
        }
        if (getTransaction_id() != null) {
            _hashCode += getTransaction_id().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUser_id() != null) {
            _hashCode += getUser_id().hashCode();
        }
        if (getSlip_projection_id() != null) {
            _hashCode += getSlip_projection_id().hashCode();
        }
        if (getAgreement_id() != null) {
            _hashCode += getAgreement_id().hashCode();
        }
        if (getPortfolio_project_id() != null) {
            _hashCode += getPortfolio_project_id().hashCode();
        }
        if (getProject_billing_rule_id() != null) {
            _hashCode += getProject_billing_rule_id().hashCode();
        }
        if (getCustomerpo_id() != null) {
            _hashCode += getCustomerpo_id().hashCode();
        }
        if (getProject_task_id() != null) {
            _hashCode += getProject_task_id().hashCode();
        }
        if (getCategory_2_id() != null) {
            _hashCode += getCategory_2_id().hashCode();
        }
        if (getJob_code_id() != null) {
            _hashCode += getJob_code_id().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getSlip_type_id() != null) {
            _hashCode += getSlip_type_id().hashCode();
        }
        if (getCategory_id() != null) {
            _hashCode += getCategory_id().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getRevenue_stage_id() != null) {
            _hashCode += getRevenue_stage_id().hashCode();
        }
        if (getProduct_id() != null) {
            _hashCode += getProduct_id().hashCode();
        }
        if (getCustomer_id() != null) {
            _hashCode += getCustomer_id().hashCode();
        }
        if (getCost_center_id() != null) {
            _hashCode += getCost_center_id().hashCode();
        }
        if (getOriginating_id() != null) {
            _hashCode += getOriginating_id().hashCode();
        }
        if (getPayroll_type_id() != null) {
            _hashCode += getPayroll_type_id().hashCode();
        }
        if (getProject_id() != null) {
            _hashCode += getProject_id().hashCode();
        }
        if (getCategory_3_id() != null) {
            _hashCode += getCategory_3_id().hashCode();
        }
        if (getCategory_1_id() != null) {
            _hashCode += getCategory_1_id().hashCode();
        }
        if (getBooking_type_id() != null) {
            _hashCode += getBooking_type_id().hashCode();
        }
        if (getPayment_type_id() != null) {
            _hashCode += getPayment_type_id().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getAcct_date() != null) {
            _hashCode += getAcct_date().hashCode();
        }
        if (getRepeat_id() != null) {
            _hashCode += getRepeat_id().hashCode();
        }
        if (getTotal_tax_paid() != null) {
            _hashCode += getTotal_tax_paid().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCost_includes_tax() != null) {
            _hashCode += getCost_includes_tax().hashCode();
        }
        if (getVehicle_id() != null) {
            _hashCode += getVehicle_id().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getExported() != null) {
            _hashCode += getExported().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaRevenueProjection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenueProjection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenue_recognition_rule_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revenue_recognition_rule_id"));
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
        elemField.setFieldName("category_4_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_4_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("um");
        elemField.setXmlName(new javax.xml.namespace.QName("", "um"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_slip_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_slip_id"));
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
        elemField.setFieldName("incomplete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incomplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slip_stage_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_stage_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slip_projection_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_projection_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projecttask_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projecttask_type_id"));
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
        elemField.setFieldName("timetype_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timetype_id"));
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
        elemField.setFieldName("invoice_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoice_id"));
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
        elemField.setFieldName("revenue_projection_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revenue_projection_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total_hp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total_hp"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("category_5_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_5_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transaction_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transaction_id"));
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
        elemField.setFieldName("user_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slip_projection_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_projection_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreement_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agreement_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portfolio_project_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portfolio_project_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_billing_rule_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_billing_rule_id"));
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
        elemField.setFieldName("project_task_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_task_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_2_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_2_id"));
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
        elemField.setFieldName("slip_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slip_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_id"));
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
        elemField.setFieldName("revenue_stage_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revenue_stage_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_id"));
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
        elemField.setFieldName("originating_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originating_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payroll_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payroll_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_3_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_3_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category_1_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_1_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("booking_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "booking_type_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment_type_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment_type_id"));
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
        elemField.setFieldName("repeat_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeat_id"));
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
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_includes_tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_includes_tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vehicle_id"));
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
        elemField.setFieldName("exported");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exported"));
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
