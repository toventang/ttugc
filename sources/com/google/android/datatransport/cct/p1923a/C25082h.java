package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.p1923a.AbstractC25096q;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.a.h */
public final class C25082h extends AbstractC25096q {

    /* renamed from: a */
    public final long f59491a;

    /* renamed from: b */
    public final long f59492b;

    /* renamed from: c */
    public final AbstractC25089m f59493c;

    /* renamed from: d */
    public final int f59494d;

    /* renamed from: e */
    public final String f59495e;

    /* renamed from: f */
    public final List<AbstractC25093o> f59496f;

    /* renamed from: g */
    private final EnumC25073b f59497g;

    static {
        Covode.recordClassIndex(30447);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        long j = this.f59491a;
        long j2 = this.f59492b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        AbstractC25089m mVar = this.f59493c;
        int i2 = 0;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int i3 = (((i ^ hashCode) * 1000003) ^ this.f59494d) * 1000003;
        String str = this.f59495e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        List<AbstractC25093o> list = this.f59496f;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        EnumC25073b bVar = this.f59497g;
        if (bVar != null) {
            i2 = bVar.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f59491a + ", requestUptimeMs=" + this.f59492b + ", clientInfo=" + this.f59493c + ", logSource=" + this.f59494d + ", logSourceName=" + this.f59495e + ", logEvents=" + this.f59496f + ", qosTier=" + this.f59497g + "}";
    }

    /* renamed from: com.google.android.datatransport.cct.a.h$a */
    public static final class C25083a extends AbstractC25096q.AbstractC25097a {

        /* renamed from: a */
        private Long f59498a;

        /* renamed from: b */
        private Long f59499b;

        /* renamed from: c */
        private AbstractC25089m f59500c;

        /* renamed from: d */
        private Integer f59501d;

        /* renamed from: e */
        private String f59502e;

        /* renamed from: f */
        private List<AbstractC25093o> f59503f;

        /* renamed from: g */
        private EnumC25073b f59504g;

        static {
            Covode.recordClassIndex(30448);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q mo41042a() {
            String str = "";
            if (this.f59498a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f59499b == null) {
                str = str + " requestUptimeMs";
            }
            if (this.f59501d == null) {
                str = str + " logSource";
            }
            if (str.isEmpty()) {
                return new C25082h(this.f59498a.longValue(), this.f59499b.longValue(), this.f59500c, this.f59501d.intValue(), this.f59502e, this.f59503f, this.f59504g);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q.AbstractC25097a mo41038a(EnumC25073b bVar) {
            this.f59504g = bVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q.AbstractC25097a mo41036a(int i) {
            this.f59501d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: b */
        public final AbstractC25096q.AbstractC25097a mo41043b(long j) {
            this.f59499b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q.AbstractC25097a mo41037a(long j) {
            this.f59498a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q.AbstractC25097a mo41039a(AbstractC25089m mVar) {
            this.f59500c = mVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q.AbstractC25097a mo41040a(String str) {
            this.f59502e = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25096q.AbstractC25097a
        /* renamed from: a */
        public final AbstractC25096q.AbstractC25097a mo41041a(List<AbstractC25093o> list) {
            this.f59503f = list;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        AbstractC25089m mVar;
        String str;
        List<AbstractC25093o> list;
        EnumC25073b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25096q) {
            C25082h hVar = (C25082h) ((AbstractC25096q) obj);
            if (this.f59491a != hVar.f59491a || this.f59492b != hVar.f59492b || ((mVar = this.f59493c) != null ? !mVar.equals(hVar.f59493c) : hVar.f59493c != null) || this.f59494d != hVar.f59494d || ((str = this.f59495e) != null ? !str.equals(hVar.f59495e) : hVar.f59495e != null) || ((list = this.f59496f) != null ? !list.equals(hVar.f59496f) : hVar.f59496f != null) || ((bVar = this.f59497g) != null ? !bVar.equals(hVar.f59497g) : hVar.f59497g != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* synthetic */ C25082h(long j, long j2, AbstractC25089m mVar, int i, String str, List list, EnumC25073b bVar) {
        this.f59491a = j;
        this.f59492b = j2;
        this.f59493c = mVar;
        this.f59494d = i;
        this.f59495e = str;
        this.f59496f = list;
        this.f59497g = bVar;
    }
}
