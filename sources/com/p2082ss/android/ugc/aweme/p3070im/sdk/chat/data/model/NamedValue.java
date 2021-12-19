package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.model.NamedValue */
public final class NamedValue {
    private final String name;
    private final Content value;

    static {
        Covode.recordClassIndex(63451);
    }

    public static /* synthetic */ NamedValue copy$default(NamedValue namedValue, String str, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            str = namedValue.name;
        }
        if ((i & 2) != 0) {
            content = namedValue.value;
        }
        return namedValue.copy(str, content);
    }

    public final String component1() {
        return this.name;
    }

    public final Content component2() {
        return this.value;
    }

    public final NamedValue copy(String str, Content content) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(content, "");
        return new NamedValue(str, content);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NamedValue)) {
            return false;
        }
        NamedValue namedValue = (NamedValue) obj;
        return C89219l.m154714a(this.name, namedValue.name) && C89219l.m154714a(this.value, namedValue.value);
    }

    public final int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Content content = this.value;
        if (content != null) {
            i = content.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "NamedValue(name=" + this.name + ", value=" + this.value + ")";
    }

    public final String getName() {
        return this.name;
    }

    public final Content getValue() {
        return this.value;
    }

    public NamedValue(String str, Content content) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(content, "");
        this.name = str;
        this.value = content;
    }
}
