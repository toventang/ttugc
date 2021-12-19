package com.p2082ss.android.ugc.aweme.p3452ml.infra.p3457a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.AbstractC30093n;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.MlSdkConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSceneConfig;
import com.p2082ss.android.ugc.aweme.p3452ml.infra.SmartSdkConfig;

/* renamed from: com.ss.android.ugc.aweme.ml.infra.a.b */
public final class C60082b implements AbstractC30093n {

    /* renamed from: a */
    public String f136908a;

    /* renamed from: b */
    public final SmartSceneConfig f136909b;

    static {
        Covode.recordClassIndex(70590);
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: d */
    public final String mo53470d() {
        return "bytenn";
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: b */
    public final String mo53468b() {
        String scene;
        SmartSceneConfig smartSceneConfig = this.f136909b;
        if (smartSceneConfig == null || (scene = smartSceneConfig.getScene()) == null) {
            return "default";
        }
        return scene;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: a */
    public final String mo53467a() {
        SmartSdkConfig sdkConfig;
        MlSdkConfig mlSdkConfig;
        String packageUrl;
        SmartSceneConfig smartSceneConfig = this.f136909b;
        if (smartSceneConfig == null || (sdkConfig = smartSceneConfig.getSdkConfig()) == null || (mlSdkConfig = sdkConfig.getMlSdkConfig()) == null || (packageUrl = mlSdkConfig.getPackageUrl()) == null) {
            return "";
        }
        return packageUrl;
    }

    @Override // com.p2082ss.android.p2160ml.AbstractC30093n
    /* renamed from: c */
    public final boolean mo53469c() {
        SmartSceneConfig smartSceneConfig = this.f136909b;
        if (smartSceneConfig == null || smartSceneConfig.getDisable() || TextUtils.isEmpty(this.f136908a)) {
            return false;
        }
        return true;
    }

    public C60082b(SmartSceneConfig smartSceneConfig) {
        String str;
        SmartSdkConfig sdkConfig;
        MlSdkConfig mlSdkConfig;
        this.f136909b = smartSceneConfig;
        if (smartSceneConfig == null || (sdkConfig = smartSceneConfig.getSdkConfig()) == null || (mlSdkConfig = sdkConfig.getMlSdkConfig()) == null) {
            str = null;
        } else {
            str = mlSdkConfig.getPackageUrl();
        }
        this.f136908a = str;
    }
}
