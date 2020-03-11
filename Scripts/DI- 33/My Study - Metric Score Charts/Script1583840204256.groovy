import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.support.Color

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.xalan.internal.xsltc.compiler.Text

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

WebUI.click(findTestObject('Page_Portfolio/Study_Filter'))

WebUI.sendKeys(findTestObject('Page_Portfolio/Study_Filter'), 'Comparison')

WebUI.click(findTestObject('Page_Portfolio/Clicking_On_Study'))

Text2 = WebUI.verifyElementText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/Verfying_Text_On_Compliance_Metrics_By_Score'), 'COMPLIANCE METRICS BY SCORE')

println(Text2)

Text1 = WebUI.verifyElementText(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/Verfying_Text_On_Quality_Metrics_By-Score'),'QUALITY METRICS BY SCORE')

println(Text1)


Compliance_RectBar_Color = WebUI.getCSSValue(findTestObject('Object Repository/Page_Portfolio/Page_Trial Oversight/Compliance_RectBar'), 'color')

println(Compliance_RectBar_Color)

WebUI.verifyEqual(Compliance_RectBar_Color, 'rgba(73, 74, 75, 1)')


color = WebUI.getAttribute(findTestObject('Page_Portfolio/Page_Trial Oversight/Quality_RectBar_Color'), 'fill')

  /* X = WebUI.getCSSValue(findTestObject('Page_Portfolio/Page_Trial Oversight/Quality_RectBar_Color'), 'X')
println(X)*/

String RGBcolor = Color.fromString(color).asRgba()

println(RGBcolor)

WebUI.verifyEqual(RGBcolor, 'rgba(147, 50, 142, 1)')
















