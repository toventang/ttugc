package com.p2082ss.android.ugc.aweme.initializer;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.initializer.l */
final /* synthetic */ class DialogInterface$OnClickListenerC56782l implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DialogInterface.OnClickListener f129341a;

    static {
        Covode.recordClassIndex(66647);
    }

    DialogInterface$OnClickListenerC56782l(DialogInterface.OnClickListener onClickListener) {
        this.f129341a = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener = this.f129341a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
