package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.Template */
public final class Template {
    private final Extra extra;
    private final String key;
    private final String name;

    static {
        Covode.recordClassIndex(63484);
    }

    public static /* synthetic */ Template copy$default(Template template, String str, String str2, Extra extra2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = template.key;
        }
        if ((i & 2) != 0) {
            str2 = template.name;
        }
        if ((i & 4) != 0) {
            extra2 = template.extra;
        }
        return template.copy(str, str2, extra2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.name;
    }

    public final Extra component3() {
        return this.extra;
    }

    public final Template copy(String str, String str2, Extra extra2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(extra2, "");
        return new Template(str, str2, extra2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Template)) {
            return false;
        }
        Template template = (Template) obj;
        return C89219l.m154714a(this.key, template.key) && C89219l.m154714a(this.name, template.name) && C89219l.m154714a(this.extra, template.extra);
    }

    public final int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Extra extra2 = this.extra;
        if (extra2 != null) {
            i = extra2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Template(key=" + this.key + ", name=" + this.name + ", extra=" + this.extra + ")";
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public Template(String str, String str2, Extra extra2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(extra2, "");
        this.key = str;
        this.name = str2;
        this.extra = extra2;
    }
}
