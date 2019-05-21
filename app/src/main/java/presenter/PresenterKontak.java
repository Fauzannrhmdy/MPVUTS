package presenter;

import view.ViewKontak;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class PresenterKontak {
    private ViewKontak view;

    public PresenterKontak(ViewKontak view) {
        this.view = view;
    }

    public void makeCall() {
        view.doCall();
    }

    public void sendEmail() {
        view.sendEmail();
    }

    public void openInstagram() {
        view.openInstagram();
    }

    public void openTwitter() {
        view.openTwitter();
    }
}
