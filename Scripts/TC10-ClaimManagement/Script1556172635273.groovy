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

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/Claims'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/ClaimManagement'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4)

not_run: WebUI.waitForJQueryLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/AddClaimButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

ClaimRef_No = WebUI.getAttribute(findTestObject('TC10-Claim/ClaimRefNo'), 'value')

CustomKeywords.'com.excel.helper.ExcelHelper.updateTheExcel'('E:\\MarkitCore\\CoreApplication\\Data Files\\TestData\\policy.xlsx', 
    'ClaimRefNo', ClaimRef_No)

WebUI.waitForJQueryLoad(4, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/PolicyRefNo'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC10-Claim/SetPolicyNo'), PolicyNo_Claim, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/FindPolicyButton'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.click(findTestObject('TC10-Claim/CloseButton'), FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/ClientType'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForJQueryLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC10-Claim/ClientSearch'), 'Dipak Das', false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC10-Claim/ProductSearch'), 'BasicDemoProduct', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/SearchPolicy'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForJQueryLoad(5, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC10-Claim/FindPolicyRefNo'), PolicyNo_Claim, false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/SelectPolicy'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC10-Claim/ClaimantName'), 'Jerry Miller', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/ClickDateOfLossFields'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC10-Claim/DatePickerYear'), '2019', false, FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('TC10-Claim/DatePickerMonth'), 'Apr', false, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/DatePickerDay'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/ClaimDateMadeTextBox'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/DatePickerYear'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/DatePickerMonth'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/DatePickerDay'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/CauseOfLossC'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC10-Claim/DamageRes'), 'Accidental Damage', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC10-Claim/DamageRes'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/LossLocation'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC10-Claim/CountryName'), 'India', FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC10-Claim/CountryName'), Keys.chord(Keys.ENTER), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC10-Claim/SaveClaimButton'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

