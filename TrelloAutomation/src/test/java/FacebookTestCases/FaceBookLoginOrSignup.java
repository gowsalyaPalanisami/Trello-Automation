package FacebookTestCases;

import org.testng.annotations.Test;

public class FaceBookLoginOrSignup {
	@Test(groups = { "functional", "integration" })
	public void signUp()
	{
		System.out.println("signUp");
	}
	@Test(groups = { "integration", "functional", "system" })
	public void reSetPwd() {
		System.out.println("reSetPwd");
	}
	@Test(groups = { "integration", "usability", "compatability", "localization" })
	public void loginInKannada() {
		System.out.println("loginInKannada");
	}
	@Test(groups = { "integration", "usability", "compatability", "localization" })
	public void instagramLogin() {
		System.out.println("instagramLogin");
	}
	@Test(groups = { "integration", "functional", "system", "sanity" })
	public void loginWithForgottenPwdpage() {
		System.out.println("loginWithForgottenPwdpage");
	}

}


