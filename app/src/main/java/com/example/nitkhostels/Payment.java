package com.example.nitkhostels;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Payment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.payment,container,false);


        return rootView;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SharedPreferences pref = getActivity().getApplicationContext().getSharedPreferences("fees", 0); // 0 - for private mode

        boolean hostel_fees_paid = pref.getBoolean("hostelfeespaid",false);
        boolean institute_fees_paid = pref.getBoolean("institutefeespaid",false);

        Log.d("Payment",String.valueOf(hostel_fees_paid));

        TextView hostel_fees_status = getView().findViewById(R.id.hostel_imp);
        TextView institute_fees_status = getView().findViewById(R.id.institute_imp);

        if(hostel_fees_paid){
            hostel_fees_status.setText("Paid");
        } else {
            hostel_fees_status.setText("Yet to be Cleared");
        }



        if(institute_fees_paid){
            institute_fees_status.setText("Paid");
        } else {
            institute_fees_status.setText("Yet to Be Cleared");
        }




    }

}
