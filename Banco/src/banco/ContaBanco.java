package banco;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public void estadoAtual() {
        System.out.println("---------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("---------------------------------");
    }
    
    //metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            this.setSaldo(50);
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso em nome de " + this.getDono());
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta de " + this.getDono() + " não pode ser fechada. Ainda tem saldo maior que 0.");
        } else if (this.getSaldo() < 0){
            System.out.println("A conta de " + this.getDono() + " está em débito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() + " fechada com sucesso.");
        }
    }
    
    public void depositar(float v){
        
        // se o status == true
        if (this.getStatus()) {
            // this.saldo = this.saldo + v; - que é o mesmo que:
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de "+ this.getDono());
        } else {
            System.out.println("Impossível depositar numa conta inexistente.");
        }
    }
    
    public void levantar(float v){
        
         // se o status == true
         if (this.getStatus()) {
             if (this.getSaldo() >= v) {
                 this.setSaldo(this.getSaldo() - v);
                 System.out.println("Levantamento efetuado com sucesso na conta de " + this.getDono());
             } else {
                 System.out.println("Saldo insuficiente para efetuar levantamento na conta de " + this.getDono());
             }
         } else {
             System.out.println("Conta inexistente.");
         }
    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
           v = 12; 
        } else if (this.getTipo() == "CP") {
           v = 20;
        }
        
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta inexistente.");
        }
    }
    
    //construtor
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    // getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
