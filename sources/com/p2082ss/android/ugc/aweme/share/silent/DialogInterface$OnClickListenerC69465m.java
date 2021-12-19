package com.p2082ss.android.ugc.aweme.share.silent;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.MobClick;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.share.silent.m */
public final /* synthetic */ class DialogInterface$OnClickListenerC69465m implements DialogInterface.OnClickListener {

    /* renamed from: a */
    static final DialogInterface.OnClickListener f155182a = new DialogInterface$OnClickListenerC69465m();

    static {
        Covode.recordClassIndex(81803);
    }

    private DialogInterface$OnClickListenerC69465m() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C39162r.onEvent(MobClick.obtain().setEventName("sync_permission").setLabelName("cancel"));
    }
}
