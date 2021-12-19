package com.bytedance.apm.p789q;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.q.l */
public final class C12591l<F, S> {

    /* renamed from: a */
    public F f30622a;

    /* renamed from: b */
    public S f30623b;

    static {
        Covode.recordClassIndex(14408);
    }

    public final int hashCode() {
        int hashCode;
        F f = this.f30622a;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.f30623b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f30622a) + " " + ((Object) this.f30623b) + "}";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12591l)) {
            return false;
        }
        C12591l lVar = (C12591l) obj;
        if (!C12589k.m22689a(lVar.f30622a, this.f30622a) || !C12589k.m22689a(lVar.f30623b, this.f30623b)) {
            return false;
        }
        return true;
    }

    public C12591l(F f, S s) {
        this.f30622a = f;
        this.f30623b = s;
    }
}
