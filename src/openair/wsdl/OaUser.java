/**
 * OaUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

import openair.objects.OpenAirDeserializer;

public class OaUser  extends openair.wsdl.OaBase  implements java.io.Serializable {
    private java.lang.String addr_mobile;

    private java.lang.String addr_contact_id;

    private java.lang.String tag_group_id;

    private java.lang.String addr_country;

    private java.lang.String po_approver;

    private java.lang.String rate;

    private java.lang.String br_approvalprocess;

    private java.lang.String password;

    private java.lang.String te_approver;

    private java.lang.String sr_approver;

    private java.lang.String departmentid;

    private java.lang.String cost_currency;

    private java.lang.String update_workschedule;

    private java.lang.String code;

    private java.lang.String timezone;

    private java.lang.String cost_end_date;

    private java.lang.String tb_filter_set;

    private java.lang.String addr_last;

    private java.lang.String name;

    private java.lang.String hierarchy_node_ids;

    private java.lang.String po_approvalprocess;

    private java.lang.String addr_fax;

    private java.lang.String rm_filter_set;

    private java.lang.String tag_start_date;

    private java.lang.String addr_city;

    private java.lang.String hint;

    private java.lang.String dr_approver;

    private java.lang.String br_approver;

    private java.lang.String az_approvalprocess;

    private java.lang.String pm_filter_set;

    private java.lang.String tag_group_attribute_id;

    private java.lang.String currency;

    private java.lang.String cost_centerid;

    private java.lang.String project_access_nodes;

    private java.lang.String addr_zip;

    private java.lang.String rm_approver;

    private java.lang.String locked;

    private java.lang.String update_tag;

    private java.lang.String password_forced_change;

    private java.lang.String filterset_stamp;

    private java.lang.String addr_addr1;

    private java.lang.String job_codeid;

    private java.lang.String payroll_code;

    private java.lang.String addr_middle;

    private java.lang.String tag_end_date;

    private java.lang.String report_filter_set;

    private java.lang.String addr_addr2;

    private java.lang.String km_filter_set;

    private java.lang.String is_user_schedule;

    private java.lang.String update_cost;

    private java.lang.String az_approver;

    private java.lang.String addr_addr4;

    private java.lang.String rm_approvalprocess;

    private java.lang.String picklist_label;

    private java.lang.String cost_lc_level;

    private java.lang.String role_id;

    private java.lang.String dr_approvalprocess;

    private java.lang.String workschedule_workhours;

    private java.lang.String ta_approvalprocess;

    private java.lang.String te_approvalprocess;

    private java.lang.String book_assign_stamp;

    private java.lang.String updated;

    private java.lang.String id;

    private java.lang.String filterset_ids;

    private java.lang.String addr_first;

    private java.lang.String cost;

    private java.lang.String addr_addr3;

    private java.lang.String workschedule_workdays;

    private java.lang.String active;

    private java.lang.String externalid;

    private java.lang.String addr_salutation;

    private java.lang.String ta_approver;

    private java.lang.String generic;

    private java.lang.String pr_approver;

    private java.lang.String pb_approvalprocess;

    private java.lang.String external_id;

    private java.lang.String type;

    private java.lang.String workscheduleid;

    private java.lang.String po_filter_set;

    private java.lang.String addr_state;

    private java.lang.String primary_filter_set;

    private java.lang.String te_allowance_approvalprocess;

    private java.lang.String user_locationid;

    private java.lang.String addr_phone;

    private java.lang.String account_workscheduleid;

    private java.lang.String om_filter_set;

    private java.lang.String ssn;

    private java.lang.String acct_code;

    private java.lang.String ma_filter_set;

    private java.lang.String te_filter_set;

    private java.lang.String sr_approvalprocess;

    private java.lang.String te_allowance_approver;

    private java.lang.String addr_email;

    private java.lang.String cost_start_date;

    private java.lang.String pb_approver;

    private java.lang.String nickname;

    private java.lang.String logintime;

    private java.lang.String pr_approvalprocess;

    private java.lang.String line_managerid;

    private java.lang.String week_starts;

    private java.lang.String created;

    private java.lang.String ta_filter_set;

    private java.lang.String addr_id;

    private openair.wsdl.OaBase[] flags;

    private openair.wsdl.OaBase[] attributes;

    public OaUser() {
    }

    public OaUser(
           java.lang.String addr_mobile,
           java.lang.String addr_contact_id,
           java.lang.String tag_group_id,
           java.lang.String addr_country,
           java.lang.String po_approver,
           java.lang.String rate,
           java.lang.String br_approvalprocess,
           java.lang.String password,
           java.lang.String te_approver,
           java.lang.String sr_approver,
           java.lang.String departmentid,
           java.lang.String cost_currency,
           java.lang.String update_workschedule,
           java.lang.String code,
           java.lang.String timezone,
           java.lang.String cost_end_date,
           java.lang.String tb_filter_set,
           java.lang.String addr_last,
           java.lang.String name,
           java.lang.String hierarchy_node_ids,
           java.lang.String po_approvalprocess,
           java.lang.String addr_fax,
           java.lang.String rm_filter_set,
           java.lang.String tag_start_date,
           java.lang.String addr_city,
           java.lang.String hint,
           java.lang.String dr_approver,
           java.lang.String br_approver,
           java.lang.String az_approvalprocess,
           java.lang.String pm_filter_set,
           java.lang.String tag_group_attribute_id,
           java.lang.String currency,
           java.lang.String cost_centerid,
           java.lang.String project_access_nodes,
           java.lang.String addr_zip,
           java.lang.String rm_approver,
           java.lang.String locked,
           java.lang.String update_tag,
           java.lang.String password_forced_change,
           java.lang.String filterset_stamp,
           java.lang.String addr_addr1,
           java.lang.String job_codeid,
           java.lang.String payroll_code,
           java.lang.String addr_middle,
           java.lang.String tag_end_date,
           java.lang.String report_filter_set,
           java.lang.String addr_addr2,
           java.lang.String km_filter_set,
           java.lang.String is_user_schedule,
           java.lang.String update_cost,
           java.lang.String az_approver,
           java.lang.String addr_addr4,
           java.lang.String rm_approvalprocess,
           java.lang.String picklist_label,
           java.lang.String cost_lc_level,
           java.lang.String role_id,
           java.lang.String dr_approvalprocess,
           java.lang.String workschedule_workhours,
           java.lang.String ta_approvalprocess,
           java.lang.String te_approvalprocess,
           java.lang.String book_assign_stamp,
           java.lang.String updated,
           java.lang.String id,
           java.lang.String filterset_ids,
           java.lang.String addr_first,
           java.lang.String cost,
           java.lang.String addr_addr3,
           java.lang.String workschedule_workdays,
           java.lang.String active,
           java.lang.String externalid,
           java.lang.String addr_salutation,
           java.lang.String ta_approver,
           java.lang.String generic,
           java.lang.String pr_approver,
           java.lang.String pb_approvalprocess,
           java.lang.String external_id,
           java.lang.String type,
           java.lang.String workscheduleid,
           java.lang.String po_filter_set,
           java.lang.String addr_state,
           java.lang.String primary_filter_set,
           java.lang.String te_allowance_approvalprocess,
           java.lang.String user_locationid,
           java.lang.String addr_phone,
           java.lang.String account_workscheduleid,
           java.lang.String om_filter_set,
           java.lang.String ssn,
           java.lang.String acct_code,
           java.lang.String ma_filter_set,
           java.lang.String te_filter_set,
           java.lang.String sr_approvalprocess,
           java.lang.String te_allowance_approver,
           java.lang.String addr_email,
           java.lang.String cost_start_date,
           java.lang.String pb_approver,
           java.lang.String nickname,
           java.lang.String logintime,
           java.lang.String pr_approvalprocess,
           java.lang.String line_managerid,
           java.lang.String week_starts,
           java.lang.String created,
           java.lang.String ta_filter_set,
           java.lang.String addr_id,
           openair.wsdl.OaBase[] flags,
           openair.wsdl.OaBase[] attributes) {
        this.addr_mobile = addr_mobile;
        this.addr_contact_id = addr_contact_id;
        this.tag_group_id = tag_group_id;
        this.addr_country = addr_country;
        this.po_approver = po_approver;
        this.rate = rate;
        this.br_approvalprocess = br_approvalprocess;
        this.password = password;
        this.te_approver = te_approver;
        this.sr_approver = sr_approver;
        this.departmentid = departmentid;
        this.cost_currency = cost_currency;
        this.update_workschedule = update_workschedule;
        this.code = code;
        this.timezone = timezone;
        this.cost_end_date = cost_end_date;
        this.tb_filter_set = tb_filter_set;
        this.addr_last = addr_last;
        this.name = name;
        this.hierarchy_node_ids = hierarchy_node_ids;
        this.po_approvalprocess = po_approvalprocess;
        this.addr_fax = addr_fax;
        this.rm_filter_set = rm_filter_set;
        this.tag_start_date = tag_start_date;
        this.addr_city = addr_city;
        this.hint = hint;
        this.dr_approver = dr_approver;
        this.br_approver = br_approver;
        this.az_approvalprocess = az_approvalprocess;
        this.pm_filter_set = pm_filter_set;
        this.tag_group_attribute_id = tag_group_attribute_id;
        this.currency = currency;
        this.cost_centerid = cost_centerid;
        this.project_access_nodes = project_access_nodes;
        this.addr_zip = addr_zip;
        this.rm_approver = rm_approver;
        this.locked = locked;
        this.update_tag = update_tag;
        this.password_forced_change = password_forced_change;
        this.filterset_stamp = filterset_stamp;
        this.addr_addr1 = addr_addr1;
        this.job_codeid = job_codeid;
        this.payroll_code = payroll_code;
        this.addr_middle = addr_middle;
        this.tag_end_date = tag_end_date;
        this.report_filter_set = report_filter_set;
        this.addr_addr2 = addr_addr2;
        this.km_filter_set = km_filter_set;
        this.is_user_schedule = is_user_schedule;
        this.update_cost = update_cost;
        this.az_approver = az_approver;
        this.addr_addr4 = addr_addr4;
        this.rm_approvalprocess = rm_approvalprocess;
        this.picklist_label = picklist_label;
        this.cost_lc_level = cost_lc_level;
        this.role_id = role_id;
        this.dr_approvalprocess = dr_approvalprocess;
        this.workschedule_workhours = workschedule_workhours;
        this.ta_approvalprocess = ta_approvalprocess;
        this.te_approvalprocess = te_approvalprocess;
        this.book_assign_stamp = book_assign_stamp;
        this.updated = updated;
        this.id = id;
        this.filterset_ids = filterset_ids;
        this.addr_first = addr_first;
        this.cost = cost;
        this.addr_addr3 = addr_addr3;
        this.workschedule_workdays = workschedule_workdays;
        this.active = active;
        this.externalid = externalid;
        this.addr_salutation = addr_salutation;
        this.ta_approver = ta_approver;
        this.generic = generic;
        this.pr_approver = pr_approver;
        this.pb_approvalprocess = pb_approvalprocess;
        this.external_id = external_id;
        this.type = type;
        this.workscheduleid = workscheduleid;
        this.po_filter_set = po_filter_set;
        this.addr_state = addr_state;
        this.primary_filter_set = primary_filter_set;
        this.te_allowance_approvalprocess = te_allowance_approvalprocess;
        this.user_locationid = user_locationid;
        this.addr_phone = addr_phone;
        this.account_workscheduleid = account_workscheduleid;
        this.om_filter_set = om_filter_set;
        this.ssn = ssn;
        this.acct_code = acct_code;
        this.ma_filter_set = ma_filter_set;
        this.te_filter_set = te_filter_set;
        this.sr_approvalprocess = sr_approvalprocess;
        this.te_allowance_approver = te_allowance_approver;
        this.addr_email = addr_email;
        this.cost_start_date = cost_start_date;
        this.pb_approver = pb_approver;
        this.nickname = nickname;
        this.logintime = logintime;
        this.pr_approvalprocess = pr_approvalprocess;
        this.line_managerid = line_managerid;
        this.week_starts = week_starts;
        this.created = created;
        this.ta_filter_set = ta_filter_set;
        this.addr_id = addr_id;
        this.flags = flags;
        this.attributes = attributes;
    }


    /**
     * Gets the addr_mobile value for this OaUser.
     * 
     * @return addr_mobile
     */
    public java.lang.String getAddr_mobile() {
        return addr_mobile;
    }


    /**
     * Sets the addr_mobile value for this OaUser.
     * 
     * @param addr_mobile
     */
    public void setAddr_mobile(java.lang.String addr_mobile) {
        this.addr_mobile = addr_mobile;
    }


    /**
     * Gets the addr_contact_id value for this OaUser.
     * 
     * @return addr_contact_id
     */
    public java.lang.String getAddr_contact_id() {
        return addr_contact_id;
    }


    /**
     * Sets the addr_contact_id value for this OaUser.
     * 
     * @param addr_contact_id
     */
    public void setAddr_contact_id(java.lang.String addr_contact_id) {
        this.addr_contact_id = addr_contact_id;
    }


    /**
     * Gets the tag_group_id value for this OaUser.
     * 
     * @return tag_group_id
     */
    public java.lang.String getTag_group_id() {
        return tag_group_id;
    }


    /**
     * Sets the tag_group_id value for this OaUser.
     * 
     * @param tag_group_id
     */
    public void setTag_group_id(java.lang.String tag_group_id) {
        this.tag_group_id = tag_group_id;
    }


    /**
     * Gets the addr_country value for this OaUser.
     * 
     * @return addr_country
     */
    public java.lang.String getAddr_country() {
        return addr_country;
    }


    /**
     * Sets the addr_country value for this OaUser.
     * 
     * @param addr_country
     */
    public void setAddr_country(java.lang.String addr_country) {
        this.addr_country = addr_country;
    }


    /**
     * Gets the po_approver value for this OaUser.
     * 
     * @return po_approver
     */
    public java.lang.String getPo_approver() {
        return po_approver;
    }


    /**
     * Sets the po_approver value for this OaUser.
     * 
     * @param po_approver
     */
    public void setPo_approver(java.lang.String po_approver) {
        this.po_approver = po_approver;
    }


    /**
     * Gets the rate value for this OaUser.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this OaUser.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the br_approvalprocess value for this OaUser.
     * 
     * @return br_approvalprocess
     */
    public java.lang.String getBr_approvalprocess() {
        return br_approvalprocess;
    }


    /**
     * Sets the br_approvalprocess value for this OaUser.
     * 
     * @param br_approvalprocess
     */
    public void setBr_approvalprocess(java.lang.String br_approvalprocess) {
        this.br_approvalprocess = br_approvalprocess;
    }


    /**
     * Gets the password value for this OaUser.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this OaUser.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the te_approver value for this OaUser.
     * 
     * @return te_approver
     */
    public java.lang.String getTe_approver() {
        return te_approver;
    }


    /**
     * Sets the te_approver value for this OaUser.
     * 
     * @param te_approver
     */
    public void setTe_approver(java.lang.String te_approver) {
        this.te_approver = te_approver;
    }


    /**
     * Gets the sr_approver value for this OaUser.
     * 
     * @return sr_approver
     */
    public java.lang.String getSr_approver() {
        return sr_approver;
    }


    /**
     * Sets the sr_approver value for this OaUser.
     * 
     * @param sr_approver
     */
    public void setSr_approver(java.lang.String sr_approver) {
        this.sr_approver = sr_approver;
    }


    /**
     * Gets the departmentid value for this OaUser.
     * 
     * @return departmentid
     */
    public java.lang.String getDepartmentid() {
        return departmentid;
    }


    /**
     * Sets the departmentid value for this OaUser.
     * 
     * @param departmentid
     */
    public void setDepartmentid(java.lang.String departmentid) {
        this.departmentid = departmentid;
    }


    /**
     * Gets the cost_currency value for this OaUser.
     * 
     * @return cost_currency
     */
    public java.lang.String getCost_currency() {
        return cost_currency;
    }


    /**
     * Sets the cost_currency value for this OaUser.
     * 
     * @param cost_currency
     */
    public void setCost_currency(java.lang.String cost_currency) {
        this.cost_currency = cost_currency;
    }


    /**
     * Gets the update_workschedule value for this OaUser.
     * 
     * @return update_workschedule
     */
    public java.lang.String getUpdate_workschedule() {
        return update_workschedule;
    }


    /**
     * Sets the update_workschedule value for this OaUser.
     * 
     * @param update_workschedule
     */
    public void setUpdate_workschedule(java.lang.String update_workschedule) {
        this.update_workschedule = update_workschedule;
    }


    /**
     * Gets the code value for this OaUser.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this OaUser.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the timezone value for this OaUser.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this OaUser.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the cost_end_date value for this OaUser.
     * 
     * @return cost_end_date
     */
    public java.lang.String getCost_end_date() {
        return cost_end_date;
    }


    /**
     * Sets the cost_end_date value for this OaUser.
     * 
     * @param cost_end_date
     */
    public void setCost_end_date(java.lang.String cost_end_date) {
        this.cost_end_date = cost_end_date;
    }


    /**
     * Gets the tb_filter_set value for this OaUser.
     * 
     * @return tb_filter_set
     */
    public java.lang.String getTb_filter_set() {
        return tb_filter_set;
    }


    /**
     * Sets the tb_filter_set value for this OaUser.
     * 
     * @param tb_filter_set
     */
    public void setTb_filter_set(java.lang.String tb_filter_set) {
        this.tb_filter_set = tb_filter_set;
    }


    /**
     * Gets the addr_last value for this OaUser.
     * 
     * @return addr_last
     */
    public java.lang.String getAddr_last() {
        return addr_last;
    }


    /**
     * Sets the addr_last value for this OaUser.
     * 
     * @param addr_last
     */
    public void setAddr_last(java.lang.String addr_last) {
        this.addr_last = addr_last;
    }


    /**
     * Gets the name value for this OaUser.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OaUser.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hierarchy_node_ids value for this OaUser.
     * 
     * @return hierarchy_node_ids
     */
    public java.lang.String getHierarchy_node_ids() {
        return hierarchy_node_ids;
    }


    /**
     * Sets the hierarchy_node_ids value for this OaUser.
     * 
     * @param hierarchy_node_ids
     */
    public void setHierarchy_node_ids(java.lang.String hierarchy_node_ids) {
        this.hierarchy_node_ids = hierarchy_node_ids;
    }


    /**
     * Gets the po_approvalprocess value for this OaUser.
     * 
     * @return po_approvalprocess
     */
    public java.lang.String getPo_approvalprocess() {
        return po_approvalprocess;
    }


    /**
     * Sets the po_approvalprocess value for this OaUser.
     * 
     * @param po_approvalprocess
     */
    public void setPo_approvalprocess(java.lang.String po_approvalprocess) {
        this.po_approvalprocess = po_approvalprocess;
    }


    /**
     * Gets the addr_fax value for this OaUser.
     * 
     * @return addr_fax
     */
    public java.lang.String getAddr_fax() {
        return addr_fax;
    }


    /**
     * Sets the addr_fax value for this OaUser.
     * 
     * @param addr_fax
     */
    public void setAddr_fax(java.lang.String addr_fax) {
        this.addr_fax = addr_fax;
    }


    /**
     * Gets the rm_filter_set value for this OaUser.
     * 
     * @return rm_filter_set
     */
    public java.lang.String getRm_filter_set() {
        return rm_filter_set;
    }


    /**
     * Sets the rm_filter_set value for this OaUser.
     * 
     * @param rm_filter_set
     */
    public void setRm_filter_set(java.lang.String rm_filter_set) {
        this.rm_filter_set = rm_filter_set;
    }


    /**
     * Gets the tag_start_date value for this OaUser.
     * 
     * @return tag_start_date
     */
    public java.lang.String getTag_start_date() {
        return tag_start_date;
    }


    /**
     * Sets the tag_start_date value for this OaUser.
     * 
     * @param tag_start_date
     */
    public void setTag_start_date(java.lang.String tag_start_date) {
        this.tag_start_date = tag_start_date;
    }


    /**
     * Gets the addr_city value for this OaUser.
     * 
     * @return addr_city
     */
    public java.lang.String getAddr_city() {
        return addr_city;
    }


    /**
     * Sets the addr_city value for this OaUser.
     * 
     * @param addr_city
     */
    public void setAddr_city(java.lang.String addr_city) {
        this.addr_city = addr_city;
    }


    /**
     * Gets the hint value for this OaUser.
     * 
     * @return hint
     */
    public java.lang.String getHint() {
        return hint;
    }


    /**
     * Sets the hint value for this OaUser.
     * 
     * @param hint
     */
    public void setHint(java.lang.String hint) {
        this.hint = hint;
    }


    /**
     * Gets the dr_approver value for this OaUser.
     * 
     * @return dr_approver
     */
    public java.lang.String getDr_approver() {
        return dr_approver;
    }


    /**
     * Sets the dr_approver value for this OaUser.
     * 
     * @param dr_approver
     */
    public void setDr_approver(java.lang.String dr_approver) {
        this.dr_approver = dr_approver;
    }


    /**
     * Gets the br_approver value for this OaUser.
     * 
     * @return br_approver
     */
    public java.lang.String getBr_approver() {
        return br_approver;
    }


    /**
     * Sets the br_approver value for this OaUser.
     * 
     * @param br_approver
     */
    public void setBr_approver(java.lang.String br_approver) {
        this.br_approver = br_approver;
    }


    /**
     * Gets the az_approvalprocess value for this OaUser.
     * 
     * @return az_approvalprocess
     */
    public java.lang.String getAz_approvalprocess() {
        return az_approvalprocess;
    }


    /**
     * Sets the az_approvalprocess value for this OaUser.
     * 
     * @param az_approvalprocess
     */
    public void setAz_approvalprocess(java.lang.String az_approvalprocess) {
        this.az_approvalprocess = az_approvalprocess;
    }


    /**
     * Gets the pm_filter_set value for this OaUser.
     * 
     * @return pm_filter_set
     */
    public java.lang.String getPm_filter_set() {
        return pm_filter_set;
    }


    /**
     * Sets the pm_filter_set value for this OaUser.
     * 
     * @param pm_filter_set
     */
    public void setPm_filter_set(java.lang.String pm_filter_set) {
        this.pm_filter_set = pm_filter_set;
    }


    /**
     * Gets the tag_group_attribute_id value for this OaUser.
     * 
     * @return tag_group_attribute_id
     */
    public java.lang.String getTag_group_attribute_id() {
        return tag_group_attribute_id;
    }


    /**
     * Sets the tag_group_attribute_id value for this OaUser.
     * 
     * @param tag_group_attribute_id
     */
    public void setTag_group_attribute_id(java.lang.String tag_group_attribute_id) {
        this.tag_group_attribute_id = tag_group_attribute_id;
    }


    /**
     * Gets the currency value for this OaUser.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OaUser.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the cost_centerid value for this OaUser.
     * 
     * @return cost_centerid
     */
    public java.lang.String getCost_centerid() {
        return cost_centerid;
    }


    /**
     * Sets the cost_centerid value for this OaUser.
     * 
     * @param cost_centerid
     */
    public void setCost_centerid(java.lang.String cost_centerid) {
        this.cost_centerid = cost_centerid;
    }


    /**
     * Gets the project_access_nodes value for this OaUser.
     * 
     * @return project_access_nodes
     */
    public java.lang.String getProject_access_nodes() {
        return project_access_nodes;
    }


    /**
     * Sets the project_access_nodes value for this OaUser.
     * 
     * @param project_access_nodes
     */
    public void setProject_access_nodes(java.lang.String project_access_nodes) {
        this.project_access_nodes = project_access_nodes;
    }


    /**
     * Gets the addr_zip value for this OaUser.
     * 
     * @return addr_zip
     */
    public java.lang.String getAddr_zip() {
        return addr_zip;
    }


    /**
     * Sets the addr_zip value for this OaUser.
     * 
     * @param addr_zip
     */
    public void setAddr_zip(java.lang.String addr_zip) {
        this.addr_zip = addr_zip;
    }


    /**
     * Gets the rm_approver value for this OaUser.
     * 
     * @return rm_approver
     */
    public java.lang.String getRm_approver() {
        return rm_approver;
    }


    /**
     * Sets the rm_approver value for this OaUser.
     * 
     * @param rm_approver
     */
    public void setRm_approver(java.lang.String rm_approver) {
        this.rm_approver = rm_approver;
    }


    /**
     * Gets the locked value for this OaUser.
     * 
     * @return locked
     */
    public java.lang.String getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this OaUser.
     * 
     * @param locked
     */
    public void setLocked(java.lang.String locked) {
        this.locked = locked;
    }


    /**
     * Gets the update_tag value for this OaUser.
     * 
     * @return update_tag
     */
    public java.lang.String getUpdate_tag() {
        return update_tag;
    }


    /**
     * Sets the update_tag value for this OaUser.
     * 
     * @param update_tag
     */
    public void setUpdate_tag(java.lang.String update_tag) {
        this.update_tag = update_tag;
    }


    /**
     * Gets the password_forced_change value for this OaUser.
     * 
     * @return password_forced_change
     */
    public java.lang.String getPassword_forced_change() {
        return password_forced_change;
    }


    /**
     * Sets the password_forced_change value for this OaUser.
     * 
     * @param password_forced_change
     */
    public void setPassword_forced_change(java.lang.String password_forced_change) {
        this.password_forced_change = password_forced_change;
    }


    /**
     * Gets the filterset_stamp value for this OaUser.
     * 
     * @return filterset_stamp
     */
    public java.lang.String getFilterset_stamp() {
        return filterset_stamp;
    }


    /**
     * Sets the filterset_stamp value for this OaUser.
     * 
     * @param filterset_stamp
     */
    public void setFilterset_stamp(java.lang.String filterset_stamp) {
        this.filterset_stamp = filterset_stamp;
    }


    /**
     * Gets the addr_addr1 value for this OaUser.
     * 
     * @return addr_addr1
     */
    public java.lang.String getAddr_addr1() {
        return addr_addr1;
    }


    /**
     * Sets the addr_addr1 value for this OaUser.
     * 
     * @param addr_addr1
     */
    public void setAddr_addr1(java.lang.String addr_addr1) {
        this.addr_addr1 = addr_addr1;
    }


    /**
     * Gets the job_codeid value for this OaUser.
     * 
     * @return job_codeid
     */
    public java.lang.String getJob_codeid() {
        return job_codeid;
    }


    /**
     * Sets the job_codeid value for this OaUser.
     * 
     * @param job_codeid
     */
    public void setJob_codeid(java.lang.String job_codeid) {
        this.job_codeid = job_codeid;
    }


    /**
     * Gets the payroll_code value for this OaUser.
     * 
     * @return payroll_code
     */
    public java.lang.String getPayroll_code() {
        return payroll_code;
    }


    /**
     * Sets the payroll_code value for this OaUser.
     * 
     * @param payroll_code
     */
    public void setPayroll_code(java.lang.String payroll_code) {
        this.payroll_code = payroll_code;
    }


    /**
     * Gets the addr_middle value for this OaUser.
     * 
     * @return addr_middle
     */
    public java.lang.String getAddr_middle() {
        return addr_middle;
    }


    /**
     * Sets the addr_middle value for this OaUser.
     * 
     * @param addr_middle
     */
    public void setAddr_middle(java.lang.String addr_middle) {
        this.addr_middle = addr_middle;
    }


    /**
     * Gets the tag_end_date value for this OaUser.
     * 
     * @return tag_end_date
     */
    public java.lang.String getTag_end_date() {
        return tag_end_date;
    }


    /**
     * Sets the tag_end_date value for this OaUser.
     * 
     * @param tag_end_date
     */
    public void setTag_end_date(java.lang.String tag_end_date) {
        this.tag_end_date = tag_end_date;
    }


    /**
     * Gets the report_filter_set value for this OaUser.
     * 
     * @return report_filter_set
     */
    public java.lang.String getReport_filter_set() {
        return report_filter_set;
    }


    /**
     * Sets the report_filter_set value for this OaUser.
     * 
     * @param report_filter_set
     */
    public void setReport_filter_set(java.lang.String report_filter_set) {
        this.report_filter_set = report_filter_set;
    }


    /**
     * Gets the addr_addr2 value for this OaUser.
     * 
     * @return addr_addr2
     */
    public java.lang.String getAddr_addr2() {
        return addr_addr2;
    }


    /**
     * Sets the addr_addr2 value for this OaUser.
     * 
     * @param addr_addr2
     */
    public void setAddr_addr2(java.lang.String addr_addr2) {
        this.addr_addr2 = addr_addr2;
    }


    /**
     * Gets the km_filter_set value for this OaUser.
     * 
     * @return km_filter_set
     */
    public java.lang.String getKm_filter_set() {
        return km_filter_set;
    }


    /**
     * Sets the km_filter_set value for this OaUser.
     * 
     * @param km_filter_set
     */
    public void setKm_filter_set(java.lang.String km_filter_set) {
        this.km_filter_set = km_filter_set;
    }


    /**
     * Gets the is_user_schedule value for this OaUser.
     * 
     * @return is_user_schedule
     */
    public java.lang.String getIs_user_schedule() {
        return is_user_schedule;
    }


    /**
     * Sets the is_user_schedule value for this OaUser.
     * 
     * @param is_user_schedule
     */
    public void setIs_user_schedule(java.lang.String is_user_schedule) {
        this.is_user_schedule = is_user_schedule;
    }


    /**
     * Gets the update_cost value for this OaUser.
     * 
     * @return update_cost
     */
    public java.lang.String getUpdate_cost() {
        return update_cost;
    }


    /**
     * Sets the update_cost value for this OaUser.
     * 
     * @param update_cost
     */
    public void setUpdate_cost(java.lang.String update_cost) {
        this.update_cost = update_cost;
    }


    /**
     * Gets the az_approver value for this OaUser.
     * 
     * @return az_approver
     */
    public java.lang.String getAz_approver() {
        return az_approver;
    }


    /**
     * Sets the az_approver value for this OaUser.
     * 
     * @param az_approver
     */
    public void setAz_approver(java.lang.String az_approver) {
        this.az_approver = az_approver;
    }


    /**
     * Gets the addr_addr4 value for this OaUser.
     * 
     * @return addr_addr4
     */
    public java.lang.String getAddr_addr4() {
        return addr_addr4;
    }


    /**
     * Sets the addr_addr4 value for this OaUser.
     * 
     * @param addr_addr4
     */
    public void setAddr_addr4(java.lang.String addr_addr4) {
        this.addr_addr4 = addr_addr4;
    }


    /**
     * Gets the rm_approvalprocess value for this OaUser.
     * 
     * @return rm_approvalprocess
     */
    public java.lang.String getRm_approvalprocess() {
        return rm_approvalprocess;
    }


    /**
     * Sets the rm_approvalprocess value for this OaUser.
     * 
     * @param rm_approvalprocess
     */
    public void setRm_approvalprocess(java.lang.String rm_approvalprocess) {
        this.rm_approvalprocess = rm_approvalprocess;
    }


    /**
     * Gets the picklist_label value for this OaUser.
     * 
     * @return picklist_label
     */
    public java.lang.String getPicklist_label() {
        return picklist_label;
    }


    /**
     * Sets the picklist_label value for this OaUser.
     * 
     * @param picklist_label
     */
    public void setPicklist_label(java.lang.String picklist_label) {
        this.picklist_label = picklist_label;
    }


    /**
     * Gets the cost_lc_level value for this OaUser.
     * 
     * @return cost_lc_level
     */
    public java.lang.String getCost_lc_level() {
        return cost_lc_level;
    }


    /**
     * Sets the cost_lc_level value for this OaUser.
     * 
     * @param cost_lc_level
     */
    public void setCost_lc_level(java.lang.String cost_lc_level) {
        this.cost_lc_level = cost_lc_level;
    }


    /**
     * Gets the role_id value for this OaUser.
     * 
     * @return role_id
     */
    public java.lang.String getRole_id() {
        return role_id;
    }


    /**
     * Sets the role_id value for this OaUser.
     * 
     * @param role_id
     */
    public void setRole_id(java.lang.String role_id) {
        this.role_id = role_id;
    }


    /**
     * Gets the dr_approvalprocess value for this OaUser.
     * 
     * @return dr_approvalprocess
     */
    public java.lang.String getDr_approvalprocess() {
        return dr_approvalprocess;
    }


    /**
     * Sets the dr_approvalprocess value for this OaUser.
     * 
     * @param dr_approvalprocess
     */
    public void setDr_approvalprocess(java.lang.String dr_approvalprocess) {
        this.dr_approvalprocess = dr_approvalprocess;
    }


    /**
     * Gets the workschedule_workhours value for this OaUser.
     * 
     * @return workschedule_workhours
     */
    public java.lang.String getWorkschedule_workhours() {
        return workschedule_workhours;
    }


    /**
     * Sets the workschedule_workhours value for this OaUser.
     * 
     * @param workschedule_workhours
     */
    public void setWorkschedule_workhours(java.lang.String workschedule_workhours) {
        this.workschedule_workhours = workschedule_workhours;
    }


    /**
     * Gets the ta_approvalprocess value for this OaUser.
     * 
     * @return ta_approvalprocess
     */
    public java.lang.String getTa_approvalprocess() {
        return ta_approvalprocess;
    }


    /**
     * Sets the ta_approvalprocess value for this OaUser.
     * 
     * @param ta_approvalprocess
     */
    public void setTa_approvalprocess(java.lang.String ta_approvalprocess) {
        this.ta_approvalprocess = ta_approvalprocess;
    }


    /**
     * Gets the te_approvalprocess value for this OaUser.
     * 
     * @return te_approvalprocess
     */
    public java.lang.String getTe_approvalprocess() {
        return te_approvalprocess;
    }


    /**
     * Sets the te_approvalprocess value for this OaUser.
     * 
     * @param te_approvalprocess
     */
    public void setTe_approvalprocess(java.lang.String te_approvalprocess) {
        this.te_approvalprocess = te_approvalprocess;
    }


    /**
     * Gets the book_assign_stamp value for this OaUser.
     * 
     * @return book_assign_stamp
     */
    public java.lang.String getBook_assign_stamp() {
        return book_assign_stamp;
    }


    /**
     * Sets the book_assign_stamp value for this OaUser.
     * 
     * @param book_assign_stamp
     */
    public void setBook_assign_stamp(java.lang.String book_assign_stamp) {
        this.book_assign_stamp = book_assign_stamp;
    }


    /**
     * Gets the updated value for this OaUser.
     * 
     * @return updated
     */
    public java.lang.String getUpdated() {
        return updated;
    }


    /**
     * Sets the updated value for this OaUser.
     * 
     * @param updated
     */
    public void setUpdated(java.lang.String updated) {
        this.updated = updated;
    }


    /**
     * Gets the id value for this OaUser.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OaUser.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the filterset_ids value for this OaUser.
     * 
     * @return filterset_ids
     */
    public java.lang.String getFilterset_ids() {
        return filterset_ids;
    }


    /**
     * Sets the filterset_ids value for this OaUser.
     * 
     * @param filterset_ids
     */
    public void setFilterset_ids(java.lang.String filterset_ids) {
        this.filterset_ids = filterset_ids;
    }


    /**
     * Gets the addr_first value for this OaUser.
     * 
     * @return addr_first
     */
    public java.lang.String getAddr_first() {
        return addr_first;
    }


    /**
     * Sets the addr_first value for this OaUser.
     * 
     * @param addr_first
     */
    public void setAddr_first(java.lang.String addr_first) {
        this.addr_first = addr_first;
    }


    /**
     * Gets the cost value for this OaUser.
     * 
     * @return cost
     */
    public java.lang.String getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this OaUser.
     * 
     * @param cost
     */
    public void setCost(java.lang.String cost) {
        this.cost = cost;
    }


    /**
     * Gets the addr_addr3 value for this OaUser.
     * 
     * @return addr_addr3
     */
    public java.lang.String getAddr_addr3() {
        return addr_addr3;
    }


    /**
     * Sets the addr_addr3 value for this OaUser.
     * 
     * @param addr_addr3
     */
    public void setAddr_addr3(java.lang.String addr_addr3) {
        this.addr_addr3 = addr_addr3;
    }


    /**
     * Gets the workschedule_workdays value for this OaUser.
     * 
     * @return workschedule_workdays
     */
    public java.lang.String getWorkschedule_workdays() {
        return workschedule_workdays;
    }


    /**
     * Sets the workschedule_workdays value for this OaUser.
     * 
     * @param workschedule_workdays
     */
    public void setWorkschedule_workdays(java.lang.String workschedule_workdays) {
        this.workschedule_workdays = workschedule_workdays;
    }


    /**
     * Gets the active value for this OaUser.
     * 
     * @return active
     */
    public java.lang.String getActive() {
        return active;
    }


    /**
     * Sets the active value for this OaUser.
     * 
     * @param active
     */
    public void setActive(java.lang.String active) {
        this.active = active;
    }


    /**
     * Gets the externalid value for this OaUser.
     * 
     * @return externalid
     */
    public java.lang.String getExternalid() {
        return externalid;
    }


    /**
     * Sets the externalid value for this OaUser.
     * 
     * @param externalid
     */
    public void setExternalid(java.lang.String externalid) {
        this.externalid = externalid;
    }


    /**
     * Gets the addr_salutation value for this OaUser.
     * 
     * @return addr_salutation
     */
    public java.lang.String getAddr_salutation() {
        return addr_salutation;
    }


    /**
     * Sets the addr_salutation value for this OaUser.
     * 
     * @param addr_salutation
     */
    public void setAddr_salutation(java.lang.String addr_salutation) {
        this.addr_salutation = addr_salutation;
    }


    /**
     * Gets the ta_approver value for this OaUser.
     * 
     * @return ta_approver
     */
    public java.lang.String getTa_approver() {
        return ta_approver;
    }


    /**
     * Sets the ta_approver value for this OaUser.
     * 
     * @param ta_approver
     */
    public void setTa_approver(java.lang.String ta_approver) {
        this.ta_approver = ta_approver;
    }


    /**
     * Gets the generic value for this OaUser.
     * 
     * @return generic
     */
    public java.lang.String getGeneric() {
        return generic;
    }


    /**
     * Sets the generic value for this OaUser.
     * 
     * @param generic
     */
    public void setGeneric(java.lang.String generic) {
        this.generic = generic;
    }


    /**
     * Gets the pr_approver value for this OaUser.
     * 
     * @return pr_approver
     */
    public java.lang.String getPr_approver() {
        return pr_approver;
    }


    /**
     * Sets the pr_approver value for this OaUser.
     * 
     * @param pr_approver
     */
    public void setPr_approver(java.lang.String pr_approver) {
        this.pr_approver = pr_approver;
    }


    /**
     * Gets the pb_approvalprocess value for this OaUser.
     * 
     * @return pb_approvalprocess
     */
    public java.lang.String getPb_approvalprocess() {
        return pb_approvalprocess;
    }


    /**
     * Sets the pb_approvalprocess value for this OaUser.
     * 
     * @param pb_approvalprocess
     */
    public void setPb_approvalprocess(java.lang.String pb_approvalprocess) {
        this.pb_approvalprocess = pb_approvalprocess;
    }


    /**
     * Gets the external_id value for this OaUser.
     * 
     * @return external_id
     */
    public java.lang.String getExternal_id() {
        return external_id;
    }


    /**
     * Sets the external_id value for this OaUser.
     * 
     * @param external_id
     */
    public void setExternal_id(java.lang.String external_id) {
        this.external_id = external_id;
    }


    /**
     * Gets the type value for this OaUser.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OaUser.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the workscheduleid value for this OaUser.
     * 
     * @return workscheduleid
     */
    public java.lang.String getWorkscheduleid() {
        return workscheduleid;
    }


    /**
     * Sets the workscheduleid value for this OaUser.
     * 
     * @param workscheduleid
     */
    public void setWorkscheduleid(java.lang.String workscheduleid) {
        this.workscheduleid = workscheduleid;
    }


    /**
     * Gets the po_filter_set value for this OaUser.
     * 
     * @return po_filter_set
     */
    public java.lang.String getPo_filter_set() {
        return po_filter_set;
    }


    /**
     * Sets the po_filter_set value for this OaUser.
     * 
     * @param po_filter_set
     */
    public void setPo_filter_set(java.lang.String po_filter_set) {
        this.po_filter_set = po_filter_set;
    }


    /**
     * Gets the addr_state value for this OaUser.
     * 
     * @return addr_state
     */
    public java.lang.String getAddr_state() {
        return addr_state;
    }


    /**
     * Sets the addr_state value for this OaUser.
     * 
     * @param addr_state
     */
    public void setAddr_state(java.lang.String addr_state) {
        this.addr_state = addr_state;
    }


    /**
     * Gets the primary_filter_set value for this OaUser.
     * 
     * @return primary_filter_set
     */
    public java.lang.String getPrimary_filter_set() {
        return primary_filter_set;
    }


    /**
     * Sets the primary_filter_set value for this OaUser.
     * 
     * @param primary_filter_set
     */
    public void setPrimary_filter_set(java.lang.String primary_filter_set) {
        this.primary_filter_set = primary_filter_set;
    }


    /**
     * Gets the te_allowance_approvalprocess value for this OaUser.
     * 
     * @return te_allowance_approvalprocess
     */
    public java.lang.String getTe_allowance_approvalprocess() {
        return te_allowance_approvalprocess;
    }


    /**
     * Sets the te_allowance_approvalprocess value for this OaUser.
     * 
     * @param te_allowance_approvalprocess
     */
    public void setTe_allowance_approvalprocess(java.lang.String te_allowance_approvalprocess) {
        this.te_allowance_approvalprocess = te_allowance_approvalprocess;
    }


    /**
     * Gets the user_locationid value for this OaUser.
     * 
     * @return user_locationid
     */
    public java.lang.String getUser_locationid() {
        return user_locationid;
    }


    /**
     * Sets the user_locationid value for this OaUser.
     * 
     * @param user_locationid
     */
    public void setUser_locationid(java.lang.String user_locationid) {
        this.user_locationid = user_locationid;
    }


    /**
     * Gets the addr_phone value for this OaUser.
     * 
     * @return addr_phone
     */
    public java.lang.String getAddr_phone() {
        return addr_phone;
    }


    /**
     * Sets the addr_phone value for this OaUser.
     * 
     * @param addr_phone
     */
    public void setAddr_phone(java.lang.String addr_phone) {
        this.addr_phone = addr_phone;
    }


    /**
     * Gets the account_workscheduleid value for this OaUser.
     * 
     * @return account_workscheduleid
     */
    public java.lang.String getAccount_workscheduleid() {
        return account_workscheduleid;
    }


    /**
     * Sets the account_workscheduleid value for this OaUser.
     * 
     * @param account_workscheduleid
     */
    public void setAccount_workscheduleid(java.lang.String account_workscheduleid) {
        this.account_workscheduleid = account_workscheduleid;
    }


    /**
     * Gets the om_filter_set value for this OaUser.
     * 
     * @return om_filter_set
     */
    public java.lang.String getOm_filter_set() {
        return om_filter_set;
    }


    /**
     * Sets the om_filter_set value for this OaUser.
     * 
     * @param om_filter_set
     */
    public void setOm_filter_set(java.lang.String om_filter_set) {
        this.om_filter_set = om_filter_set;
    }


    /**
     * Gets the ssn value for this OaUser.
     * 
     * @return ssn
     */
    public java.lang.String getSsn() {
        return ssn;
    }


    /**
     * Sets the ssn value for this OaUser.
     * 
     * @param ssn
     */
    public void setSsn(java.lang.String ssn) {
        this.ssn = ssn;
    }


    /**
     * Gets the acct_code value for this OaUser.
     * 
     * @return acct_code
     */
    public java.lang.String getAcct_code() {
        return acct_code;
    }


    /**
     * Sets the acct_code value for this OaUser.
     * 
     * @param acct_code
     */
    public void setAcct_code(java.lang.String acct_code) {
        this.acct_code = acct_code;
    }


    /**
     * Gets the ma_filter_set value for this OaUser.
     * 
     * @return ma_filter_set
     */
    public java.lang.String getMa_filter_set() {
        return ma_filter_set;
    }


    /**
     * Sets the ma_filter_set value for this OaUser.
     * 
     * @param ma_filter_set
     */
    public void setMa_filter_set(java.lang.String ma_filter_set) {
        this.ma_filter_set = ma_filter_set;
    }


    /**
     * Gets the te_filter_set value for this OaUser.
     * 
     * @return te_filter_set
     */
    public java.lang.String getTe_filter_set() {
        return te_filter_set;
    }


    /**
     * Sets the te_filter_set value for this OaUser.
     * 
     * @param te_filter_set
     */
    public void setTe_filter_set(java.lang.String te_filter_set) {
        this.te_filter_set = te_filter_set;
    }


    /**
     * Gets the sr_approvalprocess value for this OaUser.
     * 
     * @return sr_approvalprocess
     */
    public java.lang.String getSr_approvalprocess() {
        return sr_approvalprocess;
    }


    /**
     * Sets the sr_approvalprocess value for this OaUser.
     * 
     * @param sr_approvalprocess
     */
    public void setSr_approvalprocess(java.lang.String sr_approvalprocess) {
        this.sr_approvalprocess = sr_approvalprocess;
    }


    /**
     * Gets the te_allowance_approver value for this OaUser.
     * 
     * @return te_allowance_approver
     */
    public java.lang.String getTe_allowance_approver() {
        return te_allowance_approver;
    }


    /**
     * Sets the te_allowance_approver value for this OaUser.
     * 
     * @param te_allowance_approver
     */
    public void setTe_allowance_approver(java.lang.String te_allowance_approver) {
        this.te_allowance_approver = te_allowance_approver;
    }


    /**
     * Gets the addr_email value for this OaUser.
     * 
     * @return addr_email
     */
    public java.lang.String getAddr_email() {
        return addr_email;
    }


    /**
     * Sets the addr_email value for this OaUser.
     * 
     * @param addr_email
     */
    public void setAddr_email(java.lang.String addr_email) {
        this.addr_email = addr_email;
    }


    /**
     * Gets the cost_start_date value for this OaUser.
     * 
     * @return cost_start_date
     */
    public java.lang.String getCost_start_date() {
        return cost_start_date;
    }


    /**
     * Sets the cost_start_date value for this OaUser.
     * 
     * @param cost_start_date
     */
    public void setCost_start_date(java.lang.String cost_start_date) {
        this.cost_start_date = cost_start_date;
    }


    /**
     * Gets the pb_approver value for this OaUser.
     * 
     * @return pb_approver
     */
    public java.lang.String getPb_approver() {
        return pb_approver;
    }


    /**
     * Sets the pb_approver value for this OaUser.
     * 
     * @param pb_approver
     */
    public void setPb_approver(java.lang.String pb_approver) {
        this.pb_approver = pb_approver;
    }


    /**
     * Gets the nickname value for this OaUser.
     * 
     * @return nickname
     */
    public java.lang.String getNickname() {
        return nickname;
    }


    /**
     * Sets the nickname value for this OaUser.
     * 
     * @param nickname
     */
    public void setNickname(java.lang.String nickname) {
        this.nickname = nickname;
    }


    /**
     * Gets the logintime value for this OaUser.
     * 
     * @return logintime
     */
    public java.lang.String getLogintime() {
        return logintime;
    }


    /**
     * Sets the logintime value for this OaUser.
     * 
     * @param logintime
     */
    public void setLogintime(java.lang.String logintime) {
        this.logintime = logintime;
    }


    /**
     * Gets the pr_approvalprocess value for this OaUser.
     * 
     * @return pr_approvalprocess
     */
    public java.lang.String getPr_approvalprocess() {
        return pr_approvalprocess;
    }


    /**
     * Sets the pr_approvalprocess value for this OaUser.
     * 
     * @param pr_approvalprocess
     */
    public void setPr_approvalprocess(java.lang.String pr_approvalprocess) {
        this.pr_approvalprocess = pr_approvalprocess;
    }


    /**
     * Gets the line_managerid value for this OaUser.
     * 
     * @return line_managerid
     */
    public java.lang.String getLine_managerid() {
        return line_managerid;
    }


    /**
     * Sets the line_managerid value for this OaUser.
     * 
     * @param line_managerid
     */
    public void setLine_managerid(java.lang.String line_managerid) {
        this.line_managerid = line_managerid;
    }


    /**
     * Gets the week_starts value for this OaUser.
     * 
     * @return week_starts
     */
    public java.lang.String getWeek_starts() {
        return week_starts;
    }


    /**
     * Sets the week_starts value for this OaUser.
     * 
     * @param week_starts
     */
    public void setWeek_starts(java.lang.String week_starts) {
        this.week_starts = week_starts;
    }


    /**
     * Gets the created value for this OaUser.
     * 
     * @return created
     */
    public java.lang.String getCreated() {
        return created;
    }


    /**
     * Sets the created value for this OaUser.
     * 
     * @param created
     */
    public void setCreated(java.lang.String created) {
        this.created = created;
    }


    /**
     * Gets the ta_filter_set value for this OaUser.
     * 
     * @return ta_filter_set
     */
    public java.lang.String getTa_filter_set() {
        return ta_filter_set;
    }


    /**
     * Sets the ta_filter_set value for this OaUser.
     * 
     * @param ta_filter_set
     */
    public void setTa_filter_set(java.lang.String ta_filter_set) {
        this.ta_filter_set = ta_filter_set;
    }


    /**
     * Gets the addr_id value for this OaUser.
     * 
     * @return addr_id
     */
    public java.lang.String getAddr_id() {
        return addr_id;
    }


    /**
     * Sets the addr_id value for this OaUser.
     * 
     * @param addr_id
     */
    public void setAddr_id(java.lang.String addr_id) {
        this.addr_id = addr_id;
    }


    /**
     * Gets the flags value for this OaUser.
     * 
     * @return flags
     */
    public openair.wsdl.OaBase[] getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this OaUser.
     * 
     * @param flags
     */
    public void setFlags(openair.wsdl.OaBase[] flags) {
        this.flags = flags;
    }


    /**
     * Gets the attributes value for this OaUser.
     * 
     * @return attributes
     */
    public openair.wsdl.OaBase[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this OaUser.
     * 
     * @param attributes
     */
    public void setAttributes(openair.wsdl.OaBase[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OaUser)) return false;
        OaUser other = (OaUser) obj;
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
            ((this.tag_group_id==null && other.getTag_group_id()==null) || 
             (this.tag_group_id!=null &&
              this.tag_group_id.equals(other.getTag_group_id()))) &&
            ((this.addr_country==null && other.getAddr_country()==null) || 
             (this.addr_country!=null &&
              this.addr_country.equals(other.getAddr_country()))) &&
            ((this.po_approver==null && other.getPo_approver()==null) || 
             (this.po_approver!=null &&
              this.po_approver.equals(other.getPo_approver()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.br_approvalprocess==null && other.getBr_approvalprocess()==null) || 
             (this.br_approvalprocess!=null &&
              this.br_approvalprocess.equals(other.getBr_approvalprocess()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.te_approver==null && other.getTe_approver()==null) || 
             (this.te_approver!=null &&
              this.te_approver.equals(other.getTe_approver()))) &&
            ((this.sr_approver==null && other.getSr_approver()==null) || 
             (this.sr_approver!=null &&
              this.sr_approver.equals(other.getSr_approver()))) &&
            ((this.departmentid==null && other.getDepartmentid()==null) || 
             (this.departmentid!=null &&
              this.departmentid.equals(other.getDepartmentid()))) &&
            ((this.cost_currency==null && other.getCost_currency()==null) || 
             (this.cost_currency!=null &&
              this.cost_currency.equals(other.getCost_currency()))) &&
            ((this.update_workschedule==null && other.getUpdate_workschedule()==null) || 
             (this.update_workschedule!=null &&
              this.update_workschedule.equals(other.getUpdate_workschedule()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.cost_end_date==null && other.getCost_end_date()==null) || 
             (this.cost_end_date!=null &&
              this.cost_end_date.equals(other.getCost_end_date()))) &&
            ((this.tb_filter_set==null && other.getTb_filter_set()==null) || 
             (this.tb_filter_set!=null &&
              this.tb_filter_set.equals(other.getTb_filter_set()))) &&
            ((this.addr_last==null && other.getAddr_last()==null) || 
             (this.addr_last!=null &&
              this.addr_last.equals(other.getAddr_last()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.hierarchy_node_ids==null && other.getHierarchy_node_ids()==null) || 
             (this.hierarchy_node_ids!=null &&
              this.hierarchy_node_ids.equals(other.getHierarchy_node_ids()))) &&
            ((this.po_approvalprocess==null && other.getPo_approvalprocess()==null) || 
             (this.po_approvalprocess!=null &&
              this.po_approvalprocess.equals(other.getPo_approvalprocess()))) &&
            ((this.addr_fax==null && other.getAddr_fax()==null) || 
             (this.addr_fax!=null &&
              this.addr_fax.equals(other.getAddr_fax()))) &&
            ((this.rm_filter_set==null && other.getRm_filter_set()==null) || 
             (this.rm_filter_set!=null &&
              this.rm_filter_set.equals(other.getRm_filter_set()))) &&
            ((this.tag_start_date==null && other.getTag_start_date()==null) || 
             (this.tag_start_date!=null &&
              this.tag_start_date.equals(other.getTag_start_date()))) &&
            ((this.addr_city==null && other.getAddr_city()==null) || 
             (this.addr_city!=null &&
              this.addr_city.equals(other.getAddr_city()))) &&
            ((this.hint==null && other.getHint()==null) || 
             (this.hint!=null &&
              this.hint.equals(other.getHint()))) &&
            ((this.dr_approver==null && other.getDr_approver()==null) || 
             (this.dr_approver!=null &&
              this.dr_approver.equals(other.getDr_approver()))) &&
            ((this.br_approver==null && other.getBr_approver()==null) || 
             (this.br_approver!=null &&
              this.br_approver.equals(other.getBr_approver()))) &&
            ((this.az_approvalprocess==null && other.getAz_approvalprocess()==null) || 
             (this.az_approvalprocess!=null &&
              this.az_approvalprocess.equals(other.getAz_approvalprocess()))) &&
            ((this.pm_filter_set==null && other.getPm_filter_set()==null) || 
             (this.pm_filter_set!=null &&
              this.pm_filter_set.equals(other.getPm_filter_set()))) &&
            ((this.tag_group_attribute_id==null && other.getTag_group_attribute_id()==null) || 
             (this.tag_group_attribute_id!=null &&
              this.tag_group_attribute_id.equals(other.getTag_group_attribute_id()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.cost_centerid==null && other.getCost_centerid()==null) || 
             (this.cost_centerid!=null &&
              this.cost_centerid.equals(other.getCost_centerid()))) &&
            ((this.project_access_nodes==null && other.getProject_access_nodes()==null) || 
             (this.project_access_nodes!=null &&
              this.project_access_nodes.equals(other.getProject_access_nodes()))) &&
            ((this.addr_zip==null && other.getAddr_zip()==null) || 
             (this.addr_zip!=null &&
              this.addr_zip.equals(other.getAddr_zip()))) &&
            ((this.rm_approver==null && other.getRm_approver()==null) || 
             (this.rm_approver!=null &&
              this.rm_approver.equals(other.getRm_approver()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              this.locked.equals(other.getLocked()))) &&
            ((this.update_tag==null && other.getUpdate_tag()==null) || 
             (this.update_tag!=null &&
              this.update_tag.equals(other.getUpdate_tag()))) &&
            ((this.password_forced_change==null && other.getPassword_forced_change()==null) || 
             (this.password_forced_change!=null &&
              this.password_forced_change.equals(other.getPassword_forced_change()))) &&
            ((this.filterset_stamp==null && other.getFilterset_stamp()==null) || 
             (this.filterset_stamp!=null &&
              this.filterset_stamp.equals(other.getFilterset_stamp()))) &&
            ((this.addr_addr1==null && other.getAddr_addr1()==null) || 
             (this.addr_addr1!=null &&
              this.addr_addr1.equals(other.getAddr_addr1()))) &&
            ((this.job_codeid==null && other.getJob_codeid()==null) || 
             (this.job_codeid!=null &&
              this.job_codeid.equals(other.getJob_codeid()))) &&
            ((this.payroll_code==null && other.getPayroll_code()==null) || 
             (this.payroll_code!=null &&
              this.payroll_code.equals(other.getPayroll_code()))) &&
            ((this.addr_middle==null && other.getAddr_middle()==null) || 
             (this.addr_middle!=null &&
              this.addr_middle.equals(other.getAddr_middle()))) &&
            ((this.tag_end_date==null && other.getTag_end_date()==null) || 
             (this.tag_end_date!=null &&
              this.tag_end_date.equals(other.getTag_end_date()))) &&
            ((this.report_filter_set==null && other.getReport_filter_set()==null) || 
             (this.report_filter_set!=null &&
              this.report_filter_set.equals(other.getReport_filter_set()))) &&
            ((this.addr_addr2==null && other.getAddr_addr2()==null) || 
             (this.addr_addr2!=null &&
              this.addr_addr2.equals(other.getAddr_addr2()))) &&
            ((this.km_filter_set==null && other.getKm_filter_set()==null) || 
             (this.km_filter_set!=null &&
              this.km_filter_set.equals(other.getKm_filter_set()))) &&
            ((this.is_user_schedule==null && other.getIs_user_schedule()==null) || 
             (this.is_user_schedule!=null &&
              this.is_user_schedule.equals(other.getIs_user_schedule()))) &&
            ((this.update_cost==null && other.getUpdate_cost()==null) || 
             (this.update_cost!=null &&
              this.update_cost.equals(other.getUpdate_cost()))) &&
            ((this.az_approver==null && other.getAz_approver()==null) || 
             (this.az_approver!=null &&
              this.az_approver.equals(other.getAz_approver()))) &&
            ((this.addr_addr4==null && other.getAddr_addr4()==null) || 
             (this.addr_addr4!=null &&
              this.addr_addr4.equals(other.getAddr_addr4()))) &&
            ((this.rm_approvalprocess==null && other.getRm_approvalprocess()==null) || 
             (this.rm_approvalprocess!=null &&
              this.rm_approvalprocess.equals(other.getRm_approvalprocess()))) &&
            ((this.picklist_label==null && other.getPicklist_label()==null) || 
             (this.picklist_label!=null &&
              this.picklist_label.equals(other.getPicklist_label()))) &&
            ((this.cost_lc_level==null && other.getCost_lc_level()==null) || 
             (this.cost_lc_level!=null &&
              this.cost_lc_level.equals(other.getCost_lc_level()))) &&
            ((this.role_id==null && other.getRole_id()==null) || 
             (this.role_id!=null &&
              this.role_id.equals(other.getRole_id()))) &&
            ((this.dr_approvalprocess==null && other.getDr_approvalprocess()==null) || 
             (this.dr_approvalprocess!=null &&
              this.dr_approvalprocess.equals(other.getDr_approvalprocess()))) &&
            ((this.workschedule_workhours==null && other.getWorkschedule_workhours()==null) || 
             (this.workschedule_workhours!=null &&
              this.workschedule_workhours.equals(other.getWorkschedule_workhours()))) &&
            ((this.ta_approvalprocess==null && other.getTa_approvalprocess()==null) || 
             (this.ta_approvalprocess!=null &&
              this.ta_approvalprocess.equals(other.getTa_approvalprocess()))) &&
            ((this.te_approvalprocess==null && other.getTe_approvalprocess()==null) || 
             (this.te_approvalprocess!=null &&
              this.te_approvalprocess.equals(other.getTe_approvalprocess()))) &&
            ((this.book_assign_stamp==null && other.getBook_assign_stamp()==null) || 
             (this.book_assign_stamp!=null &&
              this.book_assign_stamp.equals(other.getBook_assign_stamp()))) &&
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
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.addr_addr3==null && other.getAddr_addr3()==null) || 
             (this.addr_addr3!=null &&
              this.addr_addr3.equals(other.getAddr_addr3()))) &&
            ((this.workschedule_workdays==null && other.getWorkschedule_workdays()==null) || 
             (this.workschedule_workdays!=null &&
              this.workschedule_workdays.equals(other.getWorkschedule_workdays()))) &&
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.externalid==null && other.getExternalid()==null) || 
             (this.externalid!=null &&
              this.externalid.equals(other.getExternalid()))) &&
            ((this.addr_salutation==null && other.getAddr_salutation()==null) || 
             (this.addr_salutation!=null &&
              this.addr_salutation.equals(other.getAddr_salutation()))) &&
            ((this.ta_approver==null && other.getTa_approver()==null) || 
             (this.ta_approver!=null &&
              this.ta_approver.equals(other.getTa_approver()))) &&
            ((this.generic==null && other.getGeneric()==null) || 
             (this.generic!=null &&
              this.generic.equals(other.getGeneric()))) &&
            ((this.pr_approver==null && other.getPr_approver()==null) || 
             (this.pr_approver!=null &&
              this.pr_approver.equals(other.getPr_approver()))) &&
            ((this.pb_approvalprocess==null && other.getPb_approvalprocess()==null) || 
             (this.pb_approvalprocess!=null &&
              this.pb_approvalprocess.equals(other.getPb_approvalprocess()))) &&
            ((this.external_id==null && other.getExternal_id()==null) || 
             (this.external_id!=null &&
              this.external_id.equals(other.getExternal_id()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.workscheduleid==null && other.getWorkscheduleid()==null) || 
             (this.workscheduleid!=null &&
              this.workscheduleid.equals(other.getWorkscheduleid()))) &&
            ((this.po_filter_set==null && other.getPo_filter_set()==null) || 
             (this.po_filter_set!=null &&
              this.po_filter_set.equals(other.getPo_filter_set()))) &&
            ((this.addr_state==null && other.getAddr_state()==null) || 
             (this.addr_state!=null &&
              this.addr_state.equals(other.getAddr_state()))) &&
            ((this.primary_filter_set==null && other.getPrimary_filter_set()==null) || 
             (this.primary_filter_set!=null &&
              this.primary_filter_set.equals(other.getPrimary_filter_set()))) &&
            ((this.te_allowance_approvalprocess==null && other.getTe_allowance_approvalprocess()==null) || 
             (this.te_allowance_approvalprocess!=null &&
              this.te_allowance_approvalprocess.equals(other.getTe_allowance_approvalprocess()))) &&
            ((this.user_locationid==null && other.getUser_locationid()==null) || 
             (this.user_locationid!=null &&
              this.user_locationid.equals(other.getUser_locationid()))) &&
            ((this.addr_phone==null && other.getAddr_phone()==null) || 
             (this.addr_phone!=null &&
              this.addr_phone.equals(other.getAddr_phone()))) &&
            ((this.account_workscheduleid==null && other.getAccount_workscheduleid()==null) || 
             (this.account_workscheduleid!=null &&
              this.account_workscheduleid.equals(other.getAccount_workscheduleid()))) &&
            ((this.om_filter_set==null && other.getOm_filter_set()==null) || 
             (this.om_filter_set!=null &&
              this.om_filter_set.equals(other.getOm_filter_set()))) &&
            ((this.ssn==null && other.getSsn()==null) || 
             (this.ssn!=null &&
              this.ssn.equals(other.getSsn()))) &&
            ((this.acct_code==null && other.getAcct_code()==null) || 
             (this.acct_code!=null &&
              this.acct_code.equals(other.getAcct_code()))) &&
            ((this.ma_filter_set==null && other.getMa_filter_set()==null) || 
             (this.ma_filter_set!=null &&
              this.ma_filter_set.equals(other.getMa_filter_set()))) &&
            ((this.te_filter_set==null && other.getTe_filter_set()==null) || 
             (this.te_filter_set!=null &&
              this.te_filter_set.equals(other.getTe_filter_set()))) &&
            ((this.sr_approvalprocess==null && other.getSr_approvalprocess()==null) || 
             (this.sr_approvalprocess!=null &&
              this.sr_approvalprocess.equals(other.getSr_approvalprocess()))) &&
            ((this.te_allowance_approver==null && other.getTe_allowance_approver()==null) || 
             (this.te_allowance_approver!=null &&
              this.te_allowance_approver.equals(other.getTe_allowance_approver()))) &&
            ((this.addr_email==null && other.getAddr_email()==null) || 
             (this.addr_email!=null &&
              this.addr_email.equals(other.getAddr_email()))) &&
            ((this.cost_start_date==null && other.getCost_start_date()==null) || 
             (this.cost_start_date!=null &&
              this.cost_start_date.equals(other.getCost_start_date()))) &&
            ((this.pb_approver==null && other.getPb_approver()==null) || 
             (this.pb_approver!=null &&
              this.pb_approver.equals(other.getPb_approver()))) &&
            ((this.nickname==null && other.getNickname()==null) || 
             (this.nickname!=null &&
              this.nickname.equals(other.getNickname()))) &&
            ((this.logintime==null && other.getLogintime()==null) || 
             (this.logintime!=null &&
              this.logintime.equals(other.getLogintime()))) &&
            ((this.pr_approvalprocess==null && other.getPr_approvalprocess()==null) || 
             (this.pr_approvalprocess!=null &&
              this.pr_approvalprocess.equals(other.getPr_approvalprocess()))) &&
            ((this.line_managerid==null && other.getLine_managerid()==null) || 
             (this.line_managerid!=null &&
              this.line_managerid.equals(other.getLine_managerid()))) &&
            ((this.week_starts==null && other.getWeek_starts()==null) || 
             (this.week_starts!=null &&
              this.week_starts.equals(other.getWeek_starts()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.ta_filter_set==null && other.getTa_filter_set()==null) || 
             (this.ta_filter_set!=null &&
              this.ta_filter_set.equals(other.getTa_filter_set()))) &&
            ((this.addr_id==null && other.getAddr_id()==null) || 
             (this.addr_id!=null &&
              this.addr_id.equals(other.getAddr_id()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              java.util.Arrays.equals(this.flags, other.getFlags()))) &&
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
        if (getTag_group_id() != null) {
            _hashCode += getTag_group_id().hashCode();
        }
        if (getAddr_country() != null) {
            _hashCode += getAddr_country().hashCode();
        }
        if (getPo_approver() != null) {
            _hashCode += getPo_approver().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getBr_approvalprocess() != null) {
            _hashCode += getBr_approvalprocess().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getTe_approver() != null) {
            _hashCode += getTe_approver().hashCode();
        }
        if (getSr_approver() != null) {
            _hashCode += getSr_approver().hashCode();
        }
        if (getDepartmentid() != null) {
            _hashCode += getDepartmentid().hashCode();
        }
        if (getCost_currency() != null) {
            _hashCode += getCost_currency().hashCode();
        }
        if (getUpdate_workschedule() != null) {
            _hashCode += getUpdate_workschedule().hashCode();
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getCost_end_date() != null) {
            _hashCode += getCost_end_date().hashCode();
        }
        if (getTb_filter_set() != null) {
            _hashCode += getTb_filter_set().hashCode();
        }
        if (getAddr_last() != null) {
            _hashCode += getAddr_last().hashCode();
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
        if (getAddr_fax() != null) {
            _hashCode += getAddr_fax().hashCode();
        }
        if (getRm_filter_set() != null) {
            _hashCode += getRm_filter_set().hashCode();
        }
        if (getTag_start_date() != null) {
            _hashCode += getTag_start_date().hashCode();
        }
        if (getAddr_city() != null) {
            _hashCode += getAddr_city().hashCode();
        }
        if (getHint() != null) {
            _hashCode += getHint().hashCode();
        }
        if (getDr_approver() != null) {
            _hashCode += getDr_approver().hashCode();
        }
        if (getBr_approver() != null) {
            _hashCode += getBr_approver().hashCode();
        }
        if (getAz_approvalprocess() != null) {
            _hashCode += getAz_approvalprocess().hashCode();
        }
        if (getPm_filter_set() != null) {
            _hashCode += getPm_filter_set().hashCode();
        }
        if (getTag_group_attribute_id() != null) {
            _hashCode += getTag_group_attribute_id().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCost_centerid() != null) {
            _hashCode += getCost_centerid().hashCode();
        }
        if (getProject_access_nodes() != null) {
            _hashCode += getProject_access_nodes().hashCode();
        }
        if (getAddr_zip() != null) {
            _hashCode += getAddr_zip().hashCode();
        }
        if (getRm_approver() != null) {
            _hashCode += getRm_approver().hashCode();
        }
        if (getLocked() != null) {
            _hashCode += getLocked().hashCode();
        }
        if (getUpdate_tag() != null) {
            _hashCode += getUpdate_tag().hashCode();
        }
        if (getPassword_forced_change() != null) {
            _hashCode += getPassword_forced_change().hashCode();
        }
        if (getFilterset_stamp() != null) {
            _hashCode += getFilterset_stamp().hashCode();
        }
        if (getAddr_addr1() != null) {
            _hashCode += getAddr_addr1().hashCode();
        }
        if (getJob_codeid() != null) {
            _hashCode += getJob_codeid().hashCode();
        }
        if (getPayroll_code() != null) {
            _hashCode += getPayroll_code().hashCode();
        }
        if (getAddr_middle() != null) {
            _hashCode += getAddr_middle().hashCode();
        }
        if (getTag_end_date() != null) {
            _hashCode += getTag_end_date().hashCode();
        }
        if (getReport_filter_set() != null) {
            _hashCode += getReport_filter_set().hashCode();
        }
        if (getAddr_addr2() != null) {
            _hashCode += getAddr_addr2().hashCode();
        }
        if (getKm_filter_set() != null) {
            _hashCode += getKm_filter_set().hashCode();
        }
        if (getIs_user_schedule() != null) {
            _hashCode += getIs_user_schedule().hashCode();
        }
        if (getUpdate_cost() != null) {
            _hashCode += getUpdate_cost().hashCode();
        }
        if (getAz_approver() != null) {
            _hashCode += getAz_approver().hashCode();
        }
        if (getAddr_addr4() != null) {
            _hashCode += getAddr_addr4().hashCode();
        }
        if (getRm_approvalprocess() != null) {
            _hashCode += getRm_approvalprocess().hashCode();
        }
        if (getPicklist_label() != null) {
            _hashCode += getPicklist_label().hashCode();
        }
        if (getCost_lc_level() != null) {
            _hashCode += getCost_lc_level().hashCode();
        }
        if (getRole_id() != null) {
            _hashCode += getRole_id().hashCode();
        }
        if (getDr_approvalprocess() != null) {
            _hashCode += getDr_approvalprocess().hashCode();
        }
        if (getWorkschedule_workhours() != null) {
            _hashCode += getWorkschedule_workhours().hashCode();
        }
        if (getTa_approvalprocess() != null) {
            _hashCode += getTa_approvalprocess().hashCode();
        }
        if (getTe_approvalprocess() != null) {
            _hashCode += getTe_approvalprocess().hashCode();
        }
        if (getBook_assign_stamp() != null) {
            _hashCode += getBook_assign_stamp().hashCode();
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
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getAddr_addr3() != null) {
            _hashCode += getAddr_addr3().hashCode();
        }
        if (getWorkschedule_workdays() != null) {
            _hashCode += getWorkschedule_workdays().hashCode();
        }
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getExternalid() != null) {
            _hashCode += getExternalid().hashCode();
        }
        if (getAddr_salutation() != null) {
            _hashCode += getAddr_salutation().hashCode();
        }
        if (getTa_approver() != null) {
            _hashCode += getTa_approver().hashCode();
        }
        if (getGeneric() != null) {
            _hashCode += getGeneric().hashCode();
        }
        if (getPr_approver() != null) {
            _hashCode += getPr_approver().hashCode();
        }
        if (getPb_approvalprocess() != null) {
            _hashCode += getPb_approvalprocess().hashCode();
        }
        if (getExternal_id() != null) {
            _hashCode += getExternal_id().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getWorkscheduleid() != null) {
            _hashCode += getWorkscheduleid().hashCode();
        }
        if (getPo_filter_set() != null) {
            _hashCode += getPo_filter_set().hashCode();
        }
        if (getAddr_state() != null) {
            _hashCode += getAddr_state().hashCode();
        }
        if (getPrimary_filter_set() != null) {
            _hashCode += getPrimary_filter_set().hashCode();
        }
        if (getTe_allowance_approvalprocess() != null) {
            _hashCode += getTe_allowance_approvalprocess().hashCode();
        }
        if (getUser_locationid() != null) {
            _hashCode += getUser_locationid().hashCode();
        }
        if (getAddr_phone() != null) {
            _hashCode += getAddr_phone().hashCode();
        }
        if (getAccount_workscheduleid() != null) {
            _hashCode += getAccount_workscheduleid().hashCode();
        }
        if (getOm_filter_set() != null) {
            _hashCode += getOm_filter_set().hashCode();
        }
        if (getSsn() != null) {
            _hashCode += getSsn().hashCode();
        }
        if (getAcct_code() != null) {
            _hashCode += getAcct_code().hashCode();
        }
        if (getMa_filter_set() != null) {
            _hashCode += getMa_filter_set().hashCode();
        }
        if (getTe_filter_set() != null) {
            _hashCode += getTe_filter_set().hashCode();
        }
        if (getSr_approvalprocess() != null) {
            _hashCode += getSr_approvalprocess().hashCode();
        }
        if (getTe_allowance_approver() != null) {
            _hashCode += getTe_allowance_approver().hashCode();
        }
        if (getAddr_email() != null) {
            _hashCode += getAddr_email().hashCode();
        }
        if (getCost_start_date() != null) {
            _hashCode += getCost_start_date().hashCode();
        }
        if (getPb_approver() != null) {
            _hashCode += getPb_approver().hashCode();
        }
        if (getNickname() != null) {
            _hashCode += getNickname().hashCode();
        }
        if (getLogintime() != null) {
            _hashCode += getLogintime().hashCode();
        }
        if (getPr_approvalprocess() != null) {
            _hashCode += getPr_approvalprocess().hashCode();
        }
        if (getLine_managerid() != null) {
            _hashCode += getLine_managerid().hashCode();
        }
        if (getWeek_starts() != null) {
            _hashCode += getWeek_starts().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getTa_filter_set() != null) {
            _hashCode += getTa_filter_set().hashCode();
        }
        if (getAddr_id() != null) {
            _hashCode += getAddr_id().hashCode();
        }
        if (getFlags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(OaUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUser"));
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
        elemField.setFieldName("tag_group_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag_group_id"));
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
        elemField.setFieldName("po_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "po_approver"));
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
        elemField.setFieldName("br_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "br_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
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
        elemField.setFieldName("sr_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sr_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departmentid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_currency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_workschedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "update_workschedule"));
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
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tb_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tb_filter_set"));
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
        elemField.setFieldName("addr_fax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rm_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rm_filter_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag_start_date"));
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
        elemField.setFieldName("hint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dr_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dr_approver"));
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
        elemField.setFieldName("az_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "az_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pm_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pm_filter_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag_group_attribute_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag_group_attribute_id"));
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
        elemField.setFieldName("project_access_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "project_access_nodes"));
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
        elemField.setFieldName("rm_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rm_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "update_tag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password_forced_change");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password_forced_change"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterset_stamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterset_stamp"));
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
        elemField.setFieldName("job_codeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job_codeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payroll_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payroll_code"));
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
        elemField.setFieldName("tag_end_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag_end_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "report_filter_set"));
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
        elemField.setFieldName("km_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "km_filter_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("is_user_schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "is_user_schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("update_cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "update_cost"));
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
        elemField.setFieldName("addr_addr4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_addr4"));
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
        elemField.setFieldName("picklist_label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "picklist_label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_lc_level");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_lc_level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "role_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dr_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dr_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workschedule_workhours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workschedule_workhours"));
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
        elemField.setFieldName("book_assign_stamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "book_assign_stamp"));
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
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost"));
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
        elemField.setFieldName("workschedule_workdays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workschedule_workdays"));
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
        elemField.setFieldName("ta_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ta_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "generic"));
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
        elemField.setFieldName("pb_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pb_approvalprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("external_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "external_id"));
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
        elemField.setFieldName("workscheduleid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workscheduleid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("po_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "po_filter_set"));
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
        elemField.setFieldName("primary_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primary_filter_set"));
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
        elemField.setFieldName("user_locationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user_locationid"));
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
        elemField.setFieldName("account_workscheduleid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "account_workscheduleid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("om_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "om_filter_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssn"));
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
        elemField.setFieldName("ma_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ma_filter_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("te_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "te_filter_set"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sr_approvalprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sr_approvalprocess"));
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
        elemField.setFieldName("addr_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addr_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost_start_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost_start_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pb_approver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pb_approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nickname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nickname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logintime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logintime"));
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
        elemField.setFieldName("line_managerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line_managerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("week_starts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "week_starts"));
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
        elemField.setFieldName("ta_filter_set");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ta_filter_set"));
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
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase"));
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
          new  OpenAirDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
