package com.example.myapplication.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.myapplication.R;
import com.example.myapplication.activity.MainActivity;
import com.example.myapplication.activity.SurveyActivity;
import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class GalleryFragment extends Fragment {

    ExpandableRelativeLayout expandableLayout1, expandableLayout2, expandableLayout3, expandableLayout4, expandableLayout5, expandableLayout6, expandableLayout7, expandableLayout8;

    private GalleryViewModel galleryViewModel;

    Button expandableButton1,expandableButton2,expandableButton3,expandableButton4;

    private LinearLayout button1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_gallery, container, false);

        expandableButton1 = (Button) root.findViewById(R.id.expandableButton1);
        expandableButton2 = (Button) root.findViewById(R.id.expandableButton2);
        expandableButton3 = (Button) root.findViewById(R.id.expandableButton3);
        expandableButton4 = (Button) root.findViewById(R.id.expandableButton4);

        expandableButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expand1(root);
            }
        });

        expandableButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expand2(root);
            }
        });

        expandableButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expand3(root);
            }
        });

        expandableButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expand4(root);
            }
        });


        return root;
    }

    public void expand1(View view){
        expandableLayout1 =(ExpandableRelativeLayout)  view.findViewById(R.id.expandableLayout1);
        expandableLayout1.toggle();
    }
    public void expand2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout) view.findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }
    public void expand3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout) view.findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }
    public void expand4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) view.findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
    }
}