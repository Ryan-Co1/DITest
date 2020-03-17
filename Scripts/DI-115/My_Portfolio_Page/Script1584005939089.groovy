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

WebUI.openBrowser('https://dev.trialoversight.io/login')

WebUI.click(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Click_On_The_Log_In_Link_On_PopUp'))

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Enter_UserName_On_The_ERT_Global_Account'), 
    'alekhya.vallabhaneni@ert.com')

WebUI.setEncryptedText(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Enter_PassWord_On_The_ERT_Global_Account'), 
    'pgEQZ1U6isSxa3leG/17PA==')

WebUI.click(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Click_On_Login_Button'))

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Clicking_Instance_Arrow'))

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Selecting_Instance'))

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Clicking_On_SelectButton_Of_Instance'))

breadcrumbTxt = WebUI.getText(findTestObject('Page_Portfolio/Page_Trial Oversight/Breadcrumb_Portfolio_Link'))

WebUI.verifyEqual(breadcrumbTxt, 'Portfolio')

WebUI.verifyElementNotPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Breadcrumb_Chevron_Icon'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_MyPortfolio_Banner'), 0)

WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_MyPortfolio_Banner'), 'MY PORTFOLIO')

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Compliance_Quality_Banner'), 0)

alignment = WebUI.getCSSValue(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Compliance_Quality_Banner'), 'float')

WebUI.verifyEqual(alignment, 'right')

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Compliance_Score_Val'), 0)

complScore = WebUI.getText(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Compliance_Score_Val'))

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Quality_Score_Val'), 0)

qualScore = WebUI.getText(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Quality_Score_Val'))

complianceScore = WebUI.concatenate((([complScore, ' COMPLIANCE']) as String[]))

WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Compliance_Banner'), complianceScore)

qualityScore = WebUI.concatenate((([qualScore, ' QUALITY']) as String[]))

WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Header_Qulaity_Banner'), qualityScore)

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Graph1_Compl_Scr_OverTime'), 0)

WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Graph1_Compl_Title_Txt'), 'Compliance Score Over Time')

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Graph2_Quality_Scr_OverTime'), 0)

WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Graph2_Quality_Title_Txt'), 'Quality Score Over Time')

String graph3Title = CustomKeywords.'di_keywords.UI_Keywords.stripString'(graph3TxtLocator)

WebUI.verifyEqual(graph3Title, 'Studies by Score')

String graph4Title = CustomKeywords.'di_keywords.UI_Keywords.stripString'(graph4TxtLocator)

WebUI.verifyEqual(graph4Title, 'Bottom 10 Performing Sites')

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/Studies_Table'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Portfolio/Page_Trial Oversight/StudyName_Header_Txt'), 0)

WebUI.takeScreenshot('MyPortfolio')

WebUI.scrollToElement(findTestObject('Page_Portfolio/Page_Trial Oversight/Studies_Table'), 0)

WebUI.takeScreenshot('MyPortfolio1')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

