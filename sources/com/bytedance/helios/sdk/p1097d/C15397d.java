package com.bytedance.helios.sdk.p1097d;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15306d;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.sdk.C15427e;
import com.bytedance.helios.sdk.C15434f;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.bytedance.helios.sdk.utils.C15481c;
import java.util.Arrays;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.d.d */
public final class C15397d {

    /* renamed from: j */
    public static final AbstractC89244h f37582j = C89250i.m154773a((AbstractC89171a) C15399b.f37593a);

    /* renamed from: k */
    public static final C15398a f37583k = new C15398a((byte) 0);

    /* renamed from: a */
    public final Object f37584a;

    /* renamed from: b */
    public final Object f37585b;

    /* renamed from: c */
    public final Object[] f37586c;

    /* renamed from: d */
    public final int f37587d;

    /* renamed from: e */
    public final long f37588e;

    /* renamed from: f */
    public final boolean f37589f;

    /* renamed from: g */
    public final String f37590g;

    /* renamed from: h */
    public final String f37591h;

    /* renamed from: i */
    public final String f37592i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15397d)) {
            return false;
        }
        C15397d dVar = (C15397d) obj;
        return C89219l.m154714a(this.f37584a, dVar.f37584a) && C89219l.m154714a(this.f37585b, dVar.f37585b) && C89219l.m154714a(this.f37586c, dVar.f37586c) && this.f37587d == dVar.f37587d && this.f37588e == dVar.f37588e && this.f37589f == dVar.f37589f && C89219l.m154714a(this.f37590g, dVar.f37590g) && C89219l.m154714a(this.f37591h, dVar.f37591h) && C89219l.m154714a(this.f37592i, dVar.f37592i);
    }

    public final int hashCode() {
        Object obj = this.f37584a;
        int i = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f37585b;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.f37586c;
        int hashCode3 = objArr != null ? Arrays.hashCode(objArr) : 0;
        long j = this.f37588e;
        int i2 = (((((hashCode2 + hashCode3) * 31) + this.f37587d) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f37589f;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        String str = this.f37590g;
        int hashCode4 = (i6 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f37591h;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f37592i;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: com.bytedance.helios.sdk.d.d$a */
    public static final class C15398a {
        static {
            Covode.recordClassIndex(17650);
        }

        private C15398a() {
        }

        public /* synthetic */ C15398a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.helios.sdk.d.d$b */
    static final class C15399b extends AbstractC89220m implements AbstractC89171a<C89350l> {

        /* renamed from: a */
        public static final C15399b f37593a = new C15399b();

        static {
            Covode.recordClassIndex(17651);
        }

        C15399b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89350l invoke() {
            return new C89350l(".+(?=_java_lang_reflect_Method_invoke)");
        }
    }

    static {
        Covode.recordClassIndex(17649);
    }

    public final String toString() {
        StringBuilder append = new StringBuilder("ActionParam{, id=").append(this.f37587d).append(", calledTime=").append(this.f37588e).append(", reflection=").append(this.f37589f).append(", returnType=");
        String str = this.f37590g;
        if (str == null) {
            str = "";
        }
        return append.append((Object) str).append(", proxyMethodKey=").append(this.f37591h).append("}").toString();
    }

    /* renamed from: a */
    public final C15318n mo25140a(Throwable th) {
        String str;
        Object[] objArr;
        Object obj;
        Object obj2;
        Object[] objArr2;
        String str2;
        C15318n nVar = new C15318n(null, 0, null, null, null, null, null, null, 0, 0, null, null, null, null, 0, null, null, null, null, null, -1);
        String userRegion = HeliosEnvImpl.INSTANCE.getUserRegion();
        C15434f a = C15434f.m28386a();
        C89219l.m154709a((Object) a, "");
        boolean z = !a.mo25170d();
        nVar.f37356b = this.f37587d;
        nVar.f37362h = !z;
        C15434f a2 = C15434f.m28386a();
        C89219l.m154709a((Object) a2, "");
        String e = a2.mo25171e();
        C89219l.m154709a((Object) e, "");
        nVar.mo24855g(e);
        C15434f a3 = C15434f.m28386a();
        C89219l.m154709a((Object) a3, "");
        nVar.f37365k = a3.mo25172f();
        if (z) {
            str = "FORE_SENSITIVE_CALL";
        } else {
            str = "BACK_SENSITIVE_CALL";
        }
        nVar.mo24854f(str);
        C15434f a4 = C15434f.m28386a();
        C89219l.m154709a((Object) a4, "");
        String b = a4.mo25168b();
        C89219l.m154709a((Object) b, "");
        nVar.mo24852e(b);
        nVar.f37366l = this.f37588e;
        nVar.f37372r = this.f37589f;
        nVar.f37374t = 2;
        if (userRegion == null || C89361p.m154870a((CharSequence) userRegion)) {
            userRegion = "null";
        }
        C89219l.m154719c(userRegion, "");
        nVar.f37376v = userRegion;
        C15400e b2 = C15427e.m28380b(this.f37587d);
        if (b2 != null) {
            String str3 = b2.f37598d;
            C89219l.m154709a((Object) str3, "");
            nVar.mo24849b(str3);
            String a5 = C15400e.m28304a();
            C89219l.m154709a((Object) a5, "");
            nVar.mo24858i(a5);
            String str4 = b2.f37599e;
            C89219l.m154709a((Object) str4, "");
            nVar.mo24850c(str4);
            String str5 = b2.f37595a;
            C89219l.m154709a((Object) str5, "");
            nVar.mo24847a(str5);
        }
        nVar.mo24859j(this.f37592i);
        nVar.mo24848a(th);
        Object obj3 = null;
        if (this.f37589f) {
            Map<String, Object> map = nVar.f37368n;
            AbstractC89345j find$default = C89350l.find$default((C89350l) f37582j.getValue(), this.f37591h, 0, 2, null);
            if (find$default == null || (str2 = find$default.mo143720b()) == null) {
                str2 = "unknown";
            }
            map.put("OriginCaller", str2);
        }
        int i = this.f37587d;
        if (i == 102600 && (objArr2 = this.f37586c) != null && objArr2.length != 0) {
            Object obj4 = objArr2[0];
            if (obj4 != null) {
                C15306d dVar = new C15306d(this.f37586c, null, null, null, 126);
                C89219l.m154719c(dVar, "");
                nVar.f37379y = dVar;
                nVar.f37368n.put("permissions", C15481c.m28482a(obj4));
            }
        } else if (i == 100012) {
            Object[] objArr3 = this.f37586c;
            if (objArr3 != null && objArr3.length >= 3) {
                Map<String, Object> map2 = nVar.f37368n;
                Object[] objArr4 = this.f37586c;
                if (objArr4 != null) {
                    obj = objArr4[0];
                } else {
                    obj = null;
                }
                map2.put("origin", String.valueOf(obj));
                Map<String, Object> map3 = nVar.f37368n;
                Object[] objArr5 = this.f37586c;
                if (objArr5 != null) {
                    obj2 = objArr5[1];
                } else {
                    obj2 = null;
                }
                map3.put("allow", String.valueOf(obj2));
                Map<String, Object> map4 = nVar.f37368n;
                Object[] objArr6 = this.f37586c;
                if (objArr6 != null) {
                    obj3 = objArr6[2];
                }
                map4.put("retain", String.valueOf(obj3));
            }
        } else if (i == 100003 && (objArr = this.f37586c) != null && objArr.length >= 2) {
            Map<String, Object> map5 = nVar.f37368n;
            Object[] objArr7 = this.f37586c;
            if (objArr7 != null) {
                obj3 = objArr7[0];
            }
            map5.put("origin", String.valueOf(obj3));
        }
        return nVar;
    }

    public C15397d(Object obj, Object obj2, Object[] objArr, int i, long j, boolean z, String str, String str2, String str3) {
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f37584a = obj;
        this.f37585b = obj2;
        this.f37586c = objArr;
        this.f37587d = i;
        this.f37588e = j;
        this.f37589f = z;
        this.f37590g = str;
        this.f37591h = str2;
        this.f37592i = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C15397d(java.lang.Object r12, java.lang.Object[] r13, int r14, long r15, boolean r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, int r21) {
        /*
            r11 = this;
            r9 = r19
            r1 = r21
            r0 = r1 & 128(0x80, float:1.794E-43)
            java.lang.String r10 = ""
            if (r0 == 0) goto L_0x000b
            r9 = r10
        L_0x000b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x001d
        L_0x000f:
            r1 = 0
            r0 = r11
            r5 = r15
            r4 = r14
            r3 = r13
            r2 = r12
            r8 = r18
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return
        L_0x001d:
            r10 = r20
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.sdk.p1097d.C15397d.<init>(java.lang.Object, java.lang.Object[], int, long, boolean, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
