package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3846b;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.AbstractC72320g;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72317d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C72322i;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p3845a.C72296a;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.C72353d;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b.a */
public final class C72301a {
    static {
        Covode.recordClassIndex(84968);
    }

    /* renamed from: a */
    public static final Matrix m127516a(Rect rect, int i, int i2, Rect rect2, AbstractC72320g gVar) {
        int i3;
        float f;
        float f2;
        C89219l.m154721d(rect, "");
        C89219l.m154721d(gVar, "");
        int i4 = 0;
        if (rect2 != null) {
            i3 = rect2.width();
            i4 = rect2.height();
        } else {
            i3 = 0;
        }
        if (C72322i.m127538a(i, i2, i3, i4)) {
            f = (float) i2;
            f2 = (float) i4;
        } else {
            f = (float) i;
            f2 = (float) i3;
        }
        float f3 = f / f2;
        RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
        Matrix matrix = new Matrix();
        matrix.setScale(f3, f3, (float) (i3 / 2), (float) (i4 / 2));
        matrix.postTranslate((float) ((i - i3) / 2), (float) ((i2 - i4) / 2));
        matrix.mapRect(rectF, rectF);
        return gVar.mo114582a(rectF, rect);
    }

    /* renamed from: a */
    public static final AnimatorSet m127515a(Matrix matrix, Matrix matrix2, Rect rect, C72296a aVar, AbstractC89172b<? super Matrix, C89391z> bVar) {
        RectF rectF;
        C89219l.m154721d(matrix, "");
        C89219l.m154721d(matrix2, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(bVar, "");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix2.getValues(fArr2);
        C72353d dVar = new C72353d(rect, fArr, bVar);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dVar, PropertyValuesHolder.ofObject(C72303c.f162100a, new C72317d(new float[9]), fArr, fArr2));
        ofPropertyValuesHolder.setDuration(aVar.f162079g);
        ofPropertyValuesHolder.setInterpolator(aVar.f162074b);
        C89219l.m154716b(ofPropertyValuesHolder, "");
        AbstractC72310g gVar = aVar.f162083k;
        if (rect != null) {
            rectF = new RectF(rect);
        } else {
            rectF = null;
        }
        RectF rectF2 = new RectF(rectF);
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        matrix.mapRect(rectF3, rectF2);
        matrix2.mapRect(rectF4, rectF2);
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(dVar, C72312i.m127528a(C72303c.f162101b, gVar.mo114566a(rectF3.centerX(), rectF3.centerY(), rectF4.centerX(), rectF4.centerY())));
        ofPropertyValuesHolder2.setDuration(aVar.f162078f);
        ofPropertyValuesHolder2.setInterpolator(aVar.f162073a);
        C89219l.m154716b(ofPropertyValuesHolder2, "");
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2);
        return animatorSet;
    }
}
