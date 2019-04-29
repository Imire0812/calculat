package calculator.com;

public class ReadClass {
	
	static CalcClass calcClass = new CalcClass();

	
	 public static String opn(String sIn) throws Exception {
	        StringBuilder sbStack = new StringBuilder(""), sbOut = new StringBuilder("");
	        char cIn, cTmp;

	        for (int i = 0; i < sIn.length(); i++) {
	            cIn = sIn.charAt(i);
	            if (calcClass.isOp(cIn)) {
	                while (sbStack.length() > 0) {
	                    cTmp = sbStack.substring(sbStack.length()-1).charAt(0);
	                    if (calcClass.isOp(cTmp) && (calcClass.opPrior(cIn) <= calcClass.opPrior(cTmp))) {
	                        sbOut.append(" ").append(cTmp).append(" ");
	                        sbStack.setLength(sbStack.length()-1);
	                    } else {
	                        sbOut.append(" ");
	                        break;
	                    }
	                }
	                sbOut.append(" ");
	                sbStack.append(cIn);
	            } else {
	                // ���� ������ �� �������� - ��������� � �������� ������������������
	                sbOut.append(cIn);
	            }
	        }

	        // ���� � ����� �������� ���������, ��������� �� � ������� ������
	        while (sbStack.length() > 0) {
	            sbOut.append(" ").append(sbStack.substring(sbStack.length()-1));
	            sbStack.setLength(sbStack.length()-1);
	        }

	        return  sbOut.toString();
	    }
	   
	}
	
