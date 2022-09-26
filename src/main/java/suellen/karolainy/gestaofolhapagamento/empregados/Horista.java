/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package suellen.karolainy.gestaofolhapagamento.empregados;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author IFNMG
 */
public class Horista {
    private Long cpf;
    private Long ctps;
    private Long matricula;
    private Long telefone;
    private String nome;
    private String email;
    private Double salarioHoristaTotal;

    public Double getSalarioHoristaTotal() {
        return salarioHoristaTotal;
    }

    public void setSalarioHoristaTotal(Double salarioHoristaTotal) {
        this.salarioHoristaTotal = salarioHoristaTotal;
    }
    
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
}
