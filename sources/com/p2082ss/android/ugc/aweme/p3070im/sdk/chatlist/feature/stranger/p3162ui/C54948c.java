package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.stranger.p3162ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.stranger.ui.c */
final /* synthetic */ class C54948c implements AbstractC88433f {

    /* renamed from: a */
    private final C54946a f125778a;

    static {
        Covode.recordClassIndex(64672);
    }

    C54948c(C54946a aVar) {
        this.f125778a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C54946a aVar = this.f125778a;
        Integer num = (Integer) obj;
        C56244a.m102191c("DmHelper", "BaseStrangerListAdapter need update -> position:".concat(String.valueOf(num)));
        aVar.notifyItemChanged(num.intValue());
    }
}
