package com.p2082ss.android.legoimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.nita.api.AbstractC21525c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;

/* renamed from: com.ss.android.legoimpl.d */
final /* synthetic */ class RunnableC29966d implements Runnable {

    /* renamed from: a */
    private final long f71468a;

    /* renamed from: b */
    private final AbstractC21525c f71469b;

    /* renamed from: c */
    private final boolean f71470c;

    /* renamed from: d */
    private final boolean f71471d;

    static {
        Covode.recordClassIndex(36395);
    }

    RunnableC29966d(long j, AbstractC21525c cVar, boolean z, boolean z2) {
        this.f71468a = j;
        this.f71469b = cVar;
        this.f71470c = z;
        this.f71471d = z2;
    }

    public final void run() {
        long j = this.f71468a;
        AbstractC21525c cVar = this.f71469b;
        boolean z = this.f71470c;
        boolean z2 = this.f71471d;
        C39163s sVar = new C39163s();
        sVar.mo67941a("duration", String.valueOf(j));
        sVar.mo67941a("layout", cVar.mo35178a());
        sVar.mo67941a("cached", String.valueOf(z));
        sVar.mo67941a("main", String.valueOf(z2));
        C39162r.m79461a("inflate_getview_report", sVar.mo67942a());
    }
}
