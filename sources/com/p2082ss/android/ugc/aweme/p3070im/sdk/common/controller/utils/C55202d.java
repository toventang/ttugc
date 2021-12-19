package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1404a.AbstractC19501o;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d */
public final class C55202d {

    /* renamed from: a */
    public static final C55202d f126269a = new C55202d();

    /* renamed from: b */
    private static AbstractC19501o f126270b = new C55203a();

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.d$a */
    public static final class C55203a implements AbstractC19501o {
        static {
            Covode.recordClassIndex(64948);
        }

        C55203a() {
        }

        @Override // com.bytedance.p1399im.core.p1404a.AbstractC19501o
        /* renamed from: a */
        public final long mo31154a(C19638h hVar) {
            long j = 0;
            if (hVar == null) {
                return 0;
            }
            C19538ai lastMessage = hVar.getLastMessage();
            if (lastMessage != null) {
                j = lastMessage.getCreatedAt();
            }
            if (hVar.isStickTop()) {
                j = C89271h.m154764a(j, hVar.getUpdatedTime());
            }
            if (j < 10000000000L) {
                j *= 1000;
            }
            long a = C89271h.m154764a(C54881c.m100496b(hVar), j);
            int a2 = C55243z.m101009a(hVar);
            double pow = Math.pow(10.0d, 13.0d);
            double d = (double) a2;
            Double.isNaN(d);
            double d2 = pow * d;
            double d3 = (double) a;
            Double.isNaN(d3);
            return (long) (d2 + d3);
        }
    }

    private C55202d() {
    }

    static {
        Covode.recordClassIndex(64947);
    }
}
