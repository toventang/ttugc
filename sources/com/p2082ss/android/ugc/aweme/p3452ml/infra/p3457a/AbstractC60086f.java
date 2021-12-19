package com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.C60100k;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSceneConfig;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.a.f */
public abstract class AbstractC60086f {

    /* renamed from: d */
    public String f136913d = "";

    /* renamed from: e */
    public String f136914e = "";

    /* renamed from: f */
    public C60100k f136915f;

    /* renamed from: g */
    public final SmartSceneConfig f136916g;

    static {
        Covode.recordClassIndex(70594);
    }

    /* renamed from: a */
    public abstract void mo97615a(C60087g gVar, AbstractC60081a aVar);

    /* renamed from: a */
    public void mo97616a(boolean z, JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
    }

    /* renamed from: a */
    public abstract boolean mo97617a();

    /* renamed from: b */
    public abstract boolean mo97619b();

    /* renamed from: c */
    public abstract void mo97620c();

    /* renamed from: d */
    public boolean mo97621d() {
        SmartSceneConfig smartSceneConfig = this.f136916g;
        if (smartSceneConfig == null || smartSceneConfig.getDisable()) {
            return false;
        }
        return true;
    }

    public AbstractC60086f(SmartSceneConfig smartSceneConfig) {
        String str;
        this.f136916g = smartSceneConfig;
        this.f136913d = (smartSceneConfig == null || (str = smartSceneConfig.getScene()) == null) ? "default" : str;
        this.f136914e = "ml#" + this.f136913d;
    }
}
