package com.ttnet.org.chromium.base;

import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;

/* renamed from: com.ttnet.org.chromium.base.m */
public final class C87468m implements Closeable {

    /* renamed from: a */
    private final StrictMode.ThreadPolicy f198391a;

    /* renamed from: b */
    private final StrictMode.VmPolicy f198392b;

    static {
        Covode.recordClassIndex(103408);
    }

    /* renamed from: a */
    public static C87468m m151813a() {
        return new C87468m(StrictMode.allowThreadDiskWrites());
    }

    /* renamed from: b */
    public static C87468m m151814b() {
        return new C87468m(StrictMode.allowThreadDiskReads());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.f198391a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.f198392b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    private C87468m(StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    public C87468m(StrictMode.VmPolicy vmPolicy) {
        this(null, vmPolicy);
    }

    private C87468m(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.f198391a = threadPolicy;
        this.f198392b = vmPolicy;
    }
}
