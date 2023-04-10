package banco;

public class Banco {

    public static void main(String[] args) {
        
        // instanciar o objeto
        ContaBanco conta1 = new ContaBanco();
        
        conta1.setNumConta(1111);
        conta1.setDono("Ana");
        conta1.abrirConta("CC");
        
        ContaBanco conta2 = new ContaBanco();
        
        conta2.setNumConta(1112);
        conta2.setDono("Sofia");
        conta2.abrirConta("CP");
        
        conta1.estadoAtual();
        conta2.estadoAtual();
        
        conta1.depositar(100);
        conta2.depositar(500);
        conta2.levantar(1000);
        
        conta1.estadoAtual();
        conta2.estadoAtual();
        
        conta1.fecharConta();
        conta1.levantar(150);
        conta1.fecharConta();
        
        conta1.estadoAtual();
        conta2.estadoAtual();
        
        conta2.pagarMensal();
        conta2.estadoAtual();
    } 
}
