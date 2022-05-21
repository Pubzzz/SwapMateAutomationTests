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

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/i_New_right fas fa-angle-left'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/i_New_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/a_Manage Stock'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/svg_Well Known_bi bi-folder-symlink'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Publish stock items/Page_SwapMate/h5_Complete Item Details'), 
    0)

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Ladies Wear'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Ladies Skirts'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_XL'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_540'))

WebUI.setText(findTestObject('Object Repository/Publish stock items/Page_SwapMate/textarea_Additional Notes_Notes'), 'Testing ')

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Add to Showroom'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/div_Close    Successfull Added to Showroom'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Close'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/svg_Well Known_bi bi-folder-symlink'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Mens Wear'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Mens Denims'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_3XL'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_288'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/tr_Additional Notes'))

WebUI.setText(findTestObject('Object Repository/Publish stock items/Page_SwapMate/textarea_Additional Notes_Notes'), 'Testing 2')

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Add to Showroom'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Close'))

WebUI.click(findTestObject('Sample/Page_SwapMate/svg_Well Known_bi bi-folder-symlink'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Kids Wear'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Frocks'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_M'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_432'))

WebUI.setText(findTestObject('Object Repository/Publish stock items/Page_SwapMate/textarea_Additional Notes_Notes'), 'Testing 3')

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Add to Showroom'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Close'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/svg_Well Known_bi bi-folder-symlink'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_General'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_Footware'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_XL'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/td_132'))

WebUI.setText(findTestObject('Object Repository/Publish stock items/Page_SwapMate/textarea_Additional Notes_Notes'), 'Testing 4')

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Add to Showroom'))

WebUI.click(findTestObject('Object Repository/Publish stock items/Page_SwapMate/button_Close'))

