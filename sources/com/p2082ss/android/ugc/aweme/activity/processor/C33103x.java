package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.x */
public final class C33103x implements AbstractC17362a {

    /* renamed from: a */
    public boolean f78667a;

    /* renamed from: b */
    public boolean f78668b;

    /* renamed from: c */
    public boolean f78669c;

    /* renamed from: d */
    public int f78670d;

    /* renamed from: e */
    public int f78671e;

    /* renamed from: f */
    public int f78672f;

    /* renamed from: g */
    public int f78673g;

    /* renamed from: h */
    public boolean f78674h;

    /* renamed from: i */
    public boolean f78675i;

    static {
        Covode.recordClassIndex(39915);
    }

    public C33103x() {
        this(R.color.nc, true, false, 4);
    }

    public C33103x(byte b) {
        this(0, false, false, 7);
    }

    public C33103x(int i) {
        this(i, false, false, 6);
    }

    public final int hashCode() {
        int i = this.f78673g * 31;
        boolean z = this.f78674h;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i + i3) * 31;
        if (!this.f78675i) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "ImmersiveConfig(statusBarColor=" + this.f78673g + ", autoDarkEnable=" + this.f78674h + ", disable=" + this.f78675i + ")";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C33103x)) {
            obj = null;
        }
        C33103x xVar = (C33103x) obj;
        if (xVar != null && this.f78673g == xVar.f78673g && this.f78667a == xVar.f78667a && this.f78668b == xVar.f78668b && this.f78669c == xVar.f78669c && this.f78670d == xVar.f78670d && this.f78674h == xVar.f78674h && this.f78675i == xVar.f78675i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ C33103x m67806a(C33103x xVar, int i) {
        return new C33103x(i, xVar.f78674h, xVar.f78675i);
    }

    private C33103x(int i, boolean z, boolean z2) {
        this.f78673g = i;
        this.f78674h = z;
        this.f78675i = z2;
        this.f78670d = -1;
        this.f78671e = -1;
        this.f78672f = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33103x(int i, boolean z, boolean z2, int i2) {
        this((i2 & 1) != 0 ? R.color.a2 : i, (i2 & 2) != 0 ? true : z, (i2 & 4) != 0 ? false : z2);
    }
}
