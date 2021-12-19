package com.bytedance.bdturing.twiceverify;

import com.bytedance.bdturing.twiceverify.AbstractC13312b;
import com.bytedance.bdturing.verify.p867a.AbstractC13322a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.bdturing.twiceverify.c */
public class C13314c {

    /* renamed from: e */
    private static volatile C13314c f32563e;

    /* renamed from: a */
    public AbstractC13312b f32564a;

    /* renamed from: b */
    public AbstractC13316a f32565b;

    /* renamed from: c */
    public C13311a f32566c;

    /* renamed from: d */
    public AbstractC13322a f32567d;

    /* renamed from: f */
    private AbstractC13312b.AbstractC13313a f32568f = new AbstractC13312b.AbstractC13313a() {
        /* class com.bytedance.bdturing.twiceverify.C13314c.C133151 */

        static {
            Covode.recordClassIndex(15281);
        }
    };

    /* renamed from: com.bytedance.bdturing.twiceverify.c$a */
    public interface AbstractC13316a {
        static {
            Covode.recordClassIndex(15282);
        }

        /* renamed from: a */
        void mo21485a();

        /* renamed from: a */
        void mo21486a(int i);
    }

    static {
        Covode.recordClassIndex(15280);
    }

    /* renamed from: a */
    public static C13314c m23939a() {
        MethodCollector.m26663i(4456);
        if (f32563e == null) {
            synchronized (C13314c.class) {
                try {
                    f32563e = new C13314c();
                } catch (Throwable th) {
                    MethodCollector.m26664o(4456);
                    throw th;
                }
            }
        }
        C13314c cVar = f32563e;
        MethodCollector.m26664o(4456);
        return cVar;
    }
}
