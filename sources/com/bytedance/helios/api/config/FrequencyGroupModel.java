package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class FrequencyGroupModel {
    @AbstractC27891c(mo46611a = "api_ids")
    private final List<Integer> apiIds;
    @AbstractC27891c(mo46611a = "frequency_config")
    private final FrequencyConfig frequencyConfig;

    static {
        Covode.recordClassIndex(17567);
    }

    public FrequencyGroupModel() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.FrequencyGroupModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrequencyGroupModel copy$default(FrequencyGroupModel frequencyGroupModel, List list, FrequencyConfig frequencyConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = frequencyGroupModel.apiIds;
        }
        if ((i & 2) != 0) {
            frequencyConfig2 = frequencyGroupModel.frequencyConfig;
        }
        return frequencyGroupModel.copy(list, frequencyConfig2);
    }

    public final List<Integer> component1() {
        return this.apiIds;
    }

    public final FrequencyConfig component2() {
        return this.frequencyConfig;
    }

    public final FrequencyGroupModel copy(List<Integer> list, FrequencyConfig frequencyConfig2) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(frequencyConfig2, "");
        return new FrequencyGroupModel(list, frequencyConfig2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FrequencyGroupModel)) {
            return false;
        }
        FrequencyGroupModel frequencyGroupModel = (FrequencyGroupModel) obj;
        return C89219l.m154714a(this.apiIds, frequencyGroupModel.apiIds) && C89219l.m154714a(this.frequencyConfig, frequencyGroupModel.frequencyConfig);
    }

    public final int hashCode() {
        List<Integer> list = this.apiIds;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        FrequencyConfig frequencyConfig2 = this.frequencyConfig;
        if (frequencyConfig2 != null) {
            i = frequencyConfig2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FrequencyGroupModel(apiIds=" + this.apiIds + ", frequencyConfig=" + this.frequencyConfig + ")";
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public final FrequencyConfig getFrequencyConfig() {
        return this.frequencyConfig;
    }

    public FrequencyGroupModel(List<Integer> list, FrequencyConfig frequencyConfig2) {
        C89219l.m154719c(list, "");
        C89219l.m154719c(frequencyConfig2, "");
        this.apiIds = list;
        this.frequencyConfig = frequencyConfig2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrequencyGroupModel(List list, FrequencyConfig frequencyConfig2, int i, C89214g gVar) {
        this((i & 1) != 0 ? C89086z.INSTANCE : list, (i & 2) != 0 ? new FrequencyConfig(0, 0, 0, null, 15, null) : frequencyConfig2);
    }
}
