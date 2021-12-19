package com.bytedance.lobby.internal;

import androidx.core.p036g.C0692e;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.auth.AbstractC20884a;
import com.bytedance.lobby.auth.AuthResult;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.lobby.internal.a */
public final class C20914a {

    /* renamed from: b */
    private static volatile C20914a f49463b;

    /* renamed from: a */
    public final Map<C0692e<String, Integer>, List<AbstractC20884a>> f49464a = new C0484a();

    static {
        Covode.recordClassIndex(24520);
    }

    private C20914a() {
    }

    /* renamed from: a */
    public static C20914a m39334a() {
        MethodCollector.m26663i(6680);
        if (f49463b == null) {
            synchronized (C20914a.class) {
                try {
                    if (f49463b == null) {
                        f49463b = new C20914a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6680);
                    throw th;
                }
            }
        }
        C20914a aVar = f49463b;
        MethodCollector.m26664o(6680);
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34365a(String str, int i, AuthResult authResult) {
        MethodCollector.m26663i(6821);
        synchronized (this.f49464a) {
            try {
                List<AbstractC20884a> list = this.f49464a.get(new C0692e(str, Integer.valueOf(i)));
                if (!(list == null || authResult == null)) {
                    for (AbstractC20884a aVar : list) {
                        aVar.mo34320a(authResult);
                    }
                    list.clear();
                }
            } finally {
                MethodCollector.m26664o(6821);
            }
        }
    }
}
