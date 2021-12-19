package com.squareup.p2075a;

import com.bytedance.covode.number.Covode;
import com.squareup.p2075a.p2076a.C29206j;

/* renamed from: com.squareup.a.g */
public final class C29223g {

    /* renamed from: a */
    public final String f69246a;

    /* renamed from: b */
    public final String f69247b;

    static {
        Covode.recordClassIndex(35572);
    }

    public final int hashCode() {
        int i;
        String str = this.f69247b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (i + 899) * 31;
        String str2 = this.f69246a;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return this.f69246a + " realm=\"" + this.f69247b + "\"";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C29223g)) {
            return false;
        }
        C29223g gVar = (C29223g) obj;
        if (!C29206j.m58441a(this.f69246a, gVar.f69246a) || !C29206j.m58441a(this.f69247b, gVar.f69247b)) {
            return false;
        }
        return true;
    }

    public C29223g(String str, String str2) {
        this.f69246a = str;
        this.f69247b = str2;
    }
}
