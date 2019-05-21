package presenter;

import view.ViewDetailTeman;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class PresenterDetailTeman {
    private ViewDetailTeman view;

    public PresenterDetailTeman(ViewDetailTeman view) {
        this.view = view;
    }

    public void getFriendsDetail() {
        view.showDetail();
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
}
