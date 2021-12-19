package com.p2082ss.android.ugc.aweme.initializer;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.initializer.m */
final /* synthetic */ class DialogInterface$OnClickListenerC56783m implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DialogInterface.OnClickListener f129342a;

    static {
        Covode.recordClassIndex(66648);
    }

    DialogInterface$OnClickListenerC56783m(DialogInterface.OnClickListener onClickListener) {
        this.f129342a = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener = this.f129342a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
