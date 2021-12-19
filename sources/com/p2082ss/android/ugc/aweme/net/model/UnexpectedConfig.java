package com.p2082ss.android.ugc.aweme.net.model;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;

/* renamed from: com.ss.android.ugc.aweme.net.model.UnexpectedConfig */
public final class UnexpectedConfig {

    /* renamed from: id */
    private final String f139457id;
    private final String pattern;
    private C89350l regex;
    private final int scope;
    private List<String> targets;
    private final int type;

    static {
        Covode.recordClassIndex(72073);
    }

    /* renamed from: com_ss_android_ugc_aweme_net_model_UnexpectedConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m111188xc350a21a(int i) {
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.net.model.UnexpectedConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnexpectedConfig copy$default(UnexpectedConfig unexpectedConfig, String str, int i, int i2, String str2, C89350l lVar, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = unexpectedConfig.pattern;
        }
        if ((i3 & 2) != 0) {
            i = unexpectedConfig.scope;
        }
        if ((i3 & 4) != 0) {
            i2 = unexpectedConfig.type;
        }
        if ((i3 & 8) != 0) {
            str2 = unexpectedConfig.f139457id;
        }
        if ((i3 & 16) != 0) {
            lVar = unexpectedConfig.regex;
        }
        if ((i3 & 32) != 0) {
            list = unexpectedConfig.targets;
        }
        return unexpectedConfig.copy(str, i, i2, str2, lVar, list);
    }

    public final String component1() {
        return this.pattern;
    }

    public final int component2() {
        return this.scope;
    }

    public final int component3() {
        return this.type;
    }

    public final String component4() {
        return this.f139457id;
    }

    public final C89350l component5() {
        return this.regex;
    }

    public final List<String> component6() {
        return this.targets;
    }

    public final UnexpectedConfig copy(String str, int i, int i2, String str2, C89350l lVar, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new UnexpectedConfig(str, i, i2, str2, lVar, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnexpectedConfig)) {
            return false;
        }
        UnexpectedConfig unexpectedConfig = (UnexpectedConfig) obj;
        return C89219l.m154714a(this.pattern, unexpectedConfig.pattern) && this.scope == unexpectedConfig.scope && this.type == unexpectedConfig.type && C89219l.m154714a(this.f139457id, unexpectedConfig.f139457id) && C89219l.m154714a(this.regex, unexpectedConfig.regex) && C89219l.m154714a(this.targets, unexpectedConfig.targets);
    }

    public final int hashCode() {
        String str = this.pattern;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + m111188xc350a21a(this.scope)) * 31) + m111188xc350a21a(this.type)) * 31;
        String str2 = this.f139457id;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C89350l lVar = this.regex;
        int hashCode3 = (hashCode2 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        List<String> list = this.targets;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "UnexpectedConfig(pattern=" + this.pattern + ", scope=" + this.scope + ", type=" + this.type + ", id=" + this.f139457id + ", regex=" + this.regex + ", targets=" + this.targets + ")";
    }

    public final String getId() {
        return this.f139457id;
    }

    public final String getPattern() {
        return this.pattern;
    }

    public final C89350l getRegex() {
        return this.regex;
    }

    public final int getScope() {
        return this.scope;
    }

    public final List<String> getTargets() {
        return this.targets;
    }

    public final int getType() {
        return this.type;
    }

    public final void setRegex(C89350l lVar) {
        this.regex = lVar;
    }

    public final void setTargets(List<String> list) {
        this.targets = list;
    }

    public UnexpectedConfig(String str, int i, int i2, String str2, C89350l lVar, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.pattern = str;
        this.scope = i;
        this.type = i2;
        this.f139457id = str2;
        this.regex = lVar;
        this.targets = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UnexpectedConfig(String str, int i, int i2, String str2, C89350l lVar, List list, int i3, C89214g gVar) {
        this(str, i, i2, str2, (i3 & 16) != 0 ? null : lVar, (i3 & 32) == 0 ? list : null);
    }
}
