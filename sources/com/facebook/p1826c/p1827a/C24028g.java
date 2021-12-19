package com.facebook.p1826c.p1827a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import java.util.List;

/* renamed from: com.facebook.c.a.g */
public final class C24028g implements AbstractC24026e {

    /* renamed from: a */
    public final List<AbstractC24026e> f56889a;

    static {
        Covode.recordClassIndex(28154);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final int hashCode() {
        return this.f56889a.hashCode();
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final String mo39543a() {
        return this.f56889a.get(0).mo39543a();
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final String toString() {
        return "MultiCacheKey:" + this.f56889a.toString();
    }

    public C24028g(List<AbstractC24026e> list) {
        this.f56889a = (List) C24091i.m45617a(list);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final boolean mo39544a(Uri uri) {
        for (int i = 0; i < this.f56889a.size(); i++) {
            if (this.f56889a.get(i).mo39544a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24028g) {
            return this.f56889a.equals(((C24028g) obj).f56889a);
        }
        return false;
    }
}
