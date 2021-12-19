package com.p2082ss.android.ugc.aweme.p3452ml.infra;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.C30120t;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.AbstractC60086f;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.C60083c;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a.C60084d;
import com.p2082ss.android.ugc.aweme.p3452ml.p3454ab.C59991f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.i */
public final class C60096i {

    /* renamed from: a */
    public AbstractC60086f f136930a;

    /* renamed from: b */
    public boolean f136931b;

    /* renamed from: c */
    public int f136932c;

    /* renamed from: d */
    public int f136933d;

    /* renamed from: e */
    public int f136934e;

    /* renamed from: f */
    public boolean f136935f;

    /* renamed from: g */
    public boolean f136936g;

    /* renamed from: h */
    public int f136937h = -100;

    /* renamed from: i */
    public C60100k f136938i;

    /* renamed from: j */
    public String f136939j;

    /* renamed from: k */
    public SmartSceneConfig f136940k;

    /* renamed from: l */
    private boolean f136941l;

    /* renamed from: m */
    private C60097j f136942m;

    static {
        Covode.recordClassIndex(70604);
    }

    /* renamed from: a */
    public final C60097j mo97627a() {
        MlSdkConfig mlSdkConfig;
        String packageUrl;
        PitayaConfig pitayaConfig;
        String businessName;
        if (!this.f136941l) {
            this.f136941l = true;
            if (C59991f.m109509a(this.f136939j)) {
                String str = this.f136939j;
                C60097j jVar = C60097j.f136944q.get(str);
                if (jVar == null) {
                    jVar = new C60097j(str);
                    jVar.f136946a = C59991f.m109509a(str);
                    C60097j.f136944q.put(str, jVar);
                }
                this.f136942m = jVar;
                SmartSceneConfig smartSceneConfig = this.f136940k;
                if (smartSceneConfig != null) {
                    SmartSdkConfig sdkConfig = smartSceneConfig.getSdkConfig();
                    if (!(sdkConfig == null || (pitayaConfig = sdkConfig.getPitayaConfig()) == null || (businessName = pitayaConfig.getBusinessName()) == null)) {
                        jVar.f136948c = businessName;
                    }
                    SmartSdkConfig sdkConfig2 = smartSceneConfig.getSdkConfig();
                    if (!(sdkConfig2 == null || (mlSdkConfig = sdkConfig2.getMlSdkConfig()) == null || (packageUrl = mlSdkConfig.getPackageUrl()) == null)) {
                        String a = C30120t.m60918a(packageUrl);
                        C89219l.m154716b(a, "");
                        jVar.f136948c = a;
                    }
                }
            }
        }
        return this.f136942m;
    }

    public final String toString() {
        return "(scene='" + this.f136939j + "', isRunning=" + this.f136931b + ", env:" + this.f136935f + ", envNotReadyTimes=" + this.f136933d + ", runFailTimes=" + this.f136934e + ", runCount=" + this.f136932c + ", success=" + this.f136936g + ", errorCode=" + this.f136937h + ", lastSuccessResult=" + this.f136938i + ", config=" + this.f136940k + ", runner=" + this.f136930a + ')';
    }

    public C60096i(String str, SmartSceneConfig smartSceneConfig) {
        SmartSdkConfig sdkConfig;
        C89219l.m154721d(str, "");
        C89219l.m154721d(smartSceneConfig, "");
        this.f136939j = str;
        this.f136940k = smartSceneConfig;
        C89219l.m154721d(smartSceneConfig, "");
        String str2 = smartSceneConfig.outType;
        AbstractC60086f fVar = null;
        if (!(smartSceneConfig.getDisable() || smartSceneConfig.getSdkConfig() == null || str2 == null || (sdkConfig = smartSceneConfig.getSdkConfig()) == null || sdkConfig.getMlSdkConfig() == null)) {
            int hashCode = str2.hashCode();
            if (hashCode != 692443780) {
                if (hashCode == 1421312065 && str2.equals("regression")) {
                    fVar = new C60084d(smartSceneConfig);
                }
            } else if (str2.equals("classify")) {
                fVar = new C60083c(smartSceneConfig);
            }
        }
        this.f136930a = fVar;
    }
}
