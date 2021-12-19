package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.bc */
public final class C25833bc extends AbstractC25854bx {

    /* renamed from: a */
    private final Context f60954a;

    /* renamed from: b */
    private final AbstractC25871cn<AbstractC25867cj<C25841bk>> f60955b;

    static {
        Covode.recordClassIndex(31248);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25854bx
    /* renamed from: a */
    public final Context mo42190a() {
        return this.f60954a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC25854bx
    /* renamed from: b */
    public final AbstractC25871cn<AbstractC25867cj<C25841bk>> mo42191b() {
        return this.f60955b;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f60954a.hashCode() ^ 1000003) * 1000003;
        AbstractC25871cn<AbstractC25867cj<C25841bk>> cnVar = this.f60955b;
        if (cnVar == null) {
            hashCode = 0;
        } else {
            hashCode = cnVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f60954a);
        String valueOf2 = String.valueOf(this.f60955b);
        return new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length()).append("FlagsContext{context=").append(valueOf).append(", hermeticFileOverrides=").append(valueOf2).append("}").toString();
    }

    public final boolean equals(Object obj) {
        AbstractC25871cn<AbstractC25867cj<C25841bk>> cnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25854bx) {
            AbstractC25854bx bxVar = (AbstractC25854bx) obj;
            if (!this.f60954a.equals(bxVar.mo42190a()) || ((cnVar = this.f60955b) != null ? !cnVar.equals(bxVar.mo42191b()) : bxVar.mo42191b() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C25833bc(Context context, AbstractC25871cn<AbstractC25867cj<C25841bk>> cnVar) {
        Objects.requireNonNull(context, "Null context");
        this.f60954a = context;
        this.f60955b = cnVar;
    }
}
