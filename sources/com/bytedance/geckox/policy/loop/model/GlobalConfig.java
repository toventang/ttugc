package com.bytedance.geckox.policy.loop.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

public class GlobalConfig {
    @AbstractC27891c(mo46611a = "check_update")
    private Map<String, LoopInterval> checkUpdate;

    static {
        Covode.recordClassIndex(17137);
    }

    public GlobalConfig() {
    }

    public Map<String, LoopInterval> getCheckUpdate() {
        return this.checkUpdate;
    }

    public GlobalConfig(Map<String, LoopInterval> map) {
        this.checkUpdate = map;
    }
}
