
public class Empleato {
      private String nomempl;
	private String numempl;
	private int antiguitat;
	private String carrec;
	

	public void inicialitza(String nom, String codi, int ant, String sino) {
		setNomempl(nom);
		setNumempl(codi);
		setAntiguitat(ant);
		setCarrec(sino);
	}
	
	public static void main(String[] args) {
		Prima p = new Prima();
		Empleato empl = new Empleato();
		empl.inicialitza("Aurora","002W56",13,"N");
int prima = p.calculalaPrima(empl);
        if (prima == 0)  		System.out.println("Error: càrrec incorrecte");
        else if (prima == -1) 	System.out.println("Error: antiguitat incorrecte");
        else
        System.out.println("La prima que li correspon a "+empl.nomempl+" és de "+prima+" Euros.");
	}

	public String getCarrec() {
		return carrec;
	}

	public void setCarrec(String carrec) {
		this.carrec = carrec;
	}

	public int getAntiguitat() {
		return antiguitat;
	}

	public void setAntiguitat(int antiguitat) {
		this.antiguitat = antiguitat;
	}


	public void setNumempl(String numempl) {this.numempl = numempl;}
	public void setNomempl(String nomempl) {this.numempl = nomempl;}
	
}

