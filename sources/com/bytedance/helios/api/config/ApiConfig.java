package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ApiConfig {
    @AbstractC27891c(mo46611a = "api_info_list")
    private final List<ApiInfo> apiInfoList;
    @AbstractC27891c(mo46611a = "default_api_info")
    private final ApiInfo defaultApiInfo;

    static {
        Covode.recordClassIndex(17560);
    }

    public ApiConfig() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.ApiConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiConfig copy$default(ApiConfig apiConfig, ApiInfo apiInfo, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            apiInfo = apiConfig.defaultApiInfo;
        }
        if ((i & 2) != 0) {
            list = apiConfig.apiInfoList;
        }
        return apiConfig.copy(apiInfo, list);
    }

    public final ApiInfo component1() {
        return this.defaultApiInfo;
    }

    public final List<ApiInfo> component2() {
        return this.apiInfoList;
    }

    public final ApiConfig copy(ApiInfo apiInfo, List<ApiInfo> list) {
        C89219l.m154719c(apiInfo, "");
        C89219l.m154719c(list, "");
        return new ApiConfig(apiInfo, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiConfig)) {
            return false;
        }
        ApiConfig apiConfig = (ApiConfig) obj;
        return C89219l.m154714a(this.defaultApiInfo, apiConfig.defaultApiInfo) && C89219l.m154714a(this.apiInfoList, apiConfig.apiInfoList);
    }

    public final int hashCode() {
        ApiInfo apiInfo = this.defaultApiInfo;
        int i = 0;
        int hashCode = (apiInfo != null ? apiInfo.hashCode() : 0) * 31;
        List<ApiInfo> list = this.apiInfoList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ApiConfig(defaultApiInfo=" + this.defaultApiInfo + ", apiInfoList=" + this.apiInfoList + ")";
    }

    public final List<ApiInfo> getApiInfoList() {
        return this.apiInfoList;
    }

    public final ApiInfo getDefaultApiInfo() {
        return this.defaultApiInfo;
    }

    public final List<ApiInfo> getApiInfoList(int i) {
        List<ApiInfo> list = this.apiInfoList;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t.getApiIds().contains(Integer.valueOf(i))) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return C89070n.m154516a(this.defaultApiInfo);
        }
        return arrayList2;
    }

    public ApiConfig(ApiInfo apiInfo, List<ApiInfo> list) {
        C89219l.m154719c(apiInfo, "");
        C89219l.m154719c(list, "");
        this.defaultApiInfo = apiInfo;
        this.apiInfoList = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiConfig(ApiInfo apiInfo, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? new ApiInfo(null, null, null, null, null, 31, null) : apiInfo, (i & 2) != 0 ? new ArrayList() : list);
    }
}
