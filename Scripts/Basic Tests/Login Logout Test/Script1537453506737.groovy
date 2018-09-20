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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Login/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email'), user)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Password_passwd'), password)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Sign in'))

if (is_valid == 'true') {
    WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My addresses'))

    WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Back to your account'))

    WebUI.click(findTestObject('Object Repository/Page_My account - My Store/span_My personal information'))

    WebUI.click(findTestObject('Object Repository/Page_Identity - My Store/span_Back to your account'))

    WebUI.click(findTestObject('Object Repository/Page_My account - My Store/a_Sign out'))
} else if (is_valid == 'false') {
    WebUI.verifyElementPresent(findTestObject('Page_Login - My Store/p_There is 1 error'), 0)
}

WebUI.closeBrowser()

