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

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/i_New_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/i_New_right fas fa-angle-left_1'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/a_Manage Stock'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add stock/Page_SwapMate/h4_Manage Current Stock'), 0)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Add new Item'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add stock/Page_SwapMate/h5_Enter Stock Item Details'), 0)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Ladies WearMens WearKids WearGeneral'), 
    'Ladies\' Wear', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Please select Category firstBridal W_fb86c9'), 
    'Ladies\' Skirts', true)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/p_Rejected'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_General3S2SXSSMLXL2XL3XL'), 'XL', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_UsedUsed in good conditionNot Used'), 
    'Used in Good Condition', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available'), 'Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available_1'), 'Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_LuxuriousWell KnownModerateUnbranded'), 
    'Well Known', true)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Add to Stock'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add stock/Page_SwapMate/div_Close    Successfull Added to Stock'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Add stock/Page_SwapMate/h5_Customer Swap Information'), 0)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_540'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/p_Total Points  540'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Reset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Ladies WearMens WearKids WearGeneral'), 
    'Mens\' Wear', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Please select Category firstGrooms W_2a996e'), 
    'Mens\' Denims', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_General3S2SXSSMLXL2XL3XL'), '3XL', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_UsedUsed in good conditionNot Used'), 
    'Used in Good Condition', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available'), 'Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available_1'), 'Not Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_LuxuriousWell KnownModerateUnbranded'), 
    'Moderate', true)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Add to Stock'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Reset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Ladies WearMens WearKids WearGeneral'), 
    'Kids\' Wear', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Please select Category firstFrocksKi_76afd3'), 
    'Frocks', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_General3S2SXSSMLXL2XL3XL'), 'M', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_UsedUsed in good conditionNot Used'), 
    'Not Used', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available'), 'Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available_1'), 'Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_LuxuriousWell KnownModerateUnbranded'), 
    'Moderate', true)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Add to Stock'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Reset'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Ladies WearMens WearKids WearGeneral'), 
    'General', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_Please select Category firstTravelli_0767cc'), 
    'Footware', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_General3S2SXSSMLXL2XL3XL'), 'XL', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_UsedUsed in good conditionNot Used'), 
    'Used in Good Condition', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available'), 'Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_AvailableNot Available_1'), 'Not Available', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Add stock/Page_SwapMate/select_LuxuriousWell KnownModerateUnbranded'), 
    'Unbranded', true)

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/button_Add to Stock'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/p_Total Points  1392'))

WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/span_'))

//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_Ladies Skirts'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_540'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_Mens Denims'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_288'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_Frocks'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_432'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_Footware'))
//
//WebUI.click(findTestObject('Object Repository/Add stock/Page_SwapMate/td_132'))

