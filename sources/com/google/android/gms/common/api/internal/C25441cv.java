package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.api.C25351e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p1940d.C25632i;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cv */
public final class C25441cv {

    /* renamed from: a */
    final Map<BasePendingResult<?>, Boolean> f60385a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    final Map<C25632i<?>, Boolean> f60386b = Collections.synchronizedMap(new WeakHashMap());

    static {
        Covode.recordClassIndex(30840);
    }

    /* renamed from: b */
    public final void mo41667b() {
        m49057a(false, C25450f.f60403a);
    }

    /* renamed from: c */
    public final void mo41668c() {
        m49057a(true, C25416bz.f60306a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo41666a() {
        if (!this.f60385a.isEmpty() || !this.f60386b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m49057a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        MethodCollector.m26663i(9716);
        synchronized (this.f60385a) {
            try {
                hashMap = new HashMap(this.f60385a);
            } finally {
                MethodCollector.m26664o(9716);
            }
        }
        synchronized (this.f60386b) {
            try {
                hashMap2 = new HashMap(this.f60386b);
            } finally {
                MethodCollector.m26664o(9716);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo41546c(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C25632i) entry2.getKey()).mo41895b((Exception) new C25351e(status));
            }
        }
    }
}
