package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeActivityButton */
public final class AwemeActivityButton implements Serializable {
    @AbstractC27891c(mo46611a = C19386b.f45894a)
    public String color;
    @AbstractC27891c(mo46611a = "label")
    public String label;

    static {
        Covode.recordClassIndex(58619);
    }

    public AwemeActivityButton() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ AwemeActivityButton copy$default(AwemeActivityButton awemeActivityButton, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeActivityButton.label;
        }
        if ((i & 2) != 0) {
            str2 = awemeActivityButton.color;
        }
        return awemeActivityButton.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.color;
    }

    public final AwemeActivityButton copy(String str, String str2) {
        return new AwemeActivityButton(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivityButton)) {
            return false;
        }
        AwemeActivityButton awemeActivityButton = (AwemeActivityButton) obj;
        return C89219l.m154714a(this.label, awemeActivityButton.label) && C89219l.m154714a(this.color, awemeActivityButton.color);
    }

    public final int hashCode() {
        String str = this.label;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.color;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AwemeActivityButton(label=" + this.label + ", color=" + this.color + ")";
    }

    public final String getColor() {
        return this.color;
    }

    public final String getLabel() {
        return this.label;
    }

    public AwemeActivityButton(String str, String str2) {
        this.label = str;
        this.color = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AwemeActivityButton(String str, String str2, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
