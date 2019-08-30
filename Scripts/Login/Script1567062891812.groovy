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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://bms-ppd.pcdsi.ph/')

WebUI.click(findTestObject('Page_BMS/button_Login'))

WebUI.setText(findTestObject('Page_Sign in to your account/input_Sign in_loginfmt'), 'bdangeles@pcdsi.net')

WebUI.click(findTestObject('Page_Sign in to your account/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_Enter password_passwd'), 'GY2JYY+u2OfRbbxKoeevjQ==')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Sign in to your account/sign_in_button'))

WebUI.click(findTestObject('Page_Sign in to your account/input_concat(Don  t show this again)_idSIButton9'))

