package FacebookTestCases;

import org.testng.annotations.Test;

public class FaceBookSignUp {
	@Test(groups = {"integration","functional","system"})
	public void createNewAccount() {
		System.out.println("createNewAccount");
	}
	@Test(groups = {"integration","functional","system"})
	public void existingUserLogin() {
		System.out.println("existingUserLogin");
	}
	@Test(groups = {"usability","system","integration","functional"})
	public void createAccWithCustomAsGender() {
		System.out.println("createAccWithCustomAsGender");
	}
	@Test(groups = {"usability","system","integration","functional"})
	public void createAccWithMaleAsGender() {
		System.out.println("createAccWithMaleAsGender");
	}
	@Test(groups = {"usability","system","integration","functional"})
	public void createAccWithFemaleAsGender() {
		System.out.println("createAccWithFemaleAsGender");
	}

}
