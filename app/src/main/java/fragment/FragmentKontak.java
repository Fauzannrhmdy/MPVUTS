package fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.fauzan.utsmpv.R;

import presenter.PresenterKontak;
import view.ViewKontak;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class FragmentKontak extends Fragment implements ViewKontak, View.OnClickListener {
    RelativeLayout layPhone, layEmail, layIg, layTwitter;
    PresenterKontak presenter;


    public FragmentKontak() {
        // Required empty public constructor
    }

    public static FragmentKontak newInstance(){
        return new FragmentKontak();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kontak, container, false);

        layPhone = view.findViewById(R.id.layPhone);
        layEmail = view.findViewById(R.id.layEmail);
        layIg = view.findViewById(R.id.layIg);
        layTwitter = view.findViewById(R.id.layTwitter);

        layPhone.setOnClickListener(this);
        layEmail.setOnClickListener(this);
        layIg.setOnClickListener(this);
        layTwitter.setOnClickListener(this);

        presenter = new PresenterKontak(this);
        return view;
    }

    public void doCall() {
        Intent a = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", "082128701235", null));
        startActivity(a);
    }

    public void sendEmail() {
        Intent a = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:fauzannrhmdy@gmail.com"));
        startActivity(a);
    }

    public void openInstagram() {
        Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fauzanrhmdy_"));
        startActivity(a);
    }

    public void openTwitter() {
        Intent a = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/fauzanrhmdy_"));
        startActivity(a);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.layPhone:
                presenter.makeCall();
                break;
            case R.id.layEmail:
                presenter.sendEmail();
                break;
            case R.id.layIg:
                presenter.openInstagram();
                break;
            case R.id.layTwitter:
                presenter.openTwitter();
                break;
        }
    }
}
