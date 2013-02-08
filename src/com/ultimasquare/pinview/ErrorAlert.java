package com.ultimasquare.pinview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.View;

public class ErrorAlert implements OnKeyListener{

  private Context mContext;

  public ErrorAlert(Context context) {
    mContext = context;
  }


public void showErrorDialog(final String title, final String message) {
    AlertDialog aDialog = new AlertDialog.Builder(mContext).setMessage(message).setTitle(title)
        .setNeutralButton("Close", new OnClickListener() {
          public void onClick(final DialogInterface dialog,
              final int which) {
            //Prevent to finish activity, if user clicks about.
            /*if (!title.equalsIgnoreCase("About") && !title.equalsIgnoreCase("Directory Error") && !title.equalsIgnoreCase("View")) {
              ((Activity) mContext).finish();
            }*/
            
          }
        }).create();
    aDialog.setOnKeyListener(this);
    aDialog.show();
  }

  @Override
  public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
    if(keyCode == KeyEvent.KEYCODE_BACK){
      //disable the back button
    }
    return true;
  }
  

}