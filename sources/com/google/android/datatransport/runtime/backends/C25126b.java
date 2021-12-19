package com.google.android.datatransport.runtime.backends;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.backends.AbstractC25132g;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.backends.b */
public final class C25126b extends AbstractC25132g {

    /* renamed from: a */
    private final AbstractC25132g.EnumC25133a f59555a;

    /* renamed from: b */
    private final long f59556b;

    static {
        Covode.recordClassIndex(30492);
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25132g
    /* renamed from: a */
    public final AbstractC25132g.EnumC25133a mo41105a() {
        return this.f59555a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC25132g
    /* renamed from: b */
    public final long mo41106b() {
        return this.f59556b;
    }

    public final int hashCode() {
        long j = this.f59556b;
        return ((this.f59555a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + this.f59555a + ", nextRequestWaitMillis=" + this.f59556b + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25132g) {
            AbstractC25132g gVar = (AbstractC25132g) obj;
            if (!this.f59555a.equals(gVar.mo41105a()) || this.f59556b != gVar.mo41106b()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C25126b(AbstractC25132g.EnumC25133a aVar, long j) {
        Objects.requireNonNull(aVar, "Null status");
        this.f59555a = aVar;
        this.f59556b = j;
    }
}
