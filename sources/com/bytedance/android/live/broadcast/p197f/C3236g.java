package com.bytedance.android.live.broadcast.p197f;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.f.g */
final /* synthetic */ class C3236g implements AbstractC88433f {

    /* renamed from: a */
    private final C3229a f9288a;

    static {
        Covode.recordClassIndex(3717);
    }

    C3236g(C3229a aVar) {
        this.f9288a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3229a aVar = this.f9288a;
        if (aVar.f9274c != null) {
            Message obtainMessage = aVar.f9274c.obtainMessage(34);
            obtainMessage.obj = obj;
            aVar.f9274c.sendMessage(obtainMessage);
        }
    }
}
