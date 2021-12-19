package com.p2082ss.android.http.p2146a.p2149b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.AbstractC29938c;
import com.p2082ss.android.http.p2146a.p2151d.C29942b;
import com.p2082ss.android.http.p2146a.p2151d.C29943c;

/* renamed from: com.ss.android.http.a.b.d */
public final class C29934d implements AbstractC29938c, Cloneable {

    /* renamed from: a */
    public final String f71419a;

    /* renamed from: b */
    public final String f71420b;

    static {
        Covode.recordClassIndex(36346);
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29938c
    /* renamed from: a */
    public final String mo52254a() {
        return this.f71419a;
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29938c
    /* renamed from: b */
    public final String mo52255b() {
        return this.f71420b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return C29943c.m60342a(C29943c.m60342a(17, this.f71419a), this.f71420b);
    }

    public final String toString() {
        int length = this.f71419a.length();
        String str = this.f71420b;
        if (str != null) {
            length += str.length() + 1;
        }
        C29942b bVar = new C29942b(length);
        bVar.mo52270a(this.f71419a);
        if (this.f71420b != null) {
            bVar.mo52270a("=");
            bVar.mo52270a(this.f71420b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC29938c) {
            C29934d dVar = (C29934d) obj;
            if (!this.f71419a.equals(dVar.f71419a) || !C29943c.m60343a(this.f71420b, dVar.f71420b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C29934d(String str, String str2) {
        if (str != null) {
            this.f71419a = str;
            this.f71420b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
