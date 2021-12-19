package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.j */
public final /* synthetic */ class DialogInterface$OnClickListenerC74020j implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final Context f166137a;

    /* renamed from: b */
    private final Intent f166138b;

    static {
        Covode.recordClassIndex(86770);
    }

    DialogInterface$OnClickListenerC74020j(Context context, Intent intent) {
        this.f166137a = context;
        this.f166138b = intent;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C74007f.m130164a(this.f166137a, this.f166138b);
    }
}
