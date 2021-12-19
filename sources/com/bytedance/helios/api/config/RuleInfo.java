package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class RuleInfo {
    public static final C15329a Companion = new C15329a((byte) 0);
    @AbstractC27891c(mo46611a = "api_ids")
    private final List<Integer> apiIds;
    @AbstractC27891c(mo46611a = StringSet.name)
    private final String name;
    @AbstractC27891c(mo46611a = "register_type")
    private final String registerType;

    static {
        Covode.recordClassIndex(17572);
    }

    public RuleInfo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.helios.api.config.RuleInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RuleInfo copy$default(RuleInfo ruleInfo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ruleInfo.name;
        }
        if ((i & 2) != 0) {
            str2 = ruleInfo.registerType;
        }
        if ((i & 4) != 0) {
            list = ruleInfo.apiIds;
        }
        return ruleInfo.copy(str, str2, list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.registerType;
    }

    public final List<Integer> component3() {
        return this.apiIds;
    }

    public final RuleInfo copy(String str, String str2, List<Integer> list) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(list, "");
        return new RuleInfo(str, str2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RuleInfo)) {
            return false;
        }
        RuleInfo ruleInfo = (RuleInfo) obj;
        return C89219l.m154714a(this.name, ruleInfo.name) && C89219l.m154714a(this.registerType, ruleInfo.registerType) && C89219l.m154714a(this.apiIds, ruleInfo.apiIds);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.registerType;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Integer> list = this.apiIds;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "RuleInfo(name=" + this.name + ", registerType=" + this.registerType + ", apiIds=" + this.apiIds + ")";
    }

    /* renamed from: com.bytedance.helios.api.config.RuleInfo$a */
    public static final class C15329a {
        static {
            Covode.recordClassIndex(17573);
        }

        private C15329a() {
        }

        public /* synthetic */ C15329a(byte b) {
            this();
        }
    }

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegisterType() {
        return this.registerType;
    }

    public RuleInfo(String str, String str2, List<Integer> list) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(list, "");
        this.name = str;
        this.registerType = str2;
        this.apiIds = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RuleInfo(String str, String str2, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "manual" : str2, (i & 4) != 0 ? C89086z.INSTANCE : list);
    }
}
