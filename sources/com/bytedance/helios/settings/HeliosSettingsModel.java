package com.bytedance.helios.settings;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.AbstractSettingsModel;
import com.bytedance.helios.api.config.AnchorInfoModel;
import com.bytedance.helios.api.config.ApiConfig;
import com.bytedance.helios.api.config.CrpConfig;
import com.bytedance.helios.api.config.FrequencyGroupModel;
import com.bytedance.helios.api.config.ResourceCheckModel;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.api.config.SampleRateConfig;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;

public final class HeliosSettingsModel extends AbstractSettingsModel {
    @AbstractC27891c(mo46611a = "alog_duration")
    private final long alogDuration = TimeUnit.HOURS.toMillis(2);
    @AbstractC27891c(mo46611a = "alog_enabled")
    private final boolean alogEnabled;
    @AbstractC27891c(mo46611a = "anchor_config_list")
    private final List<AnchorInfoModel> anchorConfigList = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "api_config")
    private final ApiConfig apiConfig = new ApiConfig(null, null, 3, null);
    @AbstractC27891c(mo46611a = "api_time_out_duration")
    private final long apiTimeOutDuration = TimeUnit.SECONDS.toMillis(6);
    @AbstractC27891c(mo46611a = "appops_ignore_known_api")
    private final boolean appOpsIgnoreKnownApi;
    @AbstractC27891c(mo46611a = "background_freeze_duration")
    private final long backgroundFreezeDuration = 500;
    @AbstractC27891c(mo46611a = "crp_config")
    private final CrpConfig crpConfig = new CrpConfig(0, 0, 3, null);
    @AbstractC27891c(mo46611a = "enabled")
    private final boolean enabled;
    @AbstractC27891c(mo46611a = "frequency_group_models")
    private final List<FrequencyGroupModel> frequencyGroupModels = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "interested_appops")
    private final List<String> interestedAppOps = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "resource_check_list")
    private final List<ResourceCheckModel> resourceCheckList = C89086z.INSTANCE;
    @AbstractC27891c(mo46611a = "rule_info_list")
    private final List<RuleInfo> ruleInfoList = new ArrayList();
    @AbstractC27891c(mo46611a = "sample_rate_config")
    private final SampleRateConfig sampleRateConfig = new SampleRateConfig(false, 0.0d, 0.0d, 0.0d, null, null, null, 127, null);
    @AbstractC27891c(mo46611a = "test_env_channels")
    private final List<String> testEnvChannels = C89070n.m154522b("snpqa_permission_test", "tools_autotest", "local_test");

    static {
        Covode.recordClassIndex(17743);
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getAlogDuration() {
        return this.alogDuration;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAlogEnabled() {
        return this.alogEnabled;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<AnchorInfoModel> getAnchorConfigList() {
        return this.anchorConfigList;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final ApiConfig getApiConfig() {
        return this.apiConfig;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getApiTimeOutDuration() {
        return this.apiTimeOutDuration;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getAppOpsIgnoreKnownApi() {
        return this.appOpsIgnoreKnownApi;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final long getBackgroundFreezeDuration() {
        return this.backgroundFreezeDuration;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final CrpConfig getCrpConfig() {
        return this.crpConfig;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<FrequencyGroupModel> getFrequencyGroupModels() {
        return this.frequencyGroupModels;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getInterestedAppOps() {
        return this.interestedAppOps;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<ResourceCheckModel> getResourceCheckList() {
        return this.resourceCheckList;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<RuleInfo> getRuleInfoList() {
        return this.ruleInfoList;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final SampleRateConfig getSampleRateConfig() {
        return this.sampleRateConfig;
    }

    @Override // com.bytedance.helios.api.config.AbstractSettingsModel
    public final List<String> getTestEnvChannels() {
        return this.testEnvChannels;
    }
}
