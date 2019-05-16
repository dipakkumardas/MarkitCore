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


suiteProperties.put('id', 'Test Suites/TrialBalance')

suiteProperties.put('name', 'TrialBalance')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\MarkitCore-Final\\MarkitCoreSystem\\MarkitCore\\Reports\\TrialBalance\\20190516_120612\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/TrialBalance', suiteProperties, [new TestCaseBinding('Test Cases/TC01-LoginApplication', 'Test Cases/TC01-LoginApplication',  null), new TestCaseBinding('Test Cases/TC11-TrialBalance-MGA - Iteration 1', 'Test Cases/TC11-TrialBalance-MGA',  [ 'MGA_Comm_Value' : '291.00' , 'PolicyNo_TrialBalance' : 'DASD/POLICY/003173' ,  ]), new TestCaseBinding('Test Cases/TC11-TrialBalance-MGA - Iteration 2', 'Test Cases/TC11-TrialBalance-MGA',  [ 'MGA_Comm_Value' : '436.50' , 'PolicyNo_TrialBalance' : 'DASD/POLICY/003175' ,  ])])
