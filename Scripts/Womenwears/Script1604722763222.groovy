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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://automationpractice.com/index.php')

WebUI.mouseOver(findTestObject('homepage_Store/a_Women'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/a_Blouses'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/img_Showing 1 - 1 of 1 item_replace-2x img-responsive'))

WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/select_SML'))

//
WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/a_Color_White'))

//
WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/button_Add to cart'))

//
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Blouse - My Store/h2_Success message'))

//
WebUI.click(findTestObject('Object Repository/Page_Blouse - My Store/span_Proceed to checkout'))

WebUI.verifyElementVisible(findTestObject('Page_Order - My Store/span_29.00'))

WebUI.click(findTestObject('Page_Order - My Store/span_Proceed to checkout'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input_Email address_email_create'), 'aslkjghjfgh@gmail.com')

WebUI.click(findTestObject('Page_Login - My Store/span_Create an account'))

WebUI.sendKeys(findTestObject('Page_Login - My Store/input__customer_firstname'), 'sdadf')

WebUI.sendKeys(findTestObject('Page_Login - My Store/input__customer_lastname'), 'jghdkjgh')

WebUI.sendKeys(findTestObject('Page_Login - My Store/input__passwd'), 'hdjkg')

