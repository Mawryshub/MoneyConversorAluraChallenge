import javax.swing.JOptionPane;
import java.util.Dictionary;
import java.util.Hashtable;




public class conversorMoneda {
	
	
	
	static void conversorToPesos(String moneyType) {
		Dictionary<String, Double> moneyValueList1Jul2023 = new Hashtable<>();
		moneyValueList1Jul2023.put("USD", 256.45);
		moneyValueList1Jul2023.put("EUR", 280.09);
		moneyValueList1Jul2023.put("YEN", 1.78);
		moneyValueList1Jul2023.put("REAL", 53.54);
		
		String moneyAmountString = JOptionPane.showInputDialog("Enter the amount in "+moneyType+": ");
		double moneyAmountDouble = Double.parseDouble(moneyAmountString);
		double moneyTypeToPesos = moneyAmountDouble * moneyValueList1Jul2023.get(moneyType);
		String message = "those are "+ moneyTypeToPesos;
		JOptionPane.showMessageDialog(null, message);
	}
	
	static void pesosToOther(String moneyType) {
		Dictionary<String, Double> moneyValueList1Jul2023 = new Hashtable<>();
		moneyValueList1Jul2023.put("USD", 256.45);
		moneyValueList1Jul2023.put("EUR", 280.09);
		moneyValueList1Jul2023.put("YEN", 1.78);
		moneyValueList1Jul2023.put("REAL", 53.54);
		
		String pesosAmountString = JOptionPane.showInputDialog("Enter the amount in "+moneyType+": ");
		double pesosAmountDouble = Double.parseDouble(pesosAmountString);
		double pesosToMoneyType = pesosAmountDouble / moneyValueList1Jul2023.get(moneyType);
		String message = "those are "+ pesosToMoneyType;
		JOptionPane.showMessageDialog(null, message);
	}
	
	public static void main(String[] args) {
		
		
		
		String WelcomeMessage = "hello, this here is a money conversor from ARS pesos and to ARS pesos";
		JOptionPane.showMessageDialog(null, WelcomeMessage);
		
		
		
		Object[] possibleValues = { "USD to ARS", "EUR to ARS", "YEN to ARS", "REAL to ARS", "ARS to USD", "ARS to EUR", "ARS to YEN", "ARS to REAL" };

		Object selectedValue = JOptionPane.showInputDialog(null,
		             "Choose one", "Input",
		             JOptionPane.INFORMATION_MESSAGE, null,
		             possibleValues, possibleValues[0]);
		 
		if (selectedValue == "USD to ARS") {
			conversorToPesos("USD");
		} else if (selectedValue == "EUR to ARS") {
			conversorToPesos("EUR");
		} else if (selectedValue == "YEN to ARS") {
			conversorToPesos("YEN");
		} else if (selectedValue == "REAL to ARS") {
			conversorToPesos("REAL");
		} else if (selectedValue == "ARS to USD") {
			pesosToOther("USD");
		} else if (selectedValue == "ARS to EUR") {
			pesosToOther("EUR");
		} else if (selectedValue == "ARS to YEN") {
			pesosToOther("YEN");
		} else if (selectedValue == "ARS to REAL") {
			pesosToOther("REAL");
		}
		
	}
	
}
 