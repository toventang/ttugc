package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import p4600h.p4601a.C89036ab;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.Condition */
public final class Condition implements Serializable {
    @AbstractC27891c(mo46611a = "action")
    private final Integer action;
    @AbstractC27891c(mo46611a = "paths")
    private final Set<String> paths;
    @AbstractC27891c(mo46611a = "subdomains")
    private final List<String> subdomains;

    static {
        Covode.recordClassIndex(46884);
    }

    public Condition() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.Condition */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Condition copy$default(Condition condition, Integer num, Set set, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = condition.action;
        }
        if ((i & 2) != 0) {
            set = condition.paths;
        }
        if ((i & 4) != 0) {
            list = condition.subdomains;
        }
        return condition.copy(num, set, list);
    }

    public final Integer component1() {
        return this.action;
    }

    public final Set<String> component2() {
        return this.paths;
    }

    public final List<String> component3() {
        return this.subdomains;
    }

    public final Condition copy(Integer num, Set<String> set, List<String> list) {
        return new Condition(num, set, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) obj;
        return C89219l.m154714a(this.action, condition.action) && C89219l.m154714a(this.paths, condition.paths) && C89219l.m154714a(this.subdomains, condition.subdomains);
    }

    public final int hashCode() {
        Integer num = this.action;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Set<String> set = this.paths;
        int hashCode2 = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        List<String> list = this.subdomains;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Condition(action=" + this.action + ", paths=" + this.paths + ", subdomains=" + this.subdomains + ")";
    }

    public final Integer getAction() {
        return this.action;
    }

    public final Set<String> getPaths() {
        return this.paths;
    }

    public final List<String> getSubdomains() {
        return this.subdomains;
    }

    public Condition(Integer num, Set<String> set, List<String> list) {
        this.action = num;
        this.paths = set;
        this.subdomains = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Condition(Integer num, Set set, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? 2 : num, (i & 2) != 0 ? C89036ab.INSTANCE : set, (i & 4) != 0 ? C89086z.INSTANCE : list);
    }
}
