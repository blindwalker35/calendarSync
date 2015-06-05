/**
 * OAirServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package openair.wsdl;

public class OAirServiceSoapBindingStub extends org.apache.axis.client.Stub implements openair.wsdl.OAirServiceHandler {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[17];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login_par"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "LoginParams"), openair.wsdl.LoginParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "LoginResult"));
        oper.setReturnClass(openair.wsdl.LoginResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("version");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "number"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "VersionResult"));
        oper.setReturnClass(openair.wsdl.VersionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "versionReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("read");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "method"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfReadRequest"), openair.wsdl.ReadRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfReadResult"));
        oper.setReturnClass(openair.wsdl.ReadResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "readReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("runReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "runReportRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "RunReportRequest"), openair.wsdl.RunReportRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "RunReportResult"));
        oper.setReturnClass(openair.wsdl.RunReportResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "runReportReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("add");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfoaBase"), openair.wsdl.OaBase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfUpdateResult"));
        oper.setReturnClass(openair.wsdl.UpdateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAccount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUser"), openair.wsdl.OaUser.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCompany"), openair.wsdl.OaCompany.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "UpdateResult"));
        oper.setReturnClass(openair.wsdl.UpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUser"), openair.wsdl.OaUser.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "company"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCompany"), openair.wsdl.OaCompany.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "UpdateResult"));
        oper.setReturnClass(openair.wsdl.UpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfAttributes"), openair.wsdl.Attribute[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfoaBase"), openair.wsdl.OaBase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfUpdateResult"));
        oper.setReturnClass(openair.wsdl.UpdateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "upsertReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("submit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfSubmitRequest"), openair.wsdl.SubmitRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfSubmitResult"));
        oper.setReturnClass(openair.wsdl.SubmitResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "submitReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requests"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfMakeURLRequest"), openair.wsdl.MakeURLRequest[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfMakeURLResult"));
        oper.setReturnClass(openair.wsdl.MakeURLResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "MakeURLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfAttributes"), openair.wsdl.Attribute[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfoaBase"), openair.wsdl.OaBase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfUpdateResult"));
        oper.setReturnClass(openair.wsdl.UpdateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "modifyReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "objects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfoaBase"), openair.wsdl.OaBase[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfUpdateResult"));
        oper.setReturnClass(openair.wsdl.UpdateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("whoami");
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUser"));
        oper.setReturnClass(openair.wsdl.OaUser.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "whoamiReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("servertime");
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDate"));
        oper.setReturnClass(openair.wsdl.OaDate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "servertimeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("servertimeWithTimezone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfAttributes"), openair.wsdl.Attribute[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDate"));
        oper.setReturnClass(openair.wsdl.OaDate.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "servertimeReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCrystalInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "CrystalResult"));
        oper.setReturnClass(openair.wsdl.CrystalResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCrystalInfoReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

    }

    public OAirServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OAirServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OAirServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfAttributes");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.Attribute[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "Attribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfMakeURLRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.MakeURLRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "MakeURLRequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfMakeURLResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.MakeURLResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "MakeURLResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfoaBase");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfReadRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.ReadRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ReadRequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfReadResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.ReadResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ReadResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfSubmitRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.SubmitRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "SubmitRequest");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfSubmitResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.SubmitResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "SubmitResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ArrayOfUpdateResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.UpdateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "UpdateResult");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "Attribute");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.Attribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "CrystalResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.CrystalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "LoginParams");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.LoginParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "LoginResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "MakeURLRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.MakeURLRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "MakeURLResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.MakeURLResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaActualcost");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaActualcost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAddress");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAgreement");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaAgreement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAgreement_to_project");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaAgreement_to_project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaApproval");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaApproval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaApprovalprocess");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaApprovalprocess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAttachment");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAttribute");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaAttributeset");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaAttributeset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBase");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBillingSplit");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBillingSplit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBooking");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBooking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBooking_request");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBooking_request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBookingByDay");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBookingByDay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBookingType");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBookingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBudget");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBudget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaBudgetAllocation");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaBudgetAllocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCategory");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCategory_1");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCategory_1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCategory_2");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCategory_2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCategory_3");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCategory_3.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCategory_4");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCategory_4.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCategory_5");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCategory_5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCcrate");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCcrate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCompany");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCompany.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaContact");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCostcategory");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCostcategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCostcenter");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCostcenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCosttype");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCosttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCurrency");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCurrency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCurrencyrate");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCurrencyrate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCustField");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCustField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCustomer");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCustomer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCustomerpo");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCustomerpo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCustomerpo_to_project");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCustomerpo_to_project.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaCustomField");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaCustomField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDate");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaDate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDeal");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaDeal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDealcontact");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaDealcontact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDealschedule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaDealschedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaDepartment");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaDepartment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEntitytag");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEntitytag.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEnvelope");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEnvelope.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaError");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimate");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEstimate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimateadjustment");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEstimateadjustment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimateexpense");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEstimateexpense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimatelabor");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEstimatelabor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimatemarkup");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEstimatemarkup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEstimatephase");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEstimatephase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaEvent");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaFieldAttribute");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaFieldAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaFilterset");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaFilterset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaForexInput");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaForexInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaFormPermissionField");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaFormPermissionField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaFulfillment");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaFulfillment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaHierarchy");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaHierarchy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaHierarchyNode");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaHierarchyNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaHistory");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaHistoryNotes");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaHistoryNotes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaImportExport");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaImportExport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaInvoice");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaInvoiceLayout");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaInvoiceLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssue");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaIssue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssueCategory");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaIssueCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssueSeverity");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaIssueSeverity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssueSource");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaIssueSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssueStage");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaIssueStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaIssueStatus");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaIssueStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaItem");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaItemToUserLocation");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaItemToUserLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaJobcode");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaJobcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaLeave_accrual_rule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaLeave_accrual_rule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaLeave_accrual_rule_to_user");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaLeave_accrual_rule_to_user.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaLeave_accrual_transaction");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaLeave_accrual_transaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaLoadedCost");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaLoadedCost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaModule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaModule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPayment");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPaymentterms");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPaymentterms.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPaymenttype");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPaymenttype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPayrolltype");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPayrolltype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPendingBooking");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPendingBooking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPreference");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProduct");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProject");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectassign");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectassign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectAssignmentProfile");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectAssignmentProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectbillingrule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectbillingrule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectbillingtransaction");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectbillingtransaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectgroup");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectgroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectlocation");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectlocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjectstage");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjectstage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjecttask");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjecttask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjecttask_type");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjecttask_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProjecttaskassign");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProjecttaskassign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProposal");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProposal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaProposalblock");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaProposalblock.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPurchase_item");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPurchase_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPurchaseorder");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPurchaseorder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPurchaser");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPurchaser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaPurchaserequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaPurchaserequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRatecard");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRatecard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRateCardItem");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRateCardItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRateLimit");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRateLimit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaReimbursement");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaReimbursement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRepeat");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRepeat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaReport");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRequest_item");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRequest_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourceprofile");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaResourceprofile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourceprofile_type");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaResourceprofile_type.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourceRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaResourceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourceRequestQueue");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaResourceRequestQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaResourcesearch");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaResourcesearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenue_recognition_rule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRevenue_recognition_rule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenue_recognition_rule_amount");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRevenue_recognition_rule_amount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenue_recognition_transaction");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRevenue_recognition_transaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenueContainer");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRevenueContainer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenueProjection");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRevenueProjection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaRevenueStage");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaRevenueStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSchedulebyday");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSchedulebyday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaScheduleexception");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaScheduleexception.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSchedulerequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSchedulerequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSchedulerequest_item");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSchedulerequest_item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaServerStatus");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaServerStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSlip");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSlip.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSlipProjection");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSlipProjection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSlipstage");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSlipstage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSummaryView");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSummaryView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaSwitch");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaSwitch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTagGroup");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTagGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTagGroupAttribute");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTagGroupAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTargetUtilization");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTargetUtilization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTask");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTask.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTaskTimecard");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTaskTimecard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTaxLocation");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTaxLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTaxRate");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTaxRate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTerm");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTerm.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTicket");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTimecard");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTimecard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTimesheet");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTimesheet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTimetype");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTimetype.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaTodo");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaTodo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUprate");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaUprate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUser");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUserLocation");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaUserLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaUserWorkschedule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaUserWorkschedule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaVendor");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaVendor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaViewfilter");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaViewfilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaViewfilterrule");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaViewfilterrule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaWorkspace");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaWorkspace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaWorkspacelink");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaWorkspacelink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "oaWorkspaceuser");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.OaWorkspaceuser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ReadRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.ReadRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "ReadResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.ReadResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "RunReportRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.RunReportRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "RunReportResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.RunReportResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "SubmitRequest");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.SubmitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "SubmitResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.SubmitResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "UpdateResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.UpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://namespaces.soaplite.com/perl", "VersionResult");
            cachedSerQNames.add(qName);
            cls = openair.wsdl.VersionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public openair.wsdl.LoginResult login(openair.wsdl.LoginParams login_par) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login_par});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.LoginResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.LoginResult) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.LoginResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.VersionResult version(java.lang.String name, java.lang.String number) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#version");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "version"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {name, number});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.VersionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.VersionResult) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.VersionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.ReadResult[] read(openair.wsdl.ReadRequest[] method) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#read");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "read"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {method});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.ReadResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.ReadResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.ReadResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.RunReportResult runReport(openair.wsdl.RunReportRequest runReportRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#runReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "runReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {runReportRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.RunReportResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.RunReportResult) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.RunReportResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.UpdateResult[] add(openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#add");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "add"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.UpdateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.UpdateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.UpdateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.UpdateResult createAccount(openair.wsdl.OaUser user, openair.wsdl.OaCompany company) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#createAccount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "createAccount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, company});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.UpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.UpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.UpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.UpdateResult createUser(openair.wsdl.OaUser user, openair.wsdl.OaCompany company) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#createUser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "createUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, company});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.UpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.UpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.UpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.UpdateResult[] upsert(openair.wsdl.Attribute[] attributes, openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#upsert");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "upsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attributes, objects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.UpdateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.UpdateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.UpdateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.SubmitResult[] submit(openair.wsdl.SubmitRequest[] requests) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#submit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "submit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.SubmitResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.SubmitResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.SubmitResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.MakeURLResult[] makeURL(openair.wsdl.MakeURLRequest[] requests) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#makeURL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "makeURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {requests});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.MakeURLResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.MakeURLResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.MakeURLResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.UpdateResult[] modify(openair.wsdl.Attribute[] attributes, openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#modify");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "modify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attributes, objects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.UpdateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.UpdateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.UpdateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.UpdateResult[] delete(openair.wsdl.OaBase[] objects) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#delete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {objects});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.UpdateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.UpdateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.UpdateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.OaUser whoami() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#whoami");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "whoami"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.OaUser) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.OaUser) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.OaUser.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.OaDate servertime() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#servertime");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "servertime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.OaDate) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.OaDate) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.OaDate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.OaDate servertimeWithTimezone(openair.wsdl.Attribute[] attributes) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#servertimeWithTimezone");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "servertimeWithTimezone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.OaDate) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.OaDate) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.OaDate.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String logout() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#logout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public openair.wsdl.CrystalResult getCrystalInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.openair.com/OAirService#getCrystalInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.openair.com/OAirService", "getCrystalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (openair.wsdl.CrystalResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (openair.wsdl.CrystalResult) org.apache.axis.utils.JavaUtils.convert(_resp, openair.wsdl.CrystalResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
