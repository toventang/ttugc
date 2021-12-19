package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.RuleConfig */
public final class RuleConfig implements Serializable {
    @AbstractC27891c(mo46611a = "op")

    /* renamed from: op */
    private final String f92680op;
    private final Map<String, String> replaceMap;
    @AbstractC27891c(mo46611a = StringSet.type)
    private final String type;
    @AbstractC27891c(mo46611a = "value")
    private final Set<String> value;

    static {
        Covode.recordClassIndex(46893);
    }

    public RuleConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.RuleConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleConfig copy$default(RuleConfig ruleConfig, String str, String str2, Set set, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ruleConfig.f92680op;
        }
        if ((i & 2) != 0) {
            str2 = ruleConfig.type;
        }
        if ((i & 4) != 0) {
            set = ruleConfig.value;
        }
        if ((i & 8) != 0) {
            map = ruleConfig.replaceMap;
        }
        return ruleConfig.copy(str, str2, set, map);
    }

    public final String component1() {
        return this.f92680op;
    }

    public final String component2() {
        return this.type;
    }

    public final Set<String> component3() {
        return this.value;
    }

    public final Map<String, String> component4() {
        return this.replaceMap;
    }

    public final RuleConfig copy(String str, String str2, Set<String> set, Map<String, String> map) {
        C89219l.m154721d(map, "");
        return new RuleConfig(str, str2, set, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleConfig)) {
            return false;
        }
        RuleConfig ruleConfig = (RuleConfig) obj;
        return C89219l.m154714a(this.f92680op, ruleConfig.f92680op) && C89219l.m154714a(this.type, ruleConfig.type) && C89219l.m154714a(this.value, ruleConfig.value) && C89219l.m154714a(this.replaceMap, ruleConfig.replaceMap);
    }

    public final int hashCode() {
        String str = this.f92680op;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set<String> set = this.value;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map<String, String> map = this.replaceMap;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "RuleConfig(op=" + this.f92680op + ", type=" + this.type + ", value=" + this.value + ", replaceMap=" + this.replaceMap + ")";
    }

    public final String getOp() {
        return this.f92680op;
    }

    public final Map<String, String> getReplaceMap() {
        return this.replaceMap;
    }

    public final String getType() {
        return this.type;
    }

    public final Set<String> getValue() {
        return this.value;
    }

    public RuleConfig(String str, String str2, Set<String> set, Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f92680op = str;
        this.type = str2;
        this.value = set;
        this.replaceMap = map;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleConfig(String str, String str2, Set set, Map map, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : set, (i & 8) != 0 ? new LinkedHashMap() : map);
    }
}
