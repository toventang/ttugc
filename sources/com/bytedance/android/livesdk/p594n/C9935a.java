package com.bytedance.android.livesdk.p594n;

import com.bytedance.android.live.network.p381b.C5801a;
import com.bytedance.android.livesdk.p450an.C6802e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.optimizer.live.sdk.dns.AbstractC86156d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.n.a */
public final class C9935a implements AbstractC86156d {
    static {
        Covode.recordClassIndex(11485);
    }

    @Override // com.p2082ss.optimizer.live.sdk.dns.AbstractC86156d
    /* renamed from: a */
    public final <T> T mo16644a(String str, T t) {
        C89219l.m154721d(t, "");
        if (C89219l.m154714a((Object) str, (Object) "TTNet_NQE_INFO")) {
            T t2 = (T) C5801a.m12710a().toString();
            if ((t2 instanceof Object) && t2 != null) {
                return t2;
            }
            return t;
        }
        T t3 = (T) C6802e.m14593a(str, t);
        C89219l.m154716b(t3, "");
        return t3;
    }
}
