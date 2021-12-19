package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.list.d */
final /* synthetic */ class C9279d implements AbstractC88433f {

    /* renamed from: a */
    private final MultiPlusFeedRoomListProvider f22678a;

    static {
        Covode.recordClassIndex(10197);
    }

    C9279d(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider) {
        this.f22678a = multiPlusFeedRoomListProvider;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        this.f22678a.f22647d = false;
        C3854a.m9458a("MultiPlusFeedRoomListProvider", (Throwable) obj);
    }
}
