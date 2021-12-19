package com.google.android.datatransport;

import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.a */
public final class C25067a<T> extends AbstractC25069c<T> {

    /* renamed from: a */
    private final Integer f59443a = null;

    /* renamed from: b */
    private final T f59444b;

    /* renamed from: c */
    private final EnumC25111d f59445c;

    static {
        Covode.recordClassIndex(30431);
    }

    @Override // com.google.android.datatransport.AbstractC25069c
    /* renamed from: a */
    public final Integer mo40983a() {
        return this.f59443a;
    }

    @Override // com.google.android.datatransport.AbstractC25069c
    /* renamed from: b */
    public final T mo40984b() {
        return this.f59444b;
    }

    @Override // com.google.android.datatransport.AbstractC25069c
    /* renamed from: c */
    public final EnumC25111d mo40985c() {
        return this.f59445c;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f59443a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ this.f59444b.hashCode()) * 1000003) ^ this.f59445c.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f59443a + ", payload=" + ((Object) this.f59444b) + ", priority=" + this.f59445c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25069c) {
            AbstractC25069c cVar = (AbstractC25069c) obj;
            Integer num = this.f59443a;
            if (num != null ? num.equals(cVar.mo40983a()) : cVar.mo40983a() == null) {
                if (!this.f59444b.equals(cVar.mo40984b()) || !this.f59445c.equals(cVar.mo40985c())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    C25067a(T t, EnumC25111d dVar) {
        Objects.requireNonNull(t, "Null payload");
        this.f59444b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.f59445c = dVar;
    }
}
