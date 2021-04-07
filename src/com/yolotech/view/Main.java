package com.yolotech.view;

import com.yolotech.dao.PerfilAdminEmpresaDAO;
import com.yolotech.model.Empresa;
import com.yolotech.model.PerfilAdmin;
import com.yolotech.model.PerfilAdminEmpresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Main {
    public static <PefilAdminEmpresa> void main(String[] args) {

//        PerfilAdmin admin1 = new PerfilAdmin("fabiof", "123456", 1,
//               "Fabio", "Frasson", "45999439105");
//
//        PerfilAdmin admin2 = new PerfilAdmin("marseliz", "123456", 1,
//                "Marseli", "Zanon", "45991085839");
//
//        PerfilAdmin admin3 = new PerfilAdmin("wilianb", "123456", 1,
//                "Wilian", "Bueno", "45999004648");
//
//        admin1.setContaAtivaAdmin(true);
//        admin1.setDataCadastroAdmin(new Date());
//        admin1.setUltimoLoginAdmin(new Date());
//
//        admin2.setContaAtivaAdmin(true);
//        admin2.setDataCadastroAdmin(new Date());
//        admin2.setUltimoLoginAdmin(new Date());
//
//        admin3.setContaAtivaAdmin(true);
//        admin3.setDataCadastroAdmin(new Date());
//        admin3.setUltimoLoginAdmin(new Date());
//
//        ArrayList<PerfilAdmin> perfisAdmin = new ArrayList<PerfilAdmin>();
//
//        perfisAdmin.add(admin1);
//        perfisAdmin.add(admin2);
//        perfisAdmin.add(admin3);
//
//        System.out.println(perfisAdmin);

        PerfilAdminEmpresa perfiladminempresa = new PerfilAdminEmpresa(
                "Minha empresa LTDA ME", "09.551.794/0001-49", "" +
                "Minha Empresa de Tecnologia", "45 3027-6893",
                "45 99943-9105", "Rua Almirante Barroso, 59",
                "https://www.minhaempresatec.com.br", "2021-04-06",
                true
        );

        PerfilAdminEmpresa perfiladminempresa2 = new PerfilAdminEmpresa(
                "Minha empresa LTDA ME", "09.551.794/0001-49", "" +
                "Minha Empresa de Tecnologia", "45 3027-6893",
                "45 99943-9105", "Rua Almirante Barroso, 59",
                "https://www.minhaempresatec.com.br", "2021-04-06",
                true
        );

        PerfilAdminEmpresa perfiladminempresa3 = new PerfilAdminEmpresa(
                "Minha empresa LTDA ME", "09.551.794/0001-49", "" +
                "Minha Empresa de Tecnologia", "45 3027-6893",
                "45 99943-9105", "Rua Almirante Barroso, 59",
                "https://www.minhaempresatec.com.br", "2021-04-06",
                true
        );

        PerfilAdminEmpresa perfiladminempresa4 = new PerfilAdminEmpresa(
                "Minha empresa LTDA ME", "09.551.794/0001-49", "" +
                "Minha Empresa de Tecnologia", "45 3027-6893",
                "45 99943-9105", "Rua Almirante Barroso, 59",
                "https://www.minhaempresatec.com.br", "2021-04-06",
                true
        );

        PerfilAdminEmpresa perfiladminempresa5 = new PerfilAdminEmpresa(
                "Minha empresa LTDA ME", "09.551.794/0001-49", "" +
                "Minha Empresa de Tecnologia", "45 3027-6893",
                "45 99943-9105", "Rua Almirante Barroso, 59",
                "https://www.minhaempresatec.com.br", "2021-04-06",
                true
        );

        PerfilAdminEmpresaDAO dao = new PerfilAdminEmpresaDAO();

        dao.adiciona(perfiladminempresa);
        dao.adiciona(perfiladminempresa2);
        dao.adiciona(perfiladminempresa3);
        dao.adiciona(perfiladminempresa4);
        dao.adiciona(perfiladminempresa5);

        System.out.println("Registro gravado!");

        List<Empresa> empresas = dao.lista();

        for (Empresa empresa : empresas) {
//            System.out.println();
            System.out.println("-------------------------------------------");
            System.out.println("Razão Social: " + empresa.getRazaoSocial());
            System.out.println("CNPJ: " + empresa.getCnpj());
            System.out.println("Nome de Fantasia: " + empresa.getNomeFantasia());
            System.out.println("Número de telefone: " + empresa.getNumTelefone());
            System.out.println("Celular: " + empresa.getNumCelularEmpresa());
            System.out.println("Endereço: " + empresa.getEndereco());
            System.out.println("Site: " + empresa.getSiteEmpresa());
            System.out.println("Data de criação do cadastro: " + empresa.getDataCadastroEmpresa());
            System.out.println("Cadastro ativo: " + empresa.isContaAtivaEmpresa());
        }
    }
}
