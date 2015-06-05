/**
 * OAirServiceHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public interface OAirServiceHandler extends java.rmi.Remote {

    /**
     * Use this function to authernticate. It returns a valid sessionId
     * which can be used for successive calls.
     */
    public openair.wsdl.LoginResult login(openair.wsdl.LoginParams login_par) throws java.rmi.RemoteException;

    /**
     * Use this function to uest the current version of an app.
     */
    public openair.wsdl.VersionResult version(java.lang.String name, java.lang.String number) throws java.rmi.RemoteException;

    /**
     * Use this function to read data from NetSuite OpenAir
     */
    public openair.wsdl.ReadResult[] read(openair.wsdl.ReadRequest[] method) throws java.rmi.RemoteException;

    /**
     * Use this function to run and publish NetSuite OpenAir saved
     * report
     */
    public openair.wsdl.RunReportResult runReport(openair.wsdl.RunReportRequest runReportRequest) throws java.rmi.RemoteException;

    /**
     * Use this function to add data to NetSuite OpenAir
     */
    public openair.wsdl.UpdateResult[] add(openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to create NetSuite OpenAir accounts
     */
    public openair.wsdl.UpdateResult createAccount(openair.wsdl.OaUser user, openair.wsdl.OaCompany company) throws java.rmi.RemoteException;

    /**
     * Use this function to create NetSuite OpenAir users
     */
    public openair.wsdl.UpdateResult createUser(openair.wsdl.OaUser user, openair.wsdl.OaCompany company) throws java.rmi.RemoteException;

    /**
     * Use this function to add or modify data to NetSuite OpenAir
     * based on lookup attribute
     */
    public openair.wsdl.UpdateResult[] upsert(openair.wsdl.Attribute[] attributes, openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to submit NetSuite OpenAir entities for approval
     */
    public openair.wsdl.SubmitResult[] submit(openair.wsdl.SubmitRequest[] requests) throws java.rmi.RemoteException;

    /**
     * Use this function to create a vlid urlto an NetSuite OpenAir
     * page specified
     */
    public openair.wsdl.MakeURLResult[] makeURL(openair.wsdl.MakeURLRequest[] requests) throws java.rmi.RemoteException;

    /**
     * Use this function to modify data in NetSuite OpenAir based
     * on internal id
     */
    public openair.wsdl.UpdateResult[] modify(openair.wsdl.Attribute[] attributes, openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to delete data in NetSuite OpenAir based
     * on internal id
     */
    public openair.wsdl.UpdateResult[] delete(openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException;

    /**
     * Use this function to get currently logged in oaUser
     */
    public openair.wsdl.OaUser whoami() throws java.rmi.RemoteException;

    /**
     * Use this function to get current server time oaDate object
     */
    public openair.wsdl.OaDate servertime() throws java.rmi.RemoteException;

    /**
     * Use this function to get current server time oaDate object
     */
    public openair.wsdl.OaDate servertimeWithTimezone(openair.wsdl.Attribute[] attributes) throws java.rmi.RemoteException;
    public java.lang.String logout() throws java.rmi.RemoteException;
    public openair.wsdl.CrystalResult getCrystalInfo() throws java.rmi.RemoteException;
}
