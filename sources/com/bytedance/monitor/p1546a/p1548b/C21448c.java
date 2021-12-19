package com.bytedance.monitor.p1546a.p1548b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.p1546a.p1548b.C21435a;
import java.util.Locale;

/* renamed from: com.bytedance.monitor.a.b.c */
public final class C21448c {
    static {
        Covode.recordClassIndex(25071);
    }

    /* renamed from: a */
    public static String m40281a(AbstractRunnableC21452e eVar) {
        if (eVar == null) {
            return "null";
        }
        return eVar.mo20277a() + ", " + eVar.mo20278b();
    }

    /* renamed from: a */
    public static AbstractRunnableC21452e m40280a(String str, Runnable runnable) {
        return m40279a(EnumC21447b.LIGHT_WEIGHT, str, runnable);
    }

    /* renamed from: a */
    public static void m40282a(AbstractC21453f fVar, String str) {
        if (fVar != null && fVar.mo35056a()) {
            String name = Thread.currentThread().getName();
            C1764a.m5929a(Locale.CHINA, "[callerThread: %s] \n %s", new Object[]{name, str});
        }
    }

    /* renamed from: a */
    private static AbstractRunnableC21452e m40279a(final EnumC21447b bVar, final String str, final Runnable runnable) {
        return new AbstractRunnableC21452e() {
            /* class com.bytedance.monitor.p1546a.p1548b.C21448c.C214491 */

            static {
                Covode.recordClassIndex(25072);
            }

            @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
            /* renamed from: a */
            public final String mo20277a() {
                return str;
            }

            @Override // com.bytedance.monitor.p1546a.p1548b.AbstractRunnableC21452e
            /* renamed from: b */
            public final EnumC21447b mo20278b() {
                return bVar;
            }

            public final void run() {
                try {
                    Runnable runnable = runnable;
                    if (runnable != null) {
                        runnable.run();
                        C21435a aVar = C21435a.C21439a.f50832a;
                        if (aVar != null && aVar.mo35039b() != null && aVar.mo35039b().mo35056a()) {
                            C21448c.m40282a(aVar.mo35039b(), "task execute: " + bVar + "  /  " + str);
                        }
                    }
                } catch (Throwable th) {
                    C21435a.C21439a.f50832a.mo35037a(th, "APM_INNER_ERROR_async_task");
                }
            }
        };
    }
}
