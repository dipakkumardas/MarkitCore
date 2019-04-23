import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import internal.GlobalVariable as GlobalVariable

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/PolicyCreation')

suiteProperties.put('name', 'PolicyCreation')

suiteProperties.put('description', 'This test case is used to create Policy')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\CoreApplication\\Reports\\PolicyCreation\\20190423_143030\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/PolicyCreation', suiteProperties, [new TestCaseBinding('Test Cases/TC01-LoginApplication', 'Test Cases/TC01-LoginApplication',  null), new TestCaseBinding('Test Cases/TC02-CreatePolicy - Iteration 1', 'Test Cases/TC02-CreatePolicy',  [ 'var_ProductName' : 'BasicDemoProduct' , 'var_RoomNo' : '2' , 'var_Broker' : 'New Broker' , 'var_Type' : 'Flat' , 'var_policyTerm' : 'Yearly' , 'var_ContentSumInsure' : '2000' , 'var_Alert' : 'Cancel' , 'var_BuildingSumInsure' : '1000' , 'var_Currency' : 'USD' ,  ]), new TestCaseBinding('Test Cases/TC02-CreatePolicy - Iteration 2', 'Test Cases/TC02-CreatePolicy',  [ 'var_ProductName' : 'BasicDemoProduct' , 'var_RoomNo' : '2' , 'var_Broker' : 'New Broker' , 'var_Type' : 'StandAlone' , 'var_policyTerm' : 'Yearly' , 'var_ContentSumInsure' : '1000' , 'var_Alert' : 'Cancel' , 'var_BuildingSumInsure' : '5000' , 'var_Currency' : 'USD' ,  ])])
