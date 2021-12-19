package com.google.android.datatransport.runtime.scheduling.p1929a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d;

/* renamed from: com.google.android.datatransport.runtime.scheduling.a.a */
final class C25173a extends AbstractC25183d {

    /* renamed from: b */
    private final long f59627b;

    /* renamed from: c */
    private final int f59628c;

    /* renamed from: d */
    private final int f59629d;

    /* renamed from: e */
    private final long f59630e;

    static {
        Covode.recordClassIndex(30539);
    }

    /* renamed from: com.google.android.datatransport.runtime.scheduling.a.a$a */
    static final class C25174a extends AbstractC25183d.AbstractC25184a {

        /* renamed from: a */
        private Long f59631a;

        /* renamed from: b */
        private Integer f59632b;

        /* renamed from: c */
        private Integer f59633c;

        /* renamed from: d */
        private Long f59634d;

        static {
            Covode.recordClassIndex(30540);
        }

        C25174a() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d.AbstractC25184a
        /* renamed from: a */
        public final AbstractC25183d.AbstractC25184a mo41157a() {
            this.f59631a = 10485760L;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d.AbstractC25184a
        /* renamed from: b */
        public final AbstractC25183d.AbstractC25184a mo41158b() {
            this.f59632b = 200;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d.AbstractC25184a
        /* renamed from: c */
        public final AbstractC25183d.AbstractC25184a mo41159c() {
            this.f59633c = 10000;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d.AbstractC25184a
        /* renamed from: d */
        public final AbstractC25183d.AbstractC25184a mo41160d() {
            this.f59634d = 604800000L;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d.AbstractC25184a
        /* renamed from: e */
        public final AbstractC25183d mo41161e() {
            String str = "";
            if (this.f59631a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f59632b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f59633c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f59634d == null) {
                str = str + " eventCleanUpAge";
            }
            if (str.isEmpty()) {
                return new C25173a(this.f59631a.longValue(), this.f59632b.intValue(), this.f59633c.intValue(), this.f59634d.longValue(), (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d
    /* renamed from: a */
    public final long mo41150a() {
        return this.f59627b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d
    /* renamed from: b */
    public final int mo41151b() {
        return this.f59628c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d
    /* renamed from: c */
    public final int mo41152c() {
        return this.f59629d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.p1929a.AbstractC25183d
    /* renamed from: d */
    public final long mo41153d() {
        return this.f59630e;
    }

    public final int hashCode() {
        long j = this.f59627b;
        long j2 = this.f59630e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f59628c) * 1000003) ^ this.f59629d) * 1000003);
    }

    public final String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f59627b + ", loadBatchSize=" + this.f59628c + ", criticalSectionEnterTimeoutMs=" + this.f59629d + ", eventCleanUpAge=" + this.f59630e + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25183d) {
            AbstractC25183d dVar = (AbstractC25183d) obj;
            if (this.f59627b == dVar.mo41150a() && this.f59628c == dVar.mo41151b() && this.f59629d == dVar.mo41152c() && this.f59630e == dVar.mo41153d()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private C25173a(long j, int i, int i2, long j2) {
        this.f59627b = j;
        this.f59628c = i;
        this.f59629d = i2;
        this.f59630e = j2;
    }

    /* synthetic */ C25173a(long j, int i, int i2, long j2, byte b) {
        this(j, i, i2, j2);
    }
}
