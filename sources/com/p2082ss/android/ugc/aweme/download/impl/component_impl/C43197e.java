package com.p2082ss.android.ugc.aweme.download.impl.component_impl;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;

/* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.e */
public class C43197e {

    /* renamed from: b */
    private static volatile C43197e f100688b;

    /* renamed from: a */
    SparseArray<AbstractC43167a> f100689a = new SparseArray<>();

    static {
        Covode.recordClassIndex(51384);
    }

    private C43197e() {
    }

    /* renamed from: a */
    public static C43197e m86150a() {
        MethodCollector.m26663i(12934);
        if (f100688b == null) {
            synchronized (C43197e.class) {
                try {
                    if (f100688b == null) {
                        f100688b = new C43197e();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(12934);
                    throw th;
                }
            }
        }
        C43197e eVar = f100688b;
        MethodCollector.m26664o(12934);
        return eVar;
    }

    /* renamed from: a */
    public final void mo73442a(int i, AbstractC43167a aVar) {
        if (aVar != null) {
            this.f100689a.put(i, aVar);
        }
    }
}
