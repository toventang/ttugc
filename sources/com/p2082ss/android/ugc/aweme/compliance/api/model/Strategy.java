package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.Strategy */
public final class Strategy implements Serializable {
    @AbstractC27891c(mo46611a = "action")
    private final Integer action;
    @AbstractC27891c(mo46611a = "conditions")
    private final List<Condition> conditions;
    @AbstractC27891c(mo46611a = "domains")
    private final List<String> domains;

    static {
        Covode.recordClassIndex(46895);
    }

    public Strategy() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.Strategy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Strategy copy$default(Strategy strategy, Integer num, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = strategy.action;
        }
        if ((i & 2) != 0) {
            list = strategy.conditions;
        }
        if ((i & 4) != 0) {
            list2 = strategy.domains;
        }
        return strategy.copy(num, list, list2);
    }

    public final Integer component1() {
        return this.action;
    }

    public final List<Condition> component2() {
        return this.conditions;
    }

    public final List<String> component3() {
        return this.domains;
    }

    public final Strategy copy(Integer num, List<Condition> list, List<String> list2) {
        return new Strategy(num, list, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Strategy)) {
            return false;
        }
        Strategy strategy = (Strategy) obj;
        return C89219l.m154714a(this.action, strategy.action) && C89219l.m154714a(this.conditions, strategy.conditions) && C89219l.m154714a(this.domains, strategy.domains);
    }

    public final int hashCode() {
        Integer num = this.action;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Condition> list = this.conditions;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.domains;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Strategy(action=" + this.action + ", conditions=" + this.conditions + ", domains=" + this.domains + ")";
    }

    public final Integer getAction() {
        return this.action;
    }

    public final List<Condition> getConditions() {
        return this.conditions;
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public Strategy(Integer num, List<Condition> list, List<String> list2) {
        this.action = num;
        this.conditions = list;
        this.domains = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Strategy(Integer num, List list, List list2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 2 : num, (i & 2) != 0 ? C89086z.INSTANCE : list, (i & 4) != 0 ? C89086z.INSTANCE : list2);
    }
}
