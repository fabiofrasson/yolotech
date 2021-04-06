package com.yolotech.view;

import com.yolotech.dao.PerfilAdminEmpresaDAO;
import com.yolotech.model.PerfilAdmin;
import com.yolotech.model.PerfilAdminEmpresa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

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

//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar c = Calendar.getInstance();
//        System.out.println("Data atual: " + sdf.format(c.getTime()));
//        c.set(Calendar.DAY_OF_MONTH, 3); //seta o dia para o dia 3
//        c.set(Calendar.MONTH, 11); //seta o mes para dezembro
//        System.out.println("Data alterada: " + sdf.format(c.getTime()));
//        c.add(Calendar.DAY_OF_MONTH, 10); //adiciona 10 dias a partir a ultima dada exibida
//        System.out.println("Data alterada + 10 dias: " + sdf.format(c.getTime()));

        PerfilAdminEmpresa perfiladminempresa = new PerfilAdminEmpresa(
                "Minha empresa LTDA ME", "09.551.794/0001-49", "" +
                "Minha Empresa de Tecnologia", "45 3027-6893",
                "45 99943-9105", "Rua Almirante Barroso, 59",
                "https://www.minhaempresatec.com.br", Calendar.getInstance(),
                true
        );

        PerfilAdminEmpresaDAO dao = new PerfilAdminEmpresaDAO();

        dao.adiciona(perfiladminempresa);
        dao.adiciona(perfiladminempresa);
        dao.adiciona(perfiladminempresa);
        dao.adiciona(perfiladminempresa);
        dao.adiciona(perfiladminempresa);

        System.out.println("Gravado!");

        dao.lista();
    }
}
