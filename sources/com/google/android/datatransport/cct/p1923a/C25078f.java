package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.p1923a.AbstractC25089m;

/* renamed from: com.google.android.datatransport.cct.a.f */
public final class C25078f extends AbstractC25089m {

    /* renamed from: a */
    public final AbstractC25089m.EnumC25091b f59473a;

    /* renamed from: b */
    public final AbstractC25071a f59474b;

    static {
        Covode.recordClassIndex(30443);
    }

    /* renamed from: com.google.android.datatransport.cct.a.f$a */
    public static final class C25079a extends AbstractC25089m.AbstractC25090a {

        /* renamed from: a */
        private AbstractC25089m.EnumC25091b f59475a;

        /* renamed from: b */
        private AbstractC25071a f59476b;

        static {
            Covode.recordClassIndex(30444);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25089m.AbstractC25090a
        /* renamed from: a */
        public final AbstractC25089m mo41018a() {
            return new C25078f(this.f59475a, this.f59476b);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25089m.AbstractC25090a
        /* renamed from: a */
        public final AbstractC25089m.AbstractC25090a mo41016a(AbstractC25071a aVar) {
            this.f59476b = aVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25089m.AbstractC25090a
        /* renamed from: a */
        public final AbstractC25089m.AbstractC25090a mo41017a(AbstractC25089m.EnumC25091b bVar) {
            this.f59475a = bVar;
            return this;
        }
    }

    public final int hashCode() {
        int hashCode;
        AbstractC25089m.EnumC25091b bVar = this.f59473a;
        int i = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC25071a aVar = this.f59474b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f59473a + ", androidClientInfo=" + this.f59474b + "}";
    }

    public final boolean equals(Object obj) {
        AbstractC25089m.EnumC25091b bVar;
        AbstractC25071a aVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC25089m) || ((bVar = this.f59473a) != null ? !bVar.equals(((C25078f) obj).f59473a) : ((C25078f) obj).f59473a != null) || ((aVar = this.f59474b) != null ? !aVar.equals(((C25078f) obj).f59474b) : ((C25078f) obj).f59474b != null)) {
            return false;
        }
        return true;
    }

    /* synthetic */ C25078f(AbstractC25089m.EnumC25091b bVar, AbstractC25071a aVar) {
        this.f59473a = bVar;
        this.f59474b = aVar;
    }
}
