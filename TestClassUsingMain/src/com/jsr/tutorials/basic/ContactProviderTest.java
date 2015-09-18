package com.jsr.tutorials.basic;

import java.util.List;

public class ContactProviderTest {

	public static void main(String[] args) {
		 List<Contact> model = ContactProvider.createInitialModel();
		 //Check model size
		 if (model.size()!=4){
		      throw new RuntimeException("FAIL: Contact Provider total contacts should be 4");
		    } else {
		      System.out.println("Correct model size");
		    }
		 //Test to see if Ann Anderson 111-111-1111 is in ContactProvider
		 boolean foundAnn = false;
		 for (Contact c : model){
			 if(c.getFirstName().equalsIgnoreCase("Ann") &&
					 c.getLastName().equalsIgnoreCase("Anderson") &&
					 c.getPhone().equalsIgnoreCase("111-111-1111"))
				 foundAnn = true;
		 }
		 if (foundAnn){
			 System.out.println("Found Ann!");
		 } else {
			 throw new RuntimeException("FAIL: Contact Ann Anderson not found");
		 }

	}

}
