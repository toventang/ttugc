package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class SampleRateConfig {
    @AbstractC27891c(mo46611a = "api_high_priority_configs")
    private final List<ApiSampleRateConfig> apiHighPriorityConfigs;
    @AbstractC27891c(mo46611a = "app_ops_config")
    private final double appOpsConfig;
    @AbstractC27891c(mo46611a = "auto_start_config")
    private final double autoStartConfig;
    @AbstractC27891c(mo46611a = "default_low_priority_config")
    private final DefaultSampleRateConfig defaultLowPriorityConfig;
    @AbstractC27891c(mo46611a = "enable_monitor")
    private final boolean enableMonitor;
    @AbstractC27891c(mo46611a = "exception_config")
    private final double exceptionConfig;
    @AbstractC27891c(mo46611a = "resource_medium_priority_configs")
    private final List<ResourceSampleRateConfig> resourceMediumPriorityConfigs;

    static {
        Covode.recordClassIndex(17574);
    }

    public SampleRateConfig() {
        this(false, 0.0d, 0.0d, 0.0d, null, null, null, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.SampleRateConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SampleRateConfig copy$default(SampleRateConfig sampleRateConfig, boolean z, double d, double d2, double d3, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = sampleRateConfig.enableMonitor;
        }
        if ((i & 2) != 0) {
            d = sampleRateConfig.appOpsConfig;
        }
        if ((i & 4) != 0) {
            d2 = sampleRateConfig.autoStartConfig;
        }
        if ((i & 8) != 0) {
            d3 = sampleRateConfig.exceptionConfig;
        }
        if ((i & 16) != 0) {
            defaultSampleRateConfig = sampleRateConfig.defaultLowPriorityConfig;
        }
        if ((i & 32) != 0) {
            list = sampleRateConfig.resourceMediumPriorityConfigs;
        }
        if ((i & 64) != 0) {
            list2 = sampleRateConfig.apiHighPriorityConfigs;
        }
        return sampleRateConfig.copy(z, d, d2, d3, defaultSampleRateConfig, list, list2);
    }

    public final boolean component1() {
        return this.enableMonitor;
    }

    public final double component2() {
        return this.appOpsConfig;
    }

    public final double component3() {
        return this.autoStartConfig;
    }

    public final double component4() {
        return this.exceptionConfig;
    }

    public final DefaultSampleRateConfig component5() {
        return this.defaultLowPriorityConfig;
    }

    public final List<ResourceSampleRateConfig> component6() {
        return this.resourceMediumPriorityConfigs;
    }

    public final List<ApiSampleRateConfig> component7() {
        return this.apiHighPriorityConfigs;
    }

    public final SampleRateConfig copy(boolean z, double d, double d2, double d3, DefaultSampleRateConfig defaultSampleRateConfig, List<ResourceSampleRateConfig> list, List<ApiSampleRateConfig> list2) {
        C89219l.m154719c(defaultSampleRateConfig, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        return new SampleRateConfig(z, d, d2, d3, defaultSampleRateConfig, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SampleRateConfig)) {
            return false;
        }
        SampleRateConfig sampleRateConfig = (SampleRateConfig) obj;
        return this.enableMonitor == sampleRateConfig.enableMonitor && Double.compare(this.appOpsConfig, sampleRateConfig.appOpsConfig) == 0 && Double.compare(this.autoStartConfig, sampleRateConfig.autoStartConfig) == 0 && Double.compare(this.exceptionConfig, sampleRateConfig.exceptionConfig) == 0 && C89219l.m154714a(this.defaultLowPriorityConfig, sampleRateConfig.defaultLowPriorityConfig) && C89219l.m154714a(this.resourceMediumPriorityConfigs, sampleRateConfig.resourceMediumPriorityConfigs) && C89219l.m154714a(this.apiHighPriorityConfigs, sampleRateConfig.apiHighPriorityConfigs);
    }

    public final int hashCode() {
        boolean z = this.enableMonitor;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.appOpsConfig);
        long doubleToLongBits2 = Double.doubleToLongBits(this.autoStartConfig);
        long doubleToLongBits3 = Double.doubleToLongBits(this.exceptionConfig);
        int i4 = ((((((i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31;
        DefaultSampleRateConfig defaultSampleRateConfig = this.defaultLowPriorityConfig;
        int i5 = 0;
        int hashCode = (i4 + (defaultSampleRateConfig != null ? defaultSampleRateConfig.hashCode() : 0)) * 31;
        List<ResourceSampleRateConfig> list = this.resourceMediumPriorityConfigs;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<ApiSampleRateConfig> list2 = this.apiHighPriorityConfigs;
        if (list2 != null) {
            i5 = list2.hashCode();
        }
        return hashCode2 + i5;
    }

    public final String toString() {
        return "SampleRateConfig(enableMonitor=" + this.enableMonitor + ", appOpsConfig=" + this.appOpsConfig + ", autoStartConfig=" + this.autoStartConfig + ", exceptionConfig=" + this.exceptionConfig + ", defaultLowPriorityConfig=" + this.defaultLowPriorityConfig + ", resourceMediumPriorityConfigs=" + this.resourceMediumPriorityConfigs + ", apiHighPriorityConfigs=" + this.apiHighPriorityConfigs + ")";
    }

    public final List<ApiSampleRateConfig> getApiHighPriorityConfigs() {
        return this.apiHighPriorityConfigs;
    }

    public final double getAppOpsConfig() {
        return this.appOpsConfig;
    }

    public final double getAutoStartConfig() {
        return this.autoStartConfig;
    }

    public final DefaultSampleRateConfig getDefaultLowPriorityConfig() {
        return this.defaultLowPriorityConfig;
    }

    public final boolean getEnableMonitor() {
        return this.enableMonitor;
    }

    public final double getExceptionConfig() {
        return this.exceptionConfig;
    }

    public final List<ResourceSampleRateConfig> getResourceMediumPriorityConfigs() {
        return this.resourceMediumPriorityConfigs;
    }

    public SampleRateConfig(boolean z, double d, double d2, double d3, DefaultSampleRateConfig defaultSampleRateConfig, List<ResourceSampleRateConfig> list, List<ApiSampleRateConfig> list2) {
        C89219l.m154719c(defaultSampleRateConfig, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        this.enableMonitor = z;
        this.appOpsConfig = d;
        this.autoStartConfig = d2;
        this.exceptionConfig = d3;
        this.defaultLowPriorityConfig = defaultSampleRateConfig;
        this.resourceMediumPriorityConfigs = list;
        this.apiHighPriorityConfigs = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SampleRateConfig(boolean z, double d, double d2, double d3, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0E-5d : d, (i & 4) != 0 ? 0.01d : d2, (i & 8) != 0 ? 0.1d : d3, (i & 16) != 0 ? new DefaultSampleRateConfig(0.0d, 0.0d, 0.0d, 7, null) : defaultSampleRateConfig, (i & 32) != 0 ? C89086z.INSTANCE : list, (i & 64) != 0 ? C89086z.INSTANCE : list2);
    }
}
