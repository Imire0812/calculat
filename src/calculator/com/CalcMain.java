package calculator.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcMain {
	static CalcClass calcClass = new CalcClass();
	static ReadClass readClass = new ReadClass();
	public static void main(String[] args) {
		
			CalcMain calcMain = new CalcMain();
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	        String sIn;

	        try {
	            System.out.println("Поддерживаются цифры, операции +,-,*,/,^,%: ");
	            sIn = d.readLine();
	            sIn = readClass.opn(sIn);
	            System.out.println(calcClass.calculate(sIn));
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
			return;
	    }
	}
		