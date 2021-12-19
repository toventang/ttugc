package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.b */
public final class C31067b {

    /* renamed from: a */
    public final String[] f74418a;

    /* renamed from: b */
    public final String[] f74419b;

    /* renamed from: c */
    public final int[] f74420c;

    /* renamed from: d */
    public final int[] f74421d;

    /* renamed from: e */
    public final float[] f74422e;

    /* renamed from: f */
    public final String[] f74423f;

    /* renamed from: g */
    public final String[] f74424g;

    /* renamed from: h */
    public final int[] f74425h;

    /* renamed from: i */
    public final int[] f74426i;

    /* renamed from: j */
    public final float[] f74427j;

    /* renamed from: k */
    public final ROTATE_DEGREE[] f74428k;

    static {
        Covode.recordClassIndex(37697);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31067b)) {
            return false;
        }
        C31067b bVar = (C31067b) obj;
        return C89219l.m154714a(this.f74418a, bVar.f74418a) && C89219l.m154714a(this.f74419b, bVar.f74419b) && C89219l.m154714a(this.f74420c, bVar.f74420c) && C89219l.m154714a(this.f74421d, bVar.f74421d) && C89219l.m154714a(this.f74422e, bVar.f74422e) && C89219l.m154714a(this.f74423f, bVar.f74423f) && C89219l.m154714a(this.f74424g, bVar.f74424g) && C89219l.m154714a(this.f74425h, bVar.f74425h) && C89219l.m154714a(this.f74426i, bVar.f74426i) && C89219l.m154714a(this.f74427j, bVar.f74427j) && C89219l.m154714a(this.f74428k, bVar.f74428k);
    }

    public final int hashCode() {
        String[] strArr = this.f74418a;
        int i = 0;
        int hashCode = (strArr != null ? Arrays.hashCode(strArr) : 0) * 31;
        String[] strArr2 = this.f74419b;
        int hashCode2 = (hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31;
        int[] iArr = this.f74420c;
        int hashCode3 = (hashCode2 + (iArr != null ? Arrays.hashCode(iArr) : 0)) * 31;
        int[] iArr2 = this.f74421d;
        int hashCode4 = (hashCode3 + (iArr2 != null ? Arrays.hashCode(iArr2) : 0)) * 31;
        float[] fArr = this.f74422e;
        int hashCode5 = (hashCode4 + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31;
        String[] strArr3 = this.f74423f;
        int hashCode6 = (hashCode5 + (strArr3 != null ? Arrays.hashCode(strArr3) : 0)) * 31;
        String[] strArr4 = this.f74424g;
        int hashCode7 = (hashCode6 + (strArr4 != null ? Arrays.hashCode(strArr4) : 0)) * 31;
        int[] iArr3 = this.f74425h;
        int hashCode8 = (hashCode7 + (iArr3 != null ? Arrays.hashCode(iArr3) : 0)) * 31;
        int[] iArr4 = this.f74426i;
        int hashCode9 = (hashCode8 + (iArr4 != null ? Arrays.hashCode(iArr4) : 0)) * 31;
        float[] fArr2 = this.f74427j;
        int hashCode10 = (hashCode9 + (fArr2 != null ? Arrays.hashCode(fArr2) : 0)) * 31;
        ROTATE_DEGREE[] rotate_degreeArr = this.f74428k;
        if (rotate_degreeArr != null) {
            i = Arrays.hashCode(rotate_degreeArr);
        }
        return hashCode10 + i;
    }

    public final String toString() {
        return "ChangeResParamData(videoFilePaths=" + Arrays.toString(this.f74418a) + ", vFileInfos=" + Arrays.toString(this.f74419b) + ", vTrimIn=" + Arrays.toString(this.f74420c) + ", vTrimOut=" + Arrays.toString(this.f74421d) + ", videoSpeed=" + Arrays.toString(this.f74422e) + ", audioFilePaths=" + Arrays.toString(this.f74423f) + ", aFileInfos=" + Arrays.toString(this.f74424g) + ", aTrimIn=" + Arrays.toString(this.f74425h) + ", aTrimOut=" + Arrays.toString(this.f74426i) + ", audioSpeed=" + Arrays.toString(this.f74427j) + ", rotate=" + Arrays.toString(this.f74428k) + ")";
    }

    public C31067b(String[] strArr, String[] strArr2, int[] iArr, int[] iArr2, float[] fArr, String[] strArr3, String[] strArr4, int[] iArr3, int[] iArr4, float[] fArr2, ROTATE_DEGREE[] rotate_degreeArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(iArr2, "");
        this.f74418a = strArr;
        this.f74419b = strArr2;
        this.f74420c = iArr;
        this.f74421d = iArr2;
        this.f74422e = fArr;
        this.f74423f = strArr3;
        this.f74424g = strArr4;
        this.f74425h = iArr3;
        this.f74426i = iArr4;
        this.f74427j = fArr2;
        this.f74428k = rotate_degreeArr;
    }
}
