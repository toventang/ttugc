package com.bytedance.android.live.liveinteract.multilive.p341a.p345d;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.live.liveinteract.multilive.a.d.c */
final /* synthetic */ class C5413c implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f13961a = new C5413c();

    static {
        Covode.recordClassIndex(6008);
    }

    private C5413c() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        return ((IBroadcastService) C6193a.m13435a(IBroadcastService.class)).convertStickerBean((Effect) obj);
    }
}
