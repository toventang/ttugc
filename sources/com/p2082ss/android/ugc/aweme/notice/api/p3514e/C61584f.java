package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.notice.api.bean.C61553e;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import com.p2082ss.android.websocket.internal.AbstractC85632a;
import com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.f */
public final class C61584f implements AbstractC85631b {
    static {
        Covode.recordClassIndex(72262);
    }

    @Override // com.p2082ss.android.websocket.p4394a.p4397c.AbstractC85631b
    /* renamed from: a */
    public final Object mo92083a(AbstractC85632a aVar) {
        return m111532b(aVar);
    }

    /* renamed from: b */
    private static C61553e m111532b(AbstractC85632a aVar) {
        if (aVar == null) {
            try {
                C89219l.m154715b();
            } catch (Throwable unused) {
                return null;
            }
        }
        byte[] payload = aVar.getPayload();
        C89219l.m154716b(payload, "");
        return (C61553e) C80361dw.m139333a(new String(payload, C89338d.f202990a), C61553e.class);
    }
}
