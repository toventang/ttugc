package com.p2082ss.android.ugc.aweme.ktv;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ktv.SimpleEffect */
public final class SimpleEffect implements Serializable {
    private String defaultColor;

    /* renamed from: id */
    private final String f132191id;
    private boolean isItalic;
    private final String name;
    private final String path;
    private final String resId;

    static {
        Covode.recordClassIndex(68031);
    }

    public static /* synthetic */ SimpleEffect copy$default(SimpleEffect simpleEffect, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleEffect.f132191id;
        }
        if ((i & 2) != 0) {
            str2 = simpleEffect.resId;
        }
        if ((i & 4) != 0) {
            str3 = simpleEffect.name;
        }
        if ((i & 8) != 0) {
            str4 = simpleEffect.path;
        }
        if ((i & 16) != 0) {
            z = simpleEffect.isItalic;
        }
        if ((i & 32) != 0) {
            str5 = simpleEffect.defaultColor;
        }
        return simpleEffect.copy(str, str2, str3, str4, z, str5);
    }

    public final String component1() {
        return this.f132191id;
    }

    public final String component2() {
        return this.resId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.path;
    }

    public final boolean component5() {
        return this.isItalic;
    }

    public final String component6() {
        return this.defaultColor;
    }

    public final SimpleEffect copy(String str, String str2, String str3, String str4, boolean z, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str4, "");
        return new SimpleEffect(str, str2, str3, str4, z, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEffect)) {
            return false;
        }
        SimpleEffect simpleEffect = (SimpleEffect) obj;
        return C89219l.m154714a(this.f132191id, simpleEffect.f132191id) && C89219l.m154714a(this.resId, simpleEffect.resId) && C89219l.m154714a(this.name, simpleEffect.name) && C89219l.m154714a(this.path, simpleEffect.path) && this.isItalic == simpleEffect.isItalic && C89219l.m154714a(this.defaultColor, simpleEffect.defaultColor);
    }

    public final int hashCode() {
        String str = this.f132191id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.resId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.path;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z = this.isItalic;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode4 + i2) * 31;
        String str5 = this.defaultColor;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "SimpleEffect(id=" + this.f132191id + ", resId=" + this.resId + ", name=" + this.name + ", path=" + this.path + ", isItalic=" + this.isItalic + ", defaultColor=" + this.defaultColor + ")";
    }

    public final String getDefaultColor() {
        return this.defaultColor;
    }

    public final String getId() {
        return this.f132191id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final boolean isItalic() {
        return this.isItalic;
    }

    public final void setDefaultColor(String str) {
        this.defaultColor = str;
    }

    public final void setItalic(boolean z) {
        this.isItalic = z;
    }

    public SimpleEffect(String str, String str2, String str3, String str4, boolean z, String str5) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str4, "");
        this.f132191id = str;
        this.resId = str2;
        this.name = str3;
        this.path = str4;
        this.isItalic = z;
        this.defaultColor = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleEffect(String str, String str2, String str3, String str4, boolean z, String str5, int i, C89214g gVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str5);
    }
}
