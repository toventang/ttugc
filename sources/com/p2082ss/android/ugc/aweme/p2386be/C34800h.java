package com.p2082ss.android.ugc.aweme.p2386be;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.setting.checkable.DmtSettingSwitch;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.table.cell.EnumC23292b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.be.h */
public final class C34800h extends C34801i {

    /* renamed from: c */
    public final boolean f82200c;

    /* renamed from: d */
    public final String f82201d;

    /* renamed from: e */
    public final View.OnClickListener f82202e;

    /* renamed from: f */
    public final DmtSettingSwitch.AbstractC17285a f82203f;

    /* renamed from: g */
    public final Object f82204g;

    /* renamed from: h */
    public final View.OnClickListener f82205h;

    /* renamed from: i */
    public final String f82206i;

    /* renamed from: j */
    public final boolean f82207j;

    /* renamed from: k */
    public final String f82208k;

    /* renamed from: l */
    private final boolean f82209l;

    /* renamed from: m */
    private final EnumC23292b f82210m;

    /* renamed from: n */
    private final C22999a f82211n;

    /* renamed from: o */
    private final boolean f82212o;

    /* renamed from: p */
    private final boolean f82213p;

    static {
        Covode.recordClassIndex(41796);
    }

    public C34800h(String str) {
        this(false, str, null, false, null, null, null, null, null, false, 16380);
    }

    public C34800h(String str, View.OnClickListener onClickListener) {
        this(false, str, onClickListener, false, null, null, null, null, null, false, 16368);
    }

    public C34800h(String str, View.OnClickListener onClickListener, byte b) {
        this(false, str, onClickListener, false, null, null, null, null, null, false, 16376);
    }

    public C34800h(String str, View.OnClickListener onClickListener, boolean z, DmtSettingSwitch.AbstractC17285a aVar) {
        this(false, str, onClickListener, z, aVar, null, null, null, null, false, 16352);
    }

    public C34800h(String str, Object obj) {
        this(false, str, null, true, null, obj, null, null, null, false, 16320);
    }

    /* renamed from: a */
    private static C34800h m71084a(boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.AbstractC17285a aVar, Object obj, View.OnClickListener onClickListener2, EnumC23292b bVar, C22999a aVar2, boolean z3, String str2, boolean z4, boolean z5, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        return new C34800h(z, str, onClickListener, z2, aVar, obj, onClickListener2, bVar, aVar2, z3, str2, z4, z5, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f82212o;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f82209l;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a, com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: c */
    public final Object mo61502c() {
        return this.f82204g;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: d */
    public final String mo61503d() {
        return this.f82201d;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: e */
    public final EnumC23292b mo61504e() {
        return this.f82210m;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: f */
    public final C22999a mo61506f() {
        return this.f82211n;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: g */
    public final String mo61507g() {
        return this.f82206i;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: h */
    public final boolean mo61508h() {
        return this.f82207j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: i */
    public final boolean mo61510i() {
        return this.f82213p;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    /* renamed from: j */
    public final View.OnClickListener mo61515j() {
        return this.f82205h;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z = this.f82200c;
        int i9 = 1;
        if (z) {
            z = true;
        }
        int i10 = z ? 1 : 0;
        int i11 = z ? 1 : 0;
        int i12 = z ? 1 : 0;
        int i13 = i10 * 31;
        String str = this.f82201d;
        int i14 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i15 = (i13 + i) * 31;
        View.OnClickListener onClickListener = this.f82202e;
        if (onClickListener != null) {
            i2 = onClickListener.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        boolean z2 = this.f82209l;
        if (z2) {
            z2 = true;
        }
        int i17 = z2 ? 1 : 0;
        int i18 = z2 ? 1 : 0;
        int i19 = z2 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        DmtSettingSwitch.AbstractC17285a aVar = this.f82203f;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i21 = (i20 + i3) * 31;
        Object obj = this.f82204g;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        int i22 = (i21 + i4) * 31;
        View.OnClickListener onClickListener2 = this.f82205h;
        if (onClickListener2 != null) {
            i5 = onClickListener2.hashCode();
        } else {
            i5 = 0;
        }
        int i23 = (i22 + i5) * 31;
        EnumC23292b bVar = this.f82210m;
        if (bVar != null) {
            i6 = bVar.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i23 + i6) * 31;
        C22999a aVar2 = this.f82211n;
        if (aVar2 != null) {
            i7 = aVar2.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 31;
        boolean z3 = this.f82212o;
        if (z3) {
            z3 = true;
        }
        int i26 = z3 ? 1 : 0;
        int i27 = z3 ? 1 : 0;
        int i28 = z3 ? 1 : 0;
        int i29 = (i25 + i26) * 31;
        String str2 = this.f82206i;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i30 = (i29 + i8) * 31;
        boolean z4 = this.f82207j;
        if (z4) {
            z4 = true;
        }
        int i31 = z4 ? 1 : 0;
        int i32 = z4 ? 1 : 0;
        int i33 = z4 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        if (!this.f82213p) {
            i9 = 0;
        }
        int i35 = (i34 + i9) * 31;
        String str3 = this.f82208k;
        if (str3 != null) {
            i14 = str3.hashCode();
        }
        return i35 + i14;
    }

    public final String toString() {
        return "SwitchItem(isChecked=" + this.f82200c + ", title=" + this.f82201d + ", onClickListener=" + this.f82202e + ", visibility=" + this.f82209l + ", onCheckedChangedListener=" + this.f82203f + ", tag=" + this.f82204g + ", disableClickListener=" + this.f82205h + ", cellVariant=" + this.f82210m + ", icon=" + this.f82211n + ", divider=" + this.f82212o + ", subTitle=" + this.f82206i + ", enable=" + this.f82207j + ", loading=" + this.f82213p + ", right_title=" + this.f82208k + ")";
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.C34801i
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C34800h(boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.AbstractC17285a aVar, Object obj, View.OnClickListener onClickListener2, EnumC23292b bVar, String str2, boolean z3, int i) {
        this((i & 1) != 0 ? false : z, str, (i & 4) != 0 ? null : onClickListener, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : aVar, (i & 32) != 0 ? null : obj, (i & 64) != 0 ? null : onClickListener2, (i & 128) != 0 ? EnumC23292b.NORMAL : bVar, null, false, (i & 1024) == 0 ? str2 : null, (i & 2048) != 0 ? true : z3, false, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C34800h(boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.AbstractC17285a aVar, Object obj, View.OnClickListener onClickListener2, EnumC23292b bVar, C22999a aVar2, boolean z3, String str2, boolean z4, boolean z5, String str3) {
        super(str, bVar, aVar2, z2, z3, str2, z4, z5, onClickListener, onClickListener2, 1024);
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        this.f82200c = z;
        this.f82201d = str;
        this.f82202e = onClickListener;
        this.f82209l = z2;
        this.f82203f = aVar;
        this.f82204g = obj;
        this.f82205h = onClickListener2;
        this.f82210m = bVar;
        this.f82211n = aVar2;
        this.f82212o = z3;
        this.f82206i = str2;
        this.f82207j = z4;
        this.f82213p = z5;
        this.f82208k = str3;
    }

    /* renamed from: a */
    public static /* synthetic */ C34800h m71083a(C34800h hVar, boolean z, String str, View.OnClickListener onClickListener, boolean z2, DmtSettingSwitch.AbstractC17285a aVar, Object obj, View.OnClickListener onClickListener2, EnumC23292b bVar, C22999a aVar2, boolean z3, String str2, boolean z4, boolean z5, String str3, int i) {
        String str4 = str3;
        boolean z6 = z5;
        boolean z7 = z4;
        String str5 = str2;
        boolean z8 = z2;
        View.OnClickListener onClickListener3 = onClickListener;
        String str6 = str;
        boolean z9 = z;
        DmtSettingSwitch.AbstractC17285a aVar3 = aVar;
        Object obj2 = obj;
        View.OnClickListener onClickListener4 = onClickListener2;
        EnumC23292b bVar2 = bVar;
        C22999a aVar4 = aVar2;
        boolean z10 = z3;
        if ((i & 1) != 0) {
            z9 = hVar.f82200c;
        }
        if ((i & 2) != 0) {
            str6 = hVar.f82201d;
        }
        if ((i & 4) != 0) {
            onClickListener3 = hVar.f82202e;
        }
        if ((i & 8) != 0) {
            z8 = hVar.f82209l;
        }
        if ((i & 16) != 0) {
            aVar3 = hVar.f82203f;
        }
        if ((i & 32) != 0) {
            obj2 = hVar.f82204g;
        }
        if ((i & 64) != 0) {
            onClickListener4 = hVar.f82205h;
        }
        if ((i & 128) != 0) {
            bVar2 = hVar.f82210m;
        }
        if ((i & 256) != 0) {
            aVar4 = hVar.f82211n;
        }
        if ((i & 512) != 0) {
            z10 = hVar.f82212o;
        }
        if ((i & 1024) != 0) {
            str5 = hVar.f82206i;
        }
        if ((i & 2048) != 0) {
            z7 = hVar.f82207j;
        }
        if ((i & 4096) != 0) {
            z6 = hVar.f82213p;
        }
        if ((i & 8192) != 0) {
            str4 = hVar.f82208k;
        }
        return m71084a(z9, str6, onClickListener3, z8, aVar3, obj2, onClickListener4, bVar2, aVar4, z10, str5, z7, z6, str4);
    }
}
