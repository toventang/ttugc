package com.p2082ss.android.ugc.aweme.p2436cc.p2437a;

import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46918ey;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cc.a.c */
public final class C35426c {

    /* renamed from: a */
    final String f83578a = "prf_page_start_time";

    static {
        Covode.recordClassIndex(42602);
    }

    /* renamed from: com.ss.android.ugc.aweme.cc.a.c$a */
    static final class RunnableC35427a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35426c f83579a;

        /* renamed from: b */
        final /* synthetic */ String f83580b;

        /* renamed from: c */
        final /* synthetic */ long f83581c;

        static {
            Covode.recordClassIndex(42603);
        }

        RunnableC35427a(C35426c cVar, String str, long j) {
            this.f83579a = cVar;
            this.f83580b = str;
            this.f83581c = j;
        }

        public final void run() {
            C35426c cVar = this.f83579a;
            String str = this.f83580b;
            long j = this.f83581c;
            C89219l.m154721d(str, "");
            if (C46918ey.f109338a && C12556c.m22585a(cVar.f83578a)) {
                C89219l.m154721d(str, "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                jSONObject.put("load_time", j);
                C39162r.m79461a(cVar.f83578a, jSONObject);
            }
        }
    }
}
