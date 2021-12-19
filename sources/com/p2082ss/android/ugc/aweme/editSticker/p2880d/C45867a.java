package com.p2082ss.android.ugc.aweme.editSticker.p2880d;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.d.a */
public final class C45867a {

    /* renamed from: i */
    public static final C45868a f106852i = new C45868a((byte) 0);

    /* renamed from: a */
    public final String f106853a;

    /* renamed from: b */
    public final String f106854b;

    /* renamed from: c */
    public final String f106855c;

    /* renamed from: d */
    public final String f106856d;

    /* renamed from: e */
    public final String f106857e;

    /* renamed from: f */
    public final int f106858f;

    /* renamed from: g */
    public int f106859g;

    /* renamed from: h */
    public int f106860h;

    static {
        Covode.recordClassIndex(54391);
    }

    public C45867a() {
        this(null, null, null, null, null, 0, 0, 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45867a)) {
            return false;
        }
        C45867a aVar = (C45867a) obj;
        return C89219l.m154714a(this.f106853a, aVar.f106853a) && C89219l.m154714a(this.f106854b, aVar.f106854b) && C89219l.m154714a(this.f106855c, aVar.f106855c) && C89219l.m154714a(this.f106856d, aVar.f106856d) && C89219l.m154714a(this.f106857e, aVar.f106857e) && this.f106858f == aVar.f106858f && this.f106859g == aVar.f106859g && this.f106860h == aVar.f106860h;
    }

    public final int hashCode() {
        String str = this.f106853a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f106854b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f106855c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f106856d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f106857e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return ((((((hashCode4 + i) * 31) + this.f106858f) * 31) + this.f106859g) * 31) + this.f106860h;
    }

    public final String toString() {
        return "EffectTextMobParams(textId=" + this.f106853a + ", fontId=" + this.f106854b + ", fontName=" + this.f106855c + ", textColor=" + this.f106856d + ", textStyle=" + this.f106857e + ", isText=" + this.f106858f + ", isPicAdjust=" + this.f106859g + ", isToasted=" + this.f106860h + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.d.a$a */
    public static final class C45868a {
        static {
            Covode.recordClassIndex(54392);
        }

        private C45868a() {
        }

        public /* synthetic */ C45868a(byte b) {
            this();
        }
    }

    private C45867a(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        C89219l.m154721d(str5, "");
        this.f106853a = str;
        this.f106854b = str2;
        this.f106855c = str3;
        this.f106856d = str4;
        this.f106857e = str5;
        this.f106858f = i;
        this.f106859g = i2;
        this.f106860h = i3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C45867a(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, int r17, int r18, int r19) {
        /*
            r10 = this;
            r1 = r19
            r8 = r17
            r7 = r16
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0 = r1 & 1
            java.lang.String r6 = ""
            if (r0 == 0) goto L_0x0011
            r2 = r6
        L_0x0011:
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0016
            r3 = r6
        L_0x0016:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001b
            r4 = r6
        L_0x001b:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0020
            r5 = r6
        L_0x0020:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x003b
        L_0x0024:
            r0 = r1 & 32
            r9 = 0
            if (r0 == 0) goto L_0x002a
            r7 = 0
        L_0x002a:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x002f
            r8 = 0
        L_0x002f:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0038
        L_0x0033:
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0038:
            r9 = r18
            goto L_0x0033
        L_0x003b:
            r6 = r15
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.p2880d.C45867a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int):void");
    }
}
