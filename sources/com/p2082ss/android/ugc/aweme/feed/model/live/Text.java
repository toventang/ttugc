package com.p2082ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.Text */
public final class Text implements Serializable {
    @AbstractC27891c(mo46611a = "default_pattern")
    private String defaultPattern;
    @AbstractC27891c(mo46611a = "key")
    private String key;

    static {
        Covode.recordClassIndex(58818);
    }

    public Text() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Text copy$default(Text text, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = text.key;
        }
        if ((i & 2) != 0) {
            str2 = text.defaultPattern;
        }
        return text.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.defaultPattern;
    }

    public final Text copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new Text(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Text)) {
            return false;
        }
        Text text = (Text) obj;
        return C89219l.m154714a(this.key, text.key) && C89219l.m154714a(this.defaultPattern, text.defaultPattern);
    }

    public final int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.defaultPattern;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "Text(key=" + this.key + ", defaultPattern=" + this.defaultPattern + ")";
    }

    public final String getDefaultPattern() {
        return this.defaultPattern;
    }

    public final String getKey() {
        return this.key;
    }

    public final void setDefaultPattern(String str) {
        C89219l.m154721d(str, "");
        this.defaultPattern = str;
    }

    public final void setKey(String str) {
        C89219l.m154721d(str, "");
        this.key = str;
    }

    public Text(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.key = str;
        this.defaultPattern = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Text(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
