package com.google.android.datatransport.runtime.scheduling.p1929a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25157h;
import com.google.android.datatransport.runtime.AbstractC25162k;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.b */
public final class C25181b extends AbstractC25187g {

    /* renamed from: a */
    private final long f59647a;

    /* renamed from: b */
    private final AbstractC25162k f59648b;

    /* renamed from: c */
    private final AbstractC25157h f59649c;

    static {
        Covode.recordClassIndex(30547);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25187g
    /* renamed from: a */
    public final long mo41168a() {
        return this.f59647a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25187g
    /* renamed from: b */
    public final AbstractC25162k mo41169b() {
        return this.f59648b;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25187g
    /* renamed from: c */
    public final AbstractC25157h mo41170c() {
        return this.f59649c;
    }

    public final int hashCode() {
        long j = this.f59647a;
        return this.f59649c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f59648b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f59647a + ", transportContext=" + this.f59648b + ", event=" + this.f59649c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25187g) {
            AbstractC25187g gVar = (AbstractC25187g) obj;
            if (this.f59647a != gVar.mo41168a() || !this.f59648b.equals(gVar.mo41169b()) || !this.f59649c.equals(gVar.mo41170c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    C25181b(long j, AbstractC25162k kVar, AbstractC25157h hVar) {
        this.f59647a = j;
        Objects.requireNonNull(kVar, "Null transportContext");
        this.f59648b = kVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f59649c = hVar;
    }
}
