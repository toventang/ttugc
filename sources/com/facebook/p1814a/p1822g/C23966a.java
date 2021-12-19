package com.facebook.p1814a.p1822g;

import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.a.g.a */
public class C23966a {

    /* renamed from: a */
    private static final Set<String> f56730a = new HashSet(Arrays.asList("fb_mobile_purchase", "StartTrial", "Subscribe"));

    static {
        Covode.recordClassIndex(28087);
    }

    /* renamed from: a */
    public static boolean m45318a() {
        if (C24677a.m47209a(C23966a.class)) {
            return false;
        }
        try {
            C24699ae.m47299a();
            if (C24872m.m47690c(C24872m.f59047g) || C24693ad.m47288g() || !C23969c.m45325a()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, C23966a.class);
            return false;
        }
    }
}
