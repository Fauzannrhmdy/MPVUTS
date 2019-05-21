package presenter;

import view.ViewTeman;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class PresenterTeman {
    private ViewTeman view;

    public PresenterTeman(ViewTeman view){
        this.view = view;
    }

    public void setListTeman(){
        view.showListTeman();
    }
}
