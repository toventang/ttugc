package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.policy.loop.model.GlobalConfig;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import java.util.Map;

public class CombineComponentModel {
    @AbstractC27891c(mo46611a = "global_config")
    private GlobalConfig globalConfig = new GlobalConfig();
    @AbstractC27891c(mo46611a = "packages")
    private List<UpdatePackage> packages;
    @AbstractC27891c(mo46611a = "universal_strategies")
    private Map<String, CleanPolicyModel> universalStrategies;

    static {
        Covode.recordClassIndex(17101);
    }

    public GlobalConfig getGlobalConfig() {
        return this.globalConfig;
    }

    public List<UpdatePackage> getPackages() {
        return this.packages;
    }

    public Map<String, CleanPolicyModel> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
