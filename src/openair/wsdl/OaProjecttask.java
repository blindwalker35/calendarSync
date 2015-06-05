/**
 * OaProjecttask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OaProjecttask  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String priority;

    private java.lang.String percent_complete;

    private java.lang.String task_budget_cost;

    private java.lang.String is_a_phase;

    private java.lang.String early_finish;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String seq;

    private java.lang.String default_category_4;

    private java.lang.String timetype_filter;

    private java.lang.String non_billable;

    private java.lang.String name;

    private java.lang.String externalid;

    private java.lang.String default_category;

    private java.lang.String all_can_assign;

    private java.lang.String customerid;

    private java.lang.String predecessors;

    private java.lang.String customer_name;

    private java.lang.String parentid;

    private java.lang.String projecttask_typeid;

    private java.lang.String calculated_finishes;

    private java.lang.String predecessors_lag;

    private java.lang.String currency;

    private java.lang.String cost_centerid;

    private java.lang.String default_category_2;

    private java.lang.String calculated_starts;

    private java.lang.String estimated_hours;

    private java.lang.String default_category_3;

    private java.lang.String project_name;

    private java.lang.String id_number;

    private java.lang.String closed;

    private java.lang.String task_budget_revenue;

    private java.lang.String early_start;

    private java.lang.String use_project_assignment;

    private java.lang.String planned_hours;

    private java.lang.String deleted;

    private java.lang.String manual_task_budget;

    private java.lang.String projectid;

    private java.lang.String default_category_1;

    private java.lang.String created;

    private java.lang.String starts;

    private java.lang.String assign_user_names;

    private java.lang.String fnlt_date;

    private java.lang.String predecessors_type;

    private java.lang.String notes;

    private java.lang.String default_category_5;

    private openair.wsdl.OaBase[] attributes;

    public OaProjecttask() {
    }

    public OaProjecttask(
           java.lang.String priority,
           java.lang.String percent_complete,
           java.lang.String task_budget_cost,
           java.lang.String is_a_phase,
           java.lang.String early_finish,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String seq,
           java.lang.String default_category_4,
           java.lang.String timetype_filter,
           java.lang.String non_billable,
           java.lang.String name,
           java.lang.String externalid,
           java.lang.String default_category,
           java.lang.String all_can_assign,
           java.lang.String customerid,
           java.lang.String predecessors,
           java.lang.String customer_name,
           java.lang.String parentid,
           java.lang.String projecttask_typeid,
           java.lang.String calculated_finishes,
           java.lang.String predecessors_lag,
           java.lang.String currency,
           java.lang.String cost_centerid,
           java.lang.String default_category_2,
           java.lang.String calculated_starts,
           java.lang.String estimated_hours,
           java.lang.String default_category_3,
           java.lang.String project_name,
           java.lang.String id_number,
           java.lang.String closed,
           java.lang.String task_budget_revenue,
           java.lang.String early_start,
           java.lang.String use_project_assignment,
           java.lang.String planned_hours,
           java.lang.String deleted,
           java.lang.String manual_task_budget,
           java.lang.String projectid,
           java.lang.String default_category_1,
           java.lang.String created,
           java.lang.String starts,
           java.lang.String assign_user_names,
           java.lang.String fnlt_date,
           java.lang.String predecessors_type,
           java.lang.String notes,
           java.lang.String default_category_5,
           openair.wsdl.OaBase[] attributes) {
        this.priority = priority;
        this.percent_complete = percent_complete;
        this.task_budget_cost = task_budget_cost;
        this.is_a_phase = is_a_phase;
        this.early_finish = early_finish;
        this.updated = updated;
        this.id = id;
        this.seq = seq;
        this.default_category_4 = default_category_4;
        this.timetype_filter = timetype_filter;
        this.non_billable = non_billable;
        this.name = name;
        this.externalid = externalid;
        this.default_category = default_category;
        this.all_can_assign = all_can_assign;
        this.customerid = customerid;
        this.predecessors = predecessors;
        this.customer_name = customer_name;
        this.parentid = parentid;
        this.projecttask_typeid = projecttask_typeid;
        this.calculated_finishes = calculated_finishes;
        this.predecessors_lag = predecessors_lag;
        this.currency = currency;
        this.cost_centerid = cost_centerid;
        this.default_category_2 = default_category_2;
        this.calculated_starts = calculated_starts;
        this.estimated_hours = estimated_hours;
        this.default_category_3 = default_category_3;
        this.project_name = project_name;
        this.id_number = id_number;
        this.closed = closed;
        this.task_budget_revenue = task_budget_revenue;
        this.early_start = early_start;
        this.use_project_assignment = use_project_assignment;
        this.planned_hours = planned_hours;
        this.deleted = deleted;
        this.manual_task_budget = manual_task_budget;
        this.projectid = projectid;
        this.default_category_1 = default_category_1;
        this.created = created;
        this.starts = starts;
        this.assign_user_names = assign_user_names;
        this.fnlt_date = fnlt_date;
        this.predecessors_type = predecessors_type;
        this.notes = notes;
        this.default_category_5 = default_category_5;
        this.attributes = attributes;
    }


    /**
     * Gets the priority value for this OaProjecttask.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this OaProjecttask.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the percent_complete value for this OaProjecttask.
     * 
     * @return percent_complete
     */
    public java.lang.String getPercent_complete() {
        return percent_complete;
    }


    /**
     * Sets the percent_complete value for this OaProjecttask.
     * 
     * @param percent_complete
     */
    public void setPercent_complete(java.lang.String percent_complete) {
        this.percent_complete = percent_complete;
    }


    /**
     * Gets the task_budget_cost value for this OaProjecttask.
     * 
     * @return task_budget_cost
     */
    public java.lang.String getTask_budget_cost() {
        return task_budget_cost;
    }


    /**
     * Sets the task_budget_cost value for this OaProjecttask.
     * 
     * @param task_budget_cost
     */
    public void setTask_budget_cost(java.lang.String task_budget_cost) {
        this.task_budget_cost = task_budget_cost;
    }


    /**
     * Gets the is_a_phase value for this OaProjecttask.
     * 
     * @return is_a_phase
     */
    public java.lang.String getIs_a_phase() {
        return is_a_phase;
    }


    /**
     * Sets the is_a_phase value for this OaProjecttask.
     * 
     * @param is_a_phase
     */
    public void setIs_a_phase(java.lang.String is_a_phase) {
        this.is_a_phase = is_a_phase;
    }


    /**
     * Gets the early_finish value for this OaProjecttask.
     * 
     * @return early_finish
     */
    public java.lang.String getEarly_finish() {
        return early_finish;
    }


    /**
     * Sets the early_finish value for this OaProjecttask.
     * 
     * @param early_finish
     */
    public void setEarly_finish(java.lang.String early_finish) {
        this.early_finish = early_finish;
    }


    /**
     * Gets the updated value for this OaProjecttask.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaProjecttask.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaProjecttask.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaProjecttask.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the seq value for this OaProjecttask.
     * 
     * @return seq
     */
    public java.lang.String getSeq() {
        return seq;
    }


    /**
     * Sets the seq value for this OaProjecttask.
     * 
     * @param seq
     */
    public void setSeq(java.lang.String seq) {
        this.seq = seq;
    }


    /**
     * Gets the default_category_4 value for this OaProjecttask.
     * 
     * @return default_category_4
     */
    public java.lang.String getDefault_category_4() {
        return default_category_4;
    }


    /**
     * Sets the default_category_4 value for this OaProjecttask.
     * 
     * @param default_category_4
     */
    public void setDefault_category_4(java.lang.String default_category_4) {
        this.default_category_4 = default_category_4;
    }


    /**
     * Gets the timetype_filter value for this OaProjecttask.
     * 
     * @return timetype_filter
     */
    public java.lang.String getTimetype_filter() {
        return timetype_filter;
    }


    /**
     * Sets the timetype_filter value for this OaProjecttask.
     * 
     * @param timetype_filter
     */
    public void setTimetype_filter(java.lang.String timetype_filter) {
        this.timetype_filter = timetype_filter;
    }


    /**
     * Gets the non_billable value for this OaProjecttask.
     * 
     * @return non_billable
     */
    public java.lang.String getNon_billable() {
        return non_billable;
    }


    /**
     * Sets the non_billable value for this OaProjecttask.
     * 
     * @param non_billable
     */
    public void setNon_billable(java.lang.String non_billable) {
        this.non_billable = non_billable;
    }


    /**
     * Gets the name value for this OaProjecttask.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaProjecttask.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the externalid value for this OaProjecttask.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaProjecttask.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the default_category value for this OaProjecttask.
     * 
     * @return default_category
     */
    public java.lang.String getDefault_category() {
        return default_category;
    }


    /**
     * Sets the default_category value for this OaProjecttask.
     * 
     * @param default_category
     */
    public void setDefault_category(java.lang.String default_category) {
        this.default_category = default_category;
    }


    /**
     * Gets the all_can_assign value for this OaProjecttask.
     * 
     * @return all_can_assign
     */
    public java.lang.String getAll_can_assign() {
        return all_can_assign;
    }


    /**
     * Sets the all_can_assign value for this OaProjecttask.
     * 
     * @param all_can_assign
     */
    public void setAll_can_assign(java.lang.String all_can_assign) {
        this.all_can_assign = all_can_assign;
    }


    /**
     * Gets the customerid value for this OaProjecttask.
     * 
     * @return customerid
     */
    public java.lang.String getCustomerid() {
        return customerid;
    }


    /**
     * Sets the customerid value for this OaProjecttask.
     * 
     * @param customerid
     */
    public void setCustomerid(java.lang.String customerid) {
        this.customerid = customerid;
    }


    /**
     * Gets the predecessors value for this OaProjecttask.
     * 
     * @return predecessors
     */
    public java.lang.String getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this OaProjecttask.
     * 
     * @param predecessors
     */
    public void setPredecessors(java.lang.String predecessors) {
        this.predecessors = predecessors;
    }


    /**
     * Gets the customer_name value for this OaProjecttask.
     * 
     * @return customer_name
     */
    public java.lang.String getCustomer_name() {
        return customer_name;
    }


    /**
     * Sets the customer_name value for this OaProjecttask.
     * 
     * @param customer_name
     */
    public void setCustomer_name(java.lang.String customer_name) {
        this.customer_name = customer_name;
    }


    /**
     * Gets the parentid value for this OaProjecttask.
     * 
     * @return parentid
     */
    public java.lang.String getParentid() {
        return parentid;
    }


    /**
     * Sets the parentid value for this OaProjecttask.
     * 
     * @param parentid
     */
    public void setParentid(java.lang.String parentid) {
        this.parentid = parentid;
    }


    /**
     * Gets the projecttask_typeid value for this OaProjecttask.
     * 
     * @return projecttask_typeid
     */
    public java.lang.String getProjecttask_typeid() {
        return projecttask_typeid;
    }


    /**
     * Sets the projecttask_typeid value for this OaProjecttask.
     * 
     * @param projecttask_typeid
     */
    public void setProjecttask_typeid(java.lang.String projecttask_typeid) {
        this.projecttask_typeid = projecttask_typeid;
    }


    /**
     * Gets the calculated_finishes value for this OaProjecttask.
     * 
     * @return calculated_finishes
     */
    public java.lang.String getCalculated_finishes() {
        return calculated_finishes;
    }


    /**
     * Sets the calculated_finishes value for this OaProjecttask.
     * 
     * @param calculated_finishes
     */
    public void setCalculated_finishes(java.lang.String calculated_finishes) {
        this.calculated_finishes = calculated_finishes;
    }


    /**
     * Gets the predecessors_lag value for this OaProjecttask.
     * 
     * @return predecessors_lag
     */
    public java.lang.String getPredecessors_lag() {
        return predecessors_lag;
    }


    /**
     * Sets the predecessors_lag value for this OaProjecttask.
     * 
     * @param predecessors_lag
     */
    public void setPredecessors_lag(java.lang.String predecessors_lag) {
        this.predecessors_lag = predecessors_lag;
    }


    /**
     * Gets the currency value for this OaProjecttask.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaProjecttask.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the cost_centerid value for this OaProjecttask.
     * 
     * @return cost_centerid
     */
    public java.lang.String getCost_centerid() {
        return cost_centerid;
    }


    /**
     * Sets the cost_centerid value for this OaProjecttask.
     * 
     * @param cost_centerid
     */
    public void setCost_centerid(java.lang.String cost_centerid) {
        this.cost_centerid = cost_centerid;
    }


    /**
     * Gets the default_category_2 value for this OaProjecttask.
     * 
     * @return default_category_2
     */
    public java.lang.String getDefault_category_2() {
        return default_category_2;
    }


    /**
     * Sets the default_category_2 value for this OaProjecttask.
     * 
     * @param default_category_2
     */
    public void setDefault_category_2(java.lang.String default_category_2) {
        this.default_category_2 = default_category_2;
    }


    /**
     * Gets the calculated_starts value for this OaProjecttask.
     * 
     * @return calculated_starts
     */
    public java.lang.String getCalculated_starts() {
        return calculated_starts;
    }


    /**
     * Sets the calculated_starts value for this OaProjecttask.
     * 
     * @param calculated_starts
     */
    public void setCalculated_starts(java.lang.String calculated_starts) {
        this.calculated_starts = calculated_starts;
    }


    /**
     * Gets the estimated_hours value for this OaProjecttask.
     * 
     * @return estimated_hours
     */
    public java.lang.String getEstimated_hours() {
        return estimated_hours;
    }


    /**
     * Sets the estimated_hours value for this OaProjecttask.
     * 
     * @param estimated_hours
     */
    public void setEstimated_hours(java.lang.String estimated_hours) {
        this.estimated_hours = estimated_hours;
    }


    /**
     * Gets the default_category_3 value for this OaProjecttask.
     * 
     * @return default_category_3
     */
    public java.lang.String getDefault_category_3() {
        return default_category_3;
    }


    /**
     * Sets the default_category_3 value for this OaProjecttask.
     * 
     * @param default_category_3
     */
    public void setDefault_category_3(java.lang.String default_category_3) {
        this.default_category_3 = default_category_3;
    }


    /**
     * Gets the project_name value for this OaProjecttask.
     * 
     * @return project_name
     */
    public java.lang.String getProject_name() {
        return project_name;
    }


    /**
     * Sets the project_name value for this OaProjecttask.
     * 
     * @param project_name
     */
    public void setProject_name(java.lang.String project_name) {
        this.project_name = project_name;
    }


    /**
     * Gets the id_number value for this OaProjecttask.
     * 
     * @return id_number
     */
    public java.lang.String getId_number() {
        return id_number;
    }


    /**
     * Sets the id_number value for this OaProjecttask.
     * 
     * @param id_number
     */
    public void setId_number(java.lang.String id_number) {
        this.id_number = id_number;
    }


    /**
     * Gets the closed value for this OaProjecttask.
     * 
     * @return closed
     */
    public java.lang.String getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this OaProjecttask.
     * 
     * @param closed
     */
    public void setClosed(java.lang.String closed) {
        this.closed = closed;
    }


    /**
     * Gets the task_budget_revenue value for this OaProjecttask.
     * 
     * @return task_budget_revenue
     */
    public java.lang.String getTask_budget_revenue() {
        return task_budget_revenue;
    }


    /**
     * Sets the task_budget_revenue value for this OaProjecttask.
     * 
     * @param task_budget_revenue
     */
    public void setTask_budget_revenue(java.lang.String task_budget_revenue) {
        this.task_budget_revenue = task_budget_revenue;
    }


    /**
     * Gets the early_start value for this OaProjecttask.
     * 
     * @return early_start
     */
    public java.lang.String getEarly_start() {
        return early_start;
    }


    /**
     * Sets the early_start value for this OaProjecttask.
     * 
     * @param early_start
     */
    public void setEarly_start(java.lang.String early_start) {
        this.early_start = early_start;
    }


    /**
     * Gets the use_project_assignment value for this OaProjecttask.
     * 
     * @return use_project_assignment
     */
    public java.lang.String getUse_project_assignment() {
        return use_project_assignment;
    }


    /**
     * Sets the use_project_assignment value for this OaProjecttask.
     * 
     * @param use_project_assignment
     */
    public void setUse_project_assignment(java.lang.String use_project_assignment) {
        this.use_project_assignment = use_project_assignment;
    }


    /**
     * Gets the planned_hours value for this OaProjecttask.
     * 
     * @return planned_hours
     */
    public java.lang.String getPlanned_hours() {
        return planned_hours;
    }


    /**
     * Sets the planned_hours value for this OaProjecttask.
     * 
     * @param planned_hours
     */
    public void setPlanned_hours(java.lang.String planned_hours) {
        this.planned_hours = planned_hours;
    }


    /**
     * Gets the deleted value for this OaProjecttask.
     * 
     * @return deleted
     */
    public java.lang.String getDeleted() {
        return deleted;
    }


    /**
     * Sets the deleted value for this OaProjecttask.
     * 
     * @param deleted
     */
    public void setDeleted(java.lang.String deleted) {
        this.deleted = deleted;
    }


    /**
     * Gets the manual_task_budget value for this OaProjecttask.
     * 
     * @return manual_task_budget
     */
    public java.lang.String getManual_task_budget() {
        return manual_task_budget;
    }


    /**
     * Sets the manual_task_budget value for this OaProjecttask.
     * 
     * @param manual_task_budget
     */
    public void setManual_task_budget(java.lang.String manual_task_budget) {
        this.manual_task_budget = manual_task_budget;
    }


    /**
     * Gets the projectid value for this OaProjecttask.
     * 
     * @return projectid
     */
    public java.lang.String getProjectid() {
        return projectid;
    }


    /**
     * Sets the projectid value for this OaProjecttask.
     * 
     * @param projectid
     */
    public void setProjectid(java.lang.String projectid) {
        this.projectid = projectid;
    }


    /**
     * Gets the default_category_1 value for this OaProjecttask.
     * 
     * @return default_category_1
     */
    public java.lang.String getDefault_category_1() {
        return default_category_1;
    }


    /**
     * Sets the default_category_1 value for this OaProjecttask.
     * 
     * @param default_category_1
     */
    public void setDefault_category_1(java.lang.String default_category_1) {
        this.default_category_1 = default_category_1;
    }


    /**
     * Gets the created value for this OaProjecttask.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaProjecttask.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the starts value for this OaProjecttask.
     * 
     * @return starts
     */
    public java.lang.String getStarts() {
        return starts;
    }


    /**
     * Sets the starts value for this OaProjecttask.
     * 
     * @param starts
     */
    public void setStarts(java.lang.String starts) {
        this.starts = starts;
    }


    /**
     * Gets the assign_user_names value for this OaProjecttask.
     * 
     * @return assign_user_names
     */
    public java.lang.String getAssign_user_names() {
        return assign_user_names;
    }


    /**
     * Sets the assign_user_names value for this OaProjecttask.
     * 
     * @param assign_user_names
     */
    public void setAssign_user_names(java.lang.String assign_user_names) {
        this.assign_user_names = assign_user_names;
    }


    /**
     * Gets the fnlt_date value for this OaProjecttask.
     * 
     * @return fnlt_date
     */
    public java.lang.String getFnlt_date() {
        return fnlt_date;
    }


    /**
     * Sets the fnlt_date value for this OaProjecttask.
     * 
     * @param fnlt_date
     */
    public void setFnlt_date(java.lang.String fnlt_date) {
        this.fnlt_date = fnlt_date;
    }


    /**
     * Gets the predecessors_type value for this OaProjecttask.
     * 
     * @return predecessors_type
     */
    public java.lang.String getPredecessors_type() {
        return predecessors_type;
    }


    /**
     * Sets the predecessors_type value for this OaProjecttask.
     * 
     * @param predecessors_type
     */
    public void setPredecessors_type(java.lang.String predecessors_type) {
        this.predecessors_type = predecessors_type;
    }


    /**
     * Gets the notes value for this OaProjecttask.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OaProjecttask.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the default_category_5 value for this OaProjecttask.
     * 
     * @return default_category_5
     */
    public java.lang.String getDefault_category_5() {
        return default_category_5;
    }


    /**
     * Sets the default_category_5 value for this OaProjecttask.
     * 
     * @param default_category_5
     */
    public void setDefault_category_5(java.lang.String default_category_5) {
        this.default_category_5 = default_category_5;
    }


    /**
     * Gets the attributes value for this OaProjecttask.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaProjecttask.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaProjecttask)) return false;
        OaProjecttask other = (OaProjecttask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.percent_complete==null && other.getPercent_complete()==null) || 
             (this.percent_complete!=null &&
              this.percent_complete.equals(other.getPercent_complete()))) &&
            ((this.task_budget_cost==null && other.getTask_budget_cost()==null) || 
             (this.task_budget_cost!=null &&
              this.task_budget_cost.equals(other.getTask_budget_cost()))) &&
            ((this.is_a_phase==null && other.getIs_a_phase()==null) || 
             (this.is_a_phase!=null &&
              this.is_a_phase.equals(other.getIs_a_phase()))) &&
            ((this.early_finish==null && other.getEarly_finish()==null) || 
             (this.early_finish!=null &&
              this.early_finish.equals(other.getEarly_finish()))) &&
            ((this.updated==null && other.getUpdated()==null) || 
             (this.updated!=null &&
              this.updated.equals(other.getUpdated()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.seq==null && other.getSeq()==null) || 
             (this.seq!=null &&
              this.seq.equals(other.getSeq()))) &&
            ((this.default_category_4==null && other.getDefault_category_4()==null) || 
             (this.default_category_4!=null &&
              this.default_category_4.equals(other.getDefault_category_4()))) &&
            ((this.timetype_filter==null && other.getTimetype_filter()==null) || 
             (this.timetype_filter!=null &&
              this.timetype_filter.equals(other.getTimetype_filter()))) &&
            ((this.non_billable==null && other.getNon_billable()==null) || 
             (this.non_billable!=null &&
              this.non_billable.equals(other.getNon_billable()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.default_category==null && other.getDefault_category()==null) || 
             (this.default_category!=null &&
              this.default_category.equals(other.getDefault_category()))) &&
            ((this.all_can_assign==null && other.getAll_can_assign()==null) || 
             (this.all_can_assign!=null &&
              this.all_can_assign.equals(other.getAll_can_assign()))) &&
            ((this.customerid==null && other.getCustomerid()==null) || 
             (this.customerid!=null &&
              this.customerid.equals(other.getCustomerid()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              this.predecessors.equals(other.getPredecessors()))) &&
            ((this.customer_name==null && other.getCustomer_name()==null) || 
             (this.customer_name!=null &&
              this.customer_name.equals(other.getCustomer_name()))) &&
            ((this.parentid==null && other.getParentid()==null) || 
             (this.parentid!=null &&
              this.parentid.equals(other.getParentid()))) &&
            ((this.projecttask_typeid==null && other.getProjecttask_typeid()==null) || 
             (this.projecttask_typeid!=null &&
              this.projecttask_typeid.equals(other.getProjecttask_typeid()))) &&
            ((this.calculated_finishes==null && other.getCalculated_finishes()==null) || 
             (this.calculated_finishes!=null &&
              this.calculated_finishes.equals(other.getCalculated_finishes()))) &&
            ((this.predecessors_lag==null && other.getPredecessors_lag()==null) || 
             (this.predecessors_lag!=null &&
              this.predecessors_lag.equals(other.getPredecessors_lag()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.cost_centerid==null && other.getCost_centerid()==null) || 
             (this.cost_centerid!=null &&
              this.cost_centerid.equals(other.getCost_centerid()))) &&
            ((this.default_category_2==null && other.getDefault_category_2()==null) || 
             (this.default_category_2!=null &&
              this.default_category_2.equals(other.getDefault_category_2()))) &&
            ((this.calculated_starts==null && other.getCalculated_starts()==null) || 
             (this.calculated_starts!=null &&
              this.calculated_starts.equals(other.getCalculated_starts()))) &&
            ((this.estimated_hours==null && other.getEstimated_hours()==null) || 
             (this.estimated_hours!=null &&
              this.estimated_hours.equals(other.getEstimated_hours()))) &&
            ((this.default_category_3==null && other.getDefault_category_3()==null) || 
             (this.default_category_3!=null &&
              this.default_category_3.equals(other.getDefault_category_3()))) &&
            ((this.project_name==null && other.getProject_name()==null) || 
             (this.project_name!=null &&
              this.project_name.equals(other.getProject_name()))) &&
            ((this.id_number==null && other.getId_number()==null) || 
             (this.id_number!=null &&
              this.id_number.equals(other.getId_number()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.task_budget_revenue==null && other.getTask_budget_revenue()==null) || 
             (this.task_budget_revenue!=null &&
              this.task_budget_revenue.equals(other.getTask_budget_revenue()))) &&
            ((this.early_start==null && other.getEarly_start()==null) || 
             (this.early_start!=null &&
              this.early_start.equals(other.getEarly_start()))) &&
            ((this.use_project_assignment==null && other.getUse_project_assignment()==null) || 
             (this.use_project_assignment!=null &&
              this.use_project_assignment.equals(other.getUse_project_assignment()))) &&
            ((this.planned_hours==null && other.getPlanned_hours()==null) || 
             (this.planned_hours!=null &&
              this.planned_hours.equals(other.getPlanned_hours()))) &&
            ((this.deleted==null && other.getDeleted()==null) || 
             (this.deleted!=null &&
              this.deleted.equals(other.getDeleted()))) &&
            ((this.manual_task_budget==null && other.getManual_task_budget()==null) || 
             (this.manual_task_budget!=null &&
              this.manual_task_budget.equals(other.getManual_task_budget()))) &&
            ((this.projectid==null && other.getProjectid()==null) || 
             (this.projectid!=null &&
              this.projectid.equals(other.getProjectid()))) &&
            ((this.default_category_1==null && other.getDefault_category_1()==null) || 
             (this.default_category_1!=null &&
              this.default_category_1.equals(other.getDefault_category_1()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.starts==null && other.getStarts()==null) || 
             (this.starts!=null &&
              this.starts.equals(other.getStarts()))) &&
            ((this.assign_user_names==null && other.getAssign_user_names()==null) || 
             (this.assign_user_names!=null &&
              this.assign_user_names.equals(other.getAssign_user_names()))) &&
            ((this.fnlt_date==null && other.getFnlt_date()==null) || 
             (this.fnlt_date!=null &&
              this.fnlt_date.equals(other.getFnlt_date()))) &&
            ((this.predecessors_type==null && other.getPredecessors_type()==null) || 
             (this.predecessors_type!=null &&
              this.predecessors_type.equals(other.getPredecessors_type()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.default_category_5==null && other.getDefault_category_5()==null) || 
             (this.default_category_5!=null &&
              this.default_category_5.equals(other.getDefault_category_5()))) &&
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getPercent_complete() != null) {
            _hashCode += getPercent_complete().hashCode();
        }
        if (getTask_budget_cost() != null) {
            _hashCode += getTask_budget_cost().hashCode();
        }
        if (getIs_a_phase() != null) {
            _hashCode += getIs_a_phase().hashCode();
        }
        if (getEarly_finish() != null) {
            _hashCode += getEarly_finish().hashCode();
        }
        if (getUpdated() != null) {
            _hashCode += getUpdated().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getSeq() != null) {
            _hashCode += getSeq().hashCode();
        }
        if (getDefault_category_4() != null) {
            _hashCode += getDefault_category_4().hashCode();
        }
        if (getTimetype_filter() != null) {
            _hashCode += getTimetype_filter().hashCode();
        }
        if (getNon_billable() != null) {
            _hashCode += getNon_billable().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getDefault_category() != null) {
            _hashCode += getDefault_category().hashCode();
        }
        if (getAll_can_assign() != null) {
            _hashCode += getAll_can_assign().hashCode();
        }
        if (getCustomerid() != null) {
            _hashCode += getCustomerid().hashCode();
        }
        if (getPredecessors() != null) {
            _hashCode += getPredecessors().hashCode();
        }
        if (getCustomer_name() != null) {
            _hashCode += getCustomer_name().hashCode();
        }
        if (getParentid() != null) {
            _hashCode += getParentid().hashCode();
        }
        if (getProjecttask_typeid() != null) {
            _hashCode += getProjecttask_typeid().hashCode();
        }
        if (getCalculated_finishes() != null) {
            _hashCode += getCalculated_finishes().hashCode();
        }
        if (getPredecessors_lag() != null) {
            _hashCode += getPredecessors_lag().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCost_centerid() != null) {
            _hashCode += getCost_centerid().hashCode();
        }
        if (getDefault_category_2() != null) {
            _hashCode += getDefault_category_2().hashCode();
        }
        if (getCalculated_starts() != null) {
            _hashCode += getCalculated_starts().hashCode();
        }
        if (getEstimated_hours() != null) {
            _hashCode += getEstimated_hours().hashCode();
        }
        if (getDefault_category_3() != null) {
            _hashCode += getDefault_category_3().hashCode();
        }
        if (getProject_name() != null) {
            _hashCode += getProject_name().hashCode();
        }
        if (getId_number() != null) {
            _hashCode += getId_number().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getTask_budget_revenue() != null) {
            _hashCode += getTask_budget_revenue().hashCode();
        }
        if (getEarly_start() != null) {
            _hashCode += getEarly_start().hashCode();
        }
        if (getUse_project_assignment() != null) {
            _hashCode += getUse_project_assignment().hashCode();
        }
        if (getPlanned_hours() != null) {
            _hashCode += getPlanned_hours().hashCode();
        }
        if (getDeleted() != null) {
            _hashCode += getDeleted().hashCode();
        }
        if (getManual_task_budget() != null) {
            _hashCode += getManual_task_budget().hashCode();
        }
        if (getProjectid() != null) {
            _hashCode += getProjectid().hashCode();
        }
        if (getDefault_category_1() != null) {
            _hashCode += getDefault_category_1().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getStarts() != null) {
            _hashCode += getStarts().hashCode();
        }
        if (getAssign_user_names() != null) {
            _hashCode += getAssign_user_names().hashCode();
        }
        if (getFnlt_date() != null) {
            _hashCode += getFnlt_date().hashCode();
        }
        if (getPredecessors_type() != null) {
            _hashCode += getPredecessors_type().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getDefault_category_5() != null) {
            _hashCode += getDefault_category_5().hashCode();
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
        new org.apache.axis.description.TypeDesc(OaProjecttask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjecttask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
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
        elemField.setFieldName("task_budget_cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "task_budget_cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_a_phase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_a_phase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("early_finish");
        elemField.setXmlName(new javax.xml.namespace.QName("", "early_finish"));
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
        elemField.setFieldName("seq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_category_4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_category_4"));
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
        elemField.setFieldName("non_billable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "non_billable"));
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
        elemField.setFieldName("externalid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("all_can_assign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "all_can_assign"));
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
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "predecessors"));
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
        elemField.setFieldName("parentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentid"));
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
        elemField.setFieldName("calculated_finishes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calculated_finishes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors_lag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "predecessors_lag"));
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
        elemField.setFieldName("default_category_2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_category_2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculated_starts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calculated_starts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimated_hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estimated_hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("default_category_3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_category_3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("project_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id_number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id_number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("task_budget_revenue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "task_budget_revenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("early_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "early_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("use_project_assignment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "use_project_assignment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planned_hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planned_hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manual_task_budget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manual_task_budget"));
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
        elemField.setFieldName("default_category_1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_category_1"));
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
        elemField.setFieldName("starts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assign_user_names");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assign_user_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fnlt_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fnlt_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "predecessors_type"));
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
        elemField.setFieldName("default_category_5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "default_category_5"));
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
