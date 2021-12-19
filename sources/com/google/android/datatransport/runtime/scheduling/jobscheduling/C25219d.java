package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
final class C25219d extends AbstractC25223g.AbstractC25225b {

    /* renamed from: a */
    private final long f59712a;

    /* renamed from: b */
    private final long f59713b;

    /* renamed from: c */
    private final Set<AbstractC25223g.EnumC25227c> f59714c;

    static {
        Covode.recordClassIndex(30587);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d$a */
    public static final class C25220a extends AbstractC25223g.AbstractC25225b.AbstractC25226a {

        /* renamed from: a */
        private Long f59715a;

        /* renamed from: b */
        private Long f59716b;

        /* renamed from: c */
        private Set<AbstractC25223g.EnumC25227c> f59717c;

        static {
            Covode.recordClassIndex(30588);
        }

        C25220a() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b.AbstractC25226a
        /* renamed from: a */
        public final AbstractC25223g.AbstractC25225b.AbstractC25226a mo41205a() {
            this.f59716b = 86400000L;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b.AbstractC25226a
        /* renamed from: b */
        public final AbstractC25223g.AbstractC25225b mo41208b() {
            String str = "";
            if (this.f59715a == null) {
                str = str + " delta";
            }
            if (this.f59716b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f59717c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C25219d(this.f59715a.longValue(), this.f59716b.longValue(), this.f59717c, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b.AbstractC25226a
        /* renamed from: a */
        public final AbstractC25223g.AbstractC25225b.AbstractC25226a mo41206a(long j) {
            this.f59715a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b.AbstractC25226a
        /* renamed from: a */
        public final AbstractC25223g.AbstractC25225b.AbstractC25226a mo41207a(Set<AbstractC25223g.EnumC25227c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f59717c = set;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b
    /* renamed from: a */
    public final long mo41199a() {
        return this.f59712a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b
    /* renamed from: b */
    public final long mo41200b() {
        return this.f59713b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC25223g.AbstractC25225b
    /* renamed from: c */
    public final Set<AbstractC25223g.EnumC25227c> mo41201c() {
        return this.f59714c;
    }

    public final int hashCode() {
        long j = this.f59712a;
        long j2 = this.f59713b;
        return this.f59714c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f59712a + ", maxAllowedDelay=" + this.f59713b + ", flags=" + this.f59714c + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25223g.AbstractC25225b) {
            AbstractC25223g.AbstractC25225b bVar = (AbstractC25223g.AbstractC25225b) obj;
            if (this.f59712a == bVar.mo41199a() && this.f59713b == bVar.mo41200b() && this.f59714c.equals(bVar.mo41201c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    private C25219d(long j, long j2, Set<AbstractC25223g.EnumC25227c> set) {
        this.f59712a = j;
        this.f59713b = j2;
        this.f59714c = set;
    }

    /* synthetic */ C25219d(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }
}
