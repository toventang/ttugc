package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.C25335a;
import com.google.android.gms.common.api.C25335a.AbstractC25339d;
import com.google.android.gms.common.internal.C25560p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.api.internal.b */
public final class C25390b<O extends C25335a.AbstractC25339d> {

    /* renamed from: a */
    public final boolean f60259a;

    /* renamed from: b */
    public final C25335a<O> f60260b;

    /* renamed from: c */
    private final int f60261c;

    /* renamed from: d */
    private final O f60262d;

    static {
        Covode.recordClassIndex(30789);
    }

    public final int hashCode() {
        return this.f60261c;
    }

    public C25390b(C25335a<O> aVar) {
        this.f60259a = true;
        this.f60260b = aVar;
        this.f60261c = System.identityHashCode(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25390b)) {
            return false;
        }
        C25390b bVar = (C25390b) obj;
        if (this.f60259a || bVar.f60259a || !C25560p.m49308a(this.f60260b, bVar.f60260b) || !C25560p.m49308a(this.f60262d, bVar.f60262d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static <O extends C25335a.AbstractC25339d> C25390b<O> m48910a(C25335a<O> aVar, O o) {
        return new C25390b<>(aVar, o);
    }

    private C25390b(C25335a<O> aVar, O o) {
        this.f60260b = aVar;
        this.f60262d = o;
        this.f60261c = Arrays.hashCode(new Object[]{aVar, o});
    }
}
