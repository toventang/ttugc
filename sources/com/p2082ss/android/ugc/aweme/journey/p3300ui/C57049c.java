package com.p2082ss.android.ugc.aweme.journey.p3300ui;

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

/* renamed from: com.ss.android.ugc.aweme.journey.ui.c */
public final class C57049c extends Drawable {

    /* renamed from: a */
    public int f129901a;

    /* renamed from: b */
    public int f129902b = -1;

    /* renamed from: c */
    public C57047a f129903c;

    /* renamed from: d */
    private final AbstractC89244h f129904d;

    /* renamed from: e */
    private final AbstractC89244h f129905e;

    /* renamed from: f */
    private final AbstractC89244h f129906f;

    static {
        Covode.recordClassIndex(66939);
    }

    /* renamed from: a */
    private Paint m103399a() {
        return (Paint) this.f129904d.getValue();
    }

    /* renamed from: b */
    private Paint m103400b() {
        return (Paint) this.f129906f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.ui.c$a */
    static final class C57050a extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ int f129907a;

        static {
            Covode.recordClassIndex(66940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57050a(int i) {
            super(0);
            this.f129907a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.f129907a);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.ui.c$c */
    static final class C57052c extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        public static final C57052c f129909a = new C57052c();

        static {
            Covode.recordClassIndex(66942);
        }

        C57052c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            return paint;
        }
    }

    public final int getOpacity() {
        return m103399a().getAlpha();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.ui.c$b */
    static final class C57051b extends AbstractC89220m implements AbstractC89171a<Paint> {

        /* renamed from: a */
        final /* synthetic */ C57049c f129908a;

        static {
            Covode.recordClassIndex(66941);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57051b(C57049c cVar) {
            super(0);
            this.f129908a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Paint invoke() {
            Paint paint = new Paint(1);
            C57047a aVar = this.f129908a.f129903c;
            if (aVar != null) {
                paint.setColor(aVar.f129898e);
                paint.setMaskFilter(new BlurMaskFilter(aVar.f129894a, aVar.f129895b));
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
        m103399a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo94209a(int i) {
        if (this.f129902b != i) {
            this.f129902b = i;
            m103400b().setColor(i);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (m103399a().getAlpha() != i) {
            m103399a().setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            C57047a aVar = this.f129903c;
            if (aVar == null) {
                C89219l.m154715b();
            }
            float f = aVar.f129899f;
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            C57047a aVar2 = this.f129903c;
            if (aVar2 != null) {
                float f2 = aVar2.f129894a;
                float f3 = aVar2.f129894a;
                rectF.top += aVar2.f129894a;
                rectF.bottom -= f3;
                float f4 = f2 / 2.0f;
                rectF.left += f4;
                rectF.right -= f4;
                canvas.save();
                canvas.translate(aVar2.f129896c, aVar2.f129897d);
                canvas.drawRoundRect(rectF, f, f, (Paint) this.f129905e.getValue());
                canvas.restore();
            }
            if (this.f129901a != 0) {
                canvas.drawRoundRect(rectF, f, f, m103399a());
            }
            if (this.f129902b != -1) {
                canvas.drawRoundRect(rectF, f, f, m103400b());
            }
        }
    }

    public C57049c(int i, C57047a aVar) {
        this.f129901a = i;
        this.f129903c = aVar;
        this.f129904d = C89250i.m154773a((AbstractC89171a) new C57050a(i));
        this.f129905e = C89250i.m154773a((AbstractC89171a) new C57051b(this));
        this.f129906f = C89250i.m154773a((AbstractC89171a) C57052c.f129909a);
    }
}
