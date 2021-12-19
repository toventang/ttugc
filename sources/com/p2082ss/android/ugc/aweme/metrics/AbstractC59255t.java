package com.p2082ss.android.ugc.aweme.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import java.io.Serializable;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.metrics.t */
public abstract class AbstractC59255t implements Serializable {

    /* renamed from: a */
    protected final HashMap<String, String> f135346a = new HashMap<>();

    static {
        Covode.recordClassIndex(69618);
    }

    public abstract HashMap<String, String> buildParams();

    public void installToMetrics(AbstractC59233c cVar) {
        HashMap<String, String> buildParams = buildParams();
        if (cVar != null) {
            cVar.mo96788a(buildParams);
        }
    }

    public final void appendParam(String str, String str2, AbstractC59233c.AbstractC59234a aVar) {
        this.f135346a.put(str, aVar.mo96795a(str2));
    }
}
