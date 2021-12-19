package com.facebook.drawee.p1855f;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.f.e */
public class C24250e {

    /* renamed from: a */
    public EnumC24251a f57499a = EnumC24251a.BITMAP_ONLY;

    /* renamed from: b */
    public boolean f57500b;

    /* renamed from: c */
    public float[] f57501c;

    /* renamed from: d */
    public int f57502d;

    /* renamed from: e */
    public float f57503e;

    /* renamed from: f */
    public int f57504f;

    /* renamed from: g */
    public float f57505g;

    /* renamed from: h */
    public boolean f57506h;

    static {
        Covode.recordClassIndex(28381);
    }

    /* renamed from: b */
    public static C24250e m46054b() {
        C24250e eVar = new C24250e();
        eVar.f57500b = true;
        return eVar;
    }

    /* renamed from: com.facebook.drawee.f.e$a */
    public enum EnumC24251a {
        OVERLAY_COLOR,
        BITMAP_ONLY;

        static {
            Covode.recordClassIndex(28382);
        }
    }

    /* renamed from: a */
    public final float[] mo39983a() {
        if (this.f57501c == null) {
            this.f57501c = new float[8];
        }
        return this.f57501c;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        EnumC24251a aVar = this.f57499a;
        int i4 = 0;
        if (aVar != null) {
            i = aVar.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.f57500b ? 1 : 0)) * 31;
        float[] fArr = this.f57501c;
        if (fArr != null) {
            i2 = Arrays.hashCode(fArr);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.f57502d) * 31;
        float f = this.f57503e;
        if (f != 0.0f) {
            i3 = Float.floatToIntBits(f);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.f57504f) * 31;
        float f2 = this.f57505g;
        if (f2 != 0.0f) {
            i4 = Float.floatToIntBits(f2);
        }
        return ((i7 + i4) * 31) + (this.f57506h ? 1 : 0);
    }

    /* renamed from: a */
    public final C24250e mo39982a(boolean z) {
        this.f57500b = z;
        return this;
    }

    /* renamed from: b */
    public final C24250e mo39984b(int i) {
        this.f57504f = i;
        return this;
    }

    /* renamed from: a */
    public final C24250e mo39978a(float f) {
        Arrays.fill(mo39983a(), f);
        return this;
    }

    /* renamed from: a */
    public final C24250e mo39980a(int i) {
        this.f57502d = i;
        this.f57499a = EnumC24251a.OVERLAY_COLOR;
        return this;
    }

    /* renamed from: c */
    public final C24250e mo39985c(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "the border width cannot be < 0");
        this.f57503e = f;
        return this;
    }

    /* renamed from: d */
    public final C24250e mo39986d(float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "the padding cannot be < 0");
        this.f57505g = f;
        return this;
    }

    /* renamed from: b */
    public static C24250e m46055b(float f) {
        return new C24250e().mo39978a(f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C24250e eVar = (C24250e) obj;
        if (this.f57500b == eVar.f57500b && this.f57502d == eVar.f57502d && Float.compare(eVar.f57503e, this.f57503e) == 0 && this.f57504f == eVar.f57504f && Float.compare(eVar.f57505g, this.f57505g) == 0 && this.f57499a == eVar.f57499a && this.f57506h == eVar.f57506h) {
            return Arrays.equals(this.f57501c, eVar.f57501c);
        }
        return false;
    }

    /* renamed from: a */
    public final C24250e mo39981a(int i, float f) {
        boolean z;
        if (f >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        C24091i.m45621a(z, "the border width cannot be < 0");
        this.f57503e = f;
        this.f57504f = i;
        return this;
    }

    /* renamed from: a */
    public final C24250e mo39979a(float f, float f2, float f3, float f4) {
        float[] a = mo39983a();
        a[1] = f;
        a[0] = f;
        a[3] = f2;
        a[2] = f2;
        a[5] = f3;
        a[4] = f3;
        a[7] = f4;
        a[6] = f4;
        return this;
    }

    /* renamed from: b */
    public static C24250e m46056b(float f, float f2, float f3, float f4) {
        return new C24250e().mo39979a(f, f2, f3, f4);
    }
}
