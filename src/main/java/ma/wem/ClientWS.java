package ma.wem;

import javax.BanqueService;
import javax.BanqueWS;
import javax.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub=new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(8400));
        Compte cp=stub.getCompte(3);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());

    }
}
