package com.p2082ss.android.ugc.aweme.base.p2377h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.base.h.c */
public final class C34596c {

    /* renamed from: a */
    private static HashMap<String, C34598e> f81645a = new HashMap<>();

    static {
        Covode.recordClassIndex(41558);
    }

    /* renamed from: a */
    public static C34598e m70633a(Context context, String str) {
        C34598e eVar = f81645a.get(str);
        if (eVar != null) {
            return eVar;
        }
        C34598e eVar2 = new C34598e(context, str);
        f81645a.put(str, eVar2);
        return eVar2;
    }
}
