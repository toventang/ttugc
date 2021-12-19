package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.detail.d */
public final /* synthetic */ class C7433d implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC7430b f18435a;

    static {
        Covode.recordClassIndex(8203);
    }

    C7433d(AbstractC7430b bVar) {
        this.f18435a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC7430b bVar = this.f18435a;
        Throwable th = (Throwable) obj;
        if (!bVar.f18431c) {
            return;
        }
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            bVar.mo13650a(aVar.getErrorCode(), aVar.getErrorMsg());
            return;
        }
        bVar.mo13650a(0, th.toString());
    }
}
