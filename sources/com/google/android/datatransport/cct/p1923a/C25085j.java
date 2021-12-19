package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.p1923a.AbstractC25100t;

/* renamed from: com.google.android.datatransport.cct.a.j */
public final class C25085j extends AbstractC25100t {

    /* renamed from: a */
    public final AbstractC25100t.EnumC25103c f59506a;

    /* renamed from: b */
    public final AbstractC25100t.EnumC25102b f59507b;

    static {
        Covode.recordClassIndex(30450);
    }

    /* renamed from: com.google.android.datatransport.cct.a.j$a */
    public static final class C25086a extends AbstractC25100t.AbstractC25101a {

        /* renamed from: a */
        private AbstractC25100t.EnumC25103c f59508a;

        /* renamed from: b */
        private AbstractC25100t.EnumC25102b f59509b;

        static {
            Covode.recordClassIndex(30451);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25100t.AbstractC25101a
        /* renamed from: a */
        public final AbstractC25100t mo41053a() {
            return new C25085j(this.f59508a, this.f59509b);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25100t.AbstractC25101a
        /* renamed from: a */
        public final AbstractC25100t.AbstractC25101a mo41051a(AbstractC25100t.EnumC25102b bVar) {
            this.f59509b = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25100t.AbstractC25101a
        /* renamed from: a */
        public final AbstractC25100t.AbstractC25101a mo41052a(AbstractC25100t.EnumC25103c cVar) {
            this.f59508a = cVar;
            return this;
        }
    }

    public final int hashCode() {
        int hashCode;
        AbstractC25100t.EnumC25103c cVar = this.f59506a;
        int i = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC25100t.EnumC25102b bVar = this.f59507b;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f59506a + ", mobileSubtype=" + this.f59507b + "}";
    }

    public final boolean equals(Object obj) {
        AbstractC25100t.EnumC25103c cVar;
        AbstractC25100t.EnumC25102b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC25100t) || ((cVar = this.f59506a) != null ? !cVar.equals(((C25085j) obj).f59506a) : ((C25085j) obj).f59506a != null) || ((bVar = this.f59507b) != null ? !bVar.equals(((C25085j) obj).f59507b) : ((C25085j) obj).f59507b != null)) {
            return false;
        }
        return true;
    }

    /* synthetic */ C25085j(AbstractC25100t.EnumC25103c cVar, AbstractC25100t.EnumC25102b bVar) {
        this.f59506a = cVar;
        this.f59507b = bVar;
    }
}
