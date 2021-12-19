package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig */
public class GeckoConfig {
    @AbstractC27891c(mo46611a = "dyc_channel")
    private List<String> dycChannel;
    @AbstractC27891c(mo46611a = "initial_channel")
    private List<String> initialChannel;
    @AbstractC27891c(mo46611a = "initial_high_priority_channel")
    private List<String> initialHighPriorityChannel;
    @AbstractC27891c(mo46611a = "use_new_package_now")
    private boolean useNewPackageNow;

    static {
        Covode.recordClassIndex(62357);
    }

    public List<String> getDynamicChannel() {
        return this.dycChannel;
    }

    public List<String> getInitialChannel() {
        return this.initialChannel;
    }

    public List<String> getInitialHighPriorityChannel() {
        return this.initialHighPriorityChannel;
    }

    public boolean getUseNewPackageNow() {
        return this.useNewPackageNow;
    }
}
