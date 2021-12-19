package com.facebook.internal.p1894a;

import com.bytedance.covode.number.Covode;
import com.facebook.C24006ab;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.C24759o;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONArray;

/* renamed from: com.facebook.internal.a.a */
public final class C24668a {

    /* renamed from: a */
    static boolean f58595a;

    static {
        Covode.recordClassIndex(28821);
    }

    /* renamed from: a */
    public static void m47197a(Throwable th) {
        if (f58595a) {
            HashSet hashSet = new HashSet();
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                C24759o.EnumC24763b a = C24759o.m47405a(stackTraceElement.getClassName());
                if (a != C24759o.EnumC24763b.Unknown) {
                    C24699ae.m47299a();
                    C34822d.m71158a(C24872m.f59047g, "com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(a.mo40587a(), "9.0.0").apply();
                    hashSet.add(a.toString());
                }
            }
            if (C24006ab.m45407b() && !hashSet.isEmpty()) {
                new C24673b(new JSONArray((Collection) hashSet), (byte) 0).mo40503b();
            }
        }
    }
}
