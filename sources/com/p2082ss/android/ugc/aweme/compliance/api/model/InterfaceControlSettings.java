package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.compliance.api.p2637a.EnumC39225b;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings */
public final class InterfaceControlSettings implements Serializable {
    @AbstractC27891c(mo46611a = "rules")
    private final List<InterfaceControlRule> rules;
    @AbstractC27891c(mo46611a = "use_new_control")
    private final Boolean useNewControl;
    @AbstractC27891c(mo46611a = "user_type")
    private final String userType;
    @AbstractC27891c(mo46611a = "version")
    private final String version;

    static {
        Covode.recordClassIndex(46887);
    }

    public InterfaceControlSettings() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceControlSettings copy$default(InterfaceControlSettings interfaceControlSettings, List list, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = interfaceControlSettings.rules;
        }
        if ((i & 2) != 0) {
            str = interfaceControlSettings.userType;
        }
        if ((i & 4) != 0) {
            str2 = interfaceControlSettings.version;
        }
        if ((i & 8) != 0) {
            bool = interfaceControlSettings.useNewControl;
        }
        return interfaceControlSettings.copy(list, str, str2, bool);
    }

    public final List<InterfaceControlRule> component1() {
        return this.rules;
    }

    public final String component2() {
        return this.userType;
    }

    public final String component3() {
        return this.version;
    }

    public final Boolean component4() {
        return this.useNewControl;
    }

    public final InterfaceControlSettings copy(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        return new InterfaceControlSettings(list, str, str2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceControlSettings)) {
            return false;
        }
        InterfaceControlSettings interfaceControlSettings = (InterfaceControlSettings) obj;
        return C89219l.m154714a(this.rules, interfaceControlSettings.rules) && C89219l.m154714a(this.userType, interfaceControlSettings.userType) && C89219l.m154714a(this.version, interfaceControlSettings.version) && C89219l.m154714a(this.useNewControl, interfaceControlSettings.useNewControl);
    }

    public final int hashCode() {
        List<InterfaceControlRule> list = this.rules;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.userType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.useNewControl;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "InterfaceControlSettings(rules=" + this.rules + ", userType=" + this.userType + ", version=" + this.version + ", useNewControl=" + this.useNewControl + ")";
    }

    public final List<InterfaceControlRule> getRules() {
        return this.rules;
    }

    public final Boolean getUseNewControl() {
        return this.useNewControl;
    }

    /* renamed from: getUserType  reason: collision with other method in class */
    public final String m157064getUserType() {
        return this.userType;
    }

    public final String getVersion() {
        return this.version;
    }

    public final EnumC39225b getUserType() {
        String str = this.userType;
        if (str == null) {
            str = "";
        }
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) EnumC39225b.NOT_LOGIN.getUserType())) {
            return EnumC39225b.NOT_LOGIN;
        }
        if (C89219l.m154714a((Object) str, (Object) EnumC39225b.NORMAL.getUserType())) {
            return EnumC39225b.NORMAL;
        }
        if (C89219l.m154714a((Object) str, (Object) EnumC39225b.CHILD_US.getUserType())) {
            return EnumC39225b.CHILD_US;
        }
        if (C89219l.m154714a((Object) str, (Object) EnumC39225b.CHILD_OTHERS.getUserType())) {
            return EnumC39225b.CHILD_US;
        }
        return EnumC39225b.UNKNOWN;
    }

    public InterfaceControlSettings(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        this.rules = list;
        this.userType = str;
        this.version = str2;
        this.useNewControl = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InterfaceControlSettings(List list, String str, String str2, Boolean bool, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }
}
