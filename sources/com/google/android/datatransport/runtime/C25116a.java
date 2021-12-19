package com.google.android.datatransport.runtime;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.AbstractC25157h;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.a */
final class C25116a extends AbstractC25157h {

    /* renamed from: a */
    private final String f59529a;

    /* renamed from: b */
    private final Integer f59530b;

    /* renamed from: c */
    private final C25156g f59531c;

    /* renamed from: d */
    private final long f59532d;

    /* renamed from: e */
    private final long f59533e;

    /* renamed from: f */
    private final Map<String, String> f59534f;

    static {
        Covode.recordClassIndex(30481);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.datatransport.runtime.a$a */
    public static final class C25117a extends AbstractC25157h.AbstractC25158a {

        /* renamed from: a */
        Map<String, String> f59535a;

        /* renamed from: b */
        private String f59536b;

        /* renamed from: c */
        private Integer f59537c;

        /* renamed from: d */
        private C25156g f59538d;

        /* renamed from: e */
        private Long f59539e;

        /* renamed from: f */
        private Long f59540f;

        static {
            Covode.recordClassIndex(30482);
        }

        C25117a() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: a */
        public final Map<String, String> mo41078a() {
            Map<String, String> map = this.f59535a;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: b */
        public final AbstractC25157h mo41080b() {
            String str = "";
            if (this.f59536b == null) {
                str = str + " transportName";
            }
            if (this.f59538d == null) {
                str = str + " encodedPayload";
            }
            if (this.f59539e == null) {
                str = str + " eventMillis";
            }
            if (this.f59540f == null) {
                str = str + " uptimeMillis";
            }
            if (this.f59535a == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C25116a(this.f59536b, this.f59537c, this.f59538d, this.f59539e.longValue(), this.f59540f.longValue(), this.f59535a, (byte) 0);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: a */
        public final AbstractC25157h.AbstractC25158a mo41075a(Integer num) {
            this.f59537c = num;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: a */
        public final AbstractC25157h.AbstractC25158a mo41073a(long j) {
            this.f59539e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: b */
        public final AbstractC25157h.AbstractC25158a mo41079b(long j) {
            this.f59540f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: a */
        public final AbstractC25157h.AbstractC25158a mo41074a(C25156g gVar) {
            Objects.requireNonNull(gVar, "Null encodedPayload");
            this.f59538d = gVar;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: a */
        public final AbstractC25157h.AbstractC25158a mo41076a(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f59536b = str;
            return this;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.datatransport.runtime.AbstractC25157h.AbstractC25158a
        /* renamed from: a */
        public final AbstractC25157h.AbstractC25158a mo41077a(Map<String, String> map) {
            this.f59535a = map;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25157h
    /* renamed from: a */
    public final String mo41064a() {
        return this.f59529a;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25157h
    /* renamed from: b */
    public final Integer mo41065b() {
        return this.f59530b;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25157h
    /* renamed from: c */
    public final C25156g mo41066c() {
        return this.f59531c;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25157h
    /* renamed from: d */
    public final long mo41067d() {
        return this.f59532d;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25157h
    /* renamed from: e */
    public final long mo41068e() {
        return this.f59533e;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.datatransport.runtime.AbstractC25157h
    /* renamed from: f */
    public final Map<String, String> mo41070f() {
        return this.f59534f;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f59529a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f59530b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j = this.f59532d;
        long j2 = this.f59533e;
        return ((((((((hashCode2 ^ hashCode) * 1000003) ^ this.f59531c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f59534f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f59529a + ", code=" + this.f59530b + ", encodedPayload=" + this.f59531c + ", eventMillis=" + this.f59532d + ", uptimeMillis=" + this.f59533e + ", autoMetadata=" + this.f59534f + "}";
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25157h) {
            AbstractC25157h hVar = (AbstractC25157h) obj;
            if (!this.f59529a.equals(hVar.mo41064a()) || ((num = this.f59530b) != null ? !num.equals(hVar.mo41065b()) : hVar.mo41065b() != null) || !this.f59531c.equals(hVar.mo41066c()) || this.f59532d != hVar.mo41067d() || this.f59533e != hVar.mo41068e() || !this.f59534f.equals(hVar.mo41070f())) {
                return false;
            }
            return true;
        }
        return false;
    }

    private C25116a(String str, Integer num, C25156g gVar, long j, long j2, Map<String, String> map) {
        this.f59529a = str;
        this.f59530b = num;
        this.f59531c = gVar;
        this.f59532d = j;
        this.f59533e = j2;
        this.f59534f = map;
    }

    /* synthetic */ C25116a(String str, Integer num, C25156g gVar, long j, long j2, Map map, byte b) {
        this(str, num, gVar, j, j2, map);
    }
}
