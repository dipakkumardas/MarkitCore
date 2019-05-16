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


suiteProperties.put('id', 'Test Suites/AllAccountMatching')

suiteProperties.put('name', 'AllAccountMatching')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\MarkitCore-Final\\MarkitCoreSystem\\MarkitCore\\Reports\\AllAccountMatching\\20190515_163317\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/AllAccountMatching', suiteProperties, [new TestCaseBinding('Test Cases/TC01-LoginApplication', 'Test Cases/TC01-LoginApplication',  null), new TestCaseBinding('Test Cases/TC04-AccountMatching-MGA - Iteration 1', 'Test Cases/TC04-AccountMatching-MGA',  [ 'MTA_Policy_No' : '' ,  ]), new TestCaseBinding('Test Cases/TC04-AccountMatching-MGA - Iteration 2', 'Test Cases/TC04-AccountMatching-MGA',  [ 'MTA_Policy_No' : 'DASD/POLICY/003151' ,  ]), new TestCaseBinding('Test Cases/TC04-AccountMatching-MGA - Iteration 3', 'Test Cases/TC04-AccountMatching-MGA',  [ 'MTA_Policy_No' : 'DASD/POLICY/003153' ,  ]), new TestCaseBinding('Test Cases/TC07-AccountMatching-Broker - Iteration 1', 'Test Cases/TC07-AccountMatching-Broker',  [ 'MTA_Policy_No' : '' ,  ]), new TestCaseBinding('Test Cases/TC07-AccountMatching-Broker - Iteration 2', 'Test Cases/TC07-AccountMatching-Broker',  [ 'MTA_Policy_No' : 'DASD/POLICY/003151' ,  ]), new TestCaseBinding('Test Cases/TC07-AccountMatching-Broker - Iteration 3', 'Test Cases/TC07-AccountMatching-Broker',  [ 'MTA_Policy_No' : 'DASD/POLICY/003153' ,  ]), new TestCaseBinding('Test Cases/TC08-AccountMatching-Insurer - Iteration 1', 'Test Cases/TC08-AccountMatching-Insurer',  [ 'MTA_Policy_No' : '' ,  ]), new TestCaseBinding('Test Cases/TC08-AccountMatching-Insurer - Iteration 2', 'Test Cases/TC08-AccountMatching-Insurer',  [ 'MTA_Policy_No' : 'DASD/POLICY/003151' ,  ]), new TestCaseBinding('Test Cases/TC08-AccountMatching-Insurer - Iteration 3', 'Test Cases/TC08-AccountMatching-Insurer',  [ 'MTA_Policy_No' : 'DASD/POLICY/003153' ,  ])])
