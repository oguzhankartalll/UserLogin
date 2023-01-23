import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		/*
		Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
		eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip
		, şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
		 */

		String password,userName,choose,newPassword;

		Scanner kb = new Scanner(System.in);

		System.out.print("Enter your user name:");
		userName = kb.nextLine();

		System.out.print("Enter your password:");
		password = kb.nextLine();

		if (userName.equals("Admin") && password.equals("12345"))
			System.out.println("You have succesfully logged into system.");

		else
		{
			System.out.print("You entered your password incorrectly. Do you want to reset it Y/N:");
			choose = kb.nextLine();

			if (choose.equals("Y") || choose.equals("y"))
			{
				System.out.print("Enter your new password:");
				newPassword = kb.nextLine();

				if (newPassword.equals("12345"))
				{
					System.out.println("You entered your old password, please try again.");

					System.out.print("Enter your new password:");
					newPassword = kb.nextLine();

					System.out.println("Your new password has been created"  + " " + newPassword);
				}
			}
			else if (choose.equals("N") || choose.equals("n"))
				System.out.println("Password not changed.");
			else
				System.out.println("Incorrect operation.");
		}
	}
}