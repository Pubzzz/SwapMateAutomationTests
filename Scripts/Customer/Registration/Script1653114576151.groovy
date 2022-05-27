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

Mobile.startApplication('C:\\Users\\prabh\\Documents\\GitHub\\SwapMateClientMobileApplication\\build\\app\\outputs\\flutter-apk\\app.apk', 
    true)

Mobile.tapAndHold(findTestObject('Register/android.widget.Button'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - E-mail Address (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - E-mail Address'), 'testing@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Password (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Password'), '123456', 0)

Mobile.tap(findTestObject('Object Repository/Register/android.widget.EditText - Re-enter Password (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Register/android.widget.EditText - Re-enter Password'), '123456', 0)

Mobile.hideKeyboard()

Mobile.tapAndHold(findTestObject('Customer/Register/android.widget.Button (1)'), 0, 0)

