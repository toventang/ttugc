package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ApiInfo {
    @AbstractC27891c(mo46611a = "api_ids")
    private final List<Integer> apiIds;
    @AbstractC27891c(mo46611a = "block_configs")
    private final List<ControlConfig> blockConfigs;
    @AbstractC27891c(mo46611a = "frequency_config")
    private final FrequencyConfig frequencyConfig;
    @AbstractC27891c(mo46611a = "monitor_configs")
    private final List<ControlConfig> monitorConfigs;
    @AbstractC27891c(mo46611a = "return_config")
    private final ReturnConfig returnConfig;

    static {
        Covode.recordClassIndex(17561);
    }

    public ApiInfo() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ApiInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiInfo copy$default(ApiInfo apiInfo, List list, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = apiInfo.apiIds;
        }
        if ((i & 2) != 0) {
            frequencyConfig2 = apiInfo.frequencyConfig;
        }
        if ((i & 4) != 0) {
            returnConfig2 = apiInfo.returnConfig;
        }
        if ((i & 8) != 0) {
            list2 = apiInfo.monitorConfigs;
        }
        if ((i & 16) != 0) {
            list3 = apiInfo.blockConfigs;
        }
        return apiInfo.copy(list, frequencyConfig2, returnConfig2, list2, list3);
    }

    public final List<Integer> component1() {
        return this.apiIds;
    }

    public final FrequencyConfig component2() {
        return this.frequencyConfig;
    }

    public final ReturnConfig component3() {
        return this.returnConfig;
    }

    public final List<ControlConfig> component4() {
        return this.monitorConfigs;
    }

    public final List<ControlConfig> component5() {
        return this.blockConfigs;
    }

    public final ApiInfo copy(List<Integer> list, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List<ControlConfig> list2, List<ControlConfig> list3) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        return new ApiInfo(list, frequencyConfig2, returnConfig2, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiInfo)) {
            return false;
        }
        ApiInfo apiInfo = (ApiInfo) obj;
        return C89219l.m154714a(this.apiIds, apiInfo.apiIds) && C89219l.m154714a(this.frequencyConfig, apiInfo.frequencyConfig) && C89219l.m154714a(this.returnConfig, apiInfo.returnConfig) && C89219l.m154714a(this.monitorConfigs, apiInfo.monitorConfigs) && C89219l.m154714a(this.blockConfigs, apiInfo.blockConfigs);
    }

    public final int hashCode() {
        List<Integer> list = this.apiIds;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        FrequencyConfig frequencyConfig2 = this.frequencyConfig;
        int hashCode2 = (hashCode + (frequencyConfig2 != null ? frequencyConfig2.hashCode() : 0)) * 31;
        ReturnConfig returnConfig2 = this.returnConfig;
        int hashCode3 = (hashCode2 + (returnConfig2 != null ? returnConfig2.hashCode() : 0)) * 31;
        List<ControlConfig> list2 = this.monitorConfigs;
        int hashCode4 = (hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<ControlConfig> list3 = this.blockConfigs;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "ApiInfo(apiIds=" + this.apiIds + ", frequencyConfig=" + this.frequencyConfig + ", returnConfig=" + this.returnConfig + ", monitorConfigs=" + this.monitorConfigs + ", blockConfigs=" + this.blockConfigs + ")";
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public final List<ControlConfig> getBlockConfigs() {
        return this.blockConfigs;
    }

    public final FrequencyConfig getFrequencyConfig() {
        return this.frequencyConfig;
    }

    public final List<ControlConfig> getMonitorConfigs() {
        return this.monitorConfigs;
    }

    public final ReturnConfig getReturnConfig() {
        return this.returnConfig;
    }

    public ApiInfo(List<Integer> list, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List<ControlConfig> list2, List<ControlConfig> list3) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(list2, "");
        C89219l.m154719c(list3, "");
        this.apiIds = list;
        this.frequencyConfig = frequencyConfig2;
        this.returnConfig = returnConfig2;
        this.monitorConfigs = list2;
        this.blockConfigs = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiInfo(List list, FrequencyConfig frequencyConfig2, ReturnConfig returnConfig2, List list2, List list3, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list, (i & 2) != 0 ? null : frequencyConfig2, (i & 4) == 0 ? returnConfig2 : null, (i & 8) != 0 ? C89086z.INSTANCE : list2, (i & 16) != 0 ? C89086z.INSTANCE : list3);
    }
}
