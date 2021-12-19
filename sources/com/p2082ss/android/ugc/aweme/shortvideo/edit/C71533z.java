package com.p2082ss.android.ugc.aweme.shortvideo.edit;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.z */
public final class C71533z<F, S, T> {

    /* renamed from: a */
    public final F f160318a;

    /* renamed from: b */
    public final S f160319b;

    /* renamed from: c */
    public final T f160320c;

    static {
        Covode.recordClassIndex(84076);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        F f = this.f160318a;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.f160319b;
        if (s == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = s.hashCode();
        }
        int i2 = hashCode ^ hashCode2;
        T t = this.f160320c;
        if (t != null) {
            i = t.hashCode();
        }
        return i2 ^ i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C71533z)) {
            return false;
        }
        C71533z zVar = (C71533z) obj;
        if (!m126439a(zVar.f160318a, this.f160318a) || !m126439a(zVar.f160319b, this.f160319b) || !m126439a(zVar.f160320c, this.f160320c)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m126439a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <A, B, C> C71533z<A, B, C> m126438a(A a, B b, C c) {
        return new C71533z<>(a, b, c);
    }

    private C71533z(F f, S s, T t) {
        this.f160318a = f;
        this.f160319b = s;
        this.f160320c = t;
    }
}
