package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class AbstractDialogInterface$OnClickListenerC25543f implements DialogInterface.OnClickListener {
    static {
        Covode.recordClassIndex(30946);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41813a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo41813a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
