import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

WebUI.callTestCase(findTestCase('Common/GoToUrl'), [('url') : GlobalVariable.homeUrl + '?controller=addresses'])

deleteButton = WebUI.callTestCase(findTestCase('Common/FindAddress'), [('alias') : alias])

if (deleteButton) {
	
}

else {
	WebUI.click(findTestObject('Object Repository/Page_Addresses - My Store/span_Add a new address'))
	
	WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__address1'), house_nb)
	
	WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__city'), city)
	
	WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__postcode'), zipcode)
	
	WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__phone'), phone)
	
	WebUI.setText(findTestObject('Object Repository/Page_Address - My Store/input__alias'), alias)
	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), state,
		true)
	
	WebUI.click(findTestObject('Object Repository/Page_Address - My Store/span_Save'))
	
}

