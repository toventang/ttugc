package com.bytedance.android.live.broadcast.p197f;

import android.os.Message;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.f.f */
final /* synthetic */ class C3235f implements AbstractC88433f {

    /* renamed from: a */
    private final C3229a f9287a;

    static {
        Covode.recordClassIndex(3716);
    }

    C3235f(C3229a aVar) {
        this.f9287a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3229a aVar = this.f9287a;
        C5832d dVar = (C5832d) obj;
        if (aVar.f9274c != null) {
            Message obtainMessage = aVar.f9274c.obtainMessage(34);
            obtainMessage.obj = dVar.data;
            aVar.f9274c.sendMessage(obtainMessage);
        }
    }
}
