package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.p032a.C0637f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.CheckView */
public class CheckView extends View {

    /* renamed from: a */
    private boolean f199817a;

    /* renamed from: b */
    private boolean f199818b;

    /* renamed from: c */
    private int f199819c;

    /* renamed from: d */
    private Paint f199820d;

    /* renamed from: e */
    private Paint f199821e;

    /* renamed from: f */
    private TextPaint f199822f;

    /* renamed from: g */
    private Paint f199823g;

    /* renamed from: h */
    private Drawable f199824h;

    /* renamed from: i */
    private float f199825i;

    /* renamed from: j */
    private Rect f199826j;

    /* renamed from: k */
    private boolean f199827k = true;

    static {
        Covode.recordClassIndex(103998);
    }

    private Rect getCheckRect() {
        if (this.f199826j == null) {
            float f = this.f199825i;
            int i = (int) (((f * 48.0f) / 2.0f) - ((f * 16.0f) / 2.0f));
            float f2 = this.f199825i;
            float f3 = (float) i;
            this.f199826j = new Rect(i, i, (int) ((f2 * 48.0f) - f3), (int) ((f2 * 48.0f) - f3));
        }
        return this.f199826j;
    }

    /* renamed from: a */
    private void m153046a() {
        if (this.f199821e == null) {
            Paint paint = new Paint();
            this.f199821e = paint;
            paint.setAntiAlias(true);
            this.f199821e.setStyle(Paint.Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.xo});
            int color = obtainStyledAttributes.getColor(0, C0637f.m2349b(getResources(), R.color.a31, getContext().getTheme()));
            obtainStyledAttributes.recycle();
            this.f199821e.setColor(color);
        }
    }

    public void setCountable(boolean z) {
        this.f199817a = z;
    }

    public void setEnabled(boolean z) {
        if (this.f199827k != z) {
            this.f199827k = z;
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        if (!this.f199817a) {
            this.f199818b = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i) {
        if (!this.f199817a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        } else if (i == Integer.MIN_VALUE || i > 0) {
            this.f199819c = i;
            invalidate();
        } else {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        MethodCollector.m26663i(13548);
        super.onDraw(canvas);
        if (this.f199823g == null) {
            Paint paint = new Paint();
            this.f199823g = paint;
            paint.setAntiAlias(true);
            Paint paint2 = this.f199823g;
            float f2 = this.f199825i;
            paint2.setShader(new RadialGradient((f2 * 48.0f) / 2.0f, (f2 * 48.0f) / 2.0f, f2 * 19.0f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#0D000000"), Color.parseColor("#0D000000"), Color.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f3 = this.f199825i;
        canvas.drawCircle((f3 * 48.0f) / 2.0f, (f3 * 48.0f) / 2.0f, f3 * 19.0f, this.f199823g);
        float f4 = this.f199825i;
        canvas.drawCircle((f4 * 48.0f) / 2.0f, (f4 * 48.0f) / 2.0f, f4 * 11.5f, this.f199820d);
        if (this.f199817a) {
            if (this.f199819c != Integer.MIN_VALUE) {
                m153046a();
                float f5 = this.f199825i;
                canvas.drawCircle((f5 * 48.0f) / 2.0f, (48.0f * f5) / 2.0f, f5 * 11.0f, this.f199821e);
                if (this.f199822f == null) {
                    TextPaint textPaint = new TextPaint();
                    this.f199822f = textPaint;
                    textPaint.setAntiAlias(true);
                    this.f199822f.setColor(-1);
                    this.f199822f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
                    this.f199822f.setTextSize(this.f199825i * 12.0f);
                }
                String valueOf = String.valueOf(this.f199819c);
                canvas.drawText(valueOf, (float) (((int) (((float) canvas.getWidth()) - this.f199822f.measureText(valueOf))) / 2), (float) (((int) ((((float) canvas.getHeight()) - this.f199822f.descent()) - this.f199822f.ascent())) / 2), this.f199822f);
            }
        } else if (this.f199818b) {
            m153046a();
            float f6 = this.f199825i;
            canvas.drawCircle((f6 * 48.0f) / 2.0f, (48.0f * f6) / 2.0f, f6 * 11.0f, this.f199821e);
            this.f199824h.setBounds(getCheckRect());
            this.f199824h.draw(canvas);
        }
        if (this.f199827k) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
        MethodCollector.m26664o(13548);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(13546);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.f199825i * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        MethodCollector.m26664o(13546);
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(13545);
        this.f199825i = context.getResources().getDisplayMetrics().density;
        Paint paint = new Paint();
        this.f199820d = paint;
        paint.setAntiAlias(true);
        this.f199820d.setStyle(Paint.Style.STROKE);
        this.f199820d.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        this.f199820d.setStrokeWidth(this.f199825i * 3.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.xp});
        int color = obtainStyledAttributes.getColor(0, C0637f.m2349b(getResources(), R.color.a32, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.f199820d.setColor(color);
        this.f199824h = C0637f.m2348a(context.getResources(), 2131232204, context.getTheme());
        MethodCollector.m26664o(13545);
    }
}
