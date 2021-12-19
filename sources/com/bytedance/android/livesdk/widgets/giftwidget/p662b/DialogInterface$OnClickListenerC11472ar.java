package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ar */
final /* synthetic */ class DialogInterface$OnClickListenerC11472ar implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C11455ag.C114593 f27532a;

    /* renamed from: b */
    private final C10700d f27533b;

    static {
        Covode.recordClassIndex(13131);
    }

    DialogInterface$OnClickListenerC11472ar(C11455ag.C114593 r1, C10700d dVar) {
        this.f27532a = r1;
        this.f27533b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11455ag.C114593 r5 = this.f27532a;
        C10700d dVar = this.f27533b;
        C11477aw.m20315b(C11455ag.this.f27481c, "over_threshold_two", dVar.f25760b);
        if (!((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
            C11455ag.this.mo18305a(dVar, dVar.f25764f);
        } else {
            C11455ag.this.mo18309b(dVar);
        }
    }
}
