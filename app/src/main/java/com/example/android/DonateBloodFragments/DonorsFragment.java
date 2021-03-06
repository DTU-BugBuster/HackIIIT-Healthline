package com.example.android.DonateBloodFragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cbitss.careforu.R;
import com.example.android.DonateBloodFragments.DataProvider.DonorInfo;
import com.example.android.DonateBloodFragments.DonationAdapter.DonateAdapter;
import com.example.android.DonateBloodFragments.DataProvider.DonorInfo;
import com.example.android.DonateBloodFragments.DonationAdapter.DonateAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DonorsFragment extends Fragment {
    RecyclerView rv;
    DonateAdapter madapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<DonorInfo> mInfo;
    private String[] mName = {
            "Pranav",
            "Harshith",
            "Dhruv",
            "Mohit",
            "Pankaj",
            "Shivam",
            "Pranav",
            "Harshith",
            "Dhruv",
            "Mohit",
            "Pankaj"
    };
    private String[] bloodGroup = {
            "AB-",
            "O+",
            "O+",
            "B+",
            "A+",
            "A+",
            "AB-",
            "O+",
            "O+",
            "B+",
            "A+",
            "AB-",
            "O+",
            "O+",
            "B+",
            "A+"
    };

    public DonorsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_donors, container, false);

        mInfo = new ArrayList<>();
        for (int i = 0; i < mName.length; i++) {
            DonorInfo donor = new DonorInfo(mName[i], bloodGroup[i]);
            mInfo.add(donor);
        }

        rv = (RecyclerView) view.findViewById(R.id.rv_donor);
        madapter = new DonateAdapter(mInfo, getContext());
        layoutManager = new GridLayoutManager(getContext(), 1);
        ViewCompat.setNestedScrollingEnabled(rv, false);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(madapter);
        rv.setHasFixedSize(true);
        setHasOptionsMenu(true);

        return view;
    }

}
