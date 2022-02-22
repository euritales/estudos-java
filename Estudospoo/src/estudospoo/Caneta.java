package estudospoo;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    int carga;
    boolean tampada;
    
    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cargas: " + this.carga);
        if(tampada == true){
            System.out.println("Tampada: Sim");
        }else{
            System.out.println("Tampada: Não");
        }        
    }
    
    public void rabiscar(){
//        boolean ordem = false;
        if(this.tampada == false){
            System.out.println("Rabiscos Rabiscos Rabiscos - Disse a caneta");
        }
        else{
//            System.out.println("Destampando...");;
//            destampar();
            System.out.println("Agora não consigo rabiscar! -Disse a caneta");
        };
    }
    
    void tampar(){
        if(this.tampada == true){
            System.out.println("Caneta já tampada");
        }else{
            this.tampada = true;
            System.out.println("Caneta tampada");
        }
       
    }
    void destampar(){
        if(this.tampada == false){
            System.out.println("Caneta já destampada");
        }else{
            this.tampada = false;
            System.out.println("Caneta destampada");
        }
    }
    
}
