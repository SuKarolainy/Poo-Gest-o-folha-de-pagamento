/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suellen.karolainy.gestaofolhapagamento.empregados;

/**
 *
 * @author IFNMG
 */
public class Comissionado {
    private Long cpf;
    private Long ctps;
    private Long matricula;
    private Long telefone;
    private String nome;
    private String email;

    public Long getCpf(){
        return cpf;
    }
    public void setCpf(Long cpf){
        this.cpf = cpf;
    }
    public Long getCtps(){
        return ctps;
    }
    public void setCtps(Long ctps){
        this.ctps = ctps;
    }
    public Long getMatricula(){
        return matricula;
    }
    public void setMatricula(Long matricula){
        this.matricula = matricula;
    }
    public long getTelefone(){
        return telefone;
    }
    public void setTelefone(Long telefone){
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        if(nome.length()>45){
            this.nome = nome.substring(0,45);
        }else{
            this.nome = nome;}
    }
    public String getemail(){
        return email;
    }
    public void setEmail(String email){
        if(email.length()>250){
            this.email = email.substring(0,250);
        }else{
        this.email = email;}
    }
    
    private Double salarioFixo;
    private Double venda;
    private Double comissao;
    private Double salarioComissionadoTotal;
    private Double calcularSalario;
    
    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
    public Double getSalarioComissionadoTotal() {
        return salarioComissionadoTotal;
    }

    public void setSalarioComissionadoTotal(Double salarioComissionadoTotal) {
        this.salarioComissionadoTotal = salarioComissionadoTotal;
    }
    public Double getCalcularSalario() {
        return calcularSalario;
    }

    public void setCalcularSalario(Double calcularSalario) {
        this.calcularSalario = salarioFixo + venda + comissao;
    }
    @Override
    public double calcularSalario() {
        return salarioFixo + venda * comissao;
    }
}
