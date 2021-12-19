package com.p2082ss.android.ugc.aweme.mvtheme;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtheme.a */
public final class C61285a implements Serializable {
    @AbstractC27891c(mo46611a = "beat_mv_bit_value")

    /* renamed from: a */
    private int[] f139181a;
    @AbstractC27891c(mo46611a = "beat_mv_bit_time")

    /* renamed from: b */
    private float[] f139182b;
    @AbstractC27891c(mo46611a = "beat_mv_trim_in")

    /* renamed from: c */
    private final int f139183c;
    @AbstractC27891c(mo46611a = "beat_mv_trim_out")

    /* renamed from: d */
    private final int f139184d;
    @AbstractC27891c(mo46611a = "beat_mv_dst_in")

    /* renamed from: e */
    private final int f139185e;
    @AbstractC27891c(mo46611a = "beat_mv_dst_out")

    /* renamed from: f */
    private final int f139186f;
    @AbstractC27891c(mo46611a = "beat_mv_music_path")

    /* renamed from: g */
    private final String f139187g;
    @AbstractC27891c(mo46611a = "beat_mv_music_key")

    /* renamed from: h */
    private String f139188h;

    static {
        Covode.recordClassIndex(71904);
    }

    public static /* synthetic */ C61285a copy$default(C61285a aVar, int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iArr = aVar.f139181a;
        }
        if ((i5 & 2) != 0) {
            fArr = aVar.f139182b;
        }
        if ((i5 & 4) != 0) {
            i = aVar.f139183c;
        }
        if ((i5 & 8) != 0) {
            i2 = aVar.f139184d;
        }
        if ((i5 & 16) != 0) {
            i3 = aVar.f139185e;
        }
        if ((i5 & 32) != 0) {
            i4 = aVar.f139186f;
        }
        if ((i5 & 64) != 0) {
            str = aVar.f139187g;
        }
        if ((i5 & 128) != 0) {
            str2 = aVar.f139188h;
        }
        return aVar.copy(iArr, fArr, i, i2, i3, i4, str, str2);
    }

    public final int[] component1() {
        return this.f139181a;
    }

    public final float[] component2() {
        return this.f139182b;
    }

    public final int component3() {
        return this.f139183c;
    }

    public final int component4() {
        return this.f139184d;
    }

    public final int component5() {
        return this.f139185e;
    }

    public final int component6() {
        return this.f139186f;
    }

    public final String component7() {
        return this.f139187g;
    }

    public final String component8() {
        return this.f139188h;
    }

    public final C61285a copy(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new C61285a(iArr, fArr, i, i2, i3, i4, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61285a)) {
            return false;
        }
        C61285a aVar = (C61285a) obj;
        return C89219l.m154714a(this.f139181a, aVar.f139181a) && C89219l.m154714a(this.f139182b, aVar.f139182b) && this.f139183c == aVar.f139183c && this.f139184d == aVar.f139184d && this.f139185e == aVar.f139185e && this.f139186f == aVar.f139186f && C89219l.m154714a(this.f139187g, aVar.f139187g) && C89219l.m154714a(this.f139188h, aVar.f139188h);
    }

    public final int hashCode() {
        int[] iArr = this.f139181a;
        int i = 0;
        int hashCode = (iArr != null ? Arrays.hashCode(iArr) : 0) * 31;
        float[] fArr = this.f139182b;
        int hashCode2 = (((((((((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f139183c) * 31) + this.f139184d) * 31) + this.f139185e) * 31) + this.f139186f) * 31;
        String str = this.f139187g;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f139188h;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "BeatMvInfo(values=" + Arrays.toString(this.f139181a) + ", times=" + Arrays.toString(this.f139182b) + ", trimIn=" + this.f139183c + ", trimOut=" + this.f139184d + ", dstIn=" + this.f139185e + ", dstOut=" + this.f139186f + ", musicName=" + this.f139187g + ", musicKey=" + this.f139188h + ")";
    }

    public final int getDstIn() {
        return this.f139185e;
    }

    public final int getDstOut() {
        return this.f139186f;
    }

    public final String getMusicKey() {
        return this.f139188h;
    }

    public final String getMusicName() {
        return this.f139187g;
    }

    public final float[] getTimes() {
        return this.f139182b;
    }

    public final int getTrimIn() {
        return this.f139183c;
    }

    public final int getTrimOut() {
        return this.f139184d;
    }

    public final int[] getValues() {
        return this.f139181a;
    }

    public final void setTimes(float[] fArr) {
        this.f139182b = fArr;
    }

    public final void setValues(int[] iArr) {
        this.f139181a = iArr;
    }

    public final void setMusicKey(String str) {
        C89219l.m154721d(str, "");
        this.f139188h = str;
    }

    public C61285a(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f139181a = iArr;
        this.f139182b = fArr;
        this.f139183c = i;
        this.f139184d = i2;
        this.f139185e = i3;
        this.f139186f = i4;
        this.f139187g = str;
        this.f139188h = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C61285a(int[] r10, float[] r11, int r12, int r13, int r14, int r15, java.lang.String r16, java.lang.String r17, int r18, p4600h.p4611f.p4613b.C89214g r19) {
        /*
            r9 = this;
            r5 = r14
            r6 = r15
            r7 = r16
            r2 = r18
            r1 = r2 & 16
            r0 = 0
            if (r1 == 0) goto L_0x000c
            r5 = 0
        L_0x000c:
            r0 = r2 & 32
            if (r0 == 0) goto L_0x0011
            r6 = 0
        L_0x0011:
            r0 = r2 & 64
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0018
            r7 = r8
        L_0x0018:
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0025
        L_0x001c:
            r0 = r9
            r4 = r13
            r3 = r12
            r2 = r11
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            r8 = r17
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mvtheme.C61285a.<init>(int[], float[], int, int, int, int, java.lang.String, java.lang.String, int, h.f.b.g):void");
    }
}
