package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.C0242i;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.bottomsheet.b */
public class C26614b extends C0242i {
    static {
        Covode.recordClassIndex(32062);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i
    public Dialog onCreateDialog(Bundle bundle) {
        return new DialogC26609a(getContext(), getTheme());
    }
}
