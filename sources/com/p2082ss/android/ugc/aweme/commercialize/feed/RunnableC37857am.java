package com.p2082ss.android.ugc.aweme.commercialize.feed;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33133p;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.am */
final /* synthetic */ class RunnableC37857am implements Runnable {

    /* renamed from: a */
    private final C37899g f89356a;

    /* renamed from: b */
    private final C33133p f89357b;

    static {
        Covode.recordClassIndex(45309);
    }

    RunnableC37857am(C37899g gVar, C33133p pVar) {
        this.f89356a = gVar;
        this.f89357b = pVar;
    }

    public final void run() {
        C37899g gVar = this.f89356a;
        this.f89357b.f78724b.onEvent(new AbstractC16191p(gVar.mo66011L().longValue()) {
            /* class com.p2082ss.android.ugc.aweme.commercialize.feed.C37899g.C379074 */

            /* renamed from: a */
            final /* synthetic */ long f89541a;

            static {
                Covode.recordClassIndex(45359);
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: a */
            public final String mo25699a() {
                return "progressUpdate";
            }

            @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
            /* renamed from: b */
            public final Object mo25700b() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("current_time", this.f89541a);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return jSONObject;
            }

            {
                this.f89541a = r2;
            }
        });
    }
}
