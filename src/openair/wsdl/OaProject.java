/**
 * OaProject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaProject  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String user_filter;

    private java.lang.String copy_notification_settings;

    private java.lang.String po_approver;

    private java.lang.String invoice_layoutid;

    private java.lang.String exported_wip;

    private java.lang.String notify_issue_created_customer_owner;

    private java.lang.String attachmentid;

    private java.lang.String category_filter;

    private java.lang.String rate;

    private java.lang.String notify_assignees;

    private java.lang.String sync_workspace;

    private java.lang.String notify_owner;

    private java.lang.String br_approvalprocess;

    private java.lang.String te_approver;

    private java.lang.String portfolio_projectid;

    private java.lang.String pm_approver_2;

    private java.lang.String code;

    private java.lang.String tb_approver;

    private java.lang.String timetype_filter;

    private java.lang.String tax_location_name;

    private java.lang.String template_project_id;

    private java.lang.String notify_issue_closed_customer_owner;

    private java.lang.String name;

    private java.lang.String hierarchy_node_ids;

    private java.lang.String po_approvalprocess;

    private java.lang.String locationid;

    private java.lang.String finish_date;

    private java.lang.String copy_custom_fields;

    private java.lang.String copy_invoice_layout_settings;

    private java.lang.String pm_approver_1;

    private java.lang.String copy_project_pricing;

    private java.lang.String only_owner_can_edit;

    private java.lang.String br_approver;

    private java.lang.String payroll_type_filter;

    private java.lang.String az_approvalprocess;

    private java.lang.String budget;

    private java.lang.String currency;

    private java.lang.String cost_centerid;

    private java.lang.String budget_time;

    private java.lang.String pm_approver_3;

    private java.lang.String notify_issue_closed_assigned_to;

    private java.lang.String rm_approver;

    private java.lang.String copy_loaded_cost;

    private java.lang.String notify_sr_submitted_project_owner;

    private java.lang.String billing_contactid;

    private java.lang.String no_dirty;

    private java.lang.String te_include;

    private java.lang.String notes;

    private java.lang.String create_workspace;

    private java.lang.String tb_approvalprocess;

    private java.lang.String copy_approvers;

    private java.lang.String sold_to_contact_id;

    private java.lang.String auto_bill_override;

    private java.lang.String auto_bill;

    private java.lang.String az_approver;

    private java.lang.String auto_bill_cap;

    private java.lang.String picklist_label;

    private java.lang.String rm_approvalprocess;

    private java.lang.String copy_project_billing_rules;

    private java.lang.String filtersetids;

    private java.lang.String notify_issue_closed_project_owner;

    private java.lang.String ta_approvalprocess;

    private java.lang.String te_approvalprocess;

    private java.lang.String current_wip;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String auto_bill_cap_value;

    private java.lang.String rv_approver;

    private java.lang.String rv_approvalprocess;

    private java.lang.String active;

    private java.lang.String notify_issue_created_project_owner;

    private java.lang.String copy_issues;

    private java.lang.String tax_locationid;

    private java.lang.String project_stageid;

    private java.lang.String externalid;

    private java.lang.String copy_revenuerecognition_auto_settings;

    private java.lang.String ta_approver;

    private java.lang.String pr_approver;

    private java.lang.String msp_link_type;

    private java.lang.String billing_code;

    private java.lang.String copy_revenue_recognition_auto_settings;

    private java.lang.String customerid;

    private java.lang.String customer_name;

    private java.lang.String te_allowance_approvalprocess;

    private java.lang.String userid;

    private java.lang.String project_locationid;

    private java.lang.String rate_cardid;

    private java.lang.String ta_include;

    private java.lang.String invoice_text;

    private java.lang.String sga_labor;

    private java.lang.String shipping_contact_id;

    private java.lang.String is_portfolio_project;

    private java.lang.String notify_issue_assigned_to;

    private java.lang.String start_date;

    private java.lang.String te_allowance_approver;

    private java.lang.String exported_dr;

    private java.lang.String pr_approvalprocess;

    private java.lang.String copy_dashboard_settings;

    private java.lang.String message;

    private java.lang.String created;

    private java.lang.String copy_project_billing_auto_settings;

    private java.lang.String copy_revenue_recognition_rules;

    private java.lang.String current_dr;

    private openair.wsdl.OaBase[] attributes;

    public OaProject() {
    }

    public OaProject(
           java.lang.String user_filter,
           java.lang.String copy_notification_settings,
           java.lang.String po_approver,
           java.lang.String invoice_layoutid,
           java.lang.String exported_wip,
           java.lang.String notify_issue_created_customer_owner,
           java.lang.String attachmentid,
           java.lang.String category_filter,
           java.lang.String rate,
           java.lang.String notify_assignees,
           java.lang.String sync_workspace,
           java.lang.String notify_owner,
           java.lang.String br_approvalprocess,
           java.lang.String te_approver,
           java.lang.String portfolio_projectid,
           java.lang.String pm_approver_2,
           java.lang.String code,
           java.lang.String tb_approver,
           java.lang.String timetype_filter,
           java.lang.String tax_location_name,
           java.lang.String template_project_id,
           java.lang.String notify_issue_closed_customer_owner,
           java.lang.String name,
           java.lang.String hierarchy_node_ids,
           java.lang.String po_approvalprocess,
           java.lang.String locationid,
           java.lang.String finish_date,
           java.lang.String copy_custom_fields,
           java.lang.String copy_invoice_layout_settings,
           java.lang.String pm_approver_1,
           java.lang.String copy_project_pricing,
           java.lang.String only_owner_can_edit,
           java.lang.String br_approver,
           java.lang.String payroll_type_filter,
           java.lang.String az_approvalprocess,
           java.lang.String budget,
           java.lang.String currency,
           java.lang.String cost_centerid,
           java.lang.String budget_time,
           java.lang.String pm_approver_3,
           java.lang.String notify_issue_closed_assigned_to,
           java.lang.String rm_approver,
           java.lang.String copy_loaded_cost,
           java.lang.String notify_sr_submitted_project_owner,
           java.lang.String billing_contactid,
           java.lang.String no_dirty,
           java.lang.String te_include,
           java.lang.String notes,
           java.lang.String create_workspace,
           java.lang.String tb_approvalprocess,
           java.lang.String copy_approvers,
           java.lang.String sold_to_contact_id,
           java.lang.String auto_bill_override,
           java.lang.String auto_bill,
           java.lang.String az_approver,
           java.lang.String auto_bill_cap,
           java.lang.String picklist_label,
           java.lang.String rm_approvalprocess,
           java.lang.String copy_project_billing_rules,
           java.lang.String filtersetids,
           java.lang.String notify_issue_closed_project_owner,
           java.lang.String ta_approvalprocess,
           java.lang.String te_approvalprocess,
           java.lang.String current_wip,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String auto_bill_cap_value,
           java.lang.String rv_approver,
           java.lang.String rv_approvalprocess,
           java.lang.String active,
           java.lang.String notify_issue_created_project_owner,
           java.lang.String copy_issues,
           java.lang.String tax_locationid,
           java.lang.String project_stageid,
           java.lang.String externalid,
           java.lang.String copy_revenuerecognition_auto_settings,
           java.lang.String ta_approver,
           java.lang.String pr_approver,
           java.lang.String msp_link_type,
           java.lang.String billing_code,
           java.lang.String copy_revenue_recognition_auto_settings,
           java.lang.String customerid,
           java.lang.String customer_name,
           java.lang.String te_allowance_approvalprocess,
           java.lang.String userid,
           java.lang.String project_locationid,
           java.lang.String rate_cardid,
           java.lang.String ta_include,
           java.lang.String invoice_text,
           java.lang.String sga_labor,
           java.lang.String shipping_contact_id,
           java.lang.String is_portfolio_project,
           java.lang.String notify_issue_assigned_to,
           java.lang.String start_date,
           java.lang.String te_allowance_approver,
           java.lang.String exported_dr,
           java.lang.String pr_approvalprocess,
           java.lang.String copy_dashboard_settings,
           java.lang.String message,
           java.lang.String created,
           java.lang.String copy_project_billing_auto_settings,
           java.lang.String copy_revenue_recognition_rules,
           java.lang.String current_dr,
           openair.wsdl.OaBase[] attributes) {
        this.user_filter = user_filter;
        this.copy_notification_settings = copy_notification_settings;
        this.po_approver = po_approver;
        this.invoice_layoutid = invoice_layoutid;
        this.exported_wip = exported_wip;
        this.notify_issue_created_customer_owner = notify_issue_created_customer_owner;
        this.attachmentid = attachmentid;
        this.category_filter = category_filter;
        this.rate = rate;
        this.notify_assignees = notify_assignees;
        this.sync_workspace = sync_workspace;
        this.notify_owner = notify_owner;
        this.br_approvalprocess = br_approvalprocess;
        this.te_approver = te_approver;
        this.portfolio_projectid = portfolio_projectid;
        this.pm_approver_2 = pm_approver_2;
        this.code = code;
        this.tb_approver = tb_approver;
        this.timetype_filter = timetype_filter;
        this.tax_location_name = tax_location_name;
        this.template_project_id = template_project_id;
        this.notify_issue_closed_customer_owner = notify_issue_closed_customer_owner;
        this.name = name;
        this.hierarchy_node_ids = hierarchy_node_ids;
        this.po_approvalprocess = po_approvalprocess;
        this.locationid = locationid;
        this.finish_date = finish_date;
        this.copy_custom_fields = copy_custom_fields;
        this.copy_invoice_layout_settings = copy_invoice_layout_settings;
        this.pm_approver_1 = pm_approver_1;
        this.copy_project_pricing = copy_project_pricing;
        this.only_owner_can_edit = only_owner_can_edit;
        this.br_approver = br_approver;
        this.payroll_type_filter = payroll_type_filter;
        this.az_approvalprocess = az_approvalprocess;
        this.budget = budget;
        this.currency = currency;
        this.cost_centerid = cost_centerid;
        this.budget_time = budget_time;
        this.pm_approver_3 = pm_approver_3;
        this.notify_issue_closed_assigned_to = notify_issue_closed_assigned_to;
        this.rm_approver = rm_approver;
        this.copy_loaded_cost = copy_loaded_cost;
        this.notify_sr_submitted_project_owner = notify_sr_submitted_project_owner;
        this.billing_contactid = billing_contactid;
        this.no_dirty = no_dirty;
        this.te_include = te_include;
        this.notes = notes;
        this.create_workspace = create_workspace;
        this.tb_approvalprocess = tb_approvalprocess;
        this.copy_approvers = copy_approvers;
        this.sold_to_contact_id = sold_to_contact_id;
        this.auto_bill_override = auto_bill_override;
        this.auto_bill = auto_bill;
        this.az_approver = az_approver;
        this.auto_bill_cap = auto_bill_cap;
        this.picklist_label = picklist_label;
        this.rm_approvalprocess = rm_approvalprocess;
        this.copy_project_billing_rules = copy_project_billing_rules;
        this.filtersetids = filtersetids;
        this.notify_issue_closed_project_owner = notify_issue_closed_project_owner;
        this.ta_approvalprocess = ta_approvalprocess;
        this.te_approvalprocess = te_approvalprocess;
        this.current_wip = current_wip;
        this.updated = updated;
        this.id = id;
        this.auto_bill_cap_value = auto_bill_cap_value;
        this.rv_approver = rv_approver;
        this.rv_approvalprocess = rv_approvalprocess;
        this.active = active;
        this.notify_issue_created_project_owner = notify_issue_created_project_owner;
        this.copy_issues = copy_issues;
        this.tax_locationid = tax_locationid;
        this.project_stageid = project_stageid;
        this.externalid = externalid;
        this.copy_revenuerecognition_auto_settings = copy_revenuerecognition_auto_settings;
        this.ta_approver = ta_approver;
        this.pr_approver = pr_approver;
        this.msp_link_type = msp_link_type;
        this.billing_code = billing_code;
        this.copy_revenue_recognition_auto_settings = copy_revenue_recognition_auto_settings;
        this.customerid = customerid;
        this.customer_name = customer_name;
        this.te_allowance_approvalprocess = te_allowance_approvalprocess;
        this.userid = userid;
        this.project_locationid = project_locationid;
        this.rate_cardid = rate_cardid;
        this.ta_include = ta_include;
        this.invoice_text = invoice_text;
        this.sga_labor = sga_labor;
        this.shipping_contact_id = shipping_contact_id;
        this.is_portfolio_project = is_portfolio_project;
        this.notify_issue_assigned_to = notify_issue_assigned_to;
        this.start_date = start_date;
        this.te_allowance_approver = te_allowance_approver;
        this.exported_dr = exported_dr;
        this.pr_approvalprocess = pr_approvalprocess;
        this.copy_dashboard_settings = copy_dashboard_settings;
        this.message = message;
        this.created = created;
        this.copy_project_billing_auto_settings = copy_project_billing_auto_settings;
        this.copy_revenue_recognition_rules = copy_revenue_recognition_rules;
        this.current_dr = current_dr;
        this.attributes = attributes;
    }


    /**
     * Gets the user_filter value for this OaProject.
     * 
     * @return user_filter
     */
    public java.lang.String getUser_filter() {
        return user_filter;
    }


    /**
     * Sets the user_filter value for this OaProject.
     * 
     * @param user_filter
     */
    public void setUser_filter(java.lang.String user_filter) {
        this.user_filter = user_filter;
    }


    /**
     * Gets the copy_notification_settings value for this OaProject.
     * 
     * @return copy_notification_settings
     */
    public java.lang.String getCopy_notification_settings() {
        return copy_notification_settings;
    }


    /**
     * Sets the copy_notification_settings value for this OaProject.
     * 
     * @param copy_notification_settings
     */
    public void setCopy_notification_settings(java.lang.String copy_notification_settings) {
        this.copy_notification_settings = copy_notification_settings;
    }


    /**
     * Gets the po_approver value for this OaProject.
     * 
     * @return po_approver
     */
    public java.lang.String getPo_approver() {
        return po_approver;
    }


    /**
     * Sets the po_approver value for this OaProject.
     * 
     * @param po_approver
     */
    public void setPo_approver(java.lang.String po_approver) {
        this.po_approver = po_approver;
    }


    /**
     * Gets the invoice_layoutid value for this OaProject.
     * 
     * @return invoice_layoutid
     */
    public java.lang.String getInvoice_layoutid() {
        return invoice_layoutid;
    }


    /**
     * Sets the invoice_layoutid value for this OaProject.
     * 
     * @param invoice_layoutid
     */
    public void setInvoice_layoutid(java.lang.String invoice_layoutid) {
        this.invoice_layoutid = invoice_layoutid;
    }


    /**
     * Gets the exported_wip value for this OaProject.
     * 
     * @return exported_wip
     */
    public java.lang.String getExported_wip() {
        return exported_wip;
    }


    /**
     * Sets the exported_wip value for this OaProject.
     * 
     * @param exported_wip
     */
    public void setExported_wip(java.lang.String exported_wip) {
        this.exported_wip = exported_wip;
    }


    /**
     * Gets the notify_issue_created_customer_owner value for this OaProject.
     * 
     * @return notify_issue_created_customer_owner
     */
    public java.lang.String getNotify_issue_created_customer_owner() {
        return notify_issue_created_customer_owner;
    }


    /**
     * Sets the notify_issue_created_customer_owner value for this OaProject.
     * 
     * @param notify_issue_created_customer_owner
     */
    public void setNotify_issue_created_customer_owner(java.lang.String notify_issue_created_customer_owner) {
        this.notify_issue_created_customer_owner = notify_issue_created_customer_owner;
    }


    /**
     * Gets the attachmentid value for this OaProject.
     * 
     * @return attachmentid
     */
    public java.lang.String getAttachmentid() {
        return attachmentid;
    }


    /**
     * Sets the attachmentid value for this OaProject.
     * 
     * @param attachmentid
     */
    public void setAttachmentid(java.lang.String attachmentid) {
        this.attachmentid = attachmentid;
    }


    /**
     * Gets the category_filter value for this OaProject.
     * 
     * @return category_filter
     */
    public java.lang.String getCategory_filter() {
        return category_filter;
    }


    /**
     * Sets the category_filter value for this OaProject.
     * 
     * @param category_filter
     */
    public void setCategory_filter(java.lang.String category_filter) {
        this.category_filter = category_filter;
    }


    /**
     * Gets the rate value for this OaProject.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OaProject.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the notify_assignees value for this OaProject.
     * 
     * @return notify_assignees
     */
    public java.lang.String getNotify_assignees() {
        return notify_assignees;
    }


    /**
     * Sets the notify_assignees value for this OaProject.
     * 
     * @param notify_assignees
     */
    public void setNotify_assignees(java.lang.String notify_assignees) {
        this.notify_assignees = notify_assignees;
    }


    /**
     * Gets the sync_workspace value for this OaProject.
     * 
     * @return sync_workspace
     */
    public java.lang.String getSync_workspace() {
        return sync_workspace;
    }


    /**
     * Sets the sync_workspace value for this OaProject.
     * 
     * @param sync_workspace
     */
    public void setSync_workspace(java.lang.String sync_workspace) {
        this.sync_workspace = sync_workspace;
    }


    /**
     * Gets the notify_owner value for this OaProject.
     * 
     * @return notify_owner
     */
    public java.lang.String getNotify_owner() {
        return notify_owner;
    }


    /**
     * Sets the notify_owner value for this OaProject.
     * 
     * @param notify_owner
     */
    public void setNotify_owner(java.lang.String notify_owner) {
        this.notify_owner = notify_owner;
    }


    /**
     * Gets the br_approvalprocess value for this OaProject.
     * 
     * @return br_approvalprocess
     */
    public java.lang.String getBr_approvalprocess() {
        return br_approvalprocess;
    }


    /**
     * Sets the br_approvalprocess value for this OaProject.
     * 
     * @param br_approvalprocess
     */
    public void setBr_approvalprocess(java.lang.String br_approvalprocess) {
        this.br_approvalprocess = br_approvalprocess;
    }


    /**
     * Gets the te_approver value for this OaProject.
     * 
     * @return te_approver
     */
    public java.lang.String getTe_approver() {
        return te_approver;
    }


    /**
     * Sets the te_approver value for this OaProject.
     * 
     * @param te_approver
     */
    public void setTe_approver(java.lang.String te_approver) {
        this.te_approver = te_approver;
    }


    /**
     * Gets the portfolio_projectid value for this OaProject.
     * 
     * @return portfolio_projectid
     */
    public java.lang.String getPortfolio_projectid() {
        return portfolio_projectid;
    }


    /**
     * Sets the portfolio_projectid value for this OaProject.
     * 
     * @param portfolio_projectid
     */
    public void setPortfolio_projectid(java.lang.String portfolio_projectid) {
        this.portfolio_projectid = portfolio_projectid;
    }


    /**
     * Gets the pm_approver_2 value for this OaProject.
     * 
     * @return pm_approver_2
     */
    public java.lang.String getPm_approver_2() {
        return pm_approver_2;
    }


    /**
     * Sets the pm_approver_2 value for this OaProject.
     * 
     * @param pm_approver_2
     */
    public void setPm_approver_2(java.lang.String pm_approver_2) {
        this.pm_approver_2 = pm_approver_2;
    }


    /**
     * Gets the code value for this OaProject.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this OaProject.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the tb_approver value for this OaProject.
     * 
     * @return tb_approver
     */
    public java.lang.String getTb_approver() {
        return tb_approver;
    }


    /**
     * Sets the tb_approver value for this OaProject.
     * 
     * @param tb_approver
     */
    public void setTb_approver(java.lang.String tb_approver) {
        this.tb_approver = tb_approver;
    }


    /**
     * Gets the timetype_filter value for this OaProject.
     * 
     * @return timetype_filter
     */
    public java.lang.String getTimetype_filter() {
        return timetype_filter;
    }


    /**
     * Sets the timetype_filter value for this OaProject.
     * 
     * @param timetype_filter
     */
    public void setTimetype_filter(java.lang.String timetype_filter) {
        this.timetype_filter = timetype_filter;
    }


    /**
     * Gets the tax_location_name value for this OaProject.
     * 
     * @return tax_location_name
     */
    public java.lang.String getTax_location_name() {
        return tax_location_name;
    }


    /**
     * Sets the tax_location_name value for this OaProject.
     * 
     * @param tax_location_name
     */
    public void setTax_location_name(java.lang.String tax_location_name) {
        this.tax_location_name = tax_location_name;
    }


    /**
     * Gets the template_project_id value for this OaProject.
     * 
     * @return template_project_id
     */
    public java.lang.String getTemplate_project_id() {
        return template_project_id;
    }


    /**
     * Sets the template_project_id value for this OaProject.
     * 
     * @param template_project_id
     */
    public void setTemplate_project_id(java.lang.String template_project_id) {
        this.template_project_id = template_project_id;
    }


    /**
     * Gets the notify_issue_closed_customer_owner value for this OaProject.
     * 
     * @return notify_issue_closed_customer_owner
     */
    public java.lang.String getNotify_issue_closed_customer_owner() {
        return notify_issue_closed_customer_owner;
    }


    /**
     * Sets the notify_issue_closed_customer_owner value for this OaProject.
     * 
     * @param notify_issue_closed_customer_owner
     */
    public void setNotify_issue_closed_customer_owner(java.lang.String notify_issue_closed_customer_owner) {
        this.notify_issue_closed_customer_owner = notify_issue_closed_customer_owner;
    }


    /**
     * Gets the name value for this OaProject.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaProject.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hierarchy_node_ids value for this OaProject.
     * 
     * @return hierarchy_node_ids
     */
    public java.lang.String getHierarchy_node_ids() {
        return hierarchy_node_ids;
    }


    /**
     * Sets the hierarchy_node_ids value for this OaProject.
     * 
     * @param hierarchy_node_ids
     */
    public void setHierarchy_node_ids(java.lang.String hierarchy_node_ids) {
        this.hierarchy_node_ids = hierarchy_node_ids;
    }


    /**
     * Gets the po_approvalprocess value for this OaProject.
     * 
     * @return po_approvalprocess
     */
    public java.lang.String getPo_approvalprocess() {
        return po_approvalprocess;
    }


    /**
     * Sets the po_approvalprocess value for this OaProject.
     * 
     * @param po_approvalprocess
     */
    public void setPo_approvalprocess(java.lang.String po_approvalprocess) {
        this.po_approvalprocess = po_approvalprocess;
    }


    /**
     * Gets the locationid value for this OaProject.
     * 
     * @return locationid
     */
    public java.lang.String getLocationid() {
        return locationid;
    }


    /**
     * Sets the locationid value for this OaProject.
     * 
     * @param locationid
     */
    public void setLocationid(java.lang.String locationid) {
        this.locationid = locationid;
    }


    /**
     * Gets the finish_date value for this OaProject.
     * 
     * @return finish_date
     */
    public java.lang.String getFinish_date() {
        return finish_date;
    }


    /**
     * Sets the finish_date value for this OaProject.
     * 
     * @param finish_date
     */
    public void setFinish_date(java.lang.String finish_date) {
        this.finish_date = finish_date;
    }


    /**
     * Gets the copy_custom_fields value for this OaProject.
     * 
     * @return copy_custom_fields
     */
    public java.lang.String getCopy_custom_fields() {
        return copy_custom_fields;
    }


    /**
     * Sets the copy_custom_fields value for this OaProject.
     * 
     * @param copy_custom_fields
     */
    public void setCopy_custom_fields(java.lang.String copy_custom_fields) {
        this.copy_custom_fields = copy_custom_fields;
    }


    /**
     * Gets the copy_invoice_layout_settings value for this OaProject.
     * 
     * @return copy_invoice_layout_settings
     */
    public java.lang.String getCopy_invoice_layout_settings() {
        return copy_invoice_layout_settings;
    }


    /**
     * Sets the copy_invoice_layout_settings value for this OaProject.
     * 
     * @param copy_invoice_layout_settings
     */
    public void setCopy_invoice_layout_settings(java.lang.String copy_invoice_layout_settings) {
        this.copy_invoice_layout_settings = copy_invoice_layout_settings;
    }


    /**
     * Gets the pm_approver_1 value for this OaProject.
     * 
     * @return pm_approver_1
     */
    public java.lang.String getPm_approver_1() {
        return pm_approver_1;
    }


    /**
     * Sets the pm_approver_1 value for this OaProject.
     * 
     * @param pm_approver_1
     */
    public void setPm_approver_1(java.lang.String pm_approver_1) {
        this.pm_approver_1 = pm_approver_1;
    }


    /**
     * Gets the copy_project_pricing value for this OaProject.
     * 
     * @return copy_project_pricing
     */
    public java.lang.String getCopy_project_pricing() {
        return copy_project_pricing;
    }


    /**
     * Sets the copy_project_pricing value for this OaProject.
     * 
     * @param copy_project_pricing
     */
    public void setCopy_project_pricing(java.lang.String copy_project_pricing) {
        this.copy_project_pricing = copy_project_pricing;
    }


    /**
     * Gets the only_owner_can_edit value for this OaProject.
     * 
     * @return only_owner_can_edit
     */
    public java.lang.String getOnly_owner_can_edit() {
        return only_owner_can_edit;
    }


    /**
     * Sets the only_owner_can_edit value for this OaProject.
     * 
     * @param only_owner_can_edit
     */
    public void setOnly_owner_can_edit(java.lang.String only_owner_can_edit) {
        this.only_owner_can_edit = only_owner_can_edit;
    }


    /**
     * Gets the br_approver value for this OaProject.
     * 
     * @return br_approver
     */
    public java.lang.String getBr_approver() {
        return br_approver;
    }


    /**
     * Sets the br_approver value for this OaProject.
     * 
     * @param br_approver
     */
    public void setBr_approver(java.lang.String br_approver) {
        this.br_approver = br_approver;
    }


    /**
     * Gets the payroll_type_filter value for this OaProject.
     * 
     * @return payroll_type_filter
     */
    public java.lang.String getPayroll_type_filter() {
        return payroll_type_filter;
    }


    /**
     * Sets the payroll_type_filter value for this OaProject.
     * 
     * @param payroll_type_filter
     */
    public void setPayroll_type_filter(java.lang.String payroll_type_filter) {
        this.payroll_type_filter = payroll_type_filter;
    }


    /**
     * Gets the az_approvalprocess value for this OaProject.
     * 
     * @return az_approvalprocess
     */
    public java.lang.String getAz_approvalprocess() {
        return az_approvalprocess;
    }


    /**
     * Sets the az_approvalprocess value for this OaProject.
     * 
     * @param az_approvalprocess
     */
    public void setAz_approvalprocess(java.lang.String az_approvalprocess) {
        this.az_approvalprocess = az_approvalprocess;
    }


    /**
     * Gets the budget value for this OaProject.
     * 
     * @return budget
     */
    public java.lang.String getBudget() {
        return budget;
    }


    /**
     * Sets the budget value for this OaProject.
     * 
     * @param budget
     */
    public void setBudget(java.lang.String budget) {
        this.budget = budget;
    }


    /**
     * Gets the currency value for this OaProject.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaProject.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the cost_centerid value for this OaProject.
     * 
     * @return cost_centerid
     */
    public java.lang.String getCost_centerid() {
        return cost_centerid;
    }


    /**
     * Sets the cost_centerid value for this OaProject.
     * 
     * @param cost_centerid
     */
    public void setCost_centerid(java.lang.String cost_centerid) {
        this.cost_centerid = cost_centerid;
    }


    /**
     * Gets the budget_time value for this OaProject.
     * 
     * @return budget_time
     */
    public java.lang.String getBudget_time() {
        return budget_time;
    }


    /**
     * Sets the budget_time value for this OaProject.
     * 
     * @param budget_time
     */
    public void setBudget_time(java.lang.String budget_time) {
        this.budget_time = budget_time;
    }


    /**
     * Gets the pm_approver_3 value for this OaProject.
     * 
     * @return pm_approver_3
     */
    public java.lang.String getPm_approver_3() {
        return pm_approver_3;
    }


    /**
     * Sets the pm_approver_3 value for this OaProject.
     * 
     * @param pm_approver_3
     */
    public void setPm_approver_3(java.lang.String pm_approver_3) {
        this.pm_approver_3 = pm_approver_3;
    }


    /**
     * Gets the notify_issue_closed_assigned_to value for this OaProject.
     * 
     * @return notify_issue_closed_assigned_to
     */
    public java.lang.String getNotify_issue_closed_assigned_to() {
        return notify_issue_closed_assigned_to;
    }


    /**
     * Sets the notify_issue_closed_assigned_to value for this OaProject.
     * 
     * @param notify_issue_closed_assigned_to
     */
    public void setNotify_issue_closed_assigned_to(java.lang.String notify_issue_closed_assigned_to) {
        this.notify_issue_closed_assigned_to = notify_issue_closed_assigned_to;
    }


    /**
     * Gets the rm_approver value for this OaProject.
     * 
     * @return rm_approver
     */
    public java.lang.String getRm_approver() {
        return rm_approver;
    }


    /**
     * Sets the rm_approver value for this OaProject.
     * 
     * @param rm_approver
     */
    public void setRm_approver(java.lang.String rm_approver) {
        this.rm_approver = rm_approver;
    }


    /**
     * Gets the copy_loaded_cost value for this OaProject.
     * 
     * @return copy_loaded_cost
     */
    public java.lang.String getCopy_loaded_cost() {
        return copy_loaded_cost;
    }


    /**
     * Sets the copy_loaded_cost value for this OaProject.
     * 
     * @param copy_loaded_cost
     */
    public void setCopy_loaded_cost(java.lang.String copy_loaded_cost) {
        this.copy_loaded_cost = copy_loaded_cost;
    }


    /**
     * Gets the notify_sr_submitted_project_owner value for this OaProject.
     * 
     * @return notify_sr_submitted_project_owner
     */
    public java.lang.String getNotify_sr_submitted_project_owner() {
        return notify_sr_submitted_project_owner;
    }


    /**
     * Sets the notify_sr_submitted_project_owner value for this OaProject.
     * 
     * @param notify_sr_submitted_project_owner
     */
    public void setNotify_sr_submitted_project_owner(java.lang.String notify_sr_submitted_project_owner) {
        this.notify_sr_submitted_project_owner = notify_sr_submitted_project_owner;
    }


    /**
     * Gets the billing_contactid value for this OaProject.
     * 
     * @return billing_contactid
     */
    public java.lang.String getBilling_contactid() {
        return billing_contactid;
    }


    /**
     * Sets the billing_contactid value for this OaProject.
     * 
     * @param billing_contactid
     */
    public void setBilling_contactid(java.lang.String billing_contactid) {
        this.billing_contactid = billing_contactid;
    }


    /**
     * Gets the no_dirty value for this OaProject.
     * 
     * @return no_dirty
     */
    public java.lang.String getNo_dirty() {
        return no_dirty;
    }


    /**
     * Sets the no_dirty value for this OaProject.
     * 
     * @param no_dirty
     */
    public void setNo_dirty(java.lang.String no_dirty) {
        this.no_dirty = no_dirty;
    }


    /**
     * Gets the te_include value for this OaProject.
     * 
     * @return te_include
     */
    public java.lang.String getTe_include() {
        return te_include;
    }


    /**
     * Sets the te_include value for this OaProject.
     * 
     * @param te_include
     */
    public void setTe_include(java.lang.String te_include) {
        this.te_include = te_include;
    }


    /**
     * Gets the notes value for this OaProject.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaProject.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the create_workspace value for this OaProject.
     * 
     * @return create_workspace
     */
    public java.lang.String getCreate_workspace() {
        return create_workspace;
    }


    /**
     * Sets the create_workspace value for this OaProject.
     * 
     * @param create_workspace
     */
    public void setCreate_workspace(java.lang.String create_workspace) {
        this.create_workspace = create_workspace;
    }


    /**
     * Gets the tb_approvalprocess value for this OaProject.
     * 
     * @return tb_approvalprocess
     */
    public java.lang.String getTb_approvalprocess() {
        return tb_approvalprocess;
    }


    /**
     * Sets the tb_approvalprocess value for this OaProject.
     * 
     * @param tb_approvalprocess
     */
    public void setTb_approvalprocess(java.lang.String tb_approvalprocess) {
        this.tb_approvalprocess = tb_approvalprocess;
    }


    /**
     * Gets the copy_approvers value for this OaProject.
     * 
     * @return copy_approvers
     */
    public java.lang.String getCopy_approvers() {
        return copy_approvers;
    }


    /**
     * Sets the copy_approvers value for this OaProject.
     * 
     * @param copy_approvers
     */
    public void setCopy_approvers(java.lang.String copy_approvers) {
        this.copy_approvers = copy_approvers;
    }


    /**
     * Gets the sold_to_contact_id value for this OaProject.
     * 
     * @return sold_to_contact_id
     */
    public java.lang.String getSold_to_contact_id() {
        return sold_to_contact_id;
    }


    /**
     * Sets the sold_to_contact_id value for this OaProject.
     * 
     * @param sold_to_contact_id
     */
    public void setSold_to_contact_id(java.lang.String sold_to_contact_id) {
        this.sold_to_contact_id = sold_to_contact_id;
    }


    /**
     * Gets the auto_bill_override value for this OaProject.
     * 
     * @return auto_bill_override
     */
    public java.lang.String getAuto_bill_override() {
        return auto_bill_override;
    }


    /**
     * Sets the auto_bill_override value for this OaProject.
     * 
     * @param auto_bill_override
     */
    public void setAuto_bill_override(java.lang.String auto_bill_override) {
        this.auto_bill_override = auto_bill_override;
    }


    /**
     * Gets the auto_bill value for this OaProject.
     * 
     * @return auto_bill
     */
    public java.lang.String getAuto_bill() {
        return auto_bill;
    }


    /**
     * Sets the auto_bill value for this OaProject.
     * 
     * @param auto_bill
     */
    public void setAuto_bill(java.lang.String auto_bill) {
        this.auto_bill = auto_bill;
    }


    /**
     * Gets the az_approver value for this OaProject.
     * 
     * @return az_approver
     */
    public java.lang.String getAz_approver() {
        return az_approver;
    }


    /**
     * Sets the az_approver value for this OaProject.
     * 
     * @param az_approver
     */
    public void setAz_approver(java.lang.String az_approver) {
        this.az_approver = az_approver;
    }


    /**
     * Gets the auto_bill_cap value for this OaProject.
     * 
     * @return auto_bill_cap
     */
    public java.lang.String getAuto_bill_cap() {
        return auto_bill_cap;
    }


    /**
     * Sets the auto_bill_cap value for this OaProject.
     * 
     * @param auto_bill_cap
     */
    public void setAuto_bill_cap(java.lang.String auto_bill_cap) {
        this.auto_bill_cap = auto_bill_cap;
    }


    /**
     * Gets the picklist_label value for this OaProject.
     * 
     * @return picklist_label
     */
    public java.lang.String getPicklist_label() {
        return picklist_label;
    }


    /**
     * Sets the picklist_label value for this OaProject.
     * 
     * @param picklist_label
     */
    public void setPicklist_label(java.lang.String picklist_label) {
        this.picklist_label = picklist_label;
    }


    /**
     * Gets the rm_approvalprocess value for this OaProject.
     * 
     * @return rm_approvalprocess
     */
    public java.lang.String getRm_approvalprocess() {
        return rm_approvalprocess;
    }


    /**
     * Sets the rm_approvalprocess value for this OaProject.
     * 
     * @param rm_approvalprocess
     */
    public void setRm_approvalprocess(java.lang.String rm_approvalprocess) {
        this.rm_approvalprocess = rm_approvalprocess;
    }


    /**
     * Gets the copy_project_billing_rules value for this OaProject.
     * 
     * @return copy_project_billing_rules
     */
    public java.lang.String getCopy_project_billing_rules() {
        return copy_project_billing_rules;
    }


    /**
     * Sets the copy_project_billing_rules value for this OaProject.
     * 
     * @param copy_project_billing_rules
     */
    public void setCopy_project_billing_rules(java.lang.String copy_project_billing_rules) {
        this.copy_project_billing_rules = copy_project_billing_rules;
    }


    /**
     * Gets the filtersetids value for this OaProject.
     * 
     * @return filtersetids
     */
    public java.lang.String getFiltersetids() {
        return filtersetids;
    }


    /**
     * Sets the filtersetids value for this OaProject.
     * 
     * @param filtersetids
     */
    public void setFiltersetids(java.lang.String filtersetids) {
        this.filtersetids = filtersetids;
    }


    /**
     * Gets the notify_issue_closed_project_owner value for this OaProject.
     * 
     * @return notify_issue_closed_project_owner
     */
    public java.lang.String getNotify_issue_closed_project_owner() {
        return notify_issue_closed_project_owner;
    }


    /**
     * Sets the notify_issue_closed_project_owner value for this OaProject.
     * 
     * @param notify_issue_closed_project_owner
     */
    public void setNotify_issue_closed_project_owner(java.lang.String notify_issue_closed_project_owner) {
        this.notify_issue_closed_project_owner = notify_issue_closed_project_owner;
    }


    /**
     * Gets the ta_approvalprocess value for this OaProject.
     * 
     * @return ta_approvalprocess
     */
    public java.lang.String getTa_approvalprocess() {
        return ta_approvalprocess;
    }


    /**
     * Sets the ta_approvalprocess value for this OaProject.
     * 
     * @param ta_approvalprocess
     */
    public void setTa_approvalprocess(java.lang.String ta_approvalprocess) {
        this.ta_approvalprocess = ta_approvalprocess;
    }


    /**
     * Gets the te_approvalprocess value for this OaProject.
     * 
     * @return te_approvalprocess
     */
    public java.lang.String getTe_approvalprocess() {
        return te_approvalprocess;
    }


    /**
     * Sets the te_approvalprocess value for this OaProject.
     * 
     * @param te_approvalprocess
     */
    public void setTe_approvalprocess(java.lang.String te_approvalprocess) {
        this.te_approvalprocess = te_approvalprocess;
    }


    /**
     * Gets the current_wip value for this OaProject.
     * 
     * @return current_wip
     */
    public java.lang.String getCurrent_wip() {
        return current_wip;
    }


    /**
     * Sets the current_wip value for this OaProject.
     * 
     * @param current_wip
     */
    public void setCurrent_wip(java.lang.String current_wip) {
        this.current_wip = current_wip;
    }


    /**
     * Gets the updated value for this OaProject.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaProject.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaProject.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaProject.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the auto_bill_cap_value value for this OaProject.
     * 
     * @return auto_bill_cap_value
     */
    public java.lang.String getAuto_bill_cap_value() {
        return auto_bill_cap_value;
    }


    /**
     * Sets the auto_bill_cap_value value for this OaProject.
     * 
     * @param auto_bill_cap_value
     */
    public void setAuto_bill_cap_value(java.lang.String auto_bill_cap_value) {
        this.auto_bill_cap_value = auto_bill_cap_value;
    }


    /**
     * Gets the rv_approver value for this OaProject.
     * 
     * @return rv_approver
     */
    public java.lang.String getRv_approver() {
        return rv_approver;
    }


    /**
     * Sets the rv_approver value for this OaProject.
     * 
     * @param rv_approver
     */
    public void setRv_approver(java.lang.String rv_approver) {
        this.rv_approver = rv_approver;
    }


    /**
     * Gets the rv_approvalprocess value for this OaProject.
     * 
     * @return rv_approvalprocess
     */
    public java.lang.String getRv_approvalprocess() {
        return rv_approvalprocess;
    }


    /**
     * Sets the rv_approvalprocess value for this OaProject.
     * 
     * @param rv_approvalprocess
     */
    public void setRv_approvalprocess(java.lang.String rv_approvalprocess) {
        this.rv_approvalprocess = rv_approvalprocess;
    }


    /**
     * Gets the active value for this OaProject.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this OaProject.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the notify_issue_created_project_owner value for this OaProject.
     * 
     * @return notify_issue_created_project_owner
     */
    public java.lang.String getNotify_issue_created_project_owner() {
        return notify_issue_created_project_owner;
    }


    /**
     * Sets the notify_issue_created_project_owner value for this OaProject.
     * 
     * @param notify_issue_created_project_owner
     */
    public void setNotify_issue_created_project_owner(java.lang.String notify_issue_created_project_owner) {
        this.notify_issue_created_project_owner = notify_issue_created_project_owner;
    }


    /**
     * Gets the copy_issues value for this OaProject.
     * 
     * @return copy_issues
     */
    public java.lang.String getCopy_issues() {
        return copy_issues;
    }


    /**
     * Sets the copy_issues value for this OaProject.
     * 
     * @param copy_issues
     */
    public void setCopy_issues(java.lang.String copy_issues) {
        this.copy_issues = copy_issues;
    }


    /**
     * Gets the tax_locationid value for this OaProject.
     * 
     * @return tax_locationid
     */
    public java.lang.String getTax_locationid() {
        return tax_locationid;
    }


    /**
     * Sets the tax_locationid value for this OaProject.
     * 
     * @param tax_locationid
     */
    public void setTax_locationid(java.lang.String tax_locationid) {
        this.tax_locationid = tax_locationid;
    }


    /**
     * Gets the project_stageid value for this OaProject.
     * 
     * @return project_stageid
     */
    public java.lang.String getProject_stageid() {
        return project_stageid;
    }


    /**
     * Sets the project_stageid value for this OaProject.
     * 
     * @param project_stageid
     */
    public void setProject_stageid(java.lang.String project_stageid) {
        this.project_stageid = project_stageid;
    }


    /**
     * Gets the externalid value for this OaProject.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaProject.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the copy_revenuerecognition_auto_settings value for this OaProject.
     * 
     * @return copy_revenuerecognition_auto_settings
     */
    public java.lang.String getCopy_revenuerecognition_auto_settings() {
        return copy_revenuerecognition_auto_settings;
    }


    /**
     * Sets the copy_revenuerecognition_auto_settings value for this OaProject.
     * 
     * @param copy_revenuerecognition_auto_settings
     */
    public void setCopy_revenuerecognition_auto_settings(java.lang.String copy_revenuerecognition_auto_settings) {
        this.copy_revenuerecognition_auto_settings = copy_revenuerecognition_auto_settings;
    }


    /**
     * Gets the ta_approver value for this OaProject.
     * 
     * @return ta_approver
     */
    public java.lang.String getTa_approver() {
        return ta_approver;
    }


    /**
     * Sets the ta_approver value for this OaProject.
     * 
     * @param ta_approver
     */
    public void setTa_approver(java.lang.String ta_approver) {
        this.ta_approver = ta_approver;
    }


    /**
     * Gets the pr_approver value for this OaProject.
     * 
     * @return pr_approver
     */
    public java.lang.String getPr_approver() {
        return pr_approver;
    }


    /**
     * Sets the pr_approver value for this OaProject.
     * 
     * @param pr_approver
     */
    public void setPr_approver(java.lang.String pr_approver) {
        this.pr_approver = pr_approver;
    }


    /**
     * Gets the msp_link_type value for this OaProject.
     * 
     * @return msp_link_type
     */
    public java.lang.String getMsp_link_type() {
        return msp_link_type;
    }


    /**
     * Sets the msp_link_type value for this OaProject.
     * 
     * @param msp_link_type
     */
    public void setMsp_link_type(java.lang.String msp_link_type) {
        this.msp_link_type = msp_link_type;
    }


    /**
     * Gets the billing_code value for this OaProject.
     * 
     * @return billing_code
     */
    public java.lang.String getBilling_code() {
        return billing_code;
    }


    /**
     * Sets the billing_code value for this OaProject.
     * 
     * @param billing_code
     */
    public void setBilling_code(java.lang.String billing_code) {
        this.billing_code = billing_code;
    }


    /**
     * Gets the copy_revenue_recognition_auto_settings value for this OaProject.
     * 
     * @return copy_revenue_recognition_auto_settings
     */
    public java.lang.String getCopy_revenue_recognition_auto_settings() {
        return copy_revenue_recognition_auto_settings;
    }


    /**
     * Sets the copy_revenue_recognition_auto_settings value for this OaProject.
     * 
     * @param copy_revenue_recognition_auto_settings
     */
    public void setCopy_revenue_recognition_auto_settings(java.lang.String copy_revenue_recognition_auto_settings) {
        this.copy_revenue_recognition_auto_settings = copy_revenue_recognition_auto_settings;
    }


    /**
     * Gets the customerid value for this OaProject.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaProject.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the customer_name value for this OaProject.
     * 
     * @return customer_name
     */
    public java.lang.String getCustomer_name() {
        return customer_name;
    }


    /**
     * Sets the customer_name value for this OaProject.
     * 
     * @param customer_name
     */
    public void setCustomer_name(java.lang.String customer_name) {
        this.customer_name = customer_name;
    }


    /**
     * Gets the te_allowance_approvalprocess value for this OaProject.
     * 
     * @return te_allowance_approvalprocess
     */
    public java.lang.String getTe_allowance_approvalprocess() {
        return te_allowance_approvalprocess;
    }


    /**
     * Sets the te_allowance_approvalprocess value for this OaProject.
     * 
     * @param te_allowance_approvalprocess
     */
    public void setTe_allowance_approvalprocess(java.lang.String te_allowance_approvalprocess) {
        this.te_allowance_approvalprocess = te_allowance_approvalprocess;
    }


    /**
     * Gets the userid value for this OaProject.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this OaProject.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the project_locationid value for this OaProject.
     * 
     * @return project_locationid
     */
    public java.lang.String getProject_locationid() {
        return project_locationid;
    }


    /**
     * Sets the project_locationid value for this OaProject.
     * 
     * @param project_locationid
     */
    public void setProject_locationid(java.lang.String project_locationid) {
        this.project_locationid = project_locationid;
    }


    /**
     * Gets the rate_cardid value for this OaProject.
     * 
     * @return rate_cardid
     */
    public java.lang.String getRate_cardid() {
        return rate_cardid;
    }


    /**
     * Sets the rate_cardid value for this OaProject.
     * 
     * @param rate_cardid
     */
    public void setRate_cardid(java.lang.String rate_cardid) {
        this.rate_cardid = rate_cardid;
    }


    /**
     * Gets the ta_include value for this OaProject.
     * 
     * @return ta_include
     */
    public java.lang.String getTa_include() {
        return ta_include;
    }


    /**
     * Sets the ta_include value for this OaProject.
     * 
     * @param ta_include
     */
    public void setTa_include(java.lang.String ta_include) {
        this.ta_include = ta_include;
    }


    /**
     * Gets the invoice_text value for this OaProject.
     * 
     * @return invoice_text
     */
    public java.lang.String getInvoice_text() {
        return invoice_text;
    }


    /**
     * Sets the invoice_text value for this OaProject.
     * 
     * @param invoice_text
     */
    public void setInvoice_text(java.lang.String invoice_text) {
        this.invoice_text = invoice_text;
    }


    /**
     * Gets the sga_labor value for this OaProject.
     * 
     * @return sga_labor
     */
    public java.lang.String getSga_labor() {
        return sga_labor;
    }


    /**
     * Sets the sga_labor value for this OaProject.
     * 
     * @param sga_labor
     */
    public void setSga_labor(java.lang.String sga_labor) {
        this.sga_labor = sga_labor;
    }


    /**
     * Gets the shipping_contact_id value for this OaProject.
     * 
     * @return shipping_contact_id
     */
    public java.lang.String getShipping_contact_id() {
        return shipping_contact_id;
    }


    /**
     * Sets the shipping_contact_id value for this OaProject.
     * 
     * @param shipping_contact_id
     */
    public void setShipping_contact_id(java.lang.String shipping_contact_id) {
        this.shipping_contact_id = shipping_contact_id;
    }


    /**
     * Gets the is_portfolio_project value for this OaProject.
     * 
     * @return is_portfolio_project
     */
    public java.lang.String getIs_portfolio_project() {
        return is_portfolio_project;
    }


    /**
     * Sets the is_portfolio_project value for this OaProject.
     * 
     * @param is_portfolio_project
     */
    public void setIs_portfolio_project(java.lang.String is_portfolio_project) {
        this.is_portfolio_project = is_portfolio_project;
    }


    /**
     * Gets the notify_issue_assigned_to value for this OaProject.
     * 
     * @return notify_issue_assigned_to
     */
    public java.lang.String getNotify_issue_assigned_to() {
        return notify_issue_assigned_to;
    }


    /**
     * Sets the notify_issue_assigned_to value for this OaProject.
     * 
     * @param notify_issue_assigned_to
     */
    public void setNotify_issue_assigned_to(java.lang.String notify_issue_assigned_to) {
        this.notify_issue_assigned_to = notify_issue_assigned_to;
    }


    /**
     * Gets the start_date value for this OaProject.
     * 
     * @return start_date
     */
    public java.lang.String getStart_date() {
        return start_date;
    }


    /**
     * Sets the start_date value for this OaProject.
     * 
     * @param start_date
     */
    public void setStart_date(java.lang.String start_date) {
        this.start_date = start_date;
    }


    /**
     * Gets the te_allowance_approver value for this OaProject.
     * 
     * @return te_allowance_approver
     */
    public java.lang.String getTe_allowance_approver() {
        return te_allowance_approver;
    }


    /**
     * Sets the te_allowance_approver value for this OaProject.
     * 
     * @param te_allowance_approver
     */
    public void setTe_allowance_approver(java.lang.String te_allowance_approver) {
        this.te_allowance_approver = te_allowance_approver;
    }


    /**
     * Gets the exported_dr value for this OaProject.
     * 
     * @return exported_dr
     */
    public java.lang.String getExported_dr() {
        return exported_dr;
    }


    /**
     * Sets the exported_dr value for this OaProject.
     * 
     * @param exported_dr
     */
    public void setExported_dr(java.lang.String exported_dr) {
        this.exported_dr = exported_dr;
    }


    /**
     * Gets the pr_approvalprocess value for this OaProject.
     * 
     * @return pr_approvalprocess
     */
    public java.lang.String getPr_approvalprocess() {
        return pr_approvalprocess;
    }


    /**
     * Sets the pr_approvalprocess value for this OaProject.
     * 
     * @param pr_approvalprocess
     */
    public void setPr_approvalprocess(java.lang.String pr_approvalprocess) {
        this.pr_approvalprocess = pr_approvalprocess;
    }


    /**
     * Gets the copy_dashboard_settings value for this OaProject.
     * 
     * @return copy_dashboard_settings
     */
    public java.lang.String getCopy_dashboard_settings() {
        return copy_dashboard_settings;
    }


    /**
     * Sets the copy_dashboard_settings value for this OaProject.
     * 
     * @param copy_dashboard_settings
     */
    public void setCopy_dashboard_settings(java.lang.String copy_dashboard_settings) {
        this.copy_dashboard_settings = copy_dashboard_settings;
    }


    /**
     * Gets the message value for this OaProject.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this OaProject.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the created value for this OaProject.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaProject.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the copy_project_billing_auto_settings value for this OaProject.
     * 
     * @return copy_project_billing_auto_settings
     */
    public java.lang.String getCopy_project_billing_auto_settings() {
        return copy_project_billing_auto_settings;
    }


    /**
     * Sets the copy_project_billing_auto_settings value for this OaProject.
     * 
     * @param copy_project_billing_auto_settings
     */
    public void setCopy_project_billing_auto_settings(java.lang.String copy_project_billing_auto_settings) {
        this.copy_project_billing_auto_settings = copy_project_billing_auto_settings;
    }


    /**
     * Gets the copy_revenue_recognition_rules value for this OaProject.
     * 
     * @return copy_revenue_recognition_rules
     */
    public java.lang.String getCopy_revenue_recognition_rules() {
        return copy_revenue_recognition_rules;
    }


    /**
     * Sets the copy_revenue_recognition_rules value for this OaProject.
     * 
     * @param copy_revenue_recognition_rules
     */
    public void setCopy_revenue_recognition_rules(java.lang.String copy_revenue_recognition_rules) {
        this.copy_revenue_recognition_rules = copy_revenue_recognition_rules;
    }


    /**
     * Gets the current_dr value for this OaProject.
     * 
     * @return current_dr
     */
    public java.lang.String getCurrent_dr() {
        return current_dr;
    }


    /**
     * Sets the current_dr value for this OaProject.
     * 
     * @param current_dr
     */
    public void setCurrent_dr(java.lang.String current_dr) {
        this.current_dr = current_dr;
    }


    /**
     * Gets the attributes value for this OaProject.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaProject.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaProject)) return false;
        OaProject other = (OaProject) obj;
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
            ((this.copy_notification_settings==null && other.getCopy_notification_settings()==null) || 
             (this.copy_notification_settings!=null &&
              this.copy_notification_settings.equals(other.getCopy_notification_settings()))) &&
            ((this.po_approver==null && other.getPo_approver()==null) || 
             (this.po_approver!=null &&
              this.po_approver.equals(other.getPo_approver()))) &&
            ((this.invoice_layoutid==null && other.getInvoice_layoutid()==null) || 
             (this.invoice_layoutid!=null &&
              this.invoice_layoutid.equals(other.getInvoice_layoutid()))) &&
            ((this.exported_wip==null && other.getExported_wip()==null) || 
             (this.exported_wip!=null &&
              this.exported_wip.equals(other.getExported_wip()))) &&
            ((this.notify_issue_created_customer_owner==null && other.getNotify_issue_created_customer_owner()==null) || 
             (this.notify_issue_created_customer_owner!=null &&
              this.notify_issue_created_customer_owner.equals(other.getNotify_issue_created_customer_owner()))) &&
            ((this.attachmentid==null && other.getAttachmentid()==null) || 
             (this.attachmentid!=null &&
              this.attachmentid.equals(other.getAttachmentid()))) &&
            ((this.category_filter==null && other.getCategory_filter()==null) || 
             (this.category_filter!=null &&
              this.category_filter.equals(other.getCategory_filter()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.notify_assignees==null && other.getNotify_assignees()==null) || 
             (this.notify_assignees!=null &&
              this.notify_assignees.equals(other.getNotify_assignees()))) &&
            ((this.sync_workspace==null && other.getSync_workspace()==null) || 
             (this.sync_workspace!=null &&
              this.sync_workspace.equals(other.getSync_workspace()))) &&
            ((this.notify_owner==null && other.getNotify_owner()==null) || 
             (this.notify_owner!=null &&
              this.notify_owner.equals(other.getNotify_owner()))) &&
            ((this.br_approvalprocess==null && other.getBr_approvalprocess()==null) || 
             (this.br_approvalprocess!=null &&
              this.br_approvalprocess.equals(other.getBr_approvalprocess()))) &&
            ((this.te_approver==null && other.getTe_approver()==null) || 
             (this.te_approver!=null &&
              this.te_approver.equals(other.getTe_approver()))) &&
            ((this.portfolio_projectid==null && other.getPortfolio_projectid()==null) || 
             (this.portfolio_projectid!=null &&
              this.portfolio_projectid.equals(other.getPortfolio_projectid()))) &&
            ((this.pm_approver_2==null && other.getPm_approver_2()==null) || 
             (this.pm_approver_2!=null &&
              this.pm_approver_2.equals(other.getPm_approver_2()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.tb_approver==null && other.getTb_approver()==null) || 
             (this.tb_approver!=null &&
              this.tb_approver.equals(other.getTb_approver()))) &&
            ((this.timetype_filter==null && other.getTimetype_filter()==null) || 
             (this.timetype_filter!=null &&
              this.timetype_filter.equals(other.getTimetype_filter()))) &&
            ((this.tax_location_name==null && other.getTax_location_name()==null) || 
             (this.tax_location_name!=null &&
              this.tax_location_name.equals(other.getTax_location_name()))) &&
            ((this.template_project_id==null && other.getTemplate_project_id()==null) || 
             (this.template_project_id!=null &&
              this.template_project_id.equals(other.getTemplate_project_id()))) &&
            ((this.notify_issue_closed_customer_owner==null && other.getNotify_issue_closed_customer_owner()==null) || 
             (this.notify_issue_closed_customer_owner!=null &&
              this.notify_issue_closed_customer_owner.equals(other.getNotify_issue_closed_customer_owner()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.hierarchy_node_ids==null && other.getHierarchy_node_ids()==null) || 
             (this.hierarchy_node_ids!=null &&
              this.hierarchy_node_ids.equals(other.getHierarchy_node_ids()))) &&
            ((this.po_approvalprocess==null && other.getPo_approvalprocess()==null) || 
             (this.po_approvalprocess!=null &&
              this.po_approvalprocess.equals(other.getPo_approvalprocess()))) &&
            ((this.locationid==null && other.getLocationid()==null) || 
             (this.locationid!=null &&
              this.locationid.equals(other.getLocationid()))) &&
            ((this.finish_date==null && other.getFinish_date()==null) || 
             (this.finish_date!=null &&
              this.finish_date.equals(other.getFinish_date()))) &&
            ((this.copy_custom_fields==null && other.getCopy_custom_fields()==null) || 
             (this.copy_custom_fields!=null &&
              this.copy_custom_fields.equals(other.getCopy_custom_fields()))) &&
            ((this.copy_invoice_layout_settings==null && other.getCopy_invoice_layout_settings()==null) || 
             (this.copy_invoice_layout_settings!=null &&
              this.copy_invoice_layout_settings.equals(other.getCopy_invoice_layout_settings()))) &&
            ((this.pm_approver_1==null && other.getPm_approver_1()==null) || 
             (this.pm_approver_1!=null &&
              this.pm_approver_1.equals(other.getPm_approver_1()))) &&
            ((this.copy_project_pricing==null && other.getCopy_project_pricing()==null) || 
             (this.copy_project_pricing!=null &&
              this.copy_project_pricing.equals(other.getCopy_project_pricing()))) &&
            ((this.only_owner_can_edit==null && other.getOnly_owner_can_edit()==null) || 
             (this.only_owner_can_edit!=null &&
              this.only_owner_can_edit.equals(other.getOnly_owner_can_edit()))) &&
            ((this.br_approver==null && other.getBr_approver()==null) || 
             (this.br_approver!=null &&
              this.br_approver.equals(other.getBr_approver()))) &&
            ((this.payroll_type_filter==null && other.getPayroll_type_filter()==null) || 
             (this.payroll_type_filter!=null &&
              this.payroll_type_filter.equals(other.getPayroll_type_filter()))) &&
            ((this.az_approvalprocess==null && other.getAz_approvalprocess()==null) || 
             (this.az_approvalprocess!=null &&
              this.az_approvalprocess.equals(other.getAz_approvalprocess()))) &&
            ((this.budget==null && other.getBudget()==null) || 
             (this.budget!=null &&
              this.budget.equals(other.getBudget()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.cost_centerid==null && other.getCost_centerid()==null) || 
             (this.cost_centerid!=null &&
              this.cost_centerid.equals(other.getCost_centerid()))) &&
            ((this.budget_time==null && other.getBudget_time()==null) || 
             (this.budget_time!=null &&
              this.budget_time.equals(other.getBudget_time()))) &&
            ((this.pm_approver_3==null && other.getPm_approver_3()==null) || 
             (this.pm_approver_3!=null &&
              this.pm_approver_3.equals(other.getPm_approver_3()))) &&
            ((this.notify_issue_closed_assigned_to==null && other.getNotify_issue_closed_assigned_to()==null) || 
             (this.notify_issue_closed_assigned_to!=null &&
              this.notify_issue_closed_assigned_to.equals(other.getNotify_issue_closed_assigned_to()))) &&
            ((this.rm_approver==null && other.getRm_approver()==null) || 
             (this.rm_approver!=null &&
              this.rm_approver.equals(other.getRm_approver()))) &&
            ((this.copy_loaded_cost==null && other.getCopy_loaded_cost()==null) || 
             (this.copy_loaded_cost!=null &&
              this.copy_loaded_cost.equals(other.getCopy_loaded_cost()))) &&
            ((this.notify_sr_submitted_project_owner==null && other.getNotify_sr_submitted_project_owner()==null) || 
             (this.notify_sr_submitted_project_owner!=null &&
              this.notify_sr_submitted_project_owner.equals(other.getNotify_sr_submitted_project_owner()))) &&
            ((this.billing_contactid==null && other.getBilling_contactid()==null) || 
             (this.billing_contactid!=null &&
              this.billing_contactid.equals(other.getBilling_contactid()))) &&
            ((this.no_dirty==null && other.getNo_dirty()==null) || 
             (this.no_dirty!=null &&
              this.no_dirty.equals(other.getNo_dirty()))) &&
            ((this.te_include==null && other.getTe_include()==null) || 
             (this.te_include!=null &&
              this.te_include.equals(other.getTe_include()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.create_workspace==null && other.getCreate_workspace()==null) || 
             (this.create_workspace!=null &&
              this.create_workspace.equals(other.getCreate_workspace()))) &&
            ((this.tb_approvalprocess==null && other.getTb_approvalprocess()==null) || 
             (this.tb_approvalprocess!=null &&
              this.tb_approvalprocess.equals(other.getTb_approvalprocess()))) &&
            ((this.copy_approvers==null && other.getCopy_approvers()==null) || 
             (this.copy_approvers!=null &&
              this.copy_approvers.equals(other.getCopy_approvers()))) &&
            ((this.sold_to_contact_id==null && other.getSold_to_contact_id()==null) || 
             (this.sold_to_contact_id!=null &&
              this.sold_to_contact_id.equals(other.getSold_to_contact_id()))) &&
            ((this.auto_bill_override==null && other.getAuto_bill_override()==null) || 
             (this.auto_bill_override!=null &&
              this.auto_bill_override.equals(other.getAuto_bill_override()))) &&
            ((this.auto_bill==null && other.getAuto_bill()==null) || 
             (this.auto_bill!=null &&
              this.auto_bill.equals(other.getAuto_bill()))) &&
            ((this.az_approver==null && other.getAz_approver()==null) || 
             (this.az_approver!=null &&
              this.az_approver.equals(other.getAz_approver()))) &&
            ((this.auto_bill_cap==null && other.getAuto_bill_cap()==null) || 
             (this.auto_bill_cap!=null &&
              this.auto_bill_cap.equals(other.getAuto_bill_cap()))) &&
            ((this.picklist_label==null && other.getPicklist_label()==null) || 
             (this.picklist_label!=null &&
              this.picklist_label.equals(other.getPicklist_label()))) &&
            ((this.rm_approvalprocess==null && other.getRm_approvalprocess()==null) || 
             (this.rm_approvalprocess!=null &&
              this.rm_approvalprocess.equals(other.getRm_approvalprocess()))) &&
            ((this.copy_project_billing_rules==null && other.getCopy_project_billing_rules()==null) || 
             (this.copy_project_billing_rules!=null &&
              this.copy_project_billing_rules.equals(other.getCopy_project_billing_rules()))) &&
            ((this.filtersetids==null && other.getFiltersetids()==null) || 
             (this.filtersetids!=null &&
              this.filtersetids.equals(other.getFiltersetids()))) &&
            ((this.notify_issue_closed_project_owner==null && other.getNotify_issue_closed_project_owner()==null) || 
             (this.notify_issue_closed_project_owner!=null &&
              this.notify_issue_closed_project_owner.equals(other.getNotify_issue_closed_project_owner()))) &&
            ((this.ta_approvalprocess==null && other.getTa_approvalprocess()==null) || 
             (this.ta_approvalprocess!=null &&
              this.ta_approvalprocess.equals(other.getTa_approvalprocess()))) &&
            ((this.te_approvalprocess==null && other.getTe_approvalprocess()==null) || 
             (this.te_approvalprocess!=null &&
              this.te_approvalprocess.equals(other.getTe_approvalprocess()))) &&
            ((this.current_wip==null && other.getCurrent_wip()==null) || 
             (this.current_wip!=null &&
              this.current_wip.equals(other.getCurrent_wip()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.auto_bill_cap_value==null && other.getAuto_bill_cap_value()==null) || 
             (this.auto_bill_cap_value!=null &&
              this.auto_bill_cap_value.equals(other.getAuto_bill_cap_value()))) &&
            ((this.rv_approver==null && other.getRv_approver()==null) || 
             (this.rv_approver!=null &&
              this.rv_approver.equals(other.getRv_approver()))) &&
            ((this.rv_approvalprocess==null && other.getRv_approvalprocess()==null) || 
             (this.rv_approvalprocess!=null &&
              this.rv_approvalprocess.equals(other.getRv_approvalprocess()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.notify_issue_created_project_owner==null && other.getNotify_issue_created_project_owner()==null) || 
             (this.notify_issue_created_project_owner!=null &&
              this.notify_issue_created_project_owner.equals(other.getNotify_issue_created_project_owner()))) &&
            ((this.copy_issues==null && other.getCopy_issues()==null) || 
             (this.copy_issues!=null &&
              this.copy_issues.equals(other.getCopy_issues()))) &&
            ((this.tax_locationid==null && other.getTax_locationid()==null) || 
             (this.tax_locationid!=null &&
              this.tax_locationid.equals(other.getTax_locationid()))) &&
            ((this.project_stageid==null && other.getProject_stageid()==null) || 
             (this.project_stageid!=null &&
              this.project_stageid.equals(other.getProject_stageid()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.copy_revenuerecognition_auto_settings==null && other.getCopy_revenuerecognition_auto_settings()==null) || 
             (this.copy_revenuerecognition_auto_settings!=null &&
              this.copy_revenuerecognition_auto_settings.equals(other.getCopy_revenuerecognition_auto_settings()))) &&
            ((this.ta_approver==null && other.getTa_approver()==null) || 
             (this.ta_approver!=null &&
              this.ta_approver.equals(other.getTa_approver()))) &&
            ((this.pr_approver==null && other.getPr_approver()==null) || 
             (this.pr_approver!=null &&
              this.pr_approver.equals(other.getPr_approver()))) &&
            ((this.msp_link_type==null && other.getMsp_link_type()==null) || 
             (this.msp_link_type!=null &&
              this.msp_link_type.equals(other.getMsp_link_type()))) &&
            ((this.billing_code==null && other.getBilling_code()==null) || 
             (this.billing_code!=null &&
              this.billing_code.equals(other.getBilling_code()))) &&
            ((this.copy_revenue_recognition_auto_settings==null && other.getCopy_revenue_recognition_auto_settings()==null) || 
             (this.copy_revenue_recognition_auto_settings!=null &&
              this.copy_revenue_recognition_auto_settings.equals(other.getCopy_revenue_recognition_auto_settings()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.customer_name==null && other.getCustomer_name()==null) || 
             (this.customer_name!=null &&
              this.customer_name.equals(other.getCustomer_name()))) &&
            ((this.te_allowance_approvalprocess==null && other.getTe_allowance_approvalprocess()==null) || 
             (this.te_allowance_approvalprocess!=null &&
              this.te_allowance_approvalprocess.equals(other.getTe_allowance_approvalprocess()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.project_locationid==null && other.getProject_locationid()==null) || 
             (this.project_locationid!=null &&
              this.project_locationid.equals(other.getProject_locationid()))) &&
            ((this.rate_cardid==null && other.getRate_cardid()==null) || 
             (this.rate_cardid!=null &&
              this.rate_cardid.equals(other.getRate_cardid()))) &&
            ((this.ta_include==null && other.getTa_include()==null) || 
             (this.ta_include!=null &&
              this.ta_include.equals(other.getTa_include()))) &&
            ((this.invoice_text==null && other.getInvoice_text()==null) || 
             (this.invoice_text!=null &&
              this.invoice_text.equals(other.getInvoice_text()))) &&
            ((this.sga_labor==null && other.getSga_labor()==null) || 
             (this.sga_labor!=null &&
              this.sga_labor.equals(other.getSga_labor()))) &&
            ((this.shipping_contact_id==null && other.getShipping_contact_id()==null) || 
             (this.shipping_contact_id!=null &&
              this.shipping_contact_id.equals(other.getShipping_contact_id()))) &&
            ((this.is_portfolio_project==null && other.getIs_portfolio_project()==null) || 
             (this.is_portfolio_project!=null &&
              this.is_portfolio_project.equals(other.getIs_portfolio_project()))) &&
            ((this.notify_issue_assigned_to==null && other.getNotify_issue_assigned_to()==null) || 
             (this.notify_issue_assigned_to!=null &&
              this.notify_issue_assigned_to.equals(other.getNotify_issue_assigned_to()))) &&
            ((this.start_date==null && other.getStart_date()==null) || 
             (this.start_date!=null &&
              this.start_date.equals(other.getStart_date()))) &&
            ((this.te_allowance_approver==null && other.getTe_allowance_approver()==null) || 
             (this.te_allowance_approver!=null &&
              this.te_allowance_approver.equals(other.getTe_allowance_approver()))) &&
            ((this.exported_dr==null && other.getExported_dr()==null) || 
             (this.exported_dr!=null &&
              this.exported_dr.equals(other.getExported_dr()))) &&
            ((this.pr_approvalprocess==null && other.getPr_approvalprocess()==null) || 
             (this.pr_approvalprocess!=null &&
              this.pr_approvalprocess.equals(other.getPr_approvalprocess()))) &&
            ((this.copy_dashboard_settings==null && other.getCopy_dashboard_settings()==null) || 
             (this.copy_dashboard_settings!=null &&
              this.copy_dashboard_settings.equals(other.getCopy_dashboard_settings()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.copy_project_billing_auto_settings==null && other.getCopy_project_billing_auto_settings()==null) || 
             (this.copy_project_billing_auto_settings!=null &&
              this.copy_project_billing_auto_settings.equals(other.getCopy_project_billing_auto_settings()))) &&
            ((this.copy_revenue_recognition_rules==null && other.getCopy_revenue_recognition_rules()==null) || 
             (this.copy_revenue_recognition_rules!=null &&
              this.copy_revenue_recognition_rules.equals(other.getCopy_revenue_recognition_rules()))) &&
            ((this.current_dr==null && other.getCurrent_dr()==null) || 
             (this.current_dr!=null &&
              this.current_dr.equals(other.getCurrent_dr()))) &&
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
        if (getCopy_notification_settings() != null) {
            _hashCode += getCopy_notification_settings().hashCode();
        }
        if (getPo_approver() != null) {
            _hashCode += getPo_approver().hashCode();
        }
        if (getInvoice_layoutid() != null) {
            _hashCode += getInvoice_layoutid().hashCode();
        }
        if (getExported_wip() != null) {
            _hashCode += getExported_wip().hashCode();
        }
        if (getNotify_issue_created_customer_owner() != null) {
            _hashCode += getNotify_issue_created_customer_owner().hashCode();
        }
        if (getAttachmentid() != null) {
            _hashCode += getAttachmentid().hashCode();
        }
        if (getCategory_filter() != null) {
            _hashCode += getCategory_filter().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getNotify_assignees() != null) {
            _hashCode += getNotify_assignees().hashCode();
        }
        if (getSync_workspace() != null) {
            _hashCode += getSync_workspace().hashCode();
        }
        if (getNotify_owner() != null) {
            _hashCode += getNotify_owner().hashCode();
        }
        if (getBr_approvalprocess() != null) {
            _hashCode += getBr_approvalprocess().hashCode();
        }
        if (getTe_approver() != null) {
            _hashCode += getTe_approver().hashCode();
        }
        if (getPortfolio_projectid() != null) {
            _hashCode += getPortfolio_projectid().hashCode();
        }
        if (getPm_approver_2() != null) {
            _hashCode += getPm_approver_2().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getTb_approver() != null) {
            _hashCode += getTb_approver().hashCode();
        }
        if (getTimetype_filter() != null) {
            _hashCode += getTimetype_filter().hashCode();
        }
        if (getTax_location_name() != null) {
            _hashCode += getTax_location_name().hashCode();
        }
        if (getTemplate_project_id() != null) {
            _hashCode += getTemplate_project_id().hashCode();
        }
        if (getNotify_issue_closed_customer_owner() != null) {
            _hashCode += getNotify_issue_closed_customer_owner().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHierarchy_node_ids() != null) {
            _hashCode += getHierarchy_node_ids().hashCode();
        }
        if (getPo_approvalprocess() != null) {
            _hashCode += getPo_approvalprocess().hashCode();
        }
        if (getLocationid() != null) {
            _hashCode += getLocationid().hashCode();
        }
        if (getFinish_date() != null) {
            _hashCode += getFinish_date().hashCode();
        }
        if (getCopy_custom_fields() != null) {
            _hashCode += getCopy_custom_fields().hashCode();
        }
        if (getCopy_invoice_layout_settings() != null) {
            _hashCode += getCopy_invoice_layout_settings().hashCode();
        }
        if (getPm_approver_1() != null) {
            _hashCode += getPm_approver_1().hashCode();
        }
        if (getCopy_project_pricing() != null) {
            _hashCode += getCopy_project_pricing().hashCode();
        }
        if (getOnly_owner_can_edit() != null) {
            _hashCode += getOnly_owner_can_edit().hashCode();
        }
        if (getBr_approver() != null) {
            _hashCode += getBr_approver().hashCode();
        }
        if (getPayroll_type_filter() != null) {
            _hashCode += getPayroll_type_filter().hashCode();
        }
        if (getAz_approvalprocess() != null) {
            _hashCode += getAz_approvalprocess().hashCode();
        }
        if (getBudget() != null) {
            _hashCode += getBudget().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCost_centerid() != null) {
            _hashCode += getCost_centerid().hashCode();
        }
        if (getBudget_time() != null) {
            _hashCode += getBudget_time().hashCode();
        }
        if (getPm_approver_3() != null) {
            _hashCode += getPm_approver_3().hashCode();
        }
        if (getNotify_issue_closed_assigned_to() != null) {
            _hashCode += getNotify_issue_closed_assigned_to().hashCode();
        }
        if (getRm_approver() != null) {
            _hashCode += getRm_approver().hashCode();
        }
        if (getCopy_loaded_cost() != null) {
            _hashCode += getCopy_loaded_cost().hashCode();
        }
        if (getNotify_sr_submitted_project_owner() != null) {
            _hashCode += getNotify_sr_submitted_project_owner().hashCode();
        }
        if (getBilling_contactid() != null) {
            _hashCode += getBilling_contactid().hashCode();
        }
        if (getNo_dirty() != null) {
            _hashCode += getNo_dirty().hashCode();
        }
        if (getTe_include() != null) {
            _hashCode += getTe_include().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getCreate_workspace() != null) {
            _hashCode += getCreate_workspace().hashCode();
        }
        if (getTb_approvalprocess() != null) {
            _hashCode += getTb_approvalprocess().hashCode();
        }
        if (getCopy_approvers() != null) {
            _hashCode += getCopy_approvers().hashCode();
        }
        if (getSold_to_contact_id() != null) {
            _hashCode += getSold_to_contact_id().hashCode();
        }
        if (getAuto_bill_override() != null) {
            _hashCode += getAuto_bill_override().hashCode();
        }
        if (getAuto_bill() != null) {
            _hashCode += getAuto_bill().hashCode();
        }
        if (getAz_approver() != null) {
            _hashCode += getAz_approver().hashCode();
        }
        if (getAuto_bill_cap() != null) {
            _hashCode += getAuto_bill_cap().hashCode();
        }
        if (getPicklist_label() != null) {
            _hashCode += getPicklist_label().hashCode();
        }
        if (getRm_approvalprocess() != null) {
            _hashCode += getRm_approvalprocess().hashCode();
        }
        if (getCopy_project_billing_rules() != null) {
            _hashCode += getCopy_project_billing_rules().hashCode();
        }
        if (getFiltersetids() != null) {
            _hashCode += getFiltersetids().hashCode();
        }
        if (getNotify_issue_closed_project_owner() != null) {
            _hashCode += getNotify_issue_closed_project_owner().hashCode();
        }
        if (getTa_approvalprocess() != null) {
            _hashCode += getTa_approvalprocess().hashCode();
        }
        if (getTe_approvalprocess() != null) {
            _hashCode += getTe_approvalprocess().hashCode();
        }
        if (getCurrent_wip() != null) {
            _hashCode += getCurrent_wip().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAuto_bill_cap_value() != null) {
            _hashCode += getAuto_bill_cap_value().hashCode();
        }
        if (getRv_approver() != null) {
            _hashCode += getRv_approver().hashCode();
        }
        if (getRv_approvalprocess() != null) {
            _hashCode += getRv_approvalprocess().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getNotify_issue_created_project_owner() != null) {
            _hashCode += getNotify_issue_created_project_owner().hashCode();
        }
        if (getCopy_issues() != null) {
            _hashCode += getCopy_issues().hashCode();
        }
        if (getTax_locationid() != null) {
            _hashCode += getTax_locationid().hashCode();
        }
        if (getProject_stageid() != null) {
            _hashCode += getProject_stageid().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getCopy_revenuerecognition_auto_settings() != null) {
            _hashCode += getCopy_revenuerecognition_auto_settings().hashCode();
        }
        if (getTa_approver() != null) {
            _hashCode += getTa_approver().hashCode();
        }
        if (getPr_approver() != null) {
            _hashCode += getPr_approver().hashCode();
        }
        if (getMsp_link_type() != null) {
            _hashCode += getMsp_link_type().hashCode();
        }
        if (getBilling_code() != null) {
            _hashCode += getBilling_code().hashCode();
        }
        if (getCopy_revenue_recognition_auto_settings() != null) {
            _hashCode += getCopy_revenue_recognition_auto_settings().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getCustomer_name() != null) {
            _hashCode += getCustomer_name().hashCode();
        }
        if (getTe_allowance_approvalprocess() != null) {
            _hashCode += getTe_allowance_approvalprocess().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getProject_locationid() != null) {
            _hashCode += getProject_locationid().hashCode();
        }
        if (getRate_cardid() != null) {
            _hashCode += getRate_cardid().hashCode();
        }
        if (getTa_include() != null) {
            _hashCode += getTa_include().hashCode();
        }
        if (getInvoice_text() != null) {
            _hashCode += getInvoice_text().hashCode();
        }
        if (getSga_labor() != null) {
            _hashCode += getSga_labor().hashCode();
        }
        if (getShipping_contact_id() != null) {
            _hashCode += getShipping_contact_id().hashCode();
        }
        if (getIs_portfolio_project() != null) {
            _hashCode += getIs_portfolio_project().hashCode();
        }
        if (getNotify_issue_assigned_to() != null) {
            _hashCode += getNotify_issue_assigned_to().hashCode();
        }
        if (getStart_date() != null) {
            _hashCode += getStart_date().hashCode();
        }
        if (getTe_allowance_approver() != null) {
            _hashCode += getTe_allowance_approver().hashCode();
        }
        if (getExported_dr() != null) {
            _hashCode += getExported_dr().hashCode();
        }
        if (getPr_approvalprocess() != null) {
            _hashCode += getPr_approvalprocess().hashCode();
        }
        if (getCopy_dashboard_settings() != null) {
            _hashCode += getCopy_dashboard_settings().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCopy_project_billing_auto_settings() != null) {
            _hashCode += getCopy_project_billing_auto_settings().hashCode();
        }
        if (getCopy_revenue_recognition_rules() != null) {
            _hashCode += getCopy_revenue_recognition_rules().hashCode();
        }
        if (getCurrent_dr() != null) {
            _hashCode += getCurrent_dr().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaProject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_notification_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_notification_settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("po_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "po_approver"));
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
        elemField.setFieldName("exported_wip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exported_wip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_issue_created_customer_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_issue_created_customer_owner"));
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
        elemField.setFieldName("category_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "category_filter"));
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
        elemField.setFieldName("notify_assignees");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_assignees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sync_workspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sync_workspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("br_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "br_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("te_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "te_approver"));
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
        elemField.setFieldName("pm_approver_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pm_approver_2"));
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
        elemField.setFieldName("timetype_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timetype_filter"));
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
        elemField.setFieldName("template_project_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "template_project_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_issue_closed_customer_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_issue_closed_customer_owner"));
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
        elemField.setFieldName("hierarchy_node_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hierarchy_node_ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("po_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "po_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finish_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finish_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_custom_fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_custom_fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_invoice_layout_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_invoice_layout_settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pm_approver_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pm_approver_1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_project_pricing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_project_pricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("only_owner_can_edit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "only_owner_can_edit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("br_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "br_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payroll_type_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payroll_type_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("az_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "az_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budget"));
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
        elemField.setFieldName("cost_centerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_centerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budget_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "budget_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pm_approver_3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pm_approver_3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_issue_closed_assigned_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_issue_closed_assigned_to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rm_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rm_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_loaded_cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_loaded_cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_sr_submitted_project_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_sr_submitted_project_owner"));
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
        elemField.setFieldName("no_dirty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_dirty"));
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
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("create_workspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "create_workspace"));
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
        elemField.setFieldName("copy_approvers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_approvers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sold_to_contact_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sold_to_contact_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auto_bill_override");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auto_bill_override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auto_bill");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auto_bill"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("az_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "az_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auto_bill_cap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auto_bill_cap"));
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
        elemField.setFieldName("rm_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rm_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_project_billing_rules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_project_billing_rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filtersetids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filtersetids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_issue_closed_project_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_issue_closed_project_owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ta_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ta_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("te_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "te_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_wip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_wip"));
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
        elemField.setFieldName("auto_bill_cap_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auto_bill_cap_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rv_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rv_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rv_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rv_approvalprocess"));
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
        elemField.setFieldName("notify_issue_created_project_owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_issue_created_project_owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_issues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_issues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax_locationid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_stageid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_stageid"));
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
        elemField.setFieldName("copy_revenuerecognition_auto_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_revenuerecognition_auto_settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ta_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ta_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pr_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pr_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msp_link_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msp_link_type"));
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
        elemField.setFieldName("copy_revenue_recognition_auto_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_revenue_recognition_auto_settings"));
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
        elemField.setFieldName("customer_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customer_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("te_allowance_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "te_allowance_approvalprocess"));
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
        elemField.setFieldName("project_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_locationid"));
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
        elemField.setFieldName("sga_labor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sga_labor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping_contact_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping_contact_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_portfolio_project");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_portfolio_project"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notify_issue_assigned_to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notify_issue_assigned_to"));
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
        elemField.setFieldName("te_allowance_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "te_allowance_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exported_dr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exported_dr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pr_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pr_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_dashboard_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_dashboard_settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
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
        elemField.setFieldName("copy_project_billing_auto_settings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_project_billing_auto_settings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy_revenue_recognition_rules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy_revenue_recognition_rules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_dr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_dr"));
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
