package com.example.nitkhostels;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Payment_Admin extends Fragment {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.payment_admin_centre,container,false);

        SharedPreferences pref = getActivity().getApplicationContext().getSharedPreferences("fees", 0); // 0 - for private mode
        final SharedPreferences.Editor editor = pref.edit();


        Button Hostelpaid,Institutepaid;

        Hostelpaid = (Button)rootView.findViewById(R.id.paid1) ;

        Institutepaid = (Button)rootView.findViewById(R.id.paid2);

        Hostelpaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
//               Hostel_fees.setText("Paid");
                editor.putBoolean("hostelfeespaid", true);
                editor.commit();
            }
        });



        Institutepaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
//                Institute_fees.setText("Paid");
                editor.putBoolean("institutefeespaid",true);
                editor.commit();
            }
        });


        return rootView;

}

}
