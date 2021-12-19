package com.google.firebase.installations.p2017b;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2017b.AbstractC27836e;

/* renamed from: com.google.firebase.installations.b.b */
final class C27830b extends AbstractC27836e {

    /* renamed from: a */
    private final String f65384a;

    /* renamed from: b */
    private final long f65385b;

    /* renamed from: c */
    private final AbstractC27836e.EnumC27838b f65386c;

    static {
        Covode.recordClassIndex(33419);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.b.b$a */
    public static final class C27831a extends AbstractC27836e.AbstractC27837a {

        /* renamed from: a */
        private String f65387a;

        /* renamed from: b */
        private Long f65388b;

        /* renamed from: c */
        private AbstractC27836e.EnumC27838b f65389c;

        static {
            Covode.recordClassIndex(33420);
        }

        C27831a() {
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27836e.AbstractC27837a
        /* renamed from: a */
        public final AbstractC27836e mo46536a() {
            String str = "";
            if (this.f65388b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C27830b(this.f65387a, this.f65388b.longValue(), this.f65389c, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27836e.AbstractC27837a
        /* renamed from: a */
        public final AbstractC27836e.AbstractC27837a mo46534a(AbstractC27836e.EnumC27838b bVar) {
            this.f65389c = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27836e.AbstractC27837a
        /* renamed from: a */
        public final AbstractC27836e.AbstractC27837a mo46533a(long j) {
            this.f65388b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27836e.AbstractC27837a
        /* renamed from: a */
        public final AbstractC27836e.AbstractC27837a mo46535a(String str) {
            this.f65387a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27836e
    /* renamed from: a */
    public final String mo46527a() {
        return this.f65384a;
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27836e
    /* renamed from: b */
    public final long mo46528b() {
        return this.f65385b;
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27836e
    /* renamed from: c */
    public final AbstractC27836e.EnumC27838b mo46529c() {
        return this.f65386c;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f65384a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.f65385b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        AbstractC27836e.EnumC27838b bVar = this.f65386c;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f65384a + ", tokenExpirationTimestamp=" + this.f65385b + ", responseCode=" + this.f65386c + "}";
    }

    public final boolean equals(Object obj) {
        AbstractC27836e.EnumC27838b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27836e) {
            AbstractC27836e eVar = (AbstractC27836e) obj;
            String str = this.f65384a;
            if (str != null ? str.equals(eVar.mo46527a()) : eVar.mo46527a() == null) {
                if (this.f65385b != eVar.mo46528b() || ((bVar = this.f65386c) != null ? !bVar.equals(eVar.mo46529c()) : eVar.mo46529c() != null)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private C27830b(String str, long j, AbstractC27836e.EnumC27838b bVar) {
        this.f65384a = str;
        this.f65385b = j;
        this.f65386c = bVar;
    }

    /* synthetic */ C27830b(String str, long j, AbstractC27836e.EnumC27838b bVar, byte b) {
        this(str, j, bVar);
    }
}
