package com.bytedance.android.livesdk.chatroom.p490e;

import android.text.TextUtils;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.chatroom.p490e.C7488l;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.m */
final /* synthetic */ class C7491m implements AbstractC88433f {

    /* renamed from: a */
    private final C7488l f18614a;

    static {
        Covode.recordClassIndex(8261);
    }

    C7491m(C7488l lVar) {
        this.f18614a = lVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C7488l lVar = this.f18614a;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            String str = null;
            if (th instanceof C2912a) {
                str = ((C2912a) th).getPrompt();
            }
            if (TextUtils.isEmpty(str)) {
                str = C7488l.m15426a((int) R.string.gjp);
            }
            if (lVar.f38654y != null) {
                ((C7488l.AbstractC7490a) lVar.f38654y).mo13735a(str);
            }
        }
    }
}
