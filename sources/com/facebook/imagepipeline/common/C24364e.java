package com.facebook.imagepipeline.common;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1839k.C24128b;

/* renamed from: com.facebook.imagepipeline.common.e */
public class C24364e {

    /* renamed from: b */
    public static final C24364e f57783b = new C24364e(-1, false);

    /* renamed from: c */
    public static final C24364e f57784c = new C24364e(-2, false);

    /* renamed from: d */
    public static final C24364e f57785d = new C24364e(-1, true);

    /* renamed from: a */
    public final boolean f57786a;

    /* renamed from: e */
    private final int f57787e;

    /* renamed from: a */
    public final boolean mo40165a() {
        if (this.f57787e == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo40166b() {
        if (this.f57787e != -2) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(28507);
    }

    /* renamed from: c */
    public final int mo40167c() {
        if (!mo40165a()) {
            return this.f57787e;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public String toString() {
        return C1764a.m5929a(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f57787e), Boolean.valueOf(this.f57786a)});
    }

    public int hashCode() {
        int hashCode;
        Integer valueOf = Integer.valueOf(this.f57787e);
        Boolean valueOf2 = Boolean.valueOf(this.f57786a);
        int i = 0;
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 != null) {
            i = valueOf2.hashCode();
        }
        return C24128b.m45730a(hashCode, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24364e)) {
            return false;
        }
        C24364e eVar = (C24364e) obj;
        if (this.f57787e == eVar.f57787e && this.f57786a == eVar.f57786a) {
            return true;
        }
        return false;
    }

    private C24364e(int i, boolean z) {
        this.f57787e = i;
        this.f57786a = z;
    }
}
