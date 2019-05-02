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

WebUI.waitForJQueryLoad(5)

WebUI.scrollToElement(findTestObject('TC11-TrialBalance/Report'), 4)

WebUI.click(findTestObject('TC11-TrialBalance/Report'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('TC11-TrialBalance/TrialBalance'), 4)

WebUI.click(findTestObject('TC11-TrialBalance/TrialBalance'))

WebUI.waitForJQueryLoad(4)

WebUI.selectOptionByLabel(findTestObject('TC11-TrialBalance/SelectCurrency'), 'USD', false)

WebUI.delay(4)

WebUI.click(findTestObject('TC11-TrialBalance/SelectEntity'))

WebUI.delay(4)

WebUI.setText(findTestObject('TC11-TrialBalance/TypeEntityName'), 'NEW MGA')

WebUI.sendKeys(findTestObject('TC11-TrialBalance/TypeEntityName'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('TC11-TrialBalance/MGACreditor'))

WebUI.delay(4)

WebUI.setText(findTestObject('TC11-TrialBalance/SearchPolicy'), findTestData('TestData/MTA_PolicyNO').getValue(1, 1))

WebUI.sendKeys(findTestObject('TC11-TrialBalance/SearchPolicy'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

def MGA_Comm_Value = WebUI.getText(findTestObject('TC11-TrialBalance/MGAValueCapture'))

CustomKeywords.'com.excel.helper.ExcelHelper.updateTheExcel'('E:\\MarkitCore\\CoreApplication\\Data Files\\TestData\\Comission.xlsx', 
    'MGATrialBalance', MGA_Comm_Value)

WebUI.delay(3)

WebUI.verifyEqual(findTestData('TestData/MGAComission').getValue(1, 1), MGA_Comm_Value)

