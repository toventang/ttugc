package com.google.firebase.installations.p2017b;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2017b.AbstractC27833d;

/* renamed from: com.google.firebase.installations.b.a */
final class C27828a extends AbstractC27833d {

    /* renamed from: a */
    private final String f65374a;

    /* renamed from: b */
    private final String f65375b;

    /* renamed from: c */
    private final String f65376c;

    /* renamed from: d */
    private final AbstractC27836e f65377d;

    /* renamed from: e */
    private final AbstractC27833d.EnumC27835b f65378e;

    static {
        Covode.recordClassIndex(33417);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.b.a$a */
    public static final class C27829a extends AbstractC27833d.AbstractC27834a {

        /* renamed from: a */
        private String f65379a;

        /* renamed from: b */
        private String f65380b;

        /* renamed from: c */
        private String f65381c;

        /* renamed from: d */
        private AbstractC27836e f65382d;

        /* renamed from: e */
        private AbstractC27833d.EnumC27835b f65383e;

        static {
            Covode.recordClassIndex(33418);
        }

        C27829a() {
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27833d.AbstractC27834a
        /* renamed from: a */
        public final AbstractC27833d mo46524a() {
            return new C27828a(this.f65379a, this.f65380b, this.f65381c, this.f65382d, this.f65383e, (byte) 0);
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27833d.AbstractC27834a
        /* renamed from: a */
        public final AbstractC27833d.AbstractC27834a mo46521a(AbstractC27833d.EnumC27835b bVar) {
            this.f65383e = bVar;
            return this;
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27833d.AbstractC27834a
        /* renamed from: b */
        public final AbstractC27833d.AbstractC27834a mo46525b(String str) {
            this.f65380b = str;
            return this;
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27833d.AbstractC27834a
        /* renamed from: c */
        public final AbstractC27833d.AbstractC27834a mo46526c(String str) {
            this.f65381c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27833d.AbstractC27834a
        /* renamed from: a */
        public final AbstractC27833d.AbstractC27834a mo46522a(AbstractC27836e eVar) {
            this.f65382d = eVar;
            return this;
        }

        @Override // com.google.firebase.installations.p2017b.AbstractC27833d.AbstractC27834a
        /* renamed from: a */
        public final AbstractC27833d.AbstractC27834a mo46523a(String str) {
            this.f65379a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27833d
    /* renamed from: a */
    public final String mo46513a() {
        return this.f65374a;
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27833d
    /* renamed from: b */
    public final String mo46514b() {
        return this.f65375b;
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27833d
    /* renamed from: c */
    public final String mo46515c() {
        return this.f65376c;
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27833d
    /* renamed from: d */
    public final AbstractC27836e mo46516d() {
        return this.f65377d;
    }

    @Override // com.google.firebase.installations.p2017b.AbstractC27833d
    /* renamed from: e */
    public final AbstractC27833d.EnumC27835b mo46517e() {
        return this.f65378e;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f65374a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f65375b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.f65376c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        AbstractC27836e eVar = this.f65377d;
        if (eVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = eVar.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        AbstractC27833d.EnumC27835b bVar = this.f65378e;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f65374a + ", fid=" + this.f65375b + ", refreshToken=" + this.f65376c + ", authToken=" + this.f65377d + ", responseCode=" + this.f65378e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27833d) {
            AbstractC27833d dVar = (AbstractC27833d) obj;
            String str = this.f65374a;
            if (str != null ? str.equals(dVar.mo46513a()) : dVar.mo46513a() == null) {
                String str2 = this.f65375b;
                if (str2 != null ? str2.equals(dVar.mo46514b()) : dVar.mo46514b() == null) {
                    String str3 = this.f65376c;
                    if (str3 != null ? str3.equals(dVar.mo46515c()) : dVar.mo46515c() == null) {
                        AbstractC27836e eVar = this.f65377d;
                        if (eVar != null ? eVar.equals(dVar.mo46516d()) : dVar.mo46516d() == null) {
                            AbstractC27833d.EnumC27835b bVar = this.f65378e;
                            if (bVar != null ? !bVar.equals(dVar.mo46517e()) : dVar.mo46517e() != null) {
                                return false;
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private C27828a(String str, String str2, String str3, AbstractC27836e eVar, AbstractC27833d.EnumC27835b bVar) {
        this.f65374a = str;
        this.f65375b = str2;
        this.f65376c = str3;
        this.f65377d = eVar;
        this.f65378e = bVar;
    }

    /* synthetic */ C27828a(String str, String str2, String str3, AbstractC27836e eVar, AbstractC27833d.EnumC27835b bVar, byte b) {
        this(str, str2, str3, eVar, bVar);
    }
}
