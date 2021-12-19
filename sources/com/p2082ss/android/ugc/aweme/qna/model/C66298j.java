package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.j */
public final class C66298j {

    /* renamed from: a */
    public final boolean f149069a;

    /* renamed from: b */
    public final boolean f149070b;

    /* renamed from: c */
    public final String f149071c = null;

    /* renamed from: d */
    public final boolean f149072d;

    static {
        Covode.recordClassIndex(77807);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66298j)) {
            return false;
        }
        C66298j jVar = (C66298j) obj;
        return this.f149069a == jVar.f149069a && this.f149070b == jVar.f149070b && C89219l.m154714a(this.f149071c, jVar.f149071c) && this.f149072d == jVar.f149072d;
    }

    public final int hashCode() {
        boolean z = this.f149069a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        boolean z2 = this.f149070b;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = (i5 + i6) * 31;
        String str = this.f149071c;
        int hashCode = (i9 + (str != null ? str.hashCode() : 0)) * 31;
        if (!this.f149072d) {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TranslationCellUiModel(isTranslated=" + this.f149069a + ", displayLoadingTranslationSpinner=" + this.f149070b + ", originalLanguage=" + this.f149071c + ", showTranslationButton=" + this.f149072d + ")";
    }

    public C66298j(boolean z, boolean z2, boolean z3) {
        this.f149069a = z;
        this.f149070b = z2;
        this.f149072d = z3;
    }
}
