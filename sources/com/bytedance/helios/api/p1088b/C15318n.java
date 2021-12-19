package com.bytedance.helios.api.p1088b;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.p1085a.p1086a.C15293f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.api.b.n */
public final class C15318n implements AbstractC15308f {

    /* renamed from: G */
    public static final C15319a f37348G = new C15319a((byte) 0);

    /* renamed from: A */
    public C15302a f37349A;

    /* renamed from: B */
    public C15304b f37350B;

    /* renamed from: C */
    public String f37351C;

    /* renamed from: D */
    public List<? extends Object> f37352D;

    /* renamed from: E */
    public String f37353E;

    /* renamed from: F */
    public Set<String> f37354F;

    /* renamed from: a */
    public String f37355a;

    /* renamed from: b */
    public int f37356b;

    /* renamed from: c */
    public String f37357c;

    /* renamed from: d */
    public String f37358d;

    /* renamed from: e */
    public Throwable f37359e;

    /* renamed from: f */
    public String f37360f;

    /* renamed from: g */
    public String f37361g;

    /* renamed from: h */
    public boolean f37362h;

    /* renamed from: i */
    public String f37363i;

    /* renamed from: j */
    public String f37364j;

    /* renamed from: k */
    public int f37365k;

    /* renamed from: l */
    public long f37366l;

    /* renamed from: m */
    public long f37367m;

    /* renamed from: n */
    public Map<String, Object> f37368n;

    /* renamed from: o */
    public String f37369o;

    /* renamed from: p */
    public String f37370p;

    /* renamed from: q */
    public long f37371q;

    /* renamed from: r */
    public boolean f37372r;

    /* renamed from: s */
    public String f37373s;

    /* renamed from: t */
    public int f37374t;

    /* renamed from: u */
    public Set<String> f37375u;

    /* renamed from: v */
    public String f37376v;

    /* renamed from: w */
    public boolean f37377w;

    /* renamed from: x */
    public boolean f37378x;

    /* renamed from: y */
    public C15306d f37379y;

    /* renamed from: z */
    public C15312i f37380z;

    static {
        Covode.recordClassIndex(17548);
    }

    public C15318n() {
        this(null, 0, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, null, null, null, null, -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15318n)) {
            return false;
        }
        C15318n nVar = (C15318n) obj;
        return C89219l.m154714a(this.f37355a, nVar.f37355a) && this.f37356b == nVar.f37356b && C89219l.m154714a(this.f37357c, nVar.f37357c) && C89219l.m154714a(this.f37358d, nVar.f37358d) && C89219l.m154714a(this.f37359e, nVar.f37359e) && C89219l.m154714a(this.f37360f, nVar.f37360f) && C89219l.m154714a(this.f37361g, nVar.f37361g) && this.f37362h == nVar.f37362h && C89219l.m154714a(this.f37363i, nVar.f37363i) && C89219l.m154714a(this.f37364j, nVar.f37364j) && this.f37365k == nVar.f37365k && this.f37366l == nVar.f37366l && this.f37367m == nVar.f37367m && C89219l.m154714a(this.f37368n, nVar.f37368n) && C89219l.m154714a(this.f37369o, nVar.f37369o) && C89219l.m154714a(this.f37370p, nVar.f37370p) && this.f37371q == nVar.f37371q && this.f37372r == nVar.f37372r && C89219l.m154714a(this.f37373s, nVar.f37373s) && this.f37374t == nVar.f37374t && C89219l.m154714a(this.f37375u, nVar.f37375u) && C89219l.m154714a(this.f37376v, nVar.f37376v) && this.f37377w == nVar.f37377w && this.f37378x == nVar.f37378x && C89219l.m154714a(this.f37379y, nVar.f37379y) && C89219l.m154714a(this.f37380z, nVar.f37380z) && C89219l.m154714a(this.f37349A, nVar.f37349A) && C89219l.m154714a(this.f37350B, nVar.f37350B) && C89219l.m154714a(this.f37351C, nVar.f37351C) && C89219l.m154714a(this.f37352D, nVar.f37352D) && C89219l.m154714a(this.f37353E, nVar.f37353E) && C89219l.m154714a(this.f37354F, nVar.f37354F);
    }

    public final int hashCode() {
        String str = this.f37355a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f37356b) * 31;
        String str2 = this.f37357c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37358d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Throwable th = this.f37359e;
        int hashCode4 = (hashCode3 + (th != null ? th.hashCode() : 0)) * 31;
        String str4 = this.f37360f;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f37361g;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.f37362h;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        String str6 = this.f37363i;
        int hashCode7 = (i6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.f37364j;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        long j = this.f37366l;
        long j2 = this.f37367m;
        int i7 = (((((((hashCode7 + hashCode8) * 31) + this.f37365k) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        Map<String, Object> map = this.f37368n;
        int hashCode9 = (i7 + (map != null ? map.hashCode() : 0)) * 31;
        String str8 = this.f37369o;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.f37370p;
        int hashCode11 = str9 != null ? str9.hashCode() : 0;
        long j3 = this.f37371q;
        int i8 = (((hashCode10 + hashCode11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z2 = this.f37372r;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        String str10 = this.f37373s;
        int hashCode12 = (((i12 + (str10 != null ? str10.hashCode() : 0)) * 31) + this.f37374t) * 31;
        Set<String> set = this.f37375u;
        int hashCode13 = (hashCode12 + (set != null ? set.hashCode() : 0)) * 31;
        String str11 = this.f37376v;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31;
        boolean z3 = this.f37377w;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (hashCode14 + i13) * 31;
        if (!this.f37378x) {
            i2 = 0;
        }
        int i17 = (i16 + i2) * 31;
        C15306d dVar = this.f37379y;
        int hashCode15 = (i17 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        C15312i iVar = this.f37380z;
        int hashCode16 = (hashCode15 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        C15302a aVar = this.f37349A;
        int hashCode17 = (hashCode16 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        C15304b bVar = this.f37350B;
        int hashCode18 = (hashCode17 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        String str12 = this.f37351C;
        int hashCode19 = (hashCode18 + (str12 != null ? str12.hashCode() : 0)) * 31;
        List<? extends Object> list = this.f37352D;
        int hashCode20 = (hashCode19 + (list != null ? list.hashCode() : 0)) * 31;
        String str13 = this.f37353E;
        int hashCode21 = (hashCode20 + (str13 != null ? str13.hashCode() : 0)) * 31;
        Set<String> set2 = this.f37354F;
        if (set2 != null) {
            i = set2.hashCode();
        }
        return hashCode21 + i;
    }

    public final String toString() {
        return "PrivacyEvent(resourceId=" + this.f37355a + ", eventId=" + this.f37356b + ", eventName=" + this.f37357c + ", eventSubType=" + this.f37358d + ", eventCallThrowable=" + this.f37359e + ", eventCallStackStr=" + this.f37360f + ", eventPageStackStr=" + this.f37361g + ", isBackStarted=" + this.f37362h + ", eventTriggerScene=" + this.f37363i + ", eventCurrentPage=" + this.f37364j + ", eventProcessId=" + this.f37365k + ", startedTime=" + this.f37366l + ", hostAppVersionCode=" + this.f37367m + ", startedExtraInfo=" + this.f37368n + ", eventLogType=" + this.f37369o + ", eventType=" + this.f37370p + ", targetObjectHashcode=" + this.f37371q + ", isReflection=" + this.f37372r + ", eventThreadName=" + this.f37373s + ", actionType=" + this.f37374t + ", warningTypes=" + this.f37375u + ", userRegion=" + this.f37376v + ", needUploadALog=" + this.f37377w + ", filterEventExtraInfo=" + this.f37378x + ", controlExtra=" + this.f37379y + ", frequencyExtra=" + this.f37380z + ", anchorExtra=" + this.f37349A + ", closureExtra=" + this.f37350B + ", crpCallingType=" + this.f37351C + ", crpCallingEvents=" + this.f37352D + ", permissionType=" + this.f37353E + ", monitorScene=" + this.f37354F + ")";
    }

    /* renamed from: com.bytedance.helios.api.b.n$a */
    public static final class C15319a {
        static {
            Covode.recordClassIndex(17549);
        }

        private C15319a() {
        }

        public /* synthetic */ C15319a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24847a(String str) {
        C89219l.m154719c(str, "");
        this.f37355a = str;
    }

    /* renamed from: b */
    public final void mo24849b(String str) {
        C89219l.m154719c(str, "");
        this.f37357c = str;
    }

    /* renamed from: c */
    public final void mo24850c(String str) {
        C89219l.m154719c(str, "");
        this.f37358d = str;
    }

    /* renamed from: d */
    public final void mo24851d(String str) {
        C89219l.m154719c(str, "");
        this.f37360f = str;
    }

    /* renamed from: e */
    public final void mo24852e(String str) {
        C89219l.m154719c(str, "");
        this.f37361g = str;
    }

    /* renamed from: f */
    public final void mo24854f(String str) {
        C89219l.m154719c(str, "");
        this.f37363i = str;
    }

    /* renamed from: g */
    public final void mo24855g(String str) {
        C89219l.m154719c(str, "");
        this.f37364j = str;
    }

    /* renamed from: h */
    public final void mo24856h(String str) {
        C89219l.m154719c(str, "");
        this.f37369o = str;
    }

    /* renamed from: i */
    public final void mo24858i(String str) {
        C89219l.m154719c(str, "");
        this.f37370p = str;
    }

    /* renamed from: j */
    public final void mo24859j(String str) {
        C89219l.m154719c(str, "");
        this.f37373s = str;
    }

    /* renamed from: k */
    public final void mo24860k(String str) {
        C89219l.m154719c(str, "");
        this.f37353E = str;
    }

    /* renamed from: a */
    public final void mo24848a(Throwable th) {
        if (th != null) {
            this.f37360f = C15293f.m28200a(th);
            this.f37359e = th;
        }
    }

    private C15318n(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, int i2, long j, Map<String, Object> map, String str8, String str9, String str10, int i3, Set<String> set, String str11, C15306d dVar, String str12, Set<String> set2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        C89219l.m154719c(str4, "");
        C89219l.m154719c(str5, "");
        C89219l.m154719c(str6, "");
        C89219l.m154719c(str7, "");
        C89219l.m154719c(map, "");
        C89219l.m154719c(str8, "");
        C89219l.m154719c(str9, "");
        C89219l.m154719c(str10, "");
        C89219l.m154719c(set, "");
        C89219l.m154719c(str11, "");
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(str12, "");
        C89219l.m154719c(set2, "");
        this.f37355a = str;
        this.f37356b = i;
        this.f37357c = str2;
        this.f37358d = str3;
        this.f37359e = null;
        this.f37360f = str4;
        this.f37361g = str5;
        this.f37362h = false;
        this.f37363i = str6;
        this.f37364j = str7;
        this.f37365k = i2;
        this.f37366l = j;
        this.f37367m = 0;
        this.f37368n = map;
        this.f37369o = str8;
        this.f37370p = str9;
        this.f37371q = 0;
        this.f37372r = false;
        this.f37373s = str10;
        this.f37374t = i3;
        this.f37375u = set;
        this.f37376v = str11;
        this.f37377w = false;
        this.f37378x = false;
        this.f37379y = dVar;
        this.f37380z = null;
        this.f37349A = null;
        this.f37350B = null;
        this.f37351C = null;
        this.f37352D = null;
        this.f37353E = str12;
        this.f37354F = set2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15318n(java.lang.String r30, int r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, int r38, long r39, java.util.Map r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, int r45, java.util.Set r46, java.lang.String r47, com.bytedance.helios.api.p1088b.C15306d r48, java.lang.String r49, java.util.Set r50, int r51) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.p1088b.C15318n.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, long, java.util.Map, java.lang.String, java.lang.String, java.lang.String, int, java.util.Set, java.lang.String, com.bytedance.helios.api.b.d, java.lang.String, java.util.Set, int):void");
    }
}
