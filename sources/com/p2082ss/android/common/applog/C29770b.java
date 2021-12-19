package com.p2082ss.android.common.applog;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.b */
public class C29770b {

    /* renamed from: b */
    private static volatile C29770b f70984b;

    /* renamed from: a */
    public final LinkedList<C29772a> f70985a = new LinkedList<>();

    static {
        Covode.recordClassIndex(36175);
    }

    /* renamed from: a */
    static C29770b m59970a() {
        MethodCollector.m26663i(7764);
        if (f70984b == null) {
            synchronized (C29770b.class) {
                try {
                    if (f70984b == null) {
                        f70984b = new C29770b();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7764);
                    throw th;
                }
            }
        }
        C29770b bVar = f70984b;
        MethodCollector.m26664o(7764);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.common.applog.b$a */
    public class C29772a {

        /* renamed from: a */
        String f70987a;

        /* renamed from: b */
        String f70988b;

        /* renamed from: c */
        String f70989c;

        /* renamed from: d */
        long f70990d;

        /* renamed from: e */
        long f70991e;

        /* renamed from: f */
        boolean f70992f;

        /* renamed from: g */
        JSONObject f70993g;

        static {
            Covode.recordClassIndex(36177);
        }

        C29772a(String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject) {
            this.f70987a = str;
            this.f70988b = str2;
            this.f70989c = str3;
            this.f70990d = j;
            this.f70991e = j2;
            this.f70992f = z;
            this.f70993g = jSONObject;
        }
    }
}
