package com.example.family1.as_app;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static android.support.v7.widget.AppCompatDrawableManager.get;

public class settingFm extends Fragment {

    private Button general;
    private Button notifications;
    private Button share;
    private Button help;
    private Button user;


    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.setting_fm, container, false);
        return view;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
/*
        general = (Button) general.findViewById(R.id.General);
        general.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGeneral();
            }
        });




        notifications = (Button) notifications.findViewById(R.id.Notifications);
        notifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotifications();
            }
        });

        share = (Button) share.findViewById(R.id.Share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openShare();
            }
        });

        help = (Button) help.findViewById(R.id.Help);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }
        });
        user = (Button) user.findViewById(R.id.User);
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUser();
            }
        });
*/
    }

/*
    public void openGeneral() {
        Intent intent = new Intent(getContext(), General.class);
        startActivity(intent);
    }

    public void openNotifications() {
        Intent intent = new Intent(getActivity(), Notifications.class);
        startActivity(intent);
    }

    public void openShare() {
        Intent intent = new Intent(getActivity(), Share.class);
        startActivity(intent);
    }

    public void openHelp() {
        Intent intent = new Intent(getActivity(), Help.class);
        startActivity(intent);
    }

    public void openUser() {
        Intent intent = new Intent(getActivity(), User.class);
        startActivity(intent);
    }
*/
    }
