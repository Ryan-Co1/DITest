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
    'mahesh.dugganaboina@ert.com')

WebUI.setEncryptedText(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Enter_PassWord_On_The_ERT_Global_Account'), 
    'llXc+NAkbb5WPciBcVyt7A==')

WebUI.click(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Click_On_Login_Button'))

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Clicking_Instance_Arrow'))

WebUI.scrollToElement(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Test'), 0)

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Selecting_Instance'))

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Clicking_On_SelectButton_Of_Instance'))

WebUI.scrollToElement(findTestObject('Page_Portfolio/Page_Trial Oversight/MouseHover_On_TornadoChat'), 1)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_Portfolio/Page_Trial Oversight/MouseHover_On_TornadoChat'))

WebUI.delay(2)

Text1 = WebUI.getText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/TornadoSpanStudystyle'))

println(Text1)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/TornadoSpanStudystyle'), Text1)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/MouseHove_On_Quality_TornadoChat'))

Text2 = WebUI.getText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/TornadoSpanStudystyle'))

println(Text2)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/TornadoSpanStudystyle'), Text2)

WebUI.mouseOver(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/Studies_By_Score_Dot_Circle'))

Text3 = WebUI.getText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/ScattePlot_ToolTip'))

WebUI.delay(2)

println(Text3)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/ScattePlot_ToolTip'), Text3)

WebUI.mouseOver(findTestObject('Object Repository/MouseOver_On_ScattePlot_7'))

Text4 = WebUI.getText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/ScattePlot_ToolTip'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/ScattePlot_ToolTip'), Text4)

println(Text4)

