package com.bytedance.p802b.p806b.p807a.p809b;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.b.b.a.b.b */
public class C12932b {

    /* renamed from: c */
    private static volatile C12932b f31500c;

    /* renamed from: a */
    public Map<String, C12931a> f31501a = new ConcurrentHashMap();

    /* renamed from: b */
    public C12931a f31502b;

    static {
        Covode.recordClassIndex(14768);
    }

    /* renamed from: a */
    public static C12932b m23210a() {
        if (f31500c == null) {
            synchronized (C12932b.class) {
                if (f31500c == null) {
                    f31500c = new C12932b();
                }
            }
        }
        return f31500c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r2 != null) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.p802b.p806b.p807a.p809b.C12931a mo20780a(java.lang.String r4) {
        /*
        // Method dump skipped, instructions count: 102
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p802b.p806b.p807a.p809b.C12932b.mo20780a(java.lang.String):com.bytedance.b.b.a.b.a");
    }
}
