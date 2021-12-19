package com.google.firebase.p2011c;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.c.d */
public final class C27708d {

    /* renamed from: a */
    private static C27708d f65124a;

    /* renamed from: b */
    private final SharedPreferences f65125b;

    static {
        Covode.recordClassIndex(33290);
    }

    private C27708d(Context context) {
        this.f65125b = C34822d.m71158a(context, "FirebaseAppHeartBeat", 0);
    }

    /* renamed from: a */
    static synchronized C27708d m55399a(Context context) {
        C27708d dVar;
        synchronized (C27708d.class) {
            MethodCollector.m26663i(10361);
            if (f65124a == null) {
                f65124a = new C27708d(context);
            }
            dVar = f65124a;
            MethodCollector.m26664o(10361);
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo46344a(long j) {
        boolean a;
        MethodCollector.m26663i(10364);
        a = mo46345a("fire-global", j);
        MethodCollector.m26664o(10364);
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo46345a(String str, long j) {
        MethodCollector.m26663i(10363);
        if (!this.f65125b.contains(str)) {
            this.f65125b.edit().putLong(str, j).apply();
            MethodCollector.m26664o(10363);
            return true;
        } else if (j - this.f65125b.getLong(str, -1) >= 86400000) {
            this.f65125b.edit().putLong(str, j).apply();
            MethodCollector.m26664o(10363);
            return true;
        } else {
            MethodCollector.m26664o(10363);
            return false;
        }
    }
}
