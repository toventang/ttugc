package com.google.android.gms.common.p1938c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.google.android.gms.common.c.c */
public final class C25500c {

    /* renamed from: a */
    public static C25500c f60481a = new C25500c();

    /* renamed from: b */
    private C25499b f60482b;

    static {
        Covode.recordClassIndex(30899);
    }

    /* renamed from: b */
    private static Context m49177b(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public final synchronized C25499b mo41741a(Context context) {
        C25499b bVar;
        MethodCollector.m26663i(9437);
        if (this.f60482b == null) {
            if (m49177b(context) != null) {
                context = m49177b(context);
            }
            this.f60482b = new C25499b(context);
        }
        bVar = this.f60482b;
        MethodCollector.m26664o(9437);
        return bVar;
    }
}
