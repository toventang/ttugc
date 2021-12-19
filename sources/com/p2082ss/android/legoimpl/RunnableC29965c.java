package com.p2082ss.android.legoimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21525c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;

/* renamed from: com.ss.android.legoimpl.c */
final /* synthetic */ class RunnableC29965c implements Runnable {

    /* renamed from: a */
    private final long f71465a;

    /* renamed from: b */
    private final AbstractC21525c f71466b;

    /* renamed from: c */
    private final boolean f71467c;

    static {
        Covode.recordClassIndex(36394);
    }

    RunnableC29965c(long j, AbstractC21525c cVar, boolean z) {
        this.f71465a = j;
        this.f71466b = cVar;
        this.f71467c = z;
    }

    public final void run() {
        long j = this.f71465a;
        AbstractC21525c cVar = this.f71466b;
        boolean z = this.f71467c;
        C39163s sVar = new C39163s();
        sVar.mo67941a("duration", String.valueOf(j));
        sVar.mo67941a("layout", cVar.mo35178a());
        sVar.mo67941a("main", String.valueOf(z));
        C39162r.m79461a("inflate_preload_report", sVar.mo67942a());
    }
}
