package com.p2082ss.android.ugc.aweme.application;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58227a;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.application.n */
public class C33912n {

    /* renamed from: a */
    private static AtomicBoolean f80213a;

    /* renamed from: b */
    private static final boolean f80214b;

    /* renamed from: c */
    private static Map<C33913a, Boolean> f80215c = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.application.n$a */
    public static class C33913a {

        /* renamed from: a */
        String f80216a;

        /* renamed from: b */
        boolean f80217b;

        /* renamed from: c */
        boolean f80218c;

        static {
            Covode.recordClassIndex(40831);
        }

        public final int hashCode() {
            return Objects.hash(this.f80216a, Boolean.valueOf(this.f80217b), Boolean.valueOf(this.f80218c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C33913a aVar = (C33913a) obj;
                if (this.f80217b == aVar.f80217b && this.f80218c == aVar.f80218c && this.f80216a.equals(aVar.f80216a)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public C33913a(String str, boolean z, boolean z2) {
            this.f80216a = str;
            this.f80217b = z;
            this.f80218c = z2;
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(40830);
        if (new Random().nextFloat() < 1.0E-4f) {
            z = true;
        } else {
            z = false;
        }
        f80214b = z;
    }

    /* renamed from: a */
    public static void m69444a(Context context, String str, boolean z, boolean z2) {
        MethodCollector.m26663i(3385);
        if (TextUtils.isEmpty(str) || !f80214b || context == null) {
            MethodCollector.m26664o(3385);
            return;
        }
        if (f80213a == null) {
            synchronized (C33912n.class) {
                try {
                    if (f80213a == null) {
                        f80213a = new AtomicBoolean(C58227a.m105170a(context));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3385);
                    throw th;
                }
            }
        }
        if (!f80213a.get()) {
            MethodCollector.m26664o(3385);
            return;
        }
        C33913a aVar = new C33913a(str, z, z2);
        if (f80215c.containsKey(aVar)) {
            MethodCollector.m26664o(3385);
            return;
        }
        f80215c.put(aVar, true);
        C39162r.m79460a("stat_loadso_num", new C33744d().mo59980a("tag_type", !z ? 1 : 0).mo59980a("num_type", !z2 ? 1 : 0).mo59983a("so_name", str).f79943a);
        MethodCollector.m26664o(3385);
    }
}
