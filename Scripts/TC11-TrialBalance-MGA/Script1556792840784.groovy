import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.logging.Logger as Logger

WebUI.waitForJQueryLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('TC11-TrialBalance/Report'), 4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC11-TrialBalance/Report'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('TC11-TrialBalance/TrialBalance'), 4, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('TC11-TrialBalance/TrialBalance'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC11-TrialBalance/TrialBalance'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForJQueryLoad(4, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC11-TrialBalance/SelectCurrency'), 'USD', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC11-TrialBalance/SelectEntity'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC11-TrialBalance/TypeEntityName'), 'NEW MGA', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC11-TrialBalance/TypeEntityName'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC11-TrialBalance/MGACreditor'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC11-TrialBalance/SearchPolicy'), PolicyNo_TrialBalance, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC11-TrialBalance/SearchPolicy'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

def MGA_Comm_Value = WebUI.getText(findTestObject('TC11-TrialBalance/MGAValueCapture'), FailureHandling.STOP_ON_FAILURE)

CustomKeywords.'com.excel.helper.ExcelHelper.updateTheExcel'('Data Files/TestData/Comission.xlsx', 'MGATrialBalance', MGA_Comm_Value)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(findTestData('TestData/MGAComission').getValue(1, 1), findTestData('TestData/MGATrialBalance').getValue(
        1, 1), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyEqual(findTestObject('TC11-TrialBalance/VerifyObject'), findTestData('TestData/MGAComission').getValue(
        MGA_Comm_Value, MGA_Comm_Value))

WebUI.waitForElementClickable(findTestObject('TC04-AccountMatching-MGA/CloseButton'), 5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/CloseButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('TC11-TrialBalance/HomeLink'), 4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC11-TrialBalance/HomeLink'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('TC11-TrialBalance/Report'), 4, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC11-TrialBalance/Report'), FailureHandling.STOP_ON_FAILURE)

