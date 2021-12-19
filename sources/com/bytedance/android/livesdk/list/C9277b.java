package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.list.b */
public final /* synthetic */ class C9277b implements AbstractC88433f {

    /* renamed from: a */
    private final MultiPlusFeedRoomListProvider f22676a;

    static {
        Covode.recordClassIndex(10195);
    }

    C9277b(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider) {
        this.f22676a = multiPlusFeedRoomListProvider;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = this.f22676a;
        C3854a.m9458a("MultiPlusFeedRoomListProvider", (Throwable) obj);
        multiPlusFeedRoomListProvider.f22648e = false;
    }
}
