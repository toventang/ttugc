package com.p2082ss.ugc.aweme.performance.mainlooper.monitor.work;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1697t.p1698a.p1699a.C22723a;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86659a;
import com.p2082ss.ugc.aweme.performance.core.monitor.C86664b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4432a.AbstractC86662a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86666b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4433b.C86667c;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86669a;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b;
import com.p2082ss.ugc.aweme.performance.core.monitor.p4436e.C86677b;
import com.p2082ss.ugc.aweme.performance.mainlooper.monitor.work.C86682a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.SampleJankListener */
public final class SampleJankListener implements AbstractC86675b {
    private long threshold = 100;

    static {
        Covode.recordClassIndex(101911);
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public final void stop() {
        C86682a.C86683a.m150159a().f195394i.removeCallbacksAndMessages(null);
    }

    public SampleJankListener() {
        C86682a a = C86682a.C86683a.m150159a();
        long threshold2 = getThreshold();
        a.f195393h = threshold2;
        double d = (double) threshold2;
        double d2 = C86682a.f195389m;
        Double.isNaN(d);
        a.f195395j = (long) (d * d2);
    }

    @Override // com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b
    public final void setThreshold(long j) {
        this.threshold = j;
    }

    @Override // com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b
    public final void flush(C86667c cVar) {
        C86677b.f195379a.mo137953a(new AbstractC86669a.RunnableC86673c(C86682a.C86683a.m150159a(), cVar));
    }

    @Override // com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b
    public final void onMessageLeave(String str, long j) {
        C89219l.m154719c(str, "");
        C86682a a = C86682a.C86683a.m150159a();
        C89219l.m154719c(str, "");
        if (j - a.f195396k.f195401b < a.f195395j) {
            a.f195394i.removeCallbacks(a.f195396k);
        }
    }

    @Override // com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b
    public final void onMessageArrive(String str, long j) {
        C89219l.m154719c(str, "");
        C86682a a = C86682a.C86683a.m150159a();
        C89219l.m154719c(str, "");
        C86682a.RunnableC86685c cVar = a.f195396k;
        C89219l.m154719c(str, "");
        cVar.f195400a = str;
        a.f195396k.f195401b = j;
        a.f195394i.postDelayed(a.f195396k, a.f195395j);
    }

    @Override // com.p2082ss.ugc.aweme.performance.core.monitor.p4435d.AbstractC86675b
    public final void onJankHappened(String str, long j, long j2, long j3) {
        C89219l.m154719c(str, "");
        C86682a a = C86682a.C86683a.m150159a();
        C89219l.m154719c(str, "");
        C86666b bVar = a.f195370a.get(str);
        AbstractC86662a aVar = C86659a.C86660a.m150136a().f195328b;
        if (aVar == null || !aVar.mo137929e()) {
            if (bVar == null) {
                return;
            }
        } else if (bVar != null) {
            bVar.f195358k = C22723a.m42867a();
        } else {
            return;
        }
        bVar.f195353f = j2;
        if (a.f195372c) {
            C86677b.f195379a.mo137953a(new C86682a.RunnableC86686d(a, bVar));
        }
        if (a.f195370a.size() > C86682a.f195390n && C86664b.f195333a.size() == 0) {
            a.f195370a.size();
            a.f195370a.clear();
        }
    }
}
