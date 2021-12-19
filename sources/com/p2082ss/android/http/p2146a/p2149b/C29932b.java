package com.p2082ss.android.http.p2146a.p2149b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.AbstractC29930b;
import com.p2082ss.android.http.p2146a.AbstractC29938c;
import com.p2082ss.android.http.p2146a.p2151d.C29942b;
import com.p2082ss.android.http.p2146a.p2151d.C29943c;

/* renamed from: com.ss.android.http.a.b.b */
public final class C29932b implements AbstractC29930b, Cloneable {

    /* renamed from: a */
    private final String f71414a;

    /* renamed from: b */
    private final String f71415b;

    /* renamed from: c */
    private final AbstractC29938c[] f71416c;

    static {
        Covode.recordClassIndex(36344);
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29930b
    /* renamed from: a */
    public final String mo52244a() {
        return this.f71414a;
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29930b
    /* renamed from: b */
    public final String mo52245b() {
        return this.f71415b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29930b
    /* renamed from: c */
    public final AbstractC29938c[] mo52246c() {
        return (AbstractC29938c[]) this.f71416c.clone();
    }

    public final int hashCode() {
        int a = C29943c.m60342a(C29943c.m60342a(17, this.f71414a), this.f71415b);
        int i = 0;
        while (true) {
            AbstractC29938c[] cVarArr = this.f71416c;
            if (i >= cVarArr.length) {
                return a;
            }
            a = C29943c.m60342a(a, cVarArr[i]);
            i++;
        }
    }

    public final String toString() {
        C29942b bVar = new C29942b(64);
        bVar.mo52270a(this.f71414a);
        if (this.f71415b != null) {
            bVar.mo52270a("=");
            bVar.mo52270a(this.f71415b);
        }
        for (int i = 0; i < this.f71416c.length; i++) {
            bVar.mo52270a("; ");
            bVar.mo52270a(String.valueOf(this.f71416c[i]));
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
        if (obj instanceof AbstractC29930b) {
            C29932b bVar = (C29932b) obj;
            if (this.f71414a.equals(bVar.f71414a) && C29943c.m60343a(this.f71415b, bVar.f71415b)) {
                AbstractC29938c[] cVarArr = this.f71416c;
                AbstractC29938c[] cVarArr2 = bVar.f71416c;
                if (cVarArr == null) {
                    if (cVarArr2 == null) {
                        return true;
                    }
                } else if (cVarArr2 != null && cVarArr.length == cVarArr2.length) {
                    for (int i = 0; i < cVarArr.length; i++) {
                        if (C29943c.m60343a(cVarArr[i], cVarArr2[i])) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public C29932b(String str, String str2, AbstractC29938c[] cVarArr) {
        if (str != null) {
            this.f71414a = str;
            this.f71415b = str2;
            if (cVarArr != null) {
                this.f71416c = cVarArr;
            } else {
                this.f71416c = new AbstractC29938c[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
