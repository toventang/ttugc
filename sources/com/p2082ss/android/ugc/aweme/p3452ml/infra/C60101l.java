package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.OnePlaytimePredictRealConfig;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.l */
public final class C60101l implements AbstractC60089c {

    /* renamed from: a */
    public int f136968a;

    /* renamed from: b */
    public boolean f136969b;

    /* renamed from: c */
    public long f136970c;

    /* renamed from: d */
    public int f136971d;

    /* renamed from: e */
    public int f136972e;

    /* renamed from: f */
    public String f136973f;

    /* renamed from: g */
    public OnePlaytimePredictConfig f136974g;

    static {
        Covode.recordClassIndex(70609);
    }

    public final String toString() {
        return "(scene='" + this.f136973f + "', isRunning=" + this.f136969b + ", runCount:" + this.f136972e + ", skipFeedCount=" + this.f136971d + ", skipTimes=" + this.f136968a + ", lastRunTime=" + this.f136970c + ", config:" + this.f136974g + ')';
    }

    @Override // com.p2082ss.android.ugc.aweme.p3452ml.infra.AbstractC60089c
    /* renamed from: a */
    public final boolean mo97624a(JSONObject jSONObject) {
        OnePlaytimePredictRealConfig realConfig;
        if (jSONObject == null || (realConfig = this.f136974g.getRealConfig()) == null) {
            return false;
        }
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(realConfig, "");
        if (C60093g.f136920c.size() > 64) {
            C60093g.f136920c.clear();
        }
        C60093g.f136920c.addLast(new C60093g(jSONObject, realConfig));
        return true;
    }

    public C60101l(String str, OnePlaytimePredictConfig onePlaytimePredictConfig) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(onePlaytimePredictConfig, "");
        this.f136973f = str;
        this.f136974g = onePlaytimePredictConfig;
    }
}
