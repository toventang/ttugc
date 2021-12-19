package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.dn */
public final class C25898dn extends AbstractC25893di<E> {

    /* renamed from: a */
    private final transient int f61038a;

    /* renamed from: b */
    private final transient int f61039b;

    /* renamed from: c */
    private final /* synthetic */ AbstractC25893di f61040c;

    static {
        Covode.recordClassIndex(31313);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: d */
    public final boolean mo42300d() {
        return true;
    }

    public final int size() {
        return this.f61039b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: a */
    public final Object[] mo42294a() {
        return this.f61040c.mo42294a();
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: b */
    public final int mo42297b() {
        return this.f61040c.mo42297b() + this.f61038a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25894dj
    /* renamed from: c */
    public final int mo42298c() {
        return this.f61040c.mo42297b() + this.f61038a + this.f61039b;
    }

    @Override // java.util.List
    public final E get(int i) {
        C25866ci.m50064a(i, this.f61039b);
        return (E) this.f61040c.get(i + this.f61038a);
    }

    @Override // java.util.List, com.google.android.gms.internal.measurement.AbstractC25893di
    public final /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC25893di
    public final AbstractC25893di<E> zza(int i, int i2) {
        C25866ci.m50068a(i, i2, this.f61039b);
        AbstractC25893di diVar = this.f61040c;
        int i3 = this.f61038a;
        return (AbstractC25893di) diVar.subList(i + i3, i2 + i3);
    }

    C25898dn(AbstractC25893di diVar, int i, int i2) {
        this.f61040c = diVar;
        this.f61038a = i;
        this.f61039b = i2;
    }
}
