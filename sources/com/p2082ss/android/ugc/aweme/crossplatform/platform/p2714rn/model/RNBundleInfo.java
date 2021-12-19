package com.p2082ss.android.ugc.aweme.crossplatform.platform.p2714rn.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.model.RNBundleInfo */
public class RNBundleInfo {
    @AbstractC27891c(mo46611a = "base_version")
    String baseVersion;
    @AbstractC27891c(mo46611a = "modules")
    List<String> modules;
    @AbstractC27891c(mo46611a = "version")
    String version;

    static {
        Covode.recordClassIndex(48501);
    }

    public String getBaseVersion() {
        return this.baseVersion;
    }

    public List<String> getModules() {
        return this.modules;
    }

    public String getVersion() {
        return this.version;
    }

    public String toString() {
        return "\nmodules: " + this.modules + "\nversion: " + this.version + "\nbase_version: " + this.baseVersion;
    }

    public void setBaseVersion(String str) {
        this.baseVersion = str;
    }

    public void setModules(List<String> list) {
        this.modules = list;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
