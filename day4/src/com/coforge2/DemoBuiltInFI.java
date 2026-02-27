package com.coforge2;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoBuiltInFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Supplier
		System.out.println("----------------Supplier FI Demo---------------------------------------");

		Supplier<String> strSupplier = ()-> "hello!".toUpperCase(); //Supplier will supply something the abstract method: '.get()'
		System.out.println(strSupplier.get());
		
		System.out.println("------------------------------------------------------");

		
		Supplier<Double> rndSup = ()->{
			double rndVal = Math.random();
			return rndVal;
		};
		System.out.println(rndSup.get());

		System.out.println("------------------------------------------------------");

		Supplier<Integer> otpSup =()-> {
			int otp = (int)(Math.random() * 10000);
			return otp;
		};
		
		System.out.println(otpSup.get());

		System.out.println("------------------------------------------------------");
		
		Supplier<String> evenSup = ()-> {
			StringBuilder st = new StringBuilder();
			for(int i=0 ; i<=10 ; i++) {
				if(i%2 == 0) {
					st.append(i);
				}
			}
			String evenVal = st.toString();
			return evenVal;
		};
		
		System.out.println(evenSup.get());
		
		System.out.println("------------------------------------------------------");
		System.out.println("-----------------Demo for Consumer FI-------------------------------------");

		//Consumer
		
		Consumer<Integer> factorialConsumer = (num) -> {
			int fact = 1;
			for(int i=1; i<=num; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
		};
		factorialConsumer.accept(5);
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("----------------Function FI Demo---------------------------------------");
		
		Function<Integer, String> isEvenOrOdd=(num)-> {
			if(num%2 == 0)return "Even";
			else return "Odd";
		};
		
		System.out.println(isEvenOrOdd.apply(11));
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println("----------------Predicate FI Demo---------------------------------------");	
		
		//Predicate : if condition is true returns true otherwise false
		
		Predicate<String> checkLen = (name)-> name.length() > 5;
		System.out.println(checkLen.test("Tourist"));
		
		
	}

}
