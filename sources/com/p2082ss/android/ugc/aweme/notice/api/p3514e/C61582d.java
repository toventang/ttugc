package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2478cj.C36086a;
import com.p2082ss.android.websocket.internal.AbstractC85632a;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.d */
public final class C61582d implements AbstractC85631b {
    static {
        Covode.recordClassIndex(72260);
    }

    @Override // com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b
    /* renamed from: a */
    public final Object mo92083a(AbstractC85632a aVar) {
        return m111529b(aVar);
    }

    /* renamed from: b */
    private static C36086a m111529b(AbstractC85632a aVar) {
        if (aVar == null) {
            return null;
        }
        try {
            C36086a aVar2 = new C36086a();
            aVar2.f85265a = aVar.getMethod();
            aVar2.f85266b = aVar.getService();
            aVar2.f85267c = aVar.getPayload();
            aVar2.f85268d = aVar.getPayloadType();
            aVar2.f85269e = aVar.getPayloadEncoding();
            return aVar2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
