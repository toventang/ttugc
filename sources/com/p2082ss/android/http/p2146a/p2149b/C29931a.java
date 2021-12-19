package com.p2082ss.android.http.p2146a.p2149b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.AbstractC29926a;
import com.p2082ss.android.http.p2146a.AbstractC29930b;
import com.p2082ss.android.http.p2146a.p2151d.C29942b;

/* renamed from: com.ss.android.http.a.b.a */
public final class C29931a implements AbstractC29926a, Cloneable {

    /* renamed from: a */
    private final String f71412a;

    /* renamed from: b */
    private final String f71413b;

    static {
        Covode.recordClassIndex(36343);
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29926a
    /* renamed from: a */
    public final String mo52240a() {
        return this.f71412a;
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29926a
    /* renamed from: b */
    public final String mo52241b() {
        return this.f71413b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    @Override // com.p2082ss.android.http.p2146a.AbstractC29926a
    /* renamed from: c */
    public final AbstractC29930b[] mo52242c() {
        String str = this.f71413b;
        if (str == null) {
            return new AbstractC29930b[0];
        }
        C29933c cVar = C29933c.f71417a;
        C29942b bVar = new C29942b(str.length());
        bVar.mo52270a(str);
        return cVar.mo52253a(bVar, new C29937g(str.length()));
    }

    public final String toString() {
        C29942b bVar = new C29942b(64);
        String a = mo52240a();
        String b = mo52241b();
        int length = a.length() + 2;
        if (b != null) {
            length += b.length();
        }
        if (length > bVar.f71427a.length - bVar.f71428b) {
            bVar.mo52269a(bVar.f71428b + length);
        }
        bVar.mo52270a(a);
        bVar.mo52270a(": ");
        if (b != null) {
            bVar.mo52270a(b);
        }
        return bVar.toString();
    }

    public C29931a(String str, String str2) {
        if (str != null) {
            this.f71412a = str;
            this.f71413b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
