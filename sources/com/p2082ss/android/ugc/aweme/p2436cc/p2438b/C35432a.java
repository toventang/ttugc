package com.p2082ss.android.ugc.aweme.p2436cc.p2438b;

import com.bytedance.apm.p786n.C12556c;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46917ex;
import com.p2082ss.android.ugc.aweme.p2436cc.AbstractC35423a;
import com.p2082ss.android.ugc.aweme.p2436cc.EnumC35431b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cc.b.a */
public final class C35432a implements AbstractC35423a {

    /* renamed from: a */
    final String f83595a = "prf_page_load";

    static {
        Covode.recordClassIndex(42608);
    }

    /* renamed from: com.ss.android.ugc.aweme.cc.b.a$a */
    static final class RunnableC35433a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35432a f83596a;

        /* renamed from: b */
        final /* synthetic */ String f83597b;

        /* renamed from: c */
        final /* synthetic */ EnumC35431b f83598c;

        /* renamed from: d */
        final /* synthetic */ long f83599d;

        static {
            Covode.recordClassIndex(42609);
        }

        RunnableC35433a(C35432a aVar, String str, EnumC35431b bVar, long j) {
            this.f83596a = aVar;
            this.f83597b = str;
            this.f83598c = bVar;
            this.f83599d = j;
        }

        public final void run() {
            C35432a aVar = this.f83596a;
            String str = this.f83597b;
            EnumC35431b bVar = this.f83598c;
            long j = this.f83599d;
            if (C46917ex.f109335a && C12556c.m22585a(aVar.f83595a)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                jSONObject.put("load_time", j);
                jSONObject.put("load_result", String.valueOf(bVar.getValue()));
                C39162r.m79461a(aVar.f83595a, jSONObject);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2436cc.AbstractC35423a
    /* renamed from: a */
    public final void mo62327a(String str, EnumC35431b bVar, long j) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C40780g.m82246c().execute(new RunnableC35433a(this, str, bVar, j));
    }
}
