/**
 * OAirServiceHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package modules.openair.wsdl;

public interface OAirServiceHandler extends java.rmi.Remote {

    /**
     * Use this function to authernticate. It returns a valid sessionId
     * which can be used for successive calls.
     */
    public modules.openair.wsdl.LoginResult login(modules.openair.wsdl.LoginParams login_par) throws java.rmi.RemoteException;

    /**
     * Use this function to uest the current version of an app.
     */
    public modules.openair.wsdl.VersionResult version(java.lang.String name, java.lang.String number) throws java.rmi.RemoteException;

    /**
     * Use this function to read data from NetSuite OpenAir
     */
    public modules.openair.wsdl.ReadResult[] read(modules.openair.wsdl.ReadRequest[] method) throws java.rmi.RemoteException;

    /**
     * Use this function to run and publish NetSuite OpenAir saved
     * report
     */
    public modules.openair.wsdl.RunReportResult runReport(modules.openair.wsdl.RunReportRequest runReportRequest) throws java.rmi.RemoteException;

    /**
     * Use this function to add data to NetSuite OpenAir
     */
    public modules.openair.wsdl.UpdateResult[] add(modules.openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to create NetSuite OpenAir accounts
     */
    public modules.openair.wsdl.UpdateResult createAccount(modules.openair.wsdl.OaUser user, modules.openair.wsdl.OaCompany company) throws java.rmi.RemoteException;

    /**
     * Use this function to create NetSuite OpenAir users
     */
    public modules.openair.wsdl.UpdateResult createUser(modules.openair.wsdl.OaUser user, modules.openair.wsdl.OaCompany company) throws java.rmi.RemoteException;

    /**
     * Use this function to add or modify data to NetSuite OpenAir
     * based on lookup attribute
     */
    public modules.openair.wsdl.UpdateResult[] upsert(modules.openair.wsdl.Attribute[] attributes, modules.openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to submit NetSuite OpenAir entities for approval
     */
    public modules.openair.wsdl.SubmitResult[] submit(modules.openair.wsdl.SubmitRequest[] requests) throws java.rmi.RemoteException;

    /**
     * Use this function to create a vlid urlto an NetSuite OpenAir
     * page specified
     */
    public modules.openair.wsdl.MakeURLResult[] makeURL(modules.openair.wsdl.MakeURLRequest[] requests) throws java.rmi.RemoteException;

    /**
     * Use this function to modify data in NetSuite OpenAir based
     * on internal id
     */
    public modules.openair.wsdl.UpdateResult[] modify(modules.openair.wsdl.Attribute[] attributes, modules.openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to delete data in NetSuite OpenAir based
     * on internal id
     */
    public modules.openair.wsdl.UpdateResult[] delete(modules.openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to get currently logged in oaUser
     */
    public modules.openair.wsdl.OaUser whoami() throws java.rmi.RemoteException;

    /**
     * Use this function to get current server time oaDate object
     */
    public modules.openair.wsdl.OaDate servertime() throws java.rmi.RemoteException;

    /**
     * Use this function to get current server time oaDate object
     */
    public modules.openair.wsdl.OaDate servertimeWithTimezone(modules.openair.wsdl.Attribute[] attributes) throws java.rmi.RemoteException;
    public java.lang.String logout() throws java.rmi.RemoteException;
    public modules.openair.wsdl.CrystalResult getCrystalInfo() throws java.rmi.RemoteException;
}
