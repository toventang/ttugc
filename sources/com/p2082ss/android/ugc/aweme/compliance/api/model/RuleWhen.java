package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.RuleWhen */
public final class RuleWhen implements Serializable {
    @AbstractC27891c(mo46611a = "domain")
    private final RuleConfig domain;
    @AbstractC27891c(mo46611a = "path")
    private final RuleConfig path;

    static {
        Covode.recordClassIndex(46894);
    }

    public RuleWhen() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RuleWhen copy$default(RuleWhen ruleWhen, RuleConfig ruleConfig, RuleConfig ruleConfig2, int i, Object obj) {
        if ((i & 1) != 0) {
            ruleConfig = ruleWhen.domain;
        }
        if ((i & 2) != 0) {
            ruleConfig2 = ruleWhen.path;
        }
        return ruleWhen.copy(ruleConfig, ruleConfig2);
    }

    public final RuleConfig component1() {
        return this.domain;
    }

    public final RuleConfig component2() {
        return this.path;
    }

    public final RuleWhen copy(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        return new RuleWhen(ruleConfig, ruleConfig2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleWhen)) {
            return false;
        }
        RuleWhen ruleWhen = (RuleWhen) obj;
        return C89219l.m154714a(this.domain, ruleWhen.domain) && C89219l.m154714a(this.path, ruleWhen.path);
    }

    public final int hashCode() {
        RuleConfig ruleConfig = this.domain;
        int i = 0;
        int hashCode = (ruleConfig != null ? ruleConfig.hashCode() : 0) * 31;
        RuleConfig ruleConfig2 = this.path;
        if (ruleConfig2 != null) {
            i = ruleConfig2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "RuleWhen(domain=" + this.domain + ", path=" + this.path + ")";
    }

    public final RuleConfig getDomain() {
        return this.domain;
    }

    public final RuleConfig getPath() {
        return this.path;
    }

    public RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2) {
        this.domain = ruleConfig;
        this.path = ruleConfig2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleWhen(RuleConfig ruleConfig, RuleConfig ruleConfig2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : ruleConfig, (i & 2) != 0 ? null : ruleConfig2);
    }
}
