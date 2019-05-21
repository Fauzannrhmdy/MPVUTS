package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fauzan.utsmpv.R;

//20-5-2019, 10116173, FAUZAN NA, IF-4

public class FragmentProfil extends Fragment {

    public FragmentProfil() {
        // Required empty public constructor
    }

    public static FragmentProfil newInstance() {
        return new FragmentProfil();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_profil, container, false);
    }
}
