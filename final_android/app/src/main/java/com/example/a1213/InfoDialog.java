package com.example.a1213;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoDialog {
    private Context context;
    public InfoDialog(Context context){
        this.context=context;
    }
    TextView tvName,tvKinds,tvInfo,tvRelationship;
    ImageView imageView;
    public void callFunction(final int image,final String name,final String kinds,final String relationship,final String info){

        final Dialog dig=new Dialog(context);
        dig.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dig.setContentView(R.layout.dialog);
        dig.show();
        final Button cancelButton=(Button)dig.findViewById(R.id.close);

        imageView=dig.findViewById(R.id.digImage);
        tvName=dig.findViewById(R.id.tvDogName);
        tvKinds=dig.findViewById(R.id.tvDogKinds);
        tvRelationship=dig.findViewById(R.id.tvRelationship);
        tvInfo=dig.findViewById(R.id.tvDogInfo);



        imageView.setBackgroundResource(image);
        tvName.setText(name);
        tvKinds.setText(kinds);
        tvRelationship.setText(relationship);
        tvInfo.setText(info);




        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dig.dismiss();
            }
        });
    }
}
