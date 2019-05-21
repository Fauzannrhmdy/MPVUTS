package presenter;

import model.Teman;
import view.ViewTambahTeman;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class PresenterTambahTeman {
    private ViewTambahTeman view;

    public PresenterTambahTeman(ViewTambahTeman view){
        this.view = view;
    }

    public void tambahTeman(Teman teman){ view.saveData(teman); }
}
