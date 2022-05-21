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

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.EditText - First Name'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Customer/Update Profile/android.widget.EditText - First Name'), 'TestingFirstname', 0)

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.EditText - Last Name'), 0)

Mobile.setText(findTestObject('Customer/Update Profile/android.widget.EditText - Last Name'), 'TestingLastname', 0)

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.EditText - Address'), 0)

Mobile.setText(findTestObject('Customer/Update Profile/android.widget.EditText - Address'), '18/7, Testing Street, QA', 
    0)

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.EditText - Contact Number'), 0)

Mobile.setText(findTestObject('Customer/Update Profile/android.widget.EditText - Contact Number'), '0745678932', 0)

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.EditText - Nic'), 0)

Mobile.setText(findTestObject('Customer/Update Profile/android.widget.EditText - Nic'), '200286798484', 0)

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.EditText - Age'), 0)

Mobile.setText(findTestObject('Customer/Update Profile/android.widget.EditText - Age'), '26', 0)

Mobile.tap(findTestObject('Customer/Update Profile/android.view.View (2)'), 0)

Mobile.tapAndHold(findTestObject('Customer/Update Profile/android.view.View (2)'), 0, 0)

Mobile.tap(findTestObject('Object Repository/Customer/Update Profile/android.widget.Button (1)'), 0)

Mobile.tapAndHold(findTestObject('Object Repository/Customer/Update Profile/android.view.View (3)'), 0, 0)

Mobile.tapAndHold(findTestObject('Object Repository/Customer/Update Profile/android.widget.Button (2)'), 0, 0)

