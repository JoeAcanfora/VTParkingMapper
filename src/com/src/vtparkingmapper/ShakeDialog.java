package com.src.vtparkingmapper;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;

public class ShakeDialog extends DialogFragment {
    
    
    /* The activity that creates an instance of this dialog fragment must
     * implement this interface in order to receive event callbacks.
     * Each method passes the DialogFragment in case the host needs to query it. */
    public interface NoticeDialogListener {
        public void onDialogNegativeClick(DialogFragment dialog);
        public void onDialogPositiveClick(DialogFragment dialog);
    }
    private NoticeDialogListener mListener;
    
    // Override the Fragment.onAttach() method to instantiate the NoticeDialogListener
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the NoticeDialogListener so we can send events to the host
            mListener = (NoticeDialogListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface, throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement NoticeDialogListener");
        }
    }
    
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View v = inflater.inflate(R.layout.dialog_name_pin, null);
        builder.setView(v);
        
        builder.setMessage(R.string.dialog_message)
                .setTitle(R.string.dialog_title)
               .setPositiveButton(R.string.dialog_accept, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {

//                       location.setName(text.getText().toString());
                       mListener.onDialogPositiveClick(ShakeDialog.this);
                   }
               })
               .setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() {
                   public void onClick(DialogInterface dialog, int id) {
                       // User cancelled the dialog
                       mListener.onDialogNegativeClick(ShakeDialog.this);
                   }
               });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}

