package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.b.a */
public final class C44384a {

    /* renamed from: a */
    public final Object f103498a;

    static {
        Covode.recordClassIndex(52716);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C44384a) && C89219l.m154714a(this.f103498a, ((C44384a) obj).f103498a);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f103498a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ShipToInfo(shipToInfo=" + this.f103498a + ")";
    }

    public /* synthetic */ C44384a() {
        this(null);
    }

    /* renamed from: a */
    public final C44457d mo75409a() {
        Object obj = this.f103498a;
        if (!(obj instanceof C44457d)) {
            obj = null;
        }
        return (C44457d) obj;
    }

    /* renamed from: b */
    public final List<Region> mo75411b() {
        Object obj = this.f103498a;
        if (!(obj instanceof List)) {
            obj = null;
        }
        return (List) obj;
    }

    public C44384a(Object obj) {
        this.f103498a = obj;
    }

    /* renamed from: a */
    public final C89391z mo75410a(AbstractC89172b<? super C44457d, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C44457d a = mo75409a();
        if (a != null) {
            return bVar.invoke(a);
        }
        return null;
    }
}
