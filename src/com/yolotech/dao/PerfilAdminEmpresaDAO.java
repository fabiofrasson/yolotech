package com.yolotech.dao;

import com.yolotech.factory.ConnectionFactory;
import com.yolotech.model.Empresa;
import com.yolotech.model.PerfilAdminEmpresa;
import net.bytebuddy.asm.Advice;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PerfilAdminEmpresaDAO {
    private Connection connection;

    public PerfilAdminEmpresaDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(PerfilAdminEmpresa perfilAdminEmpresa) {
        String sql = "insert into perfiladminempresa " +
                "(razaoSocial, cnpj, nomeFantasia, numTelefone, numCelularEmpresa, " +
                "endereco, siteEmpresa, dataCadastroEmpresa, contaAtivaEmpresa)" +
                " values (?,?,?,?,?,?,?,?,?);";

        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
//            LocalDate localdate = LocalDate.now();

            stmt.setString(1,perfilAdminEmpresa.getRazaoSocialEmpresa());
            stmt.setString(2,perfilAdminEmpresa.getCnpj());
            stmt.setString(3,perfilAdminEmpresa.getNomeFantasia());
            stmt.setString(4,perfilAdminEmpresa.getNumTelefone());
            stmt.setString(5,perfilAdminEmpresa.getNumCelularEmpresa());
            stmt.setString(6,perfilAdminEmpresa.getEnderecoEmpresa());
            stmt.setString(7,perfilAdminEmpresa.getSiteEmpresa());
            stmt.setString(8, perfilAdminEmpresa.getDataCadastroEmpresa());
            stmt.setBoolean(9,perfilAdminEmpresa.isContaAtivaEmpresa());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Empresa> lista() {
        try {
            List<Empresa> empresas = new ArrayList<Empresa>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from perfiladminempresa");
//            LocalDate localdate = LocalDate.now();
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Empresa empresa = new Empresa();
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setCnpj(rs.getString("cnpj"));
                empresa.setNomeFantasia(rs.getString("nomeFantasia"));
                empresa.setNumTelefone(rs.getString("numTelefone"));
                empresa.setNumCelularEmpresa(rs.getString("numCelularEmpresa"));
                empresa.setEndereco(rs.getString("endereco"));
                empresa.setSiteEmpresa(rs.getString("siteEmpresa"));
                empresa.setDataCadastroEmpresa(rs.getString("dataCadastroEmpresa"));
                empresa.setContaAtivaEmpresa(rs.getBoolean("contaAtivaEmpresa"));

                empresas.add(empresa);
            }
            rs.close();
            stmt.close();
            return empresas;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void edita() {

    }

    public void deleta() {

    }
}
