package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.AbstractC25069c;
import com.google.android.datatransport.AbstractC25112e;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.runtime.AbstractC25160j;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.b */
final class C25119b extends AbstractC25160j {

    /* renamed from: a */
    private final AbstractC25162k f59541a;

    /* renamed from: b */
    private final String f59542b;

    /* renamed from: c */
    private final AbstractC25069c<?> f59543c;

    /* renamed from: d */
    private final AbstractC25112e<?, byte[]> f59544d;

    /* renamed from: e */
    private final C25068b f59545e;

    static {
        Covode.recordClassIndex(30484);
    }

    /* renamed from: com.google.android.datatransport.runtime.b$a */
    static final class C25120a extends AbstractC25160j.AbstractC25161a {

        /* renamed from: a */
        private AbstractC25162k f59546a;

        /* renamed from: b */
        private String f59547b;

        /* renamed from: c */
        private AbstractC25069c<?> f59548c;

        /* renamed from: d */
        private AbstractC25112e<?, byte[]> f59549d;

        /* renamed from: e */
        private C25068b f59550e;

        static {
            Covode.recordClassIndex(30485);
        }

        C25120a() {
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25160j.AbstractC25161a
        /* renamed from: a */
        public final AbstractC25160j mo41094a() {
            String str = "";
            if (this.f59546a == null) {
                str = str + " transportContext";
            }
            if (this.f59547b == null) {
                str = str + " transportName";
            }
            if (this.f59548c == null) {
                str = str + " event";
            }
            if (this.f59549d == null) {
                str = str + " transformer";
            }
            if (this.f59550e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C25119b(this.f59546a, this.f59547b, this.f59548c, this.f59549d, this.f59550e, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.AbstractC25160j.AbstractC25161a
        /* renamed from: a */
        public final AbstractC25160j.AbstractC25161a mo41089a(C25068b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f59550e = bVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.AbstractC25160j.AbstractC25161a
        /* renamed from: a */
        public final AbstractC25160j.AbstractC25161a mo41090a(AbstractC25069c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f59548c = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.AbstractC25160j.AbstractC25161a
        /* renamed from: a */
        public final AbstractC25160j.AbstractC25161a mo41091a(AbstractC25112e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f59549d = eVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25160j.AbstractC25161a
        /* renamed from: a */
        public final AbstractC25160j.AbstractC25161a mo41092a(AbstractC25162k kVar) {
            Objects.requireNonNull(kVar, "Null transportContext");
            this.f59546a = kVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25160j.AbstractC25161a
        /* renamed from: a */
        public final AbstractC25160j.AbstractC25161a mo41093a(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f59547b = str;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25160j
    /* renamed from: a */
    public final AbstractC25162k mo41081a() {
        return this.f59541a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25160j
    /* renamed from: b */
    public final String mo41082b() {
        return this.f59542b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC25160j
    /* renamed from: c */
    public final AbstractC25069c<?> mo41083c() {
        return this.f59543c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.AbstractC25160j
    /* renamed from: d */
    public final AbstractC25112e<?, byte[]> mo41084d() {
        return this.f59544d;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25160j
    /* renamed from: e */
    public final C25068b mo41085e() {
        return this.f59545e;
    }

    public final int hashCode() {
        return ((((((((this.f59541a.hashCode() ^ 1000003) * 1000003) ^ this.f59542b.hashCode()) * 1000003) ^ this.f59543c.hashCode()) * 1000003) ^ this.f59544d.hashCode()) * 1000003) ^ this.f59545e.hashCode();
    }

    public final String toString() {
        return "SendRequest{transportContext=" + this.f59541a + ", transportName=" + this.f59542b + ", event=" + this.f59543c + ", transformer=" + this.f59544d + ", encoding=" + this.f59545e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25160j) {
            AbstractC25160j jVar = (AbstractC25160j) obj;
            if (!this.f59541a.equals(jVar.mo41081a()) || !this.f59542b.equals(jVar.mo41082b()) || !this.f59543c.equals(jVar.mo41083c()) || !this.f59544d.equals(jVar.mo41084d()) || !this.f59545e.equals(jVar.mo41085e())) {
                return false;
            }
            return true;
        }
        return false;
    }

    private C25119b(AbstractC25162k kVar, String str, AbstractC25069c<?> cVar, AbstractC25112e<?, byte[]> eVar, C25068b bVar) {
        this.f59541a = kVar;
        this.f59542b = str;
        this.f59543c = cVar;
        this.f59544d = eVar;
        this.f59545e = bVar;
    }

    /* synthetic */ C25119b(AbstractC25162k kVar, String str, AbstractC25069c cVar, AbstractC25112e eVar, C25068b bVar, byte b) {
        this(kVar, str, cVar, eVar, bVar);
    }
}
