package com.p2082ss.android.ugc.aweme.setting.p3732ui.p3734b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.b.c */
public final class C68548c extends AbstractC34793a {

    /* renamed from: c */
    public final String f153396c;

    /* renamed from: d */
    public final View.OnClickListener f153397d;

    /* renamed from: e */
    private final boolean f153398e;

    /* renamed from: f */
    private final boolean f153399f;

    /* renamed from: g */
    private final Object f153400g;

    static {
        Covode.recordClassIndex(80801);
    }

    public C68548c(String str, byte b) {
        this(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: a */
    public final boolean mo61500a() {
        return this.f153399f;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: b */
    public final boolean mo61501b() {
        return this.f153398e;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2386be.AbstractC34793a
    /* renamed from: c */
    public final Object mo61502c() {
        return this.f153400g;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f153396c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        boolean z = this.f153398e;
        int i5 = 1;
        if (z) {
            z = true;
        }
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = z ? 1 : 0;
        int i9 = (i4 + i6) * 31;
        View.OnClickListener onClickListener = this.f153397d;
        if (onClickListener != null) {
            i2 = onClickListener.hashCode();
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        if (!this.f153399f) {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        Object obj = this.f153400g;
        if (obj != null) {
            i3 = obj.hashCode();
        }
        return i11 + i3;
    }

    public final String toString() {
        return "SettingUnLoginItem(text=" + this.f153396c + ", visibility=" + this.f153398e + ", onClickListener=" + this.f153397d + ", divider=" + this.f153399f + ", tag=" + this.f153400g + ")";
    }

    private /* synthetic */ C68548c(String str) {
        this(str, false, null, false, null);
    }

    public final boolean equals(Object obj) {
        String str = this.f153396c;
        String str2 = null;
        if (!(obj instanceof C68548c)) {
            obj = null;
        }
        C68548c cVar = (C68548c) obj;
        if (cVar != null) {
            str2 = cVar.f153396c;
        }
        return C89219l.m154714a((Object) str, (Object) str2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C68548c(String str, boolean z, View.OnClickListener onClickListener, boolean z2, Object obj) {
        super(z2, z, obj, null, 8);
        C89219l.m154721d(str, "");
        this.f153396c = str;
        this.f153398e = z;
        this.f153397d = onClickListener;
        this.f153399f = z2;
        this.f153400g = obj;
    }

    /* renamed from: a */
    public static /* synthetic */ C68548c m120976a(C68548c cVar, String str, boolean z, View.OnClickListener onClickListener, boolean z2, Object obj, int i) {
        Object obj2 = obj;
        String str2 = str;
        boolean z3 = z;
        View.OnClickListener onClickListener2 = onClickListener;
        boolean z4 = z2;
        if ((i & 1) != 0) {
            str2 = cVar.f153396c;
        }
        if ((i & 2) != 0) {
            z3 = cVar.f153398e;
        }
        if ((i & 4) != 0) {
            onClickListener2 = cVar.f153397d;
        }
        if ((i & 8) != 0) {
            z4 = cVar.f153399f;
        }
        if ((i & 16) != 0) {
            obj2 = cVar.f153400g;
        }
        C89219l.m154721d(str2, "");
        return new C68548c(str2, z3, onClickListener2, z4, obj2);
    }
}
