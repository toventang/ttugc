package com.p2082ss.android.ugc.gamora.editor.sticker.donation.p4289c;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.c.g */
public final class C82776g implements Serializable {
    @AbstractC27891c(mo46611a = "start")

    /* renamed from: a */
    private Integer f185040a;
    @AbstractC27891c(mo46611a = "end")

    /* renamed from: b */
    private Integer f185041b;

    static {
        Covode.recordClassIndex(96626);
    }

    public static /* synthetic */ C82776g copy$default(C82776g gVar, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = gVar.f185040a;
        }
        if ((i & 2) != 0) {
            num2 = gVar.f185041b;
        }
        return gVar.copy(num, num2);
    }

    public final Integer component1() {
        return this.f185040a;
    }

    public final Integer component2() {
        return this.f185041b;
    }

    public final C82776g copy(Integer num, Integer num2) {
        return new C82776g(num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82776g)) {
            return false;
        }
        C82776g gVar = (C82776g) obj;
        return C89219l.m154714a(this.f185040a, gVar.f185040a) && C89219l.m154714a(this.f185041b, gVar.f185041b);
    }

    public final int hashCode() {
        Integer num = this.f185040a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f185041b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TextHighlight(startIndex=" + this.f185040a + ", endIndex=" + this.f185041b + ")";
    }

    public final Integer getEndIndex() {
        return this.f185041b;
    }

    public final Integer getStartIndex() {
        return this.f185040a;
    }

    public final void setEndIndex(Integer num) {
        this.f185041b = num;
    }

    public final void setStartIndex(Integer num) {
        this.f185040a = num;
    }

    public C82776g(Integer num, Integer num2) {
        this.f185040a = num;
        this.f185041b = num2;
    }
}
