package com.spatiu.spatiutoaster;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public  class SpatiuMeassge {

    private static final int SUCCESS = 1;
    private static final int ERROR = 2;
    private static final int WAITING = 3;
    private static final int WARNING = 4;

    public static void toaster(Context context,String message, int status){
        if (status == SUCCESS){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.success_toast_layout,null);

            TextView text = layout.findViewById(R.id.message);
            text.setText(message);

            Toast toast = new Toast(context);
            toast.setGravity(Gravity.BOTTOM,0, 80);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
        else if (status == ERROR){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.error_toast_layout,null);

            TextView text = layout.findViewById(R.id.message);
            text.setText(message);

            Toast toast = new Toast(context);
            toast.setGravity(Gravity.BOTTOM,0, 80);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
        else if (status == WAITING){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.waiting_toast_layout,null);

            TextView text = layout.findViewById(R.id.message);
            text.setText(message);

            Toast toast = new Toast(context);
            toast.setGravity(Gravity.BOTTOM,0, 80);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
        else if (status == WARNING){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View layout = inflater.inflate(R.layout.warning_toast_layout,null);

            TextView text = layout.findViewById(R.id.message);
            text.setText(message);

            Toast toast = new Toast(context);
            toast.setGravity(Gravity.BOTTOM,0, 80);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
        }
    }
}
