package com.exgen.testsuite;

import org.testng.annotations.Test;

import com.exgen.dataProvider.LoginData;
import com.exgen.po.HomePage;
import com.exgen.po.MenuBar;
import com.exgen.po.PatientPage;

public class TestSuite1 extends TestSetup{
	
	@Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class)
	public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
		wdu.type(HomePage.username_ip, user);
		wdu.type(HomePage.pwd_ip, pwd);
		wdu.click(HomePage.login_btn);
		wdu.mouseOver(MenuBar.patient_menu);
		wdu.click(MenuBar.newPatient_menu);
		wdu.selectByVisibleText(PatientPage.title_select, title);
		wdu.type(PatientPage.fname_ip, fname);
		wdu.type(PatientPage.lname_ip, lname);
	}
	
}
