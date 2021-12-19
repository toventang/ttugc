package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.b */
public final class DialogFragmentC25493b extends DialogFragment {

    /* renamed from: a */
    Dialog f60475a;

    /* renamed from: b */
    DialogInterface.OnCancelListener f60476b;

    static {
        Covode.recordClassIndex(30892);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f60476b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f60475a == null) {
            setShowsDialog(false);
        }
        return this.f60475a;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
