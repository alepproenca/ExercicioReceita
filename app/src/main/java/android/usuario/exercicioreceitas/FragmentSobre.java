package android.usuario.exercicioreceitas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSobre extends Fragment {


    public FragmentSobre() {
        // Required empty public constructor
    }
    //TextView firsttexto;
    //View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_sobre, container, false);
       // firsttexto = (TextView) view.findViewById(R.id.textous);
    }

}
