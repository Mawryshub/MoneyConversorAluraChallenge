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

		String moneyAmountString = JOptionPane.showInputDialog("Enter the amount in " + moneyType + ": ");
		double moneyAmountDouble = Double.parseDouble(moneyAmountString);
		double moneyTypeToPesos = moneyAmountDouble * moneyValueList1Jul2023.get(moneyType);
		String message = "those are " + moneyTypeToPesos;
		JOptionPane.showMessageDialog(null, message);
	}

	static void pesosToOther(String moneyType) {
		Dictionary<String, Double> moneyValueList1Jul2023 = new Hashtable<>();
		moneyValueList1Jul2023.put("USD", 256.45);
		moneyValueList1Jul2023.put("EUR", 280.09);
		moneyValueList1Jul2023.put("YEN", 1.78);
		moneyValueList1Jul2023.put("REAL", 53.54);

		String pesosAmountString = JOptionPane.showInputDialog("Enter the amount in " + moneyType + ": ");
		double pesosAmountDouble = Double.parseDouble(pesosAmountString);
		double pesosToMoneyType = pesosAmountDouble / moneyValueList1Jul2023.get(moneyType);
		String message = "those are " + pesosToMoneyType;
		JOptionPane.showMessageDialog(null, message);
	}

	static void conversorMethod() {
		String WelcomeMessage = "hello, this here is a money conversor from ARS pesos and to ARS pesos";
		JOptionPane.showMessageDialog(null, WelcomeMessage);

		Object[] possibleValues = { "USD to ARS", "EUR to ARS", "YEN to ARS", "REAL to ARS", "ARS to USD", "ARS to EUR",
				"ARS to YEN", "ARS to REAL" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
				null, possibleValues, possibleValues[0]);

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

	static void celciousToFahrenheit() {
		String celciousString = JOptionPane.showInputDialog("Enter the celcius temperature: ");
		double celciousDouble = Double.parseDouble(celciousString);
		double conversion = (celciousDouble * 9 / 5) + 32;
		String message = "the amount of " + celciousDouble + "°C to fahrenheit is: " + conversion + "°F";
		JOptionPane.showMessageDialog(null, message);
	}

	static void celciousToKelvin() {
		String celciousString = JOptionPane.showInputDialog("Enter the celcius temperature: ");
		double celciousDouble = Double.parseDouble(celciousString);
		double conversion = celciousDouble + 273.15;
		String message = "the amount of " + celciousDouble + "°C to kelvin is: " + conversion + "°K";
		JOptionPane.showMessageDialog(null, message);
	}

	static void kelvinToCelcious() {
		String kelvinString = JOptionPane.showInputDialog("Enter the kelvin temperature: ");
		double kelvinDouble = Double.parseDouble(kelvinString);
		double conversion = kelvinDouble + 273.15;
		String message = "the amount of " + kelvinDouble + "°K to celcious is: " + conversion + "°C";
		JOptionPane.showMessageDialog(null, message);
	}

	static void kelvinToFahrenheit() {
		String kelvinString = JOptionPane.showInputDialog("Enter the kelvin temperature: ");
		double kelvinDouble = Double.parseDouble(kelvinString);
		double conversion = (kelvinDouble * 9 / 5) - 459.67;
		String message = "the amount of " + kelvinDouble + "°K to fahrenheit is: " + conversion + "°F";
		JOptionPane.showMessageDialog(null, message);
	}

	static void fahrenheitToKelvin() {
		String fahrenheitString = JOptionPane.showInputDialog("Enter the fahrenheit temperature: ");
		double fahrenheitDouble = Double.parseDouble(fahrenheitString);
		double conversion = (fahrenheitDouble + 459.67) * 5 / 9;
		String message = "the amount of " + fahrenheitDouble + "°F to Kelvin is: " + conversion + "°K";
		JOptionPane.showMessageDialog(null, message);
	}

	static void fahrenheitToCelcious() {
		String fahrenheitString = JOptionPane.showInputDialog("Enter the fahrenheit temperature: ");
		double fahrenheitDouble = Double.parseDouble(fahrenheitString);
		double conversion = (fahrenheitDouble - 32) * 5 / 9;
		String message = "the amount of " + fahrenheitDouble + "°F to Celcious is: " + conversion + "°C";
		JOptionPane.showMessageDialog(null, message);
	}

	static void tempConversorMethod() {
		String WelcomeMessage = "hello, this here is a temperature conversor";
		JOptionPane.showMessageDialog(null, WelcomeMessage);

		Object[] possibleValues = { "Celcious (°C) to Fahrenheit (°F)", "Celcious (°C) to Kelvin (°K)",
				"Fahrenheit (°F) to Celcious (°C)", "Fahrenheit (°F) to Kelvin (°K)", "Kelvin (°K) to Celcious (°C)",
				"Kelvin (°K) to Fahrenheit (°F)" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE,
				null, possibleValues, possibleValues[0]);

		if (selectedValue == "Celcious (°C) to Fahrenheit (°F)") {
			celciousToFahrenheit();
		} else if (selectedValue == "Celcious (°C) to Kelvin (°K)") {
			celciousToKelvin();
		} else if (selectedValue == "Fahrenheit (°F) to Celcious (°C)") {
			fahrenheitToCelcious();
		} else if (selectedValue == "Fahrenheit (°F) to Kelvin (°K)") {
			fahrenheitToKelvin();
		} else if (selectedValue == "Kelvin (°K) to Celcious (°C)") {
			kelvinToCelcious();
		} else if (selectedValue == "Kelvin (°K) to Fahrenheit (°F)") {
			kelvinToFahrenheit();
		}
	}

	public static void main(String[] args) {

		boolean keepUsingApp = true;

		while (keepUsingApp) {
			Object[] mainMenu = { "Money conversor", "Temperature conversor" };
			
			Object selectedValue = JOptionPane.showInputDialog(null, "Choose one", "Input",
					JOptionPane.INFORMATION_MESSAGE, null, mainMenu, mainMenu[0]);
			System.out.println(selectedValue);

			if (selectedValue == "Money conversor") {
				conversorMethod();
			} else if (selectedValue == "Temperature conversor") {
				tempConversorMethod();
			} else {
				keepUsingApp = false;
				break;
			}
			
			int exitOption = JOptionPane.showConfirmDialog(null,
		             "Would you like to keep using the app?", "choose one", JOptionPane.YES_NO_OPTION);
			System.out.println(exitOption);
			if (exitOption == 1) {
				keepUsingApp = false;
			}
		}
		

	}

}
