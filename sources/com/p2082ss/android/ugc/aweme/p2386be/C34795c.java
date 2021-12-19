package com.p2082ss.android.ugc.aweme.p2386be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.table.cell.EnumC23292b;

/* renamed from: com.ss.android.ugc.aweme.be.c */
public final class C34795c extends C34801i {

    /* renamed from: c */
    public final String f82145c;

    /* renamed from: d */
    public final View.OnClickListener f82146d;

    /* renamed from: e */
    private final String f82147e;

    /* renamed from: f */
    private final EnumC23292b f82148f;

    /* renamed from: g */
    private final boolean f82149g;

    /* renamed from: h */
    private final C22999a f82150h;

    /* renamed from: i */
    private final boolean f82151i;

    /* renamed from: j */
    private final String f82152j;

    /* renamed from: k */
    private final boolean f82153k;

    /* renamed from: l */
    private final boolean f82154l;

    static {
        Covode.recordClassIndex(41791);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f82151i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f82149g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: d */
    public final String mo61503d() {
        return this.f82147e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: e */
    public final EnumC23292b mo61504e() {
        return this.f82148f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: f */
    public final C22999a mo61506f() {
        return this.f82150h;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: g */
    public final String mo61507g() {
        return this.f82152j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: h */
    public final boolean mo61508h() {
        return this.f82153k;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: i */
    public final boolean mo61510i() {
        return this.f82154l;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f82145c;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = i * 31;
        String str2 = this.f82147e;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        EnumC23292b bVar = this.f82148f;
        if (bVar != null) {
            i3 = bVar.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        boolean z = this.f82149g;
        int i10 = 1;
        if (z) {
            z = true;
        }
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = z ? 1 : 0;
        int i14 = (i9 + i11) * 31;
        View.OnClickListener onClickListener = this.f82146d;
        if (onClickListener != null) {
            i4 = onClickListener.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        C22999a aVar = this.f82150h;
        if (aVar != null) {
            i5 = aVar.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        boolean z2 = this.f82151i;
        if (z2) {
            z2 = true;
        }
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = z2 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        String str3 = this.f82152j;
        if (str3 != null) {
            i6 = str3.hashCode();
        }
        int i21 = (i20 + i6) * 31;
        boolean z3 = this.f82153k;
        if (z3) {
            z3 = true;
        }
        int i22 = z3 ? 1 : 0;
        int i23 = z3 ? 1 : 0;
        int i24 = z3 ? 1 : 0;
        int i25 = (i21 + i22) * 31;
        if (!this.f82154l) {
            i10 = 0;
        }
        return i25 + i10;
    }

    public final String toString() {
        return "ButtonItem(text=" + this.f82145c + ", title=" + this.f82147e + ", cellVariant=" + this.f82148f + ", visibility=" + this.f82149g + ", onClickListener=" + this.f82146d + ", icon=" + this.f82150h + ", divider=" + this.f82151i + ", subTitle=" + this.f82152j + ", enable=" + this.f82153k + ", loading=" + this.f82154l + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }
}
