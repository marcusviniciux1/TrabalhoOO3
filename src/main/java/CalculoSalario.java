public class CalculoSalario {

     private Funcionario funcionario;

     public Funcionario getFuncionario() {
          return funcionario;
     }

     public void setFuncionario(Funcionario funcionario) {
          this.funcionario = funcionario;
     }

     public float calcularSalarioFuncionario(){
          return this.funcionario.calcularSalario();
     }
}
