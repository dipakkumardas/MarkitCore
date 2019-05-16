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


suiteProperties.put('id', 'Test Suites/PaymentSection')

suiteProperties.put('name', 'PaymentSection')

suiteProperties.put('description', 'This suite Is used to Payment')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())



RunConfiguration.setExecutionSettingFile("E:\\MarkitCore\\MarkitCore-Final\\MarkitCoreSystem\\MarkitCore\\Reports\\PaymentSection\\20190515_163102\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/PaymentSection', suiteProperties, [new TestCaseBinding('Test Cases/TC01-LoginApplication', 'Test Cases/TC01-LoginApplication',  null), new TestCaseBinding('Test Cases/TC05-PaymentSection - Iteration 1', 'Test Cases/TC05-PaymentSection',  [ 'Policy_No_Search' : '' ,  ]), new TestCaseBinding('Test Cases/TC05-PaymentSection - Iteration 2', 'Test Cases/TC05-PaymentSection',  [ 'Policy_No_Search' : 'DASD/POLICY/003151' ,  ]), new TestCaseBinding('Test Cases/TC05-PaymentSection - Iteration 3', 'Test Cases/TC05-PaymentSection',  [ 'Policy_No_Search' : 'DASD/POLICY/003153' ,  ])])
