package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.as */
final /* synthetic */ class DialogInterface$OnClickListenerC11473as implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C11455ag.C114593 f27534a;

    /* renamed from: b */
    private final C10700d f27535b;

    static {
        Covode.recordClassIndex(13132);
    }

    DialogInterface$OnClickListenerC11473as(C11455ag.C114593 r1, C10700d dVar) {
        this.f27534a = r1;
        this.f27535b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11455ag.C114593 r5 = this.f27534a;
        C10700d dVar = this.f27535b;
        C11477aw.m20317c(C11455ag.this.f27481c, "over_threshold_two", dVar.f25760b);
        if (!r5.f27496a) {
            dVar.f25762d = true;
        }
        dVar.f25761c = 1;
        C11455ag.this.mo18309b(dVar);
    }
}
