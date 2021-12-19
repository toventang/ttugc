package com.p2082ss.android.ugc.aweme.compliance.business.p2651d;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.d.b */
public final class C39406b {

    /* renamed from: a */
    private long f93011a;

    static {
        Covode.recordClassIndex(47093);
    }

    public C39406b(long j) {
        this.f93011a = j;
    }

    /* renamed from: a */
    public final synchronized void mo68869a(long j) {
        MethodCollector.m26663i(9682);
        this.f93011a += j;
        MethodCollector.m26664o(9682);
    }

    /* renamed from: c */
    public final synchronized boolean mo68871c(long j) {
        MethodCollector.m26663i(9977);
        if (this.f93011a >= j) {
            MethodCollector.m26664o(9977);
            return true;
        }
        MethodCollector.m26664o(9977);
        return false;
    }

    /* renamed from: b */
    public final synchronized long mo68870b(long j) {
        MethodCollector.m26663i(9833);
        long j2 = this.f93011a;
        if (j2 == 0) {
            MethodCollector.m26664o(9833);
            return 0;
        } else if (j2 < j) {
            this.f93011a = 0;
            MethodCollector.m26664o(9833);
            return j2;
        } else {
            this.f93011a = j2 - j;
            MethodCollector.m26664o(9833);
            return j;
        }
    }
}
