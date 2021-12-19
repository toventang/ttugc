package com.facebook.p1826c.p1827a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.c.a.j */
public class C24031j implements AbstractC24026e {

    /* renamed from: a */
    final String f56892a;

    static {
        Covode.recordClassIndex(28157);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final String mo39543a() {
        return this.f56892a;
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public String toString() {
        return this.f56892a;
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public int hashCode() {
        return this.f56892a.hashCode();
    }

    public C24031j(String str) {
        this.f56892a = (String) C24091i.m45617a(str);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final boolean mo39544a(Uri uri) {
        return this.f56892a.contains(uri.toString());
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24031j) {
            return this.f56892a.equals(((C24031j) obj).f56892a);
        }
        return false;
    }
}
