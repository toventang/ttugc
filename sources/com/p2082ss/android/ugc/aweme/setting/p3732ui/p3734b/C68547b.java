package com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.b.b */
public final class C68547b extends AbstractC34793a {

    /* renamed from: c */
    public final String f153386c;

    /* renamed from: d */
    public final int f153387d;

    /* renamed from: e */
    public final View.OnClickListener f153388e;

    /* renamed from: f */
    public final View.OnClickListener f153389f;

    /* renamed from: g */
    public final String f153390g;

    /* renamed from: h */
    public final int f153391h;

    /* renamed from: i */
    public final String f153392i;

    /* renamed from: j */
    private final boolean f153393j;

    /* renamed from: k */
    private final boolean f153394k;

    /* renamed from: l */
    private final Object f153395l;

    static {
        Covode.recordClassIndex(80800);
    }

    public C68547b(String str, int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, byte b) {
        this(str, i, onClickListener, onClickListener2);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f153393j;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f153394k;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: c */
    public final Object mo61502c() {
        return this.f153395l;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str = this.f153386c;
        int i6 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i7 = ((i * 31) + this.f153387d) * 31;
        View.OnClickListener onClickListener = this.f153388e;
        if (onClickListener != null) {
            i2 = onClickListener.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i7 + i2) * 31;
        View.OnClickListener onClickListener2 = this.f153389f;
        if (onClickListener2 != null) {
            i3 = onClickListener2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str2 = this.f153390g;
        if (str2 != null) {
            i4 = str2.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (((i9 + i4) * 31) + this.f153391h) * 31;
        String str3 = this.f153392i;
        if (str3 != null) {
            i5 = str3.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        boolean z = this.f153393j;
        int i12 = 1;
        if (z) {
            z = true;
        }
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = z ? 1 : 0;
        int i16 = (i11 + i13) * 31;
        if (!this.f153394k) {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        Object obj = this.f153395l;
        if (obj != null) {
            i6 = obj.hashCode();
        }
        return i17 + i6;
    }

    public final String toString() {
        return "SettingFooterItem(id=" + this.f153386c + ", backgroundColor=" + this.f153387d + ", onClickListenerOfUserInfo=" + this.f153388e + ", onClickListenerOfVersion=" + this.f153389f + ", versionText=" + this.f153390g + ", userInfoVisibility=" + this.f153391h + ", userInfoText=" + this.f153392i + ", divider=" + this.f153393j + ", visibility=" + this.f153394k + ", tag=" + this.f153395l + ")";
    }

    public final boolean equals(Object obj) {
        String str = this.f153386c;
        String str2 = null;
        if (!(obj instanceof C68547b)) {
            obj = null;
        }
        C68547b bVar = (C68547b) obj;
        if (bVar != null) {
            str2 = bVar.f153386c;
        }
        return C89219l.m154714a((Object) str, (Object) str2);
    }

    private /* synthetic */ C68547b(String str, int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        this(str, i, onClickListener, onClickListener2, "", 4, "", false, true, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C68547b(String str, int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str2, int i2, String str3, boolean z, boolean z2, Object obj) {
        super(z, z2, obj, null, 8);
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f153386c = str;
        this.f153387d = i;
        this.f153388e = onClickListener;
        this.f153389f = onClickListener2;
        this.f153390g = str2;
        this.f153391h = i2;
        this.f153392i = str3;
        this.f153393j = z;
        this.f153394k = z2;
        this.f153395l = obj;
    }

    /* renamed from: a */
    public static /* synthetic */ C68547b m120972a(C68547b bVar, String str, int i, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, String str2, int i2, String str3, boolean z, boolean z2, Object obj, int i3) {
        View.OnClickListener onClickListener3 = onClickListener2;
        View.OnClickListener onClickListener4 = onClickListener;
        int i4 = i;
        String str4 = str;
        String str5 = str2;
        int i5 = i2;
        String str6 = str3;
        boolean z3 = z;
        boolean z4 = z2;
        Object obj2 = obj;
        if ((i3 & 1) != 0) {
            str4 = bVar.f153386c;
        }
        if ((i3 & 2) != 0) {
            i4 = bVar.f153387d;
        }
        if ((i3 & 4) != 0) {
            onClickListener4 = bVar.f153388e;
        }
        if ((i3 & 8) != 0) {
            onClickListener3 = bVar.f153389f;
        }
        if ((i3 & 16) != 0) {
            str5 = bVar.f153390g;
        }
        if ((i3 & 32) != 0) {
            i5 = bVar.f153391h;
        }
        if ((i3 & 64) != 0) {
            str6 = bVar.f153392i;
        }
        if ((i3 & 128) != 0) {
            z3 = bVar.f153393j;
        }
        if ((i3 & 256) != 0) {
            z4 = bVar.f153394k;
        }
        if ((i3 & 512) != 0) {
            obj2 = bVar.f153395l;
        }
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        C89219l.m154721d(str6, "");
        return new C68547b(str4, i4, onClickListener4, onClickListener3, str5, i5, str6, z3, z4, obj2);
    }
}
