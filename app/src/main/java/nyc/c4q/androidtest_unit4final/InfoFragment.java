package nyc.c4q.androidtest_unit4final;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {

    Button button;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info_fragment, container, false);


        button = (Button) v.findViewById(R.id.moreButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView = (TextView) view.findViewById(R.id.more_textView);
               textView.isShown();
            }
        });

        return v;
    }
}
