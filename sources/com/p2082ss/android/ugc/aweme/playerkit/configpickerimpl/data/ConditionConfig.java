package com.p2082ss.android.ugc.aweme.playerkit.configpickerimpl.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.playerkit.configpickerimpl.data.ConditionConfig */
public class ConditionConfig {
    @AbstractC27891c(mo46611a = "client_filter_requirement")

    /* renamed from: a */
    public Map<String, List<String>> f143456a;
    @AbstractC27891c(mo46611a = "server_filter_requirement")

    /* renamed from: b */
    public Map<String, List<String>> f143457b;
    @AbstractC27891c(mo46611a = "config")

    /* renamed from: c */
    public AbstractC28019l f143458c;

    static {
        Covode.recordClassIndex(73966);
    }

    /* renamed from: a */
    public final int mo101343a() {
        int size;
        Map<String, List<String>> map = this.f143456a;
        int i = 0;
        if (map == null) {
            size = 0;
        } else {
            size = map.size();
        }
        Map<String, List<String>> map2 = this.f143457b;
        if (map2 != null) {
            i = map2.size();
        }
        return size + i;
    }
}
