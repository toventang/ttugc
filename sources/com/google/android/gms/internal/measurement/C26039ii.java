package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.AbstractC25981gj;

/* renamed from: com.google.android.gms.internal.measurement.ii */
final class C26039ii implements AbstractC26018ho {

    /* renamed from: a */
    final AbstractC26020hq f61334a;

    /* renamed from: b */
    public final String f61335b;

    /* renamed from: c */
    public final Object[] f61336c;

    /* renamed from: d */
    private final int f61337d;

    static {
        Covode.recordClassIndex(31454);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26018ho
    /* renamed from: c */
    public final AbstractC26020hq mo42691c() {
        return this.f61334a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26018ho
    /* renamed from: a */
    public final int mo42689a() {
        if ((this.f61337d & 1) == 1) {
            return AbstractC25981gj.C25986e.f61250h;
        }
        return AbstractC25981gj.C25986e.f61251i;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26018ho
    /* renamed from: b */
    public final boolean mo42690b() {
        if ((this.f61337d & 2) == 2) {
            return true;
        }
        return false;
    }

    C26039ii(AbstractC26020hq hqVar, String str, Object[] objArr) {
        this.f61334a = hqVar;
        this.f61335b = str;
        this.f61336c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f61337d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.f61337d = i | (charAt2 << i2);
                return;
            }
        }
    }
}
