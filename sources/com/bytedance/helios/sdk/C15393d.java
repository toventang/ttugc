package com.bytedance.helios.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.CrpConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.SampleRateConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89086z;

/* renamed from: com.bytedance.helios.sdk.d */
public final class C15393d extends AbstractSettingsModel {

    /* renamed from: a */
    private final boolean f37561a;

    /* renamed from: b */
    private final boolean f37562b;

    /* renamed from: c */
    private final long f37563c = TimeUnit.HOURS.toMillis(2);

    /* renamed from: d */
    private final long f37564d = TimeUnit.SECONDS.toMillis(6);

    /* renamed from: e */
    private final List<AnchorInfoModel> f37565e = C89086z.INSTANCE;

    /* renamed from: f */
    private final List<ResourceCheckModel> f37566f = C89086z.INSTANCE;

    /* renamed from: g */
    private final List<String> f37567g = C89086z.INSTANCE;

    /* renamed from: h */
    private final List<RuleInfo> f37568h = new ArrayList();

    /* renamed from: i */
    private final List<FrequencyGroupModel> f37569i = C89086z.INSTANCE;

    /* renamed from: j */
    private final List<String> f37570j = C89086z.INSTANCE;

    /* renamed from: k */
    private final SampleRateConfig f37571k = new SampleRateConfig(false, 0.0d, 0.0d, 0.0d, null, null, null, 127, null);

    /* renamed from: l */
    private final long f37572l = 500;

    /* renamed from: m */
    private final ApiConfig f37573m = new ApiConfig(null, null, 3, null);

    /* renamed from: n */
    private final CrpConfig f37574n = new CrpConfig(0, 0, 3, null);

    /* renamed from: o */
    private final boolean f37575o;

    static {
        Covode.recordClassIndex(17645);
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getAlogDuration() {
        return this.f37563c;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAlogEnabled() {
        return this.f37562b;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<AnchorInfoModel> getAnchorConfigList() {
        return this.f37565e;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final ApiConfig getApiConfig() {
        return this.f37573m;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getApiTimeOutDuration() {
        return this.f37564d;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAppOpsIgnoreKnownApi() {
        return this.f37575o;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getBackgroundFreezeDuration() {
        return this.f37572l;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final CrpConfig getCrpConfig() {
        return this.f37574n;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getEnabled() {
        return this.f37561a;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<FrequencyGroupModel> getFrequencyGroupModels() {
        return this.f37569i;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getInterestedAppOps() {
        return this.f37570j;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<ResourceCheckModel> getResourceCheckList() {
        return this.f37566f;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<RuleInfo> getRuleInfoList() {
        return this.f37568h;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final SampleRateConfig getSampleRateConfig() {
        return this.f37571k;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getTestEnvChannels() {
        return this.f37567g;
    }
}
