package com.lynx.p2032b.p2033a.p2036c;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.graphics.C0699a;
import com.bytedance.covode.number.Covode;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28216e;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28220i;
import com.lynx.p2032b.p2033a.p2035b.C28224c;
import com.lynx.p2032b.p2033a.p2039f.AbstractC28233a;
import com.lynx.p2032b.p2033a.p2041h.animationInterpolatorC28243b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.lynx.b.a.c.a */
public final class C28225a extends AbstractC28233a implements AbstractC28216e {

    /* renamed from: a */
    protected boolean f66151a;

    /* renamed from: b */
    protected boolean f66152b;

    /* renamed from: c */
    protected Paint f66153c;

    /* renamed from: d */
    protected int f66154d;

    /* renamed from: e */
    protected int f66155e;

    /* renamed from: f */
    protected float f66156f;

    /* renamed from: g */
    protected long f66157g;

    /* renamed from: h */
    protected boolean f66158h;

    /* renamed from: i */
    protected TimeInterpolator f66159i;

    static {
        Covode.recordClassIndex(34171);
    }

    public C28225a(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    private C28225a m56370a(int i) {
        this.f66154d = i;
        this.f66151a = true;
        if (!this.f66158h) {
            this.f66153c.setColor(i);
        }
        return this;
    }

    /* renamed from: b */
    private C28225a m56371b(int i) {
        this.f66155e = i;
        this.f66152b = true;
        if (this.f66158h) {
            this.f66153c.setColor(i);
        }
        return this;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    public final void setPrimaryColors(int... iArr) {
        if (!this.f66152b && iArr.length > 1) {
            m56371b(iArr[0]);
            this.f66152b = false;
        }
        if (!this.f66151a) {
            if (iArr.length > 1) {
                m56370a(iArr[1]);
            } else if (iArr.length > 0) {
                m56370a(C0699a.m2460a(-1711276033, iArr[0]));
            }
            this.f66151a = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int width = getWidth();
        int height = getHeight();
        float f2 = this.f66156f;
        float min = (((float) Math.min(width, height)) - (f2 * 2.0f)) / 6.0f;
        float f3 = min * 2.0f;
        float f4 = (((float) width) / 2.0f) - (f2 + f3);
        float f5 = ((float) height) / 2.0f;
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        do {
            int i2 = i + 1;
            long j = (currentTimeMillis - this.f66157g) - ((long) (i2 * 120));
            if (j > 0) {
                f = ((float) (j % 750)) / 750.0f;
            } else {
                f = 0.0f;
            }
            float interpolation = this.f66159i.getInterpolation(f);
            canvas.save();
            float f6 = (float) i;
            canvas.translate((f3 * f6) + f4 + (this.f66156f * f6), f5);
            if (((double) interpolation) < 0.5d) {
                float f7 = 1.0f - ((interpolation * 2.0f) * 0.7f);
                canvas.scale(f7, f7);
            } else {
                float f8 = ((interpolation * 2.0f) * 0.7f) - 0.4f;
                canvas.scale(f8, f8);
            }
            canvas.drawCircle(0.0f, 0.0f, min, this.f66153c);
            canvas.restore();
            i = i2;
        } while (i < 3);
        super.dispatchDraw(canvas);
        if (this.f66158h) {
            invalidate();
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: a */
    public final int mo30701a(AbstractC28220i iVar, boolean z) {
        this.f66158h = false;
        this.f66157g = 0;
        this.f66153c.setColor(this.f66154d);
        return 0;
    }

    private C28225a(Context context, byte b) {
        super(context);
        this.f66154d = -1118482;
        this.f66155e = -1615546;
        this.f66159i = new AccelerateDecelerateInterpolator();
        setMinimumHeight(animationInterpolatorC28243b.m56416a(60.0f));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ad5, R.attr.ad6, R.attr.aef});
        Paint paint = new Paint();
        this.f66153c = paint;
        paint.setColor(-1);
        this.f66153c.setStyle(Paint.Style.FILL);
        this.f66153c.setAntiAlias(true);
        this.f66198x = C28224c.f66142a;
        this.f66198x = C28224c.f66147f[obtainStyledAttributes.getInt(1, this.f66198x.f66148g)];
        if (obtainStyledAttributes.hasValue(2)) {
            m56370a(obtainStyledAttributes.getColor(2, 0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            m56371b(obtainStyledAttributes.getColor(0, 0));
        }
        obtainStyledAttributes.recycle();
        this.f66156f = (float) animationInterpolatorC28243b.m56416a(4.0f);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: b */
    public final void mo30709b(AbstractC28220i iVar, int i, int i2) {
        if (!this.f66158h) {
            invalidate();
            this.f66158h = true;
            this.f66157g = System.currentTimeMillis();
            this.f66153c.setColor(this.f66155e);
        }
    }
}
