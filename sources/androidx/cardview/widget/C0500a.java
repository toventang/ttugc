package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0508g;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.cardview.widget.a */
final class C0500a extends C0503c {
    static {
        Covode.recordClassIndex(567);
    }

    C0500a() {
    }

    @Override // androidx.cardview.widget.C0503c, androidx.cardview.widget.AbstractC0506e
    /* renamed from: a */
    public final void mo2222a() {
        C0508g.f1916a = new C0508g.AbstractC0509a() {
            /* class androidx.cardview.widget.C0500a.C05011 */

            static {
                Covode.recordClassIndex(568);
            }

            @Override // androidx.cardview.widget.C0508g.AbstractC0509a
            /* renamed from: a */
            public final void mo2223a(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        };
    }
}
