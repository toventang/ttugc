package com.p2082ss.android.ugc.aweme.p4205v.p4206a;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.v.a.e */
public final class C80642e extends Drawable {

    /* renamed from: a */
    public int f180306a;

    /* renamed from: b */
    public C80641d f180307b;

    /* renamed from: c */
    private final AbstractC89244h f180308c;

    /* renamed from: d */
    private final AbstractC89244h f180309d = C89250i.m154773a((AbstractC89171a) new C80644b(this));

    static {
        Covode.recordClassIndex(93916);
    }

    /* renamed from: a */
    private Paint m139832a() {
        return (Paint) this.f180308c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.v.a.e$a */
    static final class C80643a extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ int f180310a;

        static {
            Covode.recordClassIndex(93917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80643a(int i) {
            super(0);
            this.f180310a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.f180310a);
            return paint;
        }
    }

    public final int getOpacity() {
        return m139832a().getAlpha();
    }

    /* renamed from: com.ss.android.ugc.aweme.v.a.e$b */
    static final class C80644b extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ C80642e f180311a;

        static {
            Covode.recordClassIndex(93918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C80644b(C80642e eVar) {
            super(0);
            this.f180311a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            C80641d dVar = this.f180311a.f180307b;
            if (dVar != null) {
                paint.setColor(dVar.f180305e);
                paint.setMaskFilter(new BlurMaskFilter(dVar.f180301a, dVar.f180302b));
            }
            return paint;
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m139832a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        if (m139832a().getAlpha() != i) {
            m139832a().setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            float f = (float) width;
            float f2 = (float) height;
            float min = Math.min(f, f2) / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            C80641d dVar = this.f180307b;
            if (dVar != null) {
                float abs = Math.abs(dVar.f180304d) + dVar.f180301a;
                rectF.top += abs;
                rectF.bottom -= abs;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(dVar.f180303c, dVar.f180304d);
                canvas.drawRoundRect(rectF, min, min, (Paint) this.f180309d.getValue());
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, min, min, m139832a());
        }
    }

    public C80642e(int i, C80641d dVar) {
        this.f180306a = i;
        this.f180307b = dVar;
        this.f180308c = C89250i.m154773a((AbstractC89171a) new C80643a(i));
    }
}
