package com.bytedance.common.jato.boost;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.common.jato.boost.b */
public class C13538b {

    /* renamed from: a */
    public static AbstractC13542e f32937a;

    /* renamed from: b */
    public static ExecutorService f32938b;

    /* renamed from: c */
    public static AbstractC13537a f32939c;

    static {
        Covode.recordClassIndex(15551);
    }

    /* renamed from: a */
    public static synchronized void m24315a() {
        synchronized (C13538b.class) {
            MethodCollector.m26663i(1058);
            AbstractC13542e eVar = f32937a;
            if (eVar != null) {
                eVar.mo21810a();
            }
            MethodCollector.m26664o(1058);
        }
    }

    /* renamed from: a */
    public static void m24316a(String str) {
        AbstractC13537a aVar = f32939c;
        if (aVar != null) {
            aVar.mo21788a(str);
        }
    }

    /* renamed from: b */
    public static synchronized boolean m24319b(long j) {
        synchronized (C13538b.class) {
            MethodCollector.m26663i(1038);
            AbstractC13542e eVar = f32937a;
            if (eVar != null) {
                boolean b = eVar.mo21813b(j);
                MethodCollector.m26664o(1038);
                return b;
            }
            MethodCollector.m26664o(1038);
            return false;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m24318a(long j) {
        synchronized (C13538b.class) {
            MethodCollector.m26663i(998);
            AbstractC13542e eVar = f32937a;
            if (eVar != null) {
                boolean a = eVar.mo21812a(j);
                MethodCollector.m26664o(998);
                return a;
            }
            MethodCollector.m26664o(998);
            return false;
        }
    }

    /* renamed from: a */
    public static void m24317a(String str, Throwable th) {
        AbstractC13537a aVar = f32939c;
        if (aVar != null) {
            aVar.mo21789a(str, th);
        }
    }
}
