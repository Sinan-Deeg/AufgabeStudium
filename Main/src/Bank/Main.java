package informatik.bank;

import de.hs_mannheim.informatik.bank.facade.Banksystem;
import de.hs_mannheim.informatik.bank.ui.UI;

public class Main {

	public static void main(String[] args) {
		Banksystem bs = new Banksystem("Spaﬂkasse Mannheim");
		UI ui = new UI(bs);
	}

}
