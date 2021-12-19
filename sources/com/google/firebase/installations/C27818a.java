package com.google.firebase.installations;

import com.bytedance.covode.number.Covode;
import com.google.firebase.installations.AbstractC27850k;
import java.util.Objects;

/* renamed from: com.google.firebase.installations.a */
final class C27818a extends AbstractC27850k {

    /* renamed from: a */
    private final String f65345a;

    /* renamed from: b */
    private final long f65346b;

    /* renamed from: c */
    private final long f65347c;

    static {
        Covode.recordClassIndex(33407);
    }

    /* renamed from: com.google.firebase.installations.a$a */
    static final class C27819a extends AbstractC27850k.AbstractC27851a {

        /* renamed from: a */
        private String f65348a;

        /* renamed from: b */
        private Long f65349b;

        /* renamed from: c */
        private Long f65350c;

        static {
            Covode.recordClassIndex(33408);
        }

        C27819a() {
        }

        @Override // com.google.firebase.installations.AbstractC27850k.AbstractC27851a
        /* renamed from: a */
        public final AbstractC27850k mo46482a() {
            String str = "";
            if (this.f65348a == null) {
                str = str + " token";
            }
            if (this.f65349b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f65350c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C27818a(this.f65348a, this.f65349b.longValue(), this.f65350c.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.firebase.installations.AbstractC27850k.AbstractC27851a
        /* renamed from: a */
        public final AbstractC27850k.AbstractC27851a mo46480a(long j) {
            this.f65349b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC27850k.AbstractC27851a
        /* renamed from: b */
        public final AbstractC27850k.AbstractC27851a mo46483b(long j) {
            this.f65350c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.AbstractC27850k.AbstractC27851a
        /* renamed from: a */
        public final AbstractC27850k.AbstractC27851a mo46481a(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f65348a = str;
            return this;
        }
    }

    @Override // com.google.firebase.installations.AbstractC27850k
    /* renamed from: a */
    public final String mo46474a() {
        return this.f65345a;
    }

    @Override // com.google.firebase.installations.AbstractC27850k
    /* renamed from: b */
    public final long mo46475b() {
        return this.f65346b;
    }

    @Override // com.google.firebase.installations.AbstractC27850k
    /* renamed from: c */
    public final long mo46476c() {
        return this.f65347c;
    }

    public final int hashCode() {
        long j = this.f65346b;
        long j2 = this.f65347c;
        return ((((this.f65345a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f65345a + ", tokenExpirationTimestamp=" + this.f65346b + ", tokenCreationTimestamp=" + this.f65347c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC27850k) {
            AbstractC27850k kVar = (AbstractC27850k) obj;
            if (this.f65345a.equals(kVar.mo46474a()) && this.f65346b == kVar.mo46475b() && this.f65347c == kVar.mo46476c()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private C27818a(String str, long j, long j2) {
        this.f65345a = str;
        this.f65346b = j;
        this.f65347c = j2;
    }

    /* synthetic */ C27818a(String str, long j, long j2, byte b) {
        this(str, j, j2);
    }
}
