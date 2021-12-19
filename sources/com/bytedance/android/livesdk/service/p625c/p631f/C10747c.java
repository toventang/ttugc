package com.bytedance.android.livesdk.service.p625c.p631f;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p561j.C9097di;
import com.bytedance.android.livesdk.utils.p653a.C11200a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.f.c */
public final class C10747c {

    /* renamed from: a */
    public static final C10747c f25891a = new C10747c();

    private C10747c() {
    }

    static {
        Covode.recordClassIndex(12344);
    }

    /* renamed from: a */
    public static void m19336a(String str, String str2, long j, String str3, String str4) {
        String str5;
        C89219l.m154721d(str2, "");
        long a = C11200a.m19851a();
        C6501b a2 = C6501b.C6502a.m13948a("send_gift_response").mo12639a();
        Map map = (Map) DataChannelGlobal.f42558d.mo28324b(C9097di.class);
        if (map == null || (str5 = (String) map.get("anchor_id")) == null) {
            str5 = "0";
        }
        a2.mo12651a("anchor_id", str5).mo12646a("response_receive_ms", a).mo12646a("duration", a - j).mo12651a("status_code", str3).mo12651a("status_msg", str4).mo12652a(C10751e.m19341a(str)).mo12655b();
    }
}
