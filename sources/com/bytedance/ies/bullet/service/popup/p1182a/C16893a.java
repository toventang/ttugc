package com.bytedance.ies.bullet.service.popup.p1182a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.popup.AbstractC16876a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.bullet.service.popup.a.a */
public final class C16893a {

    /* renamed from: m */
    public static final C16894a f40147m = new C16894a((byte) 0);

    /* renamed from: a */
    public final int f40148a;

    /* renamed from: b */
    public final int f40149b;

    /* renamed from: c */
    public final int f40150c;

    /* renamed from: d */
    public final int f40151d;

    /* renamed from: e */
    public final int f40152e;

    /* renamed from: f */
    public final int f40153f;

    /* renamed from: g */
    public final int f40154g;

    /* renamed from: h */
    public final AbstractC16876a.AbstractC16878b f40155h;

    /* renamed from: i */
    public int f40156i;

    /* renamed from: j */
    public final boolean f40157j;

    /* renamed from: k */
    public final boolean f40158k;

    /* renamed from: l */
    public final boolean f40159l;

    static {
        Covode.recordClassIndex(19333);
    }

    public C16893a() {
        this(0, 0, 0, 0, 0, 0, null, 0, false, false, false, 4095);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16893a)) {
            return false;
        }
        C16893a aVar = (C16893a) obj;
        return this.f40148a == aVar.f40148a && this.f40149b == aVar.f40149b && this.f40150c == aVar.f40150c && this.f40151d == aVar.f40151d && this.f40152e == aVar.f40152e && this.f40153f == aVar.f40153f && this.f40154g == aVar.f40154g && C89219l.m154714a(this.f40155h, aVar.f40155h) && this.f40156i == aVar.f40156i && this.f40157j == aVar.f40157j && this.f40158k == aVar.f40158k && this.f40159l == aVar.f40159l;
    }

    public final int hashCode() {
        int i = ((((((((((((this.f40148a * 31) + this.f40149b) * 31) + this.f40150c) * 31) + this.f40151d) * 31) + this.f40152e) * 31) + this.f40153f) * 31) + this.f40154g) * 31;
        AbstractC16876a.AbstractC16878b bVar = this.f40155h;
        int hashCode = (((i + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f40156i) * 31;
        boolean z = this.f40157j;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f40158k;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.f40159l) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "BottomSheetConfig(mode=" + this.f40148a + ", worldWidth=" + this.f40149b + ", worldHeight=" + this.f40150c + ", touchLimit=" + this.f40151d + ", peekWidth=" + this.f40152e + ", peekHeight=" + this.f40153f + ", radius=" + this.f40154g + ", cancelableProvider=" + this.f40155h + ", dragMaxHeight=" + this.f40156i + ", dragByGesture=" + this.f40157j + ", dragFollowGesture=" + this.f40158k + ", dragBack=" + this.f40159l + ")";
    }

    /* renamed from: com.bytedance.ies.bullet.service.popup.a.a$a */
    public static final class C16894a {
        static {
            Covode.recordClassIndex(19334);
        }

        private C16894a() {
        }

        public /* synthetic */ C16894a(byte b) {
            this();
        }
    }

    private C16893a(int i, int i2, int i3, int i4, int i5, int i6, AbstractC16876a.AbstractC16878b bVar, int i7, boolean z, boolean z2, boolean z3) {
        this.f40148a = 0;
        this.f40149b = i;
        this.f40150c = i2;
        this.f40151d = i3;
        this.f40152e = i4;
        this.f40153f = i5;
        this.f40154g = i6;
        this.f40155h = bVar;
        this.f40156i = i7;
        this.f40157j = z;
        this.f40158k = z2;
        this.f40159l = z3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16893a(int r15, int r16, int r17, int r18, int r19, int r20, com.bytedance.ies.bullet.service.popup.AbstractC16876a.AbstractC16878b r21, int r22, boolean r23, boolean r24, boolean r25, int r26) {
        /*
            r14 = this;
            r1 = r26
            r12 = r24
            r7 = r19
            r3 = r15
            r8 = r20
            r4 = r16
            r9 = r21
            r5 = r17
            r10 = r22
            r6 = r18
            r0 = r1 & 2
            r11 = 0
            if (r0 == 0) goto L_0x0019
            r3 = 0
        L_0x0019:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x001e
            r4 = 0
        L_0x001e:
            r0 = r1 & 8
            if (r0 == 0) goto L_0x0023
            r5 = 0
        L_0x0023:
            r0 = r1 & 16
            if (r0 == 0) goto L_0x0028
            r6 = r3
        L_0x0028:
            r0 = r1 & 32
            if (r0 == 0) goto L_0x0032
            float r2 = (float) r4
            r0 = 1060823368(0x3f3ae148, float:0.73)
            float r2 = r2 * r0
            int r7 = (int) r2
        L_0x0032:
            r0 = r1 & 64
            if (r0 == 0) goto L_0x0037
            r8 = -1
        L_0x0037:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003c
            r9 = 0
        L_0x003c:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0041
            r10 = 0
        L_0x0041:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0057
        L_0x0045:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            r13 = 1
            if (r0 == 0) goto L_0x004b
            r12 = 1
        L_0x004b:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0054
        L_0x004f:
            r2 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0054:
            r13 = r25
            goto L_0x004f
        L_0x0057:
            r11 = r23
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.p1182a.C16893a.<init>(int, int, int, int, int, int, com.bytedance.ies.bullet.service.popup.a$b, int, boolean, boolean, boolean, int):void");
    }
}
