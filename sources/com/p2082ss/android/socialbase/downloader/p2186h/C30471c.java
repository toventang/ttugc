package com.p2082ss.android.socialbase.downloader.p2186h;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import com.p2082ss.android.socialbase.downloader.segment.C30599a;
import java.io.InputStream;

/* renamed from: com.ss.android.socialbase.downloader.h.c */
public final class C30471c implements AbstractC30470b {

    /* renamed from: a */
    private final InputStream f72637a;

    /* renamed from: b */
    private final C30599a f72638b;

    static {
        Covode.recordClassIndex(36998);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b
    /* renamed from: a */
    public final void mo54254a(C30599a aVar) {
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b
    /* renamed from: b */
    public final void mo54255b() {
        C30535g.m62556a(this.f72637a);
    }

    @Override // com.p2082ss.android.socialbase.downloader.p2186h.AbstractC30470b
    /* renamed from: a */
    public final C30599a mo54253a() {
        MethodCollector.m26663i(10920);
        C30599a aVar = this.f72638b;
        aVar.f73034c = this.f72637a.read(aVar.f73032a);
        C30599a aVar2 = this.f72638b;
        MethodCollector.m26664o(10920);
        return aVar2;
    }

    public C30471c(InputStream inputStream, int i) {
        this.f72637a = inputStream;
        this.f72638b = new C30599a(i);
    }
}
