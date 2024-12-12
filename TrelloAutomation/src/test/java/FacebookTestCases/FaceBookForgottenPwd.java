package FacebookTestCases;

import org.testng.annotations.Test;

public class FaceBookForgottenPwd {
	@Test(groups = { "system", "usability", "functional", "compatability" })
	public void searchForExistingAccountWithPhNum() {
		System.out.println("searchForExistingAccountWithPhNum");
	}

	@Test(groups = { "system", "usability", "functional", "compatability" })
	public void searchForExistingAccountWithEmail() {
		System.out.println("searchForExistingAccountWithEmail");
	}

	@Test(groups = { "integration", "system", "functional" })
	public void loginWithForgottenPwdpage() {
		System.out.println("loginWithForgottenPwdpage");
	}

}
