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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.login_evermos)

WebUI.click(findTestObject('input_nomorTelphone'))

WebUI.setText(findTestObject('input_phoneNumberActive'), findTestData('access_user').getValue(1, 1))

WebUI.scrollToElement(findTestObject('masuk_button'), 2)

WebUI.click(findTestObject('input_kataSandi'))

WebUI.setText(findTestObject('input_kataSandiActive'), findTestData('access_user').getValue(2, 1))

WebUI.click(findTestObject('masuk_buttonActive'))

//elementPresent=WebUI.waitForAlert(20)
//
//if (elementPresent==true) {
//	alertText = WebUI.getAlertText()
//	println('The title of the alert is:=' + alertText)
//
//if (alertText=='This user already exist.'){
//	println('SUCCESS: Successfully Register Account')
//
//WebUI.acceptAlert()
//	} else {
//		WebUI.acceptAlert()
//	println('ERROR: There was an error register account')
//	}
//}

WebUI.verifyElementVisible(findTestObject('Object Repository/input search product'))

WebUI.closeBrowser()

