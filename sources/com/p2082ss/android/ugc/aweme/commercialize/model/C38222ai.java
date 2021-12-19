package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1777x.p1779b.C23682a;
import com.bytedance.p1777x.p1779b.C23683b;
import com.bytedance.p1777x.p1779b.C23687f;
import com.google.gson.p2018a.AbstractC27889a;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ai */
public class C38222ai implements Serializable {
    @AbstractC27891c(mo46611a = "ad_choice")
    public C38218af adChoiceIcon;
    @AbstractC27891c(mo46611a = "adVerifications")
    public List<C23682a> adVerificationList;
    @AbstractC27889a(mo46607a = false)
    @AbstractC27891c(mo46611a = "creative_type")
    public int creative_type = 4;
    @AbstractC27889a(mo46607a = false)
    @AbstractC27891c(mo46611a = "impression_type")
    public int impression_type = 4;
    @AbstractC27891c(mo46611a = "local_cache_loaded")
    public boolean loaded;
    public transient boolean loading;
    @AbstractC27891c(mo46611a = "providerType")
    public int providerType = 2;
    @AbstractC27891c(mo46611a = "local_cache_vast")
    public C23687f vast;
    @AbstractC27889a(mo46607a = false)
    @AbstractC27891c(mo46611a = "vastContent")
    public String vastContent;
    @AbstractC27889a(mo46607a = false)
    @AbstractC27891c(mo46611a = "vastUrl")
    public String vastUrl;
    @AbstractC27889a(mo46607a = false)
    @AbstractC27891c(mo46611a = "vastWrapperCount")
    public int vastWrapperCount = 1;

    static {
        Covode.recordClassIndex(45706);
    }

    public List<C23683b> getCreativeList() {
        C23687f fVar = this.vast;
        if (fVar == null) {
            return null;
        }
        return fVar.creativeList;
    }

    public Set<String> getImpressions() {
        C23687f fVar = this.vast;
        if (fVar == null) {
            return null;
        }
        return fVar.impressionSet;
    }
}
