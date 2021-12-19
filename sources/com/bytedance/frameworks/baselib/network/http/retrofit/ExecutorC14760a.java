package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.p980b.AbstractC14598c;
import com.bytedance.frameworks.baselib.network.p980b.AbstractC14600d;
import com.bytedance.frameworks.baselib.network.p980b.C14596a;
import com.bytedance.frameworks.baselib.network.p980b.C14604f;
import com.bytedance.retrofit2.AbstractRunnableC22100v;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a */
public final class ExecutorC14760a implements Executor {

    /* renamed from: a */
    private static volatile AbstractC14600d f35974a;

    static {
        Covode.recordClassIndex(16859);
    }

    public final void execute(Runnable runnable) {
        int i;
        if (runnable != null) {
            AbstractC14598c.EnumC14599a aVar = AbstractC14598c.EnumC14599a.NORMAL;
            boolean z = false;
            if (runnable instanceof AbstractRunnableC22100v) {
                AbstractRunnableC22100v vVar = (AbstractRunnableC22100v) runnable;
                int a = vVar.mo35765a();
                if (a == 0) {
                    aVar = AbstractC14598c.EnumC14599a.LOW;
                } else {
                    if (1 != a) {
                        if (2 == a) {
                            aVar = AbstractC14598c.EnumC14599a.HIGH;
                        } else if (3 == a) {
                            aVar = AbstractC14598c.EnumC14599a.IMMEDIATE;
                        }
                    }
                    aVar = AbstractC14598c.EnumC14599a.NORMAL;
                }
                z = vVar.mo35766b();
                i = vVar.mo35767c();
            } else {
                i = 0;
            }
            if (f35974a == null) {
                f35974a = C14604f.m26689b();
            }
            C14596a aVar2 = new C14596a("NetExecutor", aVar, i, runnable, z);
            if (z) {
                f35974a.mo23476a(aVar2);
            } else {
                f35974a.mo23477b(aVar2);
            }
        }
    }
}
