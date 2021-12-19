package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.j */
public final class C31079j extends AbstractC31077h {

    /* renamed from: a */
    public int[] f74439a;

    /* renamed from: b */
    public int[] f74440b;

    /* renamed from: c */
    public String[] f74441c;

    /* renamed from: d */
    public String[] f74442d;

    /* renamed from: e */
    public int[] f74443e;

    /* renamed from: f */
    public int[] f74444f;

    /* renamed from: g */
    public float[] f74445g;

    /* renamed from: h */
    public ROTATE_DEGREE[] f74446h;

    /* renamed from: i */
    public C85581w.EnumC85613l f74447i = C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL;

    /* renamed from: j */
    public String[] f74448j;

    static {
        Covode.recordClassIndex(37709);
    }

    /* renamed from: a */
    public final void mo56409a(C85581w.EnumC85613l lVar) {
        C89219l.m154721d(lVar, "");
        this.f74447i = lVar;
    }

    public C31079j(String[] strArr) {
        C89219l.m154721d(strArr, "");
        this.f74448j = strArr;
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        int[] iArr;
        C89219l.m154721d(wVar, "");
        int[] iArr2 = this.f74439a;
        if (iArr2 == null || (iArr = this.f74440b) == null) {
            return wVar.mo131628a(this.f74448j, this.f74441c, this.f74442d, this.f74447i);
        }
        String[] strArr = this.f74448j;
        String[] strArr2 = this.f74441c;
        String[] strArr3 = this.f74442d;
        int[] iArr3 = this.f74443e;
        int[] iArr4 = this.f74444f;
        float[] fArr = this.f74445g;
        return wVar.mo131625a(strArr, iArr2, iArr, strArr2, strArr3, iArr3, iArr4, fArr, fArr, this.f74446h, this.f74447i);
    }
}
