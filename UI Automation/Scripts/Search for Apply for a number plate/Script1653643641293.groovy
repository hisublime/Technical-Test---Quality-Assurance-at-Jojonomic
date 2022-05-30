import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.service.nsw.gov.au/')

WebUI.setText(findTestObject('Object Repository/Search Object/Home/input_service_NSW'), 
    'Apply for a number plate')

WebUI.click(findTestObject('Object Repository/Search Object/Home/btn_apply_number_plate'))

WebUI.click(findTestObject('Object Repository/Search Object/Search/div_search_number'))

WebUI.click(findTestObject('Object Repository/Search Object/Number Plates/div_find_service_centre'))

WebUI.click(findTestObject('Object Repository/Search Object/Find Service location/input_search_suburb', [('value') : search]), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Search Object/Find Service location/btn_search_service_location'))

WebUI.closeBrowser()

