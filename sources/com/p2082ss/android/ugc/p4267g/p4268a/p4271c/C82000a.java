package com.p2082ss.android.ugc.p4267g.p4268a.p4271c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4267g.p4268a.p4269a.C81989d;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.c.a */
public final class C82000a {

    /* renamed from: a */
    public static final C82000a f183519a = new C82000a();

    private C82000a() {
    }

    static {
        Covode.recordClassIndex(95815);
    }

    /* renamed from: a */
    public static HashMap<String, Object> m141958a(String str, C81989d dVar) {
        C89219l.m154719c(dVar, "");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (str != null) {
            hashMap.put("unknown_reason", str);
        }
        String str2 = dVar.f183478a;
        if (str2 != null) {
            hashMap.put("top_activity", str2);
        }
        String str3 = dVar.f183479b;
        if (str3 != null) {
            hashMap.put("top_page", str3);
        }
        return hashMap;
    }
}
