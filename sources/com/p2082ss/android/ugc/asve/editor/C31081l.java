package com.p2082ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.filterparam.VECanvasFilterParam;
import com.p2082ss.android.vesdk.filterparam.VETransitionFilterParam;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.editor.l */
public final class C31081l extends AbstractC31077h {

    /* renamed from: a */
    private final String[] f74451a;

    /* renamed from: b */
    private final int[] f74452b;

    /* renamed from: c */
    private final int[] f74453c;

    /* renamed from: d */
    private final VETransitionFilterParam[] f74454d = null;

    /* renamed from: e */
    private final String[] f74455e = null;

    /* renamed from: f */
    private final int[] f74456f = null;

    /* renamed from: g */
    private final int[] f74457g = null;

    /* renamed from: h */
    private final float[] f74458h;

    /* renamed from: i */
    private final VECanvasFilterParam[] f74459i;

    /* renamed from: j */
    private final C85581w.EnumC85613l f74460j;

    /* renamed from: k */
    private final C85581w.EnumC85612k f74461k;

    /* renamed from: l */
    private final C85581w.EnumC85614m f74462l;

    static {
        Covode.recordClassIndex(37711);
    }

    @Override // com.p2082ss.android.ugc.asve.editor.AbstractC31077h
    /* renamed from: a */
    public final int mo56408a(C85581w wVar, boolean z) {
        C89219l.m154721d(wVar, "");
        return wVar.mo131624a(this.f74451a, this.f74452b, this.f74453c, this.f74454d, this.f74455e, this.f74456f, this.f74457g, this.f74458h, this.f74459i, this.f74460j);
    }

    public C31081l(String[] strArr, int[] iArr, int[] iArr2, float[] fArr, VECanvasFilterParam[] vECanvasFilterParamArr, C85581w.EnumC85613l lVar, C85581w.EnumC85612k kVar, C85581w.EnumC85614m mVar) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        C89219l.m154721d(iArr2, "");
        C89219l.m154721d(fArr, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(mVar, "");
        this.f74451a = strArr;
        this.f74452b = iArr;
        this.f74453c = iArr2;
        this.f74458h = fArr;
        this.f74459i = vECanvasFilterParamArr;
        this.f74460j = lVar;
        this.f74461k = kVar;
        this.f74462l = mVar;
    }
}
