package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.b */
public class C40046b {

    /* renamed from: g */
    private static C40046b f94075g;

    /* renamed from: a */
    public int f94076a = 22;

    /* renamed from: b */
    public int f94077b = -1;

    /* renamed from: c */
    public int f94078c = -1;

    /* renamed from: d */
    public int f94079d = -1;

    /* renamed from: e */
    public boolean f94080e;

    /* renamed from: f */
    public String f94081f;

    static {
        Covode.recordClassIndex(47817);
    }

    /* renamed from: b */
    public final long mo69207b() {
        return (long) (this.f94079d * 1000);
    }

    private C40046b() {
    }

    /* renamed from: a */
    public static C40046b m81004a() {
        MethodCollector.m26663i(3594);
        if (f94075g == null) {
            synchronized (C40046b.class) {
                try {
                    if (f94075g == null) {
                        f94075g = new C40046b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3594);
                    throw th;
                }
            }
        }
        C40046b bVar = f94075g;
        MethodCollector.m26664o(3594);
        return bVar;
    }

    /* renamed from: a */
    public final boolean mo69206a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= this.f94076a || i < 5) {
            return true;
        }
        return false;
    }
}
