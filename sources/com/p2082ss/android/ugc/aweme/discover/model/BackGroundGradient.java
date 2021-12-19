package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.BackGroundGradient */
public final class BackGroundGradient implements Serializable {
    @AbstractC27891c(mo46611a = "center_color")
    private final String centerColor;
    @AbstractC27891c(mo46611a = "end_color")
    private final String endColor;
    @AbstractC27891c(mo46611a = "start_color")
    private final String startColor;

    static {
        Covode.recordClassIndex(50422);
    }

    public static /* synthetic */ BackGroundGradient copy$default(BackGroundGradient backGroundGradient, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = backGroundGradient.startColor;
        }
        if ((i & 2) != 0) {
            str2 = backGroundGradient.centerColor;
        }
        if ((i & 4) != 0) {
            str3 = backGroundGradient.endColor;
        }
        return backGroundGradient.copy(str, str2, str3);
    }

    public final String component1() {
        return this.startColor;
    }

    public final String component2() {
        return this.centerColor;
    }

    public final String component3() {
        return this.endColor;
    }

    public final BackGroundGradient copy(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        return new BackGroundGradient(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackGroundGradient)) {
            return false;
        }
        BackGroundGradient backGroundGradient = (BackGroundGradient) obj;
        return C89219l.m154714a(this.startColor, backGroundGradient.startColor) && C89219l.m154714a(this.centerColor, backGroundGradient.centerColor) && C89219l.m154714a(this.endColor, backGroundGradient.endColor);
    }

    public final int hashCode() {
        String str = this.startColor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.centerColor;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.endColor;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "BackGroundGradient(startColor=" + this.startColor + ", centerColor=" + this.centerColor + ", endColor=" + this.endColor + ")";
    }

    public final String getCenterColor() {
        return this.centerColor;
    }

    public final String getEndColor() {
        return this.endColor;
    }

    public final String getStartColor() {
        return this.startColor;
    }

    public BackGroundGradient(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.startColor = str;
        this.centerColor = str2;
        this.endColor = str3;
    }
}
