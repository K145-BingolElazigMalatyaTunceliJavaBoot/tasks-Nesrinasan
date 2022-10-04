package ucuncuhafta.cmt.polimorfizm.personhiyerarsi;

public class Client {
    public static void main(String[] args) {

        MaasHesaplamaService maasHesaplamaService = new MaasHesaplamaService();
        Employee employee = new Engineer();
        employee.setCalistigiYil(6);
        maasHesaplamaService.maasHesapla(employee);

        Manager emloyee = new Manager();
        emloyee.setCalistigiYil(6);
        emloyee.setAdi("Mahmut");
        maasHesaplamaService.maasHesapla(emloyee);

        int i = (int) 5l; //downcasting


    }

}
