package androidx.p060l;

import android.animation.TypeEvaluator;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.l.i */
final class C1121i implements TypeEvaluator<Rect> {

    /* renamed from: a */
    private Rect f3822a;

    static {
        Covode.recordClassIndex(1214);
    }

    C1121i() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Rect evaluate(float f, Rect rect, Rect rect2) {
        Rect rect3 = rect;
        Rect rect4 = rect2;
        int i = rect3.left + ((int) (((float) (rect4.left - rect3.left)) * f));
        int i2 = rect3.top + ((int) (((float) (rect4.top - rect3.top)) * f));
        int i3 = rect3.right + ((int) (((float) (rect4.right - rect3.right)) * f));
        int i4 = rect3.bottom + ((int) (((float) (rect4.bottom - rect3.bottom)) * f));
        Rect rect5 = this.f3822a;
        if (rect5 == null) {
            return new Rect(i, i2, i3, i4);
        }
        rect5.set(i, i2, i3, i4);
        return this.f3822a;
    }
}
