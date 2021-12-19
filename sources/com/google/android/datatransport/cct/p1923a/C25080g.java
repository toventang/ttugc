package com.google.android.datatransport.cct.p1923a;

import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.cct.p1923a.AbstractC25093o;
import java.util.Arrays;

/* renamed from: com.google.android.datatransport.cct.a.g */
public final class C25080g extends AbstractC25093o {

    /* renamed from: a */
    final long f59477a;

    /* renamed from: b */
    public final int f59478b;

    /* renamed from: c */
    final long f59479c;

    /* renamed from: d */
    public final byte[] f59480d;

    /* renamed from: e */
    public final String f59481e;

    /* renamed from: f */
    final long f59482f;

    /* renamed from: g */
    public final AbstractC25100t f59483g;

    static {
        Covode.recordClassIndex(30445);
    }

    @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o
    /* renamed from: a */
    public final long mo41019a() {
        return this.f59477a;
    }

    @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o
    /* renamed from: b */
    public final long mo41020b() {
        return this.f59479c;
    }

    @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o
    /* renamed from: c */
    public final long mo41021c() {
        return this.f59482f;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f59477a;
        long j2 = this.f59479c;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f59478b) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f59480d)) * 1000003;
        String str = this.f59481e;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j3 = this.f59482f;
        int i2 = (((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC25100t tVar = this.f59483g;
        if (tVar != null) {
            i = tVar.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f59477a + ", eventCode=" + this.f59478b + ", eventUptimeMs=" + this.f59479c + ", sourceExtension=" + Arrays.toString(this.f59480d) + ", sourceExtensionJsonProto3=" + this.f59481e + ", timezoneOffsetSeconds=" + this.f59482f + ", networkConnectionInfo=" + this.f59483g + "}";
    }

    /* renamed from: com.google.android.datatransport.cct.a.g$a */
    public static final class C25081a extends AbstractC25093o.AbstractC25094a {

        /* renamed from: a */
        private Long f59484a;

        /* renamed from: b */
        private Integer f59485b;

        /* renamed from: c */
        private Long f59486c;

        /* renamed from: d */
        private byte[] f59487d;

        /* renamed from: e */
        private String f59488e;

        /* renamed from: f */
        private Long f59489f;

        /* renamed from: g */
        private AbstractC25100t f59490g;

        static {
            Covode.recordClassIndex(30446);
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: a */
        public final AbstractC25093o mo41030a() {
            String str = "";
            if (this.f59484a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f59485b == null) {
                str = str + " eventCode";
            }
            if (this.f59486c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f59489f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C25080g(this.f59484a.longValue(), this.f59485b.intValue(), this.f59486c.longValue(), this.f59487d, this.f59488e, this.f59489f.longValue(), this.f59490g);
            }
            throw new IllegalStateException("Missing required properties:".concat(String.valueOf(str)));
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: a */
        public final AbstractC25093o.AbstractC25094a mo41027a(AbstractC25100t tVar) {
            this.f59490g = tVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: a */
        public final AbstractC25093o.AbstractC25094a mo41025a(int i) {
            this.f59485b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: b */
        public final AbstractC25093o.AbstractC25094a mo41031b(long j) {
            this.f59486c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: c */
        public final AbstractC25093o.AbstractC25094a mo41032c(long j) {
            this.f59489f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: a */
        public final AbstractC25093o.AbstractC25094a mo41026a(long j) {
            this.f59484a = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: a */
        public final AbstractC25093o.AbstractC25094a mo41028a(String str) {
            this.f59488e = str;
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.android.datatransport.cct.p1923a.AbstractC25093o.AbstractC25094a
        /* renamed from: a */
        public final AbstractC25093o.AbstractC25094a mo41029a(byte[] bArr) {
            this.f59487d = bArr;
            return this;
        }
    }

    public final boolean equals(Object obj) {
        String str;
        AbstractC25100t tVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC25093o) {
            AbstractC25093o oVar = (AbstractC25093o) obj;
            if (this.f59477a == oVar.mo41019a()) {
                C25080g gVar = (C25080g) oVar;
                if (this.f59478b != gVar.f59478b || this.f59479c != oVar.mo41020b() || !Arrays.equals(this.f59480d, gVar.f59480d) || ((str = this.f59481e) != null ? !str.equals(gVar.f59481e) : gVar.f59481e != null) || this.f59482f != oVar.mo41021c() || ((tVar = this.f59483g) != null ? !tVar.equals(gVar.f59483g) : gVar.f59483g != null)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* synthetic */ C25080g(long j, int i, long j2, byte[] bArr, String str, long j3, AbstractC25100t tVar) {
        this.f59477a = j;
        this.f59478b = i;
        this.f59479c = j2;
        this.f59480d = bArr;
        this.f59481e = str;
        this.f59482f = j3;
        this.f59483g = tVar;
    }
}
