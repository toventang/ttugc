package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.gift.LiveFreeGiftSendSetting;
import com.bytedance.android.livesdk.service.p624b.C10700d;
import com.bytedance.android.livesdk.widgets.giftwidget.p662b.C11455ag;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ap */
final /* synthetic */ class DialogInterface$OnClickListenerC11470ap implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C11455ag.C114572 f27525a;

    /* renamed from: b */
    private final C10700d f27526b;

    static {
        Covode.recordClassIndex(13129);
    }

    DialogInterface$OnClickListenerC11470ap(C11455ag.C114572 r1, C10700d dVar) {
        this.f27525a = r1;
        this.f27526b = dVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11455ag.C114572 r4 = this.f27525a;
        C10700d dVar = this.f27526b;
        C11477aw.m20316c(C11455ag.this.f27481c, dVar.f25760b);
        if (!((IHostContext) C6193a.m13435a(IHostContext.class)).isLocalTest() || !LiveFreeGiftSendSetting.INSTANCE.getValue()) {
            C11455ag.this.mo18305a(dVar, dVar.f25764f);
        } else {
            C11455ag.this.mo18309b(dVar);
        }
    }
}
