package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeActivityContent */
public final class AwemeActivityContent implements Serializable {
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    public String color;
    @AbstractC27891c(mo46611a = "size")
    public String size;
    @AbstractC27891c(mo46611a = "text")
    public String text;

    static {
        Covode.recordClassIndex(58620);
    }

    public AwemeActivityContent() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ AwemeActivityContent copy$default(AwemeActivityContent awemeActivityContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeActivityContent.text;
        }
        if ((i & 2) != 0) {
            str2 = awemeActivityContent.color;
        }
        if ((i & 4) != 0) {
            str3 = awemeActivityContent.size;
        }
        return awemeActivityContent.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.color;
    }

    public final String component3() {
        return this.size;
    }

    public final AwemeActivityContent copy(String str, String str2, String str3) {
        return new AwemeActivityContent(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivityContent)) {
            return false;
        }
        AwemeActivityContent awemeActivityContent = (AwemeActivityContent) obj;
        return C89219l.m154714a(this.text, awemeActivityContent.text) && C89219l.m154714a(this.color, awemeActivityContent.color) && C89219l.m154714a(this.size, awemeActivityContent.size);
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.size;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AwemeActivityContent(text=" + this.text + ", color=" + this.color + ", size=" + this.size + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getText() {
        return this.text;
    }

    public AwemeActivityContent(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.size = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeActivityContent(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
