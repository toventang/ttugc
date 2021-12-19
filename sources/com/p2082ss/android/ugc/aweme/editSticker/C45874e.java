package com.p2082ss.android.ugc.aweme.editSticker;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45829e;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.e */
public final class C45874e {

    /* renamed from: a */
    public final String f106861a;

    /* renamed from: b */
    public final C45879f f106862b;

    /* renamed from: c */
    public AbstractC45829e f106863c;

    /* renamed from: d */
    public final boolean f106864d;

    /* renamed from: e */
    public final boolean f106865e;

    /* renamed from: f */
    public final boolean f106866f;

    /* renamed from: g */
    public final boolean f106867g;

    /* renamed from: h */
    public final List<String> f106868h;

    static {
        Covode.recordClassIndex(54398);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45874e)) {
            return false;
        }
        C45874e eVar = (C45874e) obj;
        return C89219l.m154714a(this.f106861a, eVar.f106861a) && C89219l.m154714a(this.f106862b, eVar.f106862b) && C89219l.m154714a(this.f106863c, eVar.f106863c) && this.f106864d == eVar.f106864d && this.f106865e == eVar.f106865e && this.f106866f == eVar.f106866f && this.f106867g == eVar.f106867g && C89219l.m154714a(this.f106868h, eVar.f106868h);
    }

    public final int hashCode() {
        String str = this.f106861a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C45879f fVar = this.f106862b;
        int hashCode2 = (hashCode + (fVar != null ? fVar.hashCode() : 0)) * 31;
        AbstractC45829e eVar = this.f106863c;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        boolean z = this.f106864d;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        boolean z2 = this.f106865e;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f106866f;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.f106867g) {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        List<String> list = this.f106868h;
        if (list != null) {
            i = list.hashCode();
        }
        return i15 + i;
    }

    public final String toString() {
        return "EditTextStickerConfig(fontPanel=" + this.f106861a + ", funcEnable=" + this.f106862b + ", textBubbleViewFactory=" + this.f106863c + ", optTextStickerMaxScaleSize=" + this.f106864d + ", enableQaSticker=" + this.f106865e + ", isShoutout=" + this.f106866f + ", allowQuestion=" + this.f106867g + ", checkTextIsQuestionRegex=" + this.f106868h + ")";
    }

    public C45874e(String str, C45879f fVar, AbstractC45829e eVar, boolean z, boolean z2, boolean z3, boolean z4, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(fVar, "");
        this.f106861a = str;
        this.f106862b = fVar;
        this.f106863c = eVar;
        this.f106864d = z;
        this.f106865e = z2;
        this.f106866f = z3;
        this.f106867g = z4;
        this.f106868h = list;
    }
}
