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

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Dashboard'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h1_Dashboard'), 0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Showroom New'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h1_Showroom'), 0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_My Calendar 6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h1_Appointments'), 0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/i_New_right fas fa-angle-left'))

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Manage Stock'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h4_Manage Current Stock'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/i_New_right fas fa-angle-left'))

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Manage Donations'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h1_Donations List'), 0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/i_New_right fas fa-angle-left'))

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Manage Showroom'))

WebUI.verifyElementNotVisibleInViewport(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h4_Items In Showroom'), 
    0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Orders'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h1_Ongoing Orders'), 0)

WebUI.click(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/a_Customers'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Admin_Page_Navigation/Page_SwapMate/h1_Customers'), 0)

