/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package suellen.karolainy.gestaofolhapagamento;

import suellen.karolainy.gestaofolhapagamento.empregados.Horista;
import suellen.karolainy.gestaofolhapagamento.empregados.Mensalista;
import suellen.karolainy.gestaofolhapagamento.empregados.Comissionado;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
/**
 *
 * @author IFNMG
 */
public class GestaoFolhaPagamento {

    public static void main(String[] args) {
        
        Horista[] funcs1 = new Horista[2];
        Horista aAuxH;
        aAuxH = new Horista();
        aAuxH.setNome("Ana");
        System.out.println("Nome: " + aAuxH.getNome());
        aAuxH.setCpf(123L);
        System.out.println("CPF: " + aAuxH.getCpf());
        aAuxH.setEmail("AnaEmpresaX@gmail.com");
        System.out.println("Email: " + aAuxH.getemail());
        aAuxH.setCtps(277L);
        System.out.println("CTPS: " + aAuxH.getCtps());
        aAuxH.setMatricula(9845L);
        System.out.println("Matricula: " + aAuxH.getMatricula());
        aAuxH.setTelefone(38987564132L);
        System.out.println("Telefone: " + aAuxH.getTelefone());
        funcs1[0] = aAuxH;
        
        aAuxH = new Horista();
        aAuxH.setNome("Cecilia");
        System.out.println("Nome: " + aAuxH.getNome());
        aAuxH.setCpf(123L);
        System.out.println("CPF: " + aAuxH.getCpf());
        aAuxH.setEmail("CeiliaEmpresaX@gmail.com");
        System.out.println("Email: " + aAuxH.getemail());
        aAuxH.setCtps(277L);
        System.out.println("CTPS: " + aAuxH.getCtps());
        aAuxH.setMatricula(9845L);
        System.out.println("Matricula: " + aAuxH.getMatricula());
        aAuxH.setTelefone(38987564132L);
        System.out.println("Telefone: " + aAuxH.getTelefone());
        funcs1[1] = aAuxH;
        System.out.println("\n");
        
        
        Mensalista me = new Mensalista();
        me.setNome("João");
        System.out.println("Nome: " + me.getNome());
        me.setCpf(123L);
        System.out.println("CPF: " + me.getCpf());
        me.setEmail("JoãoEmpresaX@gmail.com");
        System.out.println("Email: " + me.getemail());
        me.setCtps(277L);
        System.out.println("CTPS: " + me.getCtps());
        me.setMatricula(9845L);
        System.out.println("Matricula: " + me.getMatricula());
        me.setTelefone(38987564132L);
        System.out.println("Telefone: " + me.getTelefone());
        System.out.println("\n");
        
        Comissionado[] funcs3 = new Comissionado[2];
        Comissionado eAuxC;
        eAuxC = new Comissionado();
        eAuxC.setNome("Luis");
        System.out.println("Nome: " + eAuxC.getNome());
        eAuxC.setCpf(123L);
        System.out.println("CPF: " + eAuxC.getCpf());
        eAuxC.setEmail("LuisEmpresaX@gmail.com");
        System.out.println("Email: " + eAuxC.getemail());
        eAuxC.setCtps(277L);
        System.out.println("CTPS: " + eAuxC.getCtps());
        eAuxC.setMatricula(9845L);
        System.out.println("Matricula: " + eAuxC.getMatricula());
        eAuxC.setTelefone(38987564132L);
        System.out.println("Telefone: " + eAuxC.getTelefone());
        funcs3[0] = eAuxC;
        System.out.println("\n");
        
        eAuxC = new Comissionado();
        eAuxC.setNome("Fernanda");
        System.out.println("Nome: " + eAuxC.getNome());
        eAuxC.setSalarioFixo(999.99);
        System.out.println("Salario Fixo: " +eAuxC.getSalarioFixo());
        eAuxC.setVenda(5000.00);
        System.out.println("Vendas: " + eAuxC.getVenda());
        eAuxC.setComissao(.05);
        System.out.println("Comissao: " + eAuxC.getComissao());
        funcs3[1] = eAuxC;
        
        double salarioComissionadoTotal = 0;
        for (Comissionado e : funcs3) {
            System.out.println("14 > " + e.getNome()
                    + " : R$ " + e.calcularSalario());
            salarioComissionadoTotal += e.calcularSalario();
        }
        // Cálculo da folha de pagamento total
        System.out.println("15 > R$ "
                + (salarioMensalistaTotal
                + salarioHoristaTotal
                + salarioComissionadoTotal));

        System.out.println("");
    }
}
