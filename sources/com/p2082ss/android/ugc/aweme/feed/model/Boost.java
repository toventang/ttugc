package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Boost */
public final class Boost implements Serializable {
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    public String bgColor;
    @AbstractC27891c(mo46611a = "label")
    public String text;
    @AbstractC27891c(mo46611a = "color_text")
    public String textColor;

    static {
        Covode.recordClassIndex(58656);
    }

    public Boost() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Boost copy$default(Boost boost, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boost.text;
        }
        if ((i & 2) != 0) {
            str2 = boost.bgColor;
        }
        if ((i & 4) != 0) {
            str3 = boost.textColor;
        }
        return boost.copy(str, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.bgColor;
    }

    public final String component3() {
        return this.textColor;
    }

    public final Boost copy(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new Boost(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Boost)) {
            return false;
        }
        Boost boost = (Boost) obj;
        return C89219l.m154714a(this.text, boost.text) && C89219l.m154714a(this.bgColor, boost.bgColor) && C89219l.m154714a(this.textColor, boost.textColor);
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bgColor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "Boost(text=" + this.text + ", bgColor=" + this.bgColor + ", textColor=" + this.textColor + ")";
    }

    public final String getBgColor() {
        return this.bgColor;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public Boost(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.text = str;
        this.bgColor = str2;
        this.textColor = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Boost(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
