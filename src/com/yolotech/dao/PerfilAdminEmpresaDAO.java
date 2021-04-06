package com.yolotech.dao;

import com.yolotech.factory.ConnectionFactory;
import com.yolotech.model.PerfilAdminEmpresa;

import java.sql.*;

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
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1,perfilAdminEmpresa.getRazaoSocialEmpresa());
            stmt.setString(2,perfilAdminEmpresa.getCnpj());
            stmt.setString(3,perfilAdminEmpresa.getNomeFantasia());
            stmt.setString(4,perfilAdminEmpresa.getNumTelefone());
            stmt.setString(5,perfilAdminEmpresa.getNumCelularEmpresa());
            stmt.setString(6,perfilAdminEmpresa.getEnderecoEmpresa());
            stmt.setString(7,perfilAdminEmpresa.getSiteEmpresa());
            stmt.setDate(8, new Date(perfilAdminEmpresa.getDataCadastroEmpresa().getTimeInMillis()));
            stmt.setBoolean(9,perfilAdminEmpresa.isContaAtivaEmpresa());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void lista() {
        try {
            PreparedStatement stmt = connection.prepareStatement("select * from perfiladminempresa");

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String razaoSocial = rs.getString("razaoSocial");
                String cnpj = rs.getString("cnpj");
                String nomefantasia = rs.getString("nomeFantasia");
                String numtelefone = rs.getString("numTelefone");
                String numcelularempresa = rs.getString("numCelularEmpresa");
                String endereco = rs.getString("endereco");
                String site = rs.getString("siteEmpresa");
                Date datacadastroempresa = rs.getDate("dataCadastroEmpresa");
                boolean contaativaempresa = rs.getBoolean("contaAtivaEmpresa");

                System.out.println("Razão Social: " + razaoSocial);
                System.out.println("CNPJ: " + cnpj);
                System.out.println("Nome Fantasia: " + nomefantasia);
                System.out.println("Telefone: " + numtelefone);
                System.out.println("Celular: " + numcelularempresa);
                System.out.println("Endereço: " + endereco);
                System.out.println("Site: " + site);
                System.out.println("Data de Cadastro: " + datacadastroempresa);
                System.out.println();
            }

            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void edita() {

    }

    public void deleta() {

    }
}
