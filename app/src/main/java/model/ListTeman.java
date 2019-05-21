package model;

import java.util.ArrayList;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class ListTeman {
    public static String[][] data = new String[][] {
            {"10116161", "Hairul Agung H", "IF-4", "hairul@gmail.com", "@hairul", "081248432679"},
            {"10116323", "Francisco", "IF-4", "francisco.com", "@SBanggara", "081461275482"},
            {"10116359", "Irvan", "IF-4", "irvan@gmail.com", "@irvan", "089287896902"}
    };
    public static ArrayList<Teman> getListData(){
        Teman teman;
        ArrayList<Teman> list = new ArrayList<>();
        for (String[] aData : data) {
            teman = new Teman();
            teman.setNim(aData[0]);
            teman.setNama(aData[1]);
            teman.setKelas(aData[2]);
            teman.setEmail(aData[3]);
            teman.setSosmed(aData[4]);
            teman.setTelp(aData[5]);

            list.add(teman);
        }
        return list;
    }
}
