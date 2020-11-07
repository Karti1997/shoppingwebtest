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

WebUI.click(findTestObject('homepage_Store/a_Summer Dresses'))

WebUI.verifyElementVisible(findTestObject('homepage_Store/Page_Summer Dresses - My Store/span_Summer Dresses'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('homepage_Store/Page_Summer Dresses - My Store/span_In stock'))

WebUI.click(findTestObject('homepage_Store/Page_Summer Dresses - My Store/img_Showing 1 - 3 of 3 items_replace-2x img-responsive'))

WebUI.click(findTestObject('Page_Printed Summer Dress - My Store/a_Color_Blue'))

WebUI.verifyElementVisible(findTestObject('Page_Printed Summer Dress - My Store/label_Size'))

WebUI.click(findTestObject('Page_Printed Summer Dress - My Store/select_SML'))

WebUI.click(findTestObject('Page_Printed Summer Dress - My Store/span_Add to cart'))

WebUI.verifyElementVisible(findTestObject('Page_Printed Summer Dress - My Store/h2_Product successfully added to your shopping'))

