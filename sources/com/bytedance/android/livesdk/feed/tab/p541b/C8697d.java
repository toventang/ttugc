package com.bytedance.android.livesdk.feed.tab.p541b;

import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.feed.feed.C8587f;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.d */
public final /* synthetic */ class C8697d implements AbstractC88434g {

    /* renamed from: a */
    private final C8694a f21456a;

    static {
        Covode.recordClassIndex(9565);
    }

    public C8697d(C8694a aVar) {
        this.f21456a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        C8694a aVar = this.f21456a;
        C5827a aVar2 = (C5827a) obj;
        if (aVar2.f14685c != null) {
            aVar.f21452a.mo14983b((C8587f) aVar2.f14685c);
        }
        return aVar2.f14684b;
    }
}
