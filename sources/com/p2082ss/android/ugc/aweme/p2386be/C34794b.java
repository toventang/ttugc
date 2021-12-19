package com.p2082ss.android.ugc.aweme.p2386be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.table.cell.EnumC23292b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.be.b */
public final class C34794b extends C34801i {

    /* renamed from: c */
    public final String f82136c;

    /* renamed from: d */
    public final String f82137d;

    /* renamed from: e */
    public final boolean f82138e;

    /* renamed from: f */
    public final View.OnClickListener f82139f;

    /* renamed from: g */
    private final EnumC23292b f82140g;

    /* renamed from: h */
    private final C22999a f82141h;

    /* renamed from: i */
    private final boolean f82142i;

    /* renamed from: j */
    private final boolean f82143j;

    /* renamed from: k */
    private final boolean f82144k;

    static {
        Covode.recordClassIndex(41790);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f82142i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f82143j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: d */
    public final String mo61503d() {
        return this.f82136c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: e */
    public final EnumC23292b mo61504e() {
        return this.f82140g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: f */
    public final C22999a mo61506f() {
        return this.f82141h;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: g */
    public final String mo61507g() {
        return this.f82137d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: h */
    public final boolean mo61508h() {
        return this.f82138e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: i */
    public final boolean mo61510i() {
        return this.f82144k;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.f82136c;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        EnumC23292b bVar = this.f82140g;
        if (bVar != null) {
            i2 = bVar.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        C22999a aVar = this.f82141h;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        boolean z = this.f82142i;
        int i9 = 1;
        if (z) {
            z = true;
        }
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = (i8 + i10) * 31;
        boolean z2 = this.f82143j;
        if (z2) {
            z2 = true;
        }
        int i14 = z2 ? 1 : 0;
        int i15 = z2 ? 1 : 0;
        int i16 = z2 ? 1 : 0;
        int i17 = (i13 + i14) * 31;
        String str2 = this.f82137d;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        boolean z3 = this.f82138e;
        if (z3) {
            z3 = true;
        }
        int i19 = z3 ? 1 : 0;
        int i20 = z3 ? 1 : 0;
        int i21 = z3 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        if (!this.f82144k) {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        View.OnClickListener onClickListener = this.f82139f;
        if (onClickListener != null) {
            i5 = onClickListener.hashCode();
        }
        return i23 + i5;
    }

    public final String toString() {
        return "BasicTuxItem(title=" + this.f82136c + ", cellVariant=" + this.f82140g + ", icon=" + this.f82141h + ", divider=" + this.f82142i + ", visibility=" + this.f82143j + ", subTitle=" + this.f82137d + ", enable=" + this.f82138e + ", loading=" + this.f82144k + ", onClickListener=" + this.f82139f + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34794b)) {
            return false;
        }
        C34794b bVar = (C34794b) obj;
        if (!C89219l.m154714a((Object) this.f82136c, (Object) bVar.f82136c) || !C89219l.m154714a(this.f82140g, bVar.f82140g) || !C89219l.m154714a(this.f82141h, bVar.f82141h) || this.f82142i != bVar.f82142i || this.f82143j != bVar.f82143j || !C89219l.m154714a((Object) this.f82137d, (Object) bVar.f82137d) || this.f82138e != bVar.f82138e || this.f82144k != bVar.f82144k || !C89219l.m154714a(this.f82139f, bVar.f82139f)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ C34794b(String str, View.OnClickListener onClickListener) {
        this(str, EnumC23292b.NORMAL, onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34794b(String str, EnumC23292b bVar, View.OnClickListener onClickListener) {
        super(str, bVar, null, true, false, null, true, false, onClickListener, null, 1536);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f82136c = str;
        this.f82140g = bVar;
        this.f82141h = null;
        this.f82142i = false;
        this.f82143j = true;
        this.f82137d = null;
        this.f82138e = true;
        this.f82144k = false;
        this.f82139f = onClickListener;
    }
}
