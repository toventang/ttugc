package com.facebook.imagepipeline.p1885j;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;

/* renamed from: com.facebook.imagepipeline.j.a */
public final class C24452a extends AbstractC24454c {

    /* renamed from: a */
    public final C24361b f58087a;

    /* renamed from: b */
    private C24325e f58088b;

    static {
        Covode.recordClassIndex(28595);
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c
    /* renamed from: c */
    public final boolean mo40291c() {
        return true;
    }

    /* renamed from: d */
    public final synchronized C24325e mo40293d() {
        C24325e eVar;
        MethodCollector.m26663i(4219);
        eVar = this.f58088b;
        MethodCollector.m26664o(4219);
        return eVar;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c
    /* renamed from: a */
    public final synchronized boolean mo40289a() {
        MethodCollector.m26663i(4214);
        if (this.f58088b == null) {
            MethodCollector.m26664o(4214);
            return true;
        }
        MethodCollector.m26664o(4214);
        return false;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MethodCollector.m26663i(4213);
        synchronized (this) {
            try {
                C24325e eVar = this.f58088b;
                if (eVar != null) {
                    this.f58088b = null;
                    eVar.mo40126b();
                    MethodCollector.m26664o(4213);
                }
            } finally {
                MethodCollector.m26664o(4213);
            }
        }
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24454c
    /* renamed from: b */
    public final synchronized int mo40290b() {
        MethodCollector.m26663i(4216);
        if (mo40289a()) {
            MethodCollector.m26664o(4216);
            return 0;
        }
        int sizeInBytes = this.f58088b.f57681a.getSizeInBytes();
        MethodCollector.m26664o(4216);
        return sizeInBytes;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24457f
    public final synchronized int getHeight() {
        MethodCollector.m26663i(4212);
        if (mo40289a()) {
            MethodCollector.m26664o(4212);
            return 0;
        }
        int height = this.f58088b.f57681a.getHeight();
        MethodCollector.m26664o(4212);
        return height;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24457f
    public final synchronized int getWidth() {
        MethodCollector.m26663i(4210);
        if (mo40289a()) {
            MethodCollector.m26664o(4210);
            return 0;
        }
        int width = this.f58088b.f57681a.getWidth();
        MethodCollector.m26664o(4210);
        return width;
    }

    public C24452a(C24325e eVar, C24361b bVar) {
        this.f58088b = eVar;
        this.f58087a = bVar;
    }
}
