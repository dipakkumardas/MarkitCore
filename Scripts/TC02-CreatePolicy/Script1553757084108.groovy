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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger

KeywordLogger log = new KeywordLogger()

WebUI.waitForJQueryLoad(10)

WebUI.delay(5)

WebUI.click(findTestObject('TC-CreatePolicy/DashBoard/ClientSearchLink'))

WebUI.setText(findTestObject('TC-CreatePolicy/ClientListing/ClientName'), 'Dipak')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('TC-CreatePolicy/ClientListing/ClientName'), Keys.chord(Keys.ENTER))

WebUI.delay(4)

WebUI.waitForElementClickable(findTestObject('TC-CreatePolicy/ClientListing/ClientListAction'), 3)

WebUI.click(findTestObject('TC-CreatePolicy/ClientListing/ClientListAction'))

WebUI.delay(3)

WebUI.click(findTestObject('TC-CreatePolicy/ClientListing/StartQuote'))

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/GeneralDetails/SelectCurrency'), var_Currency, true)

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/GeneralDetails/SelectBroker'), var_Broker, true)

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/GeneralDetails/SelectProduct'), var_ProductName, false)

WebUI.waitForJQueryLoad(5)

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/GeneralDetails/SelectPolicyTerm'), var_policyTerm, false)

WebUI.waitForJQueryLoad(3)

not_run: WebUI.selectOptionByValue(findTestObject('TC-CreatePolicy/GeneralDetails/SelectTimeZone'), '343', false)

WebUI.delay(3)

WebUI.click(findTestObject('TC-CreatePolicy/GeneralDetails/NextButton'))

WebUI.delay(5)

if (var_Alert.equals('Cancel')) {
    WebUI.click(findTestObject('TC-CreatePolicy/GeneralDetails/ButtonCancel'))

    WebUI.delay(3)

    WebUI.waitForJQueryLoad(5, FailureHandling.STOP_ON_FAILURE)

    WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/RiskDetails/Type'), var_Type, false)

    WebUI.setText(findTestObject('TC-CreatePolicy/RiskDetails/SumInsurreTextBox'), var_BuildingSumInsure)

    WebUI.setText(findTestObject('TC-CreatePolicy/RiskDetails/RoomNo'), var_RoomNo)

    WebUI.setText(findTestObject('TC-CreatePolicy/RiskDetails/ContentSumInsure'), var_ContentSumInsure)

    WebUI.click(findTestObject('TC-CreatePolicy/RiskDetails/Save'))

    WebUI.delay(5)
} else {
    WebUI.click(findTestObject('Object Repository/TC-CreatePolicy/GeneralDetails/OK'))
}

WebUI.delay(5)

def var_Total = WebUI.getText(findTestObject('TC-CreatePolicy/Premium/TotalPremium'))

not_run: WebUI.verifyElementText(findTestObject('TC-CreatePolicy/Premium/TotalPremium'), var_ExpectedValue)

WebUI.delay(2)

WebUI.click(findTestObject('TC-CreatePolicy/Premium/BindButton'))

WebUI.delay(5)

WebUI.click(findTestObject('TC-CreatePolicy/PaymentDetails/PaymentMethods'))

WebUI.waitForJQueryLoad(4)

WebUI.selectOptionByLabel(findTestObject('TC-CreatePolicy/PaymentDetails/SelectNoOfInstallment'), '1', false)

WebUI.delay(4)

WebUI.click(findTestObject('TC-CreatePolicy/PaymentDetails/ConfirmPaymentType'))

WebUI.delay(4)

WebUI.setText(findTestObject('TC-CreatePolicy/PaymentDetails/EmailText'), 'dipak.das@mailinator.com')

WebUI.scrollToElement(findTestObject('TC-CreatePolicy/PaymentDetails/BindAndSendPolicySchedule'), 5)

WebUI.delay(6)

WebUI.click(findTestObject('TC-CreatePolicy/PaymentDetails/BindAndSendPolicySchedule'))

WebUI.delay(5)

not_run: PolicyNo_Global = WebUI.getText(findTestObject('TC-CreatePolicy/Premium/PolicyNo'))

Get_Policy_No = WebUI.getText(findTestObject('TC-CreatePolicy/Premium/PolicyNo'))

WebUI.delay(5)

not_run: System.out.println(PolicyNo_Global)

CustomKeywords.'com.excel.helper.ExcelHelper.updateTheExcel1'('Data Files/PolicyData.xlsx', 'Commission', 'PolicyNo', Get_Policy_No)

not_run: log.logInfo(PolicyNo_Global)

WebUI.delay(3)

CustomKeywords.'com.excel.helper.ExcelHelper.updateTheExcel2'('Data Files/PolicyData.xlsx', 'Commission', 'TotalPremium', 
    var_Total, Get_Policy_No)

log.logInfo(var_Total)

WebUI.delay(5)

