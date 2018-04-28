package com.inzevision.truecalc;

import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

public class PageFragment extends Fragment{
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static android.support.v4.app.Fragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        PageFragment fragment = new PageFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPage = getArguments().getInt(ARG_PAGE);
        }
    }

    @Override public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                                       Bundle savedInstanceState) {
        if (mPage == 1){
            View view = inflater.inflate(R.layout.fragment_page, container, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return view;
        }
        if (mPage == 2){
            View view = inflater.inflate(R.layout.fragment_page2, container, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return view;
        }
        if (mPage == 3){
            View view = inflater.inflate(R.layout.fragment_page3, container, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return view;
        }else{
            View view = inflater.inflate(R.layout.fragment_page_default, container, false);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return view;
        }

//        TextView textView = (TextView) view;
//        textView.setText("Fragment #" + mPage);


    }
}


