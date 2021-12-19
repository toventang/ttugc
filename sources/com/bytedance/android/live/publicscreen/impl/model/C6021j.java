package com.bytedance.android.live.publicscreen.impl.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k;
import com.bytedance.android.livesdk.model.message.C9670bg;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.j */
public final class C6021j extends AbstractC5877k<C9670bg> {
    static {
        Covode.recordClassIndex(6632);
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5877k
    /* renamed from: a */
    public final CharSequence mo10374a() {
        return null;
    }

    @Override // com.bytedance.android.live.publicscreen.p386a.p390d.AbstractC5875i, com.bytedance.android.livesdk.chatroom.p491f.AbstractC7556b
    /* renamed from: b */
    public final User mo10375b() {
        if (((C9670bg) this.f14737d).f23537k instanceof C9670bg.C9673c) {
            return ((C9670bg.C9673c) ((C9670bg) this.f14737d).f23537k).f23539a;
        }
        return null;
    }

    C6021j(C9670bg bgVar) {
        super(bgVar);
    }
}
