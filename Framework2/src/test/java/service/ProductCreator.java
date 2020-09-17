package service;

import model.Product;

import java.util.Properties;

public
class ProductCreator {
    public static final String PATH_TO_TESTDATA = "src\\test\\resources\\dev.properties";
    public static final String TESTDATA_PRODUCT_TYPE = "testdata.productType";
    public static final String TESTDATA_INSTANCE_NUMBER = "testdata.instanceNumber";
    public static final String TESTDATA_INSTANCE_FOR = "testdata.instanceFor";
    public static final String TESTDATA_OPERATION_SYSTEM = "testdata.operationSystem";
    public static final String TESTDATA_VM_CLASS = "testdata.vmClass";
    public static final String TESTDATA_INSTANCE_TYPE = "testdata.instanceType";
    public static final String TESTDATA_ADD_GPUS = "testdata.addGPUs";
    public static final String TESTDATA_GPUS_NUMBER = "testdata.gpusNUmber";
    public static final String TESTDATA_GPUS_TYPE = "testdata.gpusType";
    public static final String TESTDATA_LOCAL_SSD = "testdata.localSSD";
    public static final String TESTDATA_LOCATION = "testdata.location";
    public static final String TESTDATA_COMMITTED_USAGE = "testdata.committedUsage";

    public static
    Product computerEngine() {
    /*    Properties properties = PropertiesReader.getProperties(PATH_TO_TESTDATA);
        return new Product(properties.getProperty(TESTDATA_PRODUCT_TYPE),
                properties.getProperty(TESTDATA_INSTANCE_NUMBER),
                properties.getProperty(TESTDATA_INSTANCE_FOR),
                properties.getProperty(TESTDATA_OPERATION_SYSTEM),
                properties.getProperty(TESTDATA_VM_CLASS),
                properties.getProperty(TESTDATA_INSTANCE_TYPE),
                Boolean.parseBoolean(properties.getProperty(TESTDATA_ADD_GPUS)),
                properties.getProperty(TESTDATA_GPUS_NUMBER),
                properties.getProperty(TESTDATA_GPUS_TYPE),
                properties.getProperty(TESTDATA_LOCAL_SSD),
                properties.getProperty(TESTDATA_LOCATION),
                properties.getProperty(TESTDATA_COMMITTED_USAGE));*/
        return new model.Product(service.TestDataReader.getTestData(TESTDATA_PRODUCT_TYPE),
                service.TestDataReader.getTestData(TESTDATA_INSTANCE_NUMBER),
                service.TestDataReader.getTestData(TESTDATA_INSTANCE_FOR),
                service.TestDataReader.getTestData(TESTDATA_OPERATION_SYSTEM),
                service.TestDataReader.getTestData(TESTDATA_VM_CLASS),
                service.TestDataReader.getTestData(TESTDATA_INSTANCE_TYPE),
                Boolean.parseBoolean(service.TestDataReader.getTestData(TESTDATA_ADD_GPUS)),
                service.TestDataReader.getTestData(TESTDATA_GPUS_NUMBER),
                service.TestDataReader.getTestData(TESTDATA_GPUS_TYPE),
                service.TestDataReader.getTestData(TESTDATA_LOCAL_SSD),
                service.TestDataReader.getTestData(TESTDATA_LOCATION),
                service.TestDataReader.getTestData(TESTDATA_COMMITTED_USAGE));
    }
}
