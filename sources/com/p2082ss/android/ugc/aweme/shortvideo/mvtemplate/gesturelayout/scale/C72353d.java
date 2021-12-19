package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.d */
public final class C72353d {

    /* renamed from: a */
    public final float[] f162194a;

    /* renamed from: b */
    public float f162195b;

    /* renamed from: c */
    public float f162196c;

    /* renamed from: d */
    private final Matrix f162197d = new Matrix();

    /* renamed from: e */
    private final RectF f162198e;

    /* renamed from: f */
    private final RectF f162199f;

    /* renamed from: g */
    private final AbstractC89172b<Matrix, C89391z> f162200g;

    static {
        Covode.recordClassIndex(85022);
    }

    /* renamed from: a */
    public final void mo114636a() {
        Matrix matrix = this.f162197d;
        matrix.setValues(this.f162194a);
        matrix.mapRect(this.f162199f, this.f162198e);
        matrix.postTranslate(this.f162195b - this.f162199f.centerX(), this.f162196c - this.f162199f.centerY());
        this.f162200g.invoke(matrix);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super android.graphics.Matrix, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C72353d(Rect rect, float[] fArr, AbstractC89172b<? super Matrix, C89391z> bVar) {
        C89219l.m154721d(fArr, "");
        C89219l.m154721d(bVar, "");
        this.f162200g = bVar;
        this.f162198e = new RectF(rect);
        this.f162199f = new RectF();
        this.f162194a = (float[]) fArr.clone();
        mo114636a();
    }
}
