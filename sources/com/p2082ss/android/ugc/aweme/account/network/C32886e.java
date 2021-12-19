package com.p2082ss.android.ugc.aweme.account.network;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29844g;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.network.e */
public final class C32886e {
    static {
        Covode.recordClassIndex(39674);
    }

    /* renamed from: a */
    public static final String m67518a(C29844g gVar, Map<String, String> map) {
        C89219l.m154721d(gVar, "");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                gVar.mo52130a(entry.getKey(), entry.getValue());
            }
        }
        String a = gVar.mo52126a();
        C89219l.m154716b(a, "");
        return a;
    }
}
