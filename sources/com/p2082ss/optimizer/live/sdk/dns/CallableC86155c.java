package com.p2082ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import com.p2082ss.optimizer.live.sdk.p4400a.C86123a;
import com.p2082ss.optimizer.live.sdk.p4400a.C86129d;
import com.p2082ss.optimizer.live.sdk.p4400a.p4401a.C86124a;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.dns.c */
public final class CallableC86155c implements Callable<C86124a> {
    static {
        Covode.recordClassIndex(101297);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ C86124a call() {
        String sb;
        if (C86137a.f192082e == null) {
            sb = null;
        } else {
            int i = 0;
            StringBuilder sb2 = new StringBuilder("{ \"IpMap\":{");
            for (C86160h hVar : C86137a.f192082e.values()) {
                C86164k kVar = hVar.f192143b;
                if (kVar != null) {
                    if (i != 0) {
                        sb2.append(",");
                    }
                    sb2.append(kVar.toString());
                    i++;
                }
            }
            sb2.append("}}");
            sb = sb2.toString();
        }
        C86123a aVar = C86129d.m147927a().f192060b;
        return new C86124a(new JSONObject(aVar.f192032b.mo16646a(C86123a.m147920a(aVar.f192031a + "/video/live/qos/v2/ipSettings", aVar.f192033c), sb.toString().getBytes("UTF-8"), "application/json; charset=utf-8")));
    }
}
