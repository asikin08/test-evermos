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
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

WebUI.openBrowser('')

WebUI.navigateToUrl('https://evermos.com/catalog')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('master/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('mau_button'), 3)

WebUI.click(findTestObject('mau_button'))

WebUI.click(findTestObject('Object Repository/tokoSaya_menu'))

WebUI.click(findTestObject('Object Repository/salin_tautan'))

WebUI.verifyTextPresent('Tautan berhasil di salin', true)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_T)

robot.keyPress(KeyEvent.VK_V)

robot.keyPress(KeyEvent.VK_ENTER)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_T)

WebUI.switchToWindowIndex(1)

robot.keyRelease(KeyEvent.VK_V)

robot.keyRelease(KeyEvent.VK_ENTER)

WebUI.closeBrowser()

