package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.nt.service.IShoppingStore;

@Component
public class AfterAspectRunner implements CommandLineRunner {
	@Autowired
	private IShoppingStore store;

	@Override
	public void run(String... args) throws Exception {
		// invoke the method
		try {
			double billAmount = store.shopping(new String[] { "shirt", "pant", "belt" },
					new double[] { 25000.0, 2000.50, 850.50 });
			System.out.println(billAmount);
		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // catch

	}

}
