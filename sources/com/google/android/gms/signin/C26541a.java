package com.google.android.gms.signin;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.AbstractC25350d;
import com.google.android.gms.common.internal.C25560p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.signin.a */
public final class C26541a implements AbstractC25350d {

    /* renamed from: a */
    public static final C26541a f62625a = new C26541a();

    /* renamed from: b */
    public final boolean f62626b;

    /* renamed from: c */
    public final boolean f62627c;

    /* renamed from: d */
    public final String f62628d;

    /* renamed from: e */
    public final boolean f62629e;

    /* renamed from: f */
    public final String f62630f;

    /* renamed from: g */
    public final String f62631g;

    /* renamed from: h */
    public final boolean f62632h;

    /* renamed from: i */
    public final Long f62633i;

    /* renamed from: j */
    public final Long f62634j;

    private C26541a() {
    }

    static {
        Covode.recordClassIndex(31969);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f62626b), Boolean.valueOf(this.f62627c), this.f62628d, Boolean.valueOf(this.f62629e), Boolean.valueOf(this.f62632h), this.f62630f, this.f62631g, this.f62633i, this.f62634j});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C26541a)) {
            return false;
        }
        C26541a aVar = (C26541a) obj;
        if (this.f62626b != aVar.f62626b || this.f62627c != aVar.f62627c || !C25560p.m49308a(this.f62628d, aVar.f62628d) || this.f62629e != aVar.f62629e || this.f62632h != aVar.f62632h || !C25560p.m49308a(this.f62630f, aVar.f62630f) || !C25560p.m49308a(this.f62631g, aVar.f62631g) || !C25560p.m49308a(this.f62633i, aVar.f62633i) || !C25560p.m49308a(this.f62634j, aVar.f62634j)) {
            return false;
        }
        return true;
    }
}
