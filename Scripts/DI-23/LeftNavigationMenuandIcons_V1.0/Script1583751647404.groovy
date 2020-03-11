import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

//Open Browser
WebUI.openBrowser('https://dev.trialoversight.io/login')

//Enter UserName and Password
WebUI.click(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Click_On_The_Log_In_Link_On_PopUp'))

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Enter_UserName_On_The_ERT_Global_Account'), 
    'mahesh.dugganaboina@ert.com')

WebUI.setEncryptedText(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Enter_PassWord_On_The_ERT_Global_Account'), 
    'llXc+NAkbb5WPciBcVyt7A==')

WebUI.click(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Click_On_Login_Button'))

//Selecting Instance
WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Clicking_Instance_Arrow'))

WebUI.scrollToElement(findTestObject('THE_ERT_GLOBAL_ACCOUNT.OR/Page_The ERT Global Account/Test'), 0)

WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Selecting_Instance'))

//.getCssValue("colour"))
//println(colour)
WebUI.click(findTestObject('SELECTING_INSTANCE.OR/Page_Trial Oversight/Clicking_On_SelectButton_Of_Instance'))

// Clicking on Gear Icon
WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Gear_Icon'))

WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Validation_On_OrganizationSettings'), 'Organization Settings')

Text = WebUI.getText(findTestObject('Page_Portfolio/Page_Trial Oversight/Validation_On_OrganizationSettings'))

// Verification of Text
if (Text == 'Organization Settings') {
    println(Text)

    println('Text is Matched')
} else {
    println('Text is not Matched')
}

//Clicking on DashBoard
WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_My_Dashboard'))

WebUI.delay(2)

//Clicking on Hamburger
WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Hamburger_Icon'))

WebUI.delay(2)

not_run: WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_My_Dashboard'))

//println('AA')
WebUI.verifyElementText(findTestObject('Page_Portfolio/Page_Trial Oversight/Verifying_Page_Is_In_Portfolio'), 'Portfolio')

PortfolioTextVerification = WebUI.getText(findTestObject('Page_Portfolio/Page_Trial Oversight/Verifying_Page_Is_In_Portfolio'))

if (PortfolioTextVerification == 'Portfolio') {
    println(PortfolioTextVerification)

    println('Text is Correct')
} else {
    println('Text is not Matched')
}

//println('BB')
not_run: WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_HamBurger_Icon_From_Portfolio'))

not_run: WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Gear_Icon'))

//println('CC')
WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Hamburger_Icon'))

//println('DD')
WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Gear_Icon'))

WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Hamburger_Icon'))

WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_My_Dashboard'))

//println('EE')
//WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Gear_Icon'))
WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Hamburger_Icon'))

WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_Close_Button_LeftPanel'))

println('EE')

WebUI.delay(2)

//WebUI.refresh()
//WebUI.click(findTestObject('Page_Portfolio/Page_Trial Oversight/Clicking_On_My_Dashboard'))
MouseHover_On_Dashboard = WebUI.getAttribute(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/Clicking_On_My_Portfolio'), 
    'ng-reflect-message')

println(MouseHover_On_Dashboard)

WebUI.delay(2)

WebUI.refresh()

MouseHover_On_Settings = WebUI.getAttribute(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/Clicking_On_Gear_Icon'), 
    'ng-reflect-message')

println(MouseHover_On_Settings)

