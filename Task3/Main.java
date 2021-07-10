package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Facultity fizmat = new Facultity();
        List<Cafedra> cafedras=new ArrayList<>();
        Cafedra math=new Cafedra();

        cafedras.add(math);
        fizmat.setCafedras(cafedras);
        university.setFaculteties(new ArrayList<Facultity>(){{
            add(fizmat);
        }});
    }
}
