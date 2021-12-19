package com.facebook.imagepipeline.p1885j;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.imagepipeline.j.g */
public final class C24458g implements AbstractC24459h {

    /* renamed from: a */
    public static final AbstractC24459h f58105a = m46700a(Integer.MAX_VALUE, true, true);

    /* renamed from: b */
    int f58106b;

    /* renamed from: c */
    boolean f58107c;

    /* renamed from: d */
    boolean f58108d;

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24459h
    /* renamed from: a */
    public final int mo40312a() {
        return this.f58106b;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24459h
    /* renamed from: b */
    public final boolean mo40313b() {
        return this.f58107c;
    }

    @Override // com.facebook.imagepipeline.p1885j.AbstractC24459h
    /* renamed from: c */
    public final boolean mo40314c() {
        return this.f58108d;
    }

    static {
        Covode.recordClassIndex(28601);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f58106b;
        int i3 = 0;
        if (this.f58107c) {
            i = 4194304;
        } else {
            i = 0;
        }
        int i4 = i2 ^ i;
        if (this.f58108d) {
            i3 = 8388608;
        }
        return i4 ^ i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24458g)) {
            return false;
        }
        C24458g gVar = (C24458g) obj;
        if (this.f58106b == gVar.f58106b && this.f58107c == gVar.f58107c && this.f58108d == gVar.f58108d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC24459h m46700a(int i, boolean z, boolean z2) {
        return new C24458g(i, z, z2);
    }

    private C24458g(int i, boolean z, boolean z2) {
        this.f58106b = i;
        this.f58107c = z;
        this.f58108d = z2;
    }
}
