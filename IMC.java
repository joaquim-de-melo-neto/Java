public class HeartRates{

  private String nome;
  private String sobrenome;
  private int dia;
  private int mes;
  private int ano;
  
  // Construtor
  public HeartRates(String nome, String sobrenome, int dia, int mes, int ano){
    this.nome = nome;
    this.sobrenome = sobrenome;
    if((mes==2 && dia<=28)||
			(mes<8 && mes!=2 && mes%2==0 && dia<=30)||
		  (mes<8 && mes!=2 && mes%2==1 && dia<=31)||
			(mes>=8 && mes%2==0 && dia<=31)||
			(mes>=8 && mes%2==1 && dia<=30)){
          this.dia = dia;
          this.mes = mes;
          this.ano = ano;
    }
  }
  
  // Cálculo de idade
  public int calcularIdade(int diaAtual, int mesAtual, int anoAtual){
    int idade = anoAtual - ano;
    if(mesAtual < mes || (mesAtual == mes && diaAtual < dia)) idade--;
    
    return idade;
  }
  
  // Cálculo da Frequência Cardíaca Máxima (FCM). 220 - idade.
  public int FCM(int diaAtual, int mesAtual, int anoAtual){
    return 220 - this.calcularIdade(diaAtual, mesAtual, anoAtual);
  }
  
  // Cálculo da Frequência Cardíaca Alvo (FCA). 50% a 85% da FCM.
  public String FCA(HeartRates object,int diaAtual, int mesAtual, int anoAtual){
    int fcm = object.FCM(diaAtual, mesAtual, anoAtual);
    float fcmMin = 0.5*fcm;
    float fcmMax = 0.85*fcm;
    
    String strFcmMin = Float.toString(fcmMin);
    String strFcmMax = Float.toString(fcmMax);
    
    String message = "O FCA está entre: ".concat(strFcmMin).concat(" e ").concat(strFcmMax);
    return message;
  }
  
  
