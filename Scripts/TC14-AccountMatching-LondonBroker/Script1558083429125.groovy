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

WebUI.delay(3)

WebUI.scrollToElement(findTestObject('TC04-AccountMatching-MGA/AccountManagement'), 5)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/AccountManagement'))

WebUI.delay(5)

not_run: WebUI.waitForElementVisible(findTestObject('TC04-AccountMatching-MGA/AccountMatchingLink'), 4)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/AccountMatchingLink'))

WebUI.delay(5)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC04-AccountMatching-MGA/EntityType'), 'Broker', false)

WebUI.delay(5)

WebUI.selectOptionByLabel(findTestObject('TC04-AccountMatching-MGA/Entity'), 'DipakBroker', false)

WebUI.waitForElementClickable(findTestObject('TC04-AccountMatching-MGA/ClickGoButton'), 5)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/ClickGoButton'))

WebUI.waitForJQueryLoad(6)

WebUI.delay(3)

WebUI.selectOptionByLabel(findTestObject('TC04-AccountMatching-MGA/SelectAccount'), 'COMMISSION ACC -- Allocated -- DEFAULT-300012-USD -- USD', 
    false)

WebUI.delay(5)

WebUI.setText(findTestObject('TC04-AccountMatching-MGA/Acc_Matching_PolicyNo_TextBox'), MTA_Policy_No)

WebUI.delay(4)

WebUI.sendKeys(findTestObject('TC04-AccountMatching-MGA/Acc_Matching_PolicyNo_TextBox'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('TC04-AccountMatching-MGA/CheckBox'), 5)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/CheckBox'))

WebUI.delay(4)

LB_Comission_Amount = WebUI.getText(findTestObject('TC04-AccountMatching-MGA/MGA_Amount'))

LB_Comm_Amt = CustomKeywords.'subString.FatchSubstringValue.SubString'(LB_Comission_Amount)

WebUI.delay(4)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/PayFullClick'))

WebUI.delay(4)

WebUI.click(findTestObject('TC04-AccountMatching-MGA/MatchAmount'))

WebUI.delay(5)

WebUI.delay(5)

CustomKeywords.'com.excel.helper.ExcelHelper.updateTheExcel2'('Data Files/PolicyData.xlsx', 'Commission', 'LondonBrokerComm', 
    LB_Comm_Amt, MTA_Policy_No)

WebUI.click(findTestObject('TC11-TrialBalance/HomeLink'))

