public class Date{
	private int dia;
	private int mes;
	private int ano;

	// Construtor
	public Date(int dia, int mes, int ano){
			if((mes==2 && dia<=28)||
			(mes<8 && mes!=2 && mes%2==0 && dia<=30)||
		    	(mes<8 && mes!=2 && mes%2==1 && dia<=31)||							(mes>=8 && mes%2==0 && dia<=31)||
			(mes>=8 && mes%2==1 && dia<=30)){
				this.dia = dia;
				this.mes = mes;
				this.ano = ano;
			}
			else 
				System.out.println("Informe uma data válida.");
	}

	// Getters
	public int getDia(){
		return dia;
	}

	public int getMes(){
		return mes;
	}

	public int getAno(){
		return ano;
	}

	// Setters
	public void setDia(int x){
		dia = x;
	}

	public void setMes(int x){
		mes = x;
	}

	public void setAno(int x){
		ano = x;
	}

	public void display(){
		System.out.printf("%d/%d/%d\n\n",mes,dia,ano);
	}
}			