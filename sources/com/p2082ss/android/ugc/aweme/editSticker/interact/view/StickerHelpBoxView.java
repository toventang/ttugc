package com.p2082ss.android.ugc.aweme.editSticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84908o;
import com.p2082ss.android.ugc.tools.utils.C84912r;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView */
public class StickerHelpBoxView extends View {

    /* renamed from: a */
    public volatile boolean f106909a = false;

    /* renamed from: b */
    private Context f106910b;

    /* renamed from: c */
    private RectF f106911c = new RectF();

    /* renamed from: d */
    private RectF f106912d = new RectF();

    /* renamed from: e */
    private Paint f106913e = new Paint();

    /* renamed from: f */
    private RectF f106914f = new RectF();

    /* renamed from: g */
    private Paint f106915g = new Paint();

    /* renamed from: h */
    private int[] f106916h = new int[2];

    /* renamed from: i */
    private int f106917i = 10;

    /* renamed from: j */
    private int f106918j = 10;

    /* renamed from: k */
    private int f106919k = 10;

    /* renamed from: l */
    private int f106920l = 10;

    /* renamed from: m */
    private float f106921m;

    /* renamed from: n */
    private float f106922n;

    /* renamed from: o */
    private boolean f106923o = false;

    /* renamed from: p */
    private Paint f106924p;

    /* renamed from: q */
    private PointF[] f106925q = {new PointF(), new PointF(), new PointF(), new PointF()};

    /* renamed from: r */
    private AbstractC45912a f106926r;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.view.StickerHelpBoxView$a */
    public interface AbstractC45912a {
        static {
            Covode.recordClassIndex(54438);
        }

        /* renamed from: a */
        void mo77310a(boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(54437);
    }

    public PointF[] getFourAnglePoint() {
        return this.f106925q;
    }

    public RectF getHelpBoxRect() {
        return this.f106912d;
    }

    public float getRotateAngle() {
        return this.f106921m;
    }

    public RectF getViewBoxRect() {
        return this.f106914f;
    }

    /* renamed from: b */
    public final void mo77296b() {
        if (!this.f106909a) {
            this.f106909a = true;
            invalidate();
            AbstractC45912a aVar = this.f106926r;
            if (aVar != null) {
                aVar.mo77310a(true, false);
            }
        }
    }

    public RectF getRectOnWindow() {
        return new RectF(this.f106912d.left + ((float) this.f106916h[0]), this.f106912d.top + ((float) this.f106916h[1]), this.f106912d.right + ((float) this.f106916h[0]), this.f106912d.bottom + ((float) this.f106916h[1]));
    }

    /* renamed from: a */
    public final void mo77292a() {
        RectF rectF = new RectF(this.f106911c);
        C84908o.m145918a(rectF, this.f106922n);
        if (this.f106923o) {
            this.f106914f.set(rectF.left - ((float) this.f106918j), rectF.top - ((float) this.f106919k), rectF.right + ((float) this.f106918j), rectF.bottom + ((float) this.f106919k));
        } else {
            this.f106914f.set(rectF);
        }
        this.f106912d.set(this.f106914f.left - ((float) this.f106917i), this.f106914f.top - ((float) this.f106917i), this.f106914f.right + ((float) this.f106917i), this.f106914f.bottom + ((float) this.f106917i));
        this.f106925q[0].x = this.f106914f.left;
        this.f106925q[0].y = this.f106914f.top;
        this.f106925q[1].x = this.f106914f.right;
        this.f106925q[1].y = this.f106914f.top;
        this.f106925q[2].x = this.f106914f.left;
        this.f106925q[2].y = this.f106914f.bottom;
        this.f106925q[3].x = this.f106914f.right;
        this.f106925q[3].y = this.f106914f.bottom;
        for (PointF pointF : this.f106925q) {
            C84908o.m145916a(pointF, this.f106912d.centerX(), this.f106912d.centerY(), (float) Math.toRadians((double) this.f106921m));
        }
    }

    public void setStickerShowHelpboxCallback(AbstractC45912a aVar) {
        this.f106926r = aVar;
    }

    public void setmWindowPadding(int[] iArr) {
        this.f106916h = iArr;
    }

    public void setHelpBoxColor(int i) {
        this.f106913e.setColor(i);
    }

    public void setHelpBoxPadding(int i) {
        this.f106917i = i;
        invalidate();
    }

    public void setShowBg(boolean z) {
        this.f106923o = z;
        invalidate();
    }

    /* renamed from: a */
    public final void mo77294a(Rect rect) {
        this.f106911c.set(rect);
    }

    /* renamed from: a */
    public final void mo77295a(boolean z) {
        if (this.f106909a) {
            this.f106909a = false;
            invalidate();
            AbstractC45912a aVar = this.f106926r;
            if (aVar != null) {
                aVar.mo77310a(false, z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(10358);
        super.onDraw(canvas);
        mo77292a();
        canvas.save();
        canvas.rotate(this.f106921m, this.f106911c.centerX(), this.f106911c.centerY());
        if (this.f106923o) {
            RectF rectF = this.f106914f;
            int i = this.f106920l;
            canvas.drawRoundRect(rectF, (float) i, (float) i, this.f106915g);
        }
        if (this.f106909a) {
            canvas.drawRect(this.f106912d, this.f106913e);
        }
        canvas.restore();
        MethodCollector.m26664o(10358);
    }

    /* renamed from: a */
    public final void mo77293a(float f, float f2) {
        this.f106922n = f;
        this.f106921m = f2;
        invalidate();
    }

    /* renamed from: b */
    public final void mo77297b(float f, float f2) {
        this.f106911c.offset(f, f2);
        invalidate();
    }

    /* renamed from: c */
    public final boolean mo77298c(float f, float f2) {
        return C84908o.m145920b(this.f106912d, f, f2, this.f106921m);
    }

    public StickerHelpBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10204);
        this.f106910b = context;
        this.f106913e.setColor(-1);
        this.f106913e.setStyle(Paint.Style.STROKE);
        this.f106913e.setAntiAlias(true);
        this.f106913e.setStrokeWidth(2.0f);
        Paint paint = new Paint(this.f106913e);
        this.f106915g = paint;
        paint.setColor(-1);
        this.f106915g.setStyle(Paint.Style.FILL);
        this.f106917i = (int) C84912r.m145930a(this.f106910b, 10.0f);
        this.f106918j = (int) C84912r.m145930a(this.f106910b, 16.0f);
        this.f106919k = (int) C84912r.m145930a(this.f106910b, 8.0f);
        this.f106920l = (int) C84912r.m145930a(this.f106910b, 5.0f);
        Paint paint2 = new Paint();
        this.f106924p = paint2;
        paint2.setColor(-65536);
        MethodCollector.m26664o(10204);
    }
}
