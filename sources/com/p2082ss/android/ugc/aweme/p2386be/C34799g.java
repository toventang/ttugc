package com.p2082ss.android.ugc.aweme.p2386be;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.table.cell.EnumC23292b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.be.g */
public final class C34799g extends C34801i {

    /* renamed from: c */
    public final boolean f82189c;

    /* renamed from: d */
    public final CompoundButton.OnCheckedChangeListener f82190d;

    /* renamed from: e */
    public final String f82191e;

    /* renamed from: f */
    public final EnumC23292b f82192f;

    /* renamed from: g */
    public final C22999a f82193g;

    /* renamed from: h */
    public final boolean f82194h;

    /* renamed from: i */
    public final boolean f82195i;

    /* renamed from: j */
    public final String f82196j;

    /* renamed from: k */
    public final boolean f82197k;

    /* renamed from: l */
    public final boolean f82198l;

    /* renamed from: m */
    public final View.OnClickListener f82199m;

    static {
        Covode.recordClassIndex(41795);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f82194h;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f82195i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: d */
    public final String mo61503d() {
        return this.f82191e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: e */
    public final EnumC23292b mo61504e() {
        return this.f82192f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: f */
    public final C22999a mo61506f() {
        return this.f82193g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: g */
    public final String mo61507g() {
        return this.f82196j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: h */
    public final boolean mo61508h() {
        return this.f82197k;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: i */
    public final boolean mo61510i() {
        return this.f82198l;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z = this.f82189c;
        int i6 = 1;
        if (z) {
            z = true;
        }
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = z ? 1 : 0;
        int i10 = i7 * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f82190d;
        int i11 = 0;
        if (onCheckedChangeListener != null) {
            i = onCheckedChangeListener.hashCode();
        } else {
            i = 0;
        }
        int i12 = (i10 + i) * 31;
        String str = this.f82191e;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 31;
        EnumC23292b bVar = this.f82192f;
        if (bVar != null) {
            i3 = bVar.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        C22999a aVar = this.f82193g;
        if (aVar != null) {
            i4 = aVar.hashCode();
        } else {
            i4 = 0;
        }
        int i15 = (i14 + i4) * 31;
        boolean z2 = this.f82194h;
        if (z2) {
            z2 = true;
        }
        int i16 = z2 ? 1 : 0;
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z3 = this.f82195i;
        if (z3) {
            z3 = true;
        }
        int i20 = z3 ? 1 : 0;
        int i21 = z3 ? 1 : 0;
        int i22 = z3 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        String str2 = this.f82196j;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i24 = (i23 + i5) * 31;
        boolean z4 = this.f82197k;
        if (z4) {
            z4 = true;
        }
        int i25 = z4 ? 1 : 0;
        int i26 = z4 ? 1 : 0;
        int i27 = z4 ? 1 : 0;
        int i28 = (i24 + i25) * 31;
        if (!this.f82198l) {
            i6 = 0;
        }
        int i29 = (i28 + i6) * 31;
        View.OnClickListener onClickListener = this.f82199m;
        if (onClickListener != null) {
            i11 = onClickListener.hashCode();
        }
        return i29 + i11;
    }

    public final String toString() {
        return "RadioItem(isChecked=" + this.f82189c + ", onCheckedChangedListener=" + this.f82190d + ", title=" + this.f82191e + ", cellVariant=" + this.f82192f + ", icon=" + this.f82193g + ", divider=" + this.f82194h + ", visibility=" + this.f82195i + ", subTitle=" + this.f82196j + ", enable=" + this.f82197k + ", loading=" + this.f82198l + ", onClickListener=" + this.f82199m + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* synthetic */ C34799g(boolean z, String str, C22999a aVar, View.OnClickListener onClickListener) {
        this(z, null, str, EnumC23292b.NORMAL, aVar, false, true, null, true, false, onClickListener);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34799g(boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, String str, EnumC23292b bVar, C22999a aVar, boolean z2, boolean z3, String str2, boolean z4, boolean z5, View.OnClickListener onClickListener) {
        super(str, bVar, aVar, z3, z2, str2, z4, z5, onClickListener, null, 1536);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f82189c = z;
        this.f82190d = onCheckedChangeListener;
        this.f82191e = str;
        this.f82192f = bVar;
        this.f82193g = aVar;
        this.f82194h = z2;
        this.f82195i = z3;
        this.f82196j = str2;
        this.f82197k = z4;
        this.f82198l = z5;
        this.f82199m = onClickListener;
    }
}
