package com.tech.Main;

import java.util.Scanner;
import com.tech.Operation.oparation;

public class Main {

	public static void main(String[] args) {

		oparation opr = new oparation();

		Scanner sc2 = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Choose option:- \n 1.CreateAccount \n 2.ShowAccout \n 3.depositMoney"
					+ " \n 4.withdrawMoney \n 5.BalanceCheck \n6.TransferMoney \n7.GetAccDetails");
			int choice = sc2.nextInt();
			switch (choice) {
			case 1:
				opr.createAccount();

				break;
			case 2:
				opr.showAccount();

				break;
			case 3:
				opr.depositMoney();
				break;
			case 4:
				opr.withdrawMoney();

				break;
			case 5:
				opr.balanceCheck();

				break;
			case 6:
				opr.moneyTransfer();
				break;
			case 7:
				opr.get();
				break;

			default:
				System.out.println("Choose correct option");

			}

		}

	}

}
