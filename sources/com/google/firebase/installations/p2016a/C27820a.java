package com.google.firebase.installations.p2016a;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.p2016a.AbstractC27825d;
import com.google.firebase.installations.p2016a.C27823c;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.a.a */
final class C27820a extends AbstractC27825d {

    /* renamed from: b */
    private final String f65351b;

    /* renamed from: c */
    private final C27823c.EnumC27824a f65352c;

    /* renamed from: d */
    private final String f65353d;

    /* renamed from: e */
    private final String f65354e;

    /* renamed from: f */
    private final long f65355f;

    /* renamed from: g */
    private final long f65356g;

    /* renamed from: h */
    private final String f65357h;

    static {
        Covode.recordClassIndex(33409);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.installations.a.a$a */
    public static final class C27821a extends AbstractC27825d.AbstractC27826a {

        /* renamed from: a */
        private String f65358a;

        /* renamed from: b */
        private C27823c.EnumC27824a f65359b;

        /* renamed from: c */
        private String f65360c;

        /* renamed from: d */
        private String f65361d;

        /* renamed from: e */
        private Long f65362e;

        /* renamed from: f */
        private Long f65363f;

        /* renamed from: g */
        private String f65364g;

        static {
            Covode.recordClassIndex(33410);
        }

        C27821a() {
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: a */
        public final AbstractC27825d mo46498a() {
            String str = "";
            if (this.f65359b == null) {
                str = str + " registrationStatus";
            }
            if (this.f65362e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f65363f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C27820a(this.f65358a, this.f65359b, this.f65360c, this.f65361d, this.f65362e.longValue(), this.f65363f.longValue(), this.f65364g, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: a */
        public final AbstractC27825d.AbstractC27826a mo46497a(String str) {
            this.f65358a = str;
            return this;
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: b */
        public final AbstractC27825d.AbstractC27826a mo46500b(String str) {
            this.f65360c = str;
            return this;
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: c */
        public final AbstractC27825d.AbstractC27826a mo46501c(String str) {
            this.f65361d = str;
            return this;
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: d */
        public final AbstractC27825d.AbstractC27826a mo46502d(String str) {
            this.f65364g = str;
            return this;
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: a */
        public final AbstractC27825d.AbstractC27826a mo46495a(long j) {
            this.f65362e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: b */
        public final AbstractC27825d.AbstractC27826a mo46499b(long j) {
            this.f65363f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.p2016a.AbstractC27825d.AbstractC27826a
        /* renamed from: a */
        public final AbstractC27825d.AbstractC27826a mo46496a(C27823c.EnumC27824a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f65359b = aVar;
            return this;
        }

        private C27821a(AbstractC27825d dVar) {
            this.f65358a = dVar.mo46484a();
            this.f65359b = dVar.mo46485b();
            this.f65360c = dVar.mo46486c();
            this.f65361d = dVar.mo46487d();
            this.f65362e = Long.valueOf(dVar.mo46488e());
            this.f65363f = Long.valueOf(dVar.mo46490f());
            this.f65364g = dVar.mo46491g();
        }

        /* synthetic */ C27821a(AbstractC27825d dVar, byte b) {
            this(dVar);
        }
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: a */
    public final String mo46484a() {
        return this.f65351b;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: b */
    public final C27823c.EnumC27824a mo46485b() {
        return this.f65352c;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: c */
    public final String mo46486c() {
        return this.f65353d;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: d */
    public final String mo46487d() {
        return this.f65354e;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: e */
    public final long mo46488e() {
        return this.f65355f;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: f */
    public final long mo46490f() {
        return this.f65356g;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: g */
    public final String mo46491g() {
        return this.f65357h;
    }

    @Override // com.google.firebase.installations.p2016a.AbstractC27825d
    /* renamed from: h */
    public final AbstractC27825d.AbstractC27826a mo46492h() {
        return new C27821a(this, (byte) 0);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f65351b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f65352c.hashCode()) * 1000003;
        String str2 = this.f65353d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.f65354e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f65355f;
        long j2 = this.f65356g;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f65357h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f65351b + ", registrationStatus=" + this.f65352c + ", authToken=" + this.f65353d + ", refreshToken=" + this.f65354e + ", expiresInSecs=" + this.f65355f + ", tokenCreationEpochInSecs=" + this.f65356g + ", fisError=" + this.f65357h + "}";
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27825d) {
            AbstractC27825d dVar = (AbstractC27825d) obj;
            String str4 = this.f65351b;
            if (str4 != null ? str4.equals(dVar.mo46484a()) : dVar.mo46484a() == null) {
                if (!this.f65352c.equals(dVar.mo46485b()) || ((str = this.f65353d) != null ? !str.equals(dVar.mo46486c()) : dVar.mo46486c() != null) || ((str2 = this.f65354e) != null ? !str2.equals(dVar.mo46487d()) : dVar.mo46487d() != null) || this.f65355f != dVar.mo46488e() || this.f65356g != dVar.mo46490f() || ((str3 = this.f65357h) != null ? !str3.equals(dVar.mo46491g()) : dVar.mo46491g() != null)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    private C27820a(String str, C27823c.EnumC27824a aVar, String str2, String str3, long j, long j2, String str4) {
        this.f65351b = str;
        this.f65352c = aVar;
        this.f65353d = str2;
        this.f65354e = str3;
        this.f65355f = j;
        this.f65356g = j2;
        this.f65357h = str4;
    }

    /* synthetic */ C27820a(String str, C27823c.EnumC27824a aVar, String str2, String str3, long j, long j2, String str4, byte b) {
        this(str, aVar, str2, str3, j, j2, str4);
    }
}
