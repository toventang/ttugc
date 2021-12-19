package com.p2082ss.android.ugc.aweme.story.edit.model;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.model.b */
public final class C77155b {

    /* renamed from: a */
    public final String[] f173080a;

    /* renamed from: b */
    public final String[] f173081b;

    /* renamed from: c */
    public final float[] f173082c;

    /* renamed from: d */
    public final int[] f173083d;

    /* renamed from: e */
    public final int[] f173084e;

    /* renamed from: f */
    public final int[] f173085f;

    static {
        Covode.recordClassIndex(90163);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77155b)) {
            return false;
        }
        C77155b bVar = (C77155b) obj;
        return C89219l.m154714a(this.f173080a, bVar.f173080a) && C89219l.m154714a(this.f173081b, bVar.f173081b) && C89219l.m154714a(this.f173082c, bVar.f173082c) && C89219l.m154714a(this.f173083d, bVar.f173083d) && C89219l.m154714a(this.f173084e, bVar.f173084e) && C89219l.m154714a(this.f173085f, bVar.f173085f);
    }

    public final int hashCode() {
        String[] strArr = this.f173080a;
        int i = 0;
        int hashCode = (strArr != null ? Arrays.hashCode(strArr) : 0) * 31;
        String[] strArr2 = this.f173081b;
        int hashCode2 = (hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        float[] fArr = this.f173082c;
        int hashCode3 = (hashCode2 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        int[] iArr = this.f173083d;
        int hashCode4 = (hashCode3 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f173084e;
        int hashCode5 = (hashCode4 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31;
        int[] iArr3 = this.f173085f;
        if (iArr3 != null) {
            i = Arrays.hashCode(iArr3);
        }
        return hashCode5 + i;
    }

    public final String toString() {
        return "MediaPreviewArray(videoArray=" + Arrays.toString(this.f173080a) + ", audioArray=" + Arrays.toString(this.f173081b) + ", speedArray=" + Arrays.toString(this.f173082c) + ", rotationArray=" + Arrays.toString(this.f173083d) + ", vTrimInArray=" + Arrays.toString(this.f173084e) + ", vTrimOutArray=" + Arrays.toString(this.f173085f) + ")";
    }

    public C77155b(String[] strArr, String[] strArr2, float[] fArr, int[] iArr, int[] iArr2, int[] iArr3) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(fArr, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(iArr2, "");
        C89219l.m154721d(iArr3, "");
        this.f173080a = strArr;
        this.f173081b = strArr2;
        this.f173082c = fArr;
        this.f173083d = iArr;
        this.f173084e = iArr2;
        this.f173085f = iArr3;
    }
}
