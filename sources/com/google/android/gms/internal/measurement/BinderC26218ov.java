package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.measurement.ov */
public final class BinderC26218ov extends AbstractBinderC26225pb {

    /* renamed from: a */
    private final AtomicReference<Bundle> f61626a = new AtomicReference<>();

    /* renamed from: b */
    private boolean f61627b;

    static {
        Covode.recordClassIndex(31633);
    }

    /* renamed from: a */
    public final String mo42911a(long j) {
        return (String) m51336a(mo42913b(j), String.class);
    }

    /* renamed from: b */
    public final Bundle mo42913b(long j) {
        Bundle bundle;
        MethodCollector.m26663i(8836);
        synchronized (this.f61626a) {
            try {
                if (!this.f61627b) {
                    try {
                        this.f61626a.wait(j);
                    } catch (InterruptedException unused) {
                        return null;
                    }
                }
                bundle = this.f61626a.get();
            } finally {
                MethodCollector.m26664o(8836);
            }
        }
        MethodCollector.m26664o(8836);
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26221oy
    /* renamed from: a */
    public final void mo42912a(Bundle bundle) {
        MethodCollector.m26663i(8680);
        synchronized (this.f61626a) {
            try {
                this.f61626a.set(bundle);
                this.f61627b = true;
                try {
                    this.f61626a.notify();
                } finally {
                    MethodCollector.m26664o(8680);
                }
            } catch (Throwable th) {
                this.f61626a.notify();
                MethodCollector.m26664o(8680);
                throw th;
            }
        }
    }

    /* renamed from: a */
    private static Object m51337a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m51336a(Bundle bundle, Class<T> cls) {
        Object a;
        if (bundle == null || (a = m51337a(bundle, "r")) == null) {
            return null;
        }
        try {
            return cls.cast(a);
        } catch (ClassCastException e) {
            C1764a.m5928a("Unexpected object type. Expected, Received".concat(": %s, %s"), new Object[]{cls.getCanonicalName(), a.getClass().getCanonicalName()});
            throw e;
        }
    }
}
