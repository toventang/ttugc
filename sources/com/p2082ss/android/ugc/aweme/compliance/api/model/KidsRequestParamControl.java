package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.KidsRequestParamControl */
public final class KidsRequestParamControl implements Serializable {
    @AbstractC27891c(mo46611a = "deny_keywords")
    private Set<String> denyKeywords;
    @AbstractC27891c(mo46611a = "enable")
    private final Boolean enable;

    static {
        Covode.recordClassIndex(46888);
    }

    public KidsRequestParamControl() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.KidsRequestParamControl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KidsRequestParamControl copy$default(KidsRequestParamControl kidsRequestParamControl, Boolean bool, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = kidsRequestParamControl.enable;
        }
        if ((i & 2) != 0) {
            set = kidsRequestParamControl.denyKeywords;
        }
        return kidsRequestParamControl.copy(bool, set);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final Set<String> component2() {
        return this.denyKeywords;
    }

    public final KidsRequestParamControl copy(Boolean bool, Set<String> set) {
        return new KidsRequestParamControl(bool, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsRequestParamControl)) {
            return false;
        }
        KidsRequestParamControl kidsRequestParamControl = (KidsRequestParamControl) obj;
        return C89219l.m154714a(this.enable, kidsRequestParamControl.enable) && C89219l.m154714a(this.denyKeywords, kidsRequestParamControl.denyKeywords);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int i = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Set<String> set = this.denyKeywords;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "KidsRequestParamControl(enable=" + this.enable + ", denyKeywords=" + this.denyKeywords + ")";
    }

    public final Set<String> getDenyKeywords() {
        return this.denyKeywords;
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final void setDenyKeywords(Set<String> set) {
        this.denyKeywords = set;
    }

    public KidsRequestParamControl(Boolean bool, Set<String> set) {
        this.enable = bool;
        this.denyKeywords = set;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ KidsRequestParamControl(Boolean bool, Set set, int i, C89214g gVar) {
        this((i & 1) != 0 ? true : bool, (i & 2) != 0 ? C89036ab.INSTANCE : set);
    }
}
