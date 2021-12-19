package com.bytedance.android.livesdk.utils.crop;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class PreviewBoxView extends View {

    /* renamed from: a */
    public boolean f26927a;

    /* renamed from: b */
    ValueAnimator f26928b;

    /* renamed from: c */
    int f26929c;

    /* renamed from: d */
    int f26930d;

    /* renamed from: e */
    float f26931e = 0.5625f;

    /* renamed from: f */
    public float f26932f;

    /* renamed from: g */
    public AbstractC11253a f26933g;

    /* renamed from: h */
    private Paint f26934h;

    /* renamed from: i */
    private RectF f26935i;

    /* renamed from: j */
    private Bitmap f26936j;

    /* renamed from: k */
    private Context f26937k;

    /* renamed from: l */
    private int f26938l = -1;

    /* renamed from: com.bytedance.android.livesdk.utils.crop.PreviewBoxView$a */
    public interface AbstractC11253a {
        static {
            Covode.recordClassIndex(12884);
        }
    }

    static {
        Covode.recordClassIndex(12881);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public Rect getVisibleRect() {
        Rect rect = new Rect();
        rect.set((int) this.f26935i.left, (int) this.f26935i.top, (int) this.f26935i.right, (int) this.f26935i.bottom);
        return rect;
    }

    /* renamed from: a */
    public final void mo18015a() {
        if (Math.abs(this.f26932f - 0.85f) >= Float.MIN_NORMAL && !this.f26927a) {
            this.f26927a = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.5f, 0.85f);
            this.f26928b = ofFloat;
            ofFloat.setEvaluator(new FloatEvaluator());
            this.f26928b.setDuration(300L);
            this.f26928b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                /* class com.bytedance.android.livesdk.utils.crop.PreviewBoxView.C112511 */

                static {
                    Covode.recordClassIndex(12882);
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PreviewBoxView.this.f26932f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView previewBoxView = PreviewBoxView.this;
                    previewBoxView.setAlpha(previewBoxView.f26932f);
                    if (PreviewBoxView.this.f26933g != null) {
                        valueAnimator.getAnimatedFraction();
                    }
                }
            });
            this.f26928b.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.utils.crop.PreviewBoxView.C112522 */

                static {
                    Covode.recordClassIndex(12883);
                }

                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f26932f = 0.85f;
                    PreviewBoxView.this.f26927a = false;
                }
            });
            this.f26928b.setStartDelay(300);
            this.f26928b.start();
        }
    }

    public void setTopOffset(int i) {
        this.f26938l = i;
    }

    public void onDraw(Canvas canvas) {
        int parseColor;
        boolean z;
        MethodCollector.m26663i(12015);
        if (this.f26935i == null) {
            MethodCollector.m26664o(12015);
            return;
        }
        if (this.f26936j == null) {
            int width = getWidth();
            int height = getHeight();
            RectF rectF = this.f26935i;
            Context context = this.f26937k;
            if (context != null) {
                parseColor = context.getResources().getColor(R.color.ye);
            } else {
                parseColor = Color.parseColor("#d9161823");
            }
            if (this.f26930d == 1) {
                z = true;
            } else {
                z = false;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(createBitmap);
            canvas2.drawColor(parseColor);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            if (z) {
                canvas2.drawOval(rectF, paint);
            } else {
                canvas2.drawRect(rectF, paint);
            }
            this.f26936j = createBitmap;
        }
        canvas.drawBitmap(this.f26936j, 0.0f, 0.0f, this.f26934h);
        MethodCollector.m26664o(12015);
    }

    public PreviewBoxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f;
        MethodCollector.m26663i(11870);
        this.f26937k = context;
        Paint paint = new Paint();
        this.f26934h = paint;
        paint.setAntiAlias(true);
        if (context != null) {
            f = (context.getResources().getDisplayMetrics().density * 16.0f) + 0.5f;
        } else {
            f = 0.0f;
        }
        this.f26929c = (int) f;
        this.f26932f = 0.5f;
        setAlpha(0.5f);
        MethodCollector.m26664o(11870);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth() - (this.f26929c * 2);
        int i5 = (int) (((float) width) * this.f26931e);
        int i6 = this.f26938l;
        if (i6 < 0) {
            i6 = Math.max(0, (getHeight() - i5) / 2);
        }
        int i7 = this.f26929c;
        this.f26935i = new RectF((float) i7, (float) i6, (float) (i7 + width), (float) (i6 + i5));
    }
}
