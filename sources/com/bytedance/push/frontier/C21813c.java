package com.bytedance.push.frontier;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.frontier.p1594a.AbstractC21806a;
import com.bytedance.push.frontier.p1594a.AbstractC21808c;
import com.bytedance.push.frontier.setting.C21817c;

/* renamed from: com.bytedance.push.frontier.c */
public class C21813c {

    /* renamed from: a */
    private static volatile C21813c f51696a;

    /* renamed from: b */
    private volatile AbstractC21808c f51697b;

    /* renamed from: c */
    private volatile AbstractC21806a f51698c;

    static {
        Covode.recordClassIndex(25463);
    }

    private C21813c() {
    }

    /* renamed from: a */
    public static C21813c m40850a() {
        MethodCollector.m26663i(7999);
        if (f51696a == null) {
            synchronized (C21813c.class) {
                try {
                    if (f51696a == null) {
                        f51696a = new C21813c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(7999);
                    throw th;
                }
            }
        }
        C21813c cVar = f51696a;
        MethodCollector.m26664o(7999);
        return cVar;
    }

    /* renamed from: b */
    public final AbstractC21808c mo35495b() {
        MethodCollector.m26663i(8145);
        if (this.f51697b == null) {
            synchronized (this) {
                try {
                    if (this.f51697b == null) {
                        this.f51697b = new C21817c();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8145);
                    throw th;
                }
            }
        }
        AbstractC21808c cVar = this.f51697b;
        MethodCollector.m26664o(8145);
        return cVar;
    }

    /* renamed from: c */
    public final AbstractC21806a mo35496c() {
        MethodCollector.m26663i(8283);
        if (this.f51698c == null) {
            synchronized (this) {
                try {
                    if (this.f51698c == null) {
                        this.f51698c = new C21805a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(8283);
                    throw th;
                }
            }
        }
        AbstractC21806a aVar = this.f51698c;
        MethodCollector.m26664o(8283);
        return aVar;
    }
}
