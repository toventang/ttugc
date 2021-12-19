package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.i */
public final class C25506i extends DialogInterface$OnCancelListenerC0944d {

    /* renamed from: a */
    Dialog f60492a;

    /* renamed from: b */
    DialogInterface.OnCancelListener f60493b;

    static {
        Covode.recordClassIndex(30905);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f60493b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f60492a == null) {
            this.mShowsDialog = false;
        }
        return this.f60492a;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d
    public final void show(AbstractC0952i iVar, String str) {
        super.show(iVar, str);
    }
}
