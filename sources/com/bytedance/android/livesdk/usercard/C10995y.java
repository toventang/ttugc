package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.usercard.C10992x;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.usercard.y */
public final /* synthetic */ class C10995y implements AbstractC88433f {

    /* renamed from: a */
    private final C10992x f26467a;

    static {
        Covode.recordClassIndex(12610);
    }

    C10995y(C10992x xVar) {
        this.f26467a = xVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10992x xVar = this.f26467a;
        User user = (User) obj;
        if (xVar.f38654y != null) {
            ((C10992x.AbstractC10994b) xVar.f38654y).mo17831a(user);
        }
    }
}
