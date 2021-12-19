package com.p2082ss.android.ugc.aweme.p2730de;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.de.o */
public final class C40980o {

    /* renamed from: a */
    private static HashMap<String, C40981p> f95819a = new HashMap<>();

    static {
        Covode.recordClassIndex(48832);
    }

    /* renamed from: a */
    private static Context m82512a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static C40981p m82513a(Context context, String str) {
        C40981p pVar = f95819a.get(str);
        if (pVar != null) {
            return pVar;
        }
        C40981p pVar2 = new C40981p(m82512a(context), str);
        f95819a.put(str, pVar2);
        return pVar2;
    }
}
